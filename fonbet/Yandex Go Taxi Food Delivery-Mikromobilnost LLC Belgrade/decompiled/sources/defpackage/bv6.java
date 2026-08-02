package defpackage;

import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.superapp.orders.multi.BundledOrderOverlay$start$$inlined$safeCollectIn$1;
import ru.yandex.taxi.superapp.orders.multi.c;

/* loaded from: classes6.dex */
public final class bv6 implements n080, l390 {
    public boolean A;
    public boolean B;
    public int C;
    public final List D = Collections.singletonList(SuperAppRecenterPointRepository$Type.EATS);
    public final hbp0 E = new hbp0(new czo0(14), "", null);
    public final ah00 a;
    public final bz70 b;
    public final wor0 c;
    public final y980 w;
    public final h080 x;
    public final cz70 y;
    public final m180 z;

    public bv6(ah00 ah00Var, bz70 bz70Var, wor0 wor0Var, y980 y980Var, h080 h080Var, cz70 cz70Var, m180 m180Var) {
        this.a = ah00Var;
        this.b = bz70Var;
        this.c = wor0Var;
        this.w = y980Var;
        this.x = h080Var;
        this.y = cz70Var;
        this.z = m180Var;
    }

    @Override // defpackage.n080
    public final void A0(boolean z) {
    }

    @Override // defpackage.n080
    public final void Q(ro21 ro21Var, ro21 ro21Var2) {
    }

    @Override // defpackage.n080
    public final void a(boolean z) {
        if (this.A) {
            return;
        }
        this.A = true;
        hbp0 hbp0Var = this.E;
        hbp0Var.a();
        ((n6w0) this.c.a).d(this.D);
        tje.N(hbp0Var, null, null, new BundledOrderOverlay$start$$inlined$safeCollectIn$1(new c(e.t(((n180) this.z).b)), null, this), 3);
        this.w.a(true);
        gh00 gh00Var = (gh00) this.a;
        gh00Var.p(this);
        gh00Var.l();
    }

    @Override // defpackage.n080
    public final void b() {
        ArrayList b;
        BoundingBox g;
        ScreenRect a = this.y.a(this.C, this.x.c, 0);
        gh00 gh00Var = (gh00) this.a;
        gh00Var.a.g(this, a, false, 200L);
        n6w0 n6w0Var = (n6w0) this.c.a;
        List list = this.D;
        if (list != null) {
            b = n6w0Var.b(list);
        } else {
            ArrayList arrayList = n6w0Var.c;
            b = !arrayList.isEmpty() ? n6w0Var.b(arrayList) : n6w0Var.a();
        }
        if (b.isEmpty()) {
            g = null;
        } else {
            fi6 fi6Var = new fi6();
            fi6Var.e(b);
            g = fi6Var.g();
        }
        if (g != null) {
            gh00Var.g.h(g, null, null, null);
        }
    }

    @Override // defpackage.n080
    public final void d(boolean z) {
        this.B = false;
    }

    @Override // defpackage.n080
    public final void disableFocusOnPinWhenZooming() {
    }

    @Override // defpackage.n080
    public final void resume() {
        b();
        this.B = true;
    }

    @Override // defpackage.n080
    public final void stop() {
        this.A = false;
        this.E.b();
        ((n6w0) this.c.a).d(null);
        bz70 bz70Var = this.b;
        bz70Var.c.cancel();
        bz70Var.d.b();
        bz70Var.f.clear();
        gh00 gh00Var = (gh00) this.a;
        if (gh00Var.a.e(this)) {
            gh00Var.r(this);
        }
    }
}
