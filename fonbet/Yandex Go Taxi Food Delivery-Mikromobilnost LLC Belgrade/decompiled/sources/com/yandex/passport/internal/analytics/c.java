package com.yandex.passport.internal.analytics;

/* loaded from: classes15.dex */
public final class c extends m {
    public static final c b = new c("start");
    public static final c c = new c("finish");
    public static final c d = new c("error");

    public c(String str) {
        super("applink_activity.".concat(str));
    }
}
