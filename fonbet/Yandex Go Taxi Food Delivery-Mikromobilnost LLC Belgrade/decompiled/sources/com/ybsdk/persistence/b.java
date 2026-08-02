package com.ybsdk.persistence;

import android.content.SharedPreferences;
import defpackage.a6w;
import defpackage.ew2;
import defpackage.kgx;
import defpackage.oyr;
import defpackage.qoi0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class b {
    public static final /* synthetic */ kgx[] l = {new MutablePropertyReference1Impl("hapticFeedbackEnabled", 0, "getHapticFeedbackEnabled()Z", b.class), oyr.B(qoi0.a, b.class, "spoilerWasShown", "getSpoilerWasShown()Z", 0), new PropertyReference1Impl("hideSpoilerOnRotationSettingEnabled", 0, "getHideSpoilerOnRotationSettingEnabled()Z", b.class), new MutablePropertyReference1Impl("showSpoilerOnLaunchSettingEnabled", 0, "getShowSpoilerOnLaunchSettingEnabled()Z", b.class), new MutablePropertyReference1Impl("shouldSkipSpoilerOnboarding", 0, "getShouldSkipSpoilerOnboarding()Z", b.class), new MutablePropertyReference1Impl("isWebViewOutLineEnabled", 0, "isWebViewOutLineEnabled()Z", b.class), new MutablePropertyReference1Impl("shouldShowDivViewBounds", 0, "getShouldShowDivViewBounds()Z", b.class), new MutablePropertyReference1Impl("sendRequestTimeHeader", 0, "getSendRequestTimeHeader()Z", b.class), new MutablePropertyReference1Impl("screenshotsCount", 0, "getScreenshotsCount()I", b.class)};
    public final SharedPreferences a;
    public final ew2 b;
    public final kotlinx.coroutines.flow.b c = e.g(new UserIndependentStorage$hapticChangedFlow$1(this, null));
    public final ew2 d;
    public final ew2 e;
    public final ew2 f;
    public final ew2 g;
    public final ew2 h;
    public final ew2 i;
    public final ew2 j;
    public final a6w k;

    public b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        boolean z = true;
        this.b = new ew2(sharedPreferences, "is_haptic_feedback_enabled", z);
        boolean z2 = false;
        this.d = new ew2(sharedPreferences, "prefs_is_spoiler_visible", z2);
        this.e = new ew2(sharedPreferences, "prefs_is_spoiler_setting_enabled", z);
        this.f = new ew2(sharedPreferences, "prefs_show_spoiler_on_launch_enabled", z2);
        this.g = new ew2(sharedPreferences, "prefs_should_skip_spoiler_onboarding", z2);
        this.h = new ew2(sharedPreferences, "prefs_is_web_view_outline_enabled", z2);
        this.i = new ew2(sharedPreferences, "prefs_is_divkit_view_outline_enabled", z2);
        this.j = new ew2(sharedPreferences, "prefs_send_request_time_header", z2);
        this.k = new a6w(0, sharedPreferences, "prefs_screenshots_count");
    }

    public final boolean a() {
        kgx kgxVar = l[2];
        return this.e.a().booleanValue();
    }

    public final boolean b() {
        kgx kgxVar = l[3];
        return this.f.a().booleanValue();
    }
}
