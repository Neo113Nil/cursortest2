package com.yandex.go.user_profile.settings.main;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;

    public c(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UserInfoPresenter$attachView$$inlined$map$1$1 userInfoPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof UserInfoPresenter$attachView$$inlined$map$1$1) {
            userInfoPresenter$attachView$$inlined$map$1$1 = (UserInfoPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = userInfoPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInfoPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userInfoPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInfoPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    userInfoPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    userInfoPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    userInfoPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    userInfoPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, userInfoPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        userInfoPresenter$attachView$$inlined$map$1$1 = new UserInfoPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = userInfoPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
