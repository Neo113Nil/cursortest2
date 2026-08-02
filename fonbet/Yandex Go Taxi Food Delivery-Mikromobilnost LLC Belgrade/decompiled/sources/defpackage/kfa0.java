package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaymentOptionsDto;

/* loaded from: classes5.dex */
public abstract class kfa0 {
    public static final ifa0 a(PaymentOptionsDto paymentOptionsDto) {
        String paymentType = paymentOptionsDto.getPaymentType();
        String paymentId = paymentOptionsDto.getPaymentId();
        PaymentOptionsDto.AlertPopupDto alertPopup = paymentOptionsDto.getAlertPopup();
        return new ifa0(paymentType, paymentId, alertPopup != null ? new pv90(alertPopup.getTitle(), alertPopup.getMessage(), alertPopup.getPrimaryButtonText(), alertPopup.getSecondaryButtonText()) : null);
    }
}
