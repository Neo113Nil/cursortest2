package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSeparator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
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
import defpackage.wm11;
import defpackage.wms;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zrk;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t1 implements zsq0, nyi {
    public final JsonParserComponent a;

    public t1(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v64, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final DivSeparator a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        i3y i3yVar6 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) wwg.M(yf90Var, jSONObject, "action", i3yVar6);
        pdk pdkVar = (pdk) wwg.M(yf90Var, jSONObject, "action_animation", jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = v1.a;
        }
        pdk pdkVar2 = pdkVar;
        List O = wwg.O(yf90Var, jSONObject, "actions", i3yVar6);
        qkj qkjVar = v1.g;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_vertical", v1.h, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = com.yandex.div.internal.parser.b.g;
        zrk zrkVar = v1.j;
        kvo kvoVar = v1.b;
        ?? e3 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, zrkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O2 = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O3 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        wms wmsVar = wm11.a;
        tls tlsVar3 = com.yandex.div.internal.parser.b.f;
        kvo kvoVar3 = v1.c;
        ?? e4 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "capture_focus_on_action", wmsVar, tlsVar3, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        tms tmsVar = wm11.b;
        tls tlsVar4 = com.yandex.div.internal.parser.b.h;
        Expression e5 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar4, v1.k, null);
        DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) wwg.M(yf90Var, jSONObject, "delimiter_style", jsonParserComponent.Z6);
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O5 = wwg.O(yf90Var, jSONObject, "doubletap_actions", i3yVar6);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O7 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = v1.d;
        }
        DivSize divSize2 = divSize;
        List O8 = wwg.O(yf90Var, jSONObject, "hover_end_actions", i3yVar6);
        List O9 = wwg.O(yf90Var, jSONObject, "hover_start_actions", i3yVar6);
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        List O10 = wwg.O(yf90Var, jSONObject, "longtap_actions", i3yVar6);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        List O11 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar6);
        List O12 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar6);
        Expression e6 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e7 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar4, v1.l, null);
        List O13 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        List O14 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O15 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, v1.m);
        List O16 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O17 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar2 = v1.i;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar5 = v1.e;
        ?? e8 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "visibility", qkjVar2, tlsVar5, kbsVar, kvoVar5);
        if (e8 != 0) {
            kvoVar5 = e8;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O18 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = v1.f;
        }
        return new DivSeparator(divAccessibility, v3kVar, pdkVar2, O, e, e2, kvoVar2, O2, O3, divBorder, kvoVar4, e5, delimiterStyle, O4, O5, O6, divFocus, O7, divSize2, O8, O9, str, divLayoutProvider, O10, divEdgeInsets, divEdgeInsets2, O11, O12, e6, e7, O13, O14, divTransform, O15, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O16, O17, kvoVar5, divVisibilityAction, O18, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivSeparator divSeparator) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = divSeparator.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        v3k v3kVar = divSeparator.b;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, i3yVar);
        wwg.b0(yf90Var, jSONObject, "action_animation", divSeparator.c, jsonParserComponent.z1);
        wwg.c0(yf90Var, jSONObject, "actions", divSeparator.d, i3yVar);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_horizontal", divSeparator.e, DivAlignmentHorizontal.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_vertical", divSeparator.f, DivAlignmentVertical.TO_STRING);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, divSeparator.g);
        wwg.c0(yf90Var, jSONObject, "animators", divSeparator.h, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, divSeparator.i, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", divSeparator.j, jsonParserComponent.U1);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "capture_focus_on_action", divSeparator.k);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "column_span", divSeparator.l);
        wwg.b0(yf90Var, jSONObject, "delimiter_style", divSeparator.m, jsonParserComponent.Z6);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", divSeparator.n, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "doubletap_actions", divSeparator.o, i3yVar);
        wwg.c0(yf90Var, jSONObject, "extensions", divSeparator.p, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", divSeparator.q, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", divSeparator.r, jsonParserComponent.T3);
        DivSize divSize = divSeparator.s;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "hover_end_actions", divSeparator.t, i3yVar);
        wwg.c0(yf90Var, jSONObject, "hover_start_actions", divSeparator.u, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", divSeparator.v);
        wwg.b0(yf90Var, jSONObject, "layout_provider", divSeparator.w, jsonParserComponent.X4);
        wwg.c0(yf90Var, jSONObject, "longtap_actions", divSeparator.x, i3yVar);
        DivEdgeInsets divEdgeInsets = divSeparator.y;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "paddings", divSeparator.z, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "press_end_actions", divSeparator.A, i3yVar);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", divSeparator.B, i3yVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "reuse_id", divSeparator.C);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "row_span", divSeparator.D);
        wwg.c0(yf90Var, jSONObject, "selected_actions", divSeparator.E, i3yVar);
        wwg.c0(yf90Var, jSONObject, "tooltips", divSeparator.F, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", divSeparator.G, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", divSeparator.H, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", divSeparator.I, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = divSeparator.J;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", divSeparator.K, i3yVar4);
        wwg.d0(yf90Var, jSONObject, divSeparator.L, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "separator");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", divSeparator.M, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", divSeparator.N, jsonParserComponent.F9);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "visibility", divSeparator.O, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = divSeparator.P;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", divSeparator.Q, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", divSeparator.R, i3yVar2);
        return jSONObject;
    }
}
