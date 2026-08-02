package com.yandex.go.eboks.objects.data.mapper;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qhn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lphn;", "<anonymous>", "(Ltse;)Lphn;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.data.mapper.EboksObjectsObjectsMapper$mapAllRowanObjects$2$1", f = "EboksObjectsObjectsMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsMapper$mapAllRowanObjects$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<zzs> $objects;
    final /* synthetic */ qhn $style;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsMapper$mapAllRowanObjects$2$1(a aVar, String str, List list, qhn qhnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$type = str;
        this.$objects = list;
        this.$style = qhnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EboksObjectsObjectsMapper$mapAllRowanObjects$2$1(this.this$0, this.$type, this.$objects, this.$style, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsObjectsMapper$mapAllRowanObjects$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return a.c(this.this$0, this.$type, this.$objects, this.$style);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
