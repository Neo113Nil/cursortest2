package com.ybsdk.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/api/entities/YBCardDeliveryApplicationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "LOGISTIC", "ACTIVATION", "NEED_DELIVERY_INFO", "WAITING_FOR_PICKUP", "CANCEL", "FAIL", "SUCCESS", "NO_DELIVERY_APPLICATION", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBCardDeliveryApplicationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBCardDeliveryApplicationStatus[] $VALUES;
    public static final YBCardDeliveryApplicationStatus CREATED = new YBCardDeliveryApplicationStatus("CREATED", 0);
    public static final YBCardDeliveryApplicationStatus LOGISTIC = new YBCardDeliveryApplicationStatus("LOGISTIC", 1);
    public static final YBCardDeliveryApplicationStatus ACTIVATION = new YBCardDeliveryApplicationStatus("ACTIVATION", 2);
    public static final YBCardDeliveryApplicationStatus NEED_DELIVERY_INFO = new YBCardDeliveryApplicationStatus("NEED_DELIVERY_INFO", 3);
    public static final YBCardDeliveryApplicationStatus WAITING_FOR_PICKUP = new YBCardDeliveryApplicationStatus("WAITING_FOR_PICKUP", 4);
    public static final YBCardDeliveryApplicationStatus CANCEL = new YBCardDeliveryApplicationStatus("CANCEL", 5);
    public static final YBCardDeliveryApplicationStatus FAIL = new YBCardDeliveryApplicationStatus("FAIL", 6);
    public static final YBCardDeliveryApplicationStatus SUCCESS = new YBCardDeliveryApplicationStatus("SUCCESS", 7);
    public static final YBCardDeliveryApplicationStatus NO_DELIVERY_APPLICATION = new YBCardDeliveryApplicationStatus("NO_DELIVERY_APPLICATION", 8);

    private static final /* synthetic */ YBCardDeliveryApplicationStatus[] $values() {
        return new YBCardDeliveryApplicationStatus[]{CREATED, LOGISTIC, ACTIVATION, NEED_DELIVERY_INFO, WAITING_FOR_PICKUP, CANCEL, FAIL, SUCCESS, NO_DELIVERY_APPLICATION};
    }

    static {
        YBCardDeliveryApplicationStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBCardDeliveryApplicationStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBCardDeliveryApplicationStatus valueOf(String str) {
        return (YBCardDeliveryApplicationStatus) Enum.valueOf(YBCardDeliveryApplicationStatus.class, str);
    }

    public static YBCardDeliveryApplicationStatus[] values() {
        return (YBCardDeliveryApplicationStatus[]) $VALUES.clone();
    }
}
