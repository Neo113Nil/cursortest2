package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class e2v extends ConstraintWidget implements a2v {
    public ConstraintWidget[] v0 = new ConstraintWidget[4];
    public int w0 = 0;

    public final void Z(int i, ArrayList arrayList, cnx0 cnx0Var) {
        for (int i2 = 0; i2 < this.w0; i2++) {
            cnx0Var.a(this.v0[i2]);
        }
        for (int i3 = 0; i3 < this.w0; i3++) {
            oou.a(this.v0[i3], i, arrayList, cnx0Var);
        }
    }

    @Override // xsna.a2v
    public final void a() {
        this.w0 = 0;
        Arrays.fill(this.v0, (Object) null);
    }

    @Override // xsna.a2v
    public final void c(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.w0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.v0;
        if (i > constraintWidgetArr.length) {
            this.v0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.v0;
        int i2 = this.w0;
        constraintWidgetArr2[i2] = constraintWidget;
        this.w0 = i2 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        e2v e2vVar = (e2v) constraintWidget;
        this.w0 = 0;
        int i = e2vVar.w0;
        for (int i2 = 0; i2 < i; i2++) {
            c(hashMap.get(e2vVar.v0[i2]));
        }
    }

    public void b() {
    }
}
