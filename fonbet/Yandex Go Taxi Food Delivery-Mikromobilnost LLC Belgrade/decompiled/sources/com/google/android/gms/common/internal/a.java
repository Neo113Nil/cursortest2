package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import defpackage.a191;
import defpackage.a25;
import defpackage.ax91;
import defpackage.b25;
import defpackage.c25;
import defpackage.cvw;
import defpackage.d25;
import defpackage.e3b1;
import defpackage.fr91;
import defpackage.hwa1;
import defpackage.kbs;
import defpackage.kne0;
import defpackage.lm71;
import defpackage.q391;
import defpackage.vkt;
import defpackage.z15;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a {
    public static final Feature[] V = new Feature[0];
    public final Context A;
    public final vkt B;
    public final com.google.android.gms.common.b C;
    public final Handler D;
    public IGmsServiceBroker G;
    public b25 H;
    public IInterface I;
    public zze K;
    public final z15 M;
    public final a25 N;
    public final int O;
    public final String P;
    public volatile String Q;
    public int a;
    public long b;
    public long c;
    public int w;
    public long x;
    public kne0 z;
    public volatile String y = null;
    public final Object E = new Object();
    public final Object F = new Object();
    public final ArrayList J = new ArrayList();
    public int L = 1;
    public ConnectionResult R = null;
    public boolean S = false;
    public volatile zzj T = null;
    public final AtomicInteger U = new AtomicInteger(0);

    public a(Context context, Looper looper, b bVar, com.google.android.gms.common.b bVar2, int i, z15 z15Var, a25 a25Var, String str) {
        cvw.m(context, "Context must not be null");
        this.A = context;
        cvw.m(looper, "Looper must not be null");
        cvw.m(bVar, "Supervisor must not be null");
        this.B = bVar;
        cvw.m(bVar2, "API availability must not be null");
        this.C = bVar2;
        this.D = new zzb(this, looper);
        this.O = i;
        this.M = z15Var;
        this.N = a25Var;
        this.P = str;
    }

    public final void c() {
        int d = this.C.d(this.A, getMinApkVersion());
        if (d == 0) {
            connect(new c25(this));
            return;
        }
        r(1, null);
        this.H = new c25(this);
        int i = this.U.get();
        Handler handler = this.D;
        handler.sendMessage(handler.obtainMessage(3, i, d, null));
    }

    public final void connect(b25 b25Var) {
        cvw.m(b25Var, "Connection progress callbacks cannot be null.");
        this.H = b25Var;
        r(2, null);
    }

    public abstract IInterface d(IBinder iBinder);

    public final void disconnect() {
        this.U.incrementAndGet();
        ArrayList arrayList = this.J;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((q391) arrayList.get(i)).e();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.F) {
            this.G = null;
        }
        r(1, null);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        long j;
        synchronized (this.E) {
            i = this.L;
            iInterface = this.I;
        }
        synchronized (this.F) {
            iGmsServiceBroker = this.G;
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
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) j()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.c;
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
        if (this.b > j) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.a;
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
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(format2).length());
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.x > j) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) hwa1.e(this.w));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.x;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(format3).length());
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public Account e() {
        return null;
    }

    public Feature[] f() {
        return V;
    }

    public Bundle g() {
        return new Bundle();
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.T;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzb;
    }

    public final String getEndpointPackageName() {
        if (isConnected() && this.z != null) {
            return "com.google.android.gms";
        }
        kbs.g("Failed to connect when checking package");
        return null;
    }

    public final String getLastDisconnectMessage() {
        return this.y;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.b.a;
    }

    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set set) {
        Bundle g = g();
        String str = this.Q;
        int i = this.O;
        int i2 = com.google.android.gms.common.b.a;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.A.getPackageName();
        getServiceRequest.zzi = g;
        if (set != null) {
            getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account e = e();
            if (e == null) {
                e = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzj = e;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (this instanceof com.google.android.gms.wallet.internal.a) {
            getServiceRequest.zzj = null;
        }
        getServiceRequest.zzk = V;
        getServiceRequest.zzl = f();
        if (p()) {
            getServiceRequest.zzo = true;
        }
        try {
            try {
                synchronized (this.F) {
                    try {
                        IGmsServiceBroker iGmsServiceBroker = this.G;
                        if (iGmsServiceBroker != null) {
                            iGmsServiceBroker.getService(new zzd(this, this.U.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i3 = this.U.get();
                fr91 fr91Var = new fr91(this, 8, null, null);
                Handler handler = this.D;
                handler.sendMessage(handler.obtainMessage(1, i3, -1, fr91Var));
            }
        } catch (DeadObjectException unused2) {
            int i4 = this.U.get();
            Handler handler2 = this.D;
            handler2.sendMessage(handler2.obtainMessage(6, i4, 3));
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public Set h() {
        return Collections.EMPTY_SET;
    }

    public final IInterface i() {
        IInterface iInterface;
        synchronized (this.E) {
            try {
                if (this.L == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.I;
                cvw.m(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.E) {
            z = this.L == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.E) {
            int i = this.L;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public abstract String j();

    public abstract String k();

    public final ConnectionTelemetryConfiguration l() {
        zzj zzjVar = this.T;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzd;
    }

    public boolean m() {
        return getMinApkVersion() >= 211700000;
    }

    public final void n(ConnectionResult connectionResult) {
        this.w = connectionResult.getErrorCode();
        this.x = System.currentTimeMillis();
    }

    public void o(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public final void onUserSignOut(d25 d25Var) {
        ((lm71) d25Var).s();
    }

    public boolean p() {
        return this instanceof com.google.android.gms.auth.blockstore.restorecredential.internal.b;
    }

    public boolean providesSignIn() {
        return this instanceof a191;
    }

    public final /* synthetic */ boolean q(int i, int i2, IInterface iInterface) {
        synchronized (this.E) {
            try {
                if (this.L != i) {
                    return false;
                }
                r(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(int i, IInterface iInterface) {
        kne0 kne0Var;
        cvw.e((i == 4) == (iInterface != null));
        synchronized (this.E) {
            try {
                this.L = i;
                this.I = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    zze zzeVar = this.K;
                    if (zzeVar != null) {
                        vkt vktVar = this.B;
                        String c = this.z.c();
                        cvw.l(c);
                        this.z.getClass();
                        String str = this.P;
                        if (str == null) {
                            str = this.A.getClass().getName();
                        }
                        boolean d = this.z.d();
                        vktVar.getClass();
                        vktVar.c(new e3b1(c, "com.google.android.gms", d), zzeVar, str);
                        this.K = null;
                    }
                } else if (i == 2 || i == 3) {
                    zze zzeVar2 = this.K;
                    if (zzeVar2 != null && (kne0Var = this.z) != null) {
                        String c2 = kne0Var.c();
                        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        vkt vktVar2 = this.B;
                        String c3 = this.z.c();
                        cvw.l(c3);
                        this.z.getClass();
                        String str2 = this.P;
                        if (str2 == null) {
                            str2 = this.A.getClass().getName();
                        }
                        boolean d2 = this.z.d();
                        vktVar2.getClass();
                        vktVar2.c(new e3b1(c3, "com.google.android.gms", d2), zzeVar2, str2);
                        this.U.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.U.get());
                    this.K = zzeVar3;
                    kne0 kne0Var2 = new kne0(k(), m());
                    this.z = kne0Var2;
                    if (kne0Var2.d() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.z.c())));
                    }
                    vkt vktVar3 = this.B;
                    String c4 = this.z.c();
                    cvw.l(c4);
                    this.z.getClass();
                    String str3 = this.P;
                    if (str3 == null) {
                        str3 = this.A.getClass().getName();
                    }
                    ConnectionResult b = vktVar3.b(new e3b1(c4, "com.google.android.gms", this.z.d()), zzeVar3, str3, null);
                    if (!b.isSuccess()) {
                        String c5 = this.z.c();
                        this.z.getClass();
                        new StringBuilder(String.valueOf(c5).length() + 34 + "com.google.android.gms".length());
                        int errorCode = b.getErrorCode() == -1 ? 16 : b.getErrorCode();
                        if (b.getResolution() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b.getResolution());
                        }
                        int i2 = this.U.get();
                        ax91 ax91Var = new ax91(this, errorCode, bundle);
                        Handler handler = this.D;
                        handler.sendMessage(handler.obtainMessage(7, i2, -1, ax91Var));
                    }
                } else if (i == 4) {
                    cvw.l(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public final boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void disconnect(String str) {
        this.y = str;
        disconnect();
    }
}
