package com.yandex.go.safety.center.lost_item.modal.mapper;

import defpackage.grz;
import defpackage.m7v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.orz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgrz;", "<anonymous>", "(Ltse;)Lgrz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.mapper.LostItemsUiMapper$mapContentToUi$2$imageDeferred$1", f = "LostItemsUiMapper.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiMapper$mapContentToUi$2$imageDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ orz $content;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiMapper$mapContentToUi$2$imageDeferred$1(orz orzVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$content = orzVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LostItemsUiMapper$mapContentToUi$2$imageDeferred$1(this.$content, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiMapper$mapContentToUi$2$imageDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            m7v m7vVar = this.$content.a;
            if (m7vVar == null) {
                return null;
            }
            a aVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            obj = aVar.c(m7vVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (grz) obj;
    }
}
