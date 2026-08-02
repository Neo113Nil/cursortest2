package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g4l implements zsq0, nyi {
    public final JsonParserComponent a;

    public g4l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object o4lVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        p4l p4lVar = hexVar instanceof p4l ? (p4l) hexVar : null;
        if (p4lVar != null) {
            if (p4lVar instanceof n4l) {
                R = "pivot-fixed";
            } else {
                if (!(p4lVar instanceof o4l)) {
                    w511.b();
                    return null;
                }
                R = "pivot-percentage";
            }
        }
        boolean equals = R.equals("pivot-fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            c4l c4lVar = (c4l) jsonParserComponent.b6.getValue();
            if (p4lVar != null) {
                if (p4lVar instanceof n4l) {
                    obj2 = ((n4l) p4lVar).a;
                } else {
                    if (!(p4lVar instanceof o4l)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((o4l) p4lVar).a;
                }
                obj3 = obj2;
            }
            c4lVar.getClass();
            o4lVar = new n4l(c4l.c(yf90Var, (e4l) obj3, jSONObject));
        } else {
            if (!R.equals("pivot-percentage")) {
                throw fg90.m(jSONObject, "type", R);
            }
            k4l k4lVar = (k4l) jsonParserComponent.e6.getValue();
            if (p4lVar != null) {
                if (p4lVar instanceof n4l) {
                    obj = ((n4l) p4lVar).a;
                } else {
                    if (!(p4lVar instanceof o4l)) {
                        w511.b();
                        return null;
                    }
                    obj = ((o4l) p4lVar).a;
                }
                obj3 = obj;
            }
            k4lVar.getClass();
            o4lVar = new o4l(k4l.c(yf90Var, (m4l) obj3, jSONObject));
        }
        return o4lVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, p4l p4lVar) {
        boolean z = p4lVar instanceof n4l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            c4l c4lVar = (c4l) jsonParserComponent.b6.getValue();
            e4l e4lVar = ((n4l) p4lVar).a;
            c4lVar.getClass();
            return c4l.d(yf90Var, e4lVar);
        }
        if (!(p4lVar instanceof o4l)) {
            w511.b();
            return null;
        }
        k4l k4lVar = (k4l) jsonParserComponent.e6.getValue();
        m4l m4lVar = ((o4l) p4lVar).a;
        k4lVar.getClass();
        return k4l.d(yf90Var, m4lVar);
    }
}
