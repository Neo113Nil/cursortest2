package com.yandex.go.scooters.qr.preview.domain;

import defpackage.hmo0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppo0;
import defpackage.qpo0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.preview.domain.ScootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1", f = "ScootersPreviewInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1(Continuation continuation, a aVar) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1 scootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1 = new ScootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        scootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qpo0 qpo0Var = (qpo0) obj2;
            ppo0 ppo0Var = qpo0Var instanceof ppo0 ? (ppo0) qpo0Var : null;
            if (ppo0Var == null || (set = ppo0Var.b) == null) {
                set = EmptySet.a;
            }
            tpr d = com.yandex.go.coroutines.b.d(e.X(new mth(new j0(null, e.c(this.this$0.e.a), new ScootersPreviewInteractor$listenToPreviewState$lambda$0$$inlined$withPreviousEmit$1(3, null)), 6), new ScootersPreviewInteractor$listenToPreviewState$lambda$0$$inlined$flatMapLatest$1(null, this.this$0, set)), new ScootersPreviewInteractor$listenToPreviewState$lambda$0$$inlined$start$1(hmo0.a, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(d, vprVar, this) == coroutineSingletons) {
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
