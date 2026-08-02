package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$PaymentMethodsScreen", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$PaymentMethodsScreen;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Summary", "Menu", "Ride", "Debts", "Scooters", "Intercity", "Transport", "DeliveryOrder", "Delivery", "Places", "Chargers", "Superapp", "Drive", "Plus", "Porttech", "Aeroexpress", "MobilityHub", "Business", "EatsKit", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsAnalytics$PaymentMethodsScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$PaymentMethodsScreen[] $VALUES;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Aeroexpress;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Business;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Chargers;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Debts;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Delivery;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen DeliveryOrder;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Drive;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen EatsKit;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Intercity;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Menu;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen MobilityHub;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Places;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Plus;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Porttech;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Ride;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Scooters;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Summary;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Superapp;
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen Transport;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen = new PaymentMethodsAnalytics$PaymentMethodsScreen("Summary", 0, "summary");
        Summary = paymentMethodsAnalytics$PaymentMethodsScreen;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen2 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Menu", 1, "menu");
        Menu = paymentMethodsAnalytics$PaymentMethodsScreen2;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen3 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Ride", 2, "ride");
        Ride = paymentMethodsAnalytics$PaymentMethodsScreen3;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen4 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Debts", 3, "debts");
        Debts = paymentMethodsAnalytics$PaymentMethodsScreen4;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen5 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Scooters", 4, "scooters");
        Scooters = paymentMethodsAnalytics$PaymentMethodsScreen5;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen6 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Intercity", 5, "intercity");
        Intercity = paymentMethodsAnalytics$PaymentMethodsScreen6;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen7 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Transport", 6, "transport");
        Transport = paymentMethodsAnalytics$PaymentMethodsScreen7;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen8 = new PaymentMethodsAnalytics$PaymentMethodsScreen("DeliveryOrder", 7, "delivery_order");
        DeliveryOrder = paymentMethodsAnalytics$PaymentMethodsScreen8;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen9 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Delivery", 8, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        Delivery = paymentMethodsAnalytics$PaymentMethodsScreen9;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen10 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Places", 9, "places");
        Places = paymentMethodsAnalytics$PaymentMethodsScreen10;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen11 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Chargers", 10, "chargers");
        Chargers = paymentMethodsAnalytics$PaymentMethodsScreen11;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen12 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Superapp", 11, "superapp");
        Superapp = paymentMethodsAnalytics$PaymentMethodsScreen12;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen13 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Drive", 12, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        Drive = paymentMethodsAnalytics$PaymentMethodsScreen13;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen14 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Plus", 13, "plus");
        Plus = paymentMethodsAnalytics$PaymentMethodsScreen14;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen15 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Porttech", 14, "porttech");
        Porttech = paymentMethodsAnalytics$PaymentMethodsScreen15;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen16 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Aeroexpress", 15, "aeroexpress");
        Aeroexpress = paymentMethodsAnalytics$PaymentMethodsScreen16;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen17 = new PaymentMethodsAnalytics$PaymentMethodsScreen("MobilityHub", 16, "mobility_hub");
        MobilityHub = paymentMethodsAnalytics$PaymentMethodsScreen17;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen18 = new PaymentMethodsAnalytics$PaymentMethodsScreen("Business", 17, "business");
        Business = paymentMethodsAnalytics$PaymentMethodsScreen18;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen19 = new PaymentMethodsAnalytics$PaymentMethodsScreen("EatsKit", 18, "eats_kit");
        EatsKit = paymentMethodsAnalytics$PaymentMethodsScreen19;
        PaymentMethodsAnalytics$PaymentMethodsScreen[] paymentMethodsAnalytics$PaymentMethodsScreenArr = {paymentMethodsAnalytics$PaymentMethodsScreen, paymentMethodsAnalytics$PaymentMethodsScreen2, paymentMethodsAnalytics$PaymentMethodsScreen3, paymentMethodsAnalytics$PaymentMethodsScreen4, paymentMethodsAnalytics$PaymentMethodsScreen5, paymentMethodsAnalytics$PaymentMethodsScreen6, paymentMethodsAnalytics$PaymentMethodsScreen7, paymentMethodsAnalytics$PaymentMethodsScreen8, paymentMethodsAnalytics$PaymentMethodsScreen9, paymentMethodsAnalytics$PaymentMethodsScreen10, paymentMethodsAnalytics$PaymentMethodsScreen11, paymentMethodsAnalytics$PaymentMethodsScreen12, paymentMethodsAnalytics$PaymentMethodsScreen13, paymentMethodsAnalytics$PaymentMethodsScreen14, paymentMethodsAnalytics$PaymentMethodsScreen15, paymentMethodsAnalytics$PaymentMethodsScreen16, paymentMethodsAnalytics$PaymentMethodsScreen17, paymentMethodsAnalytics$PaymentMethodsScreen18, paymentMethodsAnalytics$PaymentMethodsScreen19};
        $VALUES = paymentMethodsAnalytics$PaymentMethodsScreenArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$PaymentMethodsScreenArr);
    }

    public PaymentMethodsAnalytics$PaymentMethodsScreen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static PaymentMethodsAnalytics$PaymentMethodsScreen valueOf(String str) {
        return (PaymentMethodsAnalytics$PaymentMethodsScreen) Enum.valueOf(PaymentMethodsAnalytics$PaymentMethodsScreen.class, str);
    }

    public static PaymentMethodsAnalytics$PaymentMethodsScreen[] values() {
        return (PaymentMethodsAnalytics$PaymentMethodsScreen[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
