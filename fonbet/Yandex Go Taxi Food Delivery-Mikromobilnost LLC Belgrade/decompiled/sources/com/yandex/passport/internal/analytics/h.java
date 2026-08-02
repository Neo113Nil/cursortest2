package com.yandex.passport.internal.analytics;

import com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment;

/* loaded from: classes2.dex */
public final class h extends m {
    public static final h b = new h("start");
    public static final h c = new h("show_acept_dialog");
    public static final h d = new h("user_accepted");
    public static final h e = new h(GimapServerPrefsBaseFragment.SHOW_ERROR);
    public static final h f = new h("show_finish_registration");
    public static final h g = new h("cancel_finish_registration");
    public static final h h = new h("success_finish_registration");
    public static final h i = new h("cancel");

    public h(String str) {
        super("auth_by_track_id.".concat(str));
    }
}
