package com.yandex.div.core.view2;

import defpackage.jl40;
import defpackage.tls;
import defpackage.w53;
import defpackage.y4k;
import defpackage.y6k;
import defpackage.ycc;
import defpackage.zmk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g {
    public final List a;
    public final y6k b;
    public final y4k c;
    public final w53 d = new w53();
    public final w53 e = new w53();

    public g(List list, y6k y6kVar, y4k y4kVar) {
        this.a = list;
        this.b = y6kVar;
        this.c = y4kVar;
    }

    public final void a(List list) {
        boolean isEmpty = list.isEmpty();
        w53 w53Var = this.e;
        w53 w53Var2 = this.d;
        if (isEmpty) {
            w53Var2.clear();
            w53Var.clear();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final zmk zmkVar = (zmk) it.next();
            ycc.v(w53Var2.keySet(), new tls() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$reset$1$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(jl40.l(((b) obj).a, zmk.this.a));
                }
            }, true);
            ycc.v(w53Var.keySet(), new tls() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$reset$1$2
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(jl40.l(((b) obj).a, zmk.this.a));
                }
            }, true);
        }
    }
}
