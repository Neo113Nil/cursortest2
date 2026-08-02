package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f4l implements zsq0, nyi {
    public final JsonParserComponent a;

    public f4l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("pivot-fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((b4l) jsonParserComponent.a6.getValue()).getClass();
            return new x3l(b4l.c(yf90Var, jSONObject));
        }
        if (R.equals("pivot-percentage")) {
            ((j4l) jsonParserComponent.d6.getValue()).getClass();
            return new y3l(j4l.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        p4l p4lVar = b instanceof p4l ? (p4l) b : null;
        if (p4lVar != null) {
            return ((h4l) jsonParserComponent.i6.getValue()).a(yf90Var, p4lVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, z3l z3lVar) {
        boolean z = z3lVar instanceof x3l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            b4l b4lVar = (b4l) jsonParserComponent.a6.getValue();
            a4l a4lVar = ((x3l) z3lVar).b;
            b4lVar.getClass();
            return b4l.d(yf90Var, a4lVar);
        }
        if (!(z3lVar instanceof y3l)) {
            w511.b();
            return null;
        }
        j4l j4lVar = (j4l) jsonParserComponent.d6.getValue();
        i4l i4lVar = ((y3l) z3lVar).b;
        j4lVar.getClass();
        return j4l.d(yf90Var, i4lVar);
    }
}
