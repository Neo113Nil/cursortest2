package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.json.expressions.Expression;
import defpackage.h73;
import defpackage.jl11;
import defpackage.jl40;
import defpackage.l6o;
import defpackage.oyr;
import defpackage.rvo;
import defpackage.s5r;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w7l;
import defpackage.x7l;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes11.dex */
public final class q implements jl11 {
    public final /* synthetic */ x7l a;
    public final /* synthetic */ DivSelectView b;
    public final /* synthetic */ l6o c;
    public final /* synthetic */ rvo w;

    public q(x7l x7lVar, DivSelectView divSelectView, l6o l6oVar, rvo rvoVar) {
        this.a = x7lVar;
        this.b = divSelectView;
        this.c = l6oVar;
        this.w = rvoVar;
    }

    @Override // defpackage.jl11
    public final void a(Object obj) {
        CharSequence charSequence;
        final String str = (String) obj;
        h73 h73Var = new h73(1, this.a.A);
        final rvo rvoVar = this.w;
        s5r s5rVar = new s5r(kotlin.sequences.b.g(h73Var, new tls() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(jl40.l(((w7l) obj2).b.a(rvo.this), str));
            }
        }));
        boolean hasNext = s5rVar.hasNext();
        l6o l6oVar = this.c;
        if (hasNext) {
            w7l w7lVar = (w7l) s5rVar.next();
            if (s5rVar.hasNext()) {
                l6oVar.f(new Throwable(oyr.p("Multiple options found with value = \"", str, "\", selecting first one")));
            }
            Expression expression = w7lVar.a;
            if (expression == null) {
                expression = w7lVar.b;
            }
            charSequence = (CharSequence) expression.a(rvoVar);
        } else {
            l6oVar.f(new Throwable(unr0.l(OpenList.CHAR_QUOTE, "No option found with value = \"", str)));
            charSequence = "";
        }
        this.b.setText(charSequence);
    }

    @Override // defpackage.jl11
    public final void e(tls tlsVar) {
        this.b.setValueUpdater(tlsVar);
    }
}
