package xsna;

import androidx.recyclerview.widget.m;
import xsna.xha0;

/* compiled from: PickerItem.kt */
/* loaded from: classes16.dex */
public final class rxm extends m.e<xha0> {
    public final boolean a;

    public rxm(boolean z) {
        this.a = z;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(xha0 xha0Var, xha0 xha0Var2) {
        xha0 xha0Var3 = xha0Var;
        xha0 xha0Var4 = xha0Var2;
        if (!this.a || xha0Var3.a() == xha0Var4.a()) {
            return ((xha0Var3 instanceof xha0.b) && (xha0Var4 instanceof xha0.b)) ? epx.f(((xha0.b) xha0Var3).c, ((xha0.b) xha0Var4).c) : (xha0Var3 instanceof xha0.a) && (xha0Var4 instanceof xha0.a);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(xha0 xha0Var, xha0 xha0Var2) {
        xha0 xha0Var3 = xha0Var;
        xha0 xha0Var4 = xha0Var2;
        if ((xha0Var3 instanceof xha0.b) && (xha0Var4 instanceof xha0.b)) {
            return true;
        }
        return (xha0Var3 instanceof xha0.a) && (xha0Var4 instanceof xha0.a);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(xha0 xha0Var, xha0 xha0Var2) {
        return (!this.a || xha0Var.a() == xha0Var2.a()) ? s3q0.a : fei0.a;
    }
}
