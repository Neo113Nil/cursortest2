package com.yandex.go.suggest.impl.interactor;

import defpackage.gyt0;
import defpackage.loe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u131;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.interactor.SuperappSuggestCartButtonInteractor$hasCartsVariableFlow$1", f = "SuperappSuggestCartButtonInteractor.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSuggestCartButtonInteractor$hasCartsVariableFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ u131 $hasCartsVariable;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestCartButtonInteractor$hasCartsVariableFlow$1(u131 u131Var, Continuation continuation) {
        super(2, continuation);
        this.$hasCartsVariable = u131Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappSuggestCartButtonInteractor$hasCartsVariableFlow$1 superappSuggestCartButtonInteractor$hasCartsVariableFlow$1 = new SuperappSuggestCartButtonInteractor$hasCartsVariableFlow$1(this.$hasCartsVariable, continuation);
        superappSuggestCartButtonInteractor$hasCartsVariableFlow$1.L$0 = obj;
        return superappSuggestCartButtonInteractor$hasCartsVariableFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestCartButtonInteractor$hasCartsVariableFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            loe loeVar = new loe(y6f0Var, 4);
            this.$hasCartsVariable.a(loeVar);
            Object d = this.$hasCartsVariable.d();
            Boolean bool = d instanceof Boolean ? (Boolean) d : null;
            ?? booleanValue = bool != null ? bool.booleanValue() : 0;
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.d(Boolean.valueOf((boolean) booleanValue));
            gyt0 gyt0Var = new gyt0(19, this.$hasCartsVariable, loeVar);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = booleanValue;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(x6f0Var, gyt0Var, this) == coroutineSingletons) {
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
