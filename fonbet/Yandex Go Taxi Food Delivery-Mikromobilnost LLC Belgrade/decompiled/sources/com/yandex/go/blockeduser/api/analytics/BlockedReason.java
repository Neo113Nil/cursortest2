package com.yandex.go.blockeduser.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/blockeduser/api/analytics/BlockedReason;", "", "LAUNCH_HAS_BLOCKED", "HANDLE_FORBIDDEN", "go-client-android.features.blockeduser:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockedReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BlockedReason[] $VALUES;
    public static final BlockedReason HANDLE_FORBIDDEN;
    public static final BlockedReason LAUNCH_HAS_BLOCKED;

    static {
        BlockedReason blockedReason = new BlockedReason("LAUNCH_HAS_BLOCKED", 0);
        LAUNCH_HAS_BLOCKED = blockedReason;
        BlockedReason blockedReason2 = new BlockedReason("HANDLE_FORBIDDEN", 1);
        HANDLE_FORBIDDEN = blockedReason2;
        BlockedReason[] blockedReasonArr = {blockedReason, blockedReason2};
        $VALUES = blockedReasonArr;
        $ENTRIES = a.a(blockedReasonArr);
    }

    public static BlockedReason valueOf(String str) {
        return (BlockedReason) Enum.valueOf(BlockedReason.class, str);
    }

    public static BlockedReason[] values() {
        return (BlockedReason[]) $VALUES.clone();
    }
}
