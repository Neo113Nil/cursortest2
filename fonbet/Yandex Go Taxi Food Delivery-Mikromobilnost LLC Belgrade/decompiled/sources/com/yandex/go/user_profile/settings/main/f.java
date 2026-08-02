package com.yandex.go.user_profile.settings.main;

import defpackage.h8b0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserInfoPresenter$collectPlusInfo$$inlined$map$1$2$1 userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UserInfoPresenter$collectPlusInfo$$inlined$map$1$2$1) {
            userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1 = (UserInfoPresenter$collectPlusInfo$$inlined$map$1$2$1) continuation;
            int i2 = userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (obj3 instanceof h8b0) {
                            arrayList.add(obj3);
                        }
                    }
                    Object R = kotlin.collections.a.R(arrayList);
                    userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.L$0 = null;
                    userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.L$1 = null;
                    userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.L$2 = null;
                    userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.L$3 = null;
                    userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(R, userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1) == coroutineSingletons) {
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
        userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1 = new UserInfoPresenter$collectPlusInfo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoPresenter$collectPlusInfo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
