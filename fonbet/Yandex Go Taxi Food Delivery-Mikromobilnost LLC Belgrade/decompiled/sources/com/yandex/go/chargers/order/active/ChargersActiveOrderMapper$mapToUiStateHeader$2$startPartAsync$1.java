package com.yandex.go.chargers.order.active;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yk9;
import defpackage.z8y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyk9;", "<anonymous>", "(Ltse;)Lyk9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderMapper$mapToUiStateHeader$2$startPartAsync$1", f = "ChargersActiveOrderMapper.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderMapper$mapToUiStateHeader$2$startPartAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ z8y $leasingChargersOrder;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderMapper$mapToUiStateHeader$2$startPartAsync$1(f fVar, z8y z8yVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$leasingChargersOrder = z8yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrderMapper$mapToUiStateHeader$2$startPartAsync$1(this.this$0, this.$leasingChargersOrder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderMapper$mapToUiStateHeader$2$startPartAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.e;
            FormattedText formattedText = this.$leasingChargersOrder.k;
            this.label = 1;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
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
        return new yk9((CharSequence) obj, null);
    }
}
