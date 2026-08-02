package com.yandex.div2;

import com.yandex.div2.DivFocus;
import defpackage.exq;
import defpackage.frk;
import defpackage.hex;
import defpackage.i3y;
import defpackage.qfy0;
import defpackage.xcx;
import defpackage.yf90;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 implements qfy0 {
    public final JsonParserComponent a;

    public g0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        frk frkVar = (frk) hexVar;
        exq exqVar = frkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        List s = xcx.s(yf90Var, exqVar, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, frkVar.b, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        DivFocus.a aVar = (DivFocus.a) xcx.h(yf90Var, frkVar.c, jSONObject, "next_focus_ids", jsonParserComponent.P3, jsonParserComponent.N3);
        exq exqVar2 = frkVar.d;
        i3y i3yVar = jsonParserComponent.v1;
        i3y i3yVar2 = jsonParserComponent.t1;
        return new DivFocus(s, divBorder, aVar, xcx.s(yf90Var, exqVar2, jSONObject, "on_blur", i3yVar, i3yVar2), xcx.s(yf90Var, frkVar.e, jSONObject, "on_focus", i3yVar, i3yVar2));
    }
}
