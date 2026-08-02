package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.e;
import defpackage.nfu;
import defpackage.z3i0;

/* loaded from: classes10.dex */
public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private f mFlow;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mFlow = new f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z3i0.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.ConstraintLayout_Layout_android_orientation) {
                    this.mFlow.Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_android_padding) {
                    f fVar = this.mFlow;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar.w0 = dimensionPixelSize;
                    fVar.x0 = dimensionPixelSize;
                    fVar.y0 = dimensionPixelSize;
                    fVar.z0 = dimensionPixelSize;
                } else if (index == z3i0.ConstraintLayout_Layout_android_paddingStart) {
                    f fVar2 = this.mFlow;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar2.y0 = dimensionPixelSize2;
                    fVar2.A0 = dimensionPixelSize2;
                    fVar2.B0 = dimensionPixelSize2;
                } else if (index == z3i0.ConstraintLayout_Layout_android_paddingEnd) {
                    this.mFlow.z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_android_paddingLeft) {
                    this.mFlow.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_android_paddingTop) {
                    this.mFlow.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_android_paddingRight) {
                    this.mFlow.B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_android_paddingBottom) {
                    this.mFlow.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_wrapMode) {
                    this.mFlow.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.mFlow.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.mFlow.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.mFlow.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.mFlow.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.mFlow.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.mFlow.M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.mFlow.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.mFlow.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.mFlow.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.mFlow.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.mFlow.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_verticalBias) {
                    this.mFlow.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.mFlow.V0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.mFlow.W0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.mFlow.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_verticalGap) {
                    this.mFlow.U0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == z3i0.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.mFlow.Y0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mFlow;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(e.a aVar, nfu nfuVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(aVar, nfuVar, layoutParams, sparseArray);
        if (nfuVar instanceof f) {
            f fVar = (f) nfuVar;
            int i = layoutParams.orientation;
            if (i != -1) {
                fVar.Z0 = i;
            }
        }
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
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        f fVar = this.mFlow;
        int i = fVar.y0;
        if (i > 0 || fVar.z0 > 0) {
            if (z) {
                fVar.A0 = fVar.z0;
                fVar.B0 = i;
            } else {
                fVar.A0 = i;
                fVar.B0 = fVar.z0;
            }
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.mFlow.P0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.mFlow.J0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.mFlow.Q0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.mFlow.K0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.mFlow.V0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.mFlow.N0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.mFlow.T0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.mFlow.H0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.mFlow.R0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.mFlow.L0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.mFlow.S0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.mFlow.M0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.mFlow.Y0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.mFlow.Z0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        f fVar = this.mFlow;
        fVar.w0 = i;
        fVar.x0 = i;
        fVar.y0 = i;
        fVar.z0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.mFlow.x0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.mFlow.A0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.mFlow.B0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.mFlow.w0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.mFlow.W0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.mFlow.O0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.mFlow.U0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.mFlow.I0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.mFlow.X0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        onMeasure(this.mFlow, i, i2);
    }
}
