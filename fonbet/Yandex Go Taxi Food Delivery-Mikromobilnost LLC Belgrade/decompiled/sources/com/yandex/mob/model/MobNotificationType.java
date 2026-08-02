package com.yandex.mob.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rp20;
import defpackage.um20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/mob/model/MobNotificationType;", "", "", "type", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "rp20", "UpdateConfig", "AvailabilityReport", "DetailedReport", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobNotificationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobNotificationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MobNotificationType AvailabilityReport;
    public static final rp20 Companion;
    public static final MobNotificationType DetailedReport;
    public static final MobNotificationType UpdateConfig;
    private final String type;

    static {
        MobNotificationType mobNotificationType = new MobNotificationType("UpdateConfig", 0, "update_config");
        UpdateConfig = mobNotificationType;
        MobNotificationType mobNotificationType2 = new MobNotificationType("AvailabilityReport", 1, "availability_report");
        AvailabilityReport = mobNotificationType2;
        MobNotificationType mobNotificationType3 = new MobNotificationType("DetailedReport", 2, "detailed_report");
        DetailedReport = mobNotificationType3;
        MobNotificationType[] mobNotificationTypeArr = {mobNotificationType, mobNotificationType2, mobNotificationType3};
        $VALUES = mobNotificationTypeArr;
        $ENTRIES = a.a(mobNotificationTypeArr);
        Companion = new rp20();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(4));
    }

    public MobNotificationType(String str, int i, String str2) {
        this.type = str2;
    }

    public static MobNotificationType valueOf(String str) {
        return (MobNotificationType) Enum.valueOf(MobNotificationType.class, str);
    }

    public static MobNotificationType[] values() {
        return (MobNotificationType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
