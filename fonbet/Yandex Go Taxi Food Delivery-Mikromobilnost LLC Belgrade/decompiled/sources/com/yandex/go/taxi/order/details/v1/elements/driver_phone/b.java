package com.yandex.go.taxi.order.details.v1.elements.driver_phone;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.e;
import com.yandex.go.taxi.order.details.v1.ui.f;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Button;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Action$CopyToClipboard;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import com.yandex.go.taxi.order.models.api.response.n1;
import defpackage.avj0;
import defpackage.j9k0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.sim;
import defpackage.vim;
import defpackage.xim;
import defpackage.xng0;
import defpackage.zuj0;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class b {
    public final sim a;
    public final c b;
    public final zuj0 c;

    public b(sim simVar, c cVar, zuj0 zuj0Var) {
        this.a = simVar;
        this.b = cVar;
        this.c = zuj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if (r2 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement orderDetailsCardResponse$CardElement$DriverPhoneButtonElement, ContinuationImpl continuationImpl) {
        DriverPhoneStateMapper$map$1 driverPhoneStateMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        n1 n1Var;
        f fVar;
        Object i2;
        Object i3;
        n1 n1Var2;
        OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement orderDetailsCardResponse$CardElement$DriverPhoneButtonElement2;
        f fVar2;
        Object i4;
        f fVar3;
        n1 n1Var3;
        CharSequence charSequence;
        if (continuationImpl instanceof DriverPhoneStateMapper$map$1) {
            driverPhoneStateMapper$map$1 = (DriverPhoneStateMapper$map$1) continuationImpl;
            int i5 = driverPhoneStateMapper$map$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                driverPhoneStateMapper$map$1.label = i5 - Integer.MIN_VALUE;
                Object obj = driverPhoneStateMapper$map$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driverPhoneStateMapper$map$1.label;
                c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n1Var = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.e;
                    if (!(n1Var instanceof OrderDetailsCardResponse$CardElement$Action$CopyToClipboard)) {
                        return (xim) this.a.a.getValue();
                    }
                    i1 i1Var = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.d;
                    if (!(i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Button)) {
                        fVar = e.b;
                        FormattedText formattedText = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.b;
                        driverPhoneStateMapper$map$1.L$0 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
                        driverPhoneStateMapper$map$1.L$1 = n1Var;
                        driverPhoneStateMapper$map$1.L$2 = null;
                        driverPhoneStateMapper$map$1.L$3 = fVar;
                        driverPhoneStateMapper$map$1.label = 2;
                        i3 = c.i(cVar, formattedText, null, driverPhoneStateMapper$map$1, 30);
                        if (i3 != coroutineSingletons) {
                            n1 n1Var4 = n1Var;
                            obj = i3;
                            n1Var2 = n1Var4;
                            orderDetailsCardResponse$CardElement$DriverPhoneButtonElement2 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
                            fVar2 = fVar;
                            CharSequence charSequence2 = (CharSequence) obj;
                            FormattedText formattedText2 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement2.c;
                            driverPhoneStateMapper$map$1.L$0 = null;
                            driverPhoneStateMapper$map$1.L$1 = n1Var2;
                            driverPhoneStateMapper$map$1.L$2 = null;
                            driverPhoneStateMapper$map$1.L$3 = fVar2;
                            driverPhoneStateMapper$map$1.L$4 = charSequence2;
                            driverPhoneStateMapper$map$1.label = 3;
                            i4 = c.i(cVar, formattedText2, null, driverPhoneStateMapper$map$1, 30);
                            if (i4 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    FormattedText formattedText3 = ((OrderDetailsCardResponse$AccessoryResponse$Button) i1Var).a;
                    driverPhoneStateMapper$map$1.L$0 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
                    driverPhoneStateMapper$map$1.L$1 = n1Var;
                    driverPhoneStateMapper$map$1.L$2 = null;
                    driverPhoneStateMapper$map$1.label = 1;
                    i2 = c.i(cVar, formattedText3, null, driverPhoneStateMapper$map$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence = (CharSequence) driverPhoneStateMapper$map$1.L$4;
                            f fVar4 = (f) driverPhoneStateMapper$map$1.L$3;
                            n1 n1Var5 = (n1) driverPhoneStateMapper$map$1.L$1;
                            kotlin.b.b(obj);
                            fVar3 = fVar4;
                            n1Var3 = n1Var5;
                            return new vim(charSequence, (CharSequence) obj, new j9k0(((OrderDetailsCardResponse$CardElement$Action$CopyToClipboard) n1Var3).a), new DetailsCardListItem.a(0, 0, false, false, fVar3, 31));
                        }
                        f fVar5 = (f) driverPhoneStateMapper$map$1.L$3;
                        n1 n1Var6 = (n1) driverPhoneStateMapper$map$1.L$1;
                        orderDetailsCardResponse$CardElement$DriverPhoneButtonElement2 = (OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement) driverPhoneStateMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        fVar2 = fVar5;
                        n1Var2 = n1Var6;
                        CharSequence charSequence22 = (CharSequence) obj;
                        FormattedText formattedText22 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement2.c;
                        driverPhoneStateMapper$map$1.L$0 = null;
                        driverPhoneStateMapper$map$1.L$1 = n1Var2;
                        driverPhoneStateMapper$map$1.L$2 = null;
                        driverPhoneStateMapper$map$1.L$3 = fVar2;
                        driverPhoneStateMapper$map$1.L$4 = charSequence22;
                        driverPhoneStateMapper$map$1.label = 3;
                        i4 = c.i(cVar, formattedText22, null, driverPhoneStateMapper$map$1, 30);
                        if (i4 != coroutineSingletons) {
                            fVar3 = fVar2;
                            n1Var3 = n1Var2;
                            charSequence = charSequence22;
                            obj = i4;
                            return new vim(charSequence, (CharSequence) obj, new j9k0(((OrderDetailsCardResponse$CardElement$Action$CopyToClipboard) n1Var3).a), new DetailsCardListItem.a(0, 0, false, false, fVar3, 31));
                        }
                        return coroutineSingletons;
                    }
                    n1 n1Var7 = (n1) driverPhoneStateMapper$map$1.L$1;
                    OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement orderDetailsCardResponse$CardElement$DriverPhoneButtonElement3 = (OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement) driverPhoneStateMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    n1Var = n1Var7;
                    orderDetailsCardResponse$CardElement$DriverPhoneButtonElement = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement3;
                    i2 = obj;
                }
                int i6 = xng0.textMain;
                avj0 avj0Var = (avj0) this.c;
                fVar = new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) i2, qje.t(i6, avj0Var.a), qje.t(xng0.controlMinor, avj0Var.a), Collections.singletonList(new Integer(avj0Var.c(mrg0.go_design_m_space))));
                FormattedText formattedText4 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.b;
                driverPhoneStateMapper$map$1.L$0 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
                driverPhoneStateMapper$map$1.L$1 = n1Var;
                driverPhoneStateMapper$map$1.L$2 = null;
                driverPhoneStateMapper$map$1.L$3 = fVar;
                driverPhoneStateMapper$map$1.label = 2;
                i3 = c.i(cVar, formattedText4, null, driverPhoneStateMapper$map$1, 30);
                if (i3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        driverPhoneStateMapper$map$1 = new DriverPhoneStateMapper$map$1(this, continuationImpl);
        Object obj2 = driverPhoneStateMapper$map$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driverPhoneStateMapper$map$1.label;
        c cVar2 = this.b;
        if (i != 0) {
        }
        int i62 = xng0.textMain;
        avj0 avj0Var2 = (avj0) this.c;
        fVar = new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) i2, qje.t(i62, avj0Var2.a), qje.t(xng0.controlMinor, avj0Var2.a), Collections.singletonList(new Integer(avj0Var2.c(mrg0.go_design_m_space))));
        FormattedText formattedText42 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement.b;
        driverPhoneStateMapper$map$1.L$0 = orderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
        driverPhoneStateMapper$map$1.L$1 = n1Var;
        driverPhoneStateMapper$map$1.L$2 = null;
        driverPhoneStateMapper$map$1.L$3 = fVar;
        driverPhoneStateMapper$map$1.label = 2;
        i3 = c.i(cVar2, formattedText42, null, driverPhoneStateMapper$map$1, 30);
        if (i3 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
