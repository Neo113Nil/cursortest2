package com.yandex.go.scooters.data_form;

import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zjn0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data_form.ScootersDataFormRouterImpl$handleSubmitAction$1", f = "ScootersDataFormRouterImpl.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDataFormRouterImpl$handleSubmitAction$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDataFormRouterImpl$handleSubmitAction$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDataFormRouterImpl$handleSubmitAction$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDataFormRouterImpl$handleSubmitAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar2 = this.this$0;
                try {
                    com.yandex.go.scooters.data_form.domain.a aVar = bVar2.I;
                    this.L$0 = bVar2;
                    this.label = 1;
                    if (aVar.b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    bVar = bVar2;
                    th = th2;
                    bVar.A((m950) bVar.E.get(), new zjn0(th, (List) null, 6), new a(new ScootersDataFormRouterImpl$handleSubmitAction$1$2$1(0, bVar, b.class, "handleSubmitAction", "handleSubmitAction()V", 0), bVar));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b bVar3 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    bVar = bVar3;
                    bVar.A((m950) bVar.E.get(), new zjn0(th, (List) null, 6), new a(new ScootersDataFormRouterImpl$handleSubmitAction$1$2$1(0, bVar, b.class, "handleSubmitAction", "handleSubmitAction()V", 0), bVar));
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
