package com.yandex.mob.reporting;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/mob/reporting/MobNotificationsTrimReason;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CountLimit", "ExpirationInterval", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MobNotificationsTrimReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobNotificationsTrimReason[] $VALUES;
    public static final MobNotificationsTrimReason CountLimit;
    public static final MobNotificationsTrimReason ExpirationInterval;
    private final String value;

    static {
        MobNotificationsTrimReason mobNotificationsTrimReason = new MobNotificationsTrimReason("CountLimit", 0, "countLimit");
        CountLimit = mobNotificationsTrimReason;
        MobNotificationsTrimReason mobNotificationsTrimReason2 = new MobNotificationsTrimReason("ExpirationInterval", 1, "expirationInterval");
        ExpirationInterval = mobNotificationsTrimReason2;
        MobNotificationsTrimReason[] mobNotificationsTrimReasonArr = {mobNotificationsTrimReason, mobNotificationsTrimReason2};
        $VALUES = mobNotificationsTrimReasonArr;
        $ENTRIES = kotlin.enums.a.a(mobNotificationsTrimReasonArr);
    }

    public MobNotificationsTrimReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobNotificationsTrimReason valueOf(String str) {
        return (MobNotificationsTrimReason) Enum.valueOf(MobNotificationsTrimReason.class, str);
    }

    public static MobNotificationsTrimReason[] values() {
        return (MobNotificationsTrimReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
