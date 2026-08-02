package com.yandex.go.superapp.impl.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o3p;
import defpackage.tse;
import defpackage.v3p;
import defpackage.v770;
import defpackage.wls;
import defpackage.wsv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.impl.interactor.ExternalServiceCardOpenInteractorImpl$openServiceCard$1", f = "ExternalServiceCardOpenInteractorImpl.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ExternalServiceCardOpenInteractorImpl$openServiceCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ wsv0 $data;
    final /* synthetic */ v770 $openReason;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.impl.interactor.ExternalServiceCardOpenInteractorImpl$openServiceCard$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((v3p) this.receiver).a((o3p) obj2);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceCardOpenInteractorImpl$openServiceCard$1(b bVar, wsv0 wsv0Var, v770 v770Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$data = wsv0Var;
        this.$openReason = v770Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExternalServiceCardOpenInteractorImpl$openServiceCard$1(this.this$0, this.$data, this.$openReason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExternalServiceCardOpenInteractorImpl$openServiceCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.superapp.impl.delegate.a aVar = this.this$0.b;
            wsv0 wsv0Var = this.$data;
            v770 v770Var = this.$openReason;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.this$0.d, v3p.class, "launchCard", "launchCard(Lru/yandex/taxi/eats_commons/ExternalServiceCompat;Lcom/yandex/go/superapp/api/model/ExternalServiceParams;)V", 0);
            this.label = 1;
            if (aVar.b(wsv0Var, v770Var, anonymousClass1, this) == coroutineSingletons) {
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
