package com.yandex.messaging.internal;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.a80;
import defpackage.k5b;
import defpackage.kcy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tf4;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2", f = "GetMessageInfoFlowUseCase.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $author$inlined;
    final /* synthetic */ ChatRequest $chatRequest$inlined;
    final /* synthetic */ boolean $isOwn$inlined;
    final /* synthetic */ TechBaseMessage $message$inlined;
    final /* synthetic */ kcy0 $this_flow$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2(Continuation continuation, boolean z, kcy0 kcy0Var, TechBaseMessage techBaseMessage, String str, ChatRequest chatRequest) {
        super(2, continuation);
        this.$isOwn$inlined = z;
        this.$this_flow$inlined = kcy0Var;
        this.$message$inlined = techBaseMessage;
        this.$author$inlined = str;
        this.$chatRequest$inlined = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2 getMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2 = new GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2(continuation, this.$isOwn$inlined, this.$this_flow$inlined, this.$message$inlined, this.$author$inlined, this.$chatRequest$inlined);
        getMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2.L$0 = obj;
        return getMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            boolean z = this.$isOwn$inlined;
            kcy0 kcy0Var = this.$this_flow$inlined;
            if (z) {
                k5b k5bVar = new k5b(y6f0Var);
                TechBaseMessage techBaseMessage = this.$message$inlined;
                String str = this.$author$inlined;
                ChatRequest chatRequest = this.$chatRequest$inlined;
                kcy0Var.getClass();
                e0Var = new e0(kcy0Var, k5bVar, techBaseMessage, str, true, chatRequest);
            } else {
                tf4 tf4Var = new tf4(y6f0Var, 5);
                TechBaseMessage techBaseMessage2 = this.$message$inlined;
                String str2 = this.$author$inlined;
                ChatRequest chatRequest2 = this.$chatRequest$inlined;
                kcy0Var.getClass();
                e0Var = new e0(kcy0Var, tf4Var, techBaseMessage2, str2, false, chatRequest2);
            }
            a80 a80Var = new a80(14, e0Var);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, a80Var, this) == coroutineSingletons) {
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
