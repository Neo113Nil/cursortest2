package com.yandex.go.profile.ui;

import defpackage.mef0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ mef0 b;

    public d(tpr tprVar, mef0 mef0Var) {
        this.a = tprVar;
        this.b = mef0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProfileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1 profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ProfileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1) {
            profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1 = (ProfileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1) continuation;
            int i2 = profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.L$0 = null;
                    profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.L$1 = null;
                    profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.L$2 = null;
                    profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(cVar, profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1 = new ProfileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileFlexModalPresenter$attachView$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
