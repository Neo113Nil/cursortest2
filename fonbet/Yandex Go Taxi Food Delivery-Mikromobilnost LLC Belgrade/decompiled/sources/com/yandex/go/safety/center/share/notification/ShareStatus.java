package com.yandex.go.safety.center.share.notification;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/safety/center/share/notification/ShareStatus;", "", "Companion", "com/yandex/go/safety/center/share/notification/a", JCP.RAW_PREFIX, DefaultErrorCategoryProvider.PREPARING, "IN_PROGRESS", "SUCCESS", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShareStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShareStatus[] $VALUES;
    public static final a Companion;
    public static final ShareStatus ERROR;
    private static final long ERROR_TIMEOUT_MS = 5000;
    public static final ShareStatus IN_PROGRESS;
    public static final ShareStatus NONE;
    public static final ShareStatus PREPARING;
    public static final ShareStatus SUCCESS;
    private static final long SUCCESS_TIMEOUT_MS = 1800;

    static {
        ShareStatus shareStatus = new ShareStatus(JCP.RAW_PREFIX, 0);
        NONE = shareStatus;
        ShareStatus shareStatus2 = new ShareStatus(DefaultErrorCategoryProvider.PREPARING, 1);
        PREPARING = shareStatus2;
        ShareStatus shareStatus3 = new ShareStatus("IN_PROGRESS", 2);
        IN_PROGRESS = shareStatus3;
        ShareStatus shareStatus4 = new ShareStatus("SUCCESS", 3);
        SUCCESS = shareStatus4;
        ShareStatus shareStatus5 = new ShareStatus("ERROR", 4);
        ERROR = shareStatus5;
        ShareStatus[] shareStatusArr = {shareStatus, shareStatus2, shareStatus3, shareStatus4, shareStatus5};
        $VALUES = shareStatusArr;
        $ENTRIES = kotlin.enums.a.a(shareStatusArr);
        Companion = new a();
    }

    public static ShareStatus valueOf(String str) {
        return (ShareStatus) Enum.valueOf(ShareStatus.class, str);
    }

    public static ShareStatus[] values() {
        return (ShareStatus[]) $VALUES.clone();
    }
}
