package com.yandex.plus.pay.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayInAppProductType;", "", "<init>", "(Ljava/lang/String;I)V", "SUBSCRIPTION", "ONE_TIME", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayInAppProductType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayInAppProductType[] $VALUES;
    public static final PlusPayInAppProductType SUBSCRIPTION = new PlusPayInAppProductType("SUBSCRIPTION", 0);
    public static final PlusPayInAppProductType ONE_TIME = new PlusPayInAppProductType("ONE_TIME", 1);

    private static final /* synthetic */ PlusPayInAppProductType[] $values() {
        return new PlusPayInAppProductType[]{SUBSCRIPTION, ONE_TIME};
    }

    static {
        PlusPayInAppProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlusPayInAppProductType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PlusPayInAppProductType valueOf(String str) {
        return (PlusPayInAppProductType) Enum.valueOf(PlusPayInAppProductType.class, str);
    }

    public static PlusPayInAppProductType[] values() {
        return (PlusPayInAppProductType[]) $VALUES.clone();
    }
}
