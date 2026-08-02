package com.yandex.go.payments.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/payments/api/GooglePayInteractor$GooglePayTokenResult", "", "Lcom/yandex/go/payments/api/GooglePayInteractor$GooglePayTokenResult;", "SUCCESS", "CANCEL", "ERROR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GooglePayInteractor$GooglePayTokenResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GooglePayInteractor$GooglePayTokenResult[] $VALUES;
    public static final GooglePayInteractor$GooglePayTokenResult CANCEL;
    public static final GooglePayInteractor$GooglePayTokenResult ERROR;
    public static final GooglePayInteractor$GooglePayTokenResult SUCCESS;

    static {
        GooglePayInteractor$GooglePayTokenResult googlePayInteractor$GooglePayTokenResult = new GooglePayInteractor$GooglePayTokenResult("SUCCESS", 0);
        SUCCESS = googlePayInteractor$GooglePayTokenResult;
        GooglePayInteractor$GooglePayTokenResult googlePayInteractor$GooglePayTokenResult2 = new GooglePayInteractor$GooglePayTokenResult("CANCEL", 1);
        CANCEL = googlePayInteractor$GooglePayTokenResult2;
        GooglePayInteractor$GooglePayTokenResult googlePayInteractor$GooglePayTokenResult3 = new GooglePayInteractor$GooglePayTokenResult("ERROR", 2);
        ERROR = googlePayInteractor$GooglePayTokenResult3;
        GooglePayInteractor$GooglePayTokenResult[] googlePayInteractor$GooglePayTokenResultArr = {googlePayInteractor$GooglePayTokenResult, googlePayInteractor$GooglePayTokenResult2, googlePayInteractor$GooglePayTokenResult3};
        $VALUES = googlePayInteractor$GooglePayTokenResultArr;
        $ENTRIES = a.a(googlePayInteractor$GooglePayTokenResultArr);
    }

    public static GooglePayInteractor$GooglePayTokenResult valueOf(String str) {
        return (GooglePayInteractor$GooglePayTokenResult) Enum.valueOf(GooglePayInteractor$GooglePayTokenResult.class, str);
    }

    public static GooglePayInteractor$GooglePayTokenResult[] values() {
        return (GooglePayInteractor$GooglePayTokenResult[]) $VALUES.clone();
    }
}
