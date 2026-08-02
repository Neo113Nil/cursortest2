package defpackage;

import com.yandex.payment.sdk.ui.CardInputMode;

/* loaded from: classes2.dex */
public interface bg8 {
    CardInputMode getMode();

    void proceedToCardDetails();

    void provideCardData();

    void setCardPaymentSystemListener(tls tlsVar);

    void setMaskedCardNumberListener(tls tlsVar);

    void setOnStateChangeListener(tls tlsVar);
}
