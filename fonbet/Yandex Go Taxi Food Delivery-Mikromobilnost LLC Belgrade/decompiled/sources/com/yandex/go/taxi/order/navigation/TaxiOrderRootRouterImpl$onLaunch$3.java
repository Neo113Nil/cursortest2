package com.yandex.go.taxi.order.navigation;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.a5y0;
import defpackage.a780;
import defpackage.b5y0;
import defpackage.c5y0;
import defpackage.d5y0;
import defpackage.f670;
import defpackage.g5y0;
import defpackage.i6y0;
import defpackage.lw40;
import defpackage.mvg;
import defpackage.mw40;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q870;
import defpackage.t0y0;
import defpackage.t370;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zkb1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.navigation.TaxiOrderRootRouterImpl$onLaunch$3", f = "TaxiOrderRootRouterImpl.kt", l = {185}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderRootRouterImpl$onLaunch$3 extends SuspendLambda implements wls {
    final /* synthetic */ d5y0 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderRootRouterImpl$onLaunch$3(a aVar, d5y0 d5y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = d5y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderRootRouterImpl$onLaunch$3(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderRootRouterImpl$onLaunch$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lw40 f670Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ((i6y0) this.this$0.V).b(zkb1.a(TaxiOrderSessionCheckpoint.START_ORDER_FRAGMENT_ROUTER));
            d5y0 d5y0Var = this.$payload;
            if (d5y0Var instanceof b5y0) {
                this.label = 1;
                if (a.Q(this.this$0, (b5y0) d5y0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (d5y0Var instanceof a5y0) {
                a aVar = this.this$0;
                a5y0 a5y0Var = (a5y0) d5y0Var;
                aVar.getClass();
                if (a5y0Var.c == TaxiCardNavigationAction.OPEN_PAYMENT) {
                    o2y0 o2y0Var = a5y0Var.b;
                    TaxiOrder b = o2y0Var != null ? o2y0Var.b() : null;
                    if (b != null) {
                        q870 q870Var = new q870(new t0y0(b.a, b.x(), b.b.g0, aVar.H.d() ? aVar.H.g() : b.l.Y, b.h.b, b.h.b == DriveState.COMPLETE && !b.l.A, a5y0Var.c, true, DetailsOpenReason.PAYMENT_METHODS));
                        mw40 mw40Var = aVar.I;
                        a780 a780Var = mw40Var.a;
                        if (a780Var != null) {
                            a780Var.a(q870Var);
                        } else {
                            mw40Var.b = q870Var;
                        }
                    }
                }
                aVar.T.getClass();
                a.R(aVar, a5y0Var, a5y0Var.b, a5y0Var.e, 8);
            } else {
                if (!(d5y0Var instanceof c5y0)) {
                    w511.b();
                    return null;
                }
                a aVar2 = this.this$0;
                c5y0 c5y0Var = (c5y0) d5y0Var;
                aVar2.getClass();
                int i2 = g5y0.a[c5y0Var.b.ordinal()];
                if (i2 == 1) {
                    f670Var = new f670(DetailsOpenReason.LINKED_ORDER, c5y0Var.a);
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    f670Var = new t370(c5y0Var.a);
                }
                mw40 mw40Var2 = aVar2.I;
                a780 a780Var2 = mw40Var2.a;
                if (a780Var2 != null) {
                    a780Var2.a(f670Var);
                } else {
                    mw40Var2.b = f670Var;
                }
                a.R(aVar2, c5y0Var, null, false, 8);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
