package com.yandex.mob.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zm20;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "", "", "Liq20;", "Lcom/yandex/mob/api/model/MobProvisionMap;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.data.MobContourProvisionMemoryStorage$invokeOrFallback$2", f = "MobContourProvisionMemoryStorage.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobContourProvisionMemoryStorage$invokeOrFallback$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<zm20> $keySet;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobContourProvisionMemoryStorage$invokeOrFallback$2(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$keySet = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobContourProvisionMemoryStorage$invokeOrFallback$2(this.this$0, this.$keySet, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobContourProvisionMemoryStorage$invokeOrFallback$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        c cVar = this.this$0;
        List<zm20> list = this.$keySet;
        this.label = 1;
        Object k = cVar.k(list, this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
