package com.yandex.go.superapp.orders.card.header.trails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import defpackage.c8h0;
import defpackage.cma1;
import defpackage.gn70;
import defpackage.mkh0;
import defpackage.ny61;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.TimerTextView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/trails/OrderCardTimerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgn70;", "binding", "Lgn70;", "timerPaddingLeft", CA20Status.STATUS_USER_I, "timerPaddingTop", "", "value", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "startTime", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCardTimerView extends FrameLayout {
    private final gn70 binding;
    private final int timerPaddingLeft;
    private final int timerPaddingTop;

    public OrderCardTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(mkh0.order_card_header_trail_timer, this);
        int i2 = c8h0.timer_view;
        TimerTextView timerTextView = (TimerTextView) cma1.O(i2, this);
        if (timerTextView == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
            throw null;
        }
        this.binding = new gn70(this, timerTextView);
        int u = tje.u(12, getContext());
        this.timerPaddingLeft = u;
        int u2 = tje.u(16, getContext());
        this.timerPaddingTop = u2;
        setPadding(u, u2, 0, 0);
    }

    public final Long getStartTime() {
        return this.binding.b.getStartTime();
    }

    public final void setStartTime(Long l) {
        this.binding.b.setStartTime(l);
    }

    public OrderCardTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderCardTimerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderCardTimerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
