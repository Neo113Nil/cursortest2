package com.yandex.go.chargers.multiorder.ui;

import defpackage.d4a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5a;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo5a;", "<anonymous>", "(Ltse;)Lo5a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toUiState$2$headerLabel$1", f = "ChargersMultiOrderUiStateMapper.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderUiStateMapper$toUiState$2$headerLabel$1 extends SuspendLambda implements wls {
    final /* synthetic */ d4a $rawLabel;
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderUiStateMapper$toUiState$2$headerLabel$1(d4a d4aVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$rawLabel = d4aVar;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersMultiOrderUiStateMapper$toUiState$2$headerLabel$1(this.$rawLabel, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderUiStateMapper$toUiState$2$headerLabel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d4a d4aVar = this.$rawLabel;
            if (d4aVar == null) {
                return null;
            }
            g gVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            obj = g.b(gVar, d4aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (o5a) obj;
    }
}
