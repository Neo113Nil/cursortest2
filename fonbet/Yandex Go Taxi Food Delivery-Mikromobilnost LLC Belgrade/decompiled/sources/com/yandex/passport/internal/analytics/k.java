package com.yandex.passport.internal.analytics;

/* loaded from: classes15.dex */
public final class k extends m {
    public static final k b = new k("sms_screen_close");
    public static final k c = new k("credential_manager_result_null");
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    public static final k r;

    static {
        new k("social_reg_portal_account");
        d = new k("show_fragment_npe");
        e = new k("authenticator_null");
        f = new k("authenticator_fixed");
        g = new k("authenticator_changed");
        h = new k("authenticator_not_fixed");
        i = new k("account_updated_instead_of_add");
        j = new k("account_failed_to_add");
        k = new k("account_recreated");
        l = new k("account_failed_to_recreate_on_delete");
        m = new k("account_failed_to_recreate_on_add");
        n = new k("account_created_with_synthetic_name");
        o = new k("domik_activity_extras_null");
        new k("send_session_id_only_for_master_token");
        new k("send_all_cookies_for_master_token");
        new k("send_cookies_session_id_for_master_token");
        new k("legacy_database_access");
        p = new k("master_token_update");
        q = new k("master_token_decrypt_error");
        r = new k("fix_silent_authenticator_change");
    }

    public k(String str) {
        super("diagnostic.".concat(str));
    }
}
