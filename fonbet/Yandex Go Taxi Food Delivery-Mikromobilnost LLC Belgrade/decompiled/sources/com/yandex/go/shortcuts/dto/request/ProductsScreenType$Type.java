package com.yandex.go.shortcuts.dto.request;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rpe0;
import defpackage.xaf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/yandex/go/shortcuts/dto/request/ProductsScreenType$Type", "", "Lcom/yandex/go/shortcuts/dto/request/ProductsScreenType$Type;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "xaf0", "MAIN", "SUPERAPP_MAIN", "ON_MULTI_ORDER", "TAXI_MAIN_SCREEN", "SCOOTERS_DISCOVERY", "SCOOTERS_RIDE_FINISH_SCREEN", "CHARGERS_DISCOVERY", "TRACKING_LIST", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductsScreenType$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductsScreenType$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ProductsScreenType$Type CHARGERS_DISCOVERY;
    public static final xaf0 Companion;
    public static final ProductsScreenType$Type MAIN;
    public static final ProductsScreenType$Type ON_MULTI_ORDER;
    public static final ProductsScreenType$Type SCOOTERS_DISCOVERY;
    public static final ProductsScreenType$Type SCOOTERS_RIDE_FINISH_SCREEN;
    public static final ProductsScreenType$Type SUPERAPP_MAIN;
    public static final ProductsScreenType$Type TAXI_MAIN_SCREEN;
    public static final ProductsScreenType$Type TRACKING_LIST;
    private final String value;

    static {
        ProductsScreenType$Type productsScreenType$Type = new ProductsScreenType$Type("MAIN", 0, "main");
        MAIN = productsScreenType$Type;
        ProductsScreenType$Type productsScreenType$Type2 = new ProductsScreenType$Type("SUPERAPP_MAIN", 1, "superapp_main");
        SUPERAPP_MAIN = productsScreenType$Type2;
        ProductsScreenType$Type productsScreenType$Type3 = new ProductsScreenType$Type("ON_MULTI_ORDER", 2, "on_multiorder");
        ON_MULTI_ORDER = productsScreenType$Type3;
        ProductsScreenType$Type productsScreenType$Type4 = new ProductsScreenType$Type("TAXI_MAIN_SCREEN", 3, "taxi_main");
        TAXI_MAIN_SCREEN = productsScreenType$Type4;
        ProductsScreenType$Type productsScreenType$Type5 = new ProductsScreenType$Type("SCOOTERS_DISCOVERY", 4, "scooters_discovery");
        SCOOTERS_DISCOVERY = productsScreenType$Type5;
        ProductsScreenType$Type productsScreenType$Type6 = new ProductsScreenType$Type("SCOOTERS_RIDE_FINISH_SCREEN", 5, "scooters_ride_finish");
        SCOOTERS_RIDE_FINISH_SCREEN = productsScreenType$Type6;
        ProductsScreenType$Type productsScreenType$Type7 = new ProductsScreenType$Type("CHARGERS_DISCOVERY", 6, "chargers_discovery");
        CHARGERS_DISCOVERY = productsScreenType$Type7;
        ProductsScreenType$Type productsScreenType$Type8 = new ProductsScreenType$Type("TRACKING_LIST", 7, "tracking_list");
        TRACKING_LIST = productsScreenType$Type8;
        ProductsScreenType$Type[] productsScreenType$TypeArr = {productsScreenType$Type, productsScreenType$Type2, productsScreenType$Type3, productsScreenType$Type4, productsScreenType$Type5, productsScreenType$Type6, productsScreenType$Type7, productsScreenType$Type8};
        $VALUES = productsScreenType$TypeArr;
        $ENTRIES = kotlin.enums.a.a(productsScreenType$TypeArr);
        Companion = new xaf0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(24));
    }

    public ProductsScreenType$Type(String str, int i, String str2) {
        this.value = str2;
    }

    public static ProductsScreenType$Type valueOf(String str) {
        return (ProductsScreenType$Type) Enum.valueOf(ProductsScreenType$Type.class, str);
    }

    public static ProductsScreenType$Type[] values() {
        return (ProductsScreenType$Type[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
