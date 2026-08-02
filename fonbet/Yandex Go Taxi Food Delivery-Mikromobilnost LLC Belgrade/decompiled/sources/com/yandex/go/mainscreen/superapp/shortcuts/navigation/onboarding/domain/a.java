package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain;

import defpackage.c1w0;
import defpackage.ny61;
import defpackage.v0w0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainOnboardingInteractor$special$$inlined$filter$1$2$1 superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SuperAppMainOnboardingInteractor$special$$inlined$filter$1$2$1) {
            superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1 = (SuperAppMainOnboardingInteractor$special$$inlined$filter$1$2$1) continuation;
            int i2 = superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!((c1w0) this.b.b.e.getValue()).a.contains(((v0w0) obj).d)) {
                        superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.L$0 = null;
                        superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.L$1 = null;
                        superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.L$2 = null;
                        superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.L$3 = null;
                        superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1 = new SuperAppMainOnboardingInteractor$special$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainOnboardingInteractor$special$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
