package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.bms;
import defpackage.d3p;
import defpackage.f1h0;
import defpackage.g401;
import defpackage.hn70;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.n2h0;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.rn70;
import defpackage.sn70;
import defpackage.tn70;
import defpackage.vn70;
import defpackage.w201;
import defpackage.w511;
import defpackage.wn70;
import defpackage.xn70;
import defpackage.yl70;
import defpackage.yn70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhn70;", "header", "Lg401;", "rating", "", "isUltima", "Lzn70;", "<anonymous>", "(Lhn70;Lg401;Z)Lzn70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor$uiStateFlow$1$1", f = "SuperappTrackingCardUiStateInteractor.kt", l = {152, 154, 169}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperappTrackingCardUiStateInteractor$uiStateFlow$1$1 extends SuspendLambda implements bms {
    final /* synthetic */ wn70 $style;
    final /* synthetic */ w201 $tracking;
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$uiStateFlow$1$1(wn70 wn70Var, w201 w201Var, e eVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = eVar;
        this.$tracking = w201Var;
        this.$style = wn70Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        e eVar = this.this$0;
        w201 w201Var = this.$tracking;
        SuperappTrackingCardUiStateInteractor$uiStateFlow$1$1 superappTrackingCardUiStateInteractor$uiStateFlow$1$1 = new SuperappTrackingCardUiStateInteractor$uiStateFlow$1$1(this.$style, w201Var, eVar, (Continuation) obj4);
        superappTrackingCardUiStateInteractor$uiStateFlow$1$1.L$0 = (hn70) obj;
        superappTrackingCardUiStateInteractor$uiStateFlow$1$1.L$1 = (g401) obj2;
        superappTrackingCardUiStateInteractor$uiStateFlow$1$1.Z$0 = booleanValue;
        return superappTrackingCardUiStateInteractor$uiStateFlow$1$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if (r4 == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006f, code lost:
    
        if (r4 == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object G;
        Object b;
        hn70 hn70Var;
        Integer num;
        int i;
        hn70 hn70Var2 = (hn70) this.L$0;
        g401 g401Var = (g401) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            w201 w201Var = this.$tracking;
            eVar.getClass();
            d3p d3pVar = w201Var instanceof d3p ? (d3p) w201Var : null;
            if ((d3pVar != null ? d3pVar.f : null) == EatsOrderStatus.PENDING) {
                return xn70.a;
            }
            y yVar = this.this$0.k;
            this.L$0 = hn70Var2;
            this.L$1 = g401Var;
            this.Z$0 = z;
            this.label = 1;
            f = yVar.f(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hn70 hn70Var3 = (hn70) this.L$2;
                    kotlin.b.b(obj);
                    hn70Var = hn70Var3;
                    b = obj;
                    return new yn70(hn70Var, null, (yl70) b, null, null, g401Var, 438);
                }
                hn70Var2 = (hn70) this.L$2;
                kotlin.b.b(obj);
                G = obj;
                hn70 hn70Var4 = hn70Var2;
                if (!((Boolean) G).booleanValue() || (this.$tracking instanceof pu6)) {
                    num = null;
                } else {
                    wn70 wn70Var = this.$style;
                    if (wn70Var instanceof rn70) {
                        i = n2h0.ic_chevron_next_circle_focus;
                    } else {
                        if (!(wn70Var instanceof sn70) && !jl40.l(wn70Var, tn70.a) && !(wn70Var instanceof vn70)) {
                            w511.b();
                            return null;
                        }
                        i = f1h0.ic_chevron_next_circle;
                    }
                    num = new Integer(i);
                }
                hn70Var2 = hn70.a(hn70Var4, null, SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE, num, null, null, 2097127);
                e eVar2 = this.this$0;
                w201 w201Var2 = this.$tracking;
                wn70 wn70Var2 = this.$style;
                this.L$0 = null;
                this.L$1 = g401Var;
                this.L$2 = hn70Var2;
                this.Z$0 = z;
                this.I$0 = 0;
                this.label = 3;
                b = e.b(eVar2, w201Var2, wn70Var2, z, this);
                if (b != coroutineSingletons) {
                    hn70Var = hn70Var2;
                    return new yn70(hn70Var, null, (yl70) b, null, null, g401Var, 438);
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
            f = obj;
        }
        if (((Boolean) f).booleanValue()) {
            if (hn70Var2 != null) {
                y yVar2 = this.this$0.k;
                this.L$0 = null;
                this.L$1 = g401Var;
                this.L$2 = hn70Var2;
                this.Z$0 = z;
                this.label = 2;
                G = yVar2.G(this);
            } else {
                hn70Var2 = null;
            }
        }
        e eVar22 = this.this$0;
        w201 w201Var22 = this.$tracking;
        wn70 wn70Var22 = this.$style;
        this.L$0 = null;
        this.L$1 = g401Var;
        this.L$2 = hn70Var2;
        this.Z$0 = z;
        this.I$0 = 0;
        this.label = 3;
        b = e.b(eVar22, w201Var22, wn70Var22, z, this);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
