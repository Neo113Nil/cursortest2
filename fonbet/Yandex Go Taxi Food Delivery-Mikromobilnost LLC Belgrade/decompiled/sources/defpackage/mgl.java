package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.x2;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mgl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public mgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        exq k = wcx.k(Q, jSONObject, "actions", i, null, jsonParserComponent.u1);
        qkj qkjVar = x2.d;
        tls tlsVar = DivTextAlignmentVertical.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_vertical", qkjVar, i, null, tlsVar, kbsVar);
        exq i2 = wcx.i(Q, jSONObject, C0553n3.g, i, null, jsonParserComponent.u8);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        exq j2 = wcx.j(Q, jSONObject, "baseline_offset", smsVar, i, null, tlsVar2, kbsVar);
        exq i3 = wcx.i(Q, jSONObject, "border", i, null, jsonParserComponent.x8);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        exq j3 = wcx.j(Q, jSONObject, "end", tmsVar, i, null, tlsVar3, x2.i);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        exq j4 = wcx.j(Q, jSONObject, "font_family", umsVar, i, null, abl0Var, kbsVar);
        exq j5 = wcx.j(Q, jSONObject, "font_feature_settings", umsVar, i, null, abl0Var, kbsVar);
        exq j6 = wcx.j(Q, jSONObject, "font_size", tmsVar, i, null, tlsVar3, x2.j);
        exq j7 = wcx.j(Q, jSONObject, "font_size_unit", x2.e, i, null, DivSizeUnit.FROM_STRING, kbsVar);
        exq j8 = wcx.j(Q, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, i, null, abl0Var, kbsVar);
        exq j9 = wcx.j(Q, jSONObject, FontsContractCompat$Columns.WEIGHT, x2.f, i, null, DivFontWeight.FROM_STRING, kbsVar);
        exq j10 = wcx.j(Q, jSONObject, "font_weight_value", tmsVar, i, null, tlsVar3, x2.k);
        exq j11 = wcx.j(Q, jSONObject, "letter_spacing", smsVar, i, null, tlsVar2, kbsVar);
        exq j12 = wcx.j(Q, jSONObject, "line_height", tmsVar, i, null, tlsVar3, x2.l);
        exq i4 = wcx.i(Q, jSONObject, "mask", i, null, jsonParserComponent.I8);
        exq j13 = wcx.j(Q, jSONObject, "start", tmsVar, i, null, tlsVar3, x2.m);
        qkj qkjVar2 = x2.g;
        tls tlsVar4 = DivLineStyle.FROM_STRING;
        return new thl(k, j, i2, j2, i3, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, i4, j13, wcx.j(Q, jSONObject, "strike", qkjVar2, i, null, tlsVar4, kbsVar), wcx.j(Q, jSONObject, "text_color", wm11.f, i, null, b.b, kbsVar), wcx.i(Q, jSONObject, "text_shadow", i, null, jsonParserComponent.d7), wcx.j(Q, jSONObject, "top_offset", tmsVar, i, null, tlsVar3, x2.n), wcx.j(Q, jSONObject, "underline", x2.h, i, null, tlsVar4, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, thl thlVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = thlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "actions", exqVar, jsonParserComponent.u1);
        wcx.p(thlVar.b, DivTextAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.u(yf90Var, jSONObject, C0553n3.g, thlVar.c, jsonParserComponent.u8);
        wcx.q(yf90Var, jSONObject, "baseline_offset", thlVar.d);
        wcx.u(yf90Var, jSONObject, "border", thlVar.e, jsonParserComponent.x8);
        wcx.q(yf90Var, jSONObject, "end", thlVar.f);
        wcx.q(yf90Var, jSONObject, "font_family", thlVar.g);
        wcx.q(yf90Var, jSONObject, "font_feature_settings", thlVar.h);
        wcx.q(yf90Var, jSONObject, "font_size", thlVar.i);
        wcx.p(thlVar.j, DivSizeUnit.TO_STRING, yf90Var, "font_size_unit", jSONObject);
        wcx.q(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, thlVar.k);
        wcx.p(thlVar.l, DivFontWeight.TO_STRING, yf90Var, FontsContractCompat$Columns.WEIGHT, jSONObject);
        wcx.q(yf90Var, jSONObject, "font_weight_value", thlVar.m);
        wcx.q(yf90Var, jSONObject, "letter_spacing", thlVar.n);
        wcx.q(yf90Var, jSONObject, "line_height", thlVar.o);
        wcx.u(yf90Var, jSONObject, "mask", thlVar.p, jsonParserComponent.I8);
        wcx.q(yf90Var, jSONObject, "start", thlVar.q);
        exq exqVar2 = thlVar.r;
        tls tlsVar = DivLineStyle.TO_STRING;
        wcx.p(exqVar2, tlsVar, yf90Var, "strike", jSONObject);
        wcx.p(thlVar.s, b.a, yf90Var, "text_color", jSONObject);
        wcx.u(yf90Var, jSONObject, "text_shadow", thlVar.t, jsonParserComponent.d7);
        wcx.q(yf90Var, jSONObject, "top_offset", thlVar.u);
        wcx.p(thlVar.v, tlsVar, yf90Var, "underline", jSONObject);
        return jSONObject;
    }
}
