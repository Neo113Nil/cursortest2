package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Money;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RoutePaymentOption implements Serializable {
    private NativeObject nativeObject;
    private List<Payment> payment;
    private boolean payment__is_initialized;
    private List<Money> totalPrice;
    private boolean totalPrice__is_initialized;

    public RoutePaymentOption(List<Payment> list, List<Money> list2) {
        this.payment__is_initialized = false;
        this.totalPrice__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"payment\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"totalPrice\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.payment = list;
        this.payment__is_initialized = true;
        this.totalPrice = list2;
        this.totalPrice__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RoutePaymentOption";
    }

    private native List<Payment> getPayment__Native();

    private native List<Money> getTotalPrice__Native();

    private native NativeObject init(List<Payment> list, List<Money> list2);

    public synchronized List<Payment> getPayment() {
        try {
            if (!this.payment__is_initialized) {
                this.payment = getPayment__Native();
                this.payment__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.payment;
    }

    public synchronized List<Money> getTotalPrice() {
        try {
            if (!this.totalPrice__is_initialized) {
                this.totalPrice = getTotalPrice__Native();
                this.totalPrice__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.totalPrice;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getPayment(), false, (ArchivingHandler) new ClassHandler(Payment.class));
            nzs.m(Money.class, archive, getTotalPrice(), false);
            return;
        }
        this.payment = nzs.e(Payment.class, archive, this.payment, false);
        this.payment__is_initialized = true;
        List<Money> e = nzs.e(Money.class, archive, this.totalPrice, false);
        this.totalPrice = e;
        this.totalPrice__is_initialized = true;
        this.nativeObject = init(this.payment, e);
    }

    public RoutePaymentOption() {
        this.payment__is_initialized = false;
        this.totalPrice__is_initialized = false;
    }

    private RoutePaymentOption(NativeObject nativeObject) {
        this.payment__is_initialized = false;
        this.totalPrice__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
