package com.yandex.go.payments_widgets.section.payments.loyalty;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import defpackage.clk;
import defpackage.jl40;
import defpackage.kjz;
import defpackage.plk;
import defpackage.pzt0;
import defpackage.rvo;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;

/* loaded from: classes8.dex */
public final class a implements plk {
    public final tt2 b;
    public final tse c;
    public final kjz d;
    public pzt0 e;

    public a(tt2 tt2Var, tse tseVar, kjz kjzVar) {
        this.b = tt2Var;
        this.c = tseVar;
        this.d = kjzVar;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        if (view instanceof LoyaltyProgressView) {
            pzt0 pzt0Var = this.e;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.e = tje.N(this.c, null, null, new LoyaltyProgressViewAdapter$bindView$1(this, view, clkVar, null), 3);
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        return new LoyaltyProgressView(div2View.getContext());
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, LoyaltyCustomViewTypes.LOYALTY_PROGRESS_BUTTON.getType());
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        if (view instanceof LoyaltyProgressView) {
            pzt0 pzt0Var = this.e;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            ((LoyaltyProgressView) view).release();
        }
    }
}
