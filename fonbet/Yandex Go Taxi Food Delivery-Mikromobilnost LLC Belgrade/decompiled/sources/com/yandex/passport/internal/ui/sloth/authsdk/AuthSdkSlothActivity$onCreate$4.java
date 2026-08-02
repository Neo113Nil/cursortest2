package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity$onCreate$4", f = "AuthSdkSlothActivity.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AuthSdkSlothActivity$onCreate$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ AuthSdkSlothActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSdkSlothActivity$onCreate$4(AuthSdkSlothActivity authSdkSlothActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = authSdkSlothActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSdkSlothActivity$onCreate$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthSdkSlothActivity$onCreate$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bind;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AuthSdkSlothActivity authSdkSlothActivity = this.this$0;
            this.label = 1;
            bind = authSdkSlothActivity.bind(this);
            if (bind == coroutineSingletons) {
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
