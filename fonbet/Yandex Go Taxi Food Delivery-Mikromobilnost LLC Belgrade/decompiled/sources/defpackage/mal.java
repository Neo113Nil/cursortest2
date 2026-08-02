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
import com.yandex.div2.e2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mal implements zsq0, nyi {
    public final JsonParserComponent a;

    public mal(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v83, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hal a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.x7;
        i3y i3yVar5 = jsonParserComponent.g3;
        i3y i3yVar6 = jsonParserComponent.o7;
        i3y i3yVar7 = jsonParserComponent.t1;
        i3y i3yVar8 = jsonParserComponent.d3;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = e2.h;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", e2.i, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        y7l y7lVar = e2.k;
        kvo kvoVar = e2.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, y7lVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression e4 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar3, e2.l, null);
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar6);
        if (divSize == null) {
            divSize = e2.b;
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
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar3 = e2.c;
        ?? e5 = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e5 == 0 ? kvoVar3 : e5;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar5);
        kvo kvoVar5 = e2.d;
        ?? e6 = a.e(yf90Var, jSONObject, "max_value", tmsVar, tlsVar3, kbsVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        kvo kvoVar7 = e2.e;
        ?? e7 = a.e(yf90Var, jSONObject, "min_value", tmsVar, tlsVar3, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar5);
        List O6 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar7);
        List O7 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar7);
        List O8 = wwg.O(yf90Var, jSONObject, "ranges", jsonParserComponent.A7);
        Expression e8 = a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e9 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar3, e2.m, null);
        DivAccessibility divAccessibility2 = (DivAccessibility) wwg.M(yf90Var, jSONObject, "secondary_value_accessibility", jsonParserComponent.H);
        List O9 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar7);
        aok aokVar = (aok) wwg.M(yf90Var, jSONObject, "thumb_secondary_style", i3yVar8);
        gal galVar = (gal) wwg.M(yf90Var, jSONObject, "thumb_secondary_text_style", i3yVar4);
        Object opt2 = jSONObject.opt("thumb_secondary_value_variable");
        if (opt2 == obj) {
            opt2 = null;
        }
        if (opt2 == null) {
            opt2 = null;
        }
        String str2 = (String) opt2;
        aok aokVar2 = (aok) wwg.E(yf90Var, jSONObject, "thumb_style", i3yVar8);
        gal galVar2 = (gal) wwg.M(yf90Var, jSONObject, "thumb_text_style", i3yVar4);
        Object opt3 = jSONObject.opt("thumb_value_variable");
        if (opt3 == obj) {
            opt3 = null;
        }
        String str3 = (String) (opt3 != null ? opt3 : null);
        aok aokVar3 = (aok) wwg.M(yf90Var, jSONObject, "tick_mark_active_style", i3yVar8);
        aok aokVar4 = (aok) wwg.M(yf90Var, jSONObject, "tick_mark_inactive_style", i3yVar8);
        List O10 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        aok aokVar5 = (aok) wwg.E(yf90Var, jSONObject, "track_active_style", i3yVar8);
        aok aokVar6 = (aok) wwg.E(yf90Var, jSONObject, "track_inactive_style", i3yVar8);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O11 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, e2.n);
        List O12 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O13 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar2 = e2.j;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar9 = e2.f;
        ?? e10 = a.e(yf90Var, jSONObject, "visibility", qkjVar2, tlsVar5, kbsVar, kvoVar9);
        if (e10 != 0) {
            kvoVar9 = e10;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O14 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar6);
        if (divSize3 == null) {
            divSize3 = e2.g;
        }
        return new hal(divAccessibility, e, e2, kvoVar2, O, O2, divBorder, e4, O3, O4, divFocus, O5, divSize2, str, kvoVar4, divLayoutProvider, divEdgeInsets, kvoVar6, kvoVar8, divEdgeInsets2, O6, O7, O8, e8, e9, divAccessibility2, O9, aokVar, galVar, str2, aokVar2, galVar2, str3, aokVar3, aokVar4, O10, aokVar5, aokVar6, divTransform, O11, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O12, O13, kvoVar9, divVisibilityAction, O14, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, hal halVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = halVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        a.h(yf90Var, jSONObject, "alignment_horizontal", halVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", halVar.c, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, halVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", halVar.e, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, halVar.f, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", halVar.g, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "column_span", halVar.h);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", halVar.i, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "extensions", halVar.j, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", halVar.k, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", halVar.l, jsonParserComponent.T3);
        DivSize divSize = halVar.m;
        i3y i3yVar = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", halVar.n);
        a.g(yf90Var, jSONObject, "is_enabled", halVar.o);
        wwg.b0(yf90Var, jSONObject, "layout_provider", halVar.p, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = halVar.q;
        i3y i3yVar2 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar2);
        a.g(yf90Var, jSONObject, "max_value", halVar.r);
        a.g(yf90Var, jSONObject, "min_value", halVar.s);
        wwg.b0(yf90Var, jSONObject, "paddings", halVar.t, i3yVar2);
        List list = halVar.u;
        i3y i3yVar3 = jsonParserComponent.t1;
        wwg.c0(yf90Var, jSONObject, "press_end_actions", list, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", halVar.v, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "ranges", halVar.w, jsonParserComponent.A7);
        a.g(yf90Var, jSONObject, "reuse_id", halVar.x);
        a.g(yf90Var, jSONObject, "row_span", halVar.y);
        wwg.b0(yf90Var, jSONObject, "secondary_value_accessibility", halVar.z, jsonParserComponent.H);
        wwg.c0(yf90Var, jSONObject, "selected_actions", halVar.A, i3yVar3);
        aok aokVar = halVar.B;
        i3y i3yVar4 = jsonParserComponent.d3;
        wwg.b0(yf90Var, jSONObject, "thumb_secondary_style", aokVar, i3yVar4);
        gal galVar = halVar.C;
        i3y i3yVar5 = jsonParserComponent.x7;
        wwg.b0(yf90Var, jSONObject, "thumb_secondary_text_style", galVar, i3yVar5);
        wwg.Z(yf90Var, jSONObject, "thumb_secondary_value_variable", halVar.D);
        wwg.b0(yf90Var, jSONObject, "thumb_style", halVar.E, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "thumb_text_style", halVar.F, i3yVar5);
        wwg.Z(yf90Var, jSONObject, "thumb_value_variable", halVar.G);
        wwg.b0(yf90Var, jSONObject, "tick_mark_active_style", halVar.H, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "tick_mark_inactive_style", halVar.I, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "tooltips", halVar.J, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "track_active_style", halVar.K, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "track_inactive_style", halVar.L, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transform", halVar.M, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", halVar.N, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", halVar.O, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = halVar.P;
        i3y i3yVar6 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar6);
        wwg.b0(yf90Var, jSONObject, "transition_out", halVar.Q, i3yVar6);
        wwg.d0(yf90Var, jSONObject, halVar.R, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "slider");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", halVar.S, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", halVar.T, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", halVar.U, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = halVar.V;
        i3y i3yVar7 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar7);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", halVar.W, i3yVar7);
        wwg.b0(yf90Var, jSONObject, "width", halVar.X, i3yVar);
        return jSONObject;
    }
}
