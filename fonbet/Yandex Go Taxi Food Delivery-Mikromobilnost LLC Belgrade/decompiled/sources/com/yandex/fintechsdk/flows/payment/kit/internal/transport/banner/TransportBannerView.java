package com.yandex.fintechsdk.flows.payment.kit.internal.transport.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import defpackage.m011;
import defpackage.nzm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/transport/banner/TransportBannerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "showPlaceholder", "()V", "Landroid/view/View;", "view", "showContent", "(Landroid/view/View;)V", "showEmpty", "Companion", "m011", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TransportBannerView extends FrameLayout {
    private static final m011 Companion = new m011();

    @Deprecated
    public static final int PLACEHOLDER_HEIGHT_DP = 70;

    public /* synthetic */ TransportBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void showContent(View view) {
        removeAllViews();
        addView(view);
        setVisibility(0);
    }

    public final void showEmpty() {
        removeAllViews();
        setVisibility(8);
    }

    public final void showPlaceholder() {
        removeAllViews();
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) nzm.q(LayoutInflater.from(getContext()), this).b;
        shimmerFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (70.0f * getResources().getDisplayMetrics().density)));
        addView(shimmerFrameLayout);
        setVisibility(0);
    }

    public TransportBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TransportBannerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TransportBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
    }
}
