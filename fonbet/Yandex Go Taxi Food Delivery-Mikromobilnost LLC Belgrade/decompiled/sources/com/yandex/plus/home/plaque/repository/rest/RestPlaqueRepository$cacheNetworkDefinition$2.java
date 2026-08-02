package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.plaque.plugin.internal.defaults.c;
import defpackage.ay50;
import defpackage.gw00;
import defpackage.h260;
import defpackage.i4z;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o060;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$cacheNetworkDefinition$2", f = "RestPlaqueRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestPlaqueRepository$cacheNetworkDefinition$2 extends SuspendLambda implements wls {
    final /* synthetic */ ay50 $definition;
    final /* synthetic */ i4z $key;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$cacheNetworkDefinition$2$1", f = "RestPlaqueRepository.kt", l = {272}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$cacheNetworkDefinition$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ay50 $definition;
        final /* synthetic */ i4z $key;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i4z i4zVar, ay50 ay50Var, b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$key = i4zVar;
            this.$definition = ay50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$key, this.$definition, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0.b;
                i4z i4zVar = this.$key;
                o060 o060Var = this.$definition.c;
                this.label = 1;
                if (cVar.e(i4zVar, o060Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$cacheNetworkDefinition$2$2", f = "RestPlaqueRepository.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$cacheNetworkDefinition$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ ay50 $definition;
        final /* synthetic */ i4z $key;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(i4z i4zVar, ay50 ay50Var, b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$key = i4zVar;
            this.$definition = ay50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$key, this.$definition, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0.b;
                i4z i4zVar = this.$key;
                o060 o060Var = this.$definition.d;
                this.label = 1;
                if (cVar.d(i4zVar, o060Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$cacheNetworkDefinition$2$3", f = "RestPlaqueRepository.kt", l = {276}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$cacheNetworkDefinition$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ ay50 $definition;
        final /* synthetic */ i4z $key;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(i4z i4zVar, ay50 ay50Var, b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$definition = ay50Var;
            this.$key = i4zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = this.this$0;
            return new AnonymousClass3(this.$key, this.$definition, bVar, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                ay50 ay50Var = this.$definition;
                List list = ay50Var.b;
                o060[] o060VarArr = {ay50Var.c, ay50Var.d};
                bVar.getClass();
                List list2 = list;
                int d = gw00.d(tcc.n(list2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (Object obj2 : list2) {
                    linkedHashMap.put(((h260) obj2).getId(), obj2);
                }
                HashSet hashSet = new HashSet();
                Iterator it = j73.A(o060VarArr).iterator();
                while (it.hasNext()) {
                    b.i(hashSet, linkedHashMap, ((o060) it.next()).c);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (hashSet.contains(((h260) obj3).getId())) {
                        arrayList.add(obj3);
                    }
                }
                c cVar = this.this$0.b;
                i4z i4zVar = this.$key;
                this.L$0 = null;
                this.label = 1;
                if (cVar.f(i4zVar, arrayList, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestPlaqueRepository$cacheNetworkDefinition$2(i4z i4zVar, ay50 ay50Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$key = i4zVar;
        this.$definition = ay50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RestPlaqueRepository$cacheNetworkDefinition$2 restPlaqueRepository$cacheNetworkDefinition$2 = new RestPlaqueRepository$cacheNetworkDefinition$2(this.$key, this.$definition, this.this$0, continuation);
        restPlaqueRepository$cacheNetworkDefinition$2.L$0 = obj;
        return restPlaqueRepository$cacheNetworkDefinition$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RestPlaqueRepository$cacheNetworkDefinition$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.$key, this.$definition, this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.$key, this.$definition, this.this$0, null), 3);
        b bVar = this.this$0;
        return tje.N(tseVar, null, null, new AnonymousClass3(this.$key, this.$definition, bVar, null), 3);
    }
}
