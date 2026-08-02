package com.yandex.messaging.internal;

import android.text.Editable;
import defpackage.g92;
import defpackage.mvg;
import defpackage.n1f;
import defpackage.n8t;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.op21;
import defpackage.p8t;
import defpackage.pvn;
import defpackage.tmt0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x8t;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1", f = "GetLastMessagePreviewUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ p8t $lastMessage$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ n8t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1(Continuation continuation, n8t n8tVar, p8t p8tVar) {
        super(3, continuation);
        this.this$0 = n8tVar;
        this.$lastMessage$inlined = p8tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1 getLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1 = new GetLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$lastMessage$inlined);
        getLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1.L$1 = obj2;
        return getLastMessagePreviewUseCase$run$lambda$2$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            x8t x8tVar = (x8t) this.L$1;
            CharSequence charSequence = x8tVar.b;
            tpr tprVar = pvn.a;
            if (charSequence != null) {
                n8t n8tVar = this.this$0;
                o1b0 o1b0Var = this.$lastMessage$inlined.a;
                String str = x8tVar.a;
                String obj2 = charSequence.toString();
                boolean z = x8tVar.f;
                n8tVar.getClass();
                if (obj2 != null) {
                    Editable newEditable = Editable.Factory.getInstance().newEditable(obj2);
                    if (z) {
                        tprVar = kotlinx.coroutines.flow.e.i(new SpannableMessageObservable$flow$$inlined$disposableFlowWrapper$1(null, n8tVar.e, newEditable, tmt0.e));
                    } else {
                        tprVar = kotlinx.coroutines.flow.e.X(str != null ? new n1f(17, n8tVar.g.a(new op21(str)), n8tVar) : new g92(2, n8tVar.h), new GetLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1(null, n8tVar, o1b0Var, obj2));
                    }
                }
                tprVar = new n1f(18, tprVar, x8tVar);
            }
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
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
