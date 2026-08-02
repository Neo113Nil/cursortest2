package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d6l implements qfy0 {
    public final JsonParserComponent a;

    public d6l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k5l a(yf90 yf90Var, a7l a7lVar, JSONObject jSONObject) {
        exq exqVar = a7lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.o6;
        i3y i3yVar2 = jsonParserComponent.m6;
        n5l n5lVar = (n5l) xcx.h(yf90Var, exqVar, jSONObject, "center_x", i3yVar, i3yVar2);
        if (n5lVar == null) {
            n5lVar = e6l.a;
        }
        n5l n5lVar2 = (n5l) xcx.h(yf90Var, a7lVar.b, jSONObject, "center_y", jsonParserComponent.o6, i3yVar2);
        if (n5lVar2 == null) {
            n5lVar2 = e6l.b;
        }
        List r = xcx.r(yf90Var, a7lVar.c, jSONObject, jsonParserComponent.G6, jsonParserComponent.E6, e6l.e);
        exq exqVar2 = a7lVar.d;
        rms rmsVar = wm11.f;
        tls tlsVar = b.a;
        pvo p = xcx.p(yf90Var, exqVar2, jSONObject, rmsVar, e6l.d);
        h6l h6lVar = (h6l) xcx.h(yf90Var, a7lVar.e, jSONObject, "radius", jsonParserComponent.u6, jsonParserComponent.s6);
        if (h6lVar == null) {
            h6lVar = e6l.c;
        }
        return new k5l(n5lVar, n5lVar2, r, p, h6lVar);
    }
}
