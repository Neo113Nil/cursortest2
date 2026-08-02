package com.yandex.go.rida.bids.header;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.b6k0;
import defpackage.br5;
import defpackage.c6k0;
import defpackage.ny61;
import defpackage.p3h0;
import defpackage.p5k0;
import defpackage.q5z;
import defpackage.vpr;
import defpackage.w5k0;
import defpackage.xqg0;
import defpackage.y5k0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ br5 b;

    public a(vpr vprVar, br5 br5Var) {
        this.a = vprVar;
        this.b = br5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        if (r12.emit(r11, r1) != r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1 bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        p5k0 p5k0Var;
        Integer S;
        w5k0 w5k0Var;
        e eVar = this.b.a;
        if (continuation instanceof BidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (BidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p5k0 p5k0Var2 = (p5k0) obj;
                    FormattedText formattedText = p5k0Var2.a;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = p5k0Var2;
                    bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = eVar.x(formattedText, bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        p5k0Var = p5k0Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                p5k0Var = (p5k0) bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6;
                vprVar = (vpr) bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                c6k0 c6k0Var = new c6k0((CharSequence) obj2, false, 1);
                String str = p5k0Var.b;
                b6k0 b6k0Var = str == null ? new b6k0(str, new Integer(p3h0.ic_coins_fill_24)) : null;
                OrderStatusInfo.RidaSearchInfo.BackgroundColors backgroundColors = p5k0Var.c;
                S = q5z.S(backgroundColors.a);
                Integer S2 = q5z.S(backgroundColors.b);
                if (S != null || S2 == null) {
                    Context context = eVar.a;
                    w5k0Var = new w5k0(context.getColor(xqg0.rida_header_gradient_top), context.getColor(xqg0.rida_header_gradient_bottom));
                } else {
                    w5k0Var = new w5k0(S.intValue(), S2.intValue());
                }
                y5k0 y5k0Var = new y5k0(c6k0Var, b6k0Var, w5k0Var, false);
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = null;
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
                bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new BidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        c6k0 c6k0Var2 = new c6k0((CharSequence) obj22, false, 1);
        String str2 = p5k0Var.b;
        if (str2 == null) {
        }
        OrderStatusInfo.RidaSearchInfo.BackgroundColors backgroundColors2 = p5k0Var.c;
        S = q5z.S(backgroundColors2.a);
        Integer S22 = q5z.S(backgroundColors2.b);
        if (S != null) {
        }
        Context context2 = eVar.a;
        w5k0Var = new w5k0(context2.getColor(xqg0.rida_header_gradient_top), context2.getColor(xqg0.rida_header_gradient_bottom));
        y5k0 y5k0Var2 = new y5k0(c6k0Var2, b6k0Var, w5k0Var, false);
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = null;
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
        bidsRidaHeaderStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 2;
    }
}
