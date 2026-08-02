package defpackage;

import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.CardInputView;

/* loaded from: classes2.dex */
public final class cg8 implements bg8 {
    public final CardInputMode a;
    public CardInputView b;
    public cx7 c;

    public cg8(CardInputMode cardInputMode) {
        this.a = cardInputMode;
    }

    public final void a(CardInputView cardInputView) {
        CardInputView cardInputView2 = this.b;
        if (cardInputView2 != null) {
            cardInputView2.setOnStateChangeListener(null);
            cardInputView2.setMaskedCardNumberListener(null);
            cardInputView2.setCardPaymentSystemListener(null);
        }
        if (cardInputView != null) {
            cardInputView.setOnStateChangeListener(this.c);
            cardInputView.setMaskedCardNumberListener(null);
            cardInputView.setCardPaymentSystemListener(null);
        }
        this.b = cardInputView;
    }

    @Override // defpackage.bg8
    public final CardInputMode getMode() {
        return this.a;
    }

    @Override // defpackage.bg8
    public final void proceedToCardDetails() {
        CardInputView cardInputView = this.b;
        if (cardInputView != null) {
            cardInputView.proceedToCardDetails();
        }
    }

    @Override // defpackage.bg8
    public final void provideCardData() {
        CardInputView cardInputView = this.b;
        if (cardInputView != null) {
            cardInputView.provideCardData();
        }
    }

    @Override // defpackage.bg8
    public final void setOnStateChangeListener(tls tlsVar) {
        this.c = (cx7) tlsVar;
        CardInputView cardInputView = this.b;
        if (cardInputView != null) {
            cardInputView.setOnStateChangeListener(tlsVar);
        }
    }
}
