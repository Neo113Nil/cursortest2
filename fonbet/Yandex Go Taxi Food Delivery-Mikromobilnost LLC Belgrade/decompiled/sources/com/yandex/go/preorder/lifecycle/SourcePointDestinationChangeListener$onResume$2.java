package com.yandex.go.preorder.lifecycle;

import defpackage.bft0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.lifecycle.SourcePointDestinationChangeListener$onResume$2", f = "SourcePointDestinationChangeListener.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SourcePointDestinationChangeListener$onResume$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointDestinationChangeListener$onResume$2(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointDestinationChangeListener$onResume$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointDestinationChangeListener$onResume$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m mVar = this.this$0;
            this.label = 1;
            if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(new jqr(mVar.g.j(RoutePointType.POINT_B, false), new SourcePointDestinationChangeListener$trackDestinationAddressChanges$2(mVar, null), 3), new SourcePointDestinationChangeListener$trackDestinationAddressChanges$3(mVar, null))), new SourcePointDestinationChangeListener$trackDestinationAddressChanges$$inlined$safeCollect$1(mVar, null)).collect(new bft0(mVar, 0), this) == coroutineSingletons) {
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
