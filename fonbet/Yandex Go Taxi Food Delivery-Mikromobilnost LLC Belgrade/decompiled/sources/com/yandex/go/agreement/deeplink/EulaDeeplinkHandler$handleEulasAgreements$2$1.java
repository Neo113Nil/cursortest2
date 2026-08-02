package com.yandex.go.agreement.deeplink;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.deeplink.EulaDeeplinkHandler$handleEulasAgreements$2$1", f = "EulaDeeplinkHandler.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EulaDeeplinkHandler$handleEulasAgreements$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oep0 $this_handleEulasAgreements;
    final /* synthetic */ Ref$ObjectRef<String> $url;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EulaDeeplinkHandler$handleEulasAgreements$2$1(b bVar, oep0 oep0Var, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$this_handleEulasAgreements = oep0Var;
        this.$url = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EulaDeeplinkHandler$handleEulasAgreements$2$1(this.this$0, this.$this_handleEulasAgreements, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EulaDeeplinkHandler$handleEulasAgreements$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            oep0 oep0Var = this.$this_handleEulasAgreements;
            String str = this.$url.element;
            this.label = 1;
            if (bVar.d(oep0Var, str, this) == coroutineSingletons) {
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
