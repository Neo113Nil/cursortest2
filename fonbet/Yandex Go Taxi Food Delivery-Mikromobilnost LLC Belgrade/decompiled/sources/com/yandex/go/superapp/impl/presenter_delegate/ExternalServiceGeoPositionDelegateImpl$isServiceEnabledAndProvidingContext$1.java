package com.yandex.go.superapp.impl.presenter_delegate;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1p;
import defpackage.tls;
import defpackage.u1p;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.impl.presenter_delegate.ExternalServiceGeoPositionDelegateImpl$isServiceEnabledAndProvidingContext$1", f = "ExternalServiceGeoPositionDelegateImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ExternalServiceGeoPositionDelegateImpl$isServiceEnabledAndProvidingContext$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceGeoPositionDelegateImpl$isServiceEnabledAndProvidingContext$1(c cVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ExternalServiceGeoPositionDelegateImpl$isServiceEnabledAndProvidingContext$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ExternalServiceGeoPositionDelegateImpl$isServiceEnabledAndProvidingContext$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            u1p u1pVar = this.this$0.a;
            this.label = 1;
            obj = u1pVar.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        t1p.a aVar = (t1p.a) ((t1p) obj).b.get(this.this$0.f.getValue());
        if (aVar == null) {
            t1p.a.Companion.getClass();
            aVar = t1p.a.d;
        }
        return Boolean.valueOf(aVar.a && aVar.b);
    }
}
