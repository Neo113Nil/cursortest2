package com.yandex.div.core.view2.divs;

import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.json.expressions.Expression;
import defpackage.aw5;
import defpackage.egk;
import defpackage.il11;
import defpackage.m6o;
import defpackage.nml;
import defpackage.r8;
import defpackage.rvo;
import defpackage.scc;
import defpackage.tls;
import defpackage.w7l;
import defpackage.wls;
import defpackage.x7l;
import defpackage.zy11;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends r8 {
    public final nml c;
    public final il11 w;
    public final m6o x;

    public r(e eVar, nml nmlVar, il11 il11Var, m6o m6oVar) {
        super(4, eVar);
        this.c = nmlVar;
        this.w = il11Var;
        this.x = m6oVar;
    }

    @Override // defpackage.r8
    public final void ae(View view, final aw5 aw5Var, egk egkVar, egk egkVar2, com.yandex.div.core.state.b bVar) {
        final DivSelectView divSelectView = (DivSelectView) view;
        final x7l x7lVar = (x7l) egkVar;
        x7l x7lVar2 = (x7l) egkVar2;
        Div2View div2View = aw5Var.a;
        rvo rvoVar = aw5Var.b;
        divSelectView.setTextAlignment(5);
        divSelectView.setFocusTracker(div2View.getInputFocusTracker());
        final wls n = a.n(divSelectView, aw5Var, com.yandex.div.core.view2.animations.h.a, null);
        divSelectView.setOnTouchListener(n != null ? new View.OnTouchListener() { // from class: com.yandex.div.core.view2.divs.p
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ((Boolean) ((BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1) wls.this).invoke(view2, motionEvent)).booleanValue();
            }
        } : null);
        final ArrayList arrayList = new ArrayList();
        final int i = 0;
        for (Object obj : x7lVar.A) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            w7l w7lVar = (w7l) obj;
            Expression expression = w7lVar.a;
            if (expression == null) {
                expression = w7lVar.b;
            }
            arrayList.add(expression.a(rvoVar));
            expression.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$createObservedItemList$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    arrayList.set(i, (String) obj2);
                    divSelectView.setItems(arrayList);
                    return zy11.a;
                }
            });
            i = i2;
        }
        divSelectView.setItems(arrayList);
        divSelectView.setOnItemSelectedListener(new tls() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$applyOptions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int intValue = ((Number) obj2).intValue();
                DivSelectView.this.setText(arrayList.get(intValue));
                tls valueUpdater = DivSelectView.this.getValueUpdater();
                if (valueUpdater != null) {
                    valueUpdater.invoke(((w7l) x7lVar.A.get(intValue)).b.a(aw5Var.b));
                }
                return zy11.a;
            }
        });
        Div2View div2View2 = aw5Var.a;
        divSelectView.addSubscription(this.w.a(aw5Var, x7lVar.N, new q(x7lVar, divSelectView, this.x.a(div2View2.get_divData(), div2View2.getDataTag()), rvoVar)));
        Expression expression2 = x7lVar.m;
        Expression expression3 = x7lVar.n;
        Expression expression4 = x7lVar.x;
        Expression expression5 = x7lVar.F;
        Expression expression6 = x7lVar.y;
        Expression expression7 = x7lVar.l;
        Expression expression8 = x7lVar.p;
        Expression expression9 = x7lVar.q;
        Expression expression10 = x7lVar.o;
        Expression expression11 = x7lVar2 != null ? x7lVar2.m : null;
        Expression expression12 = x7lVar2 != null ? x7lVar2.n : null;
        a.x(divSelectView, expression2, expression3, expression4, expression5, expression6, expression7, expression8, expression9, expression10, expression11, expression12, x7lVar2 != null ? x7lVar2.x : null, x7lVar2 != null ? x7lVar2.F : null, x7lVar2 != null ? x7lVar2.y : null, x7lVar2 != null ? x7lVar2.l : null, x7lVar2 != null ? x7lVar2.p : null, x7lVar2 != null ? x7lVar2.q : null, x7lVar2 != null ? x7lVar2.o : null, x7lVar2, this.c, rvoVar);
        Expression expression13 = x7lVar.u;
        if (expression13 != null) {
            divSelectView.addSubscription(expression13.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintText$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    DivSelectView.this.setHint((String) obj2);
                    return zy11.a;
                }
            }));
        }
        divSelectView.addSubscription(x7lVar.t.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintColor$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                DivSelectView.this.setHintTextColor(((Number) obj2).intValue());
                return zy11.a;
            }
        }));
    }
}
