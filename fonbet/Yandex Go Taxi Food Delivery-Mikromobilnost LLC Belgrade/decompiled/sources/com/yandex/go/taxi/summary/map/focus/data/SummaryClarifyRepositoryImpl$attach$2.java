package com.yandex.go.taxi.summary.map.focus.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrsn;", "Lcom/yandex/go/navigation/screen/api/Screen;", "it", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.map.focus.data.SummaryClarifyRepositoryImpl$attach$2", f = "SummaryClarifyRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryClarifyRepositoryImpl$attach$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryClarifyRepositoryImpl$attach$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryClarifyRepositoryImpl$attach$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummaryClarifyRepositoryImpl$attach$2 summaryClarifyRepositoryImpl$attach$2 = (SummaryClarifyRepositoryImpl$attach$2) create((rsn) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summaryClarifyRepositoryImpl$attach$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        cVar.getClass();
        cVar.d = new AtomicBoolean(false);
        new AtomicBoolean(false);
        return zy11.a;
    }
}
