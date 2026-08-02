package com.yandex.go.safety.center.lost_item.modal.mapper;

import defpackage.mjy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.orz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.mapper.LostItemsUiMapper$mapContentToUi$2$titleDeferred$1", f = "LostItemsUiMapper.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiMapper$mapContentToUi$2$titleDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ orz $content;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiMapper$mapContentToUi$2$titleDeferred$1(orz orzVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$content = orzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LostItemsUiMapper$mapContentToUi$2$titleDeferred$1(this.$content, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiMapper$mapContentToUi$2$titleDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        orz orzVar = this.$content;
        mjy0 mjy0Var = orzVar.b;
        Map map = orzVar.f;
        this.label = 1;
        Object a = a.a(aVar, mjy0Var, map, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
