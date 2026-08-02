package com.yandex.go.suggest.impl.data.flex.document;

import com.yandex.go.address.models.Address;
import defpackage.ajr;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yir;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/address/models/Address;", "srcAddress", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/address/models/Address;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$loadingActionsFlow$1", f = "SuperappSuggestDocumentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestDocumentInteractor$loadingActionsFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestDocumentInteractor$loadingActionsFlow$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappSuggestDocumentInteractor$loadingActionsFlow$1 superappSuggestDocumentInteractor$loadingActionsFlow$1 = new SuperappSuggestDocumentInteractor$loadingActionsFlow$1(this.this$0, continuation);
        superappSuggestDocumentInteractor$loadingActionsFlow$1.L$0 = obj;
        return superappSuggestDocumentInteractor$loadingActionsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperappSuggestDocumentInteractor$loadingActionsFlow$1 superappSuggestDocumentInteractor$loadingActionsFlow$1 = (SuperappSuggestDocumentInteractor$loadingActionsFlow$1) create((Address) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superappSuggestDocumentInteractor$loadingActionsFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address = (Address) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hst hstVar = jst.e;
        Objects.toString(address);
        hstVar.getClass();
        if (address != null) {
            ajr ajrVar = this.this$0.f;
            ajrVar.a.l(new yir(jl40.B(address.getPositionInitAction()), address.B(), address.x0(), address.a0()));
        }
        return zy11.a;
    }
}
