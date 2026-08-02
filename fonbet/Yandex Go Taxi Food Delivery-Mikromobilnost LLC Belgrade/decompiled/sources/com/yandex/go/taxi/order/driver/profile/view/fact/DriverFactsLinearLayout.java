package com.yandex.go.taxi.order.driver.profile.view.fact;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.aub;
import defpackage.bub;
import defpackage.iim;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.xw31;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\nR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/go/taxi/order/driver/profile/view/fact/DriverFactsLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "visibleWidth", "Lzy11;", "setLayoutMeasuredDimensions", "(I)V", "top", "layoutOnLeft", "correctPaddingAndInvalidateIfNeeded", "()V", "l", "r", "layoutOnCenter", "(III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "t", "b", "onLayout", "(ZIIII)V", "setVisibleWidth", "paddingBetweenChildren", CA20Status.STATUS_USER_I, "maxChildWidth", "padding", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DriverFactsLinearLayout extends LinearLayout {
    public static final int $stable = 8;
    private final int maxChildWidth;
    private final int padding;
    private int paddingBetweenChildren;
    private int visibleWidth;

    public DriverFactsLinearLayout(Context context) {
        super(context);
        this.paddingBetweenChildren = tje.u(24, getContext());
        this.maxChildWidth = tje.u(144, getContext());
        this.padding = getResources().getDimensionPixelOffset(mrg0.go_design_m_space);
    }

    private final void correctPaddingAndInvalidateIfNeeded() {
        int i;
        int i2 = this.paddingBetweenChildren;
        int i3 = this.padding;
        int childCount = getChildCount() - 1;
        int i4 = 0;
        while (true) {
            if (i4 < childCount) {
                int measuredWidth = getChildAt(i4).getMeasuredWidth() + i3;
                int i5 = this.visibleWidth - measuredWidth;
                if (1 <= i5 && i5 < (i = this.paddingBetweenChildren) && i4 > 0) {
                    i2 = (((i / 2) + i5) / i4) + i;
                    break;
                } else {
                    i3 = this.padding + measuredWidth;
                    i4++;
                }
            } else {
                break;
            }
        }
        if (this.paddingBetweenChildren != i2) {
            this.paddingBetweenChildren = i2;
            invalidate();
        }
    }

    private final void layoutOnCenter(int l, int r, int top) {
        int i = 1;
        if (getChildCount() < 1) {
            return;
        }
        int childCount = ((r - l) - (this.padding * 2)) / getChildCount();
        xw31.p(this, Integer.valueOf(this.padding), new iim(top, this, i), new bub(3), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer layoutOnCenter$lambda$0(int i, DriverFactsLinearLayout driverFactsLinearLayout, View view, Integer num) {
        int measuredWidth = view.getMeasuredWidth() + (num != null ? num.intValue() : 0);
        view.layout(num != null ? num.intValue() : 0, i, measuredWidth, view.getMeasuredHeight());
        return Integer.valueOf(measuredWidth + driverFactsLinearLayout.paddingBetweenChildren);
    }

    private final void layoutOnLeft(int top) {
        xw31.p(this, Integer.valueOf(this.padding), new iim(top, this, 0), new bub(3), false);
        correctPaddingAndInvalidateIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer layoutOnLeft$lambda$0(int i, DriverFactsLinearLayout driverFactsLinearLayout, View view, Integer num) {
        int measuredWidth = view.getMeasuredWidth() + (num != null ? num.intValue() : 0);
        view.layout(num != null ? num.intValue() : 0, i, measuredWidth, view.getMeasuredHeight());
        return Integer.valueOf(measuredWidth + driverFactsLinearLayout.paddingBetweenChildren);
    }

    private static final void onMeasure$lambda$0(int i, int i2, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutMeasuredDimensions(int visibleWidth) {
        Integer num = (Integer) xw31.p(this, 0, new aub(6), new bub((boolean) (null == true ? 1 : 0)), false);
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) xw31.p(this, 0, new aub(7), new bub((boolean) (null == true ? 1 : 0)), false);
        int childCount = ((getChildCount() - 1) * this.paddingBetweenChildren) + (this.padding * 2) + (num2 != null ? num2.intValue() : 0);
        if (getChildCount() > 3 && childCount >= visibleWidth) {
            visibleWidth = childCount;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(visibleWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(intValue, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer setLayoutMeasuredDimensions$lambda$0(View view, Integer num) {
        return Integer.valueOf(Math.max(num != null ? num.intValue() : 0, view.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer setLayoutMeasuredDimensions$lambda$1(View view, Integer num) {
        return Integer.valueOf(view.getMeasuredWidth() + (num != null ? num.intValue() : 0));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (getMeasuredWidth() > this.visibleWidth) {
            layoutOnLeft(t);
        } else {
            layoutOnCenter(l, r, t);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getChildCount() == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int childCount = getChildCount() > 3 ? this.maxChildWidth : ((this.visibleWidth - ((getChildCount() - 1) * this.paddingBetweenChildren)) - (this.padding * 2)) / getChildCount();
        Rect rect = xw31.a;
        int childCount2 = getChildCount();
        for (int i = 0; i < childCount2; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                onMeasure$lambda$0(childCount, heightMeasureSpec, childAt);
            }
        }
        setLayoutMeasuredDimensions(this.visibleWidth);
    }

    public final void setVisibleWidth(int visibleWidth) {
        this.visibleWidth = visibleWidth;
    }
}
