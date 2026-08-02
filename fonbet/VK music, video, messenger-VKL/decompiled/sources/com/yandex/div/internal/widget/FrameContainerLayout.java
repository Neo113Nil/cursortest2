package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.an10;
import xsna.fpf0;
import xsna.g5g;
import xsna.p7f0;
import xsna.qcy;
import xsna.x9;
import xsna.zcl;

/* compiled from: FrameContainerLayout.kt */
/* loaded from: classes7.dex */
public class FrameContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
    private final p7f0 aspectRatio$delegate;
    private int childState;
    private final Rect foregroundPadding;
    private final Set<View> matchParentChildren;
    private int maxHeight;
    private int maxWidth;
    private final Set<View> measuredMatchParentChildren;
    private final Set<View> skippedMatchParentChildren;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0);
        fpf0.a.getClass();
        $$delegatedProperties = new qcy[]{mutablePropertyReference1Impl};
    }

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void considerMatchParentChildrenInMaxSize(int i, int i2) {
        int i3;
        int i4;
        if (!this.matchParentChildren.isEmpty()) {
            boolean isExact = ViewsKt.isExact(i);
            boolean isExact2 = ViewsKt.isExact(i2);
            if (!isExact || !isExact2) {
                boolean z = false;
                boolean z2 = !isExact && this.maxWidth == 0;
                if (!isExact2 && !getUseAspect() && this.maxHeight == 0) {
                    z = true;
                }
                if (z2 || z) {
                    for (View view : this.matchParentChildren) {
                        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
                        if (this.skippedMatchParentChildren.contains(view) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && z2) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && z))) {
                            i3 = i;
                            i4 = i2;
                            measureChildWithMargins(view, i3, 0, i4, 0);
                            this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                            this.skippedMatchParentChildren.remove(view);
                        } else {
                            i3 = i;
                            i4 = i2;
                        }
                        if (z2) {
                            updateMaxWidth(divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth());
                        }
                        if (z) {
                            updateMaxHeight(divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight());
                        }
                        i = i3;
                        i2 = i4;
                    }
                } else {
                    Iterator<T> it = this.matchParentChildren.iterator();
                    while (it.hasNext()) {
                        considerMatchParentMargins((View) it.next(), isExact, isExact2);
                    }
                }
            }
        }
    }

    private final void considerMatchParentMargins(View view, boolean z, boolean z2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        if (matchDynamicWidth(divLayoutParams, z)) {
            updateMaxWidth(divLayoutParams.getHorizontalMargins$div_release() + view.getMinimumWidth());
        }
        if (matchDynamicHeight(divLayoutParams, z2)) {
            updateMaxHeight(divLayoutParams.getVerticalMargins$div_release() + view.getMinimumHeight());
        }
    }

    private final int getDynamicHeight(int i, int i2, int i3) {
        int minimumHeight;
        if (ViewsKt.isExact(i2)) {
            return 0;
        }
        if (isDynamicAspect(i)) {
            return an10.b(i3 / getAspectRatio());
        }
        int verticalPadding = this.maxHeight + getVerticalPadding();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (verticalPadding < suggestedMinimumHeight) {
            verticalPadding = suggestedMinimumHeight;
        }
        Drawable foreground = getForeground();
        return (foreground == null || verticalPadding >= (minimumHeight = foreground.getMinimumHeight())) ? verticalPadding : minimumHeight;
    }

    private final int getDynamicWidth(int i) {
        int minimumWidth;
        if (ViewsKt.isExact(i)) {
            return 0;
        }
        int horizontalPadding = this.maxWidth + getHorizontalPadding();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (horizontalPadding < suggestedMinimumWidth) {
            horizontalPadding = suggestedMinimumWidth;
        }
        Drawable foreground = getForeground();
        return (foreground == null || horizontalPadding >= (minimumWidth = foreground.getMinimumWidth())) ? horizontalPadding : minimumWidth;
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.foregroundPadding.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.foregroundPadding.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.foregroundPadding.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.foregroundPadding.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    private final boolean isDynamicAspect(int i) {
        return getUseAspect() && !ViewsKt.isExact(i);
    }

    private final void layoutChildren(int i, int i2, int i3, int i4) {
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (i3 - i) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (i4 - i2) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(divLayoutParams.getGravity(), getLayoutDirection());
                int gravity = divLayoutParams.getGravity() & 112;
                int i6 = absoluteGravity & 7;
                int b = i6 != 1 ? i6 != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin + paddingLeftWithForeground : (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : x9.b(((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin, 2, paddingLeftWithForeground);
                int b2 = gravity != 16 ? gravity != 80 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + paddingTopWithForeground : (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin : x9.b(((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin, 2, paddingTopWithForeground);
                childAt.layout(b, b2, measuredWidth + b, measuredHeight + b2);
            }
        }
    }

    private final boolean matchDynamicHeight(DivLayoutParams divLayoutParams, boolean z) {
        return !z && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1;
    }

    private final boolean matchDynamicSize(DivLayoutParams divLayoutParams, boolean z, boolean z2) {
        return matchDynamicWidth(divLayoutParams, z) || matchDynamicHeight(divLayoutParams, z2);
    }

    private final boolean matchDynamicWidth(DivLayoutParams divLayoutParams, boolean z) {
        return !z && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
    }

    private final void measureChildWithDefinedSize(View view, int i, int i2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        boolean isExact = ViewsKt.isExact(i);
        boolean isExact2 = ViewsKt.isExact(i2);
        boolean z = ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
        int i3 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        boolean z2 = i3 == -1;
        if (!(isExact && isExact2) && (!isExact2 ? !(!isExact ? !(z && i3 <= 0) : !z2) : !z)) {
            if (matchDynamicSize(divLayoutParams, isExact, isExact2)) {
                this.skippedMatchParentChildren.add(view);
                return;
            }
            return;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        if (matchDynamicSize(divLayoutParams, isExact, isExact2)) {
            this.measuredMatchParentChildren.add(view);
        }
        if (!isExact && !z) {
            updateMaxWidth(divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth());
        }
        if (isExact2 || z2 || getUseAspect()) {
            return;
        }
        updateMaxHeight(divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight());
    }

    private final void remeasureMatchParentChild(View view, int i, int i2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPadding();
        int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + getVerticalPadding();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            i = ViewsKt.makeExactSpec(getMeasuredWidth());
        }
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        int childMeasureSpec = companion.getChildMeasureSpec(i, horizontalMargins$div_release, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth());
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            i2 = ViewsKt.makeExactSpec(getMeasuredHeight());
        }
        view.measure(childMeasureSpec, companion.getChildMeasureSpec(i2, verticalMargins$div_release, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        if (this.skippedMatchParentChildren.contains(view)) {
            this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        }
    }

    private final void remeasureWrapContentConstrainedChild(View view, int i, int i2) {
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) view.getLayoutParams())).height == -3) {
            measureChildWithMargins(view, i, 0, i2, 0);
            this.matchParentChildren.remove(view);
        }
    }

    private final void remeasureWrapContentConstrainedChildren(int i, int i2) {
        if (isDynamicAspect(i)) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    remeasureWrapContentConstrainedChild(childAt, i, i2);
                }
            }
        }
    }

    private final void updateMaxHeight(int i) {
        this.maxHeight = Math.max(this.maxHeight, i);
    }

    private final void updateMaxWidth(int i) {
        this.maxWidth = Math.max(this.maxWidth, i);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        layoutChildren(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.childState = 0;
        boolean isExact = ViewsKt.isExact(i);
        if (getUseAspect()) {
            i2 = !isExact ? View.MeasureSpec.makeMeasureSpec(0, 0) : ViewsKt.makeExactSpec(an10.b(View.MeasureSpec.getSize(i) / getAspectRatio()));
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChildWithDefinedSize(childAt, i, i2);
            }
        }
        g5g.y(this.measuredMatchParentChildren, this.matchParentChildren);
        g5g.y(this.skippedMatchParentChildren, this.matchParentChildren);
        considerMatchParentChildrenInMaxSize(i, i2);
        int resolveSizeAndState = View.resolveSizeAndState(getDynamicWidth(i), i, this.childState);
        int dynamicHeight = getDynamicHeight(i, i2, 16777215 & resolveSizeAndState);
        if (ViewsKt.isUnspecified(i2)) {
            i2 = ViewsKt.makeExactSpec(dynamicHeight);
            remeasureWrapContentConstrainedChildren(i, i2);
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(dynamicHeight, i2, this.childState << 16));
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            remeasureMatchParentChild((View) it.next(), i, i2);
        }
        this.measuredMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
        this.matchParentChildren.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (getForegroundGravity() == i) {
            return;
        }
        super.setForegroundGravity(i);
        if (getForegroundGravity() != 119 || getForeground() == null) {
            this.foregroundPadding.setEmpty();
        } else {
            getForeground().getPadding(this.foregroundPadding);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public FrameContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.foregroundPadding = new Rect();
        this.measuredMatchParentChildren = new LinkedHashSet();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.matchParentChildren = new LinkedHashSet();
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
    }
}
