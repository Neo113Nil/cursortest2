package com.yandex.go.clarify_address.before_order;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/clarify_address/before_order/ClarifyAddressBeforeOrderOrigin;", "", "SUPERAPP_SHORTCUT", "EXPECTED_DESTINATION_SHORTCUT", "TAXI_NEXT_CHEVRON", "DESTINATION_ON_MAP", "DESTINATION_ADDRESS_WHERE_TO", "DESTINATION_ADDRESS_SUGGEST", "go-client-android.features.clarify_address:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClarifyAddressBeforeOrderOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClarifyAddressBeforeOrderOrigin[] $VALUES;
    public static final ClarifyAddressBeforeOrderOrigin DESTINATION_ADDRESS_SUGGEST;
    public static final ClarifyAddressBeforeOrderOrigin DESTINATION_ADDRESS_WHERE_TO;
    public static final ClarifyAddressBeforeOrderOrigin DESTINATION_ON_MAP;
    public static final ClarifyAddressBeforeOrderOrigin EXPECTED_DESTINATION_SHORTCUT;
    public static final ClarifyAddressBeforeOrderOrigin SUPERAPP_SHORTCUT;
    public static final ClarifyAddressBeforeOrderOrigin TAXI_NEXT_CHEVRON;

    static {
        ClarifyAddressBeforeOrderOrigin clarifyAddressBeforeOrderOrigin = new ClarifyAddressBeforeOrderOrigin("SUPERAPP_SHORTCUT", 0);
        SUPERAPP_SHORTCUT = clarifyAddressBeforeOrderOrigin;
        ClarifyAddressBeforeOrderOrigin clarifyAddressBeforeOrderOrigin2 = new ClarifyAddressBeforeOrderOrigin("EXPECTED_DESTINATION_SHORTCUT", 1);
        EXPECTED_DESTINATION_SHORTCUT = clarifyAddressBeforeOrderOrigin2;
        ClarifyAddressBeforeOrderOrigin clarifyAddressBeforeOrderOrigin3 = new ClarifyAddressBeforeOrderOrigin("TAXI_NEXT_CHEVRON", 2);
        TAXI_NEXT_CHEVRON = clarifyAddressBeforeOrderOrigin3;
        ClarifyAddressBeforeOrderOrigin clarifyAddressBeforeOrderOrigin4 = new ClarifyAddressBeforeOrderOrigin("DESTINATION_ON_MAP", 3);
        DESTINATION_ON_MAP = clarifyAddressBeforeOrderOrigin4;
        ClarifyAddressBeforeOrderOrigin clarifyAddressBeforeOrderOrigin5 = new ClarifyAddressBeforeOrderOrigin("DESTINATION_ADDRESS_WHERE_TO", 4);
        DESTINATION_ADDRESS_WHERE_TO = clarifyAddressBeforeOrderOrigin5;
        ClarifyAddressBeforeOrderOrigin clarifyAddressBeforeOrderOrigin6 = new ClarifyAddressBeforeOrderOrigin("DESTINATION_ADDRESS_SUGGEST", 5);
        DESTINATION_ADDRESS_SUGGEST = clarifyAddressBeforeOrderOrigin6;
        ClarifyAddressBeforeOrderOrigin[] clarifyAddressBeforeOrderOriginArr = {clarifyAddressBeforeOrderOrigin, clarifyAddressBeforeOrderOrigin2, clarifyAddressBeforeOrderOrigin3, clarifyAddressBeforeOrderOrigin4, clarifyAddressBeforeOrderOrigin5, clarifyAddressBeforeOrderOrigin6};
        $VALUES = clarifyAddressBeforeOrderOriginArr;
        $ENTRIES = kotlin.enums.a.a(clarifyAddressBeforeOrderOriginArr);
    }

    public static ClarifyAddressBeforeOrderOrigin valueOf(String str) {
        return (ClarifyAddressBeforeOrderOrigin) Enum.valueOf(ClarifyAddressBeforeOrderOrigin.class, str);
    }

    public static ClarifyAddressBeforeOrderOrigin[] values() {
        return (ClarifyAddressBeforeOrderOrigin[]) $VALUES.clone();
    }
}
