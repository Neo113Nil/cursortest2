package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFileOld;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import kotlin.NoWhenBranchMatchedException;
import xsna.qg80;

/* compiled from: OnboardingPromoAnalyticsUtils.kt */
/* loaded from: classes4.dex */
public final class xe80 {

    /* compiled from: OnboardingPromoAnalyticsUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStat$EventItem.Type.values().length];
            try {
                iArr[SchemeStat$EventItem.Type.CLIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStat$EventItem.Type.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SchemeStat$EventItem.Type.EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SchemeStat$EventItem a(SchemeStat$EventItem.Type type, qg80 qg80Var) {
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return new SchemeStat$EventItem(type, (qg80Var instanceof qg80.c ? ((qg80.c) qg80Var).a : null) != null ? Long.valueOf(r13.c) : null, null, null, null, null, 60, null);
        }
        if (i == 2 || i == 3) {
            return new SchemeStat$EventItem(type, null, null, null, null, null, 62, null);
        }
        return null;
    }

    public static final SchemeStat$EventItem.Type b(qg80 qg80Var) {
        if (qg80Var instanceof qg80.c) {
            return SchemeStat$EventItem.Type.CLIP;
        }
        if (qg80Var instanceof qg80.b) {
            return SchemeStat$EventItem.Type.IMAGE;
        }
        if (epx.f(qg80Var, qg80.a.a)) {
            return null;
        }
        if (qg80Var == null) {
            return SchemeStat$EventItem.Type.EVENT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void c(ve80 ve80Var) {
        Long l;
        Long l2;
        Long l3;
        int i = ve80Var.e;
        String str = ve80Var.c;
        long j = ve80Var.f;
        OnboardingPromoState.CurrentSlide currentSlide = ve80Var.d;
        long j2 = 0;
        if (!ve80Var.g) {
            SchemeStat$EventItem.Type b = b(currentSlide != null ? currentSlide.b : null);
            if (b == null) {
                return;
            }
            SchemeStat$EventItem a2 = a(b, currentSlide != null ? currentSlide.b : null);
            if (a2 == null) {
                return;
            }
            if (currentSlide != null && (l = currentSlide.c) != null) {
                j2 = l.longValue() - j;
            }
            CommonOnboardingStat$TypeOnboardingEvent.OnboardingType onboardingType = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.FULLSCREEN;
            CommonOnboardingStat$TypeOnboardingEvent.EventType eventType = ve80Var.a;
            CommonOnboardingStat$TypeOnboardingEvent.EventSubtype eventSubtype = ve80Var.b;
            String str2 = str == null ? "" : str;
            qg80 qg80Var = currentSlide != null ? currentSlide.b : null;
            VideoFileOld videoFileOld = qg80Var instanceof qg80.c ? ((qg80.c) qg80Var).a : null;
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(a2, new CommonOnboardingStat$TypeOnboardingEvent(onboardingType, eventType, str2, -1, eventSubtype, videoFileOld != null ? Integer.valueOf(videoFileOld.e) : null, Long.valueOf(j2), Integer.valueOf(i + 1)), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
            return;
        }
        SchemeStat$EventItem.Type b3 = b(currentSlide != null ? currentSlide.b : null);
        if (b3 != null) {
            SchemeStat$EventItem a3 = a(b3, currentSlide != null ? currentSlide.b : null);
            if (a3 == null) {
                return;
            }
            long longValue = (currentSlide == null || (l3 = currentSlide.c) == null) ? 0L : l3.longValue();
            if (currentSlide != null && (l2 = currentSlide.c) != null) {
                j2 = l2.longValue() - j;
            }
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            CommonOnboardingStat$TypeOnboardingEvent.OnboardingType onboardingType2 = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.FULLSCREEN;
            CommonOnboardingStat$TypeOnboardingEvent.EventType eventType2 = ve80Var.a;
            CommonOnboardingStat$TypeOnboardingEvent.EventSubtype eventSubtype2 = ve80Var.b;
            String str3 = str == null ? "" : str;
            qg80 qg80Var2 = currentSlide != null ? currentSlide.b : null;
            VideoFileOld videoFileOld2 = qg80Var2 instanceof qg80.c ? ((qg80.c) qg80Var2).a : null;
            bvt0 bvt0Var = new bvt0(c2, SchemeStat$TypeView.a.b(a3, String.valueOf(longValue), String.valueOf(j2), null, new CommonOnboardingStat$TypeOnboardingEvent(onboardingType2, eventType2, str3, -1, eventSubtype2, videoFileOld2 != null ? Integer.valueOf(videoFileOld2.e) : null, Long.valueOf(j2), Integer.valueOf(i + 1)), 8));
            if (ve80Var.a == CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE_APP) {
                bvt0Var.c = true;
            }
            bvt0Var.q();
        }
    }
}
