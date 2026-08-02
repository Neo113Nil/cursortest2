package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.VirtualLayout;
import defpackage.lfu;
import defpackage.p3c0;

/* loaded from: classes10.dex */
public class MotionPlaceholder extends VirtualLayout {
    private static final String TAG = "MotionPlaceholder";
    p3c0 mPlaceholder;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mHelperWidget = new p3c0();
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            iVar.V(mode, size, mode2, size2);
            setMeasuredDimension(iVar.D0, iVar.E0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreLayout(d dVar, lfu lfuVar, SparseArray<ConstraintWidget> sparseArray) {
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        onMeasure(this.mPlaceholder, i, i2);
    }
}
