package com.yandex.passport.internal.analytics;

/* loaded from: classes15.dex */
public final class s extends m {
    public static final s b = new s("sync_failed");
    public static final s c = new s("account_not_found");
    public static final s d;
    public static final s e;

    static {
        new s("legacy_account_upgraded");
        d = new s("account_refreshed");
        e = new s("account_repaired");
        new s("get_upgrade_status_failed");
        new s("get_children_failed");
    }

    public s(String str) {
        super("sync.".concat(str));
    }
}
