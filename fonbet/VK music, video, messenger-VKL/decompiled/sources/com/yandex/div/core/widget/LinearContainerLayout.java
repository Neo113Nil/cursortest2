package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.an10;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.g5g;
import xsna.i9x;
import xsna.jw5;
import xsna.kxt0;
import xsna.p5j;
import xsna.p7f0;
import xsna.qcy;
import xsna.s3q0;

/* compiled from: LinearContainerLayout.kt */
/* loaded from: classes7.dex */
public class LinearContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties = {new MutablePropertyReference1Impl(LinearContainerLayout.class, X3.i.n, "getOrientation()I", 0), p5j.a(0, LinearContainerLayout.class, "aspectRatio", "getAspectRatio()F", fpf0.a), new MutablePropertyReference1Impl(LinearContainerLayout.class, "showDividers", "getShowDividers()I", 0)};
    private final p7f0 aspectRatio$delegate;
    private int childMeasuredState;
    private final List<View> constrainedChildren;
    private final Set<View> crossMatchParentChildren;
    private Drawable dividerDrawable;
    private int dividerHeight;
    private int dividerMarginBottom;
    private int dividerMarginLeft;
    private int dividerMarginRight;
    private int dividerMarginTop;
    private int dividerWidth;
    private int firstVisibleChildIndex;
    private int itemSpacingPx;
    private int lastVisibleChildIndex;
    private int maxBaselineAscent;
    private int maxBaselineDescent;
    private int maxCrossSize;
    private final DivViewGroup.OffsetsHolder offsetsHolder;
    private final p7f0 orientation$delegate;
    private final p7f0 showDividers$delegate;
    private final Set<View> skippedMatchParentChildren;
    private int totalConstrainedLength;
    private int totalLength;
    private int totalMatchParentLength;
    private float totalWeight;

    public LinearContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        this.orientation$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, null);
        this.firstVisibleChildIndex = -1;
        this.lastVisibleChildIndex = -1;
        this.showDividers$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.constrainedChildren = new ArrayList();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.crossMatchParentChildren = new LinkedHashSet();
    }

    private final void considerMatchParentChildInMaxHeight(View view, int i, boolean z) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height != -1) {
            return;
        }
        if (z) {
            this.maxCrossSize = Math.max(this.maxCrossSize, divLayoutParams.getVerticalMargins$div_release() + view.getMinimumHeight());
        } else {
            remeasureChildHorizontal(view, i, view.getMeasuredWidth());
            updateMaxCrossSize(i, divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight());
        }
    }

    private final void considerMatchParentChildMarginsInWidth(View view, int i) {
        if (hasSignificantWidth(view, i)) {
            return;
        }
        this.totalLength = getMaxLength(this.totalLength, ((DivLayoutParams) view.getLayoutParams()).getHorizontalMargins$div_release());
    }

    private final void considerMatchParentChildrenInMaxWidth(int i, int i2) {
        if (!ViewsKt.isExact(i)) {
            if (this.maxCrossSize != 0) {
                for (View view : this.crossMatchParentChildren) {
                    this.maxCrossSize = Math.max(this.maxCrossSize, ((DivLayoutParams) view.getLayoutParams()).getHorizontalMargins$div_release() + view.getMinimumWidth());
                }
            } else {
                for (View view2 : this.crossMatchParentChildren) {
                    int i3 = i;
                    measureVerticalFirstTime(view2, i3, i2, true, false);
                    this.skippedMatchParentChildren.remove(view2);
                    i = i3;
                }
            }
        }
    }

    private final s3q0 drawDivider(Canvas canvas, int i, int i2, int i3, int i4) {
        Drawable drawable = this.dividerDrawable;
        if (drawable == null) {
            return null;
        }
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float f3 = this.dividerWidth / 2.0f;
        float f4 = this.dividerHeight / 2.0f;
        drawable.setBounds(Math.max((int) (f - f3), i), Math.max((int) (f2 - f4), i2), Math.min((int) (f + f3), i3), Math.min((int) (f2 + f4), i4));
        drawable.draw(canvas);
        return s3q0.a;
    }

    private final void drawDividersHorizontal(Canvas canvas) {
        int right;
        int edgeDividerOffset;
        int left;
        int edgeDividerOffset2;
        int i;
        boolean isLayoutRtl = com.yandex.div.core.util.ViewsKt.isLayoutRtl(this);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                int dividerOffsetBeforeChildAt = getDividerOffsetBeforeChildAt(i2);
                drawVerticalDivider(canvas, isLayoutRtl ? childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).rightMargin + this.dividerMarginLeft + dividerOffsetBeforeChildAt : (((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).leftMargin) - this.dividerWidth) - this.dividerMarginRight) - dividerOffsetBeforeChildAt);
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null || !isLayoutRtl) {
                if (childAt2 == null) {
                    left = ((getWidth() - getPaddingRight()) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else if (isLayoutRtl) {
                    left = ((childAt2.getLeft() - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt2.getLayoutParams())).leftMargin) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else {
                    right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt2.getLayoutParams())).rightMargin + this.dividerMarginLeft;
                    edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
                }
                i = left - edgeDividerOffset2;
                drawVerticalDivider(canvas, i);
            }
            right = getPaddingLeft() + this.dividerMarginLeft;
            edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
            i = edgeDividerOffset + right;
            drawVerticalDivider(canvas, i);
        }
    }

    private final void drawDividersVertical(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (((childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).topMargin) - this.dividerHeight) - this.dividerMarginBottom) - getDividerOffsetBeforeChildAt(i));
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            drawHorizontalDivider(canvas, childAt2 != null ? this.offsetsHolder.getEdgeDividerOffset() + childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt2.getLayoutParams())).bottomMargin + this.dividerMarginTop : (((getHeight() - getPaddingBottom()) - this.dividerHeight) - this.dividerMarginBottom) - this.offsetsHolder.getEdgeDividerOffset());
        }
    }

    private final void drawHorizontalDivider(Canvas canvas, int i) {
        drawDivider(canvas, getPaddingLeft() + this.dividerMarginLeft, i, (getWidth() - getPaddingRight()) - this.dividerMarginRight, i + this.dividerHeight);
    }

    private final s3q0 drawVerticalDivider(Canvas canvas, int i) {
        return drawDivider(canvas, i, getPaddingTop() + this.dividerMarginTop, i + this.dividerWidth, (getHeight() - getPaddingBottom()) - this.dividerMarginBottom);
    }

    private final int gapBeforeChild(int i) {
        int dividerHeightWithMargins = isVertical() ? getDividerHeightWithMargins() : getDividerWidthWithMargins();
        if (hasDividerBeforeChildAt(i)) {
            return dividerHeightWithMargins;
        }
        if (i == this.firstVisibleChildIndex) {
            return 0;
        }
        return this.itemSpacingPx;
    }

    private final int getDividerHeightWithMargins() {
        return this.dividerHeight + this.dividerMarginTop + this.dividerMarginBottom;
    }

    private final int getDividerOffsetBeforeChildAt(int i) {
        return i == this.firstVisibleChildIndex ? this.offsetsHolder.getEdgeDividerOffset() : (int) (this.offsetsHolder.getSpaceBetweenChildren() / 2);
    }

    private final int getDividerWidthWithMargins() {
        return this.dividerWidth + this.dividerMarginRight + this.dividerMarginLeft;
    }

    private final float getFixedHorizontalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getHorizontalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width);
    }

    private final float getFixedVerticalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getVerticalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height);
    }

    private final float getFixedWeight(float f, int i) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        if (i == -1) {
            return 1.0f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final int getFreeSpace(int i, int i2) {
        int i3;
        if (i >= 0 || (i3 = this.totalMatchParentLength) <= 0) {
            return (i < 0 || !ViewsKt.isExact(i2)) ? i : i + this.totalMatchParentLength;
        }
        int i4 = i + i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    private final int getMaxHeight(View view) {
        return ((DivLayoutParams) view.getLayoutParams()).getMaxHeight();
    }

    private final int getMaxLength(int i, int i2) {
        return Math.max(i, i2 + i);
    }

    private final int getMaxWidth(View view) {
        return ((DivLayoutParams) view.getLayoutParams()).getMaxWidth();
    }

    private final int getVisibleChildCount() {
        kxt0 kxt0Var = new kxt0(this);
        int i = 0;
        while (kxt0Var.hasNext()) {
            if (!(kxt0Var.next().getVisibility() == 8) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    private final int getWidthSizeAndState(int i) {
        return View.resolveSizeAndState(Math.max(getSuggestedMinimumWidth(), this.totalLength), i, this.childMeasuredState);
    }

    private final boolean hasDividerBeforeChildAt(int i) {
        if (i == this.firstVisibleChildIndex) {
            return (getShowDividers() & 1) != 0;
        }
        if (i > this.lastVisibleChildIndex) {
            return (getShowDividers() & 4) != 0;
        }
        if ((getShowDividers() & 2) != 0) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (getChildAt(i).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean hasSignificantDimension(int i, int i2) {
        return (i == -1 && ViewsKt.isExact(i2)) ? false : true;
    }

    private final boolean hasSignificantHeight(View view, int i) {
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) view.getLayoutParams())).height, i);
    }

    private final boolean hasSignificantWidth(View view, int i) {
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) view.getLayoutParams())).width, i);
    }

    private final boolean isVertical() {
        return getOrientation() == 1;
    }

    private final void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int baseline;
        int verticalPaddings$div_release = (i4 - i2) - getVerticalPaddings$div_release();
        int layoutDirection = getLayoutDirection();
        float f = (i3 - i) - this.totalLength;
        float paddingLeft = getPaddingLeft();
        this.offsetsHolder.update(f, Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), layoutDirection), getVisibleChildCount());
        float firstChildOffset = this.offsetsHolder.getFirstChildOffset() + paddingLeft;
        i9x indices = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, getChildCount());
        int i7 = indices.b;
        int i8 = indices.c;
        int i9 = indices.d;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return;
        }
        while (true) {
            View childAt = getChildAt(i7);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int verticalGravity = DivViewGroup.Companion.toVerticalGravity(divLayoutParams.getGravity());
                if (verticalGravity < 0) {
                    verticalGravity = getVerticalGravity$div_release();
                }
                int paddingTop = getPaddingTop();
                if (verticalGravity == 16) {
                    i5 = (((verticalPaddings$div_release - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
                } else if (verticalGravity != 48) {
                    if (verticalGravity != 80) {
                        i5 = 0;
                    } else {
                        i6 = verticalPaddings$div_release - measuredHeight;
                        baseline = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                        i5 = i6 - baseline;
                    }
                } else if (!divLayoutParams.isBaselineAligned() || ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 || childAt.getBaseline() == -1) {
                    i5 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                } else {
                    i6 = this.maxBaselineAscent;
                    baseline = childAt.getBaseline();
                    i5 = i6 - baseline;
                }
                float gapBeforeChild = firstChildOffset + gapBeforeChild(com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? i7 + 1 : i7) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                setChildFrame(childAt, an10.b(gapBeforeChild), paddingTop + i5, measuredWidth, measuredHeight);
                firstChildOffset = this.offsetsHolder.getSpaceBetweenChildren() + measuredWidth + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + gapBeforeChild;
            }
            if (i7 == i8) {
                return;
            } else {
                i7 += i9;
            }
        }
    }

    private final void layoutVertical(int i, int i2, int i3, int i4) {
        int horizontalPaddings$div_release = (i3 - i) - getHorizontalPaddings$div_release();
        float f = (i4 - i2) - this.totalLength;
        float paddingTop = getPaddingTop();
        this.offsetsHolder.update(f, getVerticalGravity$div_release(), getVisibleChildCount());
        float firstChildOffset = this.offsetsHolder.getFirstChildOffset() + paddingTop;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int horizontalGravity = DivViewGroup.Companion.toHorizontalGravity(divLayoutParams.getGravity());
                if (horizontalGravity < 0) {
                    horizontalGravity = getHorizontalGravity$div_release();
                }
                int layoutDirection = getLayoutDirection();
                int paddingLeft = getPaddingLeft();
                int absoluteGravity = Gravity.getAbsoluteGravity(horizontalGravity, layoutDirection);
                float gapBeforeChild = firstChildOffset + gapBeforeChild(i5) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                setChildFrame(childAt, paddingLeft + (absoluteGravity != 1 ? absoluteGravity != 3 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (horizontalPaddings$div_release - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (((horizontalPaddings$div_release - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2), an10.b(gapBeforeChild), measuredWidth, measuredHeight);
                firstChildOffset = this.offsetsHolder.getSpaceBetweenChildren() + measuredHeight + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + gapBeforeChild;
            }
        }
    }

    private final void measureChildWithSignificantSizeHorizontal(View view, int i, int i2) {
        LinearContainerLayout linearContainerLayout;
        View view2;
        int i3;
        if (hasSignificantWidth(view, i)) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
            if (i4 == -3) {
                linearContainerLayout = this;
                view2 = view;
                i3 = i2;
                measureConstrainedWidthChildFirstTime(view2, i, i3);
            } else if (i4 != -1) {
                linearContainerLayout = this;
                view2 = view;
                i3 = i2;
                linearContainerLayout.measureChildWithMargins(view2, i, 0, i3, 0);
            } else {
                linearContainerLayout = this;
                view2 = view;
                i3 = i2;
                measureMatchParentWidthChildFirstTime(view2, i, i3);
            }
            linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view2.getMeasuredState());
            updateMaxCrossSize(i3, divLayoutParams.getVerticalMargins$div_release() + view2.getMeasuredHeight());
            updateBaselineOffset(view2);
            linearContainerLayout.totalLength = getMaxLength(linearContainerLayout.totalLength, divLayoutParams.getHorizontalMargins$div_release() + view2.getMeasuredWidth());
        }
    }

    private final void measureChildWithSignificantSizeVertical(View view, int i, int i2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        boolean isExact = ViewsKt.isExact(i);
        boolean hasSignificantHeight = hasSignificantHeight(view, i2);
        if (isExact ? hasSignificantHeight : ((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
            measureVerticalFirstTime(view, i, i2, true, true);
            return;
        }
        if (!isExact) {
            this.crossMatchParentChildren.add(view);
        }
        if (hasSignificantHeight) {
            return;
        }
        this.skippedMatchParentChildren.add(view);
        this.totalLength = getMaxLength(this.totalLength, ((DivLayoutParams) view.getLayoutParams()).getVerticalMargins$div_release());
    }

    private final void measureConstrainedHeightChildFirstTime(View view, int i, int i2, boolean z) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        int maxHeight = divLayoutParams.getMaxHeight();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        divLayoutParams.setMaxHeight(Integer.MAX_VALUE);
        measureChildWithMargins(view, i, 0, i2, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -3;
        divLayoutParams.setMaxHeight(maxHeight);
        if (z) {
            this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight());
            if (this.constrainedChildren.contains(view)) {
                return;
            }
            this.constrainedChildren.add(view);
        }
    }

    private final void measureConstrainedWidthChildFirstTime(View view, int i, int i2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        int maxWidth = divLayoutParams.getMaxWidth();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        divLayoutParams.setMaxWidth(Integer.MAX_VALUE);
        measureChildWithMargins(view, i, 0, i2, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
        divLayoutParams.setMaxWidth(maxWidth);
        this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth());
        this.constrainedChildren.add(view);
    }

    private final void measureHorizontal(int i, int i2) {
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        boolean isExact = ViewsKt.isExact(i);
        if (getAspectRatio() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i2 = isExact ? ViewsKt.makeExactSpec(an10.b(View.MeasureSpec.getSize(i) / getAspectRatio())) : ViewsKt.makeExactSpec(0);
        }
        int size = View.MeasureSpec.getSize(i2);
        boolean isExact2 = ViewsKt.isExact(i2);
        int max = isExact2 ? size : Math.max(getSuggestedMinimumHeight(), getVerticalPaddings$div_release());
        if (max < 0) {
            max = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i3);
                this.totalWeight += getFixedHorizontalWeight((DivLayoutParams) childAt.getLayoutParams());
                measureChildWithSignificantSizeHorizontal(childAt, i, i2);
            }
        }
        int childCount2 = getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8) {
                considerMatchParentChildMarginsInWidth(childAt2, i);
            }
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerWidthWithMargins();
        }
        this.totalLength = getHorizontalPaddings$div_release() + this.totalLength;
        int widthSizeAndState = getWidthSizeAndState(i) & 16777215;
        if (!isExact && getAspectRatio() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            size = an10.b(widthSizeAndState / getAspectRatio());
            i2 = ViewsKt.makeExactSpec(size);
        }
        remeasureChildrenHorizontalIfNeeded(i, widthSizeAndState, i2);
        if (!isExact2 && getAspectRatio() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int childCount3 = getChildCount();
            for (int i5 = 0; i5 < childCount3; i5++) {
                View childAt3 = getChildAt(i5);
                if (childAt3.getVisibility() != 8) {
                    considerMatchParentChildInMaxHeight(childAt3, i2, this.maxCrossSize == 0);
                }
            }
            this.maxCrossSize = Math.max(max, getVerticalPaddings$div_release() + this.maxCrossSize);
            int i6 = this.maxBaselineAscent;
            if (i6 != -1) {
                updateMaxCrossSize(i2, i6 + this.maxBaselineDescent);
            }
            size = View.resolveSize(this.maxCrossSize, i2);
        }
        int childCount4 = getChildCount();
        for (int i7 = 0; i7 < childCount4; i7++) {
            View childAt4 = getChildAt(i7);
            if (childAt4.getVisibility() != 8) {
                remeasureDynamicHeightChild(childAt4, ViewsKt.makeExactSpec(size));
            }
        }
        setMeasuredDimension(getWidthSizeAndState(i), View.resolveSizeAndState(size, i2, this.childMeasuredState << 16));
    }

    private final void measureMatchParentHeightChildFirstTime(View view, int i, int i2, boolean z) {
        if (ViewsKt.isExact(i2)) {
            measureChildWithMargins(view, i, 0, ViewsKt.makeExactSpec(0), 0);
            return;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        measureChildWithMargins(view, i, 0, i2, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -1;
        if (z) {
            this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, view.getMeasuredHeight());
        }
    }

    private final void measureMatchParentWidthChild(View view, int i) {
        if (hasSignificantHeight(view, i)) {
            measureVerticalFirstTime(view, ViewsKt.makeExactSpec(getHorizontalPaddings$div_release() + this.maxCrossSize), i, false, true);
            this.skippedMatchParentChildren.remove(view);
        }
    }

    private final void measureMatchParentWidthChildFirstTime(View view, int i, int i2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        measureChildWithMargins(view, i, 0, i2, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -1;
        this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth());
    }

    private final void measureVertical(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = View.MeasureSpec.getMode(i) == 1073741824;
        if (getAspectRatio() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i2 = z ? ViewsKt.makeExactSpec(an10.b(size / getAspectRatio())) : ViewsKt.makeExactSpec(0);
        }
        if (!z) {
            size = Math.max(getSuggestedMinimumWidth(), getHorizontalPaddings$div_release());
        }
        if (size < 0) {
            size = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i3);
                this.totalWeight += getFixedVerticalWeight((DivLayoutParams) childAt.getLayoutParams());
                measureChildWithSignificantSizeVertical(childAt, i, i2);
            }
        }
        considerMatchParentChildrenInMaxWidth(i, i2);
        Iterator<T> it = this.crossMatchParentChildren.iterator();
        while (it.hasNext()) {
            measureMatchParentWidthChild((View) it.next(), i2);
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerHeightWithMargins();
        }
        this.totalLength = getVerticalPaddings$div_release() + this.totalLength;
        this.maxCrossSize = Math.max(size, getHorizontalPaddings$div_release() + this.maxCrossSize);
        int size2 = View.MeasureSpec.getSize(i2);
        if (getAspectRatio() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !z) {
            size2 = an10.b((View.resolveSizeAndState(this.maxCrossSize, i, this.childMeasuredState) & 16777215) / getAspectRatio());
            i2 = ViewsKt.makeExactSpec(size2);
            remeasureChildrenVerticalIfNeeded(i, size2, i2, size);
        } else if (getAspectRatio() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ViewsKt.isExact(i2)) {
            remeasureChildrenVerticalIfNeeded(i, size2, i2, size);
        } else {
            remeasureChildrenVerticalIfNeeded(i, Math.max(this.totalLength, getSuggestedMinimumHeight()), i2, size);
            size2 = Math.max(this.totalLength, getSuggestedMinimumHeight());
        }
        setMeasuredDimension(View.resolveSizeAndState(this.maxCrossSize, i, this.childMeasuredState), View.resolveSizeAndState(size2, i2, this.childMeasuredState << 16));
    }

    private final void measureVerticalFirstTime(View view, int i, int i2, boolean z, boolean z2) {
        LinearContainerLayout linearContainerLayout;
        View view2;
        int i3;
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        if (i4 == -3) {
            linearContainerLayout = this;
            view2 = view;
            i3 = i;
            measureConstrainedHeightChildFirstTime(view2, i3, i2, z2);
        } else if (i4 != -1) {
            linearContainerLayout = this;
            view2 = view;
            i3 = i;
            linearContainerLayout.measureChildWithMargins(view2, i3, 0, i2, 0);
        } else {
            linearContainerLayout = this;
            view2 = view;
            i3 = i;
            measureMatchParentHeightChildFirstTime(view2, i3, i2, z2);
        }
        linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view2.getMeasuredState());
        if (z) {
            updateMaxCrossSize(i3, divLayoutParams.getHorizontalMargins$div_release() + view2.getMeasuredWidth());
        }
        if (z2) {
            linearContainerLayout.totalLength = getMaxLength(linearContainerLayout.totalLength, divLayoutParams.getVerticalMargins$div_release() + view2.getMeasuredHeight());
        }
    }

    private final boolean needRemeasureChildren(int i, int i2) {
        if (!this.skippedMatchParentChildren.isEmpty()) {
            return true;
        }
        if (ViewsKt.isUnspecified(i2)) {
            return false;
        }
        return i < 0 ? this.totalConstrainedLength > 0 || this.totalWeight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ViewsKt.isExact(i2) && i > 0 && this.totalWeight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final int remeasureChildHorizontal(View view, int i, int i2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        view.measure(ViewsKt.makeExactSpec(i2), DivViewGroup.Companion.getChildMeasureSpec(i, divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        return View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState() & (-16777216));
    }

    private final void remeasureChildVertical(View view, int i, int i2, int i3) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i4 == -1) {
            if (i2 == 0) {
                ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
            } else {
                i = ViewsKt.makeExactSpec(i2);
            }
        }
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        int childMeasureSpec = companion.getChildMeasureSpec(i, divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth());
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = i4;
        view.measure(childMeasureSpec, ViewsKt.makeExactSpec(i3));
        this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState() & (-256));
    }

    private final void remeasureChildrenHorizontalIfNeeded(int i, int i2, int i3) {
        int i4 = i2 - this.totalLength;
        List<View> list = this.constrainedChildren;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (getMaxWidth((View) it.next()) != Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!needRemeasureChildren(i4, i)) {
            return;
        }
        this.totalLength = 0;
        remeasureConstrainedWidthChildren(i, i3, i4);
        remeasureMatchParentWidthChildren(i, i3, i4);
        this.totalLength = getHorizontalPaddings$div_release() + this.totalLength;
    }

    private final void remeasureChildrenVerticalIfNeeded(int i, int i2, int i3, int i4) {
        int i5 = i2 - this.totalLength;
        List<View> list = this.constrainedChildren;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (getMaxHeight((View) it.next()) != Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!needRemeasureChildren(i5, i3)) {
            return;
        }
        this.totalLength = 0;
        remeasureConstrainedHeightChildren(i, i3, i5);
        remeasureMatchParentHeightChildren(i, i3, i4, i5);
        this.totalLength = getVerticalPaddings$div_release() + this.totalLength;
    }

    private final void remeasureConstrainedHeightChildren(int i, int i2, int i3) {
        int freeSpace = getFreeSpace(i3, i2);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxHeight(view) != Integer.MAX_VALUE) {
                    remeasureChildVertical(view, i, this.maxCrossSize, Math.min(view.getMeasuredHeight(), getMaxHeight(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            g5g.L(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedHeightChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    View view2 = (View) t2;
                    View view3 = (View) t;
                    return jw5.b(Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()), Float.valueOf(view3.getMinimumHeight() / view3.getMeasuredHeight()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) view2.getLayoutParams();
            int measuredHeight = view2.getMeasuredHeight();
            int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + measuredHeight;
            int b = an10.b((verticalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredHeight;
            int minimumHeight = view2.getMinimumHeight();
            if (b < minimumHeight) {
                b = minimumHeight;
            }
            int maxHeight = divLayoutParams.getMaxHeight();
            if (b > maxHeight) {
                b = maxHeight;
            }
            remeasureChildVertical(view2, i, this.maxCrossSize, b);
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & C.DEFAULT_MUXED_BUFFER_SIZE);
            this.totalConstrainedLength -= verticalMargins$div_release;
            freeSpace -= view2.getMeasuredHeight() - measuredHeight;
        }
    }

    private final void remeasureConstrainedWidthChildren(int i, int i2, int i3) {
        int freeSpace = getFreeSpace(i3, i);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxWidth(view) != Integer.MAX_VALUE) {
                    remeasureChildHorizontal(view, i2, Math.min(view.getMeasuredWidth(), getMaxWidth(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            g5g.L(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedWidthChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    View view2 = (View) t2;
                    View view3 = (View) t;
                    return jw5.b(Float.valueOf(view2.getMinimumWidth() / view2.getMeasuredWidth()), Float.valueOf(view3.getMinimumWidth() / view3.getMeasuredWidth()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) view2.getLayoutParams();
            int measuredWidth = view2.getMeasuredWidth();
            int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + measuredWidth;
            int b = an10.b((horizontalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredWidth;
            int minimumWidth = view2.getMinimumWidth();
            if (b < minimumWidth) {
                b = minimumWidth;
            }
            int maxWidth = divLayoutParams.getMaxWidth();
            if (b > maxWidth) {
                b = maxWidth;
            }
            remeasureChildHorizontal(view2, i2, b);
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & C.DEFAULT_MUXED_BUFFER_SIZE);
            this.totalConstrainedLength -= horizontalMargins$div_release;
            freeSpace -= view2.getMeasuredWidth() - measuredWidth;
        }
    }

    private final void remeasureDynamicHeightChild(View view, int i) {
        int i2 = ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) view.getLayoutParams())).height;
        if (i2 == -1 || i2 == -3) {
            remeasureChildHorizontal(view, i, view.getMeasuredWidth());
        }
    }

    private final void remeasureMatchParentHeightChildren(int i, int i2, int i3, int i4) {
        int freeSpace = getFreeSpace(i4, i2);
        float f = this.totalWeight;
        int i5 = this.maxCrossSize;
        this.maxCrossSize = 0;
        int childCount = getChildCount();
        int i6 = freeSpace;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    if (freeSpace > 0) {
                        int fixedVerticalWeight = (int) ((getFixedVerticalWeight(divLayoutParams) * i6) / f);
                        f -= getFixedVerticalWeight(divLayoutParams);
                        i6 -= fixedVerticalWeight;
                        remeasureChildVertical(childAt, i, i5, fixedVerticalWeight);
                    } else if (this.skippedMatchParentChildren.contains(childAt)) {
                        remeasureChildVertical(childAt, i, i5, Math.max(childAt.getMinimumHeight(), 0));
                    }
                }
                updateMaxCrossSize(i, divLayoutParams.getHorizontalMargins$div_release() + childAt.getMeasuredWidth());
                this.totalLength = getMaxLength(this.totalLength, divLayoutParams.getVerticalMargins$div_release() + childAt.getMeasuredHeight());
            }
        }
        this.maxCrossSize = Math.max(i3, getHorizontalPaddings$div_release() + this.maxCrossSize);
        KAssert kAssert = KAssert.INSTANCE;
        Integer valueOf = Integer.valueOf(i5);
        Integer valueOf2 = Integer.valueOf(this.maxCrossSize);
        if (Assert.isEnabled()) {
            Assert.assertEquals("Width of vertical container changed after remeasuring", valueOf, valueOf2);
        }
    }

    private final void remeasureMatchParentWidthChildren(int i, int i2, int i3) {
        int freeSpace = getFreeSpace(i3, i);
        float f = this.totalWeight;
        this.maxCrossSize = 0;
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        int childCount = getChildCount();
        int i4 = freeSpace;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
                    if (freeSpace > 0) {
                        int fixedHorizontalWeight = (int) ((getFixedHorizontalWeight(divLayoutParams) * i4) / f);
                        f -= getFixedHorizontalWeight(divLayoutParams);
                        i4 -= fixedHorizontalWeight;
                        remeasureChildHorizontal(childAt, i2, fixedHorizontalWeight);
                    } else {
                        remeasureChildHorizontal(childAt, i2, Math.max(childAt.getMinimumWidth(), 0));
                    }
                }
                updateMaxCrossSize(i2, divLayoutParams.getVerticalMargins$div_release() + childAt.getMeasuredHeight());
                this.totalLength = getMaxLength(this.totalLength, divLayoutParams.getHorizontalMargins$div_release() + childAt.getMeasuredWidth());
                updateBaselineOffset(childAt);
            }
        }
    }

    private final void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private final void updateBaselineOffset(View view) {
        int baseline;
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        if (divLayoutParams.isBaselineAligned() && (baseline = view.getBaseline()) != -1) {
            this.maxBaselineAscent = Math.max(this.maxBaselineAscent, ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + baseline);
            this.maxBaselineDescent = Math.max(this.maxBaselineDescent, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
        }
    }

    private final void updateMaxCrossSize(int i, int i2) {
        if (ViewsKt.isExact(i)) {
            return;
        }
        this.maxCrossSize = Math.max(this.maxCrossSize, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (!isVertical()) {
            int i = this.maxBaselineAscent;
            return i != -1 ? getPaddingTop() + i : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + childAt.getBaseline() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).topMargin;
    }

    public final Drawable getDividerDrawable() {
        return this.dividerDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getOrientation() {
        return ((Number) this.orientation$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getShowDividers() {
        return ((Number) this.showDividers$delegate.getValue(this, $$delegatedProperties[2])).intValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.dividerDrawable == null) {
            return;
        }
        if (isVertical()) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (isVertical()) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        this.totalLength = 0;
        this.maxCrossSize = 0;
        this.totalConstrainedLength = 0;
        this.totalMatchParentLength = 0;
        this.totalWeight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.childMeasuredState = 0;
        kxt0 kxt0Var = new kxt0(this);
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (!kxt0Var.hasNext()) {
                i4 = -1;
                break;
            }
            View next = kxt0Var.next();
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            if (!(next.getVisibility() == 8)) {
                break;
            } else {
                i4++;
            }
        }
        this.firstVisibleChildIndex = i4;
        kxt0 kxt0Var2 = new kxt0(this);
        int i5 = 0;
        while (kxt0Var2.hasNext()) {
            View next2 = kxt0Var2.next();
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            if (!(next2.getVisibility() == 8)) {
                i3 = i5;
            }
            i5++;
        }
        this.lastVisibleChildIndex = i3;
        if (isVertical()) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
        this.constrainedChildren.clear();
        this.crossMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f));
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (epx.f(this.dividerDrawable, drawable)) {
            return;
        }
        this.dividerDrawable = drawable;
        this.dividerWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.dividerHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerMargins(int i, int i2, int i3, int i4) {
        this.dividerMarginLeft = i;
        this.dividerMarginRight = i3;
        this.dividerMarginTop = i2;
        this.dividerMarginBottom = i4;
        requestLayout();
    }

    public final void setItemSpacing(int i) {
        if (this.itemSpacingPx != i) {
            this.itemSpacingPx = i;
            requestLayout();
        }
    }

    public final void setOrientation(int i) {
        this.orientation$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setShowDividers(int i) {
        this.showDividers$delegate.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public DivLayoutParams generateDefaultLayoutParams() {
        return isVertical() ? new DivLayoutParams(-1, -2) : new DivLayoutParams(-2, -2);
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }
}
