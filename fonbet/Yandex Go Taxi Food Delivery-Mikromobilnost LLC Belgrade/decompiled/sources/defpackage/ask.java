package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.t0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ask implements zsq0, nyi {
    public final JsonParserComponent a;

    public ask(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v53, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v61, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v77, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xrk a(yf90 yf90Var, JSONObject jSONObject) {
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
            pdkVar = t0.a;
        }
        pdk pdkVar2 = pdkVar;
        List O = wwg.O(yf90Var, jSONObject, "actions", i3yVar6);
        qkj qkjVar = t0.l;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        qkj qkjVar2 = t0.m;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", qkjVar2, tlsVar2, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        tlk tlkVar = t0.r;
        kvo kvoVar = t0.b;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, tlkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O2 = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        afk afkVar = (afk) wwg.M(yf90Var, jSONObject, "aspect", jsonParserComponent.L1);
        List O3 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar3 = t0.c;
        ?? e4 = a.e(yf90Var, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression e5 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar5, t0.s, null);
        qkj qkjVar3 = t0.n;
        kvo kvoVar5 = t0.d;
        ?? e6 = a.e(yf90Var, jSONObject, "content_alignment_horizontal", qkjVar3, tlsVar, kbsVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        qkj qkjVar4 = t0.o;
        kvo kvoVar7 = t0.e;
        ?? e7 = a.e(yf90Var, jSONObject, "content_alignment_vertical", qkjVar4, tlsVar2, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O5 = wwg.O(yf90Var, jSONObject, "doubletap_actions", i3yVar6);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O7 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        dxf0 dxf0Var = wm11.e;
        tls tlsVar6 = b.e;
        Expression b = a.b(yf90Var, jSONObject, "gif_url", dxf0Var, tlsVar6, kbsVar);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = t0.f;
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
        rms rmsVar = wm11.f;
        tls tlsVar7 = b.b;
        kvo kvoVar9 = t0.g;
        ?? e8 = a.e(yf90Var, jSONObject, "placeholder_color", rmsVar, tlsVar7, kbsVar, kvoVar9);
        kvo kvoVar10 = e8 == 0 ? kvoVar9 : e8;
        kvo kvoVar11 = t0.h;
        ?? e9 = a.e(yf90Var, jSONObject, "preload_required", wmsVar, tlsVar4, kbsVar, kvoVar11);
        kvo kvoVar12 = e9 == 0 ? kvoVar11 : e9;
        List O11 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar6);
        List O12 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar6);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression e10 = a.e(yf90Var, jSONObject, "preview", umsVar, abl0Var, kbsVar, null);
        Expression e11 = a.e(yf90Var, jSONObject, "preview_url", dxf0Var, tlsVar6, kbsVar, null);
        Expression e12 = a.e(yf90Var, jSONObject, "reuse_id", umsVar, abl0Var, kbsVar, null);
        Expression e13 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar5, t0.t, null);
        qkj qkjVar5 = t0.p;
        tls tlsVar8 = DivImageScale.FROM_STRING;
        kvo kvoVar13 = t0.i;
        ?? e14 = a.e(yf90Var, jSONObject, "scale", qkjVar5, tlsVar8, kbsVar, kvoVar13);
        kvo kvoVar14 = e14 == 0 ? kvoVar13 : e14;
        List O13 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        List O14 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O15 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, t0.u);
        List O16 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O17 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar6 = t0.q;
        tls tlsVar9 = DivVisibility.FROM_STRING;
        kvo kvoVar15 = t0.j;
        ?? e15 = a.e(yf90Var, jSONObject, "visibility", qkjVar6, tlsVar9, kbsVar, kvoVar15);
        if (e15 != 0) {
            kvoVar15 = e15;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O18 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = t0.k;
        }
        return new xrk(divAccessibility, v3kVar, pdkVar2, O, e, e2, kvoVar2, O2, afkVar, O3, divBorder, kvoVar4, e5, kvoVar6, kvoVar8, O4, O5, O6, divFocus, O7, b, divSize2, O8, O9, str, divLayoutProvider, O10, divEdgeInsets, divEdgeInsets2, kvoVar10, kvoVar12, O11, O12, e10, e11, e12, e13, kvoVar14, O13, O14, divTransform, O15, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O16, O17, kvoVar15, divVisibilityAction, O18, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, xrk xrkVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = xrkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        v3k v3kVar = xrkVar.b;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, i3yVar);
        wwg.b0(yf90Var, jSONObject, "action_animation", xrkVar.c, jsonParserComponent.z1);
        wwg.c0(yf90Var, jSONObject, "actions", xrkVar.d, i3yVar);
        Expression expression = xrkVar.e;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_horizontal", expression, tlsVar);
        Expression expression2 = xrkVar.f;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_vertical", expression2, tlsVar2);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, xrkVar.g);
        wwg.c0(yf90Var, jSONObject, "animators", xrkVar.h, jsonParserComponent.C1);
        wwg.b0(yf90Var, jSONObject, "aspect", xrkVar.i, jsonParserComponent.L1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, xrkVar.j, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", xrkVar.k, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "capture_focus_on_action", xrkVar.l);
        a.g(yf90Var, jSONObject, "column_span", xrkVar.m);
        a.h(yf90Var, jSONObject, "content_alignment_horizontal", xrkVar.n, tlsVar);
        a.h(yf90Var, jSONObject, "content_alignment_vertical", xrkVar.o, tlsVar2);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", xrkVar.p, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "doubletap_actions", xrkVar.q, i3yVar);
        wwg.c0(yf90Var, jSONObject, "extensions", xrkVar.r, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", xrkVar.s, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", xrkVar.t, jsonParserComponent.T3);
        Expression expression3 = xrkVar.u;
        tls tlsVar3 = b.c;
        a.h(yf90Var, jSONObject, "gif_url", expression3, tlsVar3);
        DivSize divSize = xrkVar.v;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "hover_end_actions", xrkVar.w, i3yVar);
        wwg.c0(yf90Var, jSONObject, "hover_start_actions", xrkVar.x, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", xrkVar.y);
        wwg.b0(yf90Var, jSONObject, "layout_provider", xrkVar.z, jsonParserComponent.X4);
        wwg.c0(yf90Var, jSONObject, "longtap_actions", xrkVar.A, i3yVar);
        DivEdgeInsets divEdgeInsets = xrkVar.B;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "paddings", xrkVar.C, i3yVar3);
        a.h(yf90Var, jSONObject, "placeholder_color", xrkVar.D, b.a);
        a.g(yf90Var, jSONObject, "preload_required", xrkVar.E);
        wwg.c0(yf90Var, jSONObject, "press_end_actions", xrkVar.F, i3yVar);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", xrkVar.G, i3yVar);
        a.g(yf90Var, jSONObject, "preview", xrkVar.H);
        a.h(yf90Var, jSONObject, "preview_url", xrkVar.I, tlsVar3);
        a.g(yf90Var, jSONObject, "reuse_id", xrkVar.J);
        a.g(yf90Var, jSONObject, "row_span", xrkVar.K);
        a.h(yf90Var, jSONObject, "scale", xrkVar.L, DivImageScale.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "selected_actions", xrkVar.M, i3yVar);
        wwg.c0(yf90Var, jSONObject, "tooltips", xrkVar.N, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", xrkVar.O, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", xrkVar.P, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", xrkVar.Q, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = xrkVar.R;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", xrkVar.S, i3yVar4);
        wwg.d0(yf90Var, jSONObject, xrkVar.T, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "gif");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", xrkVar.U, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", xrkVar.V, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", xrkVar.W, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = xrkVar.X;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", xrkVar.Y, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", xrkVar.Z, i3yVar2);
        return jSONObject;
    }
}
