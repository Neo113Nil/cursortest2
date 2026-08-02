package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Money;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Payment implements Serializable {
    private PaymentMedia paymentMedia;
    private Money price;

    public Payment(PaymentMedia paymentMedia, Money money) {
        if (money == null) {
            ny61.g("Required field \"price\" cannot be null");
            throw null;
        }
        this.paymentMedia = paymentMedia;
        this.price = money;
    }

    public PaymentMedia getPaymentMedia() {
        return this.paymentMedia;
    }

    public Money getPrice() {
        return this.price;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.paymentMedia = (PaymentMedia) archive.add((Archive) this.paymentMedia, true, (Class<Archive>) PaymentMedia.class);
        this.price = (Money) archive.add((Archive) this.price, false, (Class<Archive>) Money.class);
    }

    public Payment() {
    }
}
