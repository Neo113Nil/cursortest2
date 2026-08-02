package com.yandex.passport.internal.report;

import com.yandex.auth.LegacyAccountType;
import defpackage.fd20;

/* loaded from: classes15.dex */
public final class n9 extends fd20 {
    public static final n9 w = new n9(3, null, "phonish");
    public static final n9 x = new n9(3, null, "push_openurl_in_browser");
    public static final n9 y = new n9(3, null, "qr_without_qr");
    public static final n9 z = new n9(3, null, "send_auth_to_track");
    public static final n9 A = new n9(3, null, "push_silent");
    public static final n9 B = new n9(3, null, LegacyAccountType.STRING_SOCIAL);
    public static final n9 C = new n9(3, null, "social_action");
    public static final n9 D = new n9(3, null, "standalone");
    public static final n9 E = new n9(3, null, "stash");
    public static final n9 F = new n9(3, null, "storage");
    public static final n9 G = new n9(3, null, "suggested_language");
    public static final n9 H = new n9(3, null, "tombstone");
    public static final n9 I = new n9(3, null, "update_master_token");
    public static final n9 J = new n9(3, null, "user_id");
    public static final n9 K = new n9(3, null, "user_info");
    public static final n9 L = new n9(3, null, "warm_up_web_view");
    public static final n9 M = new n9(3, null, "web_am");
    public static final n9 N = new n9(3, null, "web_card");
    public static final n9 O = new n9(3, null, "web_card_push");
    public static final n9 P = new n9(3, null, "webauthn");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(String str, int i) {
        super(3, n6.w, str);
        switch (i) {
            case 22:
                super(3, o6.w, str);
                break;
            default:
                break;
        }
    }

    public n9(n9 n9Var, String str) {
        super(3, n9Var, str);
    }
}
