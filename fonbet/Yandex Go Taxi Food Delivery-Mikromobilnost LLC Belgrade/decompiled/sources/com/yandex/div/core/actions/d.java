package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import defpackage.c231;
import defpackage.ej91;
import defpackage.gtq0;
import defpackage.hbk;
import defpackage.jbk;
import defpackage.jhu0;
import defpackage.nbk;
import defpackage.nvu0;
import defpackage.rvo;
import defpackage.t131;
import defpackage.tls;
import defpackage.v821;
import defpackage.w131;
import defpackage.wor0;
import defpackage.zck;
import defpackage.zy11;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, final Div2View div2View, final rvo rvoVar) {
        if (!(jbkVar instanceof hbk)) {
            return false;
        }
        final zck zckVar = ((hbk) jbkVar).b;
        final v821 v821Var = new v821(new tls() { // from class: com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler$handleAction$helper$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Div2View.this.logError(new RuntimeException((String) obj));
                return zy11.a;
            }
        });
        gtq0.Q(div2View, (String) zckVar.c.a(rvoVar), rvoVar, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler$handleAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                c231 c231Var = (c231) obj;
                String str2 = (String) zck.this.a.a(rvoVar);
                Object e = ej91.e(zck.this.b, rvoVar);
                if (c231Var instanceof t131) {
                    v821 v821Var2 = v821Var;
                    t131 t131Var = (t131) c231Var;
                    ArrayList b = v821Var2.b(str2);
                    if (b != null) {
                        JSONArray jSONArray = (JSONArray) t131Var.d();
                        nvu0 a = v821Var2.a(new wor0(jSONArray), kotlin.collections.a.K(b));
                        if (a != null && v821Var2.c(a, (String) kotlin.collections.a.Z(b), e)) {
                            t131Var.k(jSONArray);
                            return c231Var;
                        }
                    }
                } else {
                    if (!(c231Var instanceof w131)) {
                        div2View.logError(new RuntimeException("Action requires array or dictionary variable"));
                        return c231Var;
                    }
                    v821 v821Var3 = v821Var;
                    w131 w131Var = (w131) c231Var;
                    ArrayList b2 = v821Var3.b(str2);
                    if (b2 != null) {
                        JSONObject jSONObject = (JSONObject) w131Var.d();
                        nvu0 a2 = v821Var3.a(new jhu0(jSONObject), kotlin.collections.a.K(b2));
                        if (a2 != null && v821Var3.c(a2, (String) kotlin.collections.a.Z(b2), e)) {
                            w131Var.j(jSONObject);
                        }
                    }
                }
                return c231Var;
            }
        });
        return true;
    }
}
