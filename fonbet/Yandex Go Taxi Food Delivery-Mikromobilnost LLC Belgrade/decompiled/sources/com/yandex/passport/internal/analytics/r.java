package com.yandex.passport.internal.analytics;

/* loaded from: classes15.dex */
public final class r extends m {
    public static final r b = new r("data_null");
    public static final r c = new r("recreate");
    public static final r d = new r("browser_not_found");
    public static final r e = new r("browser_opened");
    public static final r f = new r("open_from_browser");
    public static final r g = new r("new_intent_empty_url");
    public static final r h = new r("new_intent_success");
    public static final r i = new r("canceled");

    public r(String str) {
        super("social_browser.".concat(str));
    }
}
