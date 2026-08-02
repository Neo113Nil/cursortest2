package com.yandex.messaging.domain.chat;

import com.yandex.messaging.ChatRequest;
import defpackage.a80;
import defpackage.azj;
import defpackage.gvg0;
import defpackage.i4t;
import defpackage.j4t;
import defpackage.j5b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.wls;
import defpackage.xjg;
import defpackage.y6f0;
import defpackage.z83;
import defpackage.zog;
import defpackage.zy11;
import defpackage.zyj;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.chat.GetChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1", f = "GetChatDisplayDataUseCase.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ i4t $params$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j4t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1(Continuation continuation, j4t j4tVar, i4t i4tVar) {
        super(2, continuation);
        this.this$0 = j4tVar;
        this.$params$inlined = i4tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1 getChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1 = new GetChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1(continuation, this.this$0, this.$params$inlined);
        getChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return getChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatDisplayDataUseCase$run$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            azj azjVar = this.this$0.b;
            i4t i4tVar = this.$params$inlined;
            ChatRequest chatRequest = i4tVar.a;
            int i2 = i4tVar.b;
            j5b j5bVar = new j5b(y6f0Var);
            azjVar.getClass();
            tje.e();
            z83.h(null, i2 == 0 || i2 == gvg0.avatar_size_24 || i2 == gvg0.avatar_size_32 || i2 == gvg0.avatar_size_36 || i2 == gvg0.avatar_size_48 || i2 == gvg0.avatar_size_108);
            tje.e();
            HashMap hashMap = azjVar.e;
            WeakReference weakReference = (WeakReference) hashMap.get(chatRequest);
            zog zogVar = weakReference != null ? (zog) weakReference.get() : null;
            if (zogVar == null) {
                zog zogVar2 = new zog(azjVar.a, new xjg(21, azjVar, chatRequest), azjVar.c);
                hashMap.put(chatRequest, new WeakReference(zogVar2));
                zogVar = zogVar2;
            }
            azjVar.d.d(chatRequest, zogVar);
            a80 a80Var = new a80(11, new zyj(azjVar, zogVar, i2, j5bVar));
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
