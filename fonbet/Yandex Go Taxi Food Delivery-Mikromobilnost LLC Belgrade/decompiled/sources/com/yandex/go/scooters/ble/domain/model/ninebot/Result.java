package com.yandex.go.scooters.ble.domain.model.ninebot;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/ble/domain/model/ninebot/Result;", "", "SUCCESS", "FAILURE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Result {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Result[] $VALUES;
    public static final Result FAILURE;
    public static final Result SUCCESS;

    static {
        Result result = new Result("SUCCESS", 0);
        SUCCESS = result;
        Result result2 = new Result("FAILURE", 1);
        FAILURE = result2;
        Result[] resultArr = {result, result2};
        $VALUES = resultArr;
        $ENTRIES = a.a(resultArr);
    }

    public static Result valueOf(String str) {
        return (Result) Enum.valueOf(Result.class, str);
    }

    public static Result[] values() {
        return (Result[]) $VALUES.clone();
    }
}
