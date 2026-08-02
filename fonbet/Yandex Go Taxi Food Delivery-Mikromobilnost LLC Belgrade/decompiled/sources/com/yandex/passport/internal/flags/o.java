package com.yandex.passport.internal.flags;

/* loaded from: classes8.dex */
public abstract class o {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a a = new a("reporting", true);
    public static final a b = new a("reporting_sloth", true);
    public static final a c = new a("reporting_safe_bouncer", true);
    public static final a d = new a("reporting_account_upgrade", true);
    public static final a e = new a("reporting_challenge", true);
    public static final a f = new a("reporting_experiments", true);
    public static final a g = new a("reporting_push", true);
    public static final a h = new a("reporting_x_token_action", true);
    public static final a i = new a("reporting_backend", true);
    public static final a j = new a("reporting_user_info", true);
    public static final a k = new a("reporting_auto_login", true);
    public static final a l = new a("reporting_bind_phone_number", true);
    public static final a m = new a("reporting_get_authorization_url", true);
    public static final a n = new a("reporting_social", true);
    public static final a o = new a("reporting_suggested_language", true);
    public static final a p = new a("reporting_send_auth_to_track", true);
    public static final a q = new a("reporting_authorization", true);
    public static final a r = new a("reporting_passport_init", true);
    public static final a s = new a("reporting_stash", true);
    public static final a t = new a("reporting_announcement", true);
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        Flag$Type flag$Type = Flag$Type.BOOLEAN;
        u = new a("reporting_link_auth", true);
        v = new a("reporting_local_uid", true);
        w = new a("reporting_warm_up_web_view", true);
        x = new a("reporting_x_token_rotation", true);
        y = new a("reporting_auth_sdk", true);
        z = new a("reporting_web_card", true);
        A = new a("reporting_standalone", true);
        B = new a("reporting_exit_reason", true);
        C = new a("reporting_phonish", true);
        D = new a("reporting_webam", true);
        E = new a("reporting_encrypt", true);
        F = new a("reporting_managing_plus_devices", true);
        G = new a("reporting_tombstone", true);
    }
}
