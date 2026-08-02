package com.yandex.go.eboks.objects.data.mapper;

import com.yandex.go.eboks.objects.data.model.EboksType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/runtime/image/ImageProvider;", "<anonymous>", "(Ltse;)Lcom/yandex/runtime/image/ImageProvider;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.data.mapper.EboksObjectsStyleMapper$mapToStyle$imageDeferred$1", f = "EboksObjectsStyleMapper.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsStyleMapper$mapToStyle$imageDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ EboksType $eboksType;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsStyleMapper$mapToStyle$imageDeferred$1(c cVar, EboksType eboksType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$eboksType = eboksType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EboksObjectsStyleMapper$mapToStyle$imageDeferred$1(this.this$0, this.$eboksType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsStyleMapper$mapToStyle$imageDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.eboks.objects.data.b bVar = this.this$0.a;
        String str = this.$eboksType.e.a.a;
        this.label = 1;
        Object a = bVar.a(str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
