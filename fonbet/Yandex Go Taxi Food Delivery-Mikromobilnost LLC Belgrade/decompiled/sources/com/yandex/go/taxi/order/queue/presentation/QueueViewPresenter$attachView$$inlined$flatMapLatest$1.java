package com.yandex.go.taxi.order.queue.presentation;

import defpackage.alg0;
import defpackage.dkg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qkg0;
import defpackage.rkg0;
import defpackage.skg0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.presentation.QueueViewPresenter$attachView$$inlined$flatMapLatest$1", f = "QueueViewPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class QueueViewPresenter$attachView$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ alg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueViewPresenter$attachView$$inlined$flatMapLatest$1(Continuation continuation, alg0 alg0Var) {
        super(3, continuation);
        this.this$0 = alg0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        QueueViewPresenter$attachView$$inlined$flatMapLatest$1 queueViewPresenter$attachView$$inlined$flatMapLatest$1 = new QueueViewPresenter$attachView$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        queueViewPresenter$attachView$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        queueViewPresenter$attachView$$inlined$flatMapLatest$1.L$1 = obj2;
        return queueViewPresenter$attachView$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        vpr vprVar = (vpr) this.L$0;
        Object obj3 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dkg0 dkg0Var = (dkg0) obj3;
        pzt0 pzt0Var = this.this$0.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.this$0.B = UUID.randomUUID().toString();
        if (dkg0Var != null) {
            int i2 = qkg0.a[dkg0Var.b.ordinal()];
            if (i2 == 1) {
                obj2 = new rkg0(dkg0Var, 2);
            } else if (i2 == 2) {
                obj2 = new rkg0(dkg0Var, 0);
            } else if (i2 == 3) {
                obj2 = new skg0(dkg0Var);
            } else {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
                obj2 = new rkg0(dkg0Var, 1);
            }
        } else {
            obj2 = null;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        e.w(vprVar);
        Object emit = vprVar.emit(obj2, this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
