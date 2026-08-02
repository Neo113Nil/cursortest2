package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.json.expressions.Expression;
import defpackage.aw5;
import defpackage.egk;
import defpackage.fl11;
import defpackage.kvo;
import defpackage.qje;
import defpackage.r8;
import defpackage.rvo;
import defpackage.tls;
import defpackage.ycl;
import defpackage.yzh;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class v extends r8 {
    public final fl11 c;

    public v(e eVar, fl11 fl11Var) {
        super(4, eVar);
        this.c = fl11Var;
    }

    @Override // defpackage.r8
    public final void ae(View view, aw5 aw5Var, egk egkVar, egk egkVar2, com.yandex.div.core.state.b bVar) {
        final DivSwitchView divSwitchView = (DivSwitchView) view;
        final ycl yclVar = (ycl) egkVar;
        Expression expression = yclVar.s;
        ycl yclVar2 = (ycl) egkVar2;
        final rvo rvoVar = aw5Var.b;
        Expression expression2 = yclVar.o;
        if (!qje.k(expression2, yclVar2 != null ? yclVar2.o : null)) {
            divSwitchView.setEnabled(((Boolean) expression2.a(rvoVar)).booleanValue());
            if (!(expression2 instanceof kvo)) {
                divSwitchView.addSubscription(expression2.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindIsEnabled$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        v vVar = v.this;
                        DivSwitchView divSwitchView2 = divSwitchView;
                        ycl yclVar3 = yclVar;
                        rvo rvoVar2 = rvoVar;
                        vVar.getClass();
                        divSwitchView2.setEnabled(((Boolean) yclVar3.o.a(rvoVar2)).booleanValue());
                        return zy11.a;
                    }
                }));
            }
        }
        final rvo rvoVar2 = aw5Var.b;
        if (!qje.k(expression, yclVar2 != null ? yclVar2.s : null)) {
            divSwitchView.setColorOn(expression != null ? (Integer) expression.a(rvoVar2) : null);
            if (!qje.B(expression)) {
                divSwitchView.addSubscription(expression != null ? expression.c(rvoVar2, new tls() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindOnColor$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        v vVar = v.this;
                        DivSwitchView divSwitchView2 = divSwitchView;
                        ycl yclVar3 = yclVar;
                        rvo rvoVar3 = rvoVar2;
                        vVar.getClass();
                        Expression expression3 = yclVar3.s;
                        divSwitchView2.setColorOn(expression3 != null ? (Integer) expression3.a(rvoVar3) : null);
                        return zy11.a;
                    }
                }) : null);
            }
        }
        divSwitchView.addSubscription(this.c.a(aw5Var, yclVar.p, new yzh(divSwitchView)));
    }
}
