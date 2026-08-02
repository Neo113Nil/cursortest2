package com.yandex.go.agreement.trackable.mapper;

import com.yandex.go.slot.dto.SlotButtonDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lm101;", "<anonymous>", "(Ltse;)Lm101;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.trackable.mapper.TrackableAcceptanceUiStateMapper$map$2$buttons$1$1", f = "TrackableAcceptanceUiStateMapper.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TrackableAcceptanceUiStateMapper$map$2$buttons$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ SlotButtonDto $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableAcceptanceUiStateMapper$map$2$buttons$1$1(a aVar, SlotButtonDto slotButtonDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = slotButtonDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackableAcceptanceUiStateMapper$map$2$buttons$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackableAcceptanceUiStateMapper$map$2$buttons$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        SlotButtonDto slotButtonDto = this.$it;
        this.label = 1;
        Object b = a.b(aVar, slotButtonDto, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
