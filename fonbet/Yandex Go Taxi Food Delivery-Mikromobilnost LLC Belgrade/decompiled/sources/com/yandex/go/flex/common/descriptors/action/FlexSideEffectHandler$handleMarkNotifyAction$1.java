package com.yandex.go.flex.common.descriptors.action;

import defpackage.jst;
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
@mvg(c = "com.yandex.go.flex.common.descriptors.action.FlexSideEffectHandler$handleMarkNotifyAction$1", f = "FlexSideEffectHandler.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class FlexSideEffectHandler$handleMarkNotifyAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ MarkNotifyAction $action;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexSideEffectHandler$handleMarkNotifyAction$1(b bVar, MarkNotifyAction markNotifyAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = markNotifyAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlexSideEffectHandler$handleMarkNotifyAction$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlexSideEffectHandler$handleMarkNotifyAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.shortcuts.impl.interactors.e eVar = this.this$0.a;
                kotlinx.serialization.json.b bVar = this.$action.a;
                this.label = 1;
                if (eVar.b(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (Throwable unused) {
            jst.e.getClass();
        }
        return zy11.a;
    }
}
