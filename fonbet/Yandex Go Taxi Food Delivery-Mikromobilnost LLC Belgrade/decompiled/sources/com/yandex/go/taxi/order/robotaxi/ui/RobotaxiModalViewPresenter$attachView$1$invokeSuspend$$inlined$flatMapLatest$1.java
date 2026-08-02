package com.yandex.go.taxi.order.robotaxi.ui;

import com.yandex.go.taxi.order.robotaxi.domain.c;
import defpackage.ief;
import defpackage.mvg;
import defpackage.mvk0;
import defpackage.ny61;
import defpackage.qvk0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1", f = "RobotaxiModalViewPresenter.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ mvk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, mvk0 mvk0Var) {
        super(3, continuation);
        this.this$0 = mvk0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 robotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 = new RobotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        robotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        robotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return robotaxiModalViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r8, r0, r7) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r8 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            mvk0 mvk0Var = this.this$0;
            c cVar = mvk0Var.C;
            qvk0 qvk0Var = mvk0Var.x;
            ief iefVar = mvk0Var.z.b().V().K;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = cVar.c(qvk0Var, iefVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
