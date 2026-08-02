package xsna;

import kotlin.Lazy;
import xsna.gm50;

/* compiled from: SessionRoomsFeatureRenderer.kt */
/* loaded from: classes7.dex */
public final class vwi0 implements gm50 {
    public final Lazy b;

    public vwi0(ywi0 ywi0Var, Lazy<? extends f5z> lazy, kxi0 kxi0Var) {
        this.b = lazy;
        gm50.a.b(this, ywi0Var.a, new twi0(0, this, kxi0Var));
        gm50.a.b(this, ywi0Var.b, new uwi0(0, this, kxi0Var));
        gm50.a.b(this, ywi0Var.c, new n7b0(kxi0Var, 6));
        gm50.a.b(this, ywi0Var.d, new w110(kxi0Var, 26));
        gm50.a.b(this, ywi0Var.e, new o6i0(1, this, kxi0Var));
        gm50.a.b(this, ywi0Var.f, new r770(6, this, kxi0Var));
        gm50.a.b(this, ywi0Var.g, new j20(24, this, kxi0Var));
        gm50.a.b(this, ywi0Var.h, new aq1(20, this, kxi0Var));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return (f5z) this.b.getValue();
    }
}
