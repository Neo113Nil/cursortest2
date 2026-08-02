package com.yandex.go.safety.center.lost_item.modal.mapper;

import defpackage.mjy0;
import defpackage.mvg;
import defpackage.nrz;
import defpackage.ny61;
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
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.mapper.LostItemsUiMapper$mapButtonToUi$2$titleDeferred$1", f = "LostItemsUiMapper.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiMapper$mapButtonToUi$2$titleDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ nrz $button;
    final /* synthetic */ Map<String, String> $templates;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiMapper$mapButtonToUi$2$titleDeferred$1(nrz nrzVar, a aVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$button = nrzVar;
        this.$templates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LostItemsUiMapper$mapButtonToUi$2$titleDeferred$1(this.$button, this.this$0, this.$templates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiMapper$mapButtonToUi$2$titleDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        mjy0 mjy0Var = this.$button.b;
        Map<String, String> map = this.$templates;
        this.label = 1;
        Object a = a.a(aVar, mjy0Var, map, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
