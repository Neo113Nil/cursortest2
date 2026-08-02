package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivIndicator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.abl0;
import defpackage.exq;
import defpackage.i3y;
import defpackage.k7l;
import defpackage.kvo;
import defpackage.q5z;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.rms;
import defpackage.sms;
import defpackage.sqk;
import defpackage.t8l;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.wtk;
import defpackage.xcx;
import defpackage.yf90;
import defpackage.zrk;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a1 implements qfy0 {
    public final JsonParserComponent a;

    public a1(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v43, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v73, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivIndicator a(yf90 yf90Var, c1 c1Var, JSONObject jSONObject) {
        exq exqVar = c1Var.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.J;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.T9;
        i3y i3yVar4 = jsonParserComponent.I1;
        i3y i3yVar5 = jsonParserComponent.K1;
        i3y i3yVar6 = jsonParserComponent.g3;
        i3y i3yVar7 = jsonParserComponent.i3;
        i3y i3yVar8 = jsonParserComponent.o7;
        i3y i3yVar9 = jsonParserComponent.q7;
        i3y i3yVar10 = jsonParserComponent.K6;
        i3y i3yVar11 = jsonParserComponent.M6;
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, jsonParserComponent.H);
        exq exqVar2 = c1Var.b;
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kvo kvoVar = b1.a;
        ?? o = xcx.o(yf90Var, exqVar2, jSONObject, "active_item_color", rmsVar, tlsVar, kvoVar);
        kvo kvoVar2 = o == 0 ? kvoVar : o;
        exq exqVar3 = c1Var.c;
        sms smsVar = wm11.d;
        tls tlsVar2 = com.yandex.div.internal.parser.b.g;
        zrk zrkVar = b1.p;
        kvo kvoVar3 = b1.b;
        ?? n = xcx.n(yf90Var, exqVar3, jSONObject, "active_item_size", smsVar, tlsVar2, zrkVar, kvoVar3);
        kvo kvoVar4 = n == 0 ? kvoVar3 : n;
        k7l k7lVar = (k7l) xcx.h(yf90Var, c1Var.d, jSONObject, "active_shape", i3yVar11, i3yVar10);
        Expression l = xcx.l(yf90Var, c1Var.e, jSONObject, "alignment_horizontal", b1.l, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, c1Var.f, jSONObject, "alignment_vertical", b1.m, DivAlignmentVertical.FROM_STRING);
        exq exqVar4 = c1Var.g;
        zrk zrkVar2 = b1.q;
        kvo kvoVar5 = b1.c;
        ?? n2 = xcx.n(yf90Var, exqVar4, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, zrkVar2, kvoVar5);
        kvo kvoVar6 = n2 == 0 ? kvoVar5 : n2;
        exq exqVar5 = c1Var.h;
        qkj qkjVar = b1.n;
        tls tlsVar3 = DivIndicator.Animation.FROM_STRING;
        kvo kvoVar7 = b1.d;
        ?? o2 = xcx.o(yf90Var, exqVar5, jSONObject, "animation", qkjVar, tlsVar3, kvoVar7);
        kvo kvoVar8 = o2 == 0 ? kvoVar7 : o2;
        List s = xcx.s(yf90Var, c1Var.i, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, c1Var.j, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, c1Var.k, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar6 = c1Var.l;
        tms tmsVar = wm11.b;
        tls tlsVar4 = com.yandex.div.internal.parser.b.h;
        Expression m = xcx.m(yf90Var, exqVar6, jSONObject, "column_span", tmsVar, tlsVar4, b1.r);
        List s3 = xcx.s(yf90Var, c1Var.m, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, c1Var.n, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, c1Var.o, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s5 = xcx.s(yf90Var, c1Var.p, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, c1Var.q, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = b1.e;
        }
        DivSize divSize2 = divSize;
        exq exqVar7 = c1Var.r;
        abl0 abl0Var = q5z.c;
        String str = (String) xcx.i(exqVar7, abl0Var, yf90Var, "id", jSONObject);
        exq exqVar8 = c1Var.s;
        kvo kvoVar9 = b1.f;
        ?? o3 = xcx.o(yf90Var, exqVar8, jSONObject, "inactive_item_color", rmsVar, tlsVar, kvoVar9);
        kvo kvoVar10 = o3 == 0 ? kvoVar9 : o3;
        k7l k7lVar2 = (k7l) xcx.h(yf90Var, c1Var.t, jSONObject, "inactive_minimum_shape", i3yVar11, i3yVar10);
        k7l k7lVar3 = (k7l) xcx.h(yf90Var, c1Var.u, jSONObject, "inactive_shape", i3yVar11, i3yVar10);
        wtk wtkVar = (wtk) xcx.h(yf90Var, c1Var.v, jSONObject, "items_placement", jsonParserComponent.n4, jsonParserComponent.l4);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, c1Var.w, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, c1Var.x, jSONObject, "margins", i3yVar7, i3yVar6);
        exq exqVar9 = c1Var.y;
        zrk zrkVar3 = b1.s;
        kvo kvoVar11 = b1.g;
        ?? n3 = xcx.n(yf90Var, exqVar9, jSONObject, "minimum_item_size", smsVar, tlsVar2, zrkVar3, kvoVar11);
        kvo kvoVar12 = n3 == 0 ? kvoVar11 : n3;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, c1Var.z, jSONObject, "paddings", i3yVar7, i3yVar6);
        String str2 = (String) xcx.i(c1Var.A, abl0Var, yf90Var, "pager_id", jSONObject);
        Expression k = xcx.k(yf90Var, c1Var.B, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, c1Var.C, jSONObject, "row_span", tmsVar, tlsVar4, b1.t);
        List s6 = xcx.s(yf90Var, c1Var.D, jSONObject, "selected_actions", jsonParserComponent.v1, jsonParserComponent.t1);
        t8l t8lVar = (t8l) xcx.h(yf90Var, c1Var.E, jSONObject, "shape", jsonParserComponent.k7, jsonParserComponent.i7);
        if (t8lVar == null) {
            t8lVar = b1.h;
        }
        t8l t8lVar2 = t8lVar;
        sqk sqkVar = (sqk) xcx.h(yf90Var, c1Var.F, jSONObject, "space_between_centers", jsonParserComponent.G3, jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = b1.i;
        }
        sqk sqkVar2 = sqkVar;
        List s7 = xcx.s(yf90Var, c1Var.G, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, c1Var.H, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s8 = xcx.s(yf90Var, c1Var.I, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, c1Var.J, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, c1Var.K, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, c1Var.L, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, c1Var.M, jSONObject, DivTransitionTrigger.FROM_STRING, b1.u);
        List s9 = xcx.s(yf90Var, c1Var.N, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s10 = xcx.s(yf90Var, c1Var.O, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar10 = c1Var.P;
        qkj qkjVar2 = b1.o;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar13 = b1.j;
        ?? o4 = xcx.o(yf90Var, exqVar10, jSONObject, "visibility", qkjVar2, tlsVar5, kvoVar13);
        if (o4 != 0) {
            kvoVar13 = o4;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, c1Var.Q, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s11 = xcx.s(yf90Var, c1Var.R, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, c1Var.S, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = b1.k;
        }
        return new DivIndicator(divAccessibility, kvoVar2, kvoVar4, k7lVar, l, l2, kvoVar6, kvoVar8, s, s2, divBorder, m, s3, s4, divFocus, s5, divSize2, str, kvoVar10, k7lVar2, k7lVar3, wtkVar, divLayoutProvider, divEdgeInsets, kvoVar12, divEdgeInsets2, str2, k, m2, s6, t8lVar2, sqkVar2, s7, divTransform, s8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s9, s10, kvoVar13, divVisibilityAction, s11, divSize3);
    }
}
