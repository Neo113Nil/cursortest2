package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.log.api.LogPriority;
import defpackage.cq50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltse;", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1", f = "RestPlaqueRepository.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1 extends SuspendLambda implements wls {
    final /* synthetic */ List $networkWidgets$inlined;
    final /* synthetic */ Map $templatesMap$inlined;
    final /* synthetic */ Collection $this_asyncMap;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1$1", f = "RestPlaqueRepository.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Object $item;
        final /* synthetic */ List $networkWidgets$inlined;
        final /* synthetic */ Map $templatesMap$inlined;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, b bVar, List list, Map map) {
            super(2, continuation);
            this.$item = obj;
            this.this$0 = bVar;
            this.$networkWidgets$inlined = list;
            this.$templatesMap$inlined = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$item, continuation, this.this$0, this.$networkWidgets$inlined, this.$templatesMap$inlined);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                cq50 cq50Var = (cq50) this.$item;
                a aVar = this.this$0.s;
                List list = this.$networkWidgets$inlined;
                Map map = this.$templatesMap$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                f = aVar.f(cq50Var, list, map, this);
                if (f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                f = ((Result) obj).getValue();
            }
            Throwable a = Result.a(f);
            if (a != null) {
                pgz pgzVar = this.this$0.m;
                LogPriority logPriority = LogPriority.ERROR;
                if (pgzVar.e(logPriority)) {
                    pgzVar.b(logPriority, "RestPlaqueRepository", "can't map conditional plaque", a);
                }
            }
            if (f instanceof Result.Failure) {
                return null;
            }
            return f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1(Collection collection, Continuation continuation, b bVar, List list, Map map) {
        super(2, continuation);
        this.$this_asyncMap = collection;
        this.this$0 = bVar;
        this.$networkWidgets$inlined = list;
        this.$templatesMap$inlined = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1 restPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1 = new RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1(this.$this_asyncMap, continuation, this.this$0, this.$networkWidgets$inlined, this.$templatesMap$inlined);
        restPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1.L$0 = obj;
        return restPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Collection collection = this.$this_asyncMap;
        ArrayList arrayList = new ArrayList(tcc.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new AnonymousClass1(it.next(), null, this.this$0, this.$networkWidgets$inlined, this.$templatesMap$inlined), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
