package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import defpackage.c231;
import defpackage.ej91;
import defpackage.f6k;
import defpackage.gtq0;
import defpackage.jbk;
import defpackage.nbk;
import defpackage.rvo;
import defpackage.tls;
import defpackage.uak;
import defpackage.w131;
import defpackage.xll;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, final Div2View div2View, rvo rvoVar) {
        if (!(jbkVar instanceof uak)) {
            return false;
        }
        f6k f6kVar = ((uak) jbkVar).b;
        String str2 = (String) f6kVar.c.a(rvoVar);
        final String str3 = (String) f6kVar.a.a(rvoVar);
        xll xllVar = f6kVar.b;
        final Object e = xllVar != null ? ej91.e(xllVar, rvoVar) : null;
        gtq0.Q(div2View, str2, rvoVar, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedDictSetValueHandler$handleSetValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                c231 c231Var = (c231) obj;
                if (!(c231Var instanceof w131)) {
                    Div2View.this.logError(new IllegalArgumentException("dict_set_value action requires dict variable"));
                    return c231Var;
                }
                Object d = c231Var.d();
                JSONObject jSONObject = d instanceof JSONObject ? (JSONObject) d : null;
                if (jSONObject == null) {
                    Div2View.this.logError(new IllegalArgumentException("Invalid variable value"));
                    return c231Var;
                }
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                Object obj2 = e;
                String str4 = str3;
                if (obj2 != null) {
                    ((w131) c231Var).j(jSONObject2.put(str4, obj2));
                    return c231Var;
                }
                jSONObject2.remove(str4);
                ((w131) c231Var).j(jSONObject2);
                return c231Var;
            }
        });
        return true;
    }
}
