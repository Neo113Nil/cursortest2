package com.yandex.plus.pay.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/plus/pay/api/model/VendorType;", "", "<init>", "(Ljava/lang/String;I)V", "APP_STORE", "GOOGLE_PLAY", "MICROSOFT_STORE", "YANDEX", "UNKNOWN", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VendorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VendorType[] $VALUES;
    public static final VendorType APP_STORE = new VendorType("APP_STORE", 0);
    public static final VendorType GOOGLE_PLAY = new VendorType("GOOGLE_PLAY", 1);
    public static final VendorType MICROSOFT_STORE = new VendorType("MICROSOFT_STORE", 2);
    public static final VendorType YANDEX = new VendorType("YANDEX", 3);
    public static final VendorType UNKNOWN = new VendorType("UNKNOWN", 4);

    private static final /* synthetic */ VendorType[] $values() {
        return new VendorType[]{APP_STORE, GOOGLE_PLAY, MICROSOFT_STORE, YANDEX, UNKNOWN};
    }

    static {
        VendorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private VendorType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static VendorType valueOf(String str) {
        return (VendorType) Enum.valueOf(VendorType.class, str);
    }

    public static VendorType[] values() {
        return (VendorType[]) $VALUES.clone();
    }
}
