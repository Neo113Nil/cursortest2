package defpackage;

import android.content.Context;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.DoubleTariffRibbonView;

/* loaded from: classes6.dex */
public final class p6m implements v7p {
    public final n3w a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final l6m e;
    public final xvf0 f;
    public final xvf0 g;

    public p6m(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, l6m l6mVar, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = n3wVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = l6mVar;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new DoubleTariffRibbonView((Context) this.a.a, (lk31) this.b.get(), (sf31) this.c.get(), (a.InterfaceC0113a) this.d.get(), (k6m) this.e.get(), (qr31) this.f.get(), (nex0) this.g.get());
    }
}
