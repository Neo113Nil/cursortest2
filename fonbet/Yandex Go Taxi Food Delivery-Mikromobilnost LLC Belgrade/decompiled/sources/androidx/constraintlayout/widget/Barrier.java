package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import defpackage.nfu;
import defpackage.z3i0;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private androidx.constraintlayout.core.widgets.a mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void updateType(ConstraintWidget constraintWidget, int i, boolean z) {
        this.mResolvedType = i;
        int i2 = this.mIndicatedType;
        if (z) {
            if (i2 == 5) {
                this.mResolvedType = 1;
            } else if (i2 == 6) {
                this.mResolvedType = 0;
            }
        } else if (i2 == 5) {
            this.mResolvedType = 0;
        } else if (i2 == 6) {
            this.mResolvedType = 1;
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).w0 = this.mResolvedType;
        }
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mBarrier.x0;
    }

    public boolean getAllowsGoneWidget() {
        return this.mBarrier.x0;
    }

    public int getMargin() {
        return this.mBarrier.y0;
    }

    public int getType() {
        return this.mIndicatedType;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mBarrier = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z3i0.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == z3i0.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.x0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == z3i0.ConstraintLayout_Layout_barrierMargin) {
                    this.mBarrier.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(e.a aVar, nfu nfuVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(aVar, nfuVar, layoutParams, sparseArray);
        if (nfuVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) nfuVar;
            updateType(aVar2, aVar.e.g0, ((androidx.constraintlayout.core.widgets.d) nfuVar.V).z0);
            e.b bVar = aVar.e;
            aVar2.x0 = bVar.o0;
            aVar2.y0 = bVar.h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        updateType(constraintWidget, this.mIndicatedType, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mBarrier.x0 = z;
    }

    public void setDpMargin(int i) {
        this.mBarrier.y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.mBarrier.y0 = i;
    }

    public void setType(int i) {
        this.mIndicatedType = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
