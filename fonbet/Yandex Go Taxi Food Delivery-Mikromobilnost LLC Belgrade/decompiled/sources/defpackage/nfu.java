package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class nfu extends ConstraintWidget implements lfu {
    public ConstraintWidget[] u0 = new ConstraintWidget[4];
    public int v0 = 0;

    public final void T(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.v0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.u0;
        if (i > constraintWidgetArr.length) {
            this.u0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.u0;
        int i2 = this.v0;
        constraintWidgetArr2[i2] = constraintWidget;
        this.v0 = i2 + 1;
    }

    public final void U(int i, c351 c351Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.v0; i2++) {
            c351Var.a(this.u0[i2]);
        }
        for (int i3 = 0; i3 < this.v0; i3++) {
            g3u.a(this.u0[i3], i, arrayList, c351Var);
        }
    }

    public void a() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void h(ConstraintWidget constraintWidget, HashMap hashMap) {
        super.h(constraintWidget, hashMap);
        nfu nfuVar = (nfu) constraintWidget;
        this.v0 = 0;
        int i = nfuVar.v0;
        for (int i2 = 0; i2 < i; i2++) {
            T((ConstraintWidget) hashMap.get(nfuVar.u0[i2]));
        }
    }
}
