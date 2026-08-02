package defpackage;

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
public final class ftk implements qfy0 {
    public final JsonParserComponent a;

    public ftk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v40, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v56, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v63, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v67, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v82, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final psk a(yf90 yf90Var, ttk ttkVar, JSONObject jSONObject) {
        exq exqVar = ttkVar.a;
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
        exq exqVar2 = ttkVar.b;
        i3y i3yVar10 = jsonParserComponent.v1;
        i3y i3yVar11 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) xcx.h(yf90Var, exqVar2, jSONObject, "action", i3yVar10, i3yVar11);
        pdk pdkVar = (pdk) xcx.h(yf90Var, ttkVar.c, jSONObject, "action_animation", jsonParserComponent.B1, jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = w0.a;
        }
        pdk pdkVar2 = pdkVar;
        List s = xcx.s(yf90Var, ttkVar.d, jSONObject, "actions", i3yVar10, i3yVar11);
        exq exqVar3 = ttkVar.e;
        qkj qkjVar = w0.n;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        Expression l = xcx.l(yf90Var, exqVar3, jSONObject, "alignment_horizontal", qkjVar, tlsVar);
        exq exqVar4 = ttkVar.f;
        qkj qkjVar2 = w0.o;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression l2 = xcx.l(yf90Var, exqVar4, jSONObject, "alignment_vertical", qkjVar2, tlsVar2);
        exq exqVar5 = ttkVar.g;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        zrk zrkVar = w0.u;
        kvo kvoVar = w0.b;
        ?? n = xcx.n(yf90Var, exqVar5, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, zrkVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s2 = xcx.s(yf90Var, ttkVar.h, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        hpk hpkVar = (hpk) xcx.h(yf90Var, ttkVar.i, jSONObject, "appearance_animation", jsonParserComponent.o3, jsonParserComponent.m3);
        afk afkVar = (afk) xcx.h(yf90Var, ttkVar.j, jSONObject, "aspect", jsonParserComponent.N1, jsonParserComponent.L1);
        List s3 = xcx.s(yf90Var, ttkVar.k, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, ttkVar.l, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar6 = ttkVar.m;
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar2 = w0.c;
        ?? o = xcx.o(yf90Var, exqVar6, jSONObject, "capture_focus_on_action", wmsVar, tlsVar4, kvoVar2);
        kvo kvoVar3 = o == 0 ? kvoVar2 : o;
        exq exqVar7 = ttkVar.n;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression m = xcx.m(yf90Var, exqVar7, jSONObject, "column_span", tmsVar, tlsVar5, w0.v);
        exq exqVar8 = ttkVar.o;
        qkj qkjVar3 = w0.p;
        kvo kvoVar4 = w0.d;
        ?? o2 = xcx.o(yf90Var, exqVar8, jSONObject, "content_alignment_horizontal", qkjVar3, tlsVar, kvoVar4);
        kvo kvoVar5 = o2 == 0 ? kvoVar4 : o2;
        exq exqVar9 = ttkVar.p;
        qkj qkjVar4 = w0.q;
        kvo kvoVar6 = w0.e;
        ?? o3 = xcx.o(yf90Var, exqVar9, jSONObject, "content_alignment_vertical", qkjVar4, tlsVar2, kvoVar6);
        kvo kvoVar7 = o3 == 0 ? kvoVar6 : o3;
        List s4 = xcx.s(yf90Var, ttkVar.q, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s5 = xcx.s(yf90Var, ttkVar.r, jSONObject, "doubletap_actions", i3yVar10, i3yVar11);
        List s6 = xcx.s(yf90Var, ttkVar.s, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        List s7 = xcx.s(yf90Var, ttkVar.t, jSONObject, "filters", jsonParserComponent.u3, jsonParserComponent.s3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, ttkVar.u, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s8 = xcx.s(yf90Var, ttkVar.v, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, ttkVar.w, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = w0.f;
        }
        DivSize divSize2 = divSize;
        exq exqVar10 = ttkVar.x;
        kvo kvoVar8 = w0.g;
        ?? o4 = xcx.o(yf90Var, exqVar10, jSONObject, "high_priority_preview_show", wmsVar, tlsVar4, kvoVar8);
        kvo kvoVar9 = o4 == 0 ? kvoVar8 : o4;
        List s9 = xcx.s(yf90Var, ttkVar.y, jSONObject, "hover_end_actions", i3yVar10, i3yVar11);
        List s10 = xcx.s(yf90Var, ttkVar.z, jSONObject, "hover_start_actions", i3yVar10, i3yVar11);
        String str = (String) xcx.i(ttkVar.A, q5z.c, yf90Var, "id", jSONObject);
        Expression d = xcx.d(yf90Var, ttkVar.B, jSONObject, "image_url", wm11.e, b.e);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, ttkVar.C, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        List s11 = xcx.s(yf90Var, ttkVar.D, jSONObject, "longtap_actions", i3yVar10, i3yVar11);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, ttkVar.E, jSONObject, "margins", i3yVar7, i3yVar6);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, ttkVar.F, jSONObject, "paddings", i3yVar7, i3yVar6);
        exq exqVar11 = ttkVar.G;
        rms rmsVar = wm11.f;
        tls tlsVar6 = b.b;
        kvo kvoVar10 = w0.h;
        ?? o5 = xcx.o(yf90Var, exqVar11, jSONObject, "placeholder_color", rmsVar, tlsVar6, kvoVar10);
        kvo kvoVar11 = o5 == 0 ? kvoVar10 : o5;
        exq exqVar12 = ttkVar.H;
        kvo kvoVar12 = w0.i;
        ?? o6 = xcx.o(yf90Var, exqVar12, jSONObject, "preload_required", wmsVar, tlsVar4, kvoVar12);
        kvo kvoVar13 = o6 == 0 ? kvoVar12 : o6;
        List s12 = xcx.s(yf90Var, ttkVar.I, jSONObject, "press_end_actions", i3yVar10, i3yVar11);
        List s13 = xcx.s(yf90Var, ttkVar.J, jSONObject, "press_start_actions", i3yVar10, i3yVar11);
        exq exqVar13 = ttkVar.K;
        ums umsVar = wm11.c;
        Expression k = xcx.k(yf90Var, exqVar13, jSONObject, "preview", umsVar);
        Expression k2 = xcx.k(yf90Var, ttkVar.L, jSONObject, "reuse_id", umsVar);
        Expression m2 = xcx.m(yf90Var, ttkVar.M, jSONObject, "row_span", tmsVar, tlsVar5, w0.w);
        exq exqVar14 = ttkVar.N;
        qkj qkjVar5 = w0.r;
        tls tlsVar7 = DivImageScale.FROM_STRING;
        kvo kvoVar14 = w0.j;
        ?? o7 = xcx.o(yf90Var, exqVar14, jSONObject, "scale", qkjVar5, tlsVar7, kvoVar14);
        kvo kvoVar15 = o7 == 0 ? kvoVar14 : o7;
        List s14 = xcx.s(yf90Var, ttkVar.O, jSONObject, "selected_actions", i3yVar10, i3yVar11);
        Expression l3 = xcx.l(yf90Var, ttkVar.P, jSONObject, "tint_color", rmsVar, tlsVar6);
        exq exqVar15 = ttkVar.Q;
        qkj qkjVar6 = w0.s;
        tls tlsVar8 = DivBlendMode.FROM_STRING;
        kvo kvoVar16 = w0.k;
        ?? o8 = xcx.o(yf90Var, exqVar15, jSONObject, "tint_mode", qkjVar6, tlsVar8, kvoVar16);
        kvo kvoVar17 = o8 == 0 ? kvoVar16 : o8;
        List s15 = xcx.s(yf90Var, ttkVar.R, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, ttkVar.S, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s16 = xcx.s(yf90Var, ttkVar.T, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, ttkVar.U, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, ttkVar.V, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, ttkVar.W, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, ttkVar.X, jSONObject, DivTransitionTrigger.FROM_STRING, w0.x);
        List s17 = xcx.s(yf90Var, ttkVar.Y, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s18 = xcx.s(yf90Var, ttkVar.Z, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar16 = ttkVar.a0;
        qkj qkjVar7 = w0.t;
        tls tlsVar9 = DivVisibility.FROM_STRING;
        kvo kvoVar18 = w0.l;
        ?? o9 = xcx.o(yf90Var, exqVar16, jSONObject, "visibility", qkjVar7, tlsVar9, kvoVar18);
        if (o9 != 0) {
            kvoVar18 = o9;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, ttkVar.b0, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s19 = xcx.s(yf90Var, ttkVar.c0, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, ttkVar.d0, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = w0.m;
        }
        return new psk(divAccessibility, v3kVar, pdkVar2, s, l, l2, kvoVar, s2, hpkVar, afkVar, s3, divBorder, kvoVar3, m, kvoVar5, kvoVar7, s4, s5, s6, s7, divFocus, s8, divSize2, kvoVar9, s9, s10, str, d, divLayoutProvider, s11, divEdgeInsets, divEdgeInsets2, kvoVar11, kvoVar13, s12, s13, k, k2, m2, kvoVar15, s14, l3, kvoVar17, s15, divTransform, s16, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s17, s18, kvoVar18, divVisibilityAction, s19, divSize3);
    }
}
