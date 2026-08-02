package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lol implements zsq0, yey0 {
    public final JsonParserComponent a;

    public lol(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        kbs kbsVar = q5z.b;
        return new pol(wcx.j(Q, jSONObject, "bitrate", tmsVar, i, null, tlsVar, kbsVar), wcx.d(Q, jSONObject, "mime_type", wm11.c, i, null), wcx.i(Q, jSONObject, "resolution", i, null, this.a.M9), wcx.e(Q, jSONObject, "url", wm11.e, i, null, b.e, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, pol polVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "bitrate", polVar.a);
        wcx.q(yf90Var, jSONObject, "mime_type", polVar.b);
        wcx.u(yf90Var, jSONObject, "resolution", polVar.c, this.a.M9);
        wwg.Z(yf90Var, jSONObject, "type", "video_source");
        wcx.p(polVar.d, b.c, yf90Var, "url", jSONObject);
        return jSONObject;
    }
}
