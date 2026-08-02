package com.yandex.go.suggest.impl.interactor;

import defpackage.afw0;
import defpackage.c231;
import defpackage.g92;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q4v0;
import defpackage.tpr;
import defpackage.u131;
import defpackage.vpr;
import defpackage.xby;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.interactor.SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1", f = "SuperappSuggestCartButtonInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ afw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1(Continuation continuation, afw0 afw0Var) {
        super(3, continuation);
        this.this$0 = afw0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1 superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1 = new SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return superappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q4v0 q4v0Var = (q4v0) obj2;
            com.yandex.div.core.expression.variables.a aVar = this.this$0.b;
            if (!aVar.h("has_carts")) {
                aVar.f(new u131("has_carts", false));
            }
            c231 g2 = aVar.g("has_carts");
            u131 u131Var = g2 instanceof u131 ? (u131) g2 : null;
            if (u131Var == null) {
                xby.t(jst.e, "SUPERAPP:SEARCH:CART_BUTTON", null, "Couldn't get has_carts variable", 6);
                g = new g92(2, Boolean.FALSE);
            } else {
                u131Var.j(false);
                g = e.g(new SuperappSuggestCartButtonInteractor$hasCartsVariableFlow$1(u131Var, null));
            }
            d dVar = new d(g, q4v0Var);
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
