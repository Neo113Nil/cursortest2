package com.yandex.div2;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.abl0;
import defpackage.d290;
import defpackage.exq;
import defpackage.hex;
import defpackage.kbs;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.rms;
import defpackage.tls;
import defpackage.tms;
import defpackage.udq0;
import defpackage.wcx;
import defpackage.wm11;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.yo40;
import defpackage.zsq0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m2 implements zsq0, yey0 {
    public final JsonParserComponent a;

    public m2(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "active_background_color", rmsVar, i, null, tlsVar, kbsVar);
        yo40 yo40Var = wm11.h;
        abl0 abl0Var = q5z.c;
        exq j2 = wcx.j(Q, jSONObject, "active_font_variation_settings", yo40Var, i, null, abl0Var, kbsVar);
        qkj qkjVar = o2.l;
        tls tlsVar2 = DivFontWeight.FROM_STRING;
        exq j3 = wcx.j(Q, jSONObject, "active_font_weight", qkjVar, i, null, tlsVar2, kbsVar);
        tms tmsVar = wm11.b;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        exq j4 = wcx.j(Q, jSONObject, "active_font_weight_value", tmsVar, i, null, tlsVar3, o2.q);
        exq j5 = wcx.j(Q, jSONObject, "active_text_color", rmsVar, i, null, tlsVar, kbsVar);
        exq j6 = wcx.j(Q, jSONObject, "animation_duration", tmsVar, i, null, tlsVar3, o2.r);
        exq j7 = wcx.j(Q, jSONObject, "animation_type", o2.m, i, null, DivTabs$TabTitleStyle.AnimationType.FROM_STRING, kbsVar);
        exq j8 = wcx.j(Q, jSONObject, "corner_radius", tmsVar, i, null, tlsVar3, o2.s);
        JsonParserComponent jsonParserComponent = this.a;
        return new p2(j, j2, j3, j4, j5, j6, j7, j8, wcx.i(Q, jSONObject, "corners_radius", i, null, jsonParserComponent.C2), wcx.j(Q, jSONObject, "font_family", wm11.c, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "font_size", tmsVar, i, null, tlsVar3, o2.t), wcx.j(Q, jSONObject, "font_size_unit", o2.n, i, null, DivSizeUnit.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, FontsContractCompat$Columns.WEIGHT, o2.o, i, null, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "inactive_background_color", rmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "inactive_font_variation_settings", yo40Var, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "inactive_font_weight", o2.p, i, null, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "inactive_font_weight_value", tmsVar, i, null, tlsVar3, o2.u), wcx.j(Q, jSONObject, "inactive_text_color", rmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "item_spacing", tmsVar, i, null, tlsVar3, o2.v), wcx.j(Q, jSONObject, "letter_spacing", wm11.d, i, null, com.yandex.div.internal.parser.b.g, kbsVar), wcx.j(Q, jSONObject, "line_height", tmsVar, i, null, tlsVar3, o2.w), wcx.i(Q, jSONObject, "paddings", i, null, jsonParserComponent.h3));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, p2 p2Var) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = p2Var.a;
        tls tlsVar = com.yandex.div.internal.parser.b.a;
        wcx.p(exqVar, tlsVar, yf90Var, "active_background_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "active_font_variation_settings", p2Var.b);
        exq exqVar2 = p2Var.c;
        tls tlsVar2 = DivFontWeight.TO_STRING;
        wcx.p(exqVar2, tlsVar2, yf90Var, "active_font_weight", jSONObject);
        wcx.q(yf90Var, jSONObject, "active_font_weight_value", p2Var.d);
        wcx.p(p2Var.e, tlsVar, yf90Var, "active_text_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "animation_duration", p2Var.f);
        wcx.p(p2Var.g, DivTabs$TabTitleStyle.AnimationType.TO_STRING, yf90Var, "animation_type", jSONObject);
        wcx.q(yf90Var, jSONObject, "corner_radius", p2Var.h);
        exq exqVar3 = p2Var.i;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "corners_radius", exqVar3, jsonParserComponent.C2);
        wcx.q(yf90Var, jSONObject, "font_family", p2Var.j);
        wcx.q(yf90Var, jSONObject, "font_size", p2Var.k);
        wcx.p(p2Var.l, DivSizeUnit.TO_STRING, yf90Var, "font_size_unit", jSONObject);
        wcx.p(p2Var.m, tlsVar2, yf90Var, FontsContractCompat$Columns.WEIGHT, jSONObject);
        wcx.p(p2Var.n, tlsVar, yf90Var, "inactive_background_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "inactive_font_variation_settings", p2Var.o);
        wcx.p(p2Var.p, tlsVar2, yf90Var, "inactive_font_weight", jSONObject);
        wcx.q(yf90Var, jSONObject, "inactive_font_weight_value", p2Var.q);
        wcx.p(p2Var.r, tlsVar, yf90Var, "inactive_text_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "item_spacing", p2Var.s);
        wcx.q(yf90Var, jSONObject, "letter_spacing", p2Var.t);
        wcx.q(yf90Var, jSONObject, "line_height", p2Var.u);
        wcx.u(yf90Var, jSONObject, "paddings", p2Var.v, jsonParserComponent.h3);
        return jSONObject;
    }
}
