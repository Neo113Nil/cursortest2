package com.yandex.fintechsdk.security.impl.internal.devicechallenge;

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
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.security.impl.internal.devicechallenge.DeviceChallengeHelperImpl$completionWithDelay$1", f = "DeviceChallengeHelperImpl.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DeviceChallengeHelperImpl$completionWithDelay$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $completion;
    final /* synthetic */ String $data;
    final /* synthetic */ int $delay;
    final /* synthetic */ String $signature;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceChallengeHelperImpl$completionWithDelay$1(a aVar, int i, wls wlsVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$delay = i;
        this.$completion = wlsVar;
        this.$data = str;
        this.$signature = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeviceChallengeHelperImpl$completionWithDelay$1(this.this$0, this.$delay, this.$completion, this.$data, this.$signature, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeviceChallengeHelperImpl$completionWithDelay$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            int i2 = this.$delay;
            this.label = 1;
            aVar.getClass();
            if (i2 <= 0 || (obj2 = kotlinx.coroutines.a.i(i2, this)) != coroutineSingletons) {
                obj2 = zy11Var;
            }
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$completion.invoke(this.$data, this.$signature);
        return zy11Var;
    }
}
