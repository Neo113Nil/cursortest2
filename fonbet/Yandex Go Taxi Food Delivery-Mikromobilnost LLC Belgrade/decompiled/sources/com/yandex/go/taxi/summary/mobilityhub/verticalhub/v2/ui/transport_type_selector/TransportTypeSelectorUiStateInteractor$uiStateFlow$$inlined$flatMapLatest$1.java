package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.transport_type_selector;

import defpackage.bb11;
import defpackage.dlq0;
import defpackage.elq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ra11;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.transport_type_selector.TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1", f = "TransportTypeSelectorUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ bb11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(Continuation continuation, bb11 bb11Var) {
        super(3, continuation);
        this.this$0 = bb11Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 = new TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ra11 ra11Var = (ra11) obj2;
            bb11 bb11Var = this.this$0;
            bb11Var.getClass();
            dlq0 dlq0Var = new dlq0(ra11Var.d);
            d dVar = new d(bb11Var.f, ra11Var, new elq0(ra11Var.b, ra11Var.c), dlq0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(dVar, vprVar, this) == coroutineSingletons) {
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
