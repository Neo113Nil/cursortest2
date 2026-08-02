package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a9l implements zsq0, nyi {
    public final JsonParserComponent a;

    public a9l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object c9lVar;
        Object a;
        Object a2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj = null;
        e9l e9lVar = hexVar instanceof e9l ? (e9l) hexVar : null;
        if (e9lVar != null) {
            if (e9lVar instanceof d9l) {
                R = "rounded_rectangle";
            } else {
                if (!(e9lVar instanceof c9l)) {
                    w511.b();
                    return null;
                }
                R = "circle";
            }
        }
        boolean equals = R.equals("rounded_rectangle");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            m7l m7lVar = (m7l) jsonParserComponent.L6.getValue();
            if (e9lVar != null) {
                if (e9lVar instanceof d9l) {
                    a2 = ((d9l) e9lVar).a;
                } else {
                    if (!(e9lVar instanceof c9l)) {
                        w511.b();
                        return null;
                    }
                    a2 = ((c9l) e9lVar).a();
                }
                obj = a2;
            }
            c9lVar = new d9l(m7lVar.c(yf90Var, (p7l) obj, jSONObject));
        } else {
            if (!R.equals("circle")) {
                throw fg90.m(jSONObject, "type", R);
            }
            qik qikVar = (qik) jsonParserComponent.h2.getValue();
            if (e9lVar != null) {
                if (e9lVar instanceof d9l) {
                    a = ((d9l) e9lVar).a;
                } else {
                    if (!(e9lVar instanceof c9l)) {
                        w511.b();
                        return null;
                    }
                    a = ((c9l) e9lVar).a();
                }
                obj = a;
            }
            c9lVar = new c9l(qikVar.c(yf90Var, (tik) obj, jSONObject));
        }
        return c9lVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, e9l e9lVar) {
        boolean z = e9lVar instanceof d9l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((m7l) jsonParserComponent.L6.getValue()).b(yf90Var, ((d9l) e9lVar).a);
        }
        if (e9lVar instanceof c9l) {
            return ((qik) jsonParserComponent.h2.getValue()).b(yf90Var, ((c9l) e9lVar).a());
        }
        w511.b();
        return null;
    }
}
