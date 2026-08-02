package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBlendMode;
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
import com.yandex.div2.w0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dtk implements zsq0, nyi {
    public final JsonParserComponent a;

    public dtk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v56, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v58, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v65, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v69, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v84, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final psk a(yf90 yf90Var, JSONObject jSONObject) {
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
            pdkVar = w0.a;
        }
        pdk pdkVar2 = pdkVar;
        List O = wwg.O(yf90Var, jSONObject, "actions", i3yVar6);
        qkj qkjVar = w0.n;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        qkj qkjVar2 = w0.o;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", qkjVar2, tlsVar2, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        zrk zrkVar = w0.u;
        kvo kvoVar = w0.b;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, zrkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O2 = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        hpk hpkVar = (hpk) wwg.M(yf90Var, jSONObject, "appearance_animation", jsonParserComponent.m3);
        afk afkVar = (afk) wwg.M(yf90Var, jSONObject, "aspect", jsonParserComponent.L1);
        List O3 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar3 = w0.c;
        ?? e4 = a.e(yf90Var, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression e5 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar5, w0.v, null);
        qkj qkjVar3 = w0.p;
        kvo kvoVar5 = w0.d;
        ?? e6 = a.e(yf90Var, jSONObject, "content_alignment_horizontal", qkjVar3, tlsVar, kbsVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        qkj qkjVar4 = w0.q;
        kvo kvoVar7 = w0.e;
        ?? e7 = a.e(yf90Var, jSONObject, "content_alignment_vertical", qkjVar4, tlsVar2, kbsVar, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O5 = wwg.O(yf90Var, jSONObject, "doubletap_actions", i3yVar6);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        List O7 = wwg.O(yf90Var, jSONObject, "filters", jsonParserComponent.s3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O8 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = w0.f;
        }
        DivSize divSize2 = divSize;
        kvo kvoVar9 = w0.g;
        ?? e8 = a.e(yf90Var, jSONObject, "high_priority_preview_show", wmsVar, tlsVar4, kbsVar, kvoVar9);
        kvo kvoVar10 = e8 == 0 ? kvoVar9 : e8;
        List O9 = wwg.O(yf90Var, jSONObject, "hover_end_actions", i3yVar6);
        List O10 = wwg.O(yf90Var, jSONObject, "hover_start_actions", i3yVar6);
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        Expression b = a.b(yf90Var, jSONObject, "image_url", wm11.e, b.e, kbsVar);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        List O11 = wwg.O(yf90Var, jSONObject, "longtap_actions", i3yVar6);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        rms rmsVar = wm11.f;
        tls tlsVar6 = b.b;
        kvo kvoVar11 = w0.h;
        ?? e9 = a.e(yf90Var, jSONObject, "placeholder_color", rmsVar, tlsVar6, kbsVar, kvoVar11);
        kvo kvoVar12 = e9 == 0 ? kvoVar11 : e9;
        kvo kvoVar13 = w0.i;
        ?? e10 = a.e(yf90Var, jSONObject, "preload_required", wmsVar, tlsVar4, kbsVar, kvoVar13);
        kvo kvoVar14 = e10 == 0 ? kvoVar13 : e10;
        List O12 = wwg.O(yf90Var, jSONObject, "press_end_actions", i3yVar6);
        List O13 = wwg.O(yf90Var, jSONObject, "press_start_actions", i3yVar6);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression e11 = a.e(yf90Var, jSONObject, "preview", umsVar, abl0Var, kbsVar, null);
        Expression e12 = a.e(yf90Var, jSONObject, "reuse_id", umsVar, abl0Var, kbsVar, null);
        Expression e13 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar5, w0.w, null);
        qkj qkjVar5 = w0.r;
        tls tlsVar7 = DivImageScale.FROM_STRING;
        kvo kvoVar15 = w0.j;
        ?? e14 = a.e(yf90Var, jSONObject, "scale", qkjVar5, tlsVar7, kbsVar, kvoVar15);
        kvo kvoVar16 = e14 == 0 ? kvoVar15 : e14;
        List O14 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        Expression e15 = a.e(yf90Var, jSONObject, "tint_color", rmsVar, tlsVar6, kbsVar, null);
        qkj qkjVar6 = w0.s;
        tls tlsVar8 = DivBlendMode.FROM_STRING;
        kvo kvoVar17 = w0.k;
        ?? e16 = a.e(yf90Var, jSONObject, "tint_mode", qkjVar6, tlsVar8, kbsVar, kvoVar17);
        kvo kvoVar18 = e16 == 0 ? kvoVar17 : e16;
        List O15 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O16 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, w0.x);
        List O17 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O18 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar7 = w0.t;
        tls tlsVar9 = DivVisibility.FROM_STRING;
        kvo kvoVar19 = w0.l;
        ?? e17 = a.e(yf90Var, jSONObject, "visibility", qkjVar7, tlsVar9, kbsVar, kvoVar19);
        if (e17 != 0) {
            kvoVar19 = e17;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O19 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = w0.m;
        }
        return new psk(divAccessibility, v3kVar, pdkVar2, O, e, e2, kvoVar2, O2, hpkVar, afkVar, O3, divBorder, kvoVar4, e5, kvoVar6, kvoVar8, O4, O5, O6, O7, divFocus, O8, divSize2, kvoVar10, O9, O10, str, b, divLayoutProvider, O11, divEdgeInsets, divEdgeInsets2, kvoVar12, kvoVar14, O12, O13, e11, e12, e13, kvoVar16, O14, e15, kvoVar18, O15, divTransform, O16, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O17, O18, kvoVar19, divVisibilityAction, O19, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, psk pskVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = pskVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        v3k v3kVar = pskVar.b;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.b0(yf90Var, jSONObject, "action", v3kVar, i3yVar);
        wwg.b0(yf90Var, jSONObject, "action_animation", pskVar.c, jsonParserComponent.z1);
        wwg.c0(yf90Var, jSONObject, "actions", pskVar.d, i3yVar);
        Expression expression = pskVar.e;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_horizontal", expression, tlsVar);
        Expression expression2 = pskVar.f;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_vertical", expression2, tlsVar2);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, pskVar.g);
        wwg.c0(yf90Var, jSONObject, "animators", pskVar.h, jsonParserComponent.C1);
        wwg.b0(yf90Var, jSONObject, "appearance_animation", pskVar.i, jsonParserComponent.m3);
        wwg.b0(yf90Var, jSONObject, "aspect", pskVar.j, jsonParserComponent.L1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, pskVar.k, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", pskVar.l, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "capture_focus_on_action", pskVar.m);
        a.g(yf90Var, jSONObject, "column_span", pskVar.n);
        a.h(yf90Var, jSONObject, "content_alignment_horizontal", pskVar.o, tlsVar);
        a.h(yf90Var, jSONObject, "content_alignment_vertical", pskVar.p, tlsVar2);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", pskVar.q, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "doubletap_actions", pskVar.r, i3yVar);
        wwg.c0(yf90Var, jSONObject, "extensions", pskVar.s, jsonParserComponent.j3);
        wwg.c0(yf90Var, jSONObject, "filters", pskVar.t, jsonParserComponent.s3);
        wwg.b0(yf90Var, jSONObject, "focus", pskVar.u, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", pskVar.v, jsonParserComponent.T3);
        DivSize divSize = pskVar.w;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        a.g(yf90Var, jSONObject, "high_priority_preview_show", pskVar.x);
        wwg.c0(yf90Var, jSONObject, "hover_end_actions", pskVar.y, i3yVar);
        wwg.c0(yf90Var, jSONObject, "hover_start_actions", pskVar.z, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", pskVar.A);
        a.h(yf90Var, jSONObject, "image_url", pskVar.B, b.c);
        wwg.b0(yf90Var, jSONObject, "layout_provider", pskVar.C, jsonParserComponent.X4);
        wwg.c0(yf90Var, jSONObject, "longtap_actions", pskVar.D, i3yVar);
        DivEdgeInsets divEdgeInsets = pskVar.E;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "paddings", pskVar.F, i3yVar3);
        Expression expression3 = pskVar.G;
        tls tlsVar3 = b.a;
        a.h(yf90Var, jSONObject, "placeholder_color", expression3, tlsVar3);
        a.g(yf90Var, jSONObject, "preload_required", pskVar.H);
        wwg.c0(yf90Var, jSONObject, "press_end_actions", pskVar.I, i3yVar);
        wwg.c0(yf90Var, jSONObject, "press_start_actions", pskVar.J, i3yVar);
        a.g(yf90Var, jSONObject, "preview", pskVar.K);
        a.g(yf90Var, jSONObject, "reuse_id", pskVar.L);
        a.g(yf90Var, jSONObject, "row_span", pskVar.M);
        a.h(yf90Var, jSONObject, "scale", pskVar.N, DivImageScale.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "selected_actions", pskVar.O, i3yVar);
        a.h(yf90Var, jSONObject, "tint_color", pskVar.P, tlsVar3);
        a.h(yf90Var, jSONObject, "tint_mode", pskVar.Q, DivBlendMode.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "tooltips", pskVar.R, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", pskVar.S, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", pskVar.T, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", pskVar.U, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = pskVar.V;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", pskVar.W, i3yVar4);
        wwg.d0(yf90Var, jSONObject, pskVar.X, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "image");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", pskVar.Y, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", pskVar.Z, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", pskVar.a0, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = pskVar.b0;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", pskVar.c0, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", pskVar.d0, i3yVar2);
        return jSONObject;
    }
}
