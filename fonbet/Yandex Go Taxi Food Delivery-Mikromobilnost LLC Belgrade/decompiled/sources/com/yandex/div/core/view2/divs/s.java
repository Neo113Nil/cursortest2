package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSeparator;
import defpackage.aw5;
import defpackage.egk;
import defpackage.f1k;
import defpackage.qje;
import defpackage.r8;
import defpackage.rvo;
import defpackage.tls;
import defpackage.vsg0;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class s extends r8 {
    public static void Hg(DivSeparatorView divSeparatorView, DivSeparator.DelimiterStyle delimiterStyle, rvo rvoVar) {
        if (delimiterStyle == null) {
            divSeparatorView.setDividerColor(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
            divSeparatorView.setHorizontal(true);
        } else {
            divSeparatorView.setDividerColor(((Number) delimiterStyle.a.a(rvoVar)).intValue());
            divSeparatorView.setHorizontal(((DivSeparator.DelimiterStyle.Orientation) delimiterStyle.b.a(rvoVar)) == DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (defpackage.qje.k(r14 != null ? r14.b : null, r2 != null ? r2.b : null) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (defpackage.qje.B(r14 != null ? r14.b : null) != false) goto L48;
     */
    @Override // defpackage.r8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Hc(View view, aw5 aw5Var, egk egkVar, egk egkVar2) {
        Expression expression;
        Expression expression2;
        final DivSeparatorView divSeparatorView = (DivSeparatorView) view;
        DivSeparator divSeparator = (DivSeparator) egkVar;
        DivSeparator divSeparator2 = (DivSeparator) egkVar2;
        a.c(divSeparatorView, aw5Var, divSeparator.b, divSeparator.d, divSeparator.x, divSeparator.o, divSeparator.u, divSeparator.t, divSeparator.B, divSeparator.A, divSeparator.c, divSeparator.k);
        final DivSeparator.DelimiterStyle delimiterStyle = divSeparator.m;
        f1k f1kVar = null;
        DivSeparator.DelimiterStyle delimiterStyle2 = divSeparator2 != null ? divSeparator2.m : null;
        final rvo rvoVar = aw5Var.b;
        if (qje.k(delimiterStyle != null ? delimiterStyle.a : null, delimiterStyle2 != null ? delimiterStyle2.a : null)) {
        }
        Hg(divSeparatorView, delimiterStyle, rvoVar);
        if (qje.B(delimiterStyle != null ? delimiterStyle.a : null)) {
        }
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$bindStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                s sVar = s.this;
                DivSeparatorView divSeparatorView2 = divSeparatorView;
                DivSeparator.DelimiterStyle delimiterStyle3 = delimiterStyle;
                rvo rvoVar2 = rvoVar;
                sVar.getClass();
                s.Hg(divSeparatorView2, delimiterStyle3, rvoVar2);
                return zy11.a;
            }
        };
        divSeparatorView.addSubscription((delimiterStyle == null || (expression2 = delimiterStyle.a) == null) ? null : expression2.c(rvoVar, tlsVar));
        if (delimiterStyle != null && (expression = delimiterStyle.b) != null) {
            f1kVar = expression.c(rvoVar, tlsVar);
        }
        divSeparatorView.addSubscription(f1kVar);
        divSeparatorView.setDividerHeightResource(vsg0.div_separator_delimiter_height);
        divSeparatorView.setDividerGravity(17);
    }
}
