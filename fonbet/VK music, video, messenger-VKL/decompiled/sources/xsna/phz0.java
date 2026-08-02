package xsna;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.igz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class phz0 implements jaz0 {
    public final tez0 b;
    public final k6z0 c;
    public final igz0.a d;
    public final nuy0 e;
    public final iv1 f;
    public final gdy0 g;
    public final igz0.b h;
    public final Handler i;
    public final boolean j;
    public final vez0 l;
    public final fvy0 m;
    public a n;
    public long o;
    public final long p;
    public boolean q;
    public boolean r;
    public boolean s = false;
    public final hv1 k = new hv1(this, 27);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        private static final /* synthetic */ a[] d;

        static {
            a aVar = new a("DISABLED", 0);
            a = aVar;
            a aVar2 = new a("RULED_BY_POST", 1);
            b = aVar2;
            a aVar3 = new a("RULED_BY_VIDEO", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public phz0(ogz0 ogz0Var, tez0 tez0Var, igz0.a aVar, igz0.b bVar, m3z0 m3z0Var) {
        tez0 tez0Var2;
        this.n = a.a;
        boolean z = false;
        this.b = tez0Var;
        k6z0 k6z0Var = tez0Var.v;
        this.c = k6z0Var;
        this.d = aVar;
        this.h = bVar;
        this.i = new Handler(Looper.getMainLooper());
        Context context = ogz0Var.c;
        gdy0 gdy0Var = new gdy0(context);
        this.g = gdy0Var;
        gdy0Var.setColor(tez0Var.a0.h);
        tjz0 tjz0Var = new tjz0(ogz0Var.d, context, this);
        tjz0Var.setBanner(tez0Var);
        lgz0 lgz0Var = tez0Var.c0;
        ArrayList arrayList = tez0Var.b0;
        if (!arrayList.isEmpty()) {
            zey0 zey0Var = new zey0(context);
            miz0 miz0Var = new miz0(zey0Var, arrayList, this);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new vdz0((wfy0) it.next(), miz0Var));
            }
            zey0Var.setAdapter(new hez0(arrayList2, ogz0Var));
            this.e = ogz0Var.a(tez0Var, tjz0Var, gdy0Var, zey0Var, this);
            tez0Var2 = tez0Var;
        } else if (lgz0Var != null) {
            this.j = k6z0Var.n;
            dvy0 dvy0Var = new dvy0(context);
            nuy0 a2 = ogz0Var.a(tez0Var, tjz0Var, gdy0Var, dvy0Var, this);
            this.e = a2;
            dvy0Var.b(lgz0Var.g(), lgz0Var.q());
            this.l = new vez0(lgz0Var, dvy0Var, this, bVar, ogz0Var, kqz0.a(dvy0Var.getContext(), ogz0Var.e), m3z0Var);
            gdy0Var.setMaxTime(lgz0Var.D);
            kiw kiwVar = lgz0Var.Z;
            a2.setBackgroundImage(kiwVar == null ? tez0Var.t : kiwVar);
            tez0Var2 = tez0Var;
        } else {
            tez0Var2 = tez0Var;
            nuy0 a3 = ogz0Var.a(tez0Var2, tjz0Var, gdy0Var, null, this);
            this.e = a3;
            a3.f();
            a3.setBackgroundImage(tez0Var2.t);
        }
        this.e.setBanner(tez0Var2);
        this.f = new iv1(this, 19);
        nuy0 nuy0Var = this.e;
        lgz0 lgz0Var2 = tez0Var2.c0;
        if (lgz0Var2 == null || !lgz0Var2.h0) {
            if (tez0Var2.Y) {
                long j = (long) (tez0Var2.V * 1000.0f);
                this.p = j;
                this.o = j;
                if (j > 0) {
                    gu8.c(null, "InterstitialPromoPresenterS2: Banner will be allowed to close in " + this.o + " millis");
                    this.n = a.b;
                    n();
                } else {
                    gu8.c(null, "InterstitialPromoPresenterS2: Banner is allowed to close");
                    m();
                    z = true;
                }
            } else {
                this.n = a.a;
                nuy0Var.u.setVisibility(8);
            }
        } else if (lgz0Var2.l0) {
            long j2 = (long) (lgz0Var2.q0 * 1000.0f);
            this.p = j2;
            this.o = j2;
            if (j2 > 0) {
                this.n = a.c;
                n();
            } else {
                m();
                z = true;
            }
        } else {
            nuy0Var.u.setVisibility(8);
        }
        this.d.a.j = z;
        nuy0 nuy0Var2 = this.e;
        nuy0Var2.getClass();
        aVar.j(tez0Var2, nuy0Var2);
        wty0 wty0Var = tez0Var2.L;
        if (wty0Var == null || wty0Var.c == null) {
            return;
        }
        fvy0 fvy0Var = new fvy0(wty0Var, new mnh0());
        this.m = fvy0Var;
        fvy0Var.d = new u1j0(this, 15);
    }

    public final void a(xey0 xey0Var, int i, dhz0 dhz0Var) {
        nuy0 nuy0Var = this.e;
        igz0.a aVar = this.d;
        if (xey0Var != null) {
            fiz0 d = wn4.d(dhz0Var);
            nuy0Var.getClass();
            aVar.b(xey0Var, null, i, d, nuy0Var.getContext());
        } else {
            fiz0 d2 = wn4.d(dhz0Var);
            nuy0Var.getClass();
            aVar.b(this.b, null, i, d2, nuy0Var.getContext());
        }
    }

    public final void b(z9z0 z9z0Var) {
        boolean z = this.j;
        tez0 tez0Var = this.b;
        if (z) {
            a(tez0Var, 1, tez0Var.T.c ? new viy0(8192, z9z0Var) : new akz0());
            return;
        }
        if (this.r) {
            if (this.c.d) {
                a(null, 1, tez0Var.T.c ? new viy0(8, z9z0Var) : new akz0());
                return;
            }
            return;
        }
        nuy0 nuy0Var = this.e;
        nuy0Var.d(true);
        nuy0Var.a(1, null);
        nuy0Var.e(false);
        o();
        this.i.postDelayed(this.k, 4000L);
        this.q = true;
    }

    public final void c(boolean z) {
        oly0 oly0Var = this.b.a0;
        int i = oly0Var.g;
        int argb = Color.argb((int) (oly0Var.j * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        if (z) {
            i = argb;
        }
        this.e.setPanelColor(i);
    }

    @Override // xsna.jaz0
    public final void destroy() {
        vez0 vez0Var = this.l;
        if (vez0Var != null) {
            vez0Var.d();
            vez0Var.d.destroy();
            vez0Var.e.b();
        }
        o();
    }

    public final void f() {
        wty0 wty0Var = this.b.L;
        if (wty0Var == null) {
            return;
        }
        o();
        fvy0 fvy0Var = this.m;
        if (fvy0Var == null || !fvy0Var.c()) {
            nuy0 nuy0Var = this.e;
            nuy0Var.getClass();
            Context context = nuy0Var.getContext();
            fvy0 fvy0Var2 = this.m;
            if (fvy0Var2 == null) {
                de.L(wty0Var.b, null, null, null, context);
            } else {
                fvy0Var2.b(context);
            }
        }
    }

    public final void g(z9z0 z9z0Var) {
        if (this.j) {
            tez0 tez0Var = this.b;
            a(tez0Var, 1, tez0Var.T.c ? new viy0(8192, z9z0Var) : new akz0());
            return;
        }
        boolean z = this.q;
        if (z && z) {
            o();
            nuy0 nuy0Var = this.e;
            nuy0Var.d(false);
            nuy0Var.f();
            this.q = false;
        }
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        return this.e.getCloseButton();
    }

    public final void h() {
        nuy0 nuy0Var = this.e;
        nuy0Var.d(false);
        nuy0Var.b(true);
        nuy0Var.f();
        nuy0Var.e(false);
        nuy0Var.b.setVisibility(8);
        this.g.setVisible(false);
        m();
    }

    @Override // xsna.jaz0
    public final View i() {
        nuy0 nuy0Var = this.e;
        nuy0Var.getClass();
        return nuy0Var;
    }

    public final void j() {
        vez0 vez0Var = this.l;
        if (vez0Var != null) {
            kwy0 kwy0Var = vez0Var.g;
            loy0 loy0Var = vez0Var.d;
            if (loy0Var.isPlaying()) {
                vez0Var.d();
                kwy0Var.k();
            } else if (loy0Var.getPosition() > 0) {
                vez0Var.i();
                kwy0Var.n();
            } else {
                vez0Var.e();
            }
        }
        o();
    }

    public final void k() {
        vez0 vez0Var = this.l;
        if (vez0Var != null) {
            vez0Var.d.a();
            vez0Var.g.f(!r1.c());
        }
    }

    public final void l() {
        nuy0 nuy0Var = this.e;
        nuy0Var.d(true);
        nuy0Var.f();
        nuy0Var.b(false);
        nuy0Var.e(true);
        this.g.setVisible(true);
    }

    public final void m() {
        nuy0 nuy0Var = this.e;
        nuy0Var.d.setVisibility(0);
        nuy0Var.u.setVisibility(8);
        igz0.a aVar = this.d;
        aVar.a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.i.removeCallbacks(this.f);
        this.n = a.a;
        aVar.e();
        aVar.a.j = true;
    }

    public final void n() {
        Handler handler = this.i;
        iv1 iv1Var = this.f;
        handler.removeCallbacks(iv1Var);
        handler.postDelayed(iv1Var, 200L);
        this.d.a(this.o / 1000.0d);
        float f = this.p;
        long j = this.o;
        float f2 = (f - j) / f;
        int i = (int) ((j / 1000) + 1);
        ldy0 ldy0Var = this.e.u;
        ldy0Var.setDigit(i);
        ldy0Var.setProgress(f2);
    }

    public final void o() {
        this.q = false;
        this.i.removeCallbacks(this.k);
    }

    @Override // xsna.jaz0
    public final void pause() {
        vez0 vez0Var = this.l;
        if (vez0Var != null) {
            vez0Var.d();
        }
        this.i.removeCallbacks(this.f);
        o();
    }

    @Override // xsna.jaz0
    public final void resume() {
        if (this.n != a.a && this.o > 0) {
            n();
        }
        o();
        lgz0 lgz0Var = this.b.c0;
        vez0 vez0Var = this.l;
        if (vez0Var == null || lgz0Var == null || !lgz0Var.h0 || this.s) {
            return;
        }
        vez0Var.i();
    }

    @Override // xsna.jaz0
    public final void stop() {
        vez0 vez0Var = this.l;
        if (vez0Var != null) {
            vez0Var.d();
        }
        o();
    }
}
