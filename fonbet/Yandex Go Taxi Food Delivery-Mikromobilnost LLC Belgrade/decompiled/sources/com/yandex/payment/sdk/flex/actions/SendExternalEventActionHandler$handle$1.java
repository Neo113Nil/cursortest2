package com.yandex.payment.sdk.flex.actions;

import defpackage.fgr;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t011;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.flex.actions.SendExternalEventActionHandler$handle$1", f = "SendExternalEventActionHandler.kt", l = {26}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class SendExternalEventActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ fgr $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendExternalEventActionHandler$handle$1(a aVar, fgr fgrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = fgrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SendExternalEventActionHandler$handle$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SendExternalEventActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lz40 lz40Var = this.this$0.a;
            fgr fgrVar = this.$params;
            t011 t011Var = new t011(fgrVar.a, fgrVar.b);
            this.label = 1;
            if (lz40Var.emit(t011Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
