package com.yandex.passport.sloth.command;

/* loaded from: classes2.dex */
public final class d extends e {
    public static final d b = new d("bad_types");
    public static final d c = new d("invalid_message");
    public static final d d = new d("no_secrets");
    public static final d e = new d("no_code_in_sms");
    public static final d f = new d("phone_hint_not_available");
    public static final d g = new d("unsupported_provider");

    public d(String str) {
        super("otp_obtaining_error_".concat(str));
    }
}
