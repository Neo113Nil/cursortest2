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

/* loaded from: classes.dex */
public final class csk implements qfy0 {
    public final JsonParserComponent a;

    public csk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v49, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v51, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v59, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v75, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xrk a(yf90 yf90Var, dsk dskVar, JSONObject jSONObject) {
        exq exqVar = dskVar.a;
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
        exq exqVar2 = dskVar.b;
        i3y i3yVar10 = jsonParserComponent.v1;
        i3y i3yVar11 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) xcx.h(yf90Var, exqVar2, jSONObject, "action", i3yVar10, i3yVar11);
        pdk pdkVar = (pdk) xcx.h(yf90Var, dskVar.c, jSONObject, "action_animation", jsonParserComponent.B1, jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = t0.a;
        }
        pdk pdkVar2 = pdkVar;
        List s = xcx.s(yf90Var, dskVar.d, jSONObject, "actions", i3yVar10, i3yVar11);
        exq exqVar3 = dskVar.e;
        qkj qkjVar = t0.l;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        Expression l = xcx.l(yf90Var, exqVar3, jSONObject, "alignment_horizontal", qkjVar, tlsVar);
        exq exqVar4 = dskVar.f;
        qkj qkjVar2 = t0.m;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression l2 = xcx.l(yf90Var, exqVar4, jSONObject, "alignment_vertical", qkjVar2, tlsVar2);
        exq exqVar5 = dskVar.g;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        tlk tlkVar = t0.r;
        kvo kvoVar = t0.b;
        ?? n = xcx.n(yf90Var, exqVar5, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, tlkVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s2 = xcx.s(yf90Var, dskVar.h, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        afk afkVar = (afk) xcx.h(yf90Var, dskVar.i, jSONObject, "aspect", jsonParserComponent.N1, jsonParserComponent.L1);
        List s3 = xcx.s(yf90Var, dskVar.j, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, dskVar.k, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar6 = dskVar.l;
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar2 = t0.c;
        ?? o = xcx.o(yf90Var, exqVar6, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kvoVar2);
        kvo kvoVar3 = o == 0 ? kvoVar2 : o;
        exq exqVar7 = dskVar.m;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression m = xcx.m(yf90Var, exqVar7, jSONObject, "column_span", tmsVar, tlsVar5, t0.s);
        exq exqVar8 = dskVar.n;
        qkj qkjVar3 = t0.n;
        kvo kvoVar4 = t0.d;
        ?? o2 = xcx.o(yf90Var, exqVar8, jSONObject, "content_alignment_horizontal", qkjVar3, tlsVar, kvoVar4);
        kvo kvoVar5 = o2 == 0 ? kvoVar4 : o2;
        exq exqVar9 = dskVar.o;
        qkj qkjVar4 = t0.o;
        kvo kvoVar6 = t0.e;
        ?? o3 = xcx.o(yf90Var, exqVar9, jSONObject, "content_alignment_vertical", qkjVar4, tlsVar2, kvoVar6);
        kvo kvoVar7 = o3 == 0 ? kvoVar6 : o3;
        List s4 = xcx.s(yf90Var, dskVar.p, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s5 = xcx.s(yf90Var, dskVar.q, jSONObject, "doubletap_actions", i3yVar10, i3yVar11);
        List s6 = xcx.s(yf90Var, dskVar.r, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, dskVar.s, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s7 = xcx.s(yf90Var, dskVar.t, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        exq exqVar10 = dskVar.u;
        dxf0 dxf0Var = wm11.e;
        tls tlsVar6 = b.e;
        Expression d = xcx.d(yf90Var, exqVar10, jSONObject, "gif_url", dxf0Var, tlsVar6);
        DivSize divSize = (DivSize) xcx.h(yf90Var, dskVar.v, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = t0.f;
        }
        DivSize divSize2 = divSize;
        List s8 = xcx.s(yf90Var, dskVar.w, jSONObject, "hover_end_actions", i3yVar10, i3yVar11);
        List s9 = xcx.s(yf90Var, dskVar.x, jSONObject, "hover_start_actions", i3yVar10, i3yVar11);
        String str = (String) xcx.i(dskVar.y, q5z.c, yf90Var, "id", jSONObject);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, dskVar.z, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        List s10 = xcx.s(yf90Var, dskVar.A, jSONObject, "longtap_actions", i3yVar10, i3yVar11);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, dskVar.B, jSONObject, "margins", i3yVar7, i3yVar6);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, dskVar.C, jSONObject, "paddings", i3yVar7, i3yVar6);
        exq exqVar11 = dskVar.D;
        rms rmsVar = wm11.f;
        tls tlsVar7 = b.b;
        kvo kvoVar8 = t0.g;
        ?? o4 = xcx.o(yf90Var, exqVar11, jSONObject, "placeholder_color", rmsVar, tlsVar7, kvoVar8);
        kvo kvoVar9 = o4 == 0 ? kvoVar8 : o4;
        exq exqVar12 = dskVar.E;
        kvo kvoVar10 = t0.h;
        ?? o5 = xcx.o(yf90Var, exqVar12, jSONObject, "preload_required", wmsVar, tlsVar4, kvoVar10);
        kvo kvoVar11 = o5 == 0 ? kvoVar10 : o5;
        List s11 = xcx.s(yf90Var, dskVar.F, jSONObject, "press_end_actions", i3yVar10, i3yVar11);
        List s12 = xcx.s(yf90Var, dskVar.G, jSONObject, "press_start_actions", i3yVar10, i3yVar11);
        exq exqVar13 = dskVar.H;
        ums umsVar = wm11.c;
        Expression k = xcx.k(yf90Var, exqVar13, jSONObject, "preview", umsVar);
        Expression l3 = xcx.l(yf90Var, dskVar.I, jSONObject, "preview_url", dxf0Var, tlsVar6);
        Expression k2 = xcx.k(yf90Var, dskVar.J, jSONObject, "reuse_id", umsVar);
        Expression m2 = xcx.m(yf90Var, dskVar.K, jSONObject, "row_span", tmsVar, tlsVar5, t0.t);
        exq exqVar14 = dskVar.L;
        qkj qkjVar5 = t0.p;
        tls tlsVar8 = DivImageScale.FROM_STRING;
        kvo kvoVar12 = t0.i;
        ?? o6 = xcx.o(yf90Var, exqVar14, jSONObject, "scale", qkjVar5, tlsVar8, kvoVar12);
        kvo kvoVar13 = o6 == 0 ? kvoVar12 : o6;
        List s13 = xcx.s(yf90Var, dskVar.M, jSONObject, "selected_actions", i3yVar10, i3yVar11);
        List s14 = xcx.s(yf90Var, dskVar.N, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, dskVar.O, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s15 = xcx.s(yf90Var, dskVar.P, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, dskVar.Q, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, dskVar.R, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, dskVar.S, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, dskVar.T, jSONObject, DivTransitionTrigger.FROM_STRING, t0.u);
        List s16 = xcx.s(yf90Var, dskVar.U, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s17 = xcx.s(yf90Var, dskVar.V, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar15 = dskVar.W;
        qkj qkjVar6 = t0.q;
        tls tlsVar9 = DivVisibility.FROM_STRING;
        kvo kvoVar14 = t0.j;
        ?? o7 = xcx.o(yf90Var, exqVar15, jSONObject, "visibility", qkjVar6, tlsVar9, kvoVar14);
        if (o7 != 0) {
            kvoVar14 = o7;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, dskVar.X, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s18 = xcx.s(yf90Var, dskVar.Y, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, dskVar.Z, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = t0.k;
        }
        return new xrk(divAccessibility, v3kVar, pdkVar2, s, l, l2, kvoVar, s2, afkVar, s3, divBorder, kvoVar3, m, kvoVar5, kvoVar7, s4, s5, s6, divFocus, s7, d, divSize2, s8, s9, str, divLayoutProvider, s10, divEdgeInsets, divEdgeInsets2, kvoVar9, kvoVar11, s11, s12, k, l3, k2, m2, kvoVar13, s13, s14, divTransform, s15, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s16, s17, kvoVar14, divVisibilityAction, s18, divSize3);
    }
}
