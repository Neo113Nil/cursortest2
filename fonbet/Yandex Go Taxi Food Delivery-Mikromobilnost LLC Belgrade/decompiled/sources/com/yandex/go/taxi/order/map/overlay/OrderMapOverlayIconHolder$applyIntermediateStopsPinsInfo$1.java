package com.yandex.go.taxi.order.map.overlay;

import defpackage.bl00;
import defpackage.f4c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayIconHolder$applyIntermediateStopsPinsInfo$1", f = "OrderMapOverlayIconHolder.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayIconHolder$applyIntermediateStopsPinsInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<sq00> $pinsInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayIconHolder$applyIntermediateStopsPinsInfo$1(List list, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$pinsInfo = list;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayIconHolder$applyIntermediateStopsPinsInfo$1(this.$pinsInfo, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMapOverlayIconHolder$applyIntermediateStopsPinsInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006e -> B:5:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ArrayList P0 = kotlin.collections.a.P0(this.$pinsInfo, this.this$0.b);
            d dVar2 = this.this$0;
            it = P0.iterator();
            dVar = dVar2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f4c0 f4c0Var = (f4c0) this.L$5;
            it = (Iterator) this.L$2;
            dVar = (d) this.L$1;
            kotlin.b.b(obj);
            bl00 bl00Var = (bl00) obj;
            f4c0Var.z(bl00Var.a, bl00Var.b);
            if (it.hasNext()) {
                Pair pair = (Pair) it.next();
                sq00 sq00Var = (sq00) pair.getFirst();
                f4c0 f4c0Var2 = (f4c0) pair.getSecond();
                com.yandex.go.pin.api.widget.b bVar = dVar.e;
                this.L$0 = null;
                this.L$1 = dVar;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = f4c0Var2;
                this.label = 1;
                Object e = bVar.e(sq00Var, this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                f4c0Var = f4c0Var2;
                obj = e;
                bl00 bl00Var2 = (bl00) obj;
                f4c0Var.z(bl00Var2.a, bl00Var2.b);
                if (it.hasNext()) {
                    return zy11.a;
                }
            }
        }
    }
}
