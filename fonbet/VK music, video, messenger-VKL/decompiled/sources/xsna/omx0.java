package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class omx0 extends ConstraintWidget {
    public ArrayList<ConstraintWidget> v0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void H() {
        this.v0.clear();
        super.H();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void K(jv8 jv8Var) {
        super.K(jv8Var);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            this.v0.get(i).K(jv8Var);
        }
    }

    public void Z() {
        ArrayList<ConstraintWidget> arrayList = this.v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.v0.get(i);
            if (constraintWidget instanceof omx0) {
                ((omx0) constraintWidget).Z();
            }
        }
    }

    public final void c(ConstraintWidget constraintWidget) {
        this.v0.add(constraintWidget);
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        if (constraintWidget2 != null) {
            ((omx0) constraintWidget2).v0.remove(constraintWidget);
            constraintWidget.H();
        }
        constraintWidget.W = this;
    }
}
