package com.yandex.go.eboks.objects.data.mapper;

import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "Lcom/yandex/mapkit/map/VisibleRegion;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.data.mapper.EboksObjectsObjectsMapper$mapRowanObjectsCollections$2", f = "EboksObjectsObjectsMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsMapper$mapRowanObjectsCollections$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsMapper$mapRowanObjectsCollections$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EboksObjectsObjectsMapper$mapRowanObjectsCollections$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsObjectsMapper$mapRowanObjectsCollections$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(new Float(((gh00) this.this$0.a).j()), ((gh00) this.this$0.a).e.f());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
