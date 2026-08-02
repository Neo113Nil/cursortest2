package com.yandex.messaging.internal;

import defpackage.cl21;
import defpackage.d9g;
import defpackage.fjs;
import defpackage.hn3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pft;
import defpackage.vmi0;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1", f = "GetUserInfoWithErrorUseCase.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $guid$inlined;
    final /* synthetic */ cl21 $it$inlined;
    final /* synthetic */ boolean $reducedInfo$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1(Continuation continuation, boolean z, cl21 cl21Var, String str) {
        super(2, continuation);
        this.$reducedInfo$inlined = z;
        this.$it$inlined = cl21Var;
        this.$guid$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1 getUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1 = new GetUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1(continuation, this.$reducedInfo$inlined, this.$it$inlined, this.$guid$inlined);
        getUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return getUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUserInfoWithErrorUseCase$networkFlow$lambda$3$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            boolean z = this.$reducedInfo$inlined;
            d9g d9gVar = (d9g) this.$it$inlined;
            hn3 hn3Var = new hn3((z ? (vmi0) d9gVar.D.get() : (fjs) d9gVar.A0.get()).b(this.$guid$inlined, new pft(y6f0Var)), 3);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, hn3Var, this) == coroutineSingletons) {
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
