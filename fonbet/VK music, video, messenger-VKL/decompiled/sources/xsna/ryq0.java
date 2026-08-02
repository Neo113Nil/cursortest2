package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserButtonAction;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserStep;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: UserRecomThemesChooserState.kt */
/* loaded from: classes4.dex */
public final class ryq0 implements km50 {
    public static final ryq0 m = new ryq0(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RecomSettingsGetAvailableRecomThemesResponseDto f;
    public final String g;
    public final Set<String> h;
    public final boolean i;
    public final UserRecomThemesChooserButtonAction j;
    public final boolean k;
    public final UserRecomThemesChooserStep l;

    public ryq0() {
        this(0);
    }

    public static ryq0 a(ryq0 ryq0Var, boolean z, boolean z2, boolean z3, boolean z4, RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto, String str, Set set, boolean z5, UserRecomThemesChooserButtonAction userRecomThemesChooserButtonAction, boolean z6, UserRecomThemesChooserStep userRecomThemesChooserStep, int i) {
        if ((i & 1) != 0) {
            z = ryq0Var.b;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = ryq0Var.c;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = ryq0Var.d;
        }
        boolean z9 = z3;
        boolean z10 = (i & 8) != 0 ? ryq0Var.e : z4;
        RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto2 = (i & 16) != 0 ? ryq0Var.f : recomSettingsGetAvailableRecomThemesResponseDto;
        String str2 = (i & 32) != 0 ? ryq0Var.g : str;
        Set set2 = (i & 64) != 0 ? ryq0Var.h : set;
        boolean z11 = (i & 128) != 0 ? ryq0Var.i : z5;
        UserRecomThemesChooserButtonAction userRecomThemesChooserButtonAction2 = (i & 256) != 0 ? ryq0Var.j : userRecomThemesChooserButtonAction;
        boolean z12 = (i & 512) != 0 ? ryq0Var.k : z6;
        UserRecomThemesChooserStep userRecomThemesChooserStep2 = (i & 1024) != 0 ? ryq0Var.l : userRecomThemesChooserStep;
        ryq0Var.getClass();
        return new ryq0(z7, z8, z9, z10, recomSettingsGetAvailableRecomThemesResponseDto2, str2, set2, z11, userRecomThemesChooserButtonAction2, z12, userRecomThemesChooserStep2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryq0)) {
            return false;
        }
        ryq0 ryq0Var = (ryq0) obj;
        return this.b == ryq0Var.b && this.c == ryq0Var.c && this.d == ryq0Var.d && this.e == ryq0Var.e && epx.f(this.f, ryq0Var.f) && epx.f(this.g, ryq0Var.g) && epx.f(this.h, ryq0Var.h) && this.i == ryq0Var.i && this.j == ryq0Var.j && this.k == ryq0Var.k && this.l == ryq0Var.l;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto = this.f;
        int hashCode = (b + (recomSettingsGetAvailableRecomThemesResponseDto == null ? 0 : recomSettingsGetAvailableRecomThemesResponseDto.hashCode())) * 31;
        String str = this.g;
        return this.l.hashCode() + qoy.b((this.j.hashCode() + qoy.b(fw3.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.h), 31, this.i)) * 31, 31, this.k);
    }

    public final String toString() {
        return "UserRecomThemesChooserState(isLoading=" + this.b + ", isLoadingError=" + this.c + ", isSubmitting=" + this.d + ", isSubmittingError=" + this.e + ", availableThemesResponse=" + this.f + ", avatarUrl=" + this.g + ", selectedItemIds=" + this.h + ", hasThemes=" + this.i + ", buttonAction=" + this.j + ", isFromRegistration=" + this.k + ", step=" + this.l + ')';
    }

    public ryq0(boolean z, boolean z2, boolean z3, boolean z4, RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto, String str, Set<String> set, boolean z5, UserRecomThemesChooserButtonAction userRecomThemesChooserButtonAction, boolean z6, UserRecomThemesChooserStep userRecomThemesChooserStep) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = recomSettingsGetAvailableRecomThemesResponseDto;
        this.g = str;
        this.h = set;
        this.i = z5;
        this.j = userRecomThemesChooserButtonAction;
        this.k = z6;
        this.l = userRecomThemesChooserStep;
    }

    public ryq0(int i) {
        this(false, false, false, false, null, null, EmptySet.b, false, UserRecomThemesChooserButtonAction.Next, false, UserRecomThemesChooserStep.TopLevelThemes);
    }
}
