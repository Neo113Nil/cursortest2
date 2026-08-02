package defpackage;

import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;

/* loaded from: classes3.dex */
public final class hkg extends h {
    public static boolean z(x0 x0Var) {
        return x0Var.a.getId() == wah0.dashboardSingleCardItemContainer;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean o(x0 x0Var) {
        if (z(x0Var)) {
            s(x0Var);
            return false;
        }
        super.o(x0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean p(x0 x0Var, x0 x0Var2, int i, int i2, int i3, int i4) {
        if (!z(x0Var) && (x0Var2 == null || !z(x0Var2))) {
            return super.p(x0Var, x0Var2, i, i2, i3, i4);
        }
        x0Var.a.setAlpha(1.0f);
        h(x0Var);
        if (x0Var2 == null) {
            return false;
        }
        x0Var2.a.setAlpha(1.0f);
        h(x0Var2);
        return false;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean q(x0 x0Var, int i, int i2, int i3, int i4) {
        if (!z(x0Var)) {
            return super.q(x0Var, i, i2, i3, i4);
        }
        h(x0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean r(x0 x0Var) {
        if (z(x0Var)) {
            h(x0Var);
            return false;
        }
        super.r(x0Var);
        return true;
    }
}
