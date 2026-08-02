package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.widget.b;
import defpackage.gpl;
import defpackage.kgx;
import defpackage.m810;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.x4e;
import defpackage.xbi0;
import defpackage.y83;
import defpackage.ycc;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u0013*\u00020$2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0013*\u00020$2\u0006\u0010%\u001a\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u0013*\u00020$2\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010\u000eJ\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u0010\u000eJ\u001f\u00100\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010\u0012J'\u00101\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J'\u00106\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010\u0012J'\u0010;\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010#J'\u0010<\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010#J/\u0010A\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR+\u0010W\u001a\u00020O2\u0006\u0010P\u001a\u00020O8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0014\u0010^\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0014\u0010`\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0014\u0010b\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u001cR\u0014\u0010d\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010YR\u0014\u0010f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010Y¨\u0006g"}, d2 = {"Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Ly83;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gravity", "Lzy11;", "setForegroundGravity", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "shouldDelayChildPressedState", "()Z", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/View;", "child", "measureChildWithDefinedSize", "(Landroid/view/View;II)V", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "exactWidth", "exactHeight", "matchDynamicSize", "(Lcom/yandex/div/internal/widget/DivLayoutParams;ZZ)Z", "matchDynamicWidth", "(Lcom/yandex/div/internal/widget/DivLayoutParams;Z)Z", "matchDynamicHeight", "childWidth", "updateMaxWidth", "childHeight", "updateMaxHeight", "considerMatchParentChildrenInMaxSize", "considerMatchParentMargins", "(Landroid/view/View;ZZ)V", "getDynamicWidth", "(I)I", "widthSize", "getDynamicHeight", "(III)I", "isDynamicAspect", "(I)Z", "remeasureWrapContentConstrainedChildren", "remeasureWrapContentConstrainedChild", "remeasureMatchParentChild", "left", "top", "right", "bottom", "layoutChildren", "(IIII)V", "Landroid/graphics/Rect;", "foregroundPadding", "Landroid/graphics/Rect;", "", "measuredMatchParentChildren", "Ljava/util/Set;", "skippedMatchParentChildren", "matchParentChildren", "maxWidth", CA20Status.STATUS_USER_I, "maxHeight", "childState", "", "<set-?>", "aspectRatio$delegate", "Lxbi0;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getPaddingLeftWithForeground", "()I", "paddingLeftWithForeground", "getPaddingRightWithForeground", "paddingRightWithForeground", "getPaddingTopWithForeground", "paddingTopWithForeground", "getPaddingBottomWithForeground", "paddingBottomWithForeground", "getUseAspect", "useAspect", "getHorizontalPadding", "horizontalPadding", "getVerticalPadding", "verticalPadding", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class FrameContainerLayout extends DivViewGroup implements y83 {
    static final /* synthetic */ kgx[] $$delegatedProperties;

    /* renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    private final xbi0 aspectRatio;
    private int childState;
    private final Rect foregroundPadding;
    private final Set<View> matchParentChildren;
    private int maxHeight;
    private int maxWidth;
    private final Set<View> measuredMatchParentChildren;
    private final Set<View> skippedMatchParentChildren;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("aspectRatio", 0, "getAspectRatio()F", FrameContainerLayout.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{mutablePropertyReference1Impl};
    }

    public FrameContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.foregroundPadding = new Rect();
        this.measuredMatchParentChildren = new LinkedHashSet();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.matchParentChildren = new LinkedHashSet();
        this.aspectRatio = b.a();
    }

    private final void considerMatchParentChildrenInMaxSize(int widthMeasureSpec, int heightMeasureSpec) {
        FrameContainerLayout frameContainerLayout;
        int i;
        int i2;
        if (this.matchParentChildren.isEmpty()) {
            return;
        }
        boolean I = q5z.I(widthMeasureSpec);
        boolean I2 = q5z.I(heightMeasureSpec);
        if (I && I2) {
            return;
        }
        boolean z = false;
        boolean z2 = !I && this.maxWidth == 0;
        if (!I2 && !getUseAspect() && this.maxHeight == 0) {
            z = true;
        }
        if (!z2 && !z) {
            Iterator<T> it = this.matchParentChildren.iterator();
            while (it.hasNext()) {
                considerMatchParentMargins((View) it.next(), I, I2);
            }
            return;
        }
        for (View view : this.matchParentChildren) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
            if (this.skippedMatchParentChildren.contains(view) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && z2) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && z))) {
                frameContainerLayout = this;
                i = widthMeasureSpec;
                i2 = heightMeasureSpec;
                frameContainerLayout.measureChildWithMargins(view, i, 0, i2, 0);
                frameContainerLayout.childState = View.combineMeasuredStates(frameContainerLayout.childState, view.getMeasuredState());
                frameContainerLayout.skippedMatchParentChildren.remove(view);
            } else {
                frameContainerLayout = this;
                i = widthMeasureSpec;
                i2 = heightMeasureSpec;
            }
            if (z2) {
                frameContainerLayout.updateMaxWidth(divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth());
            }
            if (z) {
                frameContainerLayout.updateMaxHeight(divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight());
            }
            this = frameContainerLayout;
            widthMeasureSpec = i;
            heightMeasureSpec = i2;
        }
    }

    private final void considerMatchParentMargins(View child, boolean exactWidth, boolean exactHeight) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        if (matchDynamicWidth(divLayoutParams, exactWidth)) {
            updateMaxWidth(divLayoutParams.getHorizontalMargins$div_release() + child.getMinimumWidth());
        }
        if (matchDynamicHeight(divLayoutParams, exactHeight)) {
            updateMaxHeight(divLayoutParams.getVerticalMargins$div_release() + child.getMinimumHeight());
        }
    }

    private final int getDynamicHeight(int widthMeasureSpec, int heightMeasureSpec, int widthSize) {
        int minimumHeight;
        if (q5z.I(heightMeasureSpec)) {
            return 0;
        }
        if (isDynamicAspect(widthMeasureSpec)) {
            return m810.b(widthSize / getAspectRatio());
        }
        int verticalPadding = this.maxHeight + getVerticalPadding();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (verticalPadding < suggestedMinimumHeight) {
            verticalPadding = suggestedMinimumHeight;
        }
        Drawable foreground = getForeground();
        return (foreground == null || verticalPadding >= (minimumHeight = foreground.getMinimumHeight())) ? verticalPadding : minimumHeight;
    }

    private final int getDynamicWidth(int widthMeasureSpec) {
        int minimumWidth;
        if (q5z.I(widthMeasureSpec)) {
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
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    private final boolean isDynamicAspect(int widthMeasureSpec) {
        return getUseAspect() && !q5z.I(widthMeasureSpec);
    }

    private final void layoutChildren(int left, int top, int right, int bottom) {
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (right - left) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (bottom - top) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(divLayoutParams.getGravity(), getLayoutDirection());
                int gravity = divLayoutParams.getGravity() & 112;
                int i2 = absoluteGravity & 7;
                int c = i2 != 1 ? i2 != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin + paddingLeftWithForeground : (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : x4e.c(((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin, 2, paddingLeftWithForeground);
                int c2 = gravity != 16 ? gravity != 80 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + paddingTopWithForeground : (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin : x4e.c(((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin, 2, paddingTopWithForeground);
                childAt.layout(c, c2, measuredWidth + c, measuredHeight + c2);
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

    private final void measureChildWithDefinedSize(View child, int widthMeasureSpec, int heightMeasureSpec) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        boolean I = q5z.I(widthMeasureSpec);
        boolean I2 = q5z.I(heightMeasureSpec);
        boolean z = ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
        int i = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        boolean z2 = i == -1;
        if (!(I && I2) && (!I2 ? !(!I ? !(z && i <= 0) : !z2) : !z)) {
            if (matchDynamicSize(divLayoutParams, I, I2)) {
                this.skippedMatchParentChildren.add(child);
                return;
            }
            return;
        }
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        this.childState = View.combineMeasuredStates(this.childState, child.getMeasuredState());
        if (matchDynamicSize(divLayoutParams, I, I2)) {
            this.measuredMatchParentChildren.add(child);
        }
        if (!I && !z) {
            updateMaxWidth(divLayoutParams.getHorizontalMargins$div_release() + child.getMeasuredWidth());
        }
        if (I2 || z2 || getUseAspect()) {
            return;
        }
        updateMaxHeight(divLayoutParams.getVerticalMargins$div_release() + child.getMeasuredHeight());
    }

    private final void remeasureMatchParentChild(View child, int widthMeasureSpec, int heightMeasureSpec) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPadding();
        int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + getVerticalPadding();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        }
        gpl gplVar = DivViewGroup.Companion;
        int i = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        int minimumWidth = child.getMinimumWidth();
        int maxWidth = divLayoutParams.getMaxWidth();
        gplVar.getClass();
        int a = gpl.a(widthMeasureSpec, horizontalMargins$div_release, i, minimumWidth, maxWidth);
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        }
        child.measure(a, gpl.a(heightMeasureSpec, verticalMargins$div_release, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        if (this.skippedMatchParentChildren.contains(child)) {
            this.childState = View.combineMeasuredStates(this.childState, child.getMeasuredState());
        }
    }

    private final void remeasureWrapContentConstrainedChild(View child, int widthMeasureSpec, int heightMeasureSpec) {
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) child.getLayoutParams())).height == -3) {
            measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
            this.matchParentChildren.remove(child);
        }
    }

    private final void remeasureWrapContentConstrainedChildren(int widthMeasureSpec, int heightMeasureSpec) {
        if (isDynamicAspect(widthMeasureSpec)) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    remeasureWrapContentConstrainedChild(childAt, widthMeasureSpec, heightMeasureSpec);
                }
            }
        }
    }

    private final void updateMaxHeight(int childHeight) {
        this.maxHeight = Math.max(this.maxHeight, childHeight);
    }

    private final void updateMaxWidth(int childWidth) {
        this.maxWidth = Math.max(this.maxWidth, childWidth);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        layoutChildren(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.childState = 0;
        boolean I = q5z.I(widthMeasureSpec);
        if (getUseAspect()) {
            heightMeasureSpec = !I ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(m810.b(View.MeasureSpec.getSize(widthMeasureSpec) / getAspectRatio()), 1073741824);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                measureChildWithDefinedSize(childAt, widthMeasureSpec, heightMeasureSpec);
            }
        }
        ycc.r(this.measuredMatchParentChildren, this.matchParentChildren);
        ycc.r(this.skippedMatchParentChildren, this.matchParentChildren);
        considerMatchParentChildrenInMaxSize(widthMeasureSpec, heightMeasureSpec);
        int resolveSizeAndState = View.resolveSizeAndState(getDynamicWidth(widthMeasureSpec), widthMeasureSpec, this.childState);
        int dynamicHeight = getDynamicHeight(widthMeasureSpec, heightMeasureSpec, 16777215 & resolveSizeAndState);
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(dynamicHeight, 1073741824);
            remeasureWrapContentConstrainedChildren(widthMeasureSpec, heightMeasureSpec);
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(dynamicHeight, heightMeasureSpec, this.childState << 16));
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            remeasureMatchParentChild((View) it.next(), widthMeasureSpec, heightMeasureSpec);
        }
        this.measuredMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
        this.matchParentChildren.clear();
    }

    @Override // defpackage.y83
    public void setAspectRatio(float f) {
        this.aspectRatio.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    @Override // android.view.View
    public void setForegroundGravity(int gravity) {
        if (getForegroundGravity() == gravity) {
            return;
        }
        super.setForegroundGravity(gravity);
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

    public FrameContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public FrameContainerLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
