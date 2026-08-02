package com.yandex.go.multimodal_route.ui.transport_tracking;

import defpackage.agd;
import defpackage.ga11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q911;
import defpackage.r911;
import defpackage.s911;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_tracking.TransportTrackingCardRouter$content$1$1$1", f = "TransportTrackingCardRouter.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ga11 $action;
    final /* synthetic */ r911 $innerNavigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ s911 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardRouter$content$1$1$1(s911 s911Var, yfd yfdVar, ga11 ga11Var, r911 r911Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s911Var;
        this.$this_buildContent = yfdVar;
        this.$action = ga11Var;
        this.$innerNavigator = r911Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportTrackingCardRouter$content$1$1$1(this.this$0, this.$this_buildContent, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportTrackingCardRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.R;
            Object obj2 = ((agd) this.$this_buildContent).a;
            String str = ((q911) obj2).b;
            String str2 = ((q911) obj2).c;
            ga11 ga11Var = this.$action;
            r911 r911Var = this.$innerNavigator;
            o2y0 o2y0Var = ((q911) obj2).a;
            this.label = 1;
            if (fVar.b(str, str2, ga11Var, r911Var, o2y0Var, this) == coroutineSingletons) {
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
