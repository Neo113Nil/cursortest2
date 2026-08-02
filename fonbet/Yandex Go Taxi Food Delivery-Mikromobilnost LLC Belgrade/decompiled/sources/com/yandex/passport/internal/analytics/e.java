package com.yandex.passport.internal.analytics;

/* loaded from: classes15.dex */
public final class e extends m {
    public static final e b = new e("got_cookie");
    public static final e c = new e("succeeded");
    public static final e d = new e("error_cookie");
    public static final e e = new e("user_canceled");

    public e(String str) {
        super("auth.qr.".concat(str));
    }
}
