package defpackage;

import android.content.Context;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;

/* loaded from: classes6.dex */
public final class ksx0 implements v7p {
    public final n3w a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final n3w g;
    public final xvf0 h;

    public ksx0(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, n3w n3wVar2, xvf0 xvf0Var6) {
        this.a = n3wVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = n3wVar2;
        this.h = xvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new TariffsRibbonView((Context) this.a.a, (xrx0) this.b.get(), (wrx0) this.c.get(), (a.InterfaceC0113a) this.d.get(), (nex0) this.e.get(), (bbx0) this.f.get(), (qr31) this.g.a, ((Boolean) this.h.get()).booleanValue());
    }
}
