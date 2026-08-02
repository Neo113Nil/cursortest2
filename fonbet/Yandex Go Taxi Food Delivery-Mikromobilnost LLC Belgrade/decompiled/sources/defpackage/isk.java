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
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.u0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class isk implements zsq0, nyi {
    public final JsonParserComponent a;

    public isk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v68, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hsk a(yf90 yf90Var, JSONObject jSONObject) {
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
            pdkVar = u0.a;
        }
        pdk pdkVar2 = pdkVar;
        List O = wwg.O(yf90Var, jSONObject, "actions", i3yVar6);
        qkj qkjVar = u0.i;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        qkj qkjVar2 = u0.j;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", qkjVar2, tlsVar2, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        zrk zrkVar = u0.n;
        kvo kvoVar = u0.b;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, zrkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O2 = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O3 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar3 = u0.c;
        ?? e4 = a.e(yf90Var, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression b = a.b(yf90Var, jSONObject, "column_count", tmsVar, tlsVar5, u0.o);
        Expression e5 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar5, u0.p, null);
        qkj qkjVar3 = u0.k;
        kvo kvoVar5 = u0.d;
        ?? e6 = a.e(yf90Var, jSONObject, "content_alignment_horizontal", qkjVar3, tlsVar, kbsVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        qkj qkjVar4 = u0.l;
        kvo kvoVar7 = u0.e;
        ?? e7 = a.e(yf90Var, jSONObject, "content_alignment_vertical", qkjVar4, tlsVar2, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O5 = wwg.O(yf90Var, jSONObject, "doubletap_actions", i3yVar6);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O7 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = u0.f;
        }
        DivSize divSize2 = divSize;
        List O8 = wwg.O(yf90Var, jSONObject, "hover_end_actions", i3yVar6);
        List O9 = wwg.O(yf90Var, jSONObject, "hover_start_actions", i3yVar6);
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        List O10 = wwg.O(yf90Var, jSONObject, "items", jsonParserComponent.X9);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        List O11 = wwg.O(yf90Var, jSONObject, "longtap_actions", i3yVar6);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        List O12 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar6);
        List O13 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar6);
        Expression e8 = a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e9 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar5, u0.q, null);
        List O14 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        List O15 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O16 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, u0.r);
        List O17 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O18 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar5 = u0.m;
        tls tlsVar6 = DivVisibility.FROM_STRING;
        kvo kvoVar9 = u0.g;
        ?? e10 = a.e(yf90Var, jSONObject, "visibility", qkjVar5, tlsVar6, kbsVar, kvoVar9);
        if (e10 != 0) {
            kvoVar9 = e10;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O19 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = u0.h;
        }
        return new hsk(divAccessibility, v3kVar, pdkVar2, O, e, e2, kvoVar2, O2, O3, divBorder, kvoVar4, b, e5, kvoVar6, kvoVar8, O4, O5, O6, divFocus, O7, divSize2, O8, O9, str, O10, divLayoutProvider, O11, divEdgeInsets, divEdgeInsets2, O12, O13, e8, e9, O14, O15, divTransform, O16, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O17, O18, kvoVar9, divVisibilityAction, O19, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, hsk hskVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = hskVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        v3k v3kVar = hskVar.b;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, i3yVar);
        wwg.b0(yf90Var, jSONObject, "action_animation", hskVar.c, jsonParserComponent.z1);
        wwg.c0(yf90Var, jSONObject, "actions", hskVar.d, i3yVar);
        Expression expression = hskVar.e;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_horizontal", expression, tlsVar);
        Expression expression2 = hskVar.f;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_vertical", expression2, tlsVar2);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, hskVar.g);
        wwg.c0(yf90Var, jSONObject, "animators", hskVar.h, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, hskVar.i, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", hskVar.j, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "capture_focus_on_action", hskVar.k);
        a.g(yf90Var, jSONObject, "column_count", hskVar.l);
        a.g(yf90Var, jSONObject, "column_span", hskVar.m);
        a.h(yf90Var, jSONObject, "content_alignment_horizontal", hskVar.n, tlsVar);
        a.h(yf90Var, jSONObject, "content_alignment_vertical", hskVar.o, tlsVar2);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", hskVar.p, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "doubletap_actions", hskVar.q, i3yVar);
        wwg.c0(yf90Var, jSONObject, "extensions", hskVar.r, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", hskVar.s, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", hskVar.t, jsonParserComponent.T3);
        DivSize divSize = hskVar.u;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "hover_end_actions", hskVar.v, i3yVar);
        wwg.c0(yf90Var, jSONObject, "hover_start_actions", hskVar.w, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", hskVar.x);
        wwg.c0(yf90Var, jSONObject, "items", hskVar.y, jsonParserComponent.X9);
        wwg.b0(yf90Var, jSONObject, "layout_provider", hskVar.z, jsonParserComponent.X4);
        wwg.c0(yf90Var, jSONObject, "longtap_actions", hskVar.A, i3yVar);
        DivEdgeInsets divEdgeInsets = hskVar.B;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "paddings", hskVar.C, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "press_end_actions", hskVar.D, i3yVar);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", hskVar.E, i3yVar);
        a.g(yf90Var, jSONObject, "reuse_id", hskVar.F);
        a.g(yf90Var, jSONObject, "row_span", hskVar.G);
        wwg.c0(yf90Var, jSONObject, "selected_actions", hskVar.H, i3yVar);
        wwg.c0(yf90Var, jSONObject, "tooltips", hskVar.I, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", hskVar.J, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", hskVar.K, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", hskVar.L, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = hskVar.M;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", hskVar.N, i3yVar4);
        wwg.d0(yf90Var, jSONObject, hskVar.O, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "grid");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", hskVar.P, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", hskVar.Q, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", hskVar.R, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = hskVar.S;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", hskVar.T, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", hskVar.U, i3yVar2);
        return jSONObject;
    }
}
