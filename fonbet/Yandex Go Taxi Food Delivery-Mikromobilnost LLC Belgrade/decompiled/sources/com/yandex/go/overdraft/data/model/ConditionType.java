package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kpd;
import defpackage.yxd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/overdraft/data/model/ConditionType;", "", "Companion", "yxd", "SHOW", "HIDE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConditionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConditionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final yxd Companion;
    public static final ConditionType HIDE;
    public static final ConditionType SHOW;
    public static final ConditionType UNKNOWN;

    static {
        ConditionType conditionType = new ConditionType("SHOW", 0);
        SHOW = conditionType;
        ConditionType conditionType2 = new ConditionType("HIDE", 1);
        HIDE = conditionType2;
        ConditionType conditionType3 = new ConditionType("UNKNOWN", 2);
        UNKNOWN = conditionType3;
        ConditionType[] conditionTypeArr = {conditionType, conditionType2, conditionType3};
        $VALUES = conditionTypeArr;
        $ENTRIES = kotlin.enums.a.a(conditionTypeArr);
        Companion = new yxd();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(15));
    }

    public static ConditionType valueOf(String str) {
        return (ConditionType) Enum.valueOf(ConditionType.class, str);
    }

    public static ConditionType[] values() {
        return (ConditionType[]) $VALUES.clone();
    }
}
