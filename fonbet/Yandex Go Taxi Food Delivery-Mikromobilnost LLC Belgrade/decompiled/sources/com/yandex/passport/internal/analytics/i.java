package com.yandex.passport.internal.analytics;

/* loaded from: classes8.dex */
public final class i extends m {
    public static final i b = new i("invalidate");
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    public static final i j;
    public static final i k;
    public static final i l;
    public static final i m;
    public static final i n;
    public static final i o;
    public static final i p;
    public static final i q;

    static {
        new i("pin_create");
        new i("pin_reset");
        c = new i("activation");
        new i("get_code_by_token");
        new i("announcement_sent");
        new i("announcement_received");
        d = new i("synchronization");
        e = new i("stash_updating");
        new i("master_token_revoking");
        f = new i("master_token_removing");
        g = new i("account_downgrading");
        h = new i("legacy_extra_data_uid_removing");
        i = new i("account_removing");
        j = new i("accounts_restoration");
        k = new i("invalid_authenticator");
        l = new i("account_corrupted");
        m = new i("accounts_retrieval");
        n = new i("accounts_restoration_result");
        o = new i("accounts_count_mismatch_after_restoration");
        p = new i("accounts_count_mismatch_in_retrieve");
        q = new i("try_fix_delayed_accounts");
    }

    public i(String str) {
        super("core.".concat(str));
    }
}
