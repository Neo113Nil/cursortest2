package ru.ok.android.api.core;

import xsna.zcl;

/* compiled from: ApiLoginException.kt */
/* loaded from: classes9.dex */
public final class ApiLoginException extends ApiInvocationException {
    public static final String CUSTOM_KEY_BLOCKED = "auth.blocked";
    public static final String CUSTOM_KEY_INVALID_CREDENTIALS = "auth.invalid_credentials";
    public static final String CUSTOM_KEY_LOGOUT_ALL = "auth.user.logout_all ";
    public static final String CUSTOM_KEY_SOCIAL_DISABLED = "auth.social.disabled";
    public static final String CUSTOM_KEY_UNBLOCK = "auth.unblock";
    public static final String CUSTOM_KEY_USER_BLOCKED = "auth.user.blocked";
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_REGISTRATION_TOKEN = "registration_token";
    public static final String MESSAGE_BLOCKED = "AUTH_LOGIN : BLOCKED";
    public static final String MESSAGE_DELETED = "AUTH_LOGIN : DELETED";
    public static final String MESSAGE_INVALID_CREDENTIALS = "AUTH_LOGIN : INVALID_CREDENTIALS";
    public static final String MESSAGE_LOGOUT_ALL = "AUTH_LOGIN : LOGOUT_ALL";
    public static final String MESSAGE_PASSWORD_WRONG = "AUTH_LOGIN : errors.user.password.wrong";
    public static final String MESSAGE_SIGN_IN_DISABLED = "AUTH_LOGIN : SOCIAL_LOGIN_DISABLED";

    /* compiled from: ApiLoginException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ApiLoginException(String str, String str2, String str3, String str4, String str5) {
        super(401, str, str2, str3, str4, str5, null, 64, null);
    }

    public final String getRegistrationToken() {
        if (FIELD_REGISTRATION_TOKEN.equals(getErrorField())) {
            return getErrorData();
        }
        return null;
    }

    public final boolean isBlocked() {
        return CUSTOM_KEY_BLOCKED.equals(getErrorCustomKey()) || CUSTOM_KEY_USER_BLOCKED.equals(getErrorCustomKey()) || CUSTOM_KEY_UNBLOCK.equals(getErrorCustomKey()) || MESSAGE_BLOCKED.equals(getErrorMessage());
    }

    public final boolean isDeleted() {
        return MESSAGE_DELETED.equals(getErrorMessage());
    }

    public final boolean isInvalidCredentials() {
        return CUSTOM_KEY_INVALID_CREDENTIALS.equals(getErrorCustomKey()) || MESSAGE_INVALID_CREDENTIALS.equals(getErrorMessage());
    }

    public final boolean isLogoutAll() {
        return CUSTOM_KEY_LOGOUT_ALL.equals(getErrorCustomKey()) || MESSAGE_LOGOUT_ALL.equals(getErrorMessage());
    }

    public final boolean isPasswordWrong() {
        return MESSAGE_PASSWORD_WRONG.equals(getErrorMessage());
    }

    public final boolean isSignInDisabled() {
        return CUSTOM_KEY_SOCIAL_DISABLED.equals(getErrorCustomKey()) || MESSAGE_SIGN_IN_DISABLED.equals(getErrorMessage());
    }
}
