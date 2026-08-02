package com.yandex.messaging.domain;

import com.squareup.moshi.Moshi;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.eil0;
import defpackage.el21;
import defpackage.h9b;
import defpackage.i6u;
import defpackage.k020;
import defpackage.ks10;
import defpackage.lqo;
import defpackage.m7c;
import defpackage.ml21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5e;
import defpackage.p8g;
import defpackage.q5z;
import defpackage.qtq0;
import defpackage.tse;
import defpackage.v5c0;
import defpackage.wls;
import defpackage.x22;
import defpackage.y9i0;
import defpackage.z8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.ProcessCloudMessageUseCase$execute$2", f = "ProcessCloudMessageUseCase.kt", l = {19, 19}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ProcessCloudMessageUseCase$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ y9i0 $params;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCloudMessageUseCase$execute$2(j jVar, y9i0 y9i0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$params = y9i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProcessCloudMessageUseCase$execute$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProcessCloudMessageUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f6, code lost:
    
        if (r4.a(r2, r23) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            el21 el21Var = this.this$0.a;
            this.label = 1;
            a = com.yandex.messaging.internal.authorized.i.a(el21Var, this);
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
            a = obj;
        }
        d9g d9gVar = (d9g) ((cl21) a);
        z8g z8gVar = d9gVar.b;
        Moshi moshi = (Moshi) z8gVar.N.get();
        ml21 ml21Var = d9gVar.a;
        p8g p8gVar = d9gVar.c;
        k020 k020Var = (k020) p8gVar.H.get();
        qtq0 g = d9gVar.g();
        v5c0 v5c0Var = new v5c0(16, (x22) z8gVar.y.get());
        o5e o5eVar = (o5e) p8gVar.A.get();
        x22 x22Var = (x22) z8gVar.y.get();
        com.yandex.messaging.utils.b bVar = (com.yandex.messaging.utils.b) z8gVar.I.get();
        lqo lqoVar = z8gVar.a.d;
        q5z.i(lqoVar);
        com.yandex.messaging.internal.authorized.a aVar = new com.yandex.messaging.internal.authorized.a(moshi, ml21Var, k020Var, g, v5c0Var, o5eVar, new m7c(x22Var, bVar, lqoVar, (eil0) z8gVar.J.get()), new com.yandex.messaging.internal.authorized.sync.f((com.yandex.messaging.internal.authorized.sync.g) d9gVar.r.get(), d9gVar.g(), (k020) p8gVar.H.get(), i6u.d(z8gVar.c(), "Logic"), (h9b) d9gVar.H.get(), (ks10) p8gVar.f1.get()), (com.yandex.messaging.utils.b) z8gVar.I.get(), z8gVar.c(), (x22) z8gVar.y.get());
        y9i0 y9i0Var = this.$params;
        this.label = 2;
    }
}
