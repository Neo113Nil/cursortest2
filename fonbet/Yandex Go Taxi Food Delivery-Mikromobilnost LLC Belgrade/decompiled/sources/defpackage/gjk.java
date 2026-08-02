package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class gjk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public gjk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq c = wcx.c(Q, jSONObject, "div", i, null, this.a.Y9);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        return new ijk(c, wcx.j(Q, jSONObject, "id", umsVar, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "selector", wm11.a, i, null, b.f, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ijk ijkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "div", ijkVar.a, this.a.Y9);
        wcx.q(yf90Var, jSONObject, "id", ijkVar.b);
        wcx.q(yf90Var, jSONObject, "selector", ijkVar.c);
        return jSONObject;
    }
}
