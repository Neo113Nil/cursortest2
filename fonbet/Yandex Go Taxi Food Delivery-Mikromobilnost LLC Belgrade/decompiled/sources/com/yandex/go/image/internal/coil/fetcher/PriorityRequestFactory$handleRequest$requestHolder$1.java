package com.yandex.go.image.internal.coil.fetcher;

import defpackage.eyc;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.m041;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.y270;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ly270;", "<anonymous>", "(Ltse;)Ly270;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.PriorityRequestFactory$handleRequest$requestHolder$1", f = "PriorityRequestFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class PriorityRequestFactory$handleRequest$requestHolder$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $key;
    final /* synthetic */ int $priority;
    final /* synthetic */ tls $requestFactory;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityRequestFactory$handleRequest$requestHolder$1(c cVar, Object obj, int i, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$key = obj;
        this.$priority = i;
        this.$requestFactory = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PriorityRequestFactory$handleRequest$requestHolder$1 priorityRequestFactory$handleRequest$requestHolder$1 = new PriorityRequestFactory$handleRequest$requestHolder$1(this.this$0, this.$key, this.$priority, this.$requestFactory, continuation);
        priorityRequestFactory$handleRequest$requestHolder$1.L$0 = obj;
        return priorityRequestFactory$handleRequest$requestHolder$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriorityRequestFactory$handleRequest$requestHolder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y270 y270Var;
        final tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        eyc eycVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final c cVar = this.this$0;
        HashMap hashMap = cVar.c;
        Object obj2 = this.$key;
        int i = this.$priority;
        final tls tlsVar = this.$requestFactory;
        synchronized (hashMap) {
            try {
                y270Var = (y270) cVar.c.get(obj2);
                if (y270Var != null) {
                    y270Var.d++;
                    m041 m041Var = y270Var.b;
                    if (m041Var != null && m041Var.a < i) {
                        if (cVar.c(i)) {
                            cVar.e++;
                            eycVar = (eyc) m041Var.c.getAndSet(null);
                        } else {
                            long j = cVar.d;
                            cVar.d = 1 + j;
                            m041 m041Var2 = new m041(i, j, m041Var.c);
                            y270Var.b = m041Var2;
                            cVar.f.add(m041Var2);
                        }
                    }
                } else if (cVar.c(i)) {
                    cVar.e++;
                    y270Var = new y270(kotlin.a.a(new sls() { // from class: com.yandex.go.image.internal.coil.fetcher.a
                        @Override // defpackage.sls
                        public final Object invoke() {
                            return tje.g(tse.this, cVar.b, CoroutineStart.UNDISPATCHED, new PriorityRequestFactory$handleRequest$requestHolder$1$1$1$1(tlsVar, null));
                        }
                    }), null);
                    cVar.c.put(obj2, y270Var);
                } else {
                    final fyc b = gwk0.b();
                    long j2 = cVar.d;
                    cVar.d = 1 + j2;
                    m041 m041Var3 = new m041(i, j2, new AtomicReference(b));
                    y270 y270Var2 = new y270(kotlin.a.a(new sls() { // from class: com.yandex.go.image.internal.coil.fetcher.b
                        @Override // defpackage.sls
                        public final Object invoke() {
                            return tje.g(tse.this, cVar.b, CoroutineStart.UNDISPATCHED, new PriorityRequestFactory$handleRequest$requestHolder$1$1$3$1(b, tlsVar, null));
                        }
                    }), m041Var3);
                    cVar.c.put(obj2, y270Var2);
                    cVar.f.add(m041Var3);
                    y270Var = y270Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eycVar != null) {
            ((fyc) eycVar).T(zy11.a);
        }
        return y270Var;
    }
}
