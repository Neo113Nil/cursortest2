package xsna;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ClipsOnboardingsPrefsImpl.kt */
/* loaded from: classes17.dex */
public final class mne implements lne {
    public static final /* synthetic */ qcy<Object>[] g = {new MutablePropertyReference1Impl(mne.class, "onboardingScrollShown", "getOnboardingScrollShown()Z", 0), p5j.a(0, mne.class, "onboardingDoubleTapShowed", "getOnboardingDoubleTapShowed()Z", fpf0.a), new MutablePropertyReference1Impl(mne.class, "onboardingClipsSchoolSettingsBadged", "getOnboardingClipsSchoolSettingsBadged()Z", 0), new MutablePropertyReference1Impl(mne.class, "onboardingFeedShownCount", "getOnboardingFeedShownCount()J", 0), new MutablePropertyReference1Impl(mne.class, "onboardingFastForwardShown", "getOnboardingFastForwardShown()Z", 0), new MutablePropertyReference1Impl(mne.class, "onboardingAuthorSwipeShown", "getOnboardingAuthorSwipeShown()Z", 0), new MutablePropertyReference1Impl(mne.class, "onboardingShopsTabVisited", "getOnboardingShopsTabVisited()Z", 0)};
    public final f18 a = new f18("VkVideoBridge", "VkVideoBridge.showClipsViewerOnBoarding", false);
    public final f18 b = new f18("VkVideoBridge", "VkVideoBridge.show_clips_double_tap_onboarding", false);
    public final hn70 c;
    public final f18 d;
    public final f18 e;
    public final f18 f;

    public mne() {
        new f18("VkVideoBridge", "VkVideoBridge.show_clips_school_settings_onboarding", true);
        this.c = new hn70("VkVideoBridge", "VkVideoBridge.clips_feed_shown_count");
        this.d = new f18("VkVideoBridge", "VkVideoBridge.clips_fast_forward_onboarding_shown", false);
        this.e = new f18("VkVideoBridge", "VkVideoBridge.showAuthorSwipeOnBoarding", false);
        this.f = new f18("VkVideoBridge", "VkVideoBridge.shops_tab_visited", false);
    }

    @Override // xsna.lne
    public final boolean a() {
        qcy<Object> qcyVar = g[4];
        return this.d.a().booleanValue();
    }

    @Override // xsna.lne
    public final boolean b() {
        qcy<Object> qcyVar = g[5];
        return this.e.a().booleanValue();
    }

    @Override // xsna.lne
    public final boolean c() {
        qcy<Object> qcyVar = g[6];
        return this.f.a().booleanValue();
    }

    @Override // xsna.lne
    public final void d() {
        qcy<Object> qcyVar = g[6];
        this.f.b(true);
    }

    @Override // xsna.lne
    public final void e() {
        qcy<Object> qcyVar = g[4];
        this.d.b(true);
    }

    @Override // xsna.lne
    public final boolean f() {
        qcy<Object> qcyVar = g[1];
        return this.b.a().booleanValue();
    }

    @Override // xsna.lne
    public final void g() {
        qcy<Object> qcyVar = g[1];
        this.b.b(true);
    }

    @Override // xsna.lne
    public final void h() {
        qcy<Object> qcyVar = g[5];
        this.e.b(true);
    }

    @Override // xsna.lne
    public final void i() {
        qcy<Object> qcyVar = g[0];
        this.a.b(true);
    }

    @Override // xsna.lne
    public final boolean j() {
        qcy<Object> qcyVar = g[0];
        return this.a.a().booleanValue();
    }
}
