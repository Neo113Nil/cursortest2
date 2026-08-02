package xsna;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public abstract class rd6<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @NonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    @Nullable
    private volatile String zzA;

    @Nullable
    private volatile t94 zzB;

    @Nullable
    private ConnectionResult zzC;
    private boolean zzD;

    @Nullable
    private volatile com.google.android.gms.common.internal.zzj zzE;

    @Nullable
    private UserHandle zzF;
    kp01 zza;
    final Handler zzb;

    @NonNull
    protected c zzc;

    @NonNull
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;

    @Nullable
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final v2u zzn;
    private final com.google.android.gms.common.a zzo;
    private final Object zzp;
    private final Object zzq;

    @Nullable
    private cnv zzr;

    @Nullable
    private IInterface zzs;
    private final ArrayList zzt;

    @Nullable
    private a801 zzu;
    private int zzv;

    @Nullable
    private final a zzw;

    @Nullable
    private final b zzx;
    private final int zzy;

    @Nullable
    private final String zzz;
    private static final Feature[] zze = new Feature[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public interface a {
        void f(@Nullable Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public interface b {
        void g(@NonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public interface c {
        void a(@NonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    /* loaded from: classes12.dex */
    public class d implements c {
        public d() {
        }

        @Override // xsna.rd6.c
        public final void a(@NonNull ConnectionResult connectionResult) {
            boolean j = connectionResult.j();
            rd6 rd6Var = rd6.this;
            if (j) {
                rd6Var.getRemoteService(null, rd6Var.getScopes());
            } else if (rd6Var.zzl() != null) {
                rd6Var.zzl().g(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    /* loaded from: classes12.dex */
    public interface e {
    }

    public rd6(@NonNull Context context, @NonNull Handler handler, @NonNull v2u v2uVar, @NonNull com.google.android.gms.common.a aVar, int i, @Nullable a aVar2, @Nullable b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        exc0.j(context, "Context must not be null");
        this.zzl = context;
        exc0.j(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        exc0.j(v2uVar, "Supervisor must not be null");
        this.zzn = v2uVar;
        exc0.j(aVar, "API availability must not be null");
        this.zzo = aVar;
        this.zzy = i;
        this.zzw = aVar2;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzp(int i, @Nullable IInterface iInterface) {
        ConnectionResult c2;
        kp01 kp01Var;
        exc0.b((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    a801 a801Var = this.zzu;
                    if (a801Var != null) {
                        if (this.zzF == null || Build.VERSION.SDK_INT < 33) {
                            v2u v2uVar = this.zzn;
                            String str = this.zza.a;
                            exc0.i(str);
                            String str2 = this.zza.b;
                            zza();
                            v2uVar.d(new fm01(str, str2, this.zza.c, null), a801Var);
                        } else {
                            v2u v2uVar2 = this.zzn;
                            String str3 = this.zza.a;
                            exc0.i(str3);
                            String str4 = this.zza.b;
                            zza();
                            boolean z = this.zza.c;
                            UserHandle userHandle = this.zzF;
                            v2uVar2.getClass();
                            v2uVar2.d(new fm01(str3, str4, z, userHandle), a801Var);
                        }
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    a801 a801Var2 = this.zzu;
                    if (a801Var2 != null && (kp01Var = this.zza) != null) {
                        String str5 = kp01Var.a;
                        String str6 = kp01Var.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 70 + String.valueOf(str6).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str5);
                        sb.append(" on ");
                        sb.append(str6);
                        Log.e("GmsClient", sb.toString());
                        v2u v2uVar3 = this.zzn;
                        String str7 = this.zza.a;
                        exc0.i(str7);
                        String str8 = this.zza.b;
                        zza();
                        boolean z2 = this.zza.c;
                        UserHandle userHandle2 = this.zzF;
                        v2uVar3.getClass();
                        v2uVar3.d(new fm01(str7, str8, z2, userHandle2), a801Var2);
                        this.zzd.incrementAndGet();
                    }
                    a801 a801Var3 = new a801(this, this.zzd.get());
                    this.zzu = a801Var3;
                    kp01 kp01Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new kp01(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new kp01(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = kp01Var2;
                    if (kp01Var2.c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a)));
                    }
                    if (this.zzF == null || Build.VERSION.SDK_INT < 33) {
                        v2u v2uVar4 = this.zzn;
                        String str9 = this.zza.a;
                        exc0.i(str9);
                        c2 = v2uVar4.c(new fm01(str9, this.zza.b, this.zza.c, null), a801Var3, zza(), getBindServiceExecutor());
                    } else {
                        v2u v2uVar5 = this.zzn;
                        String str10 = this.zza.a;
                        exc0.i(str10);
                        String str11 = this.zza.b;
                        String zza = zza();
                        boolean z3 = this.zza.c;
                        UserHandle userHandle3 = this.zzF;
                        exc0.i(userHandle3);
                        c2 = v2uVar5.c(new fm01(str10, str11, z3, userHandle3), a801Var3, zza, null);
                    }
                    if (!c2.j()) {
                        kp01 kp01Var3 = this.zza;
                        new StringBuilder(String.valueOf(kp01Var3.a).length() + 34 + String.valueOf(kp01Var3.b).length());
                        int i2 = c2.c;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (c2.d != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, c2.d);
                        }
                        zzb(i2, bundle, this.zzd.get());
                    }
                } else if (i == 4) {
                    exc0.i(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int c2 = this.zzo.c(this.zzl, getMinApkVersion());
        if (c2 == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), c2, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@NonNull c cVar) {
        exc0.j(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    @Nullable
    public abstract T createServiceInterface(@NonNull IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    y401 y401Var = (y401) arrayList.get(i);
                    synchronized (y401Var) {
                        y401Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        cnv cnvVar;
        long j;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            cnvVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print(GrsBaseInfo.CountryCodeSource.UNKNOWN);
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (cnvVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(cnvVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzh;
            String format = simpleDateFormat.format(new Date(j2));
            j = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(format).length());
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        } else {
            j = 0;
        }
        if (this.zzg > j) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(format2).length());
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzj > j) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) mmg.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(format3).length());
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    @Nullable
    public Account getAccount() {
        return null;
    }

    @NonNull
    public Feature[] getApiFeatures() {
        return zze;
    }

    @Nullable
    public t94 getAttributionSourceWrapper() {
        return this.zzB;
    }

    @Nullable
    public final Feature[] getAvailableFeatures() {
        com.google.android.gms.common.internal.zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.c;
    }

    @Nullable
    public Executor getBindServiceExecutor() {
        return null;
    }

    @Nullable
    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.zzl;
    }

    @NonNull
    public String getEndpointPackageName() {
        kp01 kp01Var;
        if (!isConnected() || (kp01Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return kp01Var.b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @Nullable
    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    @Nullable
    public String getLocalStartServiceAction() {
        return null;
    }

    @NonNull
    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.a.a;
    }

    public void getRemoteService(@Nullable com.google.android.gms.common.internal.b bVar, @NonNull Set<Scope> set) {
        String attributionTag;
        String attributionTag2;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.zzA;
        } else if (this.zzB == null) {
            attributionTag2 = this.zzA;
        } else {
            AttributionSource attributionSource = this.zzB.a;
            if (attributionSource == null) {
                attributionTag2 = this.zzA;
            } else {
                attributionTag = attributionSource.getAttributionTag();
                attributionTag2 = attributionTag == null ? this.zzA : attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag2;
        int i = this.zzy;
        int i2 = com.google.android.gms.common.a.a;
        Scope[] scopeArr = GetServiceRequest.p;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.q;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.e = this.zzl.getPackageName();
        getServiceRequest.h = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.g = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.i = account;
            if (bVar != null) {
                getServiceRequest.f = bVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.i = getAccount();
        }
        getServiceRequest.j = zze;
        getServiceRequest.k = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.n = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        cnv cnvVar = this.zzr;
                        if (cnvVar != null) {
                            cnvVar.K0(new l601(this, this.zzd.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                onPostInitHandler(8, null, null, this.zzd.get());
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    @NonNull
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                exc0.j(iInterface, "Client is connected but service is null");
                t = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @Nullable
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                cnv cnvVar = this.zzr;
                if (cnvVar == null) {
                    return null;
                }
                return cnvVar.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public abstract String getServiceDescriptor();

    @NonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @NonNull
    public abstract String getStartServiceAction();

    @NonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @Nullable
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        com.google.android.gms.common.internal.zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.e;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectedLocked(@NonNull T t) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzi = connectionResult.c;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, @Nullable IBinder iBinder, @Nullable Bundle bundle, int i2) {
        wa01 wa01Var = new wa01(this, i, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, wa01Var));
    }

    public void onUserSignOut(@NonNull e eVar) {
        ((gmz0) eVar).a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(@NonNull t94 t94Var) {
        this.zzB = t94Var;
    }

    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    public void setUserHandle(@NonNull UserHandle userHandle) {
        if (isConnected()) {
            throw new IllegalStateException("setUserHandle must be called before connect()");
        }
        this.zzF = userHandle;
    }

    public void triggerConnectionSuspended(int i) {
        int i2 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i2, i));
    }

    public void triggerNotAvailable(@NonNull c cVar, int i, @Nullable PendingIntent pendingIntent) {
        exc0.j(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        int i2 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i2, i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i, @Nullable Bundle bundle, int i2) {
        qc01 qc01Var = new qc01(this, i, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, qc01Var));
    }

    public final void zzc(com.google.android.gms.common.internal.zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.e;
            mmg0 a2 = mmg0.a();
            RootTelemetryConfiguration o = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.o();
            synchronized (a2) {
                if (o == null) {
                    a2.a = mmg0.c;
                    return;
                }
                RootTelemetryConfiguration rootTelemetryConfiguration = a2.a;
                if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b < o.b) {
                    a2.a = o;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i, IInterface iInterface) {
        zzp(i, null);
    }

    public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                zzp(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf(int i) {
        int i2;
        int i3;
        synchronized (this.zzp) {
            i2 = this.zzv;
        }
        if (i2 == 3) {
            this.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i3, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(cnv cnvVar) {
        this.zzr = cnvVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ a zzk() {
        return this.zzw;
    }

    public final /* synthetic */ b zzl() {
        return this.zzx;
    }

    public final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rd6(@NonNull Context context, @NonNull Looper looper, int i, @Nullable a aVar, @Nullable b bVar, @Nullable String str) {
        this(context, looper, r3, r4, i, aVar, bVar, str);
        do01 a2 = v2u.a(context);
        com.google.android.gms.common.a aVar2 = com.google.android.gms.common.a.b;
        exc0.i(aVar);
        exc0.i(bVar);
    }

    public void disconnect(@NonNull String str) {
        this.zzk = str;
        disconnect();
    }

    public rd6(@NonNull Context context, @NonNull Looper looper, @NonNull v2u v2uVar, @NonNull com.google.android.gms.common.a aVar, int i, @Nullable a aVar2, @Nullable b bVar, @Nullable String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        exc0.j(context, "Context must not be null");
        this.zzl = context;
        exc0.j(looper, "Looper must not be null");
        this.zzm = looper;
        exc0.j(v2uVar, "Supervisor must not be null");
        this.zzn = v2uVar;
        exc0.j(aVar, "API availability must not be null");
        this.zzo = aVar;
        this.zzb = new z001(this, looper);
        this.zzy = i;
        this.zzw = aVar2;
        this.zzx = bVar;
        this.zzz = str;
    }
}
