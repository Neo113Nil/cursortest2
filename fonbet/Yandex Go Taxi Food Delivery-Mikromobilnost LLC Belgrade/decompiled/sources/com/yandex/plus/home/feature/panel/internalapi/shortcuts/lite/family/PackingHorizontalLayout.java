package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.h8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/family/PackingHorizontalLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "changed", "l", "t", "r", "b", "Lzy11;", "onLayout", "(ZIIII)V", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PackingHorizontalLayout extends FrameLayout {
    public /* synthetic */ PackingHorizontalLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int i;
        int measuredWidth;
        h8 h8Var = new h8(3, this);
        int i2 = 0;
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            int measuredWidth2 = view.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int marginStart = measuredWidth2 + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            i2 += marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
        }
        int width = ((getWidth() - getPaddingStart()) - getPaddingEnd()) - i2;
        int floor = (getChildCount() - 1 <= 0 || width >= 0) ? 0 : (int) Math.floor(width / r10);
        h8 h8Var2 = new h8(3, this);
        View view2 = null;
        while (h8Var2.hasNext()) {
            View view3 = (View) h8Var2.next();
            int paddingTop = getPaddingTop();
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i3 = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            int measuredHeight = view3.getMeasuredHeight() + i3;
            if (getLayoutDirection() == 1) {
                if (view2 != null) {
                    int left = view2.getLeft();
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    int i4 = left - (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
                    ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    measuredWidth = (i4 - (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) - floor;
                } else {
                    int width2 = getWidth() - getPaddingRight();
                    ViewGroup.LayoutParams layoutParams6 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    measuredWidth = width2 - (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0);
                }
                i = measuredWidth - view3.getMeasuredWidth();
            } else {
                if (view2 != null) {
                    int right = view2.getRight();
                    ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    int i5 = right + (marginLayoutParams5 != null ? marginLayoutParams5.rightMargin : 0);
                    ViewGroup.LayoutParams layoutParams8 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    i = i5 + (marginLayoutParams6 != null ? marginLayoutParams6.leftMargin : 0) + floor;
                } else {
                    int paddingLeft = getPaddingLeft();
                    ViewGroup.LayoutParams layoutParams9 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
                    i = paddingLeft + (marginLayoutParams7 != null ? marginLayoutParams7.leftMargin : 0);
                }
                measuredWidth = view3.getMeasuredWidth() + i;
            }
            view3.layout(i, i3, measuredWidth, measuredHeight);
            view2 = view3;
        }
    }

    public PackingHorizontalLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PackingHorizontalLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public PackingHorizontalLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public PackingHorizontalLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
