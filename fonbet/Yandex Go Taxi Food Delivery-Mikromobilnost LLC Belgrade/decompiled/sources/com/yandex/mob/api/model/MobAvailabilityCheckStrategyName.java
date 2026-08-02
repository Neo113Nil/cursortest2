package com.yandex.mob.api.model;

import defpackage.bm20;
import defpackage.g110;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/mob/api/model/MobAvailabilityCheckStrategyName;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "bm20", "ActiveAndFirst", "FirstSecondNext", "AllInList", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobAvailabilityCheckStrategyName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobAvailabilityCheckStrategyName[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MobAvailabilityCheckStrategyName ActiveAndFirst;
    public static final MobAvailabilityCheckStrategyName AllInList;
    public static final bm20 Companion;
    public static final MobAvailabilityCheckStrategyName FirstSecondNext;
    private final String value;

    static {
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName = new MobAvailabilityCheckStrategyName("ActiveAndFirst", 0, "active_and_first");
        ActiveAndFirst = mobAvailabilityCheckStrategyName;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName2 = new MobAvailabilityCheckStrategyName("FirstSecondNext", 1, "first_second_next");
        FirstSecondNext = mobAvailabilityCheckStrategyName2;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName3 = new MobAvailabilityCheckStrategyName("AllInList", 2, "all_in_list");
        AllInList = mobAvailabilityCheckStrategyName3;
        MobAvailabilityCheckStrategyName[] mobAvailabilityCheckStrategyNameArr = {mobAvailabilityCheckStrategyName, mobAvailabilityCheckStrategyName2, mobAvailabilityCheckStrategyName3};
        $VALUES = mobAvailabilityCheckStrategyNameArr;
        $ENTRIES = a.a(mobAvailabilityCheckStrategyNameArr);
        Companion = new bm20();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g110(26));
    }

    public MobAvailabilityCheckStrategyName(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobAvailabilityCheckStrategyName valueOf(String str) {
        return (MobAvailabilityCheckStrategyName) Enum.valueOf(MobAvailabilityCheckStrategyName.class, str);
    }

    public static MobAvailabilityCheckStrategyName[] values() {
        return (MobAvailabilityCheckStrategyName[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
