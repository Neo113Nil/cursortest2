package xsna;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzib;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class mb01 implements ed01 {
    public static volatile mb01 I;
    public long A;
    public volatile Boolean B;

    @VisibleForTesting
    public final Boolean C;

    @VisibleForTesting
    public final Boolean D;
    public volatile boolean E;
    public int F;

    @VisibleForTesting
    public final long H;
    public final Context b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final fai g;
    public final kwz0 h;
    public final x901 i;
    public final k901 j;
    public final kb01 k;
    public final fj01 l;
    public final sk01 m;
    public final f901 n;
    public final jcl o;
    public final kg01 p;
    public final bf01 q;
    public final w601 r;
    public final bg01 s;
    public final String t;
    public e901 u;
    public yh01 v;
    public vyz0 w;
    public w701 x;
    public Boolean z;
    public boolean y = false;
    public final AtomicInteger G = new AtomicInteger(0);

    public mb01(id01 id01Var) {
        Bundle bundle;
        Context context = id01Var.a;
        fai faiVar = new fai();
        this.g = faiVar;
        pli.e = faiVar;
        this.b = context;
        this.c = id01Var.b;
        this.d = id01Var.c;
        this.e = id01Var.d;
        this.f = id01Var.h;
        this.B = id01Var.e;
        this.t = id01Var.j;
        this.E = true;
        zzcl zzclVar = id01Var.g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.C = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.D = (Boolean) obj2;
            }
        }
        zzib.zze(context);
        this.o = jcl.a;
        Long l = id01Var.i;
        this.H = l != null ? l.longValue() : System.currentTimeMillis();
        kwz0 kwz0Var = new kwz0(this);
        kwz0Var.f = i35.g;
        this.h = kwz0Var;
        x901 x901Var = new x901(this);
        x901Var.n();
        this.i = x901Var;
        k901 k901Var = new k901(this);
        k901Var.n();
        this.j = k901Var;
        sk01 sk01Var = new sk01(this);
        sk01Var.n();
        this.m = sk01Var;
        this.n = new f901(new iq6(this));
        this.r = new w601(this);
        kg01 kg01Var = new kg01(this);
        kg01Var.m();
        this.p = kg01Var;
        bf01 bf01Var = new bf01(this);
        bf01Var.m();
        this.q = bf01Var;
        fj01 fj01Var = new fj01(this);
        fj01Var.m();
        this.l = fj01Var;
        bg01 bg01Var = new bg01(this);
        bg01Var.n();
        this.s = bg01Var;
        kb01 kb01Var = new kb01(this);
        kb01Var.n();
        this.k = kb01Var;
        zzcl zzclVar2 = id01Var.g;
        boolean z = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            j(bf01Var);
            if (((mb01) bf01Var.b).b.getApplicationContext() instanceof Application) {
                Application application = (Application) ((mb01) bf01Var.b).b.getApplicationContext();
                if (bf01Var.f == null) {
                    bf01Var.f = new af01(bf01Var);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(bf01Var.f);
                    application.registerActivityLifecycleCallbacks(bf01Var.f);
                    k901 k901Var2 = ((mb01) bf01Var.b).j;
                    k(k901Var2);
                    k901Var2.q.a("Registered activity lifecycle callback");
                }
            }
        } else {
            k(k901Var);
            k901Var.l.a("Application context is not an Application");
        }
        kb01Var.s(new lb01(this, id01Var, 0));
    }

    public static final void i(q1t q1tVar) {
        if (q1tVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void j(fa01 fa01Var) {
        if (fa01Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!fa01Var.e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(fa01Var.getClass())));
        }
    }

    public static final void k(dd01 dd01Var) {
        if (dd01Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!dd01Var.e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(dd01Var.getClass())));
        }
    }

    public static mb01 r(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        exc0.i(context);
        exc0.i(context.getApplicationContext());
        if (I == null) {
            synchronized (mb01.class) {
                try {
                    if (I == null) {
                        I = new mb01(new id01(context, zzclVar, l));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            exc0.i(I);
            I.B = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        exc0.i(I);
        return I;
    }

    public final void a() {
        this.G.incrementAndGet();
    }

    public final boolean b() {
        return l() == 0;
    }

    @Override // xsna.ed01
    public final Context c() {
        return this.b;
    }

    @Override // xsna.ed01
    public final kb01 d() {
        kb01 kb01Var = this.k;
        k(kb01Var);
        return kb01Var;
    }

    @Override // xsna.ed01
    public final k901 e() {
        k901 k901Var = this.j;
        k(k901Var);
        return k901Var;
    }

    @Override // xsna.ed01
    public final avf f() {
        return this.o;
    }

    @Override // xsna.ed01
    public final fai g() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.A) > 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r1.enabled != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        boolean z;
        if (!this.y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        kb01 kb01Var = this.k;
        k(kb01Var);
        kb01Var.k();
        Boolean bool = this.z;
        jcl jclVar = this.o;
        if (bool != null && this.A != 0) {
            if (!bool.booleanValue()) {
                jclVar.getClass();
            }
            return this.z.booleanValue();
        }
        jclVar.getClass();
        this.A = SystemClock.elapsedRealtime();
        sk01 sk01Var = this.m;
        i(sk01Var);
        boolean z2 = true;
        if (sk01Var.Q("android.permission.INTERNET") && sk01Var.Q("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.b;
            if (!xzx0.a(context).c() && !this.h.y()) {
                if (sk01.V(context)) {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (r1 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
            z = true;
            this.z = Boolean.valueOf(z);
            if (z) {
                String p = o().p();
                w701 o = o();
                o.l();
                if (!sk01Var.J(p, o.p)) {
                    w701 o2 = o();
                    o2.l();
                    if (TextUtils.isEmpty(o2.p)) {
                        z2 = false;
                    }
                }
                this.z = Boolean.valueOf(z2);
            }
            return this.z.booleanValue();
        }
        z = false;
        this.z = Boolean.valueOf(z);
        if (z) {
        }
        return this.z.booleanValue();
    }

    public final int l() {
        kb01 kb01Var = this.k;
        k(kb01Var);
        kb01Var.k();
        if (this.h.w()) {
            return 1;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        kb01 kb01Var2 = this.k;
        k(kb01Var2);
        kb01Var2.k();
        if (!this.E) {
            return 8;
        }
        x901 x901Var = this.i;
        i(x901Var);
        x901Var.k();
        Boolean valueOf = x901Var.o().contains("measurement_enabled") ? Boolean.valueOf(x901Var.o().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        kwz0 kwz0Var = this.h;
        fai faiVar = ((mb01) kwz0Var.b).g;
        Boolean s = kwz0Var.s("firebase_analytics_collection_enabled");
        if (s != null) {
            return s.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.B == null || this.B.booleanValue()) ? 0 : 7;
    }

    public final w601 m() {
        w601 w601Var = this.r;
        if (w601Var != null) {
            return w601Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final vyz0 n() {
        k(this.w);
        return this.w;
    }

    public final w701 o() {
        j(this.x);
        return this.x;
    }

    public final e901 p() {
        j(this.u);
        return this.u;
    }

    public final f901 q() {
        return this.n;
    }

    public final yh01 s() {
        j(this.v);
        return this.v;
    }
}
