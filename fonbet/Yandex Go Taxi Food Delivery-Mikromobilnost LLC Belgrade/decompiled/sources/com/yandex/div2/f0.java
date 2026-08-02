package com.yandex.div2;

import com.yandex.div2.DivFocus;
import defpackage.i3y;
import defpackage.nyi;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f0 implements zsq0, nyi {
    public final JsonParserComponent a;

    public f0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        List O = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        DivFocus.a aVar = (DivFocus.a) wwg.M(yf90Var, jSONObject, "next_focus_ids", jsonParserComponent.N3);
        i3y i3yVar = jsonParserComponent.t1;
        return new DivFocus(O, divBorder, aVar, wwg.O(yf90Var, jSONObject, "on_blur", i3yVar), wwg.O(yf90Var, jSONObject, "on_focus", i3yVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivFocus divFocus) {
        JSONObject jSONObject = new JSONObject();
        List list = divFocus.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, C0553n3.g, list, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", divFocus.b, jsonParserComponent.U1);
        wwg.b0(yf90Var, jSONObject, "next_focus_ids", divFocus.c, jsonParserComponent.N3);
        wwg.c0(yf90Var, jSONObject, "on_blur", divFocus.d, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "on_focus", divFocus.e, jsonParserComponent.t1);
        return jSONObject;
    }
}
