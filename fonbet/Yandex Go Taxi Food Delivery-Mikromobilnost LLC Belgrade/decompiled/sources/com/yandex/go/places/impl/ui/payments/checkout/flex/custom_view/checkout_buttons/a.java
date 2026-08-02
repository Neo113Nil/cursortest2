package com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.PlacesPaymentsCheckoutButtonsDivCustomViewTypes;
import defpackage.clk;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lcc0;
import defpackage.plk;
import defpackage.rvo;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.wnt;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class a implements plk {
    public final tt2 b;
    public final tse c;
    public final wnt d;
    public final lcc0 e;
    public final LinkedHashMap f = new LinkedHashMap();

    public a(tt2 tt2Var, tse tseVar, wnt wntVar, lcc0 lcc0Var) {
        this.b = tt2Var;
        this.c = tseVar;
        this.d = wntVar;
        this.e = lcc0Var;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, com.yandex.div.core.state.b bVar) {
        if (view instanceof PlacesPaymentsCheckoutButtonsView) {
            String view2 = view.toString();
            LinkedHashMap linkedHashMap = this.f;
            l8x l8xVar = (l8x) linkedHashMap.remove(view2);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            linkedHashMap.put(view.toString(), tje.N(this.c, null, null, new PlacesPaymentsCheckoutButtonsViewAdapter$bindView$1(this, clkVar, view, null), 3));
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, com.yandex.div.core.state.b bVar) {
        return new PlacesPaymentsCheckoutButtonsView(div2View.getContext(), this.e);
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, PlacesPaymentsCheckoutButtonsDivCustomViewTypes.PLACES_PAYMENTS_CHECKOUT_BUTTONS.getType());
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView = view instanceof PlacesPaymentsCheckoutButtonsView ? (PlacesPaymentsCheckoutButtonsView) view : null;
        if (placesPaymentsCheckoutButtonsView != null) {
            l8x l8xVar = (l8x) this.f.remove(placesPaymentsCheckoutButtonsView.toString());
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            placesPaymentsCheckoutButtonsView.resetState$impl();
        }
    }
}
