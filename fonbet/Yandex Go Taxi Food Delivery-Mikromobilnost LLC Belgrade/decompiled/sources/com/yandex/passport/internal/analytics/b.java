package com.yandex.passport.internal.analytics;

/* loaded from: classes2.dex */
public final class b extends m {
    public static final b b = new b("show");
    public static final b c = new b("dismiss");
    public static final b d = new b("open_relogin");

    public b(String str) {
        super("account_not_authorized.".concat(str));
    }
}
