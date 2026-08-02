package com.yandex.passport.internal.methods;

import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;

/* loaded from: classes15.dex */
public final class g extends a3 {
    public static final g w = new g("auth_cookie", true, 1);
    public static final g x = new g("authorization_url_properties", false, 1);
    public static final g y = new g("passport-auto-login-properties", false, 1);
    public static final g z = new g("child-uid", false, 1);
    public static final g A = new g("passport-code", true, 1);
    public static final g B = new g("passport-cookie", false, 1);
    public static final g C = new g("client-credential-provider", true, 1);
    public static final g D = new g("device-code", true, 1);
    public static final g E = new g("jwt_token", true, 1);
    public static final g F = new g("parent-uid", false, 1);
    public static final g G = new g("passport-environment", false, 1);
    public static final g H = new g("qr_link", true, 1);
    public static final g I = new g("person-profile", true, 1);
    public static final g J = new g("push-data-key", true, 1);
    public static final g K = new g("push-payload-holder-key", true, 1);
    public static final g L = new g("track_from_magic", true, 1);
    public static final g M = new g("track_from_magic_state", true, 1);
    public static final g N = new g("track_id", true, 1);
    public static final g O = new g("turbo_app_auth_properties", true, 1);
    public static final g P = new g(LaunchBrowserActivity.KEY_URI, false, 1);
    public static final g Q = new g("url", false, 1);
    public static final g R = new g(AutoLoginRetryActivity.KEY_USER_CREDENTIALS, true, 1);
    public static final g S = new g("user_id_properties", true, 1);
    public static final g T = new g("user_id_response", true, 1);
}
