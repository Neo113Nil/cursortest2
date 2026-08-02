package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n7l implements qfy0 {
    public final JsonParserComponent a;

    public n7l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k7l a(yf90 yf90Var, p7l p7lVar, JSONObject jSONObject) {
        Expression l = xcx.l(yf90Var, p7lVar.a, jSONObject, "background_color", wm11.f, b.b);
        exq exqVar = p7lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.G3;
        i3y i3yVar2 = jsonParserComponent.G3;
        i3y i3yVar3 = jsonParserComponent.E3;
        sqk sqkVar = (sqk) xcx.h(yf90Var, exqVar, jSONObject, "corner_radius", i3yVar, i3yVar3);
        if (sqkVar == null) {
            sqkVar = o7l.a;
        }
        sqk sqkVar2 = sqkVar;
        sqk sqkVar3 = (sqk) xcx.h(yf90Var, p7lVar.c, jSONObject, "item_height", i3yVar2, i3yVar3);
        if (sqkVar3 == null) {
            sqkVar3 = o7l.b;
        }
        sqk sqkVar4 = (sqk) xcx.h(yf90Var, p7lVar.d, jSONObject, "item_width", i3yVar2, i3yVar3);
        if (sqkVar4 == null) {
            sqkVar4 = o7l.c;
        }
        return new k7l(l, sqkVar2, sqkVar3, sqkVar4, (bcl) xcx.h(yf90Var, p7lVar.e, jSONObject, "stroke", jsonParserComponent.a8, jsonParserComponent.Y7));
    }
}
