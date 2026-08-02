package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.bb1;
import defpackage.imh0;
import defpackage.kgx;
import defpackage.lhc;
import defpackage.qoi0;
import defpackage.sng0;
import defpackage.wv5;
import defpackage.xzr;
import defpackage.z9h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/onsale/OfferSwitchView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/google/android/material/card/MaterialCardView;", "card$delegate", "Lwv5;", "getCard", "()Lcom/google/android/material/card/MaterialCardView;", "card", "pay-sdk-ui-core-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferSwitchView extends FrameLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties;

    /* renamed from: card$delegate, reason: from kotlin metadata */
    private final wv5 card;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("card", 0, "getCard()Lcom/google/android/material/card/MaterialCardView;", OfferSwitchView.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
    }

    public OfferSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.card = new wv5(new xzr(this, z9h0.offer_switch_card, 1));
        bb1.v(this, imh0.pay_sdk_view_offer_switch, true);
        int o = bb1.o(sng0.pay_sdk_primaryBlockColor, this);
        getCard().setCardBackgroundColor(lhc.f(o, 128));
        getCard().setStrokeColor(lhc.f(o, PollMessageDraft.MAX_ANSWER_LENGTH));
    }

    private final MaterialCardView getCard() {
        return (MaterialCardView) this.card.a($$delegatedProperties[0]);
    }

    public OfferSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OfferSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public OfferSwitchView(Context context) {
        this(context, null, 0, 6, null);
    }
}
