package com.yandex.go.taxi.order.map.overlay;

import defpackage.a3y0;
import defpackage.hst;
import defpackage.ist;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$onResume$30", f = "OrderMapOverlayPresenter.kt", l = {448, 449}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$onResume$30 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$onResume$30(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayPresenter$onResume$30(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMapOverlayPresenter$onResume$30) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r4.Xg((defpackage.mo21) r1, r7) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        Object h;
        c0 c0Var2;
        Throwable th;
        c0 c0Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0Var3 = (c0) this.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return zy11.a;
                }
                c0 c0Var4 = (c0) this.L$1;
                c0Var2 = (c0) this.L$0;
                try {
                    kotlin.b.b(obj);
                    h = obj;
                    c0Var = c0Var4;
                } catch (Throwable th3) {
                    th = th3;
                    c0Var3 = c0Var4;
                }
                a3y0 a3y0Var = c0Var3.y0;
                String l = a3y0Var.l(new String[]{"onResume", "processUserLocation", "getLocationOrDefaultImmediately"});
                hst hstVar = jst.e;
                String str = a3y0Var.a;
                ist m = hstVar.m(l);
                ke00 a = m.b.a();
                if (a != null && a.b(15)) {
                    a.a(15, str, th, "Error while getting location or default location update", m.a);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            c0Var = this.this$0;
            try {
                po21 po21Var = c0Var.F;
                this.L$0 = c0Var;
                this.L$1 = c0Var;
                this.label = 1;
                h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
                if (h == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0Var2 = c0Var;
            } catch (Throwable th4) {
                th = th4;
                c0Var3 = c0Var;
            }
            this.L$0 = c0Var;
            this.L$1 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
