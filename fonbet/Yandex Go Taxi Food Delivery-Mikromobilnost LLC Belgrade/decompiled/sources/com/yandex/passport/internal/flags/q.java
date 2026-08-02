package com.yandex.passport.internal.flags;

import com.yandex.passport.internal.push.PushIconType;
import com.yandex.passport.internal.ui.domik.webam.WebAmRegistrationType;
import defpackage.scc;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public abstract class q {
    public static final a A0;
    public static final a B0;
    public static final a C0;
    public static final a D0;
    public static final a E0;
    public static final m s0;
    public static final m t0;
    public static final a u0;
    public static final a v0;
    public static final a w0;
    public static final a x0;
    public static final a y0;
    public static final l z0;
    public static final a a = new a("android_fast_auth_url_user_id", true);
    public static final a b = new a("android_partial_binding_service_impl", false);
    public static final a c = new a("android_create_profile_in_master", false);
    public static final a d = new a("android_make_token_master_in_background", false);
    public static final l e = new l("android_make_master_cool_down_short_minutes", 1440);
    public static final l f = new l("android_make_master_cool_down_long_minutes", 43200);
    public static final a g = new a("android_esia_binding_app_to_app", true);
    public static final a h = new a("social_registration", false);
    public static final a i = new a("turn_sso_off", false);
    public static final a j = new a("registration_login_creation", false);
    public static final a k = new a("turn_superlite_reg_from_phone_on", true);
    public static final a l = new a("turn_social_native_gg_on", true);
    public static final a m = new a("turn_social_native_fb_on", true);
    public static final a n = new a("turn_social_native_vk_on", true);
    public static final b o = new b("web_am_reg_type", WebAmRegistrationType.Portal, WebAmRegistrationType.values());
    public static final a p = new a("web_card_animation", false);
    public static final l q = new l("max_push_subscription_interval", (int) com.yandex.passport.common.time.a.c(4, 0, 0, 14));
    public static final a r = new a("skip_initial_loading", false);
    public static final a s = new a("push_me", true);
    public static final a t = new a("modern_push_subscriber", false);
    public static final l u = new l("push_codes_max_timeout", 2000);
    public static final b v = new b("push_icon_type", PushIconType.DEFAULT, PushIconType.values());
    public static final a w = new a("sloth_login_upgrade", true);
    public static final m x = new m("auth_sdk_packages", scc.g("com.yandex.browser", "ru.yandex.searchplugin", "com.yandex.searchapp", "ru.yandex.taxi", "ru.yandex.mail", "ru.yandex.disk", "com.yandex.bank", "ru.yandex.key", "ru.yandex.auth.client"));
    public static final a y = new a("force_upgrade", false);
    public static final a z = new a("web_am.use_bundle_cache", false);
    public static final a A = new a("android_web_am_clear_cookie_before_auth", false);
    public static final a B = new a("save_local", true);
    public static final a C = new a("QR_without_QR_slider_flow", false);
    public static final a D = new a("credential_manager_for_autologin", true);
    public static final a E = new a("android_autologin_with_config", false);
    public static final a F = new a("android_autologin_master_accounts_enabled", false);
    public static final a G = new a("challenge_on_account_change", true);
    public static final a H = new a("dear_diary", true);
    public static final a I = new a("x_token_rotation", true);
    public static final a J = new a("android_fast_auth_url_account_upgrade", true);
    public static final a K = new a("android_fast_auth_url_phone_confirm", true);
    public static final a L = new a("android_fast_auth_url_auth_qr", true);
    public static final a M = new a("android_fast_auth_url_auth_qr_without_qr_slider", true);
    public static final a N = new a("android_fast_auth_url_web_url_push", true);
    public static final a O = new a("android_fast_auth_url_auth_sdk", true);
    public static final a P = new a("android_fast_auth_url_pay_url", true);
    public static final a Q = new a("android_fast_account_delete_forever", false);
    public static final a R = new a("webauthn_expand_availability", true);
    public static final a S = new a("android_compose_bouncer_renderer", true);
    public static final a T = new a("android_logout_compose_bottom_sheet", true);
    public static final a U = new a("android_compose_challenge_screens", true);
    public static final a V = new a("android_compose_logout_whole_screen", true);
    public static final a W = new a("android_compose_standalone_sloth_screen", true);
    public static final a X = new a("android_compose_account_upgrader_screen", true);
    public static final a Y = new a("android_compose_delete_forever_screen", true);
    public static final a Z = new a("android_compose_bouncer_sloth_screen", true);
    public static final a a0 = new a("android_compose_managing_devices_screen", true);
    public static final a b0 = new a("android_no_darkside_warm_up_screen", false);
    public static final a c0 = new a("android_compose_web_card_screen", false);
    public static final a d0 = new a("android_compose_auth_sdk_sloth_screen", false);
    public static final a e0 = new a("android_compose_global_router_screen", false);
    public static final a f0 = new a("android_compose_login_router_screen", false);
    public static final a g0 = new a("encrypt_data", false);
    public static final a h0 = new a("android_encrypt_data_v2", true);
    public static final a i0 = new a("android_encrypt_fast_auth_cookie", true);
    public static final a j0 = new a("android_blob_encrypt_account_rows", true);
    public static final a k0 = new a("android_silent_push", true);
    public static final l l0 = new l("silent_push_ui_show_duration", 0);
    public static final a m0 = new a("android_silent_push_subscription.v2", true);
    public static final a n0 = new a("push_big_icon", false);
    public static final a o0 = new a("android_picture_push", false);
    public static final a p0 = new a("android_host_token_provider", false);
    public static final l q0 = new l("android_user_info_max_age", 24);
    public static final a r0 = new a("android_show_master_members", false);

    static {
        EmptyList emptyList = EmptyList.a;
        s0 = new m("android_models_with_authenticator_problem", emptyList);
        t0 = new m("android_models_with_encrypt_data", emptyList);
        u0 = new a("android_use_cached_cipher", false);
        v0 = new a("android_cached_accounts_from_dao", true);
        w0 = new a("android_silent_code_only_foreground", false);
        x0 = new a("android_silent_code_foreground", false);
        y0 = new a("android_fix_silent_authenticator_change", false);
        z0 = new l("android_delayed_work_timeout_ms", 10000);
        A0 = new a("android_is_send_metric_about_dependencies", true);
        B0 = new a("android_skip_routing_if_saved_state", true);
        C0 = new a("android_force_block_vpn", false);
        D0 = new a("android_block_vpn_ignore_foreground_detector", false);
        E0 = new a("android_block_vpn_unregister_network_in_background", true);
    }

    public static Map a() {
        return kotlin.collections.b.i(new Pair("Others", scc.g(b, B0, c, d, e, f, g, w, i, j, p, r, x, y, B, H, G, I, R, T, g0, h0, q0, r0, s0, u0, y0, A0, v0, j0, C0, D0, E0)), new Pair("Compose", scc.g(S, U, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0)), new Pair("Web", scc.g(o, z, A)), new Pair("Registration", Collections.singletonList(k)), new Pair("Autologin", scc.g(D, E, F)), new Pair("Social", scc.g(m, l, n, h)), new Pair("Push", scc.g(s, q, t, u, k0, l0, m0, v, n0, p0, o0, w0, x0)), new Pair("Url backups", scc.g(p.a, p.c, p.b, p.d, p.e)), new Pair("Link auth", scc.g(n.b(), n.a(), C)), new Pair("Fast Auth Url", scc.g(a, J, K, L, M, N, O, P, Q, i0)));
    }
}
