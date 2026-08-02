package com.yandex.go.taxi.order.search.ui.views;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.pin.api.v1.PinV1Component;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.wtg0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/yandex/go/taxi/order/search/ui/views/PinLocationView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/PointF;", "anchor", "Lzy11;", "applyAnchor", "(Landroid/graphics/PointF;)V", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View;", "pin", "pointColor", "setPin", "(Landroid/view/View;I)V", "containsPin", "()Z", "setAnchorPoint", "pinV1BottomMargin", CA20Status.STATUS_USER_I, "pinV2BottomMargin", "Lcom/yandex/go/taxi/order/search/ui/views/PinPointView;", "locationPoint", "Lcom/yandex/go/taxi/order/search/ui/views/PinPointView;", "lastAnchor", "Landroid/graphics/PointF;", "pinView", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinLocationView extends LinearLayout {
    public static final int $stable = 8;
    private PointF lastAnchor;
    private final PinPointView locationPoint;
    private final int pinV1BottomMargin;
    private final int pinV2BottomMargin;
    private View pinView;

    /* JADX WARN: Multi-variable type inference failed */
    public PinLocationView(Context context) {
        super(context);
        this.pinV1BottomMargin = -tje.r(mrg0.go_design_m_space, getContext());
        this.pinV2BottomMargin = -tje.r(wtg0.anchored_pin_bottom_space, getContext());
        PinPointView pinPointView = new PinPointView(context, null, 2, 0 == true ? 1 : 0);
        this.locationPoint = pinPointView;
        this.lastAnchor = new PointF(0.0f, 0.0f);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(pinPointView, layoutParams);
    }

    private final void applyAnchor(PointF anchor) {
        View view = this.pinView;
        if (view == null || view.getMeasuredWidth() != 0) {
            setX(anchor.x - (getMeasuredWidth() / 2.0f));
            setY((this.locationPoint.getMeasuredHeight() / 2.0f) + (anchor.y - getMeasuredHeight()));
        }
    }

    public final boolean containsPin() {
        return this.pinView != null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        setAnchorPoint(this.lastAnchor);
    }

    public final void setAnchorPoint(PointF anchor) {
        this.lastAnchor = anchor;
        applyAnchor(anchor);
    }

    public final void setPin(View pin, int pointColor) {
        if (!jl40.l(this.pinView, pin)) {
            View view = this.pinView;
            if (view != null) {
                removeView(view);
            }
            this.pinView = pin;
            if (pin != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                layoutParams.bottomMargin = pin instanceof PinV1Component ? this.pinV1BottomMargin : this.pinV2BottomMargin;
                addView(pin, 0, layoutParams);
            }
        }
        this.locationPoint.setOutlineColor(pointColor);
        applyAnchor(this.lastAnchor);
    }
}
