package com.yandex.go.navigator.user_placemark;

import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wr21;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/navigator/user_placemark/UserArrowToggleExperiment;", "exp", "", "isTurnOn", "Lwr21;", "<anonymous>", "(Lcom/yandex/go/navigator/user_placemark/UserArrowToggleExperiment;Z)Lwr21;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.user_placemark.UserPlacemarkSettingsRepository$userPlacemarkFlow$1", f = "UserPlacemarkSettingsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UserPlacemarkSettingsRepository$userPlacemarkFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        UserPlacemarkSettingsRepository$userPlacemarkFlow$1 userPlacemarkSettingsRepository$userPlacemarkFlow$1 = new UserPlacemarkSettingsRepository$userPlacemarkFlow$1(3, (Continuation) obj3);
        userPlacemarkSettingsRepository$userPlacemarkFlow$1.L$0 = (UserArrowToggleExperiment) obj;
        userPlacemarkSettingsRepository$userPlacemarkFlow$1.Z$0 = booleanValue;
        return userPlacemarkSettingsRepository$userPlacemarkFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserArrowToggleExperiment userArrowToggleExperiment = (UserArrowToggleExperiment) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z2 = userArrowToggleExperiment.b;
        String str = userArrowToggleExperiment.c;
        String str2 = str == null ? "" : str;
        String str3 = userArrowToggleExperiment.e;
        if (str3 == null) {
            str3 = "";
        }
        String Y = d6z.Y(userArrowToggleExperiment, str3);
        String str4 = userArrowToggleExperiment.d;
        return new wr21(str2, str4 == null ? "" : str4, Y, z2, z);
    }
}
