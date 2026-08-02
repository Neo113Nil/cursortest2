package com.yandex.mob.params;

import defpackage.ar20;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.sq20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/mob/params/MobRemoteNotificationStatus;", "", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Companion", "ar20", "Silent", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MobRemoteNotificationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobRemoteNotificationStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ar20 Companion;
    public static final MobRemoteNotificationStatus Silent;
    private final String description = "silent";

    static {
        MobRemoteNotificationStatus mobRemoteNotificationStatus = new MobRemoteNotificationStatus();
        Silent = mobRemoteNotificationStatus;
        MobRemoteNotificationStatus[] mobRemoteNotificationStatusArr = {mobRemoteNotificationStatus};
        $VALUES = mobRemoteNotificationStatusArr;
        $ENTRIES = a.a(mobRemoteNotificationStatusArr);
        Companion = new ar20();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sq20(4));
    }

    public static MobRemoteNotificationStatus valueOf(String str) {
        return (MobRemoteNotificationStatus) Enum.valueOf(MobRemoteNotificationStatus.class, str);
    }

    public static MobRemoteNotificationStatus[] values() {
        return (MobRemoteNotificationStatus[]) $VALUES.clone();
    }
}
