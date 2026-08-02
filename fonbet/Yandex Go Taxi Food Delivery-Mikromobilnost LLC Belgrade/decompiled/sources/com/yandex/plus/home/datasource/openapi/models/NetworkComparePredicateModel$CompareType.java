package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkComparePredicateModel$CompareType", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkComparePredicateModel$CompareType;", "EQUALS", "GREATER", "GREATER_OR_EQUALS", "LESSER", "LESSER_OR_EQUALS", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkComparePredicateModel$CompareType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkComparePredicateModel$CompareType[] $VALUES;
    public static final NetworkComparePredicateModel$CompareType EQUALS;
    public static final NetworkComparePredicateModel$CompareType GREATER;
    public static final NetworkComparePredicateModel$CompareType GREATER_OR_EQUALS;
    public static final NetworkComparePredicateModel$CompareType LESSER;
    public static final NetworkComparePredicateModel$CompareType LESSER_OR_EQUALS;

    static {
        NetworkComparePredicateModel$CompareType networkComparePredicateModel$CompareType = new NetworkComparePredicateModel$CompareType("EQUALS", 0);
        EQUALS = networkComparePredicateModel$CompareType;
        NetworkComparePredicateModel$CompareType networkComparePredicateModel$CompareType2 = new NetworkComparePredicateModel$CompareType("GREATER", 1);
        GREATER = networkComparePredicateModel$CompareType2;
        NetworkComparePredicateModel$CompareType networkComparePredicateModel$CompareType3 = new NetworkComparePredicateModel$CompareType("GREATER_OR_EQUALS", 2);
        GREATER_OR_EQUALS = networkComparePredicateModel$CompareType3;
        NetworkComparePredicateModel$CompareType networkComparePredicateModel$CompareType4 = new NetworkComparePredicateModel$CompareType("LESSER", 3);
        LESSER = networkComparePredicateModel$CompareType4;
        NetworkComparePredicateModel$CompareType networkComparePredicateModel$CompareType5 = new NetworkComparePredicateModel$CompareType("LESSER_OR_EQUALS", 4);
        LESSER_OR_EQUALS = networkComparePredicateModel$CompareType5;
        NetworkComparePredicateModel$CompareType[] networkComparePredicateModel$CompareTypeArr = {networkComparePredicateModel$CompareType, networkComparePredicateModel$CompareType2, networkComparePredicateModel$CompareType3, networkComparePredicateModel$CompareType4, networkComparePredicateModel$CompareType5};
        $VALUES = networkComparePredicateModel$CompareTypeArr;
        $ENTRIES = a.a(networkComparePredicateModel$CompareTypeArr);
    }

    public static NetworkComparePredicateModel$CompareType valueOf(String str) {
        return (NetworkComparePredicateModel$CompareType) Enum.valueOf(NetworkComparePredicateModel$CompareType.class, str);
    }

    public static NetworkComparePredicateModel$CompareType[] values() {
        return (NetworkComparePredicateModel$CompareType[]) $VALUES.clone();
    }
}
