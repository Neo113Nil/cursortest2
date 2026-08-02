package defpackage;

import ru.yandex.taxi.layers.domain.r;
import ru.yandex.taxi.layers.presentation.PolygonsPresenter$onResume$$inlined$safeCollectIn$1;

/* loaded from: classes9.dex */
public final class c4e0 extends ad5 {
    public pzt0 A;
    public final r x;
    public final z2e0 y;
    public final p3e0 z;

    public c4e0(r rVar, z2e0 z2e0Var, p3e0 p3e0Var) {
        super(w3e0.class);
        this.x = rVar;
        this.y = z2e0Var;
        this.z = p3e0Var;
    }

    public static final void Kg(c4e0 c4e0Var, fxe0 fxe0Var) {
        if (fxe0Var instanceof u7s0) {
            ((w3e0) c4e0Var.Dg()).P(((u7s0) fxe0Var).a);
            String str = c4e0Var.z.a;
            if (str != null) {
                ((w3e0) c4e0Var.Dg()).S9(str);
                return;
            }
            return;
        }
        if (fxe0Var instanceof r0c) {
            ((w3e0) c4e0Var.Dg()).hide();
            return;
        }
        if (fxe0Var instanceof tdq0) {
            tdq0 tdq0Var = (tdq0) fxe0Var;
            c4e0Var.z.a = tdq0Var.a();
            ((w3e0) c4e0Var.Dg()).S9(tdq0Var.a());
            return;
        }
        if (!(fxe0Var instanceof kyi)) {
            c4e0Var.getClass();
        } else {
            c4e0Var.z.a = null;
            ((w3e0) c4e0Var.Dg()).d5(((kyi) fxe0Var).a());
        }
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        this.A = tje.N(Jg(), null, null, new PolygonsPresenter$onResume$$inlined$safeCollectIn$1(this.x.b(), null, this), 3);
    }
}
