package com.yandex.passport.internal.analytics;

/* loaded from: classes15.dex */
public final class j extends m {
    public static final j b = new j("device_code.success");
    public static final j c = new j("device_code.error");

    static {
        new j("submit.success");
        new j("submit.error");
        new j("commit.success");
        new j("commit.error");
    }

    public j(String str) {
        super("device_auth.".concat(str));
    }
}
