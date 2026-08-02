package com.yandex.passport.internal.analytics;

/* loaded from: classes15.dex */
public final class n extends m {
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;

    static {
        new n("request_client_token");
        b = new n("master_token_corrupting");
        c = new n("synced_by_sso");
        d = new n("provider_call_passport_process");
        e = new n("bundle_is_null_in_call_provider_client");
        f = new n("application_remove_account");
    }

    public n(String str) {
        super("local.".concat(str));
    }
}
