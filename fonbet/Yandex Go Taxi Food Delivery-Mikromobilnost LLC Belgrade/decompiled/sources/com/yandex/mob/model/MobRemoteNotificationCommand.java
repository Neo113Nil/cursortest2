package com.yandex.mob.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.sq20;
import defpackage.tq20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/mob/model/MobRemoteNotificationCommand;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "tq20", "AddToConfig", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MobRemoteNotificationCommand {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobRemoteNotificationCommand[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MobRemoteNotificationCommand AddToConfig;
    public static final tq20 Companion;
    private final String value = "add-to-config";

    static {
        MobRemoteNotificationCommand mobRemoteNotificationCommand = new MobRemoteNotificationCommand();
        AddToConfig = mobRemoteNotificationCommand;
        MobRemoteNotificationCommand[] mobRemoteNotificationCommandArr = {mobRemoteNotificationCommand};
        $VALUES = mobRemoteNotificationCommandArr;
        $ENTRIES = a.a(mobRemoteNotificationCommandArr);
        Companion = new tq20();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sq20(0));
    }

    public static MobRemoteNotificationCommand valueOf(String str) {
        return (MobRemoteNotificationCommand) Enum.valueOf(MobRemoteNotificationCommand.class, str);
    }

    public static MobRemoteNotificationCommand[] values() {
        return (MobRemoteNotificationCommand[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
