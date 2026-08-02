package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/UpsaleType;", "", "ADDITION", "REPLACE", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpsaleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpsaleType[] $VALUES;
    public static final UpsaleType ADDITION;
    public static final UpsaleType REPLACE;

    static {
        UpsaleType upsaleType = new UpsaleType("ADDITION", 0);
        ADDITION = upsaleType;
        UpsaleType upsaleType2 = new UpsaleType("REPLACE", 1);
        REPLACE = upsaleType2;
        UpsaleType[] upsaleTypeArr = {upsaleType, upsaleType2};
        $VALUES = upsaleTypeArr;
        $ENTRIES = kotlin.enums.a.a(upsaleTypeArr);
    }

    public static UpsaleType valueOf(String str) {
        return (UpsaleType) Enum.valueOf(UpsaleType.class, str);
    }

    public static UpsaleType[] values() {
        return (UpsaleType[]) $VALUES.clone();
    }
}
