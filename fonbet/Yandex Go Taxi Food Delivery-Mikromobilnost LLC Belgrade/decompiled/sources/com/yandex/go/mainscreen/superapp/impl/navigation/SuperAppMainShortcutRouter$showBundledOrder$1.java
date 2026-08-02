package com.yandex.go.mainscreen.superapp.impl.navigation;

import com.yandex.go.dto.response.Action$OrdersList;
import com.yandex.go.dto.response.BundledOrdersPayload;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.navigation.SuperAppMainShortcutRouter$showBundledOrder$1", f = "SuperAppMainShortcutRouter.kt", l = {346}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainShortcutRouter$showBundledOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ Action$OrdersList $action;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainShortcutRouter$showBundledOrder$1(c cVar, Action$OrdersList action$OrdersList, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = action$OrdersList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainShortcutRouter$showBundledOrder$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainShortcutRouter$showBundledOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.superapp.orders.bundle.modal.impl.presentation.routing.c cVar = (com.yandex.go.superapp.orders.bundle.modal.impl.presentation.routing.c) this.this$0.j.get();
        BundledOrdersPayload bundledOrdersPayload = this.$action.a;
        this.label = 1;
        cVar.a(bundledOrdersPayload);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
