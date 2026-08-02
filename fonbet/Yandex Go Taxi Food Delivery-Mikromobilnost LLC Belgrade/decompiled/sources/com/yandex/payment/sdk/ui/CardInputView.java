package com.yandex.payment.sdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.bg8;
import defpackage.tls;
import defpackage.vv90;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/payment/sdk/ui/CardInputView;", "Lbg8;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CardInputView extends FrameLayout implements bg8 {
    public /* synthetic */ CardInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public abstract /* synthetic */ void focusInput();

    public abstract /* synthetic */ CardInputMode getMode();

    public abstract /* synthetic */ void proceedToCardDetails();

    public abstract /* synthetic */ void provideCardData();

    public abstract /* synthetic */ void reset();

    public /* bridge */ void setCardForbiddenState() {
    }

    public abstract /* synthetic */ void setCardPaymentSystemListener(tls tlsVar);

    public abstract /* synthetic */ void setMaskedCardNumberListener(tls tlsVar);

    public /* bridge */ void setNfcCardAndDate(String str, String str2) {
    }

    public abstract /* synthetic */ void setOnStateChangeListener(tls tlsVar);

    public abstract /* synthetic */ void setPaymentApi(vv90 vv90Var);

    public abstract /* synthetic */ void setSaveCardOnPayment(boolean z);

    public CardInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CardInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CardInputView(Context context) {
        this(context, null, 0, 6, null);
    }
}
