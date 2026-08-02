package com.yandex.messaging.internal;

import defpackage.cl21;
import defpackage.fi9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1", f = "GetUserInfoWithErrorUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $guid$inlined;
    final /* synthetic */ boolean $reducedInfo$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1(Continuation continuation, boolean z, String str) {
        super(3, continuation);
        this.$reducedInfo$inlined = z;
        this.$guid$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1 getUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1 = new GetUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.$reducedInfo$inlined, this.$guid$inlined);
        getUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return getUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            fi9 i2 = kotlinx.coroutines.flow.e.i(new GetUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1(null, this.$reducedInfo$inlined, (cl21) this.L$1, this.$guid$inlined));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(i2, vprVar, this) == coroutineSingletons) {
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
