package com.yandex.go.order.ui.card.eats;

import defpackage.d3p;
import defpackage.hm70;
import defpackage.hn70;
import defpackage.lm70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yl70;
import defpackage.yn70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzn70;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.ui.card.eats.ExternalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1", f = "ExternalServiceTrackingTrackingCardUiStateInteractor.kt", l = {31, 36, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExternalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ d3p $tracking;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1(d3p d3pVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$tracking = d3pVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExternalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1 externalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1 = new ExternalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1(this.$tracking, this.this$0, continuation);
        externalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return externalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExternalServiceTrackingTrackingCardUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c0, code lost:
    
        if (r1.emit(r8, r31) == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r1.emit(defpackage.xn70.a, r31) == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r3 == r2) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hn70 hn70Var;
        Object b;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    hn70 hn70Var2 = (hn70) this.L$2;
                    vpr vprVar2 = (vpr) this.L$1;
                    b.b(obj);
                    hn70Var = hn70Var2;
                    vprVar = vprVar2;
                    b = obj;
                    yn70 yn70Var = new yn70(hn70Var, null, (yl70) b, null, null, null, 502);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                } else if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            b.b(obj);
            return zy11.a;
        }
        b.b(obj);
        d3p d3pVar = this.$tracking;
        if (d3pVar.f == EatsOrderStatus.PENDING) {
            this.L$0 = null;
            this.label = 1;
        } else {
            this.this$0.getClass();
            String str = d3pVar.g;
            hn70Var = new hn70(d3pVar.d, null, null, null, null, false, null, d3pVar.e, null, null, str != null ? new lm70(str, null) : new hm70(d3pVar.c.getLogoId()), false, 0, null, false, 0L, 0L, null, 2094846);
            a aVar = this.this$0;
            d3p d3pVar2 = this.$tracking;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.L$2 = hn70Var;
            this.I$0 = 0;
            this.label = 2;
            b = a.b(aVar, d3pVar2, this);
        }
        return coroutineSingletons;
    }
}
