package com.yandex.go.tips.data.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/tips/data/model/TipsValue;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "ZERO_PERCENT", "FIVE_PERCENT", "TEN_PERCENT", "FIFTEEN_PERCENT", "UNSET", "UNAVAILABLE", "DEFAULT", "go-client-android.features.taxi_order.tips:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsValue {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TipsValue[] $VALUES;
    public static final TipsValue DEFAULT;
    public static final TipsValue FIFTEEN_PERCENT;
    public static final TipsValue FIVE_PERCENT;
    public static final TipsValue TEN_PERCENT;
    public static final TipsValue UNAVAILABLE;
    public static final TipsValue UNSET;
    public static final TipsValue ZERO_PERCENT;
    private final int value;

    static {
        TipsValue tipsValue = new TipsValue("ZERO_PERCENT", 0, 0);
        ZERO_PERCENT = tipsValue;
        TipsValue tipsValue2 = new TipsValue("FIVE_PERCENT", 1, 5);
        FIVE_PERCENT = tipsValue2;
        TipsValue tipsValue3 = new TipsValue("TEN_PERCENT", 2, 10);
        TEN_PERCENT = tipsValue3;
        TipsValue tipsValue4 = new TipsValue("FIFTEEN_PERCENT", 3, 15);
        FIFTEEN_PERCENT = tipsValue4;
        TipsValue tipsValue5 = new TipsValue("UNSET", 4, -1);
        UNSET = tipsValue5;
        TipsValue tipsValue6 = new TipsValue("UNAVAILABLE", 5, -2);
        UNAVAILABLE = tipsValue6;
        TipsValue tipsValue7 = new TipsValue("DEFAULT", 6, tipsValue.value);
        DEFAULT = tipsValue7;
        TipsValue[] tipsValueArr = {tipsValue, tipsValue2, tipsValue3, tipsValue4, tipsValue5, tipsValue6, tipsValue7};
        $VALUES = tipsValueArr;
        $ENTRIES = a.a(tipsValueArr);
    }

    public TipsValue(String str, int i, int i2) {
        this.value = i2;
    }

    public static TipsValue valueOf(String str) {
        return (TipsValue) Enum.valueOf(TipsValue.class, str);
    }

    public static TipsValue[] values() {
        return (TipsValue[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
