package com.google.firebase.sessions;

import defpackage.bvf0;
import defpackage.gzq0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5f0;
import defpackage.q5f0;
import defpackage.s5f0;
import defpackage.tje;
import defpackage.tpg;
import defpackage.tse;
import defpackage.udq0;
import defpackage.wls;
import defpackage.wyq0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {HProv.PP_CONTAINER_DEFAULT, 186}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SharedSessionRepositoryImpl$appForeground$1 extends SuspendLambda implements wls {
    final /* synthetic */ wyq0 $sessionData;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwyq0;", "currentSessionData", "<anonymous>", "(Lwyq0;)Lwyq0;"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((wyq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            gzq0 gzq0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            wyq0 wyq0Var = (wyq0) this.L$0;
            boolean d = this.this$0.d(wyq0Var);
            Map map = wyq0Var.c;
            d dVar = this.this$0;
            dVar.getClass();
            if (map != null) {
                q5f0 q5f0Var = dVar.f;
                if (!q5f0Var.f) {
                    ArrayList r = udq0.r(q5f0Var.a);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = r.iterator();
                    while (it.hasNext()) {
                        s5f0 s5f0Var = (s5f0) it.next();
                        o5f0 o5f0Var = (o5f0) map.get(s5f0Var.a);
                        Pair pair = o5f0Var != null ? new Pair(s5f0Var, o5f0Var) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Pair pair2 = (Pair) it2.next();
                            s5f0 s5f0Var2 = (s5f0) pair2.getFirst();
                            o5f0 o5f0Var2 = (o5f0) pair2.getSecond();
                            boolean l = jl40.l(q5f0Var.a(), s5f0Var2.a);
                            int i = s5f0Var2.b;
                            if (l) {
                                if (i == o5f0Var2.a && jl40.l((String) q5f0Var.d.getValue(), o5f0Var2.b)) {
                                }
                            } else if (i != o5f0Var2.a) {
                            }
                        }
                    }
                }
                z = false;
                boolean c = this.this$0.c(wyq0Var);
                if (!z) {
                    map = this.this$0.f.b(kotlin.collections.b.f());
                } else if (c) {
                    map = this.this$0.f.b(map);
                }
                gzq0Var = !z ? null : wyq0Var.a;
                if (d && !z) {
                    return c ? wyq0.a(wyq0Var, null, null, this.this$0.f.b(map), 3) : wyq0Var;
                }
                gzq0 a = this.this$0.b.a(gzq0Var);
                c cVar = this.this$0.c;
                tje.N(bvf0.a(cVar.e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(cVar, a, null), 3);
                this.this$0.f.f = true;
                return new wyq0(a, null, map);
            }
            z = true;
            boolean c2 = this.this$0.c(wyq0Var);
            if (!z) {
            }
            if (!z) {
            }
            if (d) {
            }
            gzq0 a2 = this.this$0.b.a(gzq0Var);
            c cVar2 = this.this$0.c;
            tje.N(bvf0.a(cVar2.e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(cVar2, a2, null), 3);
            this.this$0.f.f = true;
            return new wyq0(a2, null, map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appForeground$1(d dVar, wyq0 wyq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$sessionData = wyq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedSessionRepositoryImpl$appForeground$1(this.this$0, this.$sessionData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$appForeground$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (com.google.firebase.sessions.d.a(r1, r7, r2, r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception unused) {
            if (this.this$0.d(this.$sessionData)) {
                gzq0 a = this.this$0.b.a(this.$sessionData.a);
                this.this$0.h = wyq0.a(this.$sessionData, a, null, null, 4);
                c cVar = this.this$0.c;
                tje.N(bvf0.a(cVar.e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(cVar, a, null), 3);
                d dVar = this.this$0;
                String str = a.a;
                SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType = SharedSessionRepositoryImpl$NotificationType.FALLBACK;
                this.label = 2;
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar2 = this.this$0;
            tpg tpgVar = dVar2.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar2, null);
            this.label = 1;
            Object a2 = tpgVar.a(anonymousClass1, this);
            this = a2;
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
            this = this;
        }
        return zy11.a;
    }
}
