package com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/impl/ui/payments/checkout/flex/custom_view/PlacesPaymentsCheckoutButtonsDivCustomViewTypes;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PLACES_PAYMENTS_CHECKOUT_BUTTONS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlacesPaymentsCheckoutButtonsDivCustomViewTypes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPaymentsCheckoutButtonsDivCustomViewTypes[] $VALUES;
    public static final PlacesPaymentsCheckoutButtonsDivCustomViewTypes PLACES_PAYMENTS_CHECKOUT_BUTTONS;
    private final String type = "discovery_payments_checkout_apply_view";

    static {
        PlacesPaymentsCheckoutButtonsDivCustomViewTypes placesPaymentsCheckoutButtonsDivCustomViewTypes = new PlacesPaymentsCheckoutButtonsDivCustomViewTypes();
        PLACES_PAYMENTS_CHECKOUT_BUTTONS = placesPaymentsCheckoutButtonsDivCustomViewTypes;
        PlacesPaymentsCheckoutButtonsDivCustomViewTypes[] placesPaymentsCheckoutButtonsDivCustomViewTypesArr = {placesPaymentsCheckoutButtonsDivCustomViewTypes};
        $VALUES = placesPaymentsCheckoutButtonsDivCustomViewTypesArr;
        $ENTRIES = a.a(placesPaymentsCheckoutButtonsDivCustomViewTypesArr);
    }

    public static PlacesPaymentsCheckoutButtonsDivCustomViewTypes valueOf(String str) {
        return (PlacesPaymentsCheckoutButtonsDivCustomViewTypes) Enum.valueOf(PlacesPaymentsCheckoutButtonsDivCustomViewTypes.class, str);
    }

    public static PlacesPaymentsCheckoutButtonsDivCustomViewTypes[] values() {
        return (PlacesPaymentsCheckoutButtonsDivCustomViewTypes[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
