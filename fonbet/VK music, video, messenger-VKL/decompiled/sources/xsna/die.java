package xsna;

import com.vk.stat.scheme.CommonOnboardingRecomThemesStat$TypeRecomThemesItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;

/* compiled from: ClipsInterestsStatReporterImpl.kt */
/* loaded from: classes16.dex */
public final class die implements cie {
    public static void g(die dieVar, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType eventType) {
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CHOICE_INTERESTS, SchemeStat$TypeAction.a.b(null, null, new CommonOnboardingRecomThemesStat$TypeRecomThemesItem(eventType, null), 3)).q();
    }

    @Override // xsna.cie
    public final void a() {
        g(this, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.SHOW_MODAL);
    }

    @Override // xsna.cie
    public final void b() {
        g(this, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.HIDE_MODAL);
    }

    @Override // xsna.cie
    public final void c() {
        g(this, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.SHOW_SCREEN_STEP_2);
    }

    @Override // xsna.cie
    public final void d() {
        g(this, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.SHOW_SCREEN_STEP_1);
    }

    @Override // xsna.cie
    public final void e() {
        g(this, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.HIDE_SCREEN_STEP_2);
    }

    @Override // xsna.cie
    public final void f() {
        g(this, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.HIDE_SCREEN_STEP_1);
    }
}
