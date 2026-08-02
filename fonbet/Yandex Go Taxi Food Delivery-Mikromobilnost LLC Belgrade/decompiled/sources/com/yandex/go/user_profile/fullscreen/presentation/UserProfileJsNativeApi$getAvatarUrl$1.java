package com.yandex.go.user_profile.fullscreen.presentation;

import com.yandex.go.repositories.e;
import defpackage.auu0;
import defpackage.eci0;
import defpackage.egv;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi$getAvatarUrl$1", f = "UserProfileJsNativeApi.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi$getAvatarUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ UserProfileJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileJsNativeApi$getAvatarUrl$1(UserProfileJsNativeApi userProfileJsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileJsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileJsNativeApi$getAvatarUrl$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileJsNativeApi$getAvatarUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            b.b(obj);
            eVar = this.this$0.userPhotoStateRepository;
            eci0 eci0Var = eVar.f;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(eci0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String b = ((egv) obj).b();
        if (b != null && !evu0.J(b)) {
            str = b;
        }
        this.this$0.callbackResult(this.$promiseId, auu0.a, str);
        return zy11.a;
    }
}
