package xsna;

import com.vk.stat.scheme.CommonOnboardingRecomThemesStat$TypeRecomThemesItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;

/* compiled from: UserRecomThemesStatInteractor.kt */
/* loaded from: classes4.dex */
public final class fzq0 {
    public final boolean a;

    public fzq0(boolean z) {
        this.a = z;
    }

    public static void a(fzq0 fzq0Var, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType eventType) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = fzq0Var.a ? MobileOfficialAppsCoreNavStat$EventScreen.REGISTRATIONS_RECOM_THEMES : MobileOfficialAppsCoreNavStat$EventScreen.ONBOARDING_RECOM_THEMES;
        fzq0Var.getClass();
        new uaf0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeAction.a.b(null, null, new CommonOnboardingRecomThemesStat$TypeRecomThemesItem(eventType, null), 3)).q();
    }

    public static void b(SchemeStat$TypeRegistrationItem.EventType eventType) {
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.REGISTRATIONS_RECOM_THEMES, SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeRegistrationItem(eventType, null, null, null, null, null, null, null, null, null, null, null, 4094, null), 3)).q();
    }
}
