package xsna;

import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserButtonAction;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserStep;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.iyq0;

/* compiled from: UserRecomThemesChooserReducer.kt */
/* loaded from: classes4.dex */
public final class lyq0 extends dm50<tyq0, iyq0, ryq0> {
    public final zrp<UserRecomThemesChooserStep> d;

    /* compiled from: UserRecomThemesChooserReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UserRecomThemesChooserStep.values().length];
            try {
                iArr[UserRecomThemesChooserStep.TopLevelThemes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserRecomThemesChooserStep.SecondLevelThemes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UserRecomThemesChooserButtonAction.values().length];
            try {
                iArr2[UserRecomThemesChooserButtonAction.Save.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserRecomThemesChooserButtonAction.Next.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public lyq0() {
        super(ryq0.m);
        this.d = UserRecomThemesChooserStep.h();
    }

    public static UserRecomThemesChooserButtonAction i(UserRecomThemesChooserStep userRecomThemesChooserStep, Set set, boolean z) {
        return (userRecomThemesChooserStep == UserRecomThemesChooserStep.SecondLevelThemes || (z && set.isEmpty())) ? UserRecomThemesChooserButtonAction.Save : UserRecomThemesChooserButtonAction.Next;
    }

    @Override // xsna.dm50
    public final ryq0 c(ryq0 ryq0Var, iyq0 iyq0Var) {
        ryq0 ryq0Var2 = ryq0Var;
        iyq0 iyq0Var2 = iyq0Var;
        Set<String> set = ryq0Var2.h;
        UserRecomThemesChooserStep userRecomThemesChooserStep = ryq0Var2.l;
        boolean z = ryq0Var2.i;
        if (iyq0Var2.equals(iyq0.b.b)) {
            return ryq0.a(ryq0Var2, false, true, false, false, null, null, null, false, null, false, null, 2044);
        }
        if (iyq0Var2 instanceof iyq0.c) {
            return ryq0.a(ryq0Var2, true, false, false, false, null, null, null, false, null, ((iyq0.c) iyq0Var2).b, null, 1532);
        }
        if (iyq0Var2 instanceof iyq0.a) {
            return ryq0.a(ryq0Var2, false, false, false, false, null, ((iyq0.a) iyq0Var2).b, null, false, null, false, null, 2015);
        }
        if (iyq0Var2 instanceof iyq0.i) {
            iyq0.i iVar = (iyq0.i) iyq0Var2;
            return ryq0.a(ryq0Var2, false, false, false, false, iVar.b, null, iVar.d, !iVar.c.isEmpty(), i(userRecomThemesChooserStep, iVar.d, z), false, null, 1580);
        }
        if (iyq0Var2 instanceof iyq0.d) {
            UserRecomThemesChooserStep userRecomThemesChooserStep2 = ((iyq0.d) iyq0Var2).b;
            return ryq0.a(ryq0Var2, false, false, false, false, null, null, null, false, i(userRecomThemesChooserStep2, set, z), false, userRecomThemesChooserStep2, 767);
        }
        if (iyq0Var2 instanceof iyq0.h) {
            iyq0.h hVar = (iyq0.h) iyq0Var2;
            Set<String> set2 = hVar.b;
            Set j = hVar.c ? izi0.j(set, set2) : izi0.g(set, set2);
            return ryq0.a(ryq0Var2, false, false, false, false, null, null, j, false, i(userRecomThemesChooserStep, j, z), false, null, 1727);
        }
        if (iyq0Var2.equals(iyq0.f.b)) {
            return ryq0.a(ryq0Var2, false, false, true, false, null, null, null, false, null, false, null, 2035);
        }
        if (iyq0Var2.equals(iyq0.g.b)) {
            return ryq0.a(ryq0Var2, false, false, false, false, null, null, null, false, null, false, null, 2035);
        }
        if (iyq0Var2.equals(iyq0.e.b)) {
            return ryq0.a(ryq0Var2, false, false, false, true, null, null, null, false, null, false, null, 2035);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final tyq0 d() {
        return new tyq0(e(new fvq0(this, 1)));
    }

    @Override // xsna.dm50
    public final void h(ryq0 ryq0Var, tyq0 tyq0Var) {
        f(tyq0Var.a, ryq0Var);
    }
}
