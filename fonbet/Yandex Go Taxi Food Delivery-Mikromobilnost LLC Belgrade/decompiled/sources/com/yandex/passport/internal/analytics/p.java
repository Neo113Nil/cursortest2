package com.yandex.passport.internal.analytics;

/* loaded from: classes8.dex */
public final class p extends m {
    public static final p b = new p("content_provider_client_error");
    public static final p c = new p("is_trusted_error");
    public static final p d = new p("send_broadcast_in_bootstrap");
    public static final p e = new p("send_broadcast_in_backup");
    public static final p f = new p("insert_accounts_in_bootstrap");
    public static final p g = new p("insert_accounts_in_backup");
    public static final p h = new p("sync_accounts");
    public static final p i = new p("give_accounts");
    public static final p j = new p("fetch_accounts");
    public static final p k = new p("receive_accounts");
    public static final p l = new p("insert_accounts_failed");
    public static final p m = new p("insert_accounts_start");
    public static final p n = new p("insert_accounts_finish");
    public static final p o = new p("create_last_action_add");
    public static final p p = new p("report_announce_failed");

    public p(String str) {
        super("sso.".concat(str));
    }
}
