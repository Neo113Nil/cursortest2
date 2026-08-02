package com.ybsdk.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/api/DepositType;", "", "<init>", "(Ljava/lang/String;I)V", "ExactAmount", "OrderAmount", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DepositType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DepositType[] $VALUES;
    public static final DepositType ExactAmount = new DepositType("ExactAmount", 0);
    public static final DepositType OrderAmount = new DepositType("OrderAmount", 1);

    private static final /* synthetic */ DepositType[] $values() {
        return new DepositType[]{ExactAmount, OrderAmount};
    }

    static {
        DepositType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DepositType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DepositType valueOf(String str) {
        return (DepositType) Enum.valueOf(DepositType.class, str);
    }

    public static DepositType[] values() {
        return (DepositType[]) $VALUES.clone();
    }
}
