package com.yandex.go.shortcuts.view.adapter.model;

import defpackage.k4o;
import defpackage.tbu;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/yandex/go/shortcuts/view/adapter/model/HeaderService$Type", "Ltbu;", "", "Lcom/yandex/go/shortcuts/view/adapter/model/HeaderService$Type;", "", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "TAXI", "EATS", "GROCERY", "PHARMACY", "DELIVERY", "SHOP", "MARKET", "MARKET_VIEWER", "DRIVE", "MASSTRANSIT", "RESTAURANTS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderService$Type implements tbu {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HeaderService$Type[] $VALUES;
    public static final HeaderService$Type DELIVERY;
    public static final HeaderService$Type DRIVE;
    public static final HeaderService$Type EATS;
    public static final HeaderService$Type GROCERY;
    public static final HeaderService$Type MARKET;
    public static final HeaderService$Type MARKET_VIEWER;
    public static final HeaderService$Type MASSTRANSIT;
    public static final HeaderService$Type PHARMACY;
    public static final HeaderService$Type RESTAURANTS;
    public static final HeaderService$Type SHOP;
    public static final HeaderService$Type TAXI;
    private final String serviceName;

    static {
        HeaderService$Type headerService$Type = new HeaderService$Type("TAXI", 0, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        TAXI = headerService$Type;
        HeaderService$Type headerService$Type2 = new HeaderService$Type("EATS", 1, "eats");
        EATS = headerService$Type2;
        HeaderService$Type headerService$Type3 = new HeaderService$Type("GROCERY", 2, "grocery");
        GROCERY = headerService$Type3;
        HeaderService$Type headerService$Type4 = new HeaderService$Type("PHARMACY", 3, "pharmacy");
        PHARMACY = headerService$Type4;
        HeaderService$Type headerService$Type5 = new HeaderService$Type("DELIVERY", 4, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        DELIVERY = headerService$Type5;
        HeaderService$Type headerService$Type6 = new HeaderService$Type("SHOP", 5, "shop");
        SHOP = headerService$Type6;
        HeaderService$Type headerService$Type7 = new HeaderService$Type("MARKET", 6, "market");
        MARKET = headerService$Type7;
        HeaderService$Type headerService$Type8 = new HeaderService$Type("MARKET_VIEWER", 7, "market_viewer");
        MARKET_VIEWER = headerService$Type8;
        HeaderService$Type headerService$Type9 = new HeaderService$Type("DRIVE", 8, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        DRIVE = headerService$Type9;
        HeaderService$Type headerService$Type10 = new HeaderService$Type("MASSTRANSIT", 9, "masstransit");
        MASSTRANSIT = headerService$Type10;
        HeaderService$Type headerService$Type11 = new HeaderService$Type("RESTAURANTS", 10, "restaurants");
        RESTAURANTS = headerService$Type11;
        HeaderService$Type[] headerService$TypeArr = {headerService$Type, headerService$Type2, headerService$Type3, headerService$Type4, headerService$Type5, headerService$Type6, headerService$Type7, headerService$Type8, headerService$Type9, headerService$Type10, headerService$Type11};
        $VALUES = headerService$TypeArr;
        $ENTRIES = a.a(headerService$TypeArr);
    }

    public HeaderService$Type(String str, int i, String str2) {
        this.serviceName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static HeaderService$Type valueOf(String str) {
        return (HeaderService$Type) Enum.valueOf(HeaderService$Type.class, str);
    }

    public static HeaderService$Type[] values() {
        return (HeaderService$Type[]) $VALUES.clone();
    }

    @Override // defpackage.tbu
    public final String getServiceName() {
        return this.serviceName;
    }
}
