package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserStep;
import java.util.Set;

/* compiled from: UserRecomThemesChooserPatch.kt */
/* loaded from: classes4.dex */
public interface iyq0 extends xl50 {

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class a implements iyq0 {
        public final String b;

        public a(String str) {
            this.b = str;
        }
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class b implements iyq0 {
        public static final b b = new b();
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class c implements iyq0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class d implements iyq0 {
        public final UserRecomThemesChooserStep b;

        public d(UserRecomThemesChooserStep userRecomThemesChooserStep) {
            this.b = userRecomThemesChooserStep;
        }
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class e implements iyq0 {
        public static final e b = new e();
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class f implements iyq0 {
        public static final f b = new f();
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class g implements iyq0 {
        public static final g b = new g();
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class h implements iyq0 {
        public final Set<String> b;
        public final boolean c;

        public h(Set<String> set, boolean z) {
            this.b = set;
            this.c = z;
        }
    }

    /* compiled from: UserRecomThemesChooserPatch.kt */
    public static final class i implements iyq0 {
        public final RecomSettingsGetAvailableRecomThemesResponseDto b;
        public final Set<Integer> c;
        public final Set<String> d;

        public i(RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto, Set<Integer> set, Set<String> set2) {
            this.b = recomSettingsGetAvailableRecomThemesResponseDto;
            this.c = set;
            this.d = set2;
        }
    }
}
