package com.yandex.div.core.view2.divs;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSize;
import defpackage.aw5;
import defpackage.egk;
import defpackage.fll;
import defpackage.m3k;
import defpackage.rvo;
import defpackage.sqk;
import defpackage.tls;
import defpackage.uvo;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends fll implements uvo {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    @Override // defpackage.fll
    public final void a(m3k m3kVar, aw5 aw5Var, com.yandex.div.core.state.b bVar) {
        egk d = m3kVar.d();
        rvo rvoVar = aw5Var.b;
        i(d.getWidth(), rvoVar);
        i(d.getHeight(), rvoVar);
    }

    @Override // defpackage.uvo
    public final List getSubscriptions() {
        return this.b;
    }

    public final void i(DivSize divSize, final rvo rvoVar) {
        Object c = divSize.c();
        sqk sqkVar = c instanceof sqk ? (sqk) c : null;
        if (sqkVar == null) {
            return;
        }
        Expression expression = sqkVar.b;
        final com.yandex.div.json.expressions.a aVar = expression instanceof com.yandex.div.json.expressions.a ? (com.yandex.div.json.expressions.a) expression : null;
        if (aVar == null) {
            return;
        }
        addSubscription(aVar.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivLayoutProviderVariableHolder$observe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((Number) obj).longValue();
                o.this.a.addAll(aVar.g(rvoVar));
                return zy11.a;
            }
        }));
    }
}
