package com.yandex.go.taxi.order.map.overlay;

import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverlay;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceScale;
import defpackage.a3y0;
import defpackage.a58;
import defpackage.hst;
import defpackage.ist;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t78;
import defpackage.tse;
import defpackage.u080;
import defpackage.v48;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$applyCarRenderState$1", f = "OrderMapOverlayPresenter.kt", l = {1434}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$applyCarRenderState$1 extends SuspendLambda implements wls {
    final /* synthetic */ t78 $state;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$applyCarRenderState$1(c0 c0Var, t78 t78Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
        this.$state = t78Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayPresenter$applyCarRenderState$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMapOverlayPresenter$applyCarRenderState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t78 t78Var;
        c0 c0Var;
        ObjectAppearanceOverlay objectAppearanceOverlay;
        ObjectAppearanceScale objectAppearanceScale;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        c0 c0Var2 = this.label;
        String str = null;
        try {
            if (c0Var2 == 0) {
                kotlin.b.b(obj);
                c0 c0Var3 = this.this$0;
                t78 t78Var2 = this.$state;
                ru.yandex.taxi.map.a aVar = c0Var3.L;
                v48 v48Var = t78Var2.a;
                ObjectAppearanceOverride objectAppearanceOverride = t78Var2.b;
                if (objectAppearanceOverride != null && (objectAppearanceOverlay = objectAppearanceOverride.c) != null) {
                    str = objectAppearanceOverlay.a;
                }
                v48 v48Var2 = new v48(v48Var.a, v48Var.b, str);
                this.L$0 = c0Var3;
                this.L$1 = t78Var2;
                this.L$2 = c0Var3;
                this.label = 1;
                Object a = aVar.a(v48Var2, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                t78Var = t78Var2;
                obj = a;
                c0Var = c0Var3;
                c0Var2 = c0Var3;
            } else {
                if (c0Var2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0 c0Var4 = (c0) this.L$2;
                t78Var = (t78) this.L$1;
                c0Var = (c0) this.L$0;
                kotlin.b.b(obj);
                c0Var2 = c0Var4;
            }
            a58 a58Var = (a58) obj;
            ((u080) c0Var.Dg()).K3(a58Var.a);
            c0Var.eh();
            ObjectAppearanceOverride objectAppearanceOverride2 = t78Var.b;
            c0Var.H0 = (objectAppearanceOverride2 == null || (objectAppearanceScale = objectAppearanceOverride2.b) == null) ? 1.0f : (float) objectAppearanceScale.a;
            if (c0Var.C.a(c0Var.A).b9()) {
                c0Var.eh();
            }
            c0.Mg(c0Var, t78Var.b, a58Var.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            a3y0 a3y0Var = c0Var2.y0;
            String l = a3y0Var.l(new String[]{"applyCarRenderState", "carIcon"});
            hst hstVar = jst.e;
            String str2 = a3y0Var.a;
            ist m = hstVar.m(l);
            ke00 a2 = m.b.a();
            if (a2 != null && a2.b(15)) {
                a2.a(15, str2, th, "error getting car icon", m.a);
            }
        }
        return zy11.a;
    }
}
