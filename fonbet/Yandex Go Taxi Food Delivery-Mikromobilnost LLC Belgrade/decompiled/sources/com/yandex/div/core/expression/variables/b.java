package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import defpackage.f1k;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rtf0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tvo;
import defpackage.uxd;
import defpackage.v3k;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class b implements rtf0 {
    public final tvo a;
    public final yvf0 b;

    public b(tvo tvoVar, yvf0 yvf0Var) {
        this.a = tvoVar;
        this.b = yvf0Var;
    }

    @Override // defpackage.rtf0
    public final void a(List list, Object obj, String str, String str2) {
        Div2View div2View = (Div2View) this.b.get();
        if (div2View == null) {
            ny61.r(oyr.p("Property '", str, "' set skipped: target Div2View is gone"));
            return;
        }
        Map e = gw00.e(new Pair(str2, obj));
        tvo g = this.a.g(g8e.o("property:", str), new uxd(e));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            div2View.handleAction((v3k) it.next(), "property_variable_set", g);
        }
    }

    @Override // defpackage.rtf0
    public final f1k b(Expression expression, final sls slsVar) {
        return expression.c(this.a, new tls() { // from class: com.yandex.div.core.expression.variables.PropertyVariableExecutorImpl$observe$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                sls.this.invoke();
                return zy11.a;
            }
        });
    }

    @Override // defpackage.rtf0
    public final Object c(Expression expression) {
        return expression.a(this.a);
    }
}
