package com.yandex.go.user_profile.fullscreen.models;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class l implements t1b0 {
    public final t1b0 a;

    public l(rqo rqoVar) {
        UserProfileExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(UserProfileExperiment.i);
    }

    public static UserProfileExperiment d(UserProfileExperiment userProfileExperiment) {
        if (userProfileExperiment.f) {
            return userProfileExperiment;
        }
        UserProfileExperiment.Companion.getClass();
        UserProfileExperiment userProfileExperiment2 = UserProfileExperiment.i;
        UserProfileExperiment.LogoutButtonParams logoutButtonParams = userProfileExperiment.e;
        Map map = userProfileExperiment.g;
        return new UserProfileExperiment(userProfileExperiment2.b, userProfileExperiment2.c, userProfileExperiment.d, logoutButtonParams, userProfileExperiment2.f, map);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new k(com.yandex.go.coroutines.b.d(this.a.a(), new UserProfileExperimentRepository$experimentFlow$$inlined$start$1(this, null)), this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.t1b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        UserProfileExperimentRepository$experimentSuspend$1 userProfileExperimentRepository$experimentSuspend$1;
        int i;
        if (continuation instanceof UserProfileExperimentRepository$experimentSuspend$1) {
            userProfileExperimentRepository$experimentSuspend$1 = (UserProfileExperimentRepository$experimentSuspend$1) continuation;
            int i2 = userProfileExperimentRepository$experimentSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userProfileExperimentRepository$experimentSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userProfileExperimentRepository$experimentSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userProfileExperimentRepository$experimentSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userProfileExperimentRepository$experimentSuspend$1.L$0 = this;
                    userProfileExperimentRepository$experimentSuspend$1.label = 1;
                    obj = this.a.b(userProfileExperimentRepository$experimentSuspend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (l) userProfileExperimentRepository$experimentSuspend$1.L$0;
                    kotlin.b.b(obj);
                }
                this.getClass();
                return d((UserProfileExperiment) obj);
            }
        }
        userProfileExperimentRepository$experimentSuspend$1 = new UserProfileExperimentRepository$experimentSuspend$1(this, continuation);
        Object obj2 = userProfileExperimentRepository$experimentSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userProfileExperimentRepository$experimentSuspend$1.label;
        if (i != 0) {
        }
        this.getClass();
        return d((UserProfileExperiment) obj2);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return d((UserProfileExperiment) this.a.c());
    }
}
