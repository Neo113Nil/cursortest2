package com.yandex.go.multimodal_route.interactors;

import com.yandex.go.multimodal_route.experiement.MultimodalRoutesExperiment;
import defpackage.c6z;
import defpackage.dne0;
import defpackage.e9s;
import defpackage.ny61;
import defpackage.wt40;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes12.dex */
public final class b {
    public final com.yandex.go.multimodal_route.experiement.c a;
    public final dne0 b;

    public b(com.yandex.go.multimodal_route.experiement.c cVar, dne0 dne0Var) {
        this.a = cVar;
        this.b = dne0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        if (r10 == r11) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MultimodalRouteOnboardingInteractor$getOnboardingConfig$1 multimodalRouteOnboardingInteractor$getOnboardingConfig$1;
        int i;
        MultimodalRoutesExperiment.OnboardingConfig onboardingConfig;
        FormattedText formattedText;
        MultimodalRoutesExperiment.OnboardingConfig onboardingConfig2;
        FormattedText formattedText2;
        FormattedText formattedText3;
        FormattedText formattedText4;
        FormattedText formattedText5;
        MultimodalRoutesExperiment.OnboardingConfig onboardingConfig3;
        Object b;
        FormattedText formattedText6;
        FormattedText formattedText7;
        FormattedText formattedText8;
        String str;
        com.yandex.go.multimodal_route.experiement.c cVar = this.a;
        q qVar = cVar.a;
        if (continuationImpl instanceof MultimodalRouteOnboardingInteractor$getOnboardingConfig$1) {
            multimodalRouteOnboardingInteractor$getOnboardingConfig$1 = (MultimodalRouteOnboardingInteractor$getOnboardingConfig$1) continuationImpl;
            int i2 = multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteOnboardingInteractor$getOnboardingConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label = 1;
                    obj = cVar.c(multimodalRouteOnboardingInteractor$getOnboardingConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                formattedText7 = (FormattedText) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$4;
                                str = (String) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$3;
                                formattedText6 = (FormattedText) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$2;
                                formattedText8 = (FormattedText) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1;
                                kotlin.b.b(obj);
                                return new wt40(str, formattedText8, formattedText6, e9s.b(formattedText7, (c6z) obj));
                            }
                            formattedText2 = (FormattedText) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$2;
                            formattedText5 = (FormattedText) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1;
                            onboardingConfig3 = (MultimodalRoutesExperiment.OnboardingConfig) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$0;
                            kotlin.b.b(obj);
                            formattedText4 = e9s.b(formattedText2, (c6z) obj);
                            formattedText3 = formattedText5;
                            onboardingConfig2 = onboardingConfig3;
                            String str2 = onboardingConfig2.c;
                            FormattedText formattedText9 = onboardingConfig2.d;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$0 = null;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1 = formattedText3;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$2 = formattedText4;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$3 = str2;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$4 = formattedText9;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label = 4;
                            b = qVar.b(multimodalRouteOnboardingInteractor$getOnboardingConfig$1);
                            if (b != coroutineSingletons) {
                                formattedText6 = formattedText4;
                                obj = b;
                                formattedText7 = formattedText9;
                                formattedText8 = formattedText3;
                                str = str2;
                                return new wt40(str, formattedText8, formattedText6, e9s.b(formattedText7, (c6z) obj));
                            }
                            return coroutineSingletons;
                        }
                        formattedText = (FormattedText) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1;
                        onboardingConfig2 = (MultimodalRoutesExperiment.OnboardingConfig) multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$0;
                        kotlin.b.b(obj);
                        FormattedText b2 = e9s.b(formattedText, (c6z) obj);
                        formattedText2 = onboardingConfig2.b;
                        if (formattedText2 != null) {
                            formattedText3 = b2;
                            formattedText4 = null;
                            String str22 = onboardingConfig2.c;
                            FormattedText formattedText92 = onboardingConfig2.d;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$0 = null;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1 = formattedText3;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$2 = formattedText4;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$3 = str22;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$4 = formattedText92;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label = 4;
                            b = qVar.b(multimodalRouteOnboardingInteractor$getOnboardingConfig$1);
                            if (b != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$0 = onboardingConfig2;
                        multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1 = b2;
                        multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$2 = formattedText2;
                        multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label = 3;
                        Object b3 = qVar.b(multimodalRouteOnboardingInteractor$getOnboardingConfig$1);
                        if (b3 != coroutineSingletons) {
                            MultimodalRoutesExperiment.OnboardingConfig onboardingConfig4 = onboardingConfig2;
                            formattedText5 = b2;
                            obj = b3;
                            onboardingConfig3 = onboardingConfig4;
                            formattedText4 = e9s.b(formattedText2, (c6z) obj);
                            formattedText3 = formattedText5;
                            onboardingConfig2 = onboardingConfig3;
                            String str222 = onboardingConfig2.c;
                            FormattedText formattedText922 = onboardingConfig2.d;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$0 = null;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1 = formattedText3;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$2 = formattedText4;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$3 = str222;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$4 = formattedText922;
                            multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label = 4;
                            b = qVar.b(multimodalRouteOnboardingInteractor$getOnboardingConfig$1);
                            if (b != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    kotlin.b.b(obj);
                }
                onboardingConfig = (MultimodalRoutesExperiment.OnboardingConfig) obj;
                if (onboardingConfig != null) {
                    return null;
                }
                formattedText = onboardingConfig.a;
                multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$0 = onboardingConfig;
                multimodalRouteOnboardingInteractor$getOnboardingConfig$1.L$1 = formattedText;
                multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label = 2;
                Object b4 = qVar.b(multimodalRouteOnboardingInteractor$getOnboardingConfig$1);
                if (b4 != coroutineSingletons) {
                    onboardingConfig2 = onboardingConfig;
                    obj = b4;
                    FormattedText b22 = e9s.b(formattedText, (c6z) obj);
                    formattedText2 = onboardingConfig2.b;
                    if (formattedText2 != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        multimodalRouteOnboardingInteractor$getOnboardingConfig$1 = new MultimodalRouteOnboardingInteractor$getOnboardingConfig$1(this, continuationImpl);
        Object obj2 = multimodalRouteOnboardingInteractor$getOnboardingConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteOnboardingInteractor$getOnboardingConfig$1.label;
        if (i != 0) {
        }
        onboardingConfig = (MultimodalRoutesExperiment.OnboardingConfig) obj2;
        if (onboardingConfig != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MultimodalRouteOnboardingInteractor$isNeedShowOnboarding$1 multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1;
        int i;
        boolean z;
        if (continuationImpl instanceof MultimodalRouteOnboardingInteractor$isNeedShowOnboarding$1) {
            multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1 = (MultimodalRouteOnboardingInteractor$isNeedShowOnboarding$1) continuationImpl;
            int i2 = multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean g = this.b.a("multimodal_route_onboarding").g("is_need_show_onboarding", true);
                    multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.L$0 = null;
                    multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.Z$0 = g;
                    multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.label = 1;
                    Object c = this.a.c(multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = c;
                    z = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.Z$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(obj == null && z);
            }
        }
        multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1 = new MultimodalRouteOnboardingInteractor$isNeedShowOnboarding$1(this, continuationImpl);
        Object obj2 = multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteOnboardingInteractor$isNeedShowOnboarding$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj2 == null && z);
    }
}
