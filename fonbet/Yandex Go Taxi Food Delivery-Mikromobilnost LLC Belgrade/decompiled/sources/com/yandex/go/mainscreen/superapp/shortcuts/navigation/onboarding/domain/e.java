package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain;

import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;
import defpackage.b1w0;
import defpackage.bae0;
import defpackage.c1w0;
import defpackage.dae0;
import defpackage.j170;
import defpackage.kgx;
import defpackage.mth;
import defpackage.ny61;
import defpackage.sme0;
import defpackage.u2w0;
import defpackage.v0w0;
import defpackage.v4r0;
import defpackage.z0w0;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.settings.main.k;

/* loaded from: classes.dex */
public final class e {
    public final ru.yandex.taxi.widget.c a;
    public final z0w0 b;
    public final k c;
    public final bae0 d;
    public final u2w0 e;
    public final d f;

    public e(ru.yandex.taxi.widget.c cVar, z0w0 z0w0Var, k kVar, bae0 bae0Var, u2w0 u2w0Var) {
        this.a = cVar;
        this.b = z0w0Var;
        this.c = kVar;
        this.d = bae0Var;
        this.e = u2w0Var;
        this.f = new d(new b(new mth(new m0(new mth(z0w0Var.a, 6), z0w0Var.e, new SuperAppMainOnboardingInteractor$onboardingFlow$1(3, null)), 6), this), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, v0w0 v0w0Var, ContinuationImpl continuationImpl) {
        SuperAppMainOnboardingInteractor$mapOnboarding$1 superAppMainOnboardingInteractor$mapOnboarding$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        Object i2;
        CharSequence charSequence;
        v0w0 v0w0Var2;
        String str2;
        eVar.getClass();
        ru.yandex.taxi.widget.c cVar = eVar.a;
        if (continuationImpl instanceof SuperAppMainOnboardingInteractor$mapOnboarding$1) {
            superAppMainOnboardingInteractor$mapOnboarding$1 = (SuperAppMainOnboardingInteractor$mapOnboarding$1) continuationImpl;
            int i3 = superAppMainOnboardingInteractor$mapOnboarding$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superAppMainOnboardingInteractor$mapOnboarding$1.label = i3 - Integer.MIN_VALUE;
                Object obj = superAppMainOnboardingInteractor$mapOnboarding$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainOnboardingInteractor$mapOnboarding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String b = v0w0Var.b();
                    FormattedText e = v0w0Var.e();
                    superAppMainOnboardingInteractor$mapOnboarding$1.L$0 = v0w0Var;
                    superAppMainOnboardingInteractor$mapOnboarding$1.L$1 = b;
                    superAppMainOnboardingInteractor$mapOnboarding$1.label = 1;
                    Object i4 = ru.yandex.taxi.widget.c.i(cVar, e, null, superAppMainOnboardingInteractor$mapOnboarding$1, 30);
                    if (i4 != coroutineSingletons) {
                        str = b;
                        obj = i4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) superAppMainOnboardingInteractor$mapOnboarding$1.L$2;
                    str2 = (String) superAppMainOnboardingInteractor$mapOnboarding$1.L$1;
                    v0w0Var2 = (v0w0) superAppMainOnboardingInteractor$mapOnboarding$1.L$0;
                    kotlin.b.b(obj);
                    return new b1w0(v0w0Var2.c(), new j170(str2, charSequence, (CharSequence) obj, v0w0Var2.a()));
                }
                String str3 = (String) superAppMainOnboardingInteractor$mapOnboarding$1.L$1;
                v0w0 v0w0Var3 = (v0w0) superAppMainOnboardingInteractor$mapOnboarding$1.L$0;
                kotlin.b.b(obj);
                str = str3;
                v0w0Var = v0w0Var3;
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText d = v0w0Var.d();
                superAppMainOnboardingInteractor$mapOnboarding$1.L$0 = v0w0Var;
                superAppMainOnboardingInteractor$mapOnboarding$1.L$1 = str;
                superAppMainOnboardingInteractor$mapOnboarding$1.L$2 = charSequence2;
                superAppMainOnboardingInteractor$mapOnboarding$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, d, null, superAppMainOnboardingInteractor$mapOnboarding$1, 30);
                if (i2 != coroutineSingletons) {
                    v0w0 v0w0Var4 = v0w0Var;
                    charSequence = charSequence2;
                    obj = i2;
                    v0w0Var2 = v0w0Var4;
                    str2 = str;
                    return new b1w0(v0w0Var2.c(), new j170(str2, charSequence, (CharSequence) obj, v0w0Var2.a()));
                }
                return coroutineSingletons;
            }
        }
        superAppMainOnboardingInteractor$mapOnboarding$1 = new SuperAppMainOnboardingInteractor$mapOnboarding$1(eVar, continuationImpl);
        Object obj2 = superAppMainOnboardingInteractor$mapOnboarding$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainOnboardingInteractor$mapOnboarding$1.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText d2 = v0w0Var.d();
        superAppMainOnboardingInteractor$mapOnboarding$1.L$0 = v0w0Var;
        superAppMainOnboardingInteractor$mapOnboarding$1.L$1 = str;
        superAppMainOnboardingInteractor$mapOnboarding$1.L$2 = charSequence22;
        superAppMainOnboardingInteractor$mapOnboarding$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar, d2, null, superAppMainOnboardingInteractor$mapOnboarding$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void b(j170 j170Var) {
        Object value;
        c1w0 a;
        ((dae0) this.d).d(SuperAppMainOnboardingView.ONBOARDING_POPUP_ID);
        String str = j170Var.a;
        z0w0 z0w0Var = this.b;
        r0 r0Var = z0w0Var.d;
        sme0 sme0Var = z0w0Var.b;
        do {
            value = r0Var.getValue();
            kgx[] kgxVarArr = z0w0.f;
            a = c1w0.a((c1w0) value, v4r0.i((Set) sme0Var.getValue(z0w0Var, kgxVarArr[0]), str), 14);
            sme0Var.setValue(z0w0Var, kgxVarArr[0], a.a);
        } while (!r0Var.k(value, a));
    }
}
