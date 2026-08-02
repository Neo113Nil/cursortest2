package com.yandex.div2;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.abl0;
import defpackage.jkk;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.nyi;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.rms;
import defpackage.sms;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.wwg;
import defpackage.y7l;
import defpackage.yf90;
import defpackage.yo40;
import defpackage.zsq0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l2 implements zsq0, nyi {
    public final JsonParserComponent a;

    public l2(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kvo kvoVar = o2.a;
        kbs kbsVar = q5z.b;
        ?? e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "active_background_color", rmsVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        yo40 yo40Var = wm11.h;
        abl0 abl0Var = q5z.c;
        Expression e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "active_font_variation_settings", yo40Var, abl0Var, kbsVar, null);
        qkj qkjVar = o2.l;
        tls tlsVar2 = DivFontWeight.FROM_STRING;
        Expression e3 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "active_font_weight", qkjVar, tlsVar2, kbsVar, null);
        tms tmsVar = wm11.b;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        Expression e4 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "active_font_weight_value", tmsVar, tlsVar3, o2.q, null);
        kvo kvoVar3 = o2.b;
        ?? e5 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "active_text_color", rmsVar, tlsVar, kbsVar, kvoVar3);
        kvo kvoVar4 = e5 == 0 ? kvoVar3 : e5;
        y7l y7lVar = o2.r;
        kvo kvoVar5 = o2.c;
        ?? e6 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "animation_duration", tmsVar, tlsVar3, y7lVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        qkj qkjVar2 = o2.m;
        tls tlsVar4 = DivTabs$TabTitleStyle.AnimationType.FROM_STRING;
        kvo kvoVar7 = o2.d;
        ?? e7 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "animation_type", qkjVar2, tlsVar4, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        Expression e8 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "corner_radius", tmsVar, tlsVar3, o2.s, null);
        JsonParserComponent jsonParserComponent = this.a;
        jkk jkkVar = (jkk) wwg.M(yf90Var, jSONObject, "corners_radius", jsonParserComponent.B2);
        Expression e9 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "font_family", wm11.c, abl0Var, kbsVar, null);
        y7l y7lVar2 = o2.t;
        kvo kvoVar9 = o2.e;
        ?? e10 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "font_size", tmsVar, tlsVar3, y7lVar2, kvoVar9);
        kvo kvoVar10 = e10 == 0 ? kvoVar9 : e10;
        qkj qkjVar3 = o2.n;
        tls tlsVar5 = DivSizeUnit.FROM_STRING;
        kvo kvoVar11 = o2.f;
        ?? e11 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "font_size_unit", qkjVar3, tlsVar5, kbsVar, kvoVar11);
        kvo kvoVar12 = e11 == 0 ? kvoVar11 : e11;
        qkj qkjVar4 = o2.o;
        kvo kvoVar13 = o2.g;
        ?? e12 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, qkjVar4, tlsVar2, kbsVar, kvoVar13);
        kvo kvoVar14 = e12 == 0 ? kvoVar13 : e12;
        Expression e13 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "inactive_background_color", rmsVar, tlsVar, kbsVar, null);
        Expression e14 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "inactive_font_variation_settings", yo40Var, abl0Var, kbsVar, null);
        Expression e15 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "inactive_font_weight", o2.p, tlsVar2, kbsVar, null);
        Expression e16 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "inactive_font_weight_value", tmsVar, tlsVar3, o2.u, null);
        kvo kvoVar15 = o2.h;
        ?? e17 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "inactive_text_color", rmsVar, tlsVar, kbsVar, kvoVar15);
        kvo kvoVar16 = e17 == 0 ? kvoVar15 : e17;
        y7l y7lVar3 = o2.v;
        kvo kvoVar17 = o2.i;
        ?? e18 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "item_spacing", tmsVar, tlsVar3, y7lVar3, kvoVar17);
        kvo kvoVar18 = e18 == 0 ? kvoVar17 : e18;
        sms smsVar = wm11.d;
        tls tlsVar6 = com.yandex.div.internal.parser.b.g;
        kvo kvoVar19 = o2.j;
        ?? e19 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "letter_spacing", smsVar, tlsVar6, kbsVar, kvoVar19);
        kvo kvoVar20 = e19 == 0 ? kvoVar19 : e19;
        Expression e20 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "line_height", tmsVar, tlsVar3, o2.w, null);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", jsonParserComponent.g3);
        if (divEdgeInsets == null) {
            divEdgeInsets = o2.k;
        }
        return new DivTabs$TabTitleStyle(kvoVar2, e2, e3, e4, kvoVar4, kvoVar6, kvoVar8, e8, jkkVar, e9, kvoVar10, kvoVar12, kvoVar14, e13, e14, e15, e16, kvoVar16, kvoVar18, kvoVar20, e20, divEdgeInsets);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivTabs$TabTitleStyle divTabs$TabTitleStyle) {
        JSONObject jSONObject = new JSONObject();
        Expression expression = divTabs$TabTitleStyle.a;
        tls tlsVar = com.yandex.div.internal.parser.b.a;
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "active_background_color", expression, tlsVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "active_font_variation_settings", divTabs$TabTitleStyle.b);
        Expression expression2 = divTabs$TabTitleStyle.c;
        tls tlsVar2 = DivFontWeight.TO_STRING;
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "active_font_weight", expression2, tlsVar2);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "active_font_weight_value", divTabs$TabTitleStyle.d);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "active_text_color", divTabs$TabTitleStyle.e, tlsVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "animation_duration", divTabs$TabTitleStyle.f);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "animation_type", divTabs$TabTitleStyle.g, DivTabs$TabTitleStyle.AnimationType.TO_STRING);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "corner_radius", divTabs$TabTitleStyle.h);
        jkk jkkVar = divTabs$TabTitleStyle.i;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "corners_radius", jkkVar, jsonParserComponent.B2);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "font_family", divTabs$TabTitleStyle.j);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "font_size", divTabs$TabTitleStyle.k);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "font_size_unit", divTabs$TabTitleStyle.l, DivSizeUnit.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, divTabs$TabTitleStyle.m, tlsVar2);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "inactive_background_color", divTabs$TabTitleStyle.n, tlsVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "inactive_font_variation_settings", divTabs$TabTitleStyle.o);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "inactive_font_weight", divTabs$TabTitleStyle.p, tlsVar2);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "inactive_font_weight_value", divTabs$TabTitleStyle.q);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "inactive_text_color", divTabs$TabTitleStyle.r, tlsVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "item_spacing", divTabs$TabTitleStyle.s);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "letter_spacing", divTabs$TabTitleStyle.t);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "line_height", divTabs$TabTitleStyle.u);
        wwg.b0(yf90Var, jSONObject, "paddings", divTabs$TabTitleStyle.v, jsonParserComponent.g3);
        return jSONObject;
    }
}
