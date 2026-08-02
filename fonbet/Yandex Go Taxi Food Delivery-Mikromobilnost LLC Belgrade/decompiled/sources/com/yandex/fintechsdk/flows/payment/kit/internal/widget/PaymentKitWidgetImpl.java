package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget;
import com.yandex.fintechsdk.flows.payment.kit.api.widget.WidgetState;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.hnr0;
import defpackage.lz40;
import defpackage.nzm;
import defpackage.pz40;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R,\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/widget/PaymentKitWidgetImpl;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/widget/PaymentKitWidget;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "params", "Lzy11;", "reload", "(Ljava/util/Map;)V", "viewHeight", "showPlaceholder", "(I)V", "Landroid/view/View;", "view", "showContent", "(Landroid/view/View;)V", "showEmpty", "()V", "Lpz40;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/widget/WidgetState;", ClidProvider.STATE, "Lpz40;", "getState", "()Lpz40;", "Llz40;", "_externalReloadTrigger", "Llz40;", "Lhnr0;", "externalReloadTrigger", "Lhnr0;", "getExternalReloadTrigger$flows_payment_kit_release", "()Lhnr0;", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentKitWidgetImpl extends PaymentKitWidget {
    private final lz40 _externalReloadTrigger;
    private final hnr0 externalReloadTrigger;
    private final pz40 state;

    public PaymentKitWidgetImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        this.state = bvf0.c(WidgetState.LOADING);
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this._externalReloadTrigger = c;
        this.externalReloadTrigger = kotlinx.coroutines.flow.e.c(c);
    }

    /* renamed from: getExternalReloadTrigger$flows_payment_kit_release, reason: from getter */
    public final hnr0 getExternalReloadTrigger() {
        return this.externalReloadTrigger;
    }

    @Override // com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget
    public void reload(Map<String, String> params) {
        this._externalReloadTrigger.g(params);
    }

    public final void showContent(View view) {
        removeAllViews();
        addView(view);
        setVisibility(0);
        ((r0) getState()).l(WidgetState.READY);
    }

    public final void showEmpty() {
        removeAllViews();
        setVisibility(8);
        ((r0) getState()).l(WidgetState.ERROR);
    }

    public final void showPlaceholder(int viewHeight) {
        removeAllViews();
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) nzm.q(LayoutInflater.from(getContext()), this).b;
        shimmerFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (viewHeight * getResources().getDisplayMetrics().density)));
        addView(shimmerFrameLayout);
        setVisibility(0);
        ((r0) getState()).l(WidgetState.LOADING);
    }

    @Override // com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget
    public pz40 getState() {
        return this.state;
    }

    public PaymentKitWidgetImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PaymentKitWidgetImpl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PaymentKitWidgetImpl(Context context) {
        this(context, null, 0, 6, null);
    }
}
