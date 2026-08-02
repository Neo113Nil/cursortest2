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
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.u0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ksk implements qfy0 {
    public final JsonParserComponent a;

    public ksk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v66, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hsk a(yf90 yf90Var, lsk lskVar, JSONObject jSONObject) {
        exq exqVar = lskVar.a;
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
        exq exqVar2 = lskVar.b;
        i3y i3yVar10 = jsonParserComponent.v1;
        i3y i3yVar11 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) xcx.h(yf90Var, exqVar2, jSONObject, "action", i3yVar10, i3yVar11);
        pdk pdkVar = (pdk) xcx.h(yf90Var, lskVar.c, jSONObject, "action_animation", jsonParserComponent.B1, jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = u0.a;
        }
        pdk pdkVar2 = pdkVar;
        List s = xcx.s(yf90Var, lskVar.d, jSONObject, "actions", i3yVar10, i3yVar11);
        exq exqVar3 = lskVar.e;
        qkj qkjVar = u0.i;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        Expression l = xcx.l(yf90Var, exqVar3, jSONObject, "alignment_horizontal", qkjVar, tlsVar);
        exq exqVar4 = lskVar.f;
        qkj qkjVar2 = u0.j;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression l2 = xcx.l(yf90Var, exqVar4, jSONObject, "alignment_vertical", qkjVar2, tlsVar2);
        exq exqVar5 = lskVar.g;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        zrk zrkVar = u0.n;
        kvo kvoVar = u0.b;
        ?? n = xcx.n(yf90Var, exqVar5, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, zrkVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s2 = xcx.s(yf90Var, lskVar.h, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s3 = xcx.s(yf90Var, lskVar.i, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, lskVar.j, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar6 = lskVar.k;
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar2 = u0.c;
        ?? o = xcx.o(yf90Var, exqVar6, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kvoVar2);
        kvo kvoVar3 = o == 0 ? kvoVar2 : o;
        exq exqVar7 = lskVar.l;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression e = xcx.e(yf90Var, exqVar7, jSONObject, "column_count", tmsVar, tlsVar5, u0.o);
        Expression m = xcx.m(yf90Var, lskVar.m, jSONObject, "column_span", tmsVar, tlsVar5, u0.p);
        exq exqVar8 = lskVar.n;
        qkj qkjVar3 = u0.k;
        kvo kvoVar4 = u0.d;
        ?? o2 = xcx.o(yf90Var, exqVar8, jSONObject, "content_alignment_horizontal", qkjVar3, tlsVar, kvoVar4);
        kvo kvoVar5 = o2 == 0 ? kvoVar4 : o2;
        exq exqVar9 = lskVar.o;
        qkj qkjVar4 = u0.l;
        kvo kvoVar6 = u0.e;
        ?? o3 = xcx.o(yf90Var, exqVar9, jSONObject, "content_alignment_vertical", qkjVar4, tlsVar2, kvoVar6);
        kvo kvoVar7 = o3 == 0 ? kvoVar6 : o3;
        List s4 = xcx.s(yf90Var, lskVar.p, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s5 = xcx.s(yf90Var, lskVar.q, jSONObject, "doubletap_actions", i3yVar10, i3yVar11);
        List s6 = xcx.s(yf90Var, lskVar.r, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, lskVar.s, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s7 = xcx.s(yf90Var, lskVar.t, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, lskVar.u, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = u0.f;
        }
        DivSize divSize2 = divSize;
        List s8 = xcx.s(yf90Var, lskVar.v, jSONObject, "hover_end_actions", i3yVar10, i3yVar11);
        List s9 = xcx.s(yf90Var, lskVar.w, jSONObject, "hover_start_actions", i3yVar10, i3yVar11);
        String str = (String) xcx.i(lskVar.x, q5z.c, yf90Var, "id", jSONObject);
        List s10 = xcx.s(yf90Var, lskVar.y, jSONObject, "items", jsonParserComponent.Z9, jsonParserComponent.X9);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, lskVar.z, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        List s11 = xcx.s(yf90Var, lskVar.A, jSONObject, "longtap_actions", i3yVar10, i3yVar11);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, lskVar.B, jSONObject, "margins", i3yVar7, i3yVar6);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, lskVar.C, jSONObject, "paddings", i3yVar7, i3yVar6);
        List s12 = xcx.s(yf90Var, lskVar.D, jSONObject, "press_end_actions", i3yVar10, i3yVar11);
        List s13 = xcx.s(yf90Var, lskVar.E, jSONObject, "press_start_actions", i3yVar10, i3yVar11);
        Expression k = xcx.k(yf90Var, lskVar.F, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, lskVar.G, jSONObject, "row_span", tmsVar, tlsVar5, u0.q);
        List s14 = xcx.s(yf90Var, lskVar.H, jSONObject, "selected_actions", i3yVar10, i3yVar11);
        List s15 = xcx.s(yf90Var, lskVar.I, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, lskVar.J, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s16 = xcx.s(yf90Var, lskVar.K, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, lskVar.L, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, lskVar.M, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, lskVar.N, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, lskVar.O, jSONObject, DivTransitionTrigger.FROM_STRING, u0.r);
        List s17 = xcx.s(yf90Var, lskVar.P, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s18 = xcx.s(yf90Var, lskVar.Q, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar10 = lskVar.R;
        qkj qkjVar5 = u0.m;
        tls tlsVar6 = DivVisibility.FROM_STRING;
        kvo kvoVar8 = u0.g;
        ?? o4 = xcx.o(yf90Var, exqVar10, jSONObject, "visibility", qkjVar5, tlsVar6, kvoVar8);
        if (o4 != 0) {
            kvoVar8 = o4;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, lskVar.S, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s19 = xcx.s(yf90Var, lskVar.T, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, lskVar.U, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = u0.h;
        }
        return new hsk(divAccessibility, v3kVar, pdkVar2, s, l, l2, kvoVar, s2, s3, divBorder, kvoVar3, e, m, kvoVar5, kvoVar7, s4, s5, s6, divFocus, s7, divSize2, s8, s9, str, s10, divLayoutProvider, s11, divEdgeInsets, divEdgeInsets2, s12, s13, k, m2, s14, s15, divTransform, s16, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s17, s18, kvoVar8, divVisibilityAction, s19, divSize3);
    }
}
