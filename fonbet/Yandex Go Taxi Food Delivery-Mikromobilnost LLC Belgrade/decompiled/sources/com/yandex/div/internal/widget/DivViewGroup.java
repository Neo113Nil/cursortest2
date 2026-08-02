package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.gpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b&\u0018\u0000 32\u00020\u0001:\u000245B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001c\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001c\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0014¢\u0006\u0004\b \u0010!R0\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010.\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0014\u00100\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010&R\u0014\u00102\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010&¨\u00066"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "parentWidthMeasureSpec", "parentHeightMeasureSpec", "Lzy11;", "measureChild", "(Landroid/view/View;II)V", "baseMeasureChild", "widthUsed", "heightUsed", "measureChildWithMargins", "(Landroid/view/View;IIII)V", "baseMeasureChildWithMargins", "Landroid/view/ViewGroup$LayoutParams;", "p", "", "checkLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Z", "generateLayoutParams", "(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;", "lp", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "value", "gravity", CA20Status.STATUS_USER_I, "getGravity", "()I", "setGravity", "(I)V", "getGravity$annotations", "()V", "getHorizontalGravity$div_release", "horizontalGravity", "getVerticalGravity$div_release", "verticalGravity", "getHorizontalPaddings$div_release", "horizontalPaddings", "getVerticalPaddings$div_release", "verticalPaddings", "Companion", "gpl", "hpl", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DivViewGroup extends ViewGroup {
    public static final gpl Companion = new gpl();
    private int gravity;

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }

    public final void baseMeasureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
    }

    public final void baseMeasureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        super.measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return lp instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) lp) : lp instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) lp) : new DivLayoutParams(lp);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalGravity$div_release() {
        gpl gplVar = Companion;
        int i = this.gravity;
        gplVar.getClass();
        return i & 125829127;
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingRight() + getPaddingLeft();
    }

    public final int getVerticalGravity$div_release() {
        gpl gplVar = Companion;
        int i = this.gravity;
        gplVar.getClass();
        return i & 1879048304;
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingBottom() + getPaddingTop();
    }

    @Override // android.view.ViewGroup
    public void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        gpl gplVar = Companion;
        int horizontalPaddings$div_release = getHorizontalPaddings$div_release();
        int i = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        int minimumWidth = child.getMinimumWidth();
        int maxWidth = divLayoutParams.getMaxWidth();
        gplVar.getClass();
        child.measure(gpl.a(parentWidthMeasureSpec, horizontalPaddings$div_release, i, minimumWidth, maxWidth), gpl.a(parentHeightMeasureSpec, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        gpl gplVar = Companion;
        int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPaddings$div_release() + widthUsed;
        int i = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        int minimumWidth = child.getMinimumWidth();
        int maxWidth = divLayoutParams.getMaxWidth();
        gplVar.getClass();
        child.measure(gpl.a(parentWidthMeasureSpec, horizontalMargins$div_release, i, minimumWidth, maxWidth), gpl.a(parentHeightMeasureSpec, divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release() + heightUsed, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    public final void setGravity(int i) {
        if (this.gravity == i) {
            return;
        }
        gpl gplVar = Companion;
        gplVar.getClass();
        if ((125829127 & i) == 0) {
            i |= 8388611;
        }
        gplVar.getClass();
        if ((1879048304 & i) == 0) {
            i |= 48;
        }
        this.gravity = i;
        requestLayout();
    }

    public DivViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivViewGroup(Context context) {
        this(context, null, 0, 6, null);
    }

    public DivViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gravity = 8388659;
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new DivLayoutParams(getContext(), attrs);
    }
}
