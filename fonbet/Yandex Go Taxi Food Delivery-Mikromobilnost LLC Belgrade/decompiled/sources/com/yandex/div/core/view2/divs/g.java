package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import defpackage.aw5;
import defpackage.clk;
import defpackage.cpk;
import defpackage.fu11;
import defpackage.hgk;
import defpackage.j2k;
import defpackage.jl40;
import defpackage.ngd0;
import defpackage.ngh0;
import defpackage.o400;
import defpackage.plk;
import defpackage.r8;
import defpackage.rvo;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.uh6;
import defpackage.uyj;
import defpackage.wwg;
import defpackage.yvf0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class g extends r8 {
    public final e c;
    public final plk w;
    public final cpk x;
    public final yvf0 y;

    public g(e eVar, plk plkVar, cpk cpkVar, yvf0 yvf0Var) {
        super(4, eVar);
        this.c = eVar;
        this.w = plkVar;
        this.x = cpkVar;
        this.y = yvf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Hg(g gVar, DivCustomWrapper divCustomWrapper, View view, clk clkVar, clk clkVar2, aw5 aw5Var, sls slsVar, tls tlsVar) {
        Object obj;
        View view2;
        gVar.getClass();
        ngd0 ngd0Var = ngd0.G;
        if (view != null) {
            j2k div = divCustomWrapper.getDiv();
            if (jl40.l(div != null ? div.c.j : null, clkVar2.j) && clkVar != null) {
                List list = clkVar.q;
                List list2 = EmptyList.a;
                if (list == null) {
                    list = list2;
                }
                int size = list.size();
                List list3 = clkVar2.q;
                if (list3 != null) {
                    list2 = list3;
                }
                if (size == list2.size()) {
                    view2 = view;
                    Div2View div2View = aw5Var.a;
                    if (!jl40.l(view, view2)) {
                        if (divCustomWrapper.getChildCount() != 0) {
                            wwg.Y(div2View.getReleaseViewVisitor$div_release(), uh6.v(divCustomWrapper, 0));
                            divCustomWrapper.removeViewAt(0);
                        }
                        divCustomWrapper.addView(view2);
                    }
                    ngd0Var.p();
                    if (fu11.a.a()) {
                        sjh sjhVar = uyj.a;
                        tje.Y(o400.a, new DivCustomBinder$bind$$inlined$executeOnMainThreadBlocking$2(null, tlsVar, view2));
                    } else {
                        ((DivCustomBinder$bindView$2$2) tlsVar).invoke(view2);
                    }
                    e eVar = gVar.c;
                    String str = clkVar2.p;
                    eVar.getClass();
                    int a = div2View.getViewComponent().n().a(str);
                    view2.setTag(str);
                    view2.setId(a);
                    gVar.x.a(div2View, aw5Var.b, view2, clkVar2);
                }
            }
        }
        ngd0Var.p();
        if (fu11.a.a()) {
            View view3 = (View) ((DivCustomBinder$bindView$2$1) slsVar).invoke();
            view3.setTag(ngh0.div_custom_tag, clkVar2);
            obj = view3;
        } else {
            sjh sjhVar2 = uyj.a;
            obj = tje.Y(o400.a, new DivCustomBinder$bind$$inlined$executeOnMainThreadBlocking$1(null, slsVar, clkVar2));
        }
        view2 = (View) obj;
        Div2View div2View2 = aw5Var.a;
        if (!jl40.l(view, view2)) {
        }
        ngd0Var.p();
        if (fu11.a.a()) {
        }
        e eVar2 = gVar.c;
        String str2 = clkVar2.p;
        eVar2.getClass();
        int a2 = div2View2.getViewComponent().n().a(str2);
        view2.setTag(str2);
        view2.setId(a2);
        gVar.x.a(div2View2, aw5Var.b, view2, clkVar2);
    }

    public final void Ig(aw5 aw5Var, DivCustomWrapper divCustomWrapper, j2k j2kVar, com.yandex.div.core.state.b bVar) {
        aw5 bindingContext;
        rvo rvoVar;
        View customView = divCustomWrapper.getCustomView();
        j2k div = divCustomWrapper.getDiv();
        Div2View div2View = aw5Var.a;
        rvo rvoVar2 = aw5Var.b;
        if (div == j2kVar) {
            a.l(divCustomWrapper, aw5Var, (hgk) this.y.get());
            return;
        }
        if (customView != null && div != null && (bindingContext = divCustomWrapper.getBindingContext()) != null && (rvoVar = bindingContext.b) != null) {
            this.x.e(div2View, rvoVar, customView, div.d());
        }
        this.c.d(aw5Var, divCustomWrapper, j2kVar, div);
        int a = div2View.getViewComponent().n().a(null);
        divCustomWrapper.setTag(null);
        divCustomWrapper.setId(a);
        clk clkVar = j2kVar.c;
        ngd0.G.p();
        if (!fu11.a.a()) {
            sjh sjhVar = uyj.a;
            tje.Y(o400.a, new DivCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1(null, this, clkVar, divCustomWrapper, customView, div, aw5Var, div2View, rvoVar2, bVar));
        } else if (this.w.isCustomTypeSupported(clkVar.j)) {
            Hg(this, divCustomWrapper, customView, div != null ? div.c : null, clkVar, aw5Var, new DivCustomBinder$bindView$2$1(this, clkVar, div2View, rvoVar2, bVar), new DivCustomBinder$bindView$2$2(this, clkVar, div2View, rvoVar2, bVar));
        }
    }
}
