package com.yandex.messaging.internal.view.input;

import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.bct;
import defpackage.cct;
import defpackage.gk6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.input.GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1", f = "GetQuoteUseCase.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ bct $request$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cct this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1(Continuation continuation, cct cctVar, bct bctVar) {
        super(2, continuation);
        this.this$0 = cctVar;
        this.$request$inlined = bctVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1 getQuoteUseCase$run$$inlined$disposableFlowWrapper$1 = new GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1(continuation, this.this$0, this.$request$inlined);
        getQuoteUseCase$run$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return getQuoteUseCase$run$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            cct cctVar = this.this$0;
            bct bctVar = this.$request$inlined;
            ExistingChatRequest existingChatRequest = bctVar.a;
            ServerMessageRef serverMessageRef = bctVar.b;
            gk6 gk6Var = new gk6(cctVar.b.e(existingChatRequest, new a(cctVar, new GetQuoteUseCase$run$1$1(1, y6f0Var, y6f0.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8), serverMessageRef)), 1);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, gk6Var, this) == coroutineSingletons) {
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
