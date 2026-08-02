package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes11.dex */
public final class ibp0 implements mhl0 {
    public final oz40 a;

    public ibp0(oz40 oz40Var) {
        this.a = oz40Var;
    }

    @Override // defpackage.mhl0
    public final f530 a(f530 f530Var, float f, boolean z) {
        if (f <= 0.0d) {
            gxv.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return f530Var.k(new x2y(f, z));
    }

    @Override // defpackage.mhl0
    public final f530 b(f530 f530Var, to5 to5Var) {
        return f530Var.k(new pa31(to5Var));
    }

    public final SlotSize c() {
        return (SlotSize) this.a.getValue();
    }
}
