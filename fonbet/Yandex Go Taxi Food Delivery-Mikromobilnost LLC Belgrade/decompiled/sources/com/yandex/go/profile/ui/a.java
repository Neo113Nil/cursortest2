package com.yandex.go.profile.ui;

import defpackage.kr;
import defpackage.lef0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProfileFlexModalPresenter$attachView$$inlined$map$1$2$1 profileFlexModalPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ProfileFlexModalPresenter$attachView$$inlined$map$1$2$1) {
            profileFlexModalPresenter$attachView$$inlined$map$1$2$1 = (ProfileFlexModalPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = profileFlexModalPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileFlexModalPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = profileFlexModalPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileFlexModalPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lef0 lef0Var = new lef0((kr) obj);
                    profileFlexModalPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    profileFlexModalPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    profileFlexModalPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    profileFlexModalPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    profileFlexModalPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lef0Var, profileFlexModalPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        profileFlexModalPresenter$attachView$$inlined$map$1$2$1 = new ProfileFlexModalPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = profileFlexModalPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileFlexModalPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
