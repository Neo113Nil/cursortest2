package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g151 extends ConstraintWidget {
    public ArrayList u0 = new ArrayList();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void E() {
        this.u0.clear();
        super.E();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void H(ua7 ua7Var) {
        super.H(ua7Var);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.u0.get(i)).H(ua7Var);
        }
    }

    public void T() {
        ArrayList arrayList = this.u0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.u0.get(i);
            if (constraintWidget instanceof g151) {
                ((g151) constraintWidget).T();
            }
        }
    }
}
