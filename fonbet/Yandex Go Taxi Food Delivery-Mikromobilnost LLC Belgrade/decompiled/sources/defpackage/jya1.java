package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class jya1 extends vw91 {
    public zzdf A;
    public volatile boolean B;
    public volatile qwa1 C;
    public qwa1 D;
    public boolean E;
    public final Object F;
    public volatile qwa1 w;
    public volatile qwa1 x;
    public qwa1 y;
    public final ConcurrentHashMap z;

    public jya1(g gVar) {
        super(gVar);
        this.F = new Object();
        this.z = new ConcurrentHashMap();
    }

    @Override // defpackage.vw91
    public final boolean Jg() {
        return false;
    }

    public final void Kg(qwa1 qwa1Var, boolean z, long j) {
        g gVar = (g) this.b;
        bh91 bh91Var = gVar.G;
        g.d(bh91Var);
        gVar.D.getClass();
        bh91Var.Jg(SystemClock.elapsedRealtime());
        boolean z2 = qwa1Var != null && qwa1Var.d;
        m8b1 m8b1Var = gVar.A;
        g.f(m8b1Var);
        if (!m8b1Var.z.e(j, z2, z) || qwa1Var == null) {
            return;
        }
        qwa1Var.d = false;
    }

    public final qwa1 Lg(zzdf zzdfVar) {
        cvw.l(zzdfVar);
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        ConcurrentHashMap concurrentHashMap = this.z;
        qwa1 qwa1Var = (qwa1) concurrentHashMap.get(valueOf);
        if (qwa1Var == null) {
            String Ng = Ng(zzdfVar.zzb);
            ieb1 ieb1Var = ((g) this.b).B;
            g.e(ieb1Var);
            qwa1 qwa1Var2 = new qwa1(null, Ng, ieb1Var.Bh());
            concurrentHashMap.put(valueOf, qwa1Var2);
            qwa1Var = qwa1Var2;
        }
        return this.C != null ? this.C : qwa1Var;
    }

    public final qwa1 Mg(boolean z) {
        Hg();
        Gg();
        qwa1 qwa1Var = this.y;
        return (z && qwa1Var == null) ? this.D : qwa1Var;
    }

    public final String Ng(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        g gVar = (g) this.b;
        int length2 = str2.length();
        gVar.w.getClass();
        if (length2 <= 500) {
            return str2;
        }
        gVar.w.getClass();
        return str2.substring(0, 500);
    }

    public final void Og(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!((g) this.b).w.Ug() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.z.put(Integer.valueOf(zzdfVar.zza), new qwa1(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void Pg(String str, qwa1 qwa1Var, boolean z) {
        qwa1 qwa1Var2;
        qwa1 qwa1Var3 = this.w == null ? this.x : this.w;
        if (qwa1Var.b == null) {
            String Ng = str != null ? Ng(str) : null;
            qwa1Var2 = new qwa1(qwa1Var.c, qwa1Var.f, qwa1Var.a, Ng, qwa1Var.e);
        } else {
            qwa1Var2 = qwa1Var;
        }
        this.x = this.w;
        this.w = qwa1Var2;
        g gVar = (g) this.b;
        gVar.D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new bxa1(this, qwa1Var2, qwa1Var3, elapsedRealtime, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Qg(qwa1 qwa1Var, qwa1 qwa1Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        boolean z3 = qwa1Var.e;
        g gVar = (g) this.b;
        Gg();
        boolean z4 = false;
        if (qwa1Var2 != null) {
            if (qwa1Var2.c == qwa1Var.c && Objects.equals(qwa1Var2.b, qwa1Var.b) && Objects.equals(qwa1Var2.a, qwa1Var.a)) {
                z2 = false;
                if (z && this.y != null) {
                    z4 = true;
                }
                if (z2) {
                    Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                    ieb1.wh(qwa1Var, bundle2, true);
                    if (qwa1Var2 != null) {
                        String str = qwa1Var2.a;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        String str2 = qwa1Var2.b;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", qwa1Var2.c);
                    }
                    if (z4) {
                        m8b1 m8b1Var = gVar.A;
                        g.f(m8b1Var);
                        mdi0 mdi0Var = m8b1Var.z;
                        long j2 = j - mdi0Var.b;
                        mdi0Var.b = j;
                        if (j2 > 0) {
                            ieb1 ieb1Var = gVar.B;
                            g.e(ieb1Var);
                            ieb1Var.mh(bundle2, j2);
                        }
                    }
                    if (!gVar.w.Ug()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    String str3 = true != z3 ? "auto" : "app";
                    gVar.D.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z3) {
                        long j3 = qwa1Var.f;
                        if (j3 != 0) {
                            currentTimeMillis = j3;
                        }
                    }
                    j jVar = gVar.F;
                    g.f(jVar);
                    jVar.Og(str3, "_vs", bundle2, currentTimeMillis);
                }
                if (z4) {
                    Kg(this.y, true, j);
                }
                this.y = qwa1Var;
                if (z3) {
                    this.D = qwa1Var;
                }
                j5b1 j4 = gVar.j();
                j4.Gg();
                j4.Hg();
                j4.Ug(new na3(j4, qwa1Var));
            }
        }
        z2 = true;
        if (z) {
            z4 = true;
        }
        if (z2) {
        }
        if (z4) {
        }
        this.y = qwa1Var;
        if (z3) {
        }
        j5b1 j42 = gVar.j();
        j42.Gg();
        j42.Hg();
        j42.Ug(new na3(j42, qwa1Var));
    }
}
