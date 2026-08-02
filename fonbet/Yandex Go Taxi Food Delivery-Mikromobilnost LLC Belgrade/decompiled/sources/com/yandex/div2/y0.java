package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivIndicator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.i3y;
import defpackage.k7l;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.nyi;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.rms;
import defpackage.sms;
import defpackage.sqk;
import defpackage.t8l;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.wtk;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zrk;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y0 implements zsq0, nyi {
    public final JsonParserComponent a;

    public y0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v46, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v77, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final DivIndicator a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        i3y i3yVar6 = jsonParserComponent.K6;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kvo kvoVar = b1.a;
        kbs kbsVar = q5z.b;
        ?? e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "active_item_color", rmsVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        sms smsVar = wm11.d;
        tls tlsVar2 = com.yandex.div.internal.parser.b.g;
        zrk zrkVar = b1.p;
        kvo kvoVar3 = b1.b;
        ?? e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "active_item_size", smsVar, tlsVar2, zrkVar, kvoVar3);
        kvo kvoVar4 = e2 == 0 ? kvoVar3 : e2;
        k7l k7lVar = (k7l) wwg.M(yf90Var, jSONObject, "active_shape", i3yVar6);
        Expression e3 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_horizontal", b1.l, DivAlignmentHorizontal.FROM_STRING, kbsVar, null);
        Expression e4 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_vertical", b1.m, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        zrk zrkVar2 = b1.q;
        kvo kvoVar5 = b1.c;
        ?? e5 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, zrkVar2, kvoVar5);
        kvo kvoVar6 = e5 == 0 ? kvoVar5 : e5;
        qkj qkjVar = b1.n;
        tls tlsVar3 = DivIndicator.Animation.FROM_STRING;
        kvo kvoVar7 = b1.d;
        ?? e6 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "animation", qkjVar, tlsVar3, kbsVar, kvoVar7);
        kvo kvoVar8 = e6 == 0 ? kvoVar7 : e6;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar4 = com.yandex.div.internal.parser.b.h;
        Expression e7 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar4, b1.r, null);
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = b1.e;
        }
        DivSize divSize2 = divSize;
        Object opt = jSONObject.opt("id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        kvo kvoVar9 = b1.f;
        ?? e8 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "inactive_item_color", rmsVar, tlsVar, kbsVar, kvoVar9);
        kvo kvoVar10 = e8 == 0 ? kvoVar9 : e8;
        k7l k7lVar2 = (k7l) wwg.M(yf90Var, jSONObject, "inactive_minimum_shape", i3yVar6);
        k7l k7lVar3 = (k7l) wwg.M(yf90Var, jSONObject, "inactive_shape", i3yVar6);
        wtk wtkVar = (wtk) wwg.M(yf90Var, jSONObject, "items_placement", jsonParserComponent.l4);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        zrk zrkVar3 = b1.s;
        kvo kvoVar11 = b1.g;
        ?? e9 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "minimum_item_size", smsVar, tlsVar2, zrkVar3, kvoVar11);
        kvo kvoVar12 = e9 == 0 ? kvoVar11 : e9;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        Object opt2 = jSONObject.opt("pager_id");
        if (opt2 == obj) {
            opt2 = null;
        }
        String str2 = (String) (opt2 != null ? opt2 : null);
        Expression e10 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e11 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar4, b1.t, null);
        List O6 = wwg.O(yf90Var, jSONObject, "selected_actions", jsonParserComponent.t1);
        t8l t8lVar = (t8l) wwg.M(yf90Var, jSONObject, "shape", jsonParserComponent.i7);
        if (t8lVar == null) {
            t8lVar = b1.h;
        }
        t8l t8lVar2 = t8lVar;
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "space_between_centers", jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = b1.i;
        }
        sqk sqkVar2 = sqkVar;
        List O7 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O8 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, b1.u);
        List O9 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O10 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar2 = b1.o;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar13 = b1.j;
        ?? e12 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "visibility", qkjVar2, tlsVar5, kbsVar, kvoVar13);
        if (e12 != 0) {
            kvoVar13 = e12;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O11 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = b1.k;
        }
        return new DivIndicator(divAccessibility, kvoVar2, kvoVar4, k7lVar, e3, e4, kvoVar6, kvoVar8, O, O2, divBorder, e7, O3, O4, divFocus, O5, divSize2, str, kvoVar10, k7lVar2, k7lVar3, wtkVar, divLayoutProvider, divEdgeInsets, kvoVar12, divEdgeInsets2, str2, e10, e11, O6, t8lVar2, sqkVar2, O7, divTransform, O8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O9, O10, kvoVar13, divVisibilityAction, O11, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivIndicator divIndicator) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = divIndicator.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        Expression expression = divIndicator.b;
        tls tlsVar = com.yandex.div.internal.parser.b.a;
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "active_item_color", expression, tlsVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "active_item_size", divIndicator.c);
        k7l k7lVar = divIndicator.d;
        i3y i3yVar = jsonParserComponent.K6;
        wwg.b0(yf90Var, jSONObject, "active_shape", k7lVar, i3yVar);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_horizontal", divIndicator.e, DivAlignmentHorizontal.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_vertical", divIndicator.f, DivAlignmentVertical.TO_STRING);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, divIndicator.g);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "animation", divIndicator.h, DivIndicator.Animation.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "animators", divIndicator.i, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, divIndicator.j, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", divIndicator.k, jsonParserComponent.U1);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "column_span", divIndicator.l);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", divIndicator.m, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "extensions", divIndicator.n, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", divIndicator.o, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", divIndicator.p, jsonParserComponent.T3);
        DivSize divSize = divIndicator.q;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.Z(yf90Var, jSONObject, "id", divIndicator.r);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "inactive_item_color", divIndicator.s, tlsVar);
        wwg.b0(yf90Var, jSONObject, "inactive_minimum_shape", divIndicator.t, i3yVar);
        wwg.b0(yf90Var, jSONObject, "inactive_shape", divIndicator.u, i3yVar);
        wwg.b0(yf90Var, jSONObject, "items_placement", divIndicator.v, jsonParserComponent.l4);
        wwg.b0(yf90Var, jSONObject, "layout_provider", divIndicator.w, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = divIndicator.x;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "minimum_item_size", divIndicator.y);
        wwg.b0(yf90Var, jSONObject, "paddings", divIndicator.z, i3yVar3);
        wwg.Z(yf90Var, jSONObject, "pager_id", divIndicator.A);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "reuse_id", divIndicator.B);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "row_span", divIndicator.C);
        wwg.c0(yf90Var, jSONObject, "selected_actions", divIndicator.D, jsonParserComponent.t1);
        wwg.b0(yf90Var, jSONObject, "shape", divIndicator.E, jsonParserComponent.i7);
        wwg.b0(yf90Var, jSONObject, "space_between_centers", divIndicator.F, jsonParserComponent.E3);
        wwg.c0(yf90Var, jSONObject, "tooltips", divIndicator.G, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", divIndicator.H, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", divIndicator.I, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", divIndicator.J, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = divIndicator.K;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", divIndicator.L, i3yVar4);
        wwg.d0(yf90Var, jSONObject, divIndicator.M, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "indicator");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", divIndicator.N, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", divIndicator.O, jsonParserComponent.F9);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "visibility", divIndicator.P, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = divIndicator.Q;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", divIndicator.R, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", divIndicator.S, i3yVar2);
        return jSONObject;
    }
}
