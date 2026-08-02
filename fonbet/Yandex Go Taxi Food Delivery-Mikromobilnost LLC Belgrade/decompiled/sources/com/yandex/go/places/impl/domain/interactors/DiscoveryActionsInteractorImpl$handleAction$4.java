package com.yandex.go.places.impl.domain.interactors;

import defpackage.fr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.so;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysd0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.map_object.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.DiscoveryActionsInteractorImpl$handleAction$4", f = "DiscoveryActionsInteractorImpl.kt", l = {201}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscoveryActionsInteractorImpl$handleAction$4 extends SuspendLambda implements wls {
    final /* synthetic */ fr $action;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryActionsInteractorImpl$handleAction$4(a aVar, fr frVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = frVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryActionsInteractorImpl$handleAction$4(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscoveryActionsInteractorImpl$handleAction$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ysd0 ysd0Var = this.this$0.i;
            pm00 pm00Var = new pm00(zzs.f, "", "", new n(((so) this.$action).a), (String) null, (String) null, (String) null, (Boolean) null, 496);
            this.label = 1;
            if (((ru.yandex.taxi.map_common.b) ysd0Var).d(pm00Var, this) == coroutineSingletons) {
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
