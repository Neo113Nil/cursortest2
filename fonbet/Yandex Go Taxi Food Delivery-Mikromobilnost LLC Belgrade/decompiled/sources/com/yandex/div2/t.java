package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivContainer;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.afk;
import defpackage.dac;
import defpackage.i3y;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.nyi;
import defpackage.pdk;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.sms;
import defpackage.tls;
import defpackage.tms;
import defpackage.v3k;
import defpackage.vjk;
import defpackage.wm11;
import defpackage.wms;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t implements zsq0, nyi {
    public final JsonParserComponent a;

    public t(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v56, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v61, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v85, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final DivContainer a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.y2;
        i3y i3yVar6 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        i3y i3yVar7 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) wwg.M(yf90Var, jSONObject, "action", i3yVar7);
        pdk pdkVar = (pdk) wwg.M(yf90Var, jSONObject, "action_animation", jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = w.a;
        }
        pdk pdkVar2 = pdkVar;
        List O = wwg.O(yf90Var, jSONObject, "actions", i3yVar7);
        qkj qkjVar = w.n;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_vertical", w.o, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = com.yandex.div.internal.parser.b.g;
        dac dacVar = w.u;
        kvo kvoVar = w.b;
        ?? e3 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, dacVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O2 = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        afk afkVar = (afk) wwg.M(yf90Var, jSONObject, "aspect", jsonParserComponent.L1);
        List O3 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        wms wmsVar = wm11.a;
        tls tlsVar3 = com.yandex.div.internal.parser.b.f;
        kvo kvoVar3 = w.c;
        ?? e4 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "capture_focus_on_action", wmsVar, tlsVar3, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        kvo kvoVar5 = w.d;
        ?? e5 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "clip_to_bounds", wmsVar, tlsVar3, kbsVar, kvoVar5);
        kvo kvoVar6 = e5 == 0 ? kvoVar5 : e5;
        tms tmsVar = wm11.b;
        tls tlsVar4 = com.yandex.div.internal.parser.b.h;
        Expression e6 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar4, w.v, null);
        qkj qkjVar2 = w.p;
        tls tlsVar5 = DivContentAlignmentHorizontal.FROM_STRING;
        kvo kvoVar7 = w.e;
        ?? e7 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "content_alignment_horizontal", qkjVar2, tlsVar5, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        qkj qkjVar3 = w.q;
        tls tlsVar6 = DivContentAlignmentVertical.FROM_STRING;
        kvo kvoVar9 = w.f;
        ?? e8 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "content_alignment_vertical", qkjVar3, tlsVar6, kbsVar, kvoVar9);
        kvo kvoVar10 = e8 == 0 ? kvoVar9 : e8;
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O5 = wwg.O(yf90Var, jSONObject, "doubletap_actions", i3yVar7);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O7 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar6);
        if (divSize == null) {
            divSize = w.g;
        }
        DivSize divSize2 = divSize;
        List O8 = wwg.O(yf90Var, jSONObject, "hover_end_actions", i3yVar7);
        List O9 = wwg.O(yf90Var, jSONObject, "hover_start_actions", i3yVar7);
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) wwg.M(yf90Var, jSONObject, "item_builder", jsonParserComponent.m2);
        dac dacVar2 = w.w;
        kvo kvoVar11 = w.h;
        ?? e9 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "item_spacing", tmsVar, tlsVar4, dacVar2, kvoVar11);
        kvo kvoVar12 = e9 == 0 ? kvoVar11 : e9;
        List O10 = wwg.O(yf90Var, jSONObject, "items", jsonParserComponent.X9);
        qkj qkjVar4 = w.r;
        tls tlsVar7 = DivContainer.LayoutMode.FROM_STRING;
        kvo kvoVar13 = w.i;
        ?? e10 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "layout_mode", qkjVar4, tlsVar7, kbsVar, kvoVar13);
        kvo kvoVar14 = e10 == 0 ? kvoVar13 : e10;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        vjk vjkVar = (vjk) wwg.M(yf90Var, jSONObject, "line_separator", i3yVar5);
        dac dacVar3 = w.x;
        kvo kvoVar15 = w.j;
        ?? e11 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "line_spacing", tmsVar, tlsVar4, dacVar3, kvoVar15);
        kvo kvoVar16 = e11 == 0 ? kvoVar15 : e11;
        List O11 = wwg.O(yf90Var, jSONObject, "longtap_actions", i3yVar7);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        qkj qkjVar5 = w.s;
        tls tlsVar8 = DivContainer.Orientation.FROM_STRING;
        kvo kvoVar17 = w.k;
        ?? e12 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "orientation", qkjVar5, tlsVar8, kbsVar, kvoVar17);
        kvo kvoVar18 = e12 == 0 ? kvoVar17 : e12;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        List O12 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar7);
        List O13 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar7);
        Expression e13 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e14 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar4, w.y, null);
        List O14 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar7);
        vjk vjkVar2 = (vjk) wwg.M(yf90Var, jSONObject, "separator", i3yVar5);
        List O15 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O16 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, w.z);
        List O17 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O18 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar6 = w.t;
        tls tlsVar9 = DivVisibility.FROM_STRING;
        kvo kvoVar19 = w.l;
        ?? e15 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "visibility", qkjVar6, tlsVar9, kbsVar, kvoVar19);
        if (e15 != 0) {
            kvoVar19 = e15;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O19 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar6);
        if (divSize3 == null) {
            divSize3 = w.m;
        }
        return new DivContainer(divAccessibility, v3kVar, pdkVar2, O, e, e2, kvoVar2, O2, afkVar, O3, divBorder, kvoVar4, kvoVar6, e6, kvoVar8, kvoVar10, O4, O5, O6, divFocus, O7, divSize2, O8, O9, str, divCollectionItemBuilder, kvoVar12, O10, kvoVar14, divLayoutProvider, vjkVar, kvoVar16, O11, divEdgeInsets, kvoVar18, divEdgeInsets2, O12, O13, e13, e14, O14, vjkVar2, O15, divTransform, O16, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O17, O18, kvoVar19, divVisibilityAction, O19, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivContainer divContainer) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = divContainer.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        v3k v3kVar = divContainer.b;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, i3yVar);
        wwg.b0(yf90Var, jSONObject, "action_animation", divContainer.c, jsonParserComponent.z1);
        wwg.c0(yf90Var, jSONObject, "actions", divContainer.d, i3yVar);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_horizontal", divContainer.e, DivAlignmentHorizontal.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_vertical", divContainer.f, DivAlignmentVertical.TO_STRING);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, divContainer.g);
        wwg.c0(yf90Var, jSONObject, "animators", divContainer.h, jsonParserComponent.C1);
        wwg.b0(yf90Var, jSONObject, "aspect", divContainer.i, jsonParserComponent.L1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, divContainer.j, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", divContainer.k, jsonParserComponent.U1);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "capture_focus_on_action", divContainer.l);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "clip_to_bounds", divContainer.m);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "column_span", divContainer.n);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "content_alignment_horizontal", divContainer.o, DivContentAlignmentHorizontal.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "content_alignment_vertical", divContainer.p, DivContentAlignmentVertical.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", divContainer.q, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "doubletap_actions", divContainer.r, i3yVar);
        wwg.c0(yf90Var, jSONObject, "extensions", divContainer.s, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", divContainer.t, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", divContainer.u, jsonParserComponent.T3);
        DivSize divSize = divContainer.v;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "hover_end_actions", divContainer.w, i3yVar);
        wwg.c0(yf90Var, jSONObject, "hover_start_actions", divContainer.x, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", divContainer.y);
        wwg.b0(yf90Var, jSONObject, "item_builder", divContainer.z, jsonParserComponent.m2);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "item_spacing", divContainer.A);
        wwg.c0(yf90Var, jSONObject, "items", divContainer.B, jsonParserComponent.X9);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "layout_mode", divContainer.C, DivContainer.LayoutMode.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "layout_provider", divContainer.D, jsonParserComponent.X4);
        vjk vjkVar = divContainer.E;
        i3y i3yVar3 = jsonParserComponent.y2;
        wwg.b0(yf90Var, jSONObject, "line_separator", vjkVar, i3yVar3);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "line_spacing", divContainer.F);
        wwg.c0(yf90Var, jSONObject, "longtap_actions", divContainer.G, i3yVar);
        DivEdgeInsets divEdgeInsets = divContainer.H;
        i3y i3yVar4 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar4);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "orientation", divContainer.I, DivContainer.Orientation.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "paddings", divContainer.J, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "press_end_actions", divContainer.K, i3yVar);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", divContainer.L, i3yVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "reuse_id", divContainer.M);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "row_span", divContainer.N);
        wwg.c0(yf90Var, jSONObject, "selected_actions", divContainer.O, i3yVar);
        wwg.b0(yf90Var, jSONObject, "separator", divContainer.P, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "tooltips", divContainer.Q, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", divContainer.R, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", divContainer.S, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", divContainer.T, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = divContainer.U;
        i3y i3yVar5 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "transition_out", divContainer.V, i3yVar5);
        wwg.d0(yf90Var, jSONObject, divContainer.W, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "container");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", divContainer.X, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", divContainer.Y, jsonParserComponent.F9);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "visibility", divContainer.Z, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = divContainer.a0;
        i3y i3yVar6 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar6);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", divContainer.b0, i3yVar6);
        wwg.b0(yf90Var, jSONObject, "width", divContainer.c0, i3yVar2);
        return jSONObject;
    }
}
