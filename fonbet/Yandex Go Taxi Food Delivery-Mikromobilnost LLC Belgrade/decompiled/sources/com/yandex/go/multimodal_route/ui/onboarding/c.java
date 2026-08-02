package com.yandex.go.multimodal_route.ui.onboarding;

import defpackage.cu40;
import defpackage.du40;
import defpackage.es40;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wt40;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.multimodal_route.interactors.b a;
    public final ru.yandex.taxi.widget.c b;
    public final es40 c;

    public c(com.yandex.go.multimodal_route.interactors.b bVar, ru.yandex.taxi.widget.c cVar, tt2 tt2Var, es40 es40Var) {
        this.a = bVar;
        this.b = cVar;
        this.c = es40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        MultimodalRouteOnboardingUiStateInteractor$getUiState$1 multimodalRouteOnboardingUiStateInteractor$getUiState$1;
        int i;
        wt40 wt40Var;
        if (continuationImpl instanceof MultimodalRouteOnboardingUiStateInteractor$getUiState$1) {
            multimodalRouteOnboardingUiStateInteractor$getUiState$1 = (MultimodalRouteOnboardingUiStateInteractor$getUiState$1) continuationImpl;
            int i2 = multimodalRouteOnboardingUiStateInteractor$getUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteOnboardingUiStateInteractor$getUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteOnboardingUiStateInteractor$getUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteOnboardingUiStateInteractor$getUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    multimodalRouteOnboardingUiStateInteractor$getUiState$1.L$0 = str;
                    multimodalRouteOnboardingUiStateInteractor$getUiState$1.L$1 = str2;
                    multimodalRouteOnboardingUiStateInteractor$getUiState$1.label = 1;
                    obj = this.a.a(multimodalRouteOnboardingUiStateInteractor$getUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (cu40) obj;
                    }
                    str2 = (String) multimodalRouteOnboardingUiStateInteractor$getUiState$1.L$1;
                    str = (String) multimodalRouteOnboardingUiStateInteractor$getUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                wt40Var = (wt40) obj;
                if (wt40Var != null) {
                    return du40.a;
                }
                if (str == null) {
                    str = "";
                }
                this.c.a.a("MultimodalRoute.Onboarding.Shown", g8e.u("multimodal_id", str, "mm_name", str2), 1, new HashMap());
                sjh sjhVar = uyj.a;
                MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1 multimodalRouteOnboardingUiStateInteractor$getUiState$state$1 = new MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1(this, wt40Var, null);
                multimodalRouteOnboardingUiStateInteractor$getUiState$1.L$0 = null;
                multimodalRouteOnboardingUiStateInteractor$getUiState$1.L$1 = null;
                multimodalRouteOnboardingUiStateInteractor$getUiState$1.L$2 = null;
                multimodalRouteOnboardingUiStateInteractor$getUiState$1.label = 2;
                obj = tje.k0(sjhVar, multimodalRouteOnboardingUiStateInteractor$getUiState$state$1, multimodalRouteOnboardingUiStateInteractor$getUiState$1);
            }
        }
        multimodalRouteOnboardingUiStateInteractor$getUiState$1 = new MultimodalRouteOnboardingUiStateInteractor$getUiState$1(this, continuationImpl);
        Object obj2 = multimodalRouteOnboardingUiStateInteractor$getUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteOnboardingUiStateInteractor$getUiState$1.label;
        if (i != 0) {
        }
        wt40Var = (wt40) obj2;
        if (wt40Var != null) {
        }
    }
}
