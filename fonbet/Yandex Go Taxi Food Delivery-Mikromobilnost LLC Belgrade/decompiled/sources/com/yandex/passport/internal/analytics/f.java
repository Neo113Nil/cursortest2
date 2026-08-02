package com.yandex.passport.internal.analytics;

/* loaded from: classes2.dex */
public final class f extends m {
    public static final f b = new f("show");
    public static final f c = new f("cancel");
    public static final f d = new f("success");
    public static final f e = new f("failed");
    public static final f f = new f("gimap_error");
    public static final f g = new f("restore_from_track_error");
    public static final f h = new f("cancel_to_another_provider");

    public f(String str) {
        super("auth.social.gimap.".concat(str));
    }
}
