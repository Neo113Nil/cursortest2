package defpackage;

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

/* loaded from: classes.dex */
public final class hbl implements qfy0 {
    public final JsonParserComponent a;

    public hbl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v59, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v70, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dbl a(yf90 yf90Var, nbl nblVar, JSONObject jSONObject) {
        exq exqVar = nblVar.a;
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
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, jsonParserComponent.H);
        exq exqVar2 = nblVar.b;
        i3y i3yVar10 = jsonParserComponent.v1;
        i3y i3yVar11 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) xcx.h(yf90Var, exqVar2, jSONObject, "action", i3yVar10, i3yVar11);
        pdk pdkVar = (pdk) xcx.h(yf90Var, nblVar.c, jSONObject, "action_animation", jsonParserComponent.B1, jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = g2.a;
        }
        pdk pdkVar2 = pdkVar;
        List s = xcx.s(yf90Var, nblVar.d, jSONObject, "actions", i3yVar10, i3yVar11);
        Expression l = xcx.l(yf90Var, nblVar.e, jSONObject, "alignment_horizontal", g2.i, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, nblVar.f, jSONObject, "alignment_vertical", g2.j, DivAlignmentVertical.FROM_STRING);
        exq exqVar3 = nblVar.g;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        i8l i8lVar = g2.m;
        kvo kvoVar = g2.b;
        ?? n = xcx.n(yf90Var, exqVar3, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, i8lVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s2 = xcx.s(yf90Var, nblVar.h, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s3 = xcx.s(yf90Var, nblVar.i, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, nblVar.j, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar4 = nblVar.k;
        wms wmsVar = wm11.a;
        tls tlsVar2 = b.f;
        kvo kvoVar2 = g2.c;
        ?? o = xcx.o(yf90Var, exqVar4, jSONObject, "capture_focus_on_action", wmsVar, tlsVar2, kvoVar2);
        kvo kvoVar3 = o == 0 ? kvoVar2 : o;
        exq exqVar5 = nblVar.l;
        kvo kvoVar4 = g2.d;
        ?? o2 = xcx.o(yf90Var, exqVar5, jSONObject, "clip_to_bounds", wmsVar, tlsVar2, kvoVar4);
        kvo kvoVar5 = o2 == 0 ? kvoVar4 : o2;
        exq exqVar6 = nblVar.m;
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression m = xcx.m(yf90Var, exqVar6, jSONObject, "column_span", tmsVar, tlsVar3, g2.n);
        exq exqVar7 = nblVar.n;
        ums umsVar = wm11.c;
        Expression k = xcx.k(yf90Var, exqVar7, jSONObject, "default_state_id", umsVar);
        List s4 = xcx.s(yf90Var, nblVar.o, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        exq exqVar8 = nblVar.p;
        abl0 abl0Var = q5z.c;
        String str = (String) xcx.i(exqVar8, abl0Var, yf90Var, "div_id", jSONObject);
        kvo kvoVar6 = kvoVar;
        List s5 = xcx.s(yf90Var, nblVar.q, jSONObject, "doubletap_actions", i3yVar10, i3yVar11);
        List s6 = xcx.s(yf90Var, nblVar.r, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, nblVar.s, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s7 = xcx.s(yf90Var, nblVar.t, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, nblVar.u, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = g2.e;
        }
        DivSize divSize2 = divSize;
        List s8 = xcx.s(yf90Var, nblVar.v, jSONObject, "hover_end_actions", i3yVar10, i3yVar11);
        List s9 = xcx.s(yf90Var, nblVar.w, jSONObject, "hover_start_actions", i3yVar10, i3yVar11);
        String str2 = (String) xcx.i(nblVar.x, abl0Var, yf90Var, "id", jSONObject);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, nblVar.y, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        List s10 = xcx.s(yf90Var, nblVar.z, jSONObject, "longtap_actions", i3yVar10, i3yVar11);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, nblVar.A, jSONObject, "margins", i3yVar7, i3yVar6);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, nblVar.B, jSONObject, "paddings", i3yVar7, i3yVar6);
        List s11 = xcx.s(yf90Var, nblVar.C, jSONObject, "press_end_actions", i3yVar10, i3yVar11);
        List s12 = xcx.s(yf90Var, nblVar.D, jSONObject, "press_start_actions", i3yVar10, i3yVar11);
        Expression k2 = xcx.k(yf90Var, nblVar.E, jSONObject, "reuse_id", umsVar);
        Expression m2 = xcx.m(yf90Var, nblVar.F, jSONObject, "row_span", tmsVar, tlsVar3, g2.o);
        List s13 = xcx.s(yf90Var, nblVar.G, jSONObject, "selected_actions", i3yVar10, i3yVar11);
        String str3 = (String) xcx.i(nblVar.H, abl0Var, yf90Var, "state_id_variable", jSONObject);
        List g = xcx.g(yf90Var, nblVar.I, jSONObject, "states", jsonParserComponent.L7, jsonParserComponent.J7, g2.p);
        List s14 = xcx.s(yf90Var, nblVar.J, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, nblVar.K, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s15 = xcx.s(yf90Var, nblVar.L, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        exq exqVar9 = nblVar.M;
        qkj qkjVar = g2.k;
        tls tlsVar4 = DivTransitionSelector.FROM_STRING;
        kvo kvoVar7 = g2.f;
        ?? o3 = xcx.o(yf90Var, exqVar9, jSONObject, "transition_animation_selector", qkjVar, tlsVar4, kvoVar7);
        kvo kvoVar8 = o3 == 0 ? kvoVar7 : o3;
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, nblVar.N, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, nblVar.O, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, nblVar.P, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, nblVar.Q, jSONObject, DivTransitionTrigger.FROM_STRING, g2.q);
        List s16 = xcx.s(yf90Var, nblVar.R, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s17 = xcx.s(yf90Var, nblVar.S, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar10 = nblVar.T;
        qkj qkjVar2 = g2.l;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar9 = g2.g;
        ?? o4 = xcx.o(yf90Var, exqVar10, jSONObject, "visibility", qkjVar2, tlsVar5, kvoVar9);
        if (o4 != 0) {
            kvoVar9 = o4;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, nblVar.U, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s18 = xcx.s(yf90Var, nblVar.V, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, nblVar.W, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = g2.h;
        }
        return new dbl(divAccessibility, v3kVar, pdkVar2, s, l, l2, kvoVar6, s2, s3, divBorder, kvoVar3, kvoVar5, m, k, s4, str, s5, s6, divFocus, s7, divSize2, s8, s9, str2, divLayoutProvider, s10, divEdgeInsets, divEdgeInsets2, s11, s12, k2, m2, s13, str3, g, s14, divTransform, s15, kvoVar8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s16, s17, kvoVar9, divVisibilityAction, s18, divSize3);
    }
}
