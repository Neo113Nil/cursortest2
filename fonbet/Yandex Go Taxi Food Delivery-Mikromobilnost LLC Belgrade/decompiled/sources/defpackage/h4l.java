package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h4l implements qfy0 {
    public final JsonParserComponent a;

    public h4l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z3l a(yf90 yf90Var, p4l p4lVar, JSONObject jSONObject) {
        boolean z = p4lVar instanceof n4l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            d4l d4lVar = (d4l) jsonParserComponent.c6.getValue();
            e4l e4lVar = ((n4l) p4lVar).a;
            d4lVar.getClass();
            return new x3l(d4l.b(yf90Var, e4lVar, jSONObject));
        }
        if (!(p4lVar instanceof o4l)) {
            w511.b();
            return null;
        }
        l4l l4lVar = (l4l) jsonParserComponent.f6.getValue();
        m4l m4lVar = ((o4l) p4lVar).a;
        l4lVar.getClass();
        return new y3l(new i4l(xcx.d(yf90Var, m4lVar.a, jSONObject, "value", wm11.d, b.g)));
    }
}
