package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsRecomThemeDto;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserButtonAction;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserStep;
import com.vk.stat.scheme.CommonOnboardingRecomThemesStat$TypeRecomThemesItem;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.dyq0;
import xsna.iyq0;
import xsna.qyq0;

/* compiled from: UserRecomThemesChooserFeature.kt */
/* loaded from: classes4.dex */
public final class hyq0 extends wk50<tyq0, ryq0, dyq0, iyq0> {
    public final xyq0 f;
    public final fzq0 g;
    public final String h;
    public final boolean i;
    public final f4z j;

    /* compiled from: UserRecomThemesChooserFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UserRecomThemesChooserButtonAction.values().length];
            try {
                iArr[UserRecomThemesChooserButtonAction.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserRecomThemesChooserButtonAction.Save.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UserRecomThemesChooserStep.values().length];
            try {
                iArr2[UserRecomThemesChooserStep.TopLevelThemes.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserRecomThemesChooserStep.SecondLevelThemes.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public hyq0(xyq0 xyq0Var, fzq0 fzq0Var, String str, boolean z) {
        super(dyq0.c.b, new lyq0());
        this.f = xyq0Var;
        this.g = fzq0Var;
        this.h = str;
        this.i = z;
        this.j = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ryq0 ryq0Var, dyq0 dyq0Var) {
        iyq0.h hVar;
        Set<String> set;
        RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto;
        List<RecomSettingsRecomThemeDto> d;
        Object obj;
        ryq0 ryq0Var2 = ryq0Var;
        dyq0 dyq0Var2 = dyq0Var;
        Set<String> set2 = ryq0Var2.h;
        UserRecomThemesChooserStep userRecomThemesChooserStep = ryq0Var2.l;
        boolean equals = dyq0Var2.equals(dyq0.c.b);
        fzq0 fzq0Var = this.g;
        if (equals) {
            fzq0Var.getClass();
            fzq0.a(fzq0Var, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.SHOW_SCREEN_STEP_1);
            W();
            return;
        }
        if (dyq0Var2.equals(dyq0.f.b)) {
            W();
            return;
        }
        if (dyq0Var2.equals(dyq0.e.b)) {
            int i = a.$EnumSwitchMapping$0[ryq0Var2.j.ordinal()];
            if (i == 1) {
                X(new j5b0(this, 23));
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                X(new q8i0(this, 16));
                return;
            }
        }
        if (dyq0Var2 instanceof dyq0.d) {
            faf0 faf0Var = ((dyq0.d) dyq0Var2).b;
            boolean z = faf0Var.c;
            String str = faf0Var.a;
            if (z) {
                UserRecomThemesChooserStep userRecomThemesChooserStep2 = UserRecomThemesChooserStep.TopLevelThemes;
                uki0 uki0Var = ghp.a;
                if (userRecomThemesChooserStep == userRecomThemesChooserStep2 && (recomSettingsGetAvailableRecomThemesResponseDto = ryq0Var2.f) != null && (d = recomSettingsGetAvailableRecomThemesResponseDto.d()) != null) {
                    Iterator<T> it = d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (epx.f(String.valueOf(((RecomSettingsRecomThemeDto) obj).getId()), str)) {
                                break;
                            }
                        }
                    }
                    RecomSettingsRecomThemeDto recomSettingsRecomThemeDto = (RecomSettingsRecomThemeDto) obj;
                    if (recomSettingsRecomThemeDto != null) {
                        uki0Var = new ulp0(new i5g(recomSettingsRecomThemeDto.f()), new ubj0(6));
                    }
                }
                Set C = rli0.C(rli0.w(uki0Var, str));
                set = izi0.g(set2, C);
                hVar = new iyq0.h(C, false);
            } else {
                LinkedHashSet k = izi0.k(set2, str);
                hVar = new iyq0.h(Collections.singleton(str), true);
                fzq0Var.getClass();
                fzq0.b(SchemeStat$TypeRegistrationItem.EventType.SELECT_SUBJECT);
                set = k;
            }
            this.f.f(set);
            T(hVar);
            return;
        }
        boolean equals2 = dyq0Var2.equals(eyq0.b);
        f4z f4zVar = this.j;
        if (equals2) {
            int i2 = a.$EnumSwitchMapping$1[userRecomThemesChooserStep.ordinal()];
            if (i2 == 1) {
                fzq0Var.getClass();
                fzq0.a(fzq0Var, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.HIDE_SCREEN_STEP_1);
                f4zVar.b(qyq0.b.a);
                return;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fzq0Var.getClass();
                fzq0.a(fzq0Var, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.HIDE_SCREEN_STEP_2);
                T(new iyq0.d(UserRecomThemesChooserStep.TopLevelThemes));
                return;
            }
        }
        if (dyq0Var2.equals(fyq0.b)) {
            f4zVar.b(qyq0.a.a);
            if (fzq0Var.a) {
                fzq0.b(SchemeStat$TypeRegistrationItem.EventType.SCREEN_SKIP);
            }
            int i3 = a.$EnumSwitchMapping$1[userRecomThemesChooserStep.ordinal()];
            if (i3 == 1) {
                fzq0.a(fzq0Var, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.HIDE_SCREEN_STEP_1);
                return;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fzq0.a(fzq0Var, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.HIDE_SCREEN_STEP_2);
                return;
            }
        }
        if (dyq0Var2.equals(dyq0.a.b)) {
            if (fzq0Var.a) {
                fzq0.b(SchemeStat$TypeRegistrationItem.EventType.SCREEN_BLUR);
            }
        } else {
            if (!dyq0Var2.equals(dyq0.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fzq0Var.a) {
                fzq0.b(SchemeStat$TypeRegistrationItem.EventType.SCREEN_FOCUS);
            }
        }
    }

    public final wj50<qyq0> U() {
        return this.j;
    }

    public final void V(RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto, Set<Integer> set) {
        Set<String> C = rli0.C(rli0.o(new i5g(recomSettingsGetAvailableRecomThemesResponseDto.d()), new wgm0(set, 8)));
        this.f.f(C);
        T(new iyq0.i(recomSettingsGetAvailableRecomThemesResponseDto, set, C));
    }

    public final void W() {
        xyq0 xyq0Var = this.f;
        io.reactivex.rxjava3.core.x<RecomSettingsGetAvailableRecomThemesResponseDto> d = xyq0Var.d();
        asu0 asu0Var = asu0.a;
        this.e.b(new io.reactivex.rxjava3.internal.operators.single.n(d.q(asu0Var.c()).m(asu0Var.d()), new oo20(new qjm0(this, 5), 27)).subscribe(new i3q0(new rtg0(this, 11), 1), new fsq0(new qyi0(this, 14), 1)));
        hg1.i(xyq0Var.a().q(asu0Var.c()).m(asu0Var.d()), new mmm0(this, 9));
    }

    public final void X(izs<? super Boolean, s3q0> izsVar) {
        T(iyq0.f.b);
        xyq0 xyq0Var = this.f;
        String str = this.h;
        xyq0Var.b(str);
        xyq0Var.h();
        io.reactivex.rxjava3.core.x<Boolean> g = xyq0Var.g(str);
        asu0 asu0Var = asu0.a;
        this.e.b(g.q(asu0Var.c()).m(asu0Var.d()).subscribe(new pmu(new ohq0(1, this, izsVar), 28), new pd40(new r5i0(8, this, izsVar), 17)));
    }
}
