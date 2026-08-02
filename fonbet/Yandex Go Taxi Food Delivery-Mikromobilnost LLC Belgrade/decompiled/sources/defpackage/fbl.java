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
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.g2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class fbl implements zsq0, nyi {
    public final JsonParserComponent a;

    public fbl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v65, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v76, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dbl a(yf90 yf90Var, JSONObject jSONObject) {
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
            pdkVar = g2.a;
        }
        pdk pdkVar2 = pdkVar;
        List O = wwg.O(yf90Var, jSONObject, "actions", i3yVar6);
        qkj qkjVar = g2.i;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", g2.j, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        i8l i8lVar = g2.m;
        kvo kvoVar = g2.b;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, i8lVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O2 = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O3 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar3 = g2.c;
        ?? e4 = a.e(yf90Var, jSONObject, "capture_focus_on_action", wmsVar, tlsVar3, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        kvo kvoVar5 = g2.d;
        ?? e5 = a.e(yf90Var, jSONObject, "clip_to_bounds", wmsVar, tlsVar3, kbsVar, kvoVar5);
        kvo kvoVar6 = e5 == 0 ? kvoVar5 : e5;
        tms tmsVar = wm11.b;
        tls tlsVar4 = b.h;
        Expression e6 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar4, g2.n, null);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression e7 = a.e(yf90Var, jSONObject, "default_state_id", umsVar, abl0Var, kbsVar, null);
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        Object opt = jSONObject.opt("div_id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        List O5 = wwg.O(yf90Var, jSONObject, "doubletap_actions", i3yVar6);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O7 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = g2.e;
        }
        DivSize divSize2 = divSize;
        List O8 = wwg.O(yf90Var, jSONObject, "hover_end_actions", i3yVar6);
        List O9 = wwg.O(yf90Var, jSONObject, "hover_start_actions", i3yVar6);
        Object opt2 = jSONObject.opt("id");
        if (opt2 == obj) {
            opt2 = null;
        }
        if (opt2 == null) {
            opt2 = null;
        }
        String str2 = (String) opt2;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        List O10 = wwg.O(yf90Var, jSONObject, "longtap_actions", i3yVar6);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        List O11 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar6);
        List O12 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar6);
        Expression e8 = a.e(yf90Var, jSONObject, "reuse_id", umsVar, abl0Var, kbsVar, null);
        Expression e9 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar4, g2.o, null);
        List O13 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        Object opt3 = jSONObject.opt("state_id_variable");
        if (opt3 == obj) {
            opt3 = null;
        }
        String str3 = (String) (opt3 != null ? opt3 : null);
        List J = wwg.J(yf90Var, jSONObject, "states", jsonParserComponent.J7, g2.p);
        List O14 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O15 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        qkj qkjVar2 = g2.k;
        tls tlsVar5 = DivTransitionSelector.FROM_STRING;
        kvo kvoVar7 = g2.f;
        ?? e10 = a.e(yf90Var, jSONObject, "transition_animation_selector", qkjVar2, tlsVar5, kbsVar, kvoVar7);
        kvo kvoVar8 = e10 == 0 ? kvoVar7 : e10;
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, g2.q);
        List O16 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O17 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar3 = g2.l;
        tls tlsVar6 = DivVisibility.FROM_STRING;
        kvo kvoVar9 = g2.g;
        ?? e11 = a.e(yf90Var, jSONObject, "visibility", qkjVar3, tlsVar6, kbsVar, kvoVar9);
        if (e11 != 0) {
            kvoVar9 = e11;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O18 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = g2.h;
        }
        return new dbl(divAccessibility, v3kVar, pdkVar2, O, e, e2, kvoVar2, O2, O3, divBorder, kvoVar4, kvoVar6, e6, e7, O4, str, O5, O6, divFocus, O7, divSize2, O8, O9, str2, divLayoutProvider, O10, divEdgeInsets, divEdgeInsets2, O11, O12, e8, e9, O13, str3, J, O14, divTransform, O15, kvoVar8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O16, O17, kvoVar9, divVisibilityAction, O18, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dbl dblVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = dblVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        v3k v3kVar = dblVar.b;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, i3yVar);
        wwg.b0(yf90Var, jSONObject, "action_animation", dblVar.c, jsonParserComponent.z1);
        wwg.c0(yf90Var, jSONObject, "actions", dblVar.d, i3yVar);
        a.h(yf90Var, jSONObject, "alignment_horizontal", dblVar.e, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", dblVar.f, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, dblVar.g);
        wwg.c0(yf90Var, jSONObject, "animators", dblVar.h, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, dblVar.i, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", dblVar.j, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "capture_focus_on_action", dblVar.k);
        a.g(yf90Var, jSONObject, "clip_to_bounds", dblVar.l);
        a.g(yf90Var, jSONObject, "column_span", dblVar.m);
        a.g(yf90Var, jSONObject, "default_state_id", dblVar.n);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", dblVar.o, jsonParserComponent.X2);
        wwg.Z(yf90Var, jSONObject, "div_id", dblVar.p);
        wwg.c0(yf90Var, jSONObject, "doubletap_actions", dblVar.q, i3yVar);
        wwg.c0(yf90Var, jSONObject, "extensions", dblVar.r, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", dblVar.s, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", dblVar.t, jsonParserComponent.T3);
        DivSize divSize = dblVar.u;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.c0(yf90Var, jSONObject, "hover_end_actions", dblVar.v, i3yVar);
        wwg.c0(yf90Var, jSONObject, "hover_start_actions", dblVar.w, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", dblVar.x);
        wwg.b0(yf90Var, jSONObject, "layout_provider", dblVar.y, jsonParserComponent.X4);
        wwg.c0(yf90Var, jSONObject, "longtap_actions", dblVar.z, i3yVar);
        DivEdgeInsets divEdgeInsets = dblVar.A;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "paddings", dblVar.B, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "press_end_actions", dblVar.C, i3yVar);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", dblVar.D, i3yVar);
        a.g(yf90Var, jSONObject, "reuse_id", dblVar.E);
        a.g(yf90Var, jSONObject, "row_span", dblVar.F);
        wwg.c0(yf90Var, jSONObject, "selected_actions", dblVar.G, i3yVar);
        wwg.Z(yf90Var, jSONObject, "state_id_variable", dblVar.H);
        wwg.c0(yf90Var, jSONObject, "states", dblVar.I, jsonParserComponent.J7);
        wwg.c0(yf90Var, jSONObject, "tooltips", dblVar.J, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", dblVar.K, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", dblVar.L, jsonParserComponent.q9);
        a.h(yf90Var, jSONObject, "transition_animation_selector", dblVar.M, DivTransitionSelector.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "transition_change", dblVar.N, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = dblVar.O;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", dblVar.P, i3yVar4);
        wwg.d0(yf90Var, jSONObject, dblVar.Q, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", ClidProvider.STATE);
        wwg.c0(yf90Var, jSONObject, "variable_triggers", dblVar.R, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", dblVar.S, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", dblVar.T, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = dblVar.U;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", dblVar.V, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", dblVar.W, i3yVar2);
        return jSONObject;
    }
}
