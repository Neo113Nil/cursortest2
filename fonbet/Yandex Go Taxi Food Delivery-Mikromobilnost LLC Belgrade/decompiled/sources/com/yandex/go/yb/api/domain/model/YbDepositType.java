package com.yandex.go.yb.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/yb/api/domain/model/YbDepositType;", "", "EXACT_AMOUNT", "ORDER_AMOUNT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YbDepositType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbDepositType[] $VALUES;
    public static final YbDepositType EXACT_AMOUNT;
    public static final YbDepositType ORDER_AMOUNT;

    static {
        YbDepositType ybDepositType = new YbDepositType("EXACT_AMOUNT", 0);
        EXACT_AMOUNT = ybDepositType;
        YbDepositType ybDepositType2 = new YbDepositType("ORDER_AMOUNT", 1);
        ORDER_AMOUNT = ybDepositType2;
        YbDepositType[] ybDepositTypeArr = {ybDepositType, ybDepositType2};
        $VALUES = ybDepositTypeArr;
        $ENTRIES = a.a(ybDepositTypeArr);
    }

    public static YbDepositType valueOf(String str) {
        return (YbDepositType) Enum.valueOf(YbDepositType.class, str);
    }

    public static YbDepositType[] values() {
        return (YbDepositType[]) $VALUES.clone();
    }
}
