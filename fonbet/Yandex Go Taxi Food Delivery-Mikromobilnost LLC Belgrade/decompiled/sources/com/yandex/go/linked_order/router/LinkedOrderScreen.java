package com.yandex.go.linked_order.router;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/linked_order/router/LinkedOrderScreen;", "", "ORDER_INFO", "AMBULANCE_ORDER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LinkedOrderScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkedOrderScreen[] $VALUES;
    public static final LinkedOrderScreen AMBULANCE_ORDER;
    public static final LinkedOrderScreen ORDER_INFO;

    static {
        LinkedOrderScreen linkedOrderScreen = new LinkedOrderScreen("ORDER_INFO", 0);
        ORDER_INFO = linkedOrderScreen;
        LinkedOrderScreen linkedOrderScreen2 = new LinkedOrderScreen("AMBULANCE_ORDER", 1);
        AMBULANCE_ORDER = linkedOrderScreen2;
        LinkedOrderScreen[] linkedOrderScreenArr = {linkedOrderScreen, linkedOrderScreen2};
        $VALUES = linkedOrderScreenArr;
        $ENTRIES = a.a(linkedOrderScreenArr);
    }

    public static LinkedOrderScreen valueOf(String str) {
        return (LinkedOrderScreen) Enum.valueOf(LinkedOrderScreen.class, str);
    }

    public static LinkedOrderScreen[] values() {
        return (LinkedOrderScreen[]) $VALUES.clone();
    }
}
