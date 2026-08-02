package com.yandex.go.user_profile.fullscreen.presentation;

import com.yandex.go.user_profile.fullscreen.router.a;
import defpackage.hs21;
import defpackage.ipu0;
import defpackage.j73;
import defpackage.m950;
import defpackage.mpu0;
import defpackage.mvg;
import defpackage.npu0;
import defpackage.ny61;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.x3;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi$showStory$1", f = "UserProfileJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi$showStory$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ UserProfileJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileJsNativeApi$showStory$1(UserProfileJsNativeApi userProfileJsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.$params = strArr;
        this.this$0 = userProfileJsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileJsNativeApi$showStory$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserProfileJsNativeApi$showStory$1 userProfileJsNativeApi$showStory$1 = (UserProfileJsNativeApi$showStory$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userProfileJsNativeApi$showStory$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ipu0 ipu0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String str = (String) j73.D(this.$params);
        if (str != null) {
            String str2 = str.length() != 0 ? str : null;
            if (str2 != null) {
                ipu0Var = this.this$0.storyNavigator;
                a aVar = ((hs21) ipu0Var).a;
                aVar.A((m950) aVar.F.get(), new npu0((x3) new mpu0(str2), "profile", (Float) null, false, HProv.PP_SAME_MEDIA), sy60.Q2);
            }
        }
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
