package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.juc;
import defpackage.k4o;
import defpackage.ovc;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/overdraft/data/model/ComparisonType;", "", "Companion", "ovc", "LESS_THAN", "AT_LEAST", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ComparisonType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ComparisonType AT_LEAST;
    public static final ovc Companion;
    public static final ComparisonType LESS_THAN;
    public static final ComparisonType UNKNOWN;

    static {
        ComparisonType comparisonType = new ComparisonType("LESS_THAN", 0);
        LESS_THAN = comparisonType;
        ComparisonType comparisonType2 = new ComparisonType("AT_LEAST", 1);
        AT_LEAST = comparisonType2;
        ComparisonType comparisonType3 = new ComparisonType("UNKNOWN", 2);
        UNKNOWN = comparisonType3;
        ComparisonType[] comparisonTypeArr = {comparisonType, comparisonType2, comparisonType3};
        $VALUES = comparisonTypeArr;
        $ENTRIES = kotlin.enums.a.a(comparisonTypeArr);
        Companion = new ovc();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new juc(5));
    }

    public static ComparisonType valueOf(String str) {
        return (ComparisonType) Enum.valueOf(ComparisonType.class, str);
    }

    public static ComparisonType[] values() {
        return (ComparisonType[]) $VALUES.clone();
    }
}
