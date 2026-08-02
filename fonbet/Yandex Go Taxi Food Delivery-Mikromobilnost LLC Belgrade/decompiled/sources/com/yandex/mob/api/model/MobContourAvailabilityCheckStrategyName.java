package com.yandex.mob.api.model;

import defpackage.en20;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.um20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mob/api/model/MobContourAvailabilityCheckStrategyName;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "en20", "CurrentAndDefault", "All", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobContourAvailabilityCheckStrategyName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobContourAvailabilityCheckStrategyName[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MobContourAvailabilityCheckStrategyName All;
    public static final en20 Companion;
    public static final MobContourAvailabilityCheckStrategyName CurrentAndDefault;
    private final String value;

    static {
        MobContourAvailabilityCheckStrategyName mobContourAvailabilityCheckStrategyName = new MobContourAvailabilityCheckStrategyName("CurrentAndDefault", 0, "current_and_default");
        CurrentAndDefault = mobContourAvailabilityCheckStrategyName;
        MobContourAvailabilityCheckStrategyName mobContourAvailabilityCheckStrategyName2 = new MobContourAvailabilityCheckStrategyName("All", 1, "all");
        All = mobContourAvailabilityCheckStrategyName2;
        MobContourAvailabilityCheckStrategyName[] mobContourAvailabilityCheckStrategyNameArr = {mobContourAvailabilityCheckStrategyName, mobContourAvailabilityCheckStrategyName2};
        $VALUES = mobContourAvailabilityCheckStrategyNameArr;
        $ENTRIES = a.a(mobContourAvailabilityCheckStrategyNameArr);
        Companion = new en20();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(1));
    }

    public MobContourAvailabilityCheckStrategyName(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobContourAvailabilityCheckStrategyName valueOf(String str) {
        return (MobContourAvailabilityCheckStrategyName) Enum.valueOf(MobContourAvailabilityCheckStrategyName.class, str);
    }

    public static MobContourAvailabilityCheckStrategyName[] values() {
        return (MobContourAvailabilityCheckStrategyName[]) $VALUES.clone();
    }
}
