package com.yandex.messaging.internal;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.in21;
import defpackage.jft;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.vpr;
import defpackage.vsq;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Loyj0;", "Lin21;", "Lcom/yandex/messaging/internal/net/Error;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetUserInfoWithErrorUseCase$initialFlow$1", f = "GetUserInfoWithErrorUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserInfoWithErrorUseCase$initialFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $guid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserInfoWithErrorUseCase$initialFlow$1(a0 a0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
        this.$guid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetUserInfoWithErrorUseCase$initialFlow$1 getUserInfoWithErrorUseCase$initialFlow$1 = new GetUserInfoWithErrorUseCase$initialFlow$1(this.this$0, this.$guid, continuation);
        getUserInfoWithErrorUseCase$initialFlow$1.L$0 = obj;
        return getUserInfoWithErrorUseCase$initialFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUserInfoWithErrorUseCase$initialFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r7.emit(r3, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
        } else {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            jft jftVar = this.this$0.f;
            oyj0 oyj0Var = (oyj0) jftVar.a.j(this.$guid);
            if (oyj0Var != null) {
                this.label = 1;
            } else {
                in21 in21Var = (in21) this.this$0.c.o0(new vsq(this.$guid, 7));
                if (in21Var != null) {
                    myj0 myj0Var = new myj0(in21Var);
                    a0 a0Var = this.this$0;
                    a0Var.f.a.y(this.$guid, myj0Var);
                    this.L$0 = myj0Var;
                    this.label = 2;
                }
            }
        }
        return zy11.a;
    }
}
