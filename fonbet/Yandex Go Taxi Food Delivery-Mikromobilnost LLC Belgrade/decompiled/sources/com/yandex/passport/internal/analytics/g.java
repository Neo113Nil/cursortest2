package com.yandex.passport.internal.analytics;

/* loaded from: classes2.dex */
public final class g extends m {
    public static final g b = new g("auth_success");
    public static final g c = new g("cancel");
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;

    static {
        new g("launch");
        d = new g("auth_fail");
        e = new g("auth_try");
        f = new g("save_modern_account");
        g = new g("return_account");
    }

    public g(String str) {
        super("auth.".concat(str));
    }
}
