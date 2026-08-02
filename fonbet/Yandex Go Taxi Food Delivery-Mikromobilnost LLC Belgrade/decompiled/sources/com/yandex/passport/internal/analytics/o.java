package com.yandex.passport.internal.analytics;

/* loaded from: classes2.dex */
public final class o extends m {
    public static final o b = new o("accept");
    public static final o c = new o("decline");
    public static final o d = new o("show_scopes");
    public static final o e = new o("error");

    public o(String str) {
        super("loginsdk.".concat(str));
    }
}
