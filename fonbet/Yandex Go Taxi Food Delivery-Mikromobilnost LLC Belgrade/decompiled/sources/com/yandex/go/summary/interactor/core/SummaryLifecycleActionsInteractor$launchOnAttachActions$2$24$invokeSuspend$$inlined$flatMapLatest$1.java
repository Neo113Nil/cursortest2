package com.yandex.go.summary.interactor.core;

import com.yandex.go.address.models.Address;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pex0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1", f = "SummaryLifecycleActionsInteractor.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1(t tVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1 summaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1 = new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        summaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        summaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return summaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r14, r0, r13) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r14 == r2) goto L15;
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
            kotlin.b.b(obj);
            Triple triple = (Triple) obj2;
            boolean booleanValue = ((Boolean) triple.getFirst()).booleanValue();
            Address address = (Address) triple.getSecond();
            pex0 pex0Var = (pex0) triple.getThird();
            this.this$0.f.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1 summaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1 = new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1(this.this$0, address, booleanValue, pex0Var, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.Z$0 = booleanValue;
            this.label = 1;
            obj = tje.k0(g6uVar, summaryLifecycleActionsInteractor$launchOnAttachActions$2$24$3$1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
    }
}
