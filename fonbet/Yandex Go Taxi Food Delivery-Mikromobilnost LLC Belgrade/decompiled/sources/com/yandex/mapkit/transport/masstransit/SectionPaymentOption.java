package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SectionPaymentOption implements Serializable {
    private AppliedFare appliedFare;
    private Payment payment;

    public enum AppliedFare {
        BOARDING,
        TRANSFER
    }

    public SectionPaymentOption(Payment payment, AppliedFare appliedFare) {
        if (appliedFare == null) {
            ny61.g("Required field \"appliedFare\" cannot be null");
            throw null;
        }
        this.payment = payment;
        this.appliedFare = appliedFare;
    }

    public AppliedFare getAppliedFare() {
        return this.appliedFare;
    }

    public Payment getPayment() {
        return this.payment;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.payment = (Payment) archive.add((Archive) this.payment, true, (Class<Archive>) Payment.class);
        this.appliedFare = (AppliedFare) archive.add((Archive) this.appliedFare, false, (Class<Archive>) AppliedFare.class);
    }

    public SectionPaymentOption() {
    }
}
