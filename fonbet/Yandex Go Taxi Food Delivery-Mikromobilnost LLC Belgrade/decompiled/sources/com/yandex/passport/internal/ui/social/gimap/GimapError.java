package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.R;

/* loaded from: classes2.dex */
public enum GimapError {
    FAILED_RESOLVE_SERVERS("auth error: cannot resolve external servers", R.string.passport_gimap_resolve_external_servers_err_title),
    IMAP_LOGIN_ERROR("auth error: imap login error", R.string.passport_gimap_imap_auth_err_title),
    IMAP_FAILED_CONNECT("auth error: cannot connect to imap server", R.string.passport_gimap_imap_connect_err_title),
    SMTP_FAILED_CONNECT("auth error: cannot connect to smtp server", R.string.passport_gimap_smtp_connect_err_title),
    SMTP_LOGIN_ERROR("auth error: smtp login error", R.string.passport_gimap_smtp_auth_err_title),
    SMTP_BAD_EMAIL("auth error: bad email", R.string.passport_gimap_server_prefs_bad_email_err_title),
    SMTP_INCOMPLETE_PARAMS("auth error: incomplete smtp params", R.string.passport_gimap_smtp_auth_err_title),
    ACCOUNT_BLOCKED("auth error: account blocked", R.string.passport_gimap_account_blocked_err_title),
    IMAP_DISABLED("auth error: protocol disabled", R.string.passport_gimap_protocol_disabled_err_title),
    INTERNAL_SERVER_ERROR("auth error: internal server error", R.string.passport_gimap_internal_err_title),
    UNKNOWN_ERROR("auth error: unknown error", R.string.passport_gimap_unexpected_err_title),
    BAD_KARMA("auth error: bad karma", R.string.passport_gimap_bad_karma_err_title),
    FORBIDDEN_PROVIDER("auth error: forbidden provider", R.string.passport_gimap_unexpected_err_title),
    RATE_LIMIT_EXCEEDED("auth error: rate limit exceeded", R.string.passport_gimap_try_later);

    public final String errorMessage;
    public final int titleRes;

    GimapError(String str, int i) {
        this.errorMessage = str.concat(" ");
        this.titleRes = i;
    }
}
