package com.yandex.div2;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.exq;
import defpackage.hex;
import defpackage.jkk;
import defpackage.kvo;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.rms;
import defpackage.sms;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.xcx;
import defpackage.y7l;
import defpackage.yf90;
import defpackage.yo40;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n2 implements qfy0 {
    public final JsonParserComponent a;

    public n2(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        p2 p2Var = (p2) hexVar;
        exq exqVar = p2Var.a;
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kvo kvoVar = o2.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "active_background_color", rmsVar, tlsVar, kvoVar);
        kvo kvoVar2 = o == 0 ? kvoVar : o;
        exq exqVar2 = p2Var.b;
        yo40 yo40Var = wm11.h;
        Expression k = xcx.k(yf90Var, exqVar2, jSONObject, "active_font_variation_settings", yo40Var);
        exq exqVar3 = p2Var.c;
        qkj qkjVar = o2.l;
        tls tlsVar2 = DivFontWeight.FROM_STRING;
        Expression l = xcx.l(yf90Var, exqVar3, jSONObject, "active_font_weight", qkjVar, tlsVar2);
        exq exqVar4 = p2Var.d;
        tms tmsVar = wm11.b;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        Expression m = xcx.m(yf90Var, exqVar4, jSONObject, "active_font_weight_value", tmsVar, tlsVar3, o2.q);
        exq exqVar5 = p2Var.e;
        kvo kvoVar3 = o2.b;
        ?? o2 = xcx.o(yf90Var, exqVar5, jSONObject, "active_text_color", rmsVar, tlsVar, kvoVar3);
        kvo kvoVar4 = o2 == 0 ? kvoVar3 : o2;
        exq exqVar6 = p2Var.f;
        y7l y7lVar = o2.r;
        kvo kvoVar5 = o2.c;
        ?? n = xcx.n(yf90Var, exqVar6, jSONObject, "animation_duration", tmsVar, tlsVar3, y7lVar, kvoVar5);
        kvo kvoVar6 = n == 0 ? kvoVar5 : n;
        exq exqVar7 = p2Var.g;
        qkj qkjVar2 = o2.m;
        tls tlsVar4 = DivTabs$TabTitleStyle.AnimationType.FROM_STRING;
        kvo kvoVar7 = o2.d;
        ?? o3 = xcx.o(yf90Var, exqVar7, jSONObject, "animation_type", qkjVar2, tlsVar4, kvoVar7);
        kvo kvoVar8 = o3 == 0 ? kvoVar7 : o3;
        Expression m2 = xcx.m(yf90Var, p2Var.h, jSONObject, "corner_radius", tmsVar, tlsVar3, o2.s);
        exq exqVar8 = p2Var.i;
        JsonParserComponent jsonParserComponent = this.a;
        jkk jkkVar = (jkk) xcx.h(yf90Var, exqVar8, jSONObject, "corners_radius", jsonParserComponent.D2, jsonParserComponent.B2);
        Expression k2 = xcx.k(yf90Var, p2Var.j, jSONObject, "font_family", wm11.c);
        exq exqVar9 = p2Var.k;
        y7l y7lVar2 = o2.t;
        kvo kvoVar9 = o2.e;
        ?? n2 = xcx.n(yf90Var, exqVar9, jSONObject, "font_size", tmsVar, tlsVar3, y7lVar2, kvoVar9);
        kvo kvoVar10 = n2 == 0 ? kvoVar9 : n2;
        exq exqVar10 = p2Var.l;
        qkj qkjVar3 = o2.n;
        tls tlsVar5 = DivSizeUnit.FROM_STRING;
        kvo kvoVar11 = o2.f;
        ?? o4 = xcx.o(yf90Var, exqVar10, jSONObject, "font_size_unit", qkjVar3, tlsVar5, kvoVar11);
        kvo kvoVar12 = o4 == 0 ? kvoVar11 : o4;
        exq exqVar11 = p2Var.m;
        qkj qkjVar4 = o2.o;
        kvo kvoVar13 = o2.g;
        ?? o5 = xcx.o(yf90Var, exqVar11, jSONObject, FontsContractCompat$Columns.WEIGHT, qkjVar4, tlsVar2, kvoVar13);
        kvo kvoVar14 = o5 == 0 ? kvoVar13 : o5;
        Expression l2 = xcx.l(yf90Var, p2Var.n, jSONObject, "inactive_background_color", rmsVar, tlsVar);
        Expression k3 = xcx.k(yf90Var, p2Var.o, jSONObject, "inactive_font_variation_settings", yo40Var);
        Expression l3 = xcx.l(yf90Var, p2Var.p, jSONObject, "inactive_font_weight", o2.p, tlsVar2);
        Expression m3 = xcx.m(yf90Var, p2Var.q, jSONObject, "inactive_font_weight_value", tmsVar, tlsVar3, o2.u);
        exq exqVar12 = p2Var.r;
        kvo kvoVar15 = o2.h;
        ?? o6 = xcx.o(yf90Var, exqVar12, jSONObject, "inactive_text_color", rmsVar, tlsVar, kvoVar15);
        kvo kvoVar16 = o6 == 0 ? kvoVar15 : o6;
        exq exqVar13 = p2Var.s;
        y7l y7lVar3 = o2.v;
        kvo kvoVar17 = o2.i;
        ?? n3 = xcx.n(yf90Var, exqVar13, jSONObject, "item_spacing", tmsVar, tlsVar3, y7lVar3, kvoVar17);
        if (n3 != 0) {
            kvoVar17 = n3;
        }
        exq exqVar14 = p2Var.t;
        sms smsVar = wm11.d;
        tls tlsVar6 = com.yandex.div.internal.parser.b.g;
        kvo kvoVar18 = o2.j;
        ?? o7 = xcx.o(yf90Var, exqVar14, jSONObject, "letter_spacing", smsVar, tlsVar6, kvoVar18);
        kvo kvoVar19 = o7 == 0 ? kvoVar18 : o7;
        Expression m4 = xcx.m(yf90Var, p2Var.u, jSONObject, "line_height", tmsVar, tlsVar3, o2.w);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, p2Var.v, jSONObject, "paddings", jsonParserComponent.i3, jsonParserComponent.g3);
        if (divEdgeInsets == null) {
            divEdgeInsets = o2.k;
        }
        return new DivTabs$TabTitleStyle(kvoVar2, k, l, m, kvoVar4, kvoVar6, kvoVar8, m2, jkkVar, k2, kvoVar10, kvoVar12, kvoVar14, l2, k3, l3, m3, kvoVar16, kvoVar17, kvoVar19, m4, divEdgeInsets);
    }
}
