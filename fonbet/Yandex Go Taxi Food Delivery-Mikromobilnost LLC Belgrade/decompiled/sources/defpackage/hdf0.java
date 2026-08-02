package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.db.AppDatabaseRoom;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class hdf0 implements at2 {
    public final dff0 a;
    public volatile AppDatabaseRoom b;
    public final zq60 c = new zq60();

    public hdf0(kse kseVar, dff0 dff0Var) {
        this.a = dff0Var;
    }

    @Override // defpackage.at2
    public final u2k0 A() {
        return (u2k0) u0(new a6f0(11));
    }

    @Override // defpackage.at2
    public final az10 B() {
        return (az10) u0(new fdf0(25));
    }

    @Override // defpackage.at2
    public final uxj0 C() {
        return (uxj0) u0(new fdf0(5));
    }

    @Override // defpackage.at2
    public final x2c0 D() {
        return (x2c0) u0(new gdf0(0));
    }

    @Override // defpackage.at2
    public final ksa0 E() {
        return (ksa0) u0(new fdf0(10));
    }

    @Override // defpackage.at2
    public final ot21 F() {
        return (ot21) u0(new fdf0(22));
    }

    @Override // defpackage.at2
    public final ed60 G() {
        return (ed60) u0(new fdf0(23));
    }

    @Override // defpackage.at2
    public final t5b0 H() {
        return (t5b0) u0(new a6f0(21));
    }

    @Override // defpackage.at2
    public final vl21 I() {
        return (vl21) u0(new a6f0(25));
    }

    @Override // defpackage.at2
    public final c421 J() {
        return (c421) u0(new fdf0(19));
    }

    @Override // defpackage.at2
    public final q5b K() {
        return (q5b) u0(new fdf0(1));
    }

    @Override // defpackage.at2
    public final s2c0 L() {
        return (s2c0) u0(new fdf0(11));
    }

    @Override // defpackage.at2
    public final void M(zs2 zs2Var) {
        synchronized (this.c) {
            this.c.d(zs2Var);
        }
        AppDatabaseRoom appDatabaseRoom = this.b;
        if (appDatabaseRoom != null) {
            appDatabaseRoom.M(zs2Var);
        }
    }

    @Override // defpackage.at2
    public final eta0 N() {
        return (eta0) u0(new a6f0(29));
    }

    @Override // defpackage.at2
    public final fqr0 O() {
        return (fqr0) u0(new a6f0(19));
    }

    @Override // defpackage.at2
    public final void P(tls tlsVar) {
        u0(new gv40(16, tlsVar));
    }

    @Override // defpackage.at2
    public final kl21 Q() {
        return (kl21) u0(new a6f0(22));
    }

    @Override // defpackage.at2
    public final a8b R() {
        return (a8b) u0(new fdf0(15));
    }

    @Override // defpackage.at2
    public final ro6 S() {
        return (ro6) u0(new fdf0(24));
    }

    @Override // defpackage.at2
    public final boolean T() {
        AppDatabaseRoom appDatabaseRoom = this.b;
        return appDatabaseRoom != null && appDatabaseRoom.T();
    }

    @Override // defpackage.at2
    public final ys2 U() {
        return (ys2) u0(new fdf0(13));
    }

    @Override // defpackage.at2
    public final x8b V() {
        return (x8b) u0(new gdf0(10));
    }

    @Override // defpackage.at2
    public final q5b0 W() {
        return (q5b0) u0(new a6f0(17));
    }

    @Override // defpackage.at2
    public final lgu X() {
        return (lgu) u0(new a6f0(18));
    }

    @Override // defpackage.at2
    public final meb Y() {
        return (meb) u0(new fdf0(12));
    }

    @Override // defpackage.at2
    public final gdu0 Z() {
        return (gdu0) u0(new fdf0(16));
    }

    @Override // defpackage.at2
    public final bv21 a() {
        return (bv21) u0(new a6f0(9));
    }

    @Override // defpackage.at2
    public final w6b a0() {
        return (w6b) u0(new fdf0(26));
    }

    @Override // defpackage.at2
    public final by10 b() {
        return (by10) u0(new fdf0(0));
    }

    @Override // defpackage.at2
    public final xw10 b0() {
        return (xw10) u0(new a6f0(8));
    }

    @Override // defpackage.at2
    public final ueb c() {
        return (ueb) u0(new a6f0(5));
    }

    @Override // defpackage.at2
    public final void c0(zs2 zs2Var) {
        AppDatabaseRoom appDatabaseRoom = this.b;
        if (appDatabaseRoom != null) {
            appDatabaseRoom.c0(zs2Var);
            return;
        }
        synchronized (this.c) {
            this.c.b(zs2Var);
        }
        AppDatabaseRoom appDatabaseRoom2 = this.b;
        if (appDatabaseRoom2 != null) {
            t0(appDatabaseRoom2);
        }
    }

    @Override // defpackage.at2
    public final mv21 d() {
        return (mv21) u0(new fdf0(2));
    }

    @Override // defpackage.at2
    public final qzy0 d0() {
        return (qzy0) u0(new gdf0(1));
    }

    @Override // defpackage.at2
    public final String e() {
        return (String) u0(new gdf0(4));
    }

    @Override // defpackage.at2
    public final sr10 e0() {
        return (sr10) u0(new a6f0(10));
    }

    @Override // defpackage.at2
    public final v2b f() {
        return (v2b) u0(new a6f0(26));
    }

    @Override // defpackage.at2
    public final dc1 f0() {
        return (dc1) u0(new gdf0(11));
    }

    @Override // defpackage.at2
    public final void flush() {
        u0(new gdf0(7));
    }

    @Override // defpackage.at2
    public final wrw g() {
        return (wrw) u0(new gdf0(6));
    }

    @Override // defpackage.at2
    public final vgs g0() {
        return (vgs) u0(new fdf0(21));
    }

    @Override // defpackage.at2
    public final uh10 h() {
        return (uh10) u0(new a6f0(27));
    }

    @Override // defpackage.at2
    public final hyt0 h0() {
        return (hyt0) u0(new fdf0(14));
    }

    @Override // defpackage.at2
    public final long i() {
        return ((Number) u0(new a6f0(12))).longValue();
    }

    @Override // defpackage.at2
    public final fsh j() {
        return (fsh) u0(new a6f0(6));
    }

    @Override // defpackage.at2
    public final nmf j0() {
        return (nmf) u0(new fdf0(20));
    }

    @Override // defpackage.at2
    public final t3f0 k() {
        return (t3f0) u0(new a6f0(28));
    }

    @Override // defpackage.at2
    public final y7b0 k0() {
        return (y7b0) u0(new fdf0(9));
    }

    @Override // defpackage.at2
    public final gwr l() {
        return (gwr) u0(new gdf0(8));
    }

    @Override // defpackage.at2
    public final wgu l0() {
        return (wgu) u0(new a6f0(15));
    }

    @Override // defpackage.at2
    public final v5b m() {
        return (v5b) u0(new a6f0(7));
    }

    @Override // defpackage.at2
    public final m5b m0() {
        return (m5b) u0(new fdf0(17));
    }

    @Override // defpackage.at2
    public final g4r n() {
        return (g4r) u0(new a6f0(14));
    }

    @Override // defpackage.at2
    public final v2b0 n0() {
        return (v2b0) u0(new a6f0(13));
    }

    @Override // defpackage.at2
    public final k5b0 o() {
        return (k5b0) u0(new fdf0(28));
    }

    @Override // defpackage.at2
    public final Object o0(tls tlsVar) {
        AppDatabaseRoom appDatabaseRoom = this.b;
        if (appDatabaseRoom != null) {
            return appDatabaseRoom.o0(tlsVar);
        }
        return null;
    }

    @Override // defpackage.at2
    public final uc7 p() {
        return (uc7) u0(new a6f0(24));
    }

    @Override // defpackage.at2
    public final xu10 p0() {
        return (xu10) u0(new gdf0(2));
    }

    @Override // defpackage.at2
    public final z2b q() {
        return (z2b) u0(new gdf0(3));
    }

    @Override // defpackage.at2
    public final boolean q0() {
        AppDatabaseRoom appDatabaseRoom = this.b;
        return appDatabaseRoom != null && appDatabaseRoom.M0();
    }

    @Override // defpackage.at2
    public final ccu0 r() {
        return (ccu0) u0(new gdf0(9));
    }

    @Override // defpackage.at2
    public final i2z r0() {
        return (i2z) u0(new a6f0(23));
    }

    @Override // defpackage.at2
    public final cv21 s() {
        return (cv21) u0(new a6f0(20));
    }

    @Override // defpackage.at2
    public final tg90 s0() {
        return (tg90) u0(new fdf0(8));
    }

    @Override // defpackage.at2
    public final ikw0 startTransaction() {
        return (ikw0) u0(new fdf0(6));
    }

    @Override // defpackage.at2
    public final long t() {
        return ((Number) u0(new fdf0(4))).longValue();
    }

    public final void t0(AppDatabaseRoom appDatabaseRoom) {
        synchronized (this.c) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    appDatabaseRoom.c0((zs2) it.next());
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.at2
    public final h3t0 takeSnapshot() {
        return (h3t0) u0(new fdf0(7));
    }

    @Override // defpackage.at2
    public final rdu0 u() {
        return (rdu0) u0(new fdf0(3));
    }

    public final Object u0(tls tlsVar) {
        z83.i();
        Object obj = this.b;
        if (obj == null) {
            Looper.myLooper();
            Looper.getMainLooper();
            z83.i();
            synchronized (this) {
                obj = this.b;
                if (obj == null) {
                    obj = this.a.get();
                    this.b = (AppDatabaseRoom) obj;
                    t0((AppDatabaseRoom) obj);
                }
            }
        }
        return tlsVar.invoke(obj);
    }

    @Override // defpackage.at2
    public final dvi0 v() {
        return (dvi0) u0(new fdf0(29));
    }

    @Override // defpackage.at2
    public final k2b w() {
        return (k2b) u0(new gdf0(5));
    }

    @Override // defpackage.at2
    public final l6b x() {
        return (l6b) u0(new fdf0(27));
    }

    @Override // defpackage.at2
    public final kp21 y() {
        return (kp21) u0(new a6f0(16));
    }

    @Override // defpackage.at2
    public final kcb z() {
        return (kcb) u0(new fdf0(18));
    }
}
