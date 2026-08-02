package com.yandex.go.user_profile.settings.main;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.on21;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes14.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ on21 b;

    public a(tpr[] tprVarArr, on21 on21Var) {
        this.a = tprVarArr;
        this.b = on21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UserInfoPresenter$attachView$$inlined$combine$1$1 userInfoPresenter$attachView$$inlined$combine$1$1;
        int i;
        if (continuation instanceof UserInfoPresenter$attachView$$inlined$combine$1$1) {
            userInfoPresenter$attachView$$inlined$combine$1$1 = (UserInfoPresenter$attachView$$inlined$combine$1$1) continuation;
            int i2 = userInfoPresenter$attachView$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInfoPresenter$attachView$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userInfoPresenter$attachView$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInfoPresenter$attachView$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 16);
                    UserInfoPresenter$attachView$$inlined$combine$1$3 userInfoPresenter$attachView$$inlined$combine$1$3 = new UserInfoPresenter$attachView$$inlined$combine$1$3(this.b, null);
                    userInfoPresenter$attachView$$inlined$combine$1$1.L$0 = null;
                    userInfoPresenter$attachView$$inlined$combine$1$1.L$1 = null;
                    userInfoPresenter$attachView$$inlined$combine$1$1.L$2 = null;
                    userInfoPresenter$attachView$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, akt0Var, userInfoPresenter$attachView$$inlined$combine$1$3, userInfoPresenter$attachView$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        userInfoPresenter$attachView$$inlined$combine$1$1 = new UserInfoPresenter$attachView$$inlined$combine$1$1(this, continuation);
        Object obj2 = userInfoPresenter$attachView$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoPresenter$attachView$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
