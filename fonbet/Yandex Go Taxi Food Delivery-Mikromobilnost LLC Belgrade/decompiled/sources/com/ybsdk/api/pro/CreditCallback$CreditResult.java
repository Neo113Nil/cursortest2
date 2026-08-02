package com.ybsdk.api.pro;

import defpackage.jxi;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@jxi
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/api/pro/CreditCallback$CreditResult", "", "Lcom/ybsdk/api/pro/CreditCallback$CreditResult;", "<init>", "(Ljava/lang/String;I)V", "FAIL", "SUCCESS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreditCallback$CreditResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditCallback$CreditResult[] $VALUES;
    public static final CreditCallback$CreditResult FAIL = new CreditCallback$CreditResult("FAIL", 0);
    public static final CreditCallback$CreditResult SUCCESS = new CreditCallback$CreditResult("SUCCESS", 1);

    private static final /* synthetic */ CreditCallback$CreditResult[] $values() {
        return new CreditCallback$CreditResult[]{FAIL, SUCCESS};
    }

    static {
        CreditCallback$CreditResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CreditCallback$CreditResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditCallback$CreditResult valueOf(String str) {
        return (CreditCallback$CreditResult) Enum.valueOf(CreditCallback$CreditResult.class, str);
    }

    public static CreditCallback$CreditResult[] values() {
        return (CreditCallback$CreditResult[]) $VALUES.clone();
    }
}
