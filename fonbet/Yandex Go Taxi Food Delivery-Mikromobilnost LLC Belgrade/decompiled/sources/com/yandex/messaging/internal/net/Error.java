package com.yandex.messaging.internal.net;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class Error {
    private static final /* synthetic */ Error[] $VALUES;
    public static final Error ALIAS_INVALID;
    public static final Error GENERIC;
    public static final Error HAS_NO_RIGHTS;
    public static final Error INVITE_LINK_INVALID;
    public static final Error PRIVACY_RESTRICTIONS;

    static {
        Error error = new Error("PRIVACY_RESTRICTIONS", 0);
        PRIVACY_RESTRICTIONS = error;
        Error error2 = new Error("GENERIC", 1);
        GENERIC = error2;
        Error error3 = new Error("INVITE_LINK_INVALID", 2);
        INVITE_LINK_INVALID = error3;
        Error error4 = new Error("ALIAS_INVALID", 3);
        ALIAS_INVALID = error4;
        Error error5 = new Error("HAS_NO_RIGHTS", 4);
        HAS_NO_RIGHTS = error5;
        $VALUES = new Error[]{error, error2, error3, error4, error5};
    }

    public static Error valueOf(String str) {
        return (Error) Enum.valueOf(Error.class, str);
    }

    public static Error[] values() {
        return (Error[]) $VALUES.clone();
    }
}
