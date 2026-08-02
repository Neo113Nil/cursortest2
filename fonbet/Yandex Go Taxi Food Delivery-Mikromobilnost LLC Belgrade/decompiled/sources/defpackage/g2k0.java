package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import ru.yandex.taxi.multiorder.ReturnWithBackButton$start$$inlined$safeCollectIn$1;
import ru.yandex.taxi.statebar.a;

/* loaded from: classes9.dex */
public final class g2k0 implements jf4 {
    public final tse a;
    public final g b;
    public final nid c;
    public pzt0 d;
    public final gci0 e;

    public g2k0(tse tseVar, g gVar, nid nidVar) {
        this.a = tseVar;
        this.b = gVar;
        this.c = nidVar;
        this.e = nidVar.b;
    }

    @Override // defpackage.jf4
    public final g18 a(gf4 gf4Var) {
        return g18.u1;
    }

    @Override // defpackage.jf4
    public final void b(a aVar) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = tje.N(this.a, null, null, new ReturnWithBackButton$start$$inlined$safeCollectIn$1(this.b.h(), null, this), 3);
    }

    @Override // defpackage.jf4
    public final gci0 c() {
        return this.e;
    }

    @Override // defpackage.jf4
    public final void d(boolean z) {
        this.c.a(z);
    }

    @Override // defpackage.jf4
    public final void stop() {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = null;
    }
}
