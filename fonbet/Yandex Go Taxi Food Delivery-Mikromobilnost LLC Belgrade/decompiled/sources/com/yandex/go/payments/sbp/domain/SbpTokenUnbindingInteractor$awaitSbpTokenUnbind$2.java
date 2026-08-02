package com.yandex.go.payments.sbp.domain;

import com.yandex.go.payments.data.q;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.domain.SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2", f = "SbpTokenUnbindingInteractor.kt", l = {34, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $sbpTokenId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$sbpTokenId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2 sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2 = new SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2(this.this$0, this.$sbpTokenId, continuation);
        sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2.L$0 = obj;
        return sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r8 == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0.b;
            String str = this.$sbpTokenId;
            String code = PaymentMethod$Type.SBP_TOKEN.getCode();
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            b = qVar.b(str, code, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        Throwable a = Result.a(b);
        if (a != null) {
            throw a;
        }
        Result result = new Result(b);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
