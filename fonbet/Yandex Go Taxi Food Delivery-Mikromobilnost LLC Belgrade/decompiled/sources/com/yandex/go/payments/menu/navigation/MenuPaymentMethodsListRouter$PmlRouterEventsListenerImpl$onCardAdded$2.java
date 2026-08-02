package com.yandex.go.payments.menu.navigation;

import com.yandex.go.payments.domain.y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wqw;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.menu.navigation.MenuPaymentMethodsListRouter$PmlRouterEventsListenerImpl$onCardAdded$2", f = "MenuPaymentMethodsListRouter.kt", l = {324, 325}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MenuPaymentMethodsListRouter$PmlRouterEventsListenerImpl$onCardAdded$2 extends SuspendLambda implements wls {
    final /* synthetic */ wqw $stepData;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuPaymentMethodsListRouter$PmlRouterEventsListenerImpl$onCardAdded$2(b bVar, wqw wqwVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$stepData = wqwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MenuPaymentMethodsListRouter$PmlRouterEventsListenerImpl$onCardAdded$2(this.this$0, this.$stepData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuPaymentMethodsListRouter$PmlRouterEventsListenerImpl$onCardAdded$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (com.yandex.go.payments.menu.navigation.b.P(r5, r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y yVar = (y) this.this$0.N.get();
            this.label = 1;
            obj = yVar.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Number) obj).intValue() <= 1) {
            b bVar = this.this$0;
            wqw wqwVar = this.$stepData;
            this.label = 2;
        }
        return zy11.a;
    }
}
