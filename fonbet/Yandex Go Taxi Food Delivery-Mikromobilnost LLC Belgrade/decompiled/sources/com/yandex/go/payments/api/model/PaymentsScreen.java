package com.yandex.go.payments.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/payments/api/model/PaymentsScreen;", "", "", "openReason", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "INTERCITY_DASHBOARD", "TRANSPORT_SUMMARY", "TRANSPORT_CHECKOUT", "DELIVERY_TRACKING", "DELIVERY_FORM", "SCOOTERS", "PLACES", "CHARGERS", "SUPERAPP", "SUMMARY", "ORDER", "DEBTS", "DRIVE", "MENU", "PLUS", "PORTTECH", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentsScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentsScreen[] $VALUES;
    public static final PaymentsScreen CHARGERS;
    public static final PaymentsScreen DEBTS;
    public static final PaymentsScreen DELIVERY_FORM;
    public static final PaymentsScreen DELIVERY_TRACKING;
    public static final PaymentsScreen DRIVE;
    public static final PaymentsScreen INTERCITY_DASHBOARD;
    public static final PaymentsScreen MENU;
    public static final PaymentsScreen ORDER;
    public static final PaymentsScreen PLACES;
    public static final PaymentsScreen PLUS;
    public static final PaymentsScreen PORTTECH;
    public static final PaymentsScreen SCOOTERS;
    public static final PaymentsScreen SUMMARY;
    public static final PaymentsScreen SUPERAPP;
    public static final PaymentsScreen TRANSPORT_CHECKOUT;
    public static final PaymentsScreen TRANSPORT_SUMMARY;
    private final String openReason;

    static {
        PaymentsScreen paymentsScreen = new PaymentsScreen("INTERCITY_DASHBOARD", 0, "intercity_dashboard");
        INTERCITY_DASHBOARD = paymentsScreen;
        PaymentsScreen paymentsScreen2 = new PaymentsScreen("TRANSPORT_SUMMARY", 1, "transport_summary");
        TRANSPORT_SUMMARY = paymentsScreen2;
        PaymentsScreen paymentsScreen3 = new PaymentsScreen("TRANSPORT_CHECKOUT", 2, "transport_checkout");
        TRANSPORT_CHECKOUT = paymentsScreen3;
        PaymentsScreen paymentsScreen4 = new PaymentsScreen("DELIVERY_TRACKING", 3, "delivery_tracking");
        DELIVERY_TRACKING = paymentsScreen4;
        PaymentsScreen paymentsScreen5 = new PaymentsScreen("DELIVERY_FORM", 4, "delivery_form");
        DELIVERY_FORM = paymentsScreen5;
        PaymentsScreen paymentsScreen6 = new PaymentsScreen("SCOOTERS", 5, "scooters");
        SCOOTERS = paymentsScreen6;
        PaymentsScreen paymentsScreen7 = new PaymentsScreen("PLACES", 6, "places");
        PLACES = paymentsScreen7;
        PaymentsScreen paymentsScreen8 = new PaymentsScreen("CHARGERS", 7, "chargers");
        CHARGERS = paymentsScreen8;
        PaymentsScreen paymentsScreen9 = new PaymentsScreen("SUPERAPP", 8, "superapp");
        SUPERAPP = paymentsScreen9;
        PaymentsScreen paymentsScreen10 = new PaymentsScreen("SUMMARY", 9, "summary");
        SUMMARY = paymentsScreen10;
        PaymentsScreen paymentsScreen11 = new PaymentsScreen("ORDER", 10, "order");
        ORDER = paymentsScreen11;
        PaymentsScreen paymentsScreen12 = new PaymentsScreen("DEBTS", 11, "debts");
        DEBTS = paymentsScreen12;
        PaymentsScreen paymentsScreen13 = new PaymentsScreen("DRIVE", 12, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        DRIVE = paymentsScreen13;
        PaymentsScreen paymentsScreen14 = new PaymentsScreen("MENU", 13, "menu");
        MENU = paymentsScreen14;
        PaymentsScreen paymentsScreen15 = new PaymentsScreen("PLUS", 14, "plus");
        PLUS = paymentsScreen15;
        PaymentsScreen paymentsScreen16 = new PaymentsScreen("PORTTECH", 15, "porttech");
        PORTTECH = paymentsScreen16;
        PaymentsScreen[] paymentsScreenArr = {paymentsScreen, paymentsScreen2, paymentsScreen3, paymentsScreen4, paymentsScreen5, paymentsScreen6, paymentsScreen7, paymentsScreen8, paymentsScreen9, paymentsScreen10, paymentsScreen11, paymentsScreen12, paymentsScreen13, paymentsScreen14, paymentsScreen15, paymentsScreen16};
        $VALUES = paymentsScreenArr;
        $ENTRIES = a.a(paymentsScreenArr);
    }

    public PaymentsScreen(String str, int i, String str2) {
        this.openReason = str2;
    }

    public static PaymentsScreen valueOf(String str) {
        return (PaymentsScreen) Enum.valueOf(PaymentsScreen.class, str);
    }

    public static PaymentsScreen[] values() {
        return (PaymentsScreen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getOpenReason() {
        return this.openReason;
    }
}
