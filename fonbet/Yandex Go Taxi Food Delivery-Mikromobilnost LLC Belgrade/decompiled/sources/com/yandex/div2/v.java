package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivContainer;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.afk;
import defpackage.dac;
import defpackage.exq;
import defpackage.i3y;
import defpackage.kvo;
import defpackage.pdk;
import defpackage.q5z;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.sms;
import defpackage.tls;
import defpackage.tms;
import defpackage.v3k;
import defpackage.vjk;
import defpackage.wm11;
import defpackage.wms;
import defpackage.xcx;
import defpackage.yf90;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v implements qfy0 {
    public final JsonParserComponent a;

    public v(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v45, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v48, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v59, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v83, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivContainer a(yf90 yf90Var, x xVar, JSONObject jSONObject) {
        exq exqVar = xVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.J;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.T9;
        i3y i3yVar4 = jsonParserComponent.I1;
        i3y i3yVar5 = jsonParserComponent.K1;
        i3y i3yVar6 = jsonParserComponent.g3;
        i3y i3yVar7 = jsonParserComponent.i3;
        i3y i3yVar8 = jsonParserComponent.y2;
        i3y i3yVar9 = jsonParserComponent.A2;
        i3y i3yVar10 = jsonParserComponent.o7;
        i3y i3yVar11 = jsonParserComponent.q7;
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, jsonParserComponent.H);
        exq exqVar2 = xVar.b;
        i3y i3yVar12 = jsonParserComponent.v1;
        i3y i3yVar13 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) xcx.h(yf90Var, exqVar2, jSONObject, "action", i3yVar12, i3yVar13);
        pdk pdkVar = (pdk) xcx.h(yf90Var, xVar.c, jSONObject, "action_animation", jsonParserComponent.B1, jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = w.a;
        }
        pdk pdkVar2 = pdkVar;
        List s = xcx.s(yf90Var, xVar.d, jSONObject, "actions", i3yVar12, i3yVar13);
        Expression l = xcx.l(yf90Var, xVar.e, jSONObject, "alignment_horizontal", w.n, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, xVar.f, jSONObject, "alignment_vertical", w.o, DivAlignmentVertical.FROM_STRING);
        exq exqVar3 = xVar.g;
        sms smsVar = wm11.d;
        tls tlsVar = com.yandex.div.internal.parser.b.g;
        dac dacVar = w.u;
        kvo kvoVar = w.b;
        ?? n = xcx.n(yf90Var, exqVar3, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, dacVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s2 = xcx.s(yf90Var, xVar.h, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        afk afkVar = (afk) xcx.h(yf90Var, xVar.i, jSONObject, "aspect", jsonParserComponent.N1, jsonParserComponent.L1);
        List s3 = xcx.s(yf90Var, xVar.j, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, xVar.k, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar4 = xVar.l;
        wms wmsVar = wm11.a;
        tls tlsVar2 = com.yandex.div.internal.parser.b.f;
        kvo kvoVar3 = w.c;
        ?? o = xcx.o(yf90Var, exqVar4, jSONObject, "capture_focus_on_action", wmsVar, tlsVar2, kvoVar3);
        kvo kvoVar4 = o == 0 ? kvoVar3 : o;
        exq exqVar5 = xVar.m;
        kvo kvoVar5 = w.d;
        ?? o2 = xcx.o(yf90Var, exqVar5, jSONObject, "clip_to_bounds", wmsVar, tlsVar2, kvoVar5);
        kvo kvoVar6 = o2 == 0 ? kvoVar5 : o2;
        exq exqVar6 = xVar.n;
        tms tmsVar = wm11.b;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        Expression m = xcx.m(yf90Var, exqVar6, jSONObject, "column_span", tmsVar, tlsVar3, w.v);
        exq exqVar7 = xVar.o;
        qkj qkjVar = w.p;
        tls tlsVar4 = DivContentAlignmentHorizontal.FROM_STRING;
        kvo kvoVar7 = w.e;
        ?? o3 = xcx.o(yf90Var, exqVar7, jSONObject, "content_alignment_horizontal", qkjVar, tlsVar4, kvoVar7);
        kvo kvoVar8 = o3 == 0 ? kvoVar7 : o3;
        exq exqVar8 = xVar.p;
        qkj qkjVar2 = w.q;
        tls tlsVar5 = DivContentAlignmentVertical.FROM_STRING;
        kvo kvoVar9 = w.f;
        ?? o4 = xcx.o(yf90Var, exqVar8, jSONObject, "content_alignment_vertical", qkjVar2, tlsVar5, kvoVar9);
        kvo kvoVar10 = o4 == 0 ? kvoVar9 : o4;
        List s4 = xcx.s(yf90Var, xVar.q, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s5 = xcx.s(yf90Var, xVar.r, jSONObject, "doubletap_actions", i3yVar12, i3yVar13);
        List s6 = xcx.s(yf90Var, xVar.s, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, xVar.t, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s7 = xcx.s(yf90Var, xVar.u, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, xVar.v, jSONObject, "height", i3yVar11, i3yVar10);
        if (divSize == null) {
            divSize = w.g;
        }
        DivSize divSize2 = divSize;
        List s8 = xcx.s(yf90Var, xVar.w, jSONObject, "hover_end_actions", i3yVar12, i3yVar13);
        List s9 = xcx.s(yf90Var, xVar.x, jSONObject, "hover_start_actions", i3yVar12, i3yVar13);
        String str = (String) xcx.i(xVar.y, q5z.c, yf90Var, "id", jSONObject);
        DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) xcx.h(yf90Var, xVar.z, jSONObject, "item_builder", jsonParserComponent.o2, jsonParserComponent.m2);
        exq exqVar9 = xVar.A;
        dac dacVar2 = w.w;
        kvo kvoVar11 = w.h;
        ?? n2 = xcx.n(yf90Var, exqVar9, jSONObject, "item_spacing", tmsVar, tlsVar3, dacVar2, kvoVar11);
        kvo kvoVar12 = n2 == 0 ? kvoVar11 : n2;
        List s10 = xcx.s(yf90Var, xVar.B, jSONObject, "items", jsonParserComponent.Z9, jsonParserComponent.X9);
        exq exqVar10 = xVar.C;
        qkj qkjVar3 = w.r;
        tls tlsVar6 = DivContainer.LayoutMode.FROM_STRING;
        kvo kvoVar13 = w.i;
        ?? o5 = xcx.o(yf90Var, exqVar10, jSONObject, "layout_mode", qkjVar3, tlsVar6, kvoVar13);
        kvo kvoVar14 = o5 == 0 ? kvoVar13 : o5;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, xVar.D, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        vjk vjkVar = (vjk) xcx.h(yf90Var, xVar.E, jSONObject, "line_separator", i3yVar9, i3yVar8);
        exq exqVar11 = xVar.F;
        dac dacVar3 = w.x;
        kvo kvoVar15 = w.j;
        ?? n3 = xcx.n(yf90Var, exqVar11, jSONObject, "line_spacing", tmsVar, tlsVar3, dacVar3, kvoVar15);
        if (n3 != 0) {
            kvoVar15 = n3;
        }
        List s11 = xcx.s(yf90Var, xVar.G, jSONObject, "longtap_actions", i3yVar12, i3yVar13);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, xVar.H, jSONObject, "margins", i3yVar7, i3yVar6);
        exq exqVar12 = xVar.I;
        qkj qkjVar4 = w.s;
        tls tlsVar7 = DivContainer.Orientation.FROM_STRING;
        kvo kvoVar16 = w.k;
        ?? o6 = xcx.o(yf90Var, exqVar12, jSONObject, "orientation", qkjVar4, tlsVar7, kvoVar16);
        kvo kvoVar17 = o6 == 0 ? kvoVar16 : o6;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, xVar.J, jSONObject, "paddings", i3yVar7, i3yVar6);
        List s12 = xcx.s(yf90Var, xVar.K, jSONObject, "press_end_actions", i3yVar12, i3yVar13);
        List s13 = xcx.s(yf90Var, xVar.L, jSONObject, "press_start_actions", i3yVar12, i3yVar13);
        Expression k = xcx.k(yf90Var, xVar.M, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, xVar.N, jSONObject, "row_span", tmsVar, tlsVar3, w.y);
        List s14 = xcx.s(yf90Var, xVar.O, jSONObject, "selected_actions", i3yVar12, i3yVar13);
        vjk vjkVar2 = (vjk) xcx.h(yf90Var, xVar.P, jSONObject, "separator", i3yVar9, i3yVar8);
        List s15 = xcx.s(yf90Var, xVar.Q, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, xVar.R, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s16 = xcx.s(yf90Var, xVar.S, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, xVar.T, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, xVar.U, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, xVar.V, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, xVar.W, jSONObject, DivTransitionTrigger.FROM_STRING, w.z);
        List s17 = xcx.s(yf90Var, xVar.X, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s18 = xcx.s(yf90Var, xVar.Y, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar13 = xVar.Z;
        qkj qkjVar5 = w.t;
        tls tlsVar8 = DivVisibility.FROM_STRING;
        kvo kvoVar18 = w.l;
        ?? o7 = xcx.o(yf90Var, exqVar13, jSONObject, "visibility", qkjVar5, tlsVar8, kvoVar18);
        if (o7 != 0) {
            kvoVar18 = o7;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, xVar.a0, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s19 = xcx.s(yf90Var, xVar.b0, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, xVar.c0, jSONObject, "width", i3yVar11, i3yVar10);
        if (divSize3 == null) {
            divSize3 = w.m;
        }
        return new DivContainer(divAccessibility, v3kVar, pdkVar2, s, l, l2, kvoVar2, s2, afkVar, s3, divBorder, kvoVar4, kvoVar6, m, kvoVar8, kvoVar10, s4, s5, s6, divFocus, s7, divSize2, s8, s9, str, divCollectionItemBuilder, kvoVar12, s10, kvoVar14, divLayoutProvider, vjkVar, kvoVar15, s11, divEdgeInsets, kvoVar17, divEdgeInsets2, s12, s13, k, m2, s14, vjkVar2, s15, divTransform, s16, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s17, s18, kvoVar18, divVisibilityAction, s19, divSize3);
    }
}
