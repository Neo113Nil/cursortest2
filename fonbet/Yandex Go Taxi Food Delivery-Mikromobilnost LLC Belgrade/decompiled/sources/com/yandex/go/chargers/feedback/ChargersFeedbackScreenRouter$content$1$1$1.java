package com.yandex.go.chargers.feedback;

import defpackage.agd;
import defpackage.mvg;
import defpackage.nar;
import defpackage.ny61;
import defpackage.o0a;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.ChargersFeedbackScreenRouter$content$1$1$1", f = "ChargersFeedbackScreenRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ o0a $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenRouter$content$1$1$1(c cVar, yfd yfdVar, o0a o0aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$this_buildContent = yfdVar;
        this.$action = o0aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFeedbackScreenRouter$content$1$1$1(this.this$0, this.$this_buildContent, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersFeedbackScreenRouter$content$1$1$1 chargersFeedbackScreenRouter$content$1$1$1 = (ChargersFeedbackScreenRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersFeedbackScreenRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        cVar.O.q(((nar) ((agd) this.$this_buildContent).a).a, this.$action, cVar.R);
        return zy11.a;
    }
}
