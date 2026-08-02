package com.yandex.mob.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/mob/model/MobCronJobType;", "", "Notifications", "AvailabilityReport", "AvailabilityReportAll", "Config", "DetailReport", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobCronJobType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobCronJobType[] $VALUES;
    public static final MobCronJobType AvailabilityReport;
    public static final MobCronJobType AvailabilityReportAll;
    public static final MobCronJobType Config;
    public static final MobCronJobType DetailReport;
    public static final MobCronJobType Notifications;

    static {
        MobCronJobType mobCronJobType = new MobCronJobType("Notifications", 0);
        Notifications = mobCronJobType;
        MobCronJobType mobCronJobType2 = new MobCronJobType("AvailabilityReport", 1);
        AvailabilityReport = mobCronJobType2;
        MobCronJobType mobCronJobType3 = new MobCronJobType("AvailabilityReportAll", 2);
        AvailabilityReportAll = mobCronJobType3;
        MobCronJobType mobCronJobType4 = new MobCronJobType("Config", 3);
        Config = mobCronJobType4;
        MobCronJobType mobCronJobType5 = new MobCronJobType("DetailReport", 4);
        DetailReport = mobCronJobType5;
        MobCronJobType[] mobCronJobTypeArr = {mobCronJobType, mobCronJobType2, mobCronJobType3, mobCronJobType4, mobCronJobType5};
        $VALUES = mobCronJobTypeArr;
        $ENTRIES = a.a(mobCronJobTypeArr);
    }

    public static MobCronJobType valueOf(String str) {
        return (MobCronJobType) Enum.valueOf(MobCronJobType.class, str);
    }

    public static MobCronJobType[] values() {
        return (MobCronJobType[]) $VALUES.clone();
    }
}
