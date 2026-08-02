package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.VariableMutationException;
import defpackage.c231;
import defpackage.cxk;
import defpackage.dbk;
import defpackage.eee;
import defpackage.g9k;
import defpackage.gtq0;
import defpackage.jbk;
import defpackage.nbk;
import defpackage.pll;
import defpackage.qll;
import defpackage.rll;
import defpackage.rvo;
import defpackage.sll;
import defpackage.tll;
import defpackage.tls;
import defpackage.u991;
import defpackage.ull;
import defpackage.vll;
import defpackage.w511;
import defpackage.wll;
import defpackage.xll;

/* loaded from: classes11.dex */
public final class c implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, final Div2View div2View, rvo rvoVar) {
        final Object a;
        if (jbkVar instanceof dbk) {
            g9k g9kVar = ((dbk) jbkVar).b;
            if (str != null) {
                cxk i = new eee(str).i(div2View);
                rvo rvoVar2 = i != null ? i.b : null;
                if (rvoVar2 != null) {
                    rvoVar = rvoVar2;
                }
            }
            String str2 = (String) g9kVar.b.a(rvoVar);
            xll xllVar = g9kVar.a;
            if (xllVar instanceof pll) {
                a = ((pll) xllVar).b.a.a(rvoVar);
            } else if (xllVar instanceof qll) {
                a = ((qll) xllVar).b.a.a(rvoVar);
            } else if (xllVar instanceof rll) {
                a = ((rll) xllVar).b.a.a(rvoVar);
            } else if (xllVar instanceof sll) {
                a = ((sll) xllVar).b.a.a(rvoVar);
            } else if (xllVar instanceof tll) {
                a = ((tll) xllVar).b.a.a(rvoVar);
            } else if (xllVar instanceof ull) {
                a = ((ull) xllVar).b.a.a(rvoVar);
            } else if (xllVar instanceof vll) {
                a = ((vll) xllVar).b.a.a(rvoVar);
            } else if (xllVar instanceof wll) {
                a = ((wll) xllVar).b.a.a(rvoVar);
            } else {
                w511.b();
            }
            gtq0.Q(div2View, str2, rvoVar, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedSetVariableHandler$handleSetVariable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    c231 c231Var = (c231) obj;
                    try {
                        u991.b(c231Var, a);
                        return c231Var;
                    } catch (VariableMutationException e) {
                        div2View.logError(e);
                        return c231Var;
                    }
                }
            });
            return true;
        }
        return false;
    }
}
