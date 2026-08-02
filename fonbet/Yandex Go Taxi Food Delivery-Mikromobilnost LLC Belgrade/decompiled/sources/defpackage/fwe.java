package defpackage;

import ru.yandex.taxi.costcenters.base.CostCenterBaseModalView;

/* loaded from: classes5.dex */
public abstract class fwe extends ad5 {
    public final uwe x;
    public final hwe y;

    public fwe(Class cls, uwe uweVar, hwe hweVar) {
        super(cls);
        this.x = uweVar;
        this.y = hweVar;
    }

    public final void Kg(CostCenterBaseModalView costCenterBaseModalView) {
        Bg(costCenterBaseModalView);
        String str = this.x.c.b;
        if (!evu0.J(str)) {
            ((ewe) Dg()).setTitle(str);
        }
        hwe hweVar = this.y;
        if (evu0.J(hweVar.r0())) {
            return;
        }
        ((ewe) Dg()).setButtonText(hweVar.r0());
    }

    public final void Lg() {
        if (Mg()) {
            Ng();
            this.y.q0();
            ((ewe) Dg()).dismiss();
        }
    }

    public abstract boolean Mg();

    public abstract void Ng();
}
