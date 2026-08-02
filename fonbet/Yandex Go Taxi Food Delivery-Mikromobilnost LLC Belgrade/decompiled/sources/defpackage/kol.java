package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kol implements zsq0, nyi {
    public final JsonParserComponent a;

    public kol(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Expression d = a.d(yf90Var, jSONObject, "bitrate", wm11.b, b.h);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        return new iol(d, a.b(yf90Var, jSONObject, "mime_type", umsVar, abl0Var, kbsVar), (hol) wwg.M(yf90Var, jSONObject, "resolution", this.a.L9), a.b(yf90Var, jSONObject, "url", wm11.e, b.e, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, iol iolVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "bitrate", iolVar.a);
        a.g(yf90Var, jSONObject, "mime_type", iolVar.b);
        wwg.b0(yf90Var, jSONObject, "resolution", iolVar.c, this.a.L9);
        wwg.Z(yf90Var, jSONObject, "type", "video_source");
        a.h(yf90Var, jSONObject, "url", iolVar.d, b.c);
        return jSONObject;
    }
}
