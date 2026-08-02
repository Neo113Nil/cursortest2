package defpackage;

import ru.yandex.taxi.layers.domain.u;
import ru.yandex.taxi.layers.presentation.PolylinesPresenter$onResume$$inlined$safeCollectIn$1;

/* loaded from: classes9.dex */
public final class k5e0 extends ad5 {
    public final u x;
    public pzt0 y;

    public k5e0(u uVar) {
        super(h5e0.class);
        this.x = uVar;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.y;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        this.y = tje.N(Jg(), null, null, new PolylinesPresenter$onResume$$inlined$safeCollectIn$1(this.x.b(), null, this), 3);
    }
}
