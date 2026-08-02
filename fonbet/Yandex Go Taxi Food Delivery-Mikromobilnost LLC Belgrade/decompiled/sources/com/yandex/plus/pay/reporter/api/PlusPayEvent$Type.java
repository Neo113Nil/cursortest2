package com.yandex.plus.pay.reporter.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/pay/reporter/api/PlusPayEvent$Type", "", "Lcom/yandex/plus/pay/reporter/api/PlusPayEvent$Type;", "DWH", "CLIENT", "DIAGNOSTIC", "ERROR", "LOG", "pay-sdk-core-reporter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusPayEvent$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayEvent$Type[] $VALUES;
    public static final PlusPayEvent$Type CLIENT;
    public static final PlusPayEvent$Type DIAGNOSTIC;
    public static final PlusPayEvent$Type DWH;
    public static final PlusPayEvent$Type ERROR;
    public static final PlusPayEvent$Type LOG;

    static {
        PlusPayEvent$Type plusPayEvent$Type = new PlusPayEvent$Type("DWH", 0);
        DWH = plusPayEvent$Type;
        PlusPayEvent$Type plusPayEvent$Type2 = new PlusPayEvent$Type("CLIENT", 1);
        CLIENT = plusPayEvent$Type2;
        PlusPayEvent$Type plusPayEvent$Type3 = new PlusPayEvent$Type("DIAGNOSTIC", 2);
        DIAGNOSTIC = plusPayEvent$Type3;
        PlusPayEvent$Type plusPayEvent$Type4 = new PlusPayEvent$Type("ERROR", 3);
        ERROR = plusPayEvent$Type4;
        PlusPayEvent$Type plusPayEvent$Type5 = new PlusPayEvent$Type("LOG", 4);
        LOG = plusPayEvent$Type5;
        PlusPayEvent$Type[] plusPayEvent$TypeArr = {plusPayEvent$Type, plusPayEvent$Type2, plusPayEvent$Type3, plusPayEvent$Type4, plusPayEvent$Type5};
        $VALUES = plusPayEvent$TypeArr;
        $ENTRIES = a.a(plusPayEvent$TypeArr);
    }

    public static PlusPayEvent$Type valueOf(String str) {
        return (PlusPayEvent$Type) Enum.valueOf(PlusPayEvent$Type.class, str);
    }

    public static PlusPayEvent$Type[] values() {
        return (PlusPayEvent$Type[]) $VALUES.clone();
    }
}
