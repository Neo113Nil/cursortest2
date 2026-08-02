package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.internal.cast.zzax;
import com.google.android.gms.internal.cast.zzay;
import com.google.android.gms.internal.cast.zzba;
import com.google.android.gms.internal.cast.zzbq;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzce;
import com.google.android.gms.internal.cast.zzek;
import com.google.android.gms.internal.cast.zzwt;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class uz9 {
    public static final o100 m = new o100("CastContext", null);
    public static final Object n = new Object();

    @Nullable
    public static volatile uz9 o;
    public final Context a;
    public final zwz0 b;
    public final hui0 c;
    public final tuz0 d;
    public final CastOptions e;
    public final cm01 f;
    public final zzax g;
    public final zzbq h;

    @Nullable
    public final List i;

    @Nullable
    public final zzce j;

    @Nullable
    public final zzba k;

    @Nullable
    public e0a l;

    public uz9(Context context, CastOptions castOptions, @Nullable List list, zzbx zzbxVar, cm01 cm01Var) throws ModuleUnavailableException {
        this.a = context;
        this.e = castOptions;
        this.f = cm01Var;
        this.i = list;
        this.h = new zzbq(context);
        this.j = zzbxVar.zzu();
        this.k = !TextUtils.isEmpty(castOptions.b) ? new zzba(context, castOptions, zzbxVar) : null;
        HashMap hashMap = new HashMap();
        zzba zzbaVar = this.k;
        if (zzbaVar != null) {
            hashMap.put(zzbaVar.getCategory(), zzbaVar.zza());
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lui0 lui0Var = (lui0) it.next();
                exc0.j(lui0Var, "Additional SessionProvider must not be null.");
                String category = lui0Var.getCategory();
                exc0.g(category, "Category for SessionProvider must not be null or empty string.");
                exc0.a("SessionProvider for category " + category + " already added", !hashMap.containsKey(category));
                hashMap.put(category, lui0Var.zza());
            }
        }
        castOptions.q = new com.google.android.gms.cast.framework.zzm(1);
        try {
            zwz0 zza = zzay.zza(context, castOptions, zzbxVar, hashMap);
            this.b = zza;
            try {
                this.d = new tuz0(zza.zzh());
                try {
                    hui0 hui0Var = new hui0(zza.zzg(), context);
                    this.c = hui0Var;
                    exc0.g("PrecacheManager", "The log tag cannot be null or empty.");
                    zzce zzceVar = this.j;
                    if (zzceVar != null) {
                        zzceVar.zza(hui0Var);
                    }
                    zzek zzekVar = new zzek(context, zzwt.zza(Executors.newFixedThreadPool(3)));
                    exc0.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    zzekVar.zza();
                    zzax zzaxVar = new zzax();
                    this.g = zzaxVar;
                    try {
                        zza.l1(zzaxVar);
                        zzaxVar.zzf(this.h.zza);
                        if (!Collections.unmodifiableList(castOptions.m).isEmpty()) {
                            m.c("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(this.e.m))), new Object[0]);
                            this.h.zzf(Collections.unmodifiableList(this.e.m));
                        }
                        cm01Var.a(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).addOnSuccessListener(new OnSuccessListener() { // from class: xsna.ie01
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final /* synthetic */ void onSuccess(Object obj) {
                                Bundle bundle = (Bundle) obj;
                                uz9 uz9Var = uz9.this;
                                uz9Var.getClass();
                                if (com.google.android.gms.internal.cast.zzj.zza) {
                                    com.google.android.gms.internal.cast.zzj.zza(uz9Var.a, uz9Var.f, uz9Var.c, uz9Var.j, uz9Var.g).zzb(bundle);
                                }
                            }
                        });
                        f5o0.a a = f5o0.a();
                        a.a = new ld20(cm01Var, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        a.d = new Feature[]{wyz0.d};
                        a.c = true;
                        a.b = false;
                        a.e = 8427;
                        cm01Var.doRead(a.a()).addOnSuccessListener(new OnSuccessListener() { // from class: xsna.zf01
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final /* synthetic */ void onSuccess(Object obj) {
                                uz9.this.l = new e0a((Bundle) obj);
                            }
                        });
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: all -> 0x006b, ReflectiveOperationException -> 0x0076, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ReflectiveOperationException -> 0x0076, blocks: (B:16:0x0033, B:26:0x0079, B:27:0x0080), top: B:14:0x0031, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x006b, ReflectiveOperationException -> 0x0076, TRY_ENTER, TryCatch #3 {ReflectiveOperationException -> 0x0076, blocks: (B:16:0x0033, B:26:0x0079, B:27:0x0080), top: B:14:0x0031, outer: #1 }] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uz9 e(@NonNull Context context) throws IllegalStateException {
        String str;
        ApplicationInfo a;
        Bundle bundle;
        exc0.e("Must be called from the main thread.");
        if (o == null) {
            synchronized (n) {
                if (o == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        a = xzx0.a(applicationContext).a(128, applicationContext.getPackageName());
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    try {
                        if (a != null && (bundle = a.metaData) != null) {
                            str = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
                            if (str != null) {
                                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
                            }
                            cu80 cu80Var = (cu80) Class.forName(str).asSubclass(cu80.class).getDeclaredConstructor(null).newInstance(null);
                            CastOptions castOptions = cu80Var.getCastOptions(applicationContext);
                            cm01 cm01Var = new cm01(applicationContext, cm01.a, a.d.U6, b.a.c);
                            try {
                                o = new uz9(applicationContext, castOptions, cu80Var.getAdditionalSessionProviders(applicationContext), new zzbx(applicationContext, fx10.d(applicationContext), castOptions, cm01Var), cm01Var);
                            } catch (ModuleUnavailableException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        if (str != null) {
                        }
                    } catch (ReflectiveOperationException e2) {
                        throw new IllegalStateException("Failed to initialize CastContext with manifest options.", e2);
                    }
                    str = null;
                }
            }
        }
        return o;
    }

    @Nullable
    public static uz9 g(@NonNull Context context) throws IllegalStateException {
        exc0.e("Must be called from the main thread.");
        try {
            return e(context);
        } catch (RuntimeException e) {
            o100 o100Var = m;
            Log.e(o100Var.a, o100Var.c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e));
            return null;
        }
    }

    public final void a(@NonNull k0a k0aVar) throws IllegalStateException, NullPointerException {
        exc0.e("Must be called from the main thread.");
        exc0.i(k0aVar);
        hui0 hui0Var = this.c;
        hui0Var.getClass();
        try {
            hui0Var.a.J(new huz0(k0aVar));
        } catch (RemoteException unused) {
            hui0.c.b("Unable to call %s on %s.", "addCastStateListener", g001.class.getSimpleName());
        }
    }

    public final int b() {
        exc0.e("Must be called from the main thread.");
        hui0 hui0Var = this.c;
        hui0Var.getClass();
        try {
            return hui0Var.a.zzl();
        } catch (RemoteException unused) {
            hui0.c.b("Unable to call %s on %s.", "addCastStateListener", g001.class.getSimpleName());
            return 1;
        }
    }

    @Nullable
    public final ex10 c() throws IllegalStateException {
        exc0.e("Must be called from the main thread.");
        try {
            return ex10.b(this.b.zze());
        } catch (RemoteException unused) {
            m.b("Unable to call %s on %s.", "getMergedSelectorAsBundle", zwz0.class.getSimpleName());
            return null;
        }
    }

    @NonNull
    public final hui0 d() throws IllegalStateException {
        exc0.e("Must be called from the main thread.");
        return this.c;
    }

    public final void f(@NonNull k0a k0aVar) throws IllegalStateException {
        exc0.e("Must be called from the main thread.");
        if (k0aVar == null) {
            return;
        }
        hui0 hui0Var = this.c;
        hui0Var.getClass();
        try {
            hui0Var.a.F(new huz0(k0aVar));
        } catch (RemoteException unused) {
            hui0.c.b("Unable to call %s on %s.", "removeCastStateListener", g001.class.getSimpleName());
        }
    }
}
