package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.i;
import defpackage.ae5;
import defpackage.aqr0;
import defpackage.be5;
import defpackage.g151;
import defpackage.ijy;
import defpackage.k7e;
import defpackage.lfu;
import defpackage.n89;
import defpackage.ny61;
import defpackage.o4u;
import defpackage.o8e;
import defpackage.oc20;
import defpackage.z3i0;
import defpackage.zwi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static aqr0 sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected k7e mConstraintLayoutSpec;
    private e mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.d mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    b mMeasurer;
    private oc20 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<c> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static aqr0 getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new aqr0();
        }
        return sSharedValues;
    }

    private ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mWidget;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        dVar.h0 = this;
        b bVar = this.mMeasurer;
        dVar.y0 = bVar;
        dVar.w0.f = bVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z3i0.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == z3i0.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == z3i0.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == z3i0.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == z3i0.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == z3i0.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == z3i0.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == z3i0.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.mConstraintSet = eVar;
                        eVar.q(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.mLayoutWidget;
        dVar2.I0 = this.mOptimizationLevel;
        ijy.q = dVar2.Y(512);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        ConstraintLayout constraintLayout;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.E();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).k0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.mConstraintSet;
        if (eVar != null) {
            eVar.c(this);
        }
        this.mLayoutWidget.u0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        int i7 = 0;
        while (i7 < childCount) {
            View childAt5 = this.getChildAt(i7);
            ConstraintWidget viewWidget2 = this.getViewWidget(childAt5);
            if (viewWidget2 == null) {
                constraintLayout = this;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
                dVar.u0.add(viewWidget2);
                ConstraintWidget constraintWidget = viewWidget2.V;
                if (constraintWidget != null) {
                    ((g151) constraintWidget).u0.remove(viewWidget2);
                    viewWidget2.E();
                }
                viewWidget2.V = dVar;
                constraintLayout = this;
                constraintLayout.applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
            i7++;
            this = constraintLayout;
        }
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor$Type constraintAnchor$Type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.mNeedsBaseline = true;
        ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.BASELINE;
        if (constraintAnchor$Type == constraintAnchor$Type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.mNeedsBaseline = true;
            layoutParams2.mWidget.E = true;
        }
        constraintWidget.k(constraintAnchor$Type2).b(constraintWidget2.k(constraintAnchor$Type), layoutParams.baselineMargin, layoutParams.goneBaselineMargin, true);
        constraintWidget.E = true;
        constraintWidget.k(ConstraintAnchor$Type.TOP).j();
        constraintWidget.k(ConstraintAnchor$Type.BOTTOM).j();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void addValueModifier(c cVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02d5 -> B:80:0x02d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        float f;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        LayoutParams layoutParams2;
        ConstraintWidget constraintWidget6;
        float f2;
        int i2;
        float f3;
        int i3;
        float f4;
        ConstraintWidget constraintWidget7 = constraintWidget;
        layoutParams.validate();
        layoutParams.helped = false;
        constraintWidget7.i0 = view.getVisibility();
        if (layoutParams.mIsInPlaceholder) {
            constraintWidget7.F = true;
            constraintWidget7.i0 = 8;
        }
        constraintWidget7.h0 = view;
        if (view instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) view).resolveRtl(constraintWidget7, constraintLayout.mLayoutWidget.z0);
        } else {
            constraintLayout = this;
        }
        int i4 = -1;
        if (layoutParams.mIsGuideline) {
            g gVar = (g) constraintWidget7;
            int i5 = layoutParams.mResolvedGuideBegin;
            int i6 = layoutParams.mResolvedGuideEnd;
            float f5 = layoutParams.mResolvedGuidePercent;
            if (f5 != -1.0f) {
                if (f5 > -1.0f) {
                    gVar.u0 = f5;
                    gVar.v0 = -1;
                    gVar.w0 = -1;
                    return;
                }
                return;
            }
            if (i5 != -1) {
                if (i5 > -1) {
                    gVar.u0 = -1.0f;
                    gVar.v0 = i5;
                    gVar.w0 = -1;
                    return;
                }
                return;
            }
            if (i6 == -1 || i6 <= -1) {
                return;
            }
            gVar.u0 = -1.0f;
            gVar.v0 = -1;
            gVar.w0 = i6;
            return;
        }
        int i7 = layoutParams.mResolvedLeftToLeft;
        int i8 = layoutParams.mResolvedLeftToRight;
        int i9 = layoutParams.mResolvedRightToLeft;
        int i10 = layoutParams.mResolvedRightToRight;
        int i11 = layoutParams.mResolveGoneLeftMargin;
        int i12 = layoutParams.mResolveGoneRightMargin;
        float f6 = layoutParams.mResolvedHorizontalBias;
        int i13 = layoutParams.circleConstraint;
        if (i13 != -1) {
            ConstraintWidget constraintWidget8 = sparseArray.get(i13);
            if (constraintWidget8 != null) {
                float f7 = layoutParams.circleAngle;
                int i14 = layoutParams.circleRadius;
                ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.CENTER;
                f4 = 0.0f;
                constraintWidget.x(constraintAnchor$Type, constraintWidget8, constraintAnchor$Type, i14, 0);
                constraintWidget7 = constraintWidget;
                constraintWidget7.D = f7;
            } else {
                f4 = 0.0f;
            }
            constraintWidget6 = constraintWidget7;
            layoutParams2 = layoutParams;
            i = 1;
            f = f4;
        } else {
            if (i7 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i7);
                if (constraintWidget9 != null) {
                    ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.LEFT;
                    i = 1;
                    f = 0.0f;
                    constraintWidget.x(constraintAnchor$Type2, constraintWidget9, constraintAnchor$Type2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
                } else {
                    i = 1;
                    f = 0.0f;
                }
            } else {
                i = 1;
                f = 0.0f;
                if (i8 != -1 && (constraintWidget2 = sparseArray.get(i8)) != null) {
                    constraintWidget.x(ConstraintAnchor$Type.LEFT, constraintWidget2, ConstraintAnchor$Type.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
                }
            }
            if (i9 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i9);
                if (constraintWidget10 != null) {
                    constraintWidget.x(ConstraintAnchor$Type.RIGHT, constraintWidget10, ConstraintAnchor$Type.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
                }
            } else if (i10 != -1 && (constraintWidget3 = sparseArray.get(i10)) != null) {
                ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.RIGHT;
                constraintWidget.x(constraintAnchor$Type3, constraintWidget3, constraintAnchor$Type3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
            }
            int i15 = layoutParams.topToTop;
            if (i15 != -1) {
                ConstraintWidget constraintWidget11 = sparseArray.get(i15);
                if (constraintWidget11 != null) {
                    ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.TOP;
                    constraintWidget.x(constraintAnchor$Type4, constraintWidget11, constraintAnchor$Type4, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.goneTopMargin);
                }
            } else {
                int i16 = layoutParams.topToBottom;
                if (i16 != -1 && (constraintWidget4 = sparseArray.get(i16)) != null) {
                    constraintWidget.x(ConstraintAnchor$Type.TOP, constraintWidget4, ConstraintAnchor$Type.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.goneTopMargin);
                }
            }
            int i17 = layoutParams.bottomToTop;
            if (i17 != -1) {
                ConstraintWidget constraintWidget12 = sparseArray.get(i17);
                if (constraintWidget12 != null) {
                    constraintWidget.x(ConstraintAnchor$Type.BOTTOM, constraintWidget12, ConstraintAnchor$Type.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.goneBottomMargin);
                }
            } else {
                int i18 = layoutParams.bottomToBottom;
                if (i18 != -1 && (constraintWidget5 = sparseArray.get(i18)) != null) {
                    ConstraintAnchor$Type constraintAnchor$Type5 = ConstraintAnchor$Type.BOTTOM;
                    constraintWidget.x(constraintAnchor$Type5, constraintWidget5, constraintAnchor$Type5, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.goneBottomMargin);
                }
            }
            int i19 = layoutParams.baselineToBaseline;
            if (i19 != -1) {
                layoutParams2 = layoutParams;
                constraintLayout.setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i19, ConstraintAnchor$Type.BASELINE);
            } else {
                layoutParams2 = layoutParams;
                int i20 = layoutParams2.baselineToTop;
                if (i20 != -1) {
                    setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i20, ConstraintAnchor$Type.TOP);
                } else {
                    int i21 = layoutParams2.baselineToBottom;
                    if (i21 != -1) {
                        setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i21, ConstraintAnchor$Type.BOTTOM);
                        constraintWidget6 = constraintWidget;
                        if (f6 >= f) {
                            constraintWidget6.f0 = f6;
                        }
                        f2 = layoutParams2.verticalBias;
                        if (f2 >= f) {
                            constraintWidget6.g0 = f2;
                        }
                    }
                }
            }
            constraintWidget6 = constraintWidget;
            if (f6 >= f) {
            }
            f2 = layoutParams2.verticalBias;
            if (f2 >= f) {
            }
        }
        if (z && ((i3 = layoutParams2.editorAbsoluteX) != -1 || layoutParams2.editorAbsoluteY != -1)) {
            int i22 = layoutParams2.editorAbsoluteY;
            constraintWidget6.a0 = i3;
            constraintWidget6.b0 = i22;
        }
        if (layoutParams2.mHorizontalDimensionFixed) {
            constraintWidget6.O(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.Q(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                constraintWidget6.O(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.constrainedWidth) {
                constraintWidget6.O(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.O(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.k(ConstraintAnchor$Type.LEFT).g = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            constraintWidget6.k(ConstraintAnchor$Type.RIGHT).g = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            constraintWidget6.O(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.Q(0);
        }
        if (layoutParams2.mVerticalDimensionFixed) {
            constraintWidget6.P(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.N(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                constraintWidget6.P(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.constrainedHeight) {
                constraintWidget6.P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.P(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.k(ConstraintAnchor$Type.TOP).g = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            constraintWidget6.k(ConstraintAnchor$Type.BOTTOM).g = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            constraintWidget6.P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.N(0);
        }
        String str = layoutParams2.dimensionRatio;
        if (str == null || str.length() == 0) {
            constraintWidget6.Y = f;
        } else {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf <= 0 || indexOf >= length - 1) {
                i2 = 0;
            } else {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i4 = 0;
                } else if (substring.equalsIgnoreCase(CA20Status.STATUS_CERTIFICATE_H)) {
                    i4 = i;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f3 = Float.parseFloat(substring2);
                }
                f3 = f;
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > f && parseFloat2 > f) {
                        f3 = i4 == i ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                f3 = f;
            }
            if (f3 > f) {
                constraintWidget6.Y = f3;
                constraintWidget6.Z = i4;
            }
        }
        float f8 = layoutParams2.horizontalWeight;
        float[] fArr = constraintWidget6.n0;
        fArr[0] = f8;
        fArr[1] = layoutParams2.verticalWeight;
        constraintWidget6.l0 = layoutParams2.horizontalChainStyle;
        constraintWidget6.m0 = layoutParams2.verticalChainStyle;
        int i23 = layoutParams2.wrapBehaviorInParent;
        if (i23 >= 0 && i23 <= 3) {
            constraintWidget6.q = i23;
        }
        int i24 = layoutParams2.matchConstraintDefaultWidth;
        int i25 = layoutParams2.matchConstraintMinWidth;
        int i26 = layoutParams2.matchConstraintMaxWidth;
        float f9 = layoutParams2.matchConstraintPercentWidth;
        constraintWidget6.r = i24;
        constraintWidget6.u = i25;
        if (i26 == Integer.MAX_VALUE) {
            i26 = 0;
        }
        constraintWidget6.v = i26;
        constraintWidget6.w = f9;
        if (f9 > f && f9 < 1.0f && i24 == 0) {
            constraintWidget6.r = 2;
        }
        int i27 = layoutParams2.matchConstraintDefaultHeight;
        int i28 = layoutParams2.matchConstraintMinHeight;
        int i29 = layoutParams2.matchConstraintMaxHeight;
        float f10 = layoutParams2.matchConstraintPercentHeight;
        constraintWidget6.s = i27;
        constraintWidget6.x = i28;
        constraintWidget6.y = i29 != Integer.MAX_VALUE ? i29 : 0;
        constraintWidget6.z = f10;
        if (f10 <= f || f10 >= 1.0f || i27 != 0) {
            return;
        }
        constraintWidget6.s = 2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(DebugGraphView.DEFAULT_GRAPH_COLOR);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i, int i2) {
        Iterator it;
        if (this.mModifiers != null) {
            View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
            Iterator<c> it2 = this.mModifiers.iterator();
            do {
                if (it2.hasNext()) {
                    if (it2.next() == null) {
                        it = this.mLayoutWidget.u0.iterator();
                    } else {
                        ny61.u();
                    }
                }
            } while (!it.hasNext());
            View view = ((ConstraintWidget) it.next()).h0;
            view.getId();
            throw null;
        }
        return false;
    }

    public void fillMetrics(oc20 oc20Var) {
        this.mMetrics = oc20Var;
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        dVar.A0 = oc20Var;
        dVar.B0.getClass();
        ijy.r = oc20Var;
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.I0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.j = "parent";
            }
        }
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        if (dVar.k0 == null) {
            dVar.k0 = dVar.j;
        }
        Iterator it = dVar.u0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            View view = constraintWidget.h0;
            if (view != null) {
                if (constraintWidget.j == null && (id = view.getId()) != -1) {
                    constraintWidget.j = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.k0 == null) {
                    constraintWidget.k0 = constraintWidget.j;
                }
            }
        }
        this.mLayoutWidget.p(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & SelfTester_JCP.ENCRYPT_CBC) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new k7e(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.mWidget;
            if ((childAt.getVisibility() != 8 || layoutParams.mIsGuideline || layoutParams.mIsHelper || layoutParams.mIsVirtualGroup || isInEditMode) && !layoutParams.mIsInPlaceholder) {
                int t = constraintWidget.t();
                int u = constraintWidget.u();
                int s = constraintWidget.s() + t;
                int m = constraintWidget.m() + u;
                childAt.layout(t, u, s, m);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(t, u, s, m);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mMetrics != null) {
            System.nanoTime();
            oc20 oc20Var = this.mMetrics;
            getChildCount();
            oc20Var.getClass();
            this.mMetrics.getClass();
        }
        boolean dynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i2);
        this.mDirtyHierarchy = dynamicUpdateConstraints;
        if (!dynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.z0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
                dVar.v0.c(dVar);
            }
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.mLayoutWidget;
        oc20 oc20Var2 = this.mMetrics;
        dVar2.A0 = oc20Var2;
        dVar2.B0.getClass();
        ijy.r = oc20Var2;
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int s = this.mLayoutWidget.s();
        int m = this.mLayoutWidget.m();
        androidx.constraintlayout.core.widgets.d dVar3 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, s, m, dVar3.J0, dVar3.K0);
        if (this.mMetrics != null) {
            System.nanoTime();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof g)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            g gVar = new g();
            layoutParams.mWidget = gVar;
            layoutParams.mIsGuideline = true;
            gVar.U(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).mIsHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.u0.remove(viewWidget);
        viewWidget.E();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new k7e(getContext(), this, i);
    }

    public void removeValueModifier(c cVar) {
        if (cVar == null) {
            return;
        }
        this.mModifiers.remove(cVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        b bVar = this.mMeasurer;
        int i5 = bVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + bVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x0060, code lost:
    
        if (isRtl() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void resolveSystem(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3) {
        int i4;
        boolean z;
        ae5 ae5Var;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ae5 ae5Var2;
        boolean z4;
        boolean z5;
        boolean z6;
        ae5 ae5Var3;
        int i8;
        androidx.constraintlayout.core.widgets.analyzer.e eVar;
        androidx.constraintlayout.core.widgets.analyzer.g gVar;
        boolean z7;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z8;
        boolean z9;
        oc20 oc20Var;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        b bVar = this.mMeasurer;
        bVar.b = max;
        bVar.c = max2;
        bVar.d = paddingWidth;
        bVar.e = i13;
        bVar.f = i2;
        bVar.g = i3;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        }
        max4 = max3;
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        setSelfDimensionBehaviour(dVar, mode, i14, mode2, i15);
        dVar.C0 = max4;
        zwi zwiVar = dVar.w0;
        dVar.D0 = max;
        be5 be5Var = dVar.v0;
        androidx.constraintlayout.core.widgets.d dVar2 = be5Var.c;
        ArrayList arrayList = be5Var.a;
        ae5 ae5Var4 = dVar.y0;
        int size3 = dVar.u0.size();
        int s = dVar.s();
        int m = dVar.m();
        boolean b = h.b(i, 128);
        boolean z10 = false;
        boolean z11 = b || h.b(i, 64);
        if (z11) {
            int i16 = 0;
            while (i16 < size3) {
                boolean z12 = z11;
                ConstraintWidget constraintWidget = (ConstraintWidget) dVar.u0.get(i16);
                int i17 = i16;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                i4 = size3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z13 = (dimensionBehaviour == dimensionBehaviour2) && (dimensionBehaviourArr[1] == dimensionBehaviour2) && constraintWidget.Y > 0.0f;
                if ((constraintWidget.z() && z13) || ((constraintWidget.A() && z13) || (constraintWidget instanceof i) || constraintWidget.z() || constraintWidget.A())) {
                    z = false;
                    break;
                } else {
                    i16 = i17 + 1;
                    z11 = z12;
                    size3 = i4;
                }
            }
        }
        i4 = size3;
        z = z11;
        if (!z || (oc20Var = ijy.r) == null) {
            ae5Var = ae5Var4;
        } else {
            ae5Var = ae5Var4;
            oc20Var.a++;
        }
        boolean z14 = z & ((mode == 1073741824 && mode2 == 1073741824) || b);
        if (z14) {
            int min = Math.min(dVar.C[0], i14);
            int min2 = Math.min(dVar.C[1], i15);
            if (mode != 1073741824 || dVar.s() == min) {
                z7 = true;
            } else {
                dVar.Q(min);
                z7 = true;
                zwiVar.b = true;
            }
            if (mode2 == 1073741824 && dVar.m() != min2) {
                dVar.N(min2);
                zwiVar.b = z7;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                ArrayList arrayList2 = zwiVar.e;
                androidx.constraintlayout.core.widgets.d dVar3 = zwiVar.a;
                if (zwiVar.b || zwiVar.c) {
                    Iterator it = dVar3.u0.iterator();
                    while (it.hasNext()) {
                        ConstraintWidget constraintWidget2 = (ConstraintWidget) it.next();
                        constraintWidget2.j();
                        constraintWidget2.a = z10;
                        constraintWidget2.d.n();
                        constraintWidget2.e.m();
                        z10 = false;
                    }
                    dVar3.j();
                    i11 = 0;
                    dVar3.a = false;
                    dVar3.d.n();
                    dVar3.e.m();
                    zwiVar.c = false;
                } else {
                    i11 = 0;
                }
                zwiVar.b(zwiVar.d);
                dVar3.a0 = i11;
                dVar3.b0 = i11;
                ConstraintWidget.DimensionBehaviour l = dVar3.l(i11);
                ConstraintWidget.DimensionBehaviour l2 = dVar3.l(1);
                if (zwiVar.b) {
                    zwiVar.c();
                }
                int t = dVar3.t();
                int u = dVar3.u();
                z2 = z14;
                dVar3.d.h.d(t);
                dVar3.e.h.d(u);
                zwiVar.g();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (l == dimensionBehaviour3 || l2 == dimensionBehaviour3) {
                    if (b) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!((androidx.constraintlayout.core.widgets.analyzer.h) it2.next()).k()) {
                                    b = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (b && l == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        dVar3.O(ConstraintWidget.DimensionBehaviour.FIXED);
                        i12 = u;
                        dVar3.Q(zwiVar.d(dVar3, 0));
                        dVar3.d.e.d(dVar3.s());
                    } else {
                        i12 = u;
                    }
                    if (b && l2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        dVar3.P(ConstraintWidget.DimensionBehaviour.FIXED);
                        dVar3.N(zwiVar.d(dVar3, 1));
                        dVar3.e.e.d(dVar3.m());
                    }
                } else {
                    i12 = u;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar3.U[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    int s2 = dVar3.s() + t;
                    dVar3.d.i.d(s2);
                    dVar3.d.e.d(s2 - t);
                    zwiVar.g();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dVar3.U[1];
                    if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        int m2 = dVar3.m() + i12;
                        dVar3.e.i.d(m2);
                        dVar3.e.e.d(m2 - i12);
                    }
                    zwiVar.g();
                    z8 = true;
                } else {
                    z8 = false;
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    androidx.constraintlayout.core.widgets.analyzer.h hVar = (androidx.constraintlayout.core.widgets.analyzer.h) it3.next();
                    if (hVar.b != dVar3 || hVar.g) {
                        hVar.e();
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    androidx.constraintlayout.core.widgets.analyzer.h hVar2 = (androidx.constraintlayout.core.widgets.analyzer.h) it4.next();
                    if (z8 || hVar2.b != dVar3) {
                        if (!hVar2.h.j || ((!hVar2.i.j && !(hVar2 instanceof o4u)) || (!hVar2.e.j && !(hVar2 instanceof n89) && !(hVar2 instanceof o4u)))) {
                            z9 = false;
                            break;
                        }
                    }
                }
                z9 = true;
                dVar3.O(l);
                dVar3.P(l2);
                z3 = z9;
                i10 = 1073741824;
                i5 = 2;
            } else {
                z2 = z14;
                androidx.constraintlayout.core.widgets.d dVar4 = zwiVar.a;
                if (zwiVar.b) {
                    Iterator it5 = dVar4.u0.iterator();
                    while (it5.hasNext()) {
                        ConstraintWidget constraintWidget3 = (ConstraintWidget) it5.next();
                        constraintWidget3.j();
                        constraintWidget3.a = false;
                        androidx.constraintlayout.core.widgets.analyzer.e eVar2 = constraintWidget3.d;
                        eVar2.e.j = false;
                        eVar2.g = false;
                        eVar2.n();
                        androidx.constraintlayout.core.widgets.analyzer.g gVar2 = constraintWidget3.e;
                        gVar2.e.j = false;
                        gVar2.g = false;
                        gVar2.m();
                    }
                    i9 = 0;
                    dVar4.j();
                    dVar4.a = false;
                    androidx.constraintlayout.core.widgets.analyzer.e eVar3 = dVar4.d;
                    eVar3.e.j = false;
                    eVar3.g = false;
                    eVar3.n();
                    androidx.constraintlayout.core.widgets.analyzer.g gVar3 = dVar4.e;
                    gVar3.e.j = false;
                    gVar3.g = false;
                    gVar3.m();
                    zwiVar.c();
                } else {
                    i9 = 0;
                }
                zwiVar.b(zwiVar.d);
                dVar4.a0 = i9;
                dVar4.b0 = i9;
                dVar4.d.h.d(i9);
                dVar4.e.h.d(i9);
                i10 = 1073741824;
                if (mode == 1073741824) {
                    z3 = dVar.W(i9, b);
                    i5 = 1;
                } else {
                    z3 = true;
                    i5 = 0;
                }
                if (mode2 == 1073741824) {
                    z3 &= dVar.W(1, b);
                    i5++;
                }
            }
            if (z3) {
                dVar.R(mode == i10, mode2 == i10);
            }
        } else {
            z2 = z14;
            z3 = false;
            i5 = 0;
        }
        if (!z3 || i5 != 2) {
            int i18 = dVar.I0;
            if (i4 > 0) {
                int size4 = dVar.u0.size();
                boolean Y = dVar.Y(64);
                ae5 ae5Var5 = dVar.y0;
                int i19 = 0;
                while (i19 < size4) {
                    ConstraintWidget constraintWidget4 = (ConstraintWidget) dVar.u0.get(i19);
                    if ((constraintWidget4 instanceof g) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) || constraintWidget4.G || (Y && (eVar = constraintWidget4.d) != null && (gVar = constraintWidget4.e) != null && eVar.e.j && gVar.e.j)) {
                        i8 = size4;
                    } else {
                        ConstraintWidget.DimensionBehaviour l3 = constraintWidget4.l(0);
                        ConstraintWidget.DimensionBehaviour l4 = constraintWidget4.l(1);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        i8 = size4;
                        boolean z15 = l3 == dimensionBehaviour7 && constraintWidget4.r != 1 && l4 == dimensionBehaviour7 && constraintWidget4.s != 1;
                        if (!z15 && dVar.Y(1) && !(constraintWidget4 instanceof i)) {
                            if (l3 == dimensionBehaviour7 && constraintWidget4.r == 0 && l4 != dimensionBehaviour7 && !constraintWidget4.z()) {
                                z15 = true;
                            }
                            if (l4 == dimensionBehaviour7 && constraintWidget4.s == 0 && l3 != dimensionBehaviour7 && !constraintWidget4.z()) {
                                z15 = true;
                            }
                            if ((l3 == dimensionBehaviour7 || l4 == dimensionBehaviour7) && constraintWidget4.Y > 0.0f) {
                                z15 = true;
                            }
                        }
                        if (!z15) {
                            be5Var.a(0, ae5Var5, constraintWidget4);
                        }
                    }
                    i19++;
                    size4 = i8;
                }
                ConstraintLayout constraintLayout = ((b) ae5Var5).a;
                int childCount = constraintLayout.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = constraintLayout.getChildAt(i20);
                    if (childAt instanceof Placeholder) {
                        ((Placeholder) childAt).updatePostMeasure(constraintLayout);
                    }
                }
                int size5 = constraintLayout.mConstraintHelpers.size();
                if (size5 > 0) {
                    for (int i21 = 0; i21 < size5; i21++) {
                        ((ConstraintHelper) constraintLayout.mConstraintHelpers.get(i21)).updatePostMeasure(constraintLayout);
                    }
                }
            }
            if (dVar.A0 != null) {
                System.nanoTime();
            }
            be5Var.c(dVar);
            int size6 = arrayList.size();
            if (i4 > 0) {
                be5Var.b(dVar, 0, s, m);
            }
            if (size6 > 0) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.U;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z16 = dimensionBehaviour8 == dimensionBehaviour9;
                boolean z17 = dimensionBehaviourArr2[1] == dimensionBehaviour9;
                int max5 = Math.max(dVar.s(), dVar2.d0);
                int max6 = Math.max(dVar.m(), dVar2.e0);
                boolean z18 = false;
                int i22 = max6;
                int i23 = 0;
                while (i23 < size6) {
                    ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayList.get(i23);
                    if (constraintWidget5 instanceof i) {
                        int s3 = constraintWidget5.s();
                        int m3 = constraintWidget5.m();
                        z5 = z17;
                        z6 = z16;
                        ae5Var3 = ae5Var;
                        boolean a = z18 | be5Var.a(1, ae5Var3, constraintWidget5);
                        int s4 = constraintWidget5.s();
                        boolean z19 = a;
                        int m4 = constraintWidget5.m();
                        if (s4 != s3) {
                            constraintWidget5.Q(s4);
                            if (z6 && constraintWidget5.t() + constraintWidget5.W > max5) {
                                max5 = Math.max(max5, constraintWidget5.k(ConstraintAnchor$Type.RIGHT).e() + constraintWidget5.t() + constraintWidget5.W);
                            }
                            z19 = true;
                        }
                        if (m4 != m3) {
                            constraintWidget5.N(m4);
                            if (z5 && constraintWidget5.u() + constraintWidget5.X > i22) {
                                i22 = Math.max(i22, constraintWidget5.k(ConstraintAnchor$Type.BOTTOM).e() + constraintWidget5.u() + constraintWidget5.X);
                            }
                            z19 = true;
                        }
                        z18 = z19 | ((i) constraintWidget5).C0;
                    } else {
                        z5 = z17;
                        z6 = z16;
                        ae5Var3 = ae5Var;
                    }
                    i23++;
                    z16 = z6;
                    ae5Var = ae5Var3;
                    z17 = z5;
                }
                boolean z20 = z17;
                boolean z21 = z16;
                ae5 ae5Var6 = ae5Var;
                int i24 = 0;
                while (i24 < 2) {
                    int i25 = 0;
                    while (i25 < size6) {
                        ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayList.get(i25);
                        if (((constraintWidget6 instanceof lfu) && !(constraintWidget6 instanceof i)) || (constraintWidget6 instanceof g) || constraintWidget6.i0 == 8 || ((z2 && constraintWidget6.d.e.j && constraintWidget6.e.e.j) || (constraintWidget6 instanceof i))) {
                            i6 = size6;
                            ae5Var2 = ae5Var6;
                            i7 = i25;
                        } else {
                            int s5 = constraintWidget6.s();
                            int m5 = constraintWidget6.m();
                            i6 = size6;
                            int i26 = constraintWidget6.c0;
                            i7 = i25;
                            boolean a2 = be5Var.a(i24 == 1 ? 2 : 1, ae5Var6, constraintWidget6) | z18;
                            int s6 = constraintWidget6.s();
                            ae5Var2 = ae5Var6;
                            int m6 = constraintWidget6.m();
                            if (s6 != s5) {
                                constraintWidget6.Q(s6);
                                if (z21 && constraintWidget6.t() + constraintWidget6.W > max5) {
                                    max5 = Math.max(max5, constraintWidget6.k(ConstraintAnchor$Type.RIGHT).e() + constraintWidget6.t() + constraintWidget6.W);
                                }
                                a2 = true;
                            }
                            if (m6 != m5) {
                                constraintWidget6.N(m6);
                                if (z20 && constraintWidget6.u() + constraintWidget6.X > i22) {
                                    i22 = Math.max(i22, constraintWidget6.k(ConstraintAnchor$Type.BOTTOM).e() + constraintWidget6.u() + constraintWidget6.X);
                                }
                                z4 = true;
                            } else {
                                z4 = a2;
                            }
                            z18 = (!constraintWidget6.E || i26 == constraintWidget6.c0) ? z4 : true;
                        }
                        i25 = i7 + 1;
                        size6 = i6;
                        ae5Var6 = ae5Var2;
                    }
                    int i27 = size6;
                    ae5 ae5Var7 = ae5Var6;
                    if (!z18) {
                        break;
                    }
                    i24++;
                    be5Var.b(dVar, i24, s, m);
                    size6 = i27;
                    ae5Var6 = ae5Var7;
                    z18 = false;
                }
            }
            dVar.I0 = i18;
            ijy.q = dVar.Y(512);
        }
        if (dVar.A0 != null) {
            System.nanoTime();
        }
    }

    public void setConstraintSet(e eVar) {
        this.mConstraintSet = eVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o8e o8eVar) {
        k7e k7eVar = this.mConstraintLayoutSpec;
        if (k7eVar != null) {
            k7eVar.f = o8eVar;
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        dVar.I0 = i;
        ijy.q = dVar.Y(512);
    }

    public void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        b bVar = this.mMeasurer;
        int i5 = bVar.e;
        int i6 = bVar.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            dimensionBehaviour = dimensionBehaviour2;
            i2 = 0;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            dimensionBehaviour = dimensionBehaviour2;
        }
        if (i3 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
            i4 = 0;
        }
        if (i2 != dVar.s() || i4 != dVar.m()) {
            dVar.w0.c = true;
        }
        dVar.a0 = 0;
        dVar.b0 = 0;
        int i7 = this.mMaxWidth - i6;
        int[] iArr = dVar.C;
        iArr[0] = i7;
        iArr[1] = this.mMaxHeight - i5;
        dVar.d0 = 0;
        dVar.e0 = 0;
        dVar.O(dimensionBehaviour);
        dVar.Q(i2);
        dVar.P(dimensionBehaviour2);
        dVar.N(i4);
        int i8 = this.mMinWidth - i6;
        if (i8 < 0) {
            dVar.d0 = 0;
        } else {
            dVar.d0 = i8;
        }
        int i9 = this.mMinHeight - i5;
        if (i9 < 0) {
            dVar.e0 = 0;
        } else {
            dVar.e0 = i9;
        }
    }

    public void setState(int i, int i2, int i3) {
        k7e k7eVar = this.mConstraintLayoutSpec;
        if (k7eVar != null) {
            k7eVar.b(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = Integer.MIN_VALUE;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String constraintTag;
        public String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean guidelineUseRtl;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftToLeft;
        public int leftToRight;
        int mDimensionRatioSide;
        float mDimensionRatioValue;
        boolean mHeightSet;
        boolean mHorizontalDimensionFixed;
        boolean mIsGuideline;
        boolean mIsHelper;
        boolean mIsInPlaceholder;
        boolean mIsVirtualGroup;
        boolean mNeedsBaseline;
        int mResolveGoneLeftMargin;
        int mResolveGoneRightMargin;
        int mResolvedGuideBegin;
        int mResolvedGuideEnd;
        float mResolvedGuidePercent;
        float mResolvedHorizontalBias;
        int mResolvedLeftToLeft;
        int mResolvedLeftToRight;
        int mResolvedRightToLeft;
        int mResolvedRightToRight;
        boolean mVerticalDimensionFixed;
        ConstraintWidget mWidget;
        boolean mWidthSet;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        public int orientation;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int wrapBehaviorInParent;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.mWidthSet = true;
            this.mHeightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.mDimensionRatioValue = 0.0f;
            this.mDimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mIsVirtualGroup = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = Integer.MIN_VALUE;
            this.mResolveGoneRightMargin = Integer.MIN_VALUE;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            this.helped = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f < 0.0f) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                e.u(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case SAFETY_TIPS_VALUE:
                                this.constraintTag = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.baselineToTop);
                                this.baselineToTop = resourceId15;
                                if (resourceId15 == -1) {
                                    this.baselineToTop = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.baselineToBottom);
                                this.baselineToBottom = resourceId16;
                                if (resourceId16 == -1) {
                                    this.baselineToBottom = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                break;
                            case SODA_DE_DE_VALUE:
                                this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        e.t(this, obtainStyledAttributes, index, 0);
                                        this.mWidthSet = true;
                                        break;
                                    case 65:
                                        e.t(this, obtainStyledAttributes, index, 1);
                                        this.mHeightSet = true;
                                        break;
                                    case 66:
                                        this.wrapBehaviorInParent = obtainStyledAttributes.getInt(index, this.wrapBehaviorInParent);
                                        break;
                                    case 67:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public ConstraintWidget getConstraintWidget() {
            return this.mWidget;
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.mWidget;
            if (constraintWidget != null) {
                constraintWidget.E();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolveGoneLeftMargin = this.goneLeftMargin;
            this.mResolveGoneRightMargin = this.goneRightMargin;
            float f = this.horizontalBias;
            this.mResolvedHorizontalBias = f;
            int i8 = this.guideBegin;
            this.mResolvedGuideBegin = i8;
            int i9 = this.guideEnd;
            this.mResolvedGuideEnd = i9;
            float f2 = this.guidePercent;
            this.mResolvedGuidePercent = f2;
            int i10 = this.startToEnd;
            if (z2) {
                if (i10 != -1) {
                    this.mResolvedRightToLeft = i10;
                } else {
                    int i11 = this.startToStart;
                    if (i11 != -1) {
                        this.mResolvedRightToRight = i11;
                    }
                    i2 = this.endToStart;
                    if (i2 != -1) {
                        this.mResolvedLeftToRight = i2;
                        z = true;
                    }
                    i3 = this.endToEnd;
                    if (i3 != -1) {
                        this.mResolvedLeftToLeft = i3;
                        z = true;
                    }
                    i4 = this.goneStartMargin;
                    if (i4 != Integer.MIN_VALUE) {
                        this.mResolveGoneRightMargin = i4;
                    }
                    i5 = this.goneEndMargin;
                    if (i5 != Integer.MIN_VALUE) {
                        this.mResolveGoneLeftMargin = i5;
                    }
                    if (z) {
                        this.mResolvedHorizontalBias = 1.0f - f;
                    }
                    if (this.mIsGuideline && this.orientation == 1 && this.guidelineUseRtl) {
                        if (f2 == -1.0f) {
                            this.mResolvedGuidePercent = 1.0f - f2;
                            this.mResolvedGuideBegin = -1;
                            this.mResolvedGuideEnd = -1;
                        } else if (i8 != -1) {
                            this.mResolvedGuideEnd = i8;
                            this.mResolvedGuideBegin = -1;
                            this.mResolvedGuidePercent = -1.0f;
                        } else if (i9 != -1) {
                            this.mResolvedGuideBegin = i9;
                            this.mResolvedGuideEnd = -1;
                            this.mResolvedGuidePercent = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.endToStart;
                if (i2 != -1) {
                }
                i3 = this.endToEnd;
                if (i3 != -1) {
                }
                i4 = this.goneStartMargin;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.goneEndMargin;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.mIsGuideline) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                if (i10 != -1) {
                    this.mResolvedLeftToRight = i10;
                }
                int i12 = this.startToStart;
                if (i12 != -1) {
                    this.mResolvedLeftToLeft = i12;
                }
                int i13 = this.endToStart;
                if (i13 != -1) {
                    this.mResolvedRightToLeft = i13;
                }
                int i14 = this.endToEnd;
                if (i14 != -1) {
                    this.mResolvedRightToRight = i14;
                }
                int i15 = this.goneStartMargin;
                if (i15 != Integer.MIN_VALUE) {
                    this.mResolveGoneLeftMargin = i15;
                }
                int i16 = this.goneEndMargin;
                if (i16 != Integer.MIN_VALUE) {
                    this.mResolveGoneRightMargin = i16;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                int i17 = this.rightToLeft;
                if (i17 != -1) {
                    this.mResolvedRightToLeft = i17;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i18 = this.rightToRight;
                    if (i18 != -1) {
                        this.mResolvedRightToRight = i18;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i19 = this.leftToLeft;
                if (i19 != -1) {
                    this.mResolvedLeftToLeft = i19;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i20 = this.leftToRight;
                if (i20 != -1) {
                    this.mResolvedLeftToRight = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public void setWidgetDebugName(String str) {
            this.mWidget.k0 = str;
        }

        public void validate() {
            this.mIsGuideline = false;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.constrainedWidth) {
                this.mHorizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.constrainedHeight) {
                this.mVerticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.mHorizontalDimensionFixed = false;
                if (i == 0 && this.matchConstraintDefaultWidth == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.mVerticalDimensionFixed = false;
                if (i2 == 0 && this.matchConstraintDefaultHeight == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.mIsGuideline = true;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            if (!(this.mWidget instanceof g)) {
                this.mWidget = new g();
            }
            ((g) this.mWidget).U(this.orientation);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.mWidthSet = true;
            this.mHeightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.mDimensionRatioValue = 0.0f;
            this.mDimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mIsVirtualGroup = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = Integer.MIN_VALUE;
            this.mResolveGoneRightMargin = Integer.MIN_VALUE;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            this.helped = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.guideBegin = layoutParams2.guideBegin;
                this.guideEnd = layoutParams2.guideEnd;
                this.guidePercent = layoutParams2.guidePercent;
                this.guidelineUseRtl = layoutParams2.guidelineUseRtl;
                this.leftToLeft = layoutParams2.leftToLeft;
                this.leftToRight = layoutParams2.leftToRight;
                this.rightToLeft = layoutParams2.rightToLeft;
                this.rightToRight = layoutParams2.rightToRight;
                this.topToTop = layoutParams2.topToTop;
                this.topToBottom = layoutParams2.topToBottom;
                this.bottomToTop = layoutParams2.bottomToTop;
                this.bottomToBottom = layoutParams2.bottomToBottom;
                this.baselineToBaseline = layoutParams2.baselineToBaseline;
                this.baselineToTop = layoutParams2.baselineToTop;
                this.baselineToBottom = layoutParams2.baselineToBottom;
                this.circleConstraint = layoutParams2.circleConstraint;
                this.circleRadius = layoutParams2.circleRadius;
                this.circleAngle = layoutParams2.circleAngle;
                this.startToEnd = layoutParams2.startToEnd;
                this.startToStart = layoutParams2.startToStart;
                this.endToStart = layoutParams2.endToStart;
                this.endToEnd = layoutParams2.endToEnd;
                this.goneLeftMargin = layoutParams2.goneLeftMargin;
                this.goneTopMargin = layoutParams2.goneTopMargin;
                this.goneRightMargin = layoutParams2.goneRightMargin;
                this.goneBottomMargin = layoutParams2.goneBottomMargin;
                this.goneStartMargin = layoutParams2.goneStartMargin;
                this.goneEndMargin = layoutParams2.goneEndMargin;
                this.goneBaselineMargin = layoutParams2.goneBaselineMargin;
                this.baselineMargin = layoutParams2.baselineMargin;
                this.horizontalBias = layoutParams2.horizontalBias;
                this.verticalBias = layoutParams2.verticalBias;
                this.dimensionRatio = layoutParams2.dimensionRatio;
                this.mDimensionRatioValue = layoutParams2.mDimensionRatioValue;
                this.mDimensionRatioSide = layoutParams2.mDimensionRatioSide;
                this.horizontalWeight = layoutParams2.horizontalWeight;
                this.verticalWeight = layoutParams2.verticalWeight;
                this.horizontalChainStyle = layoutParams2.horizontalChainStyle;
                this.verticalChainStyle = layoutParams2.verticalChainStyle;
                this.constrainedWidth = layoutParams2.constrainedWidth;
                this.constrainedHeight = layoutParams2.constrainedHeight;
                this.matchConstraintDefaultWidth = layoutParams2.matchConstraintDefaultWidth;
                this.matchConstraintDefaultHeight = layoutParams2.matchConstraintDefaultHeight;
                this.matchConstraintMinWidth = layoutParams2.matchConstraintMinWidth;
                this.matchConstraintMaxWidth = layoutParams2.matchConstraintMaxWidth;
                this.matchConstraintMinHeight = layoutParams2.matchConstraintMinHeight;
                this.matchConstraintMaxHeight = layoutParams2.matchConstraintMaxHeight;
                this.matchConstraintPercentWidth = layoutParams2.matchConstraintPercentWidth;
                this.matchConstraintPercentHeight = layoutParams2.matchConstraintPercentHeight;
                this.editorAbsoluteX = layoutParams2.editorAbsoluteX;
                this.editorAbsoluteY = layoutParams2.editorAbsoluteY;
                this.orientation = layoutParams2.orientation;
                this.mHorizontalDimensionFixed = layoutParams2.mHorizontalDimensionFixed;
                this.mVerticalDimensionFixed = layoutParams2.mVerticalDimensionFixed;
                this.mNeedsBaseline = layoutParams2.mNeedsBaseline;
                this.mIsGuideline = layoutParams2.mIsGuideline;
                this.mResolvedLeftToLeft = layoutParams2.mResolvedLeftToLeft;
                this.mResolvedLeftToRight = layoutParams2.mResolvedLeftToRight;
                this.mResolvedRightToLeft = layoutParams2.mResolvedRightToLeft;
                this.mResolvedRightToRight = layoutParams2.mResolvedRightToRight;
                this.mResolveGoneLeftMargin = layoutParams2.mResolveGoneLeftMargin;
                this.mResolveGoneRightMargin = layoutParams2.mResolveGoneRightMargin;
                this.mResolvedHorizontalBias = layoutParams2.mResolvedHorizontalBias;
                this.constraintTag = layoutParams2.constraintTag;
                this.wrapBehaviorInParent = layoutParams2.wrapBehaviorInParent;
                this.mWidget = layoutParams2.mWidget;
                this.mWidthSet = layoutParams2.mWidthSet;
                this.mHeightSet = layoutParams2.mHeightSet;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.mWidthSet = true;
            this.mHeightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.mDimensionRatioValue = 0.0f;
            this.mDimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mIsVirtualGroup = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = Integer.MIN_VALUE;
            this.mResolveGoneRightMargin = Integer.MIN_VALUE;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            this.helped = false;
        }
    }
}
