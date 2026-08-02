package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSeparator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.exq;
import defpackage.i3y;
import defpackage.k8l;
import defpackage.kvo;
import defpackage.pdk;
import defpackage.q5z;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.sms;
import defpackage.tls;
import defpackage.tms;
import defpackage.v3k;
import defpackage.wm11;
import defpackage.wms;
import defpackage.xcx;
import defpackage.yf90;
import defpackage.zrk;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u1 implements qfy0 {
    public final JsonParserComponent a;

    public u1(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v62, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivSeparator a(yf90 yf90Var, k8l k8lVar, JSONObject jSONObject) {
        exq exqVar = k8lVar.a;
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
        exq exqVar2 = k8lVar.b;
        i3y i3yVar10 = jsonParserComponent.v1;
        i3y i3yVar11 = jsonParserComponent.t1;
        v3k v3kVar = (v3k) xcx.h(yf90Var, exqVar2, jSONObject, "action", i3yVar10, i3yVar11);
        pdk pdkVar = (pdk) xcx.h(yf90Var, k8lVar.c, jSONObject, "action_animation", jsonParserComponent.B1, jsonParserComponent.z1);
        if (pdkVar == null) {
            pdkVar = v1.a;
        }
        pdk pdkVar2 = pdkVar;
        List s = xcx.s(yf90Var, k8lVar.d, jSONObject, "actions", i3yVar10, i3yVar11);
        Expression l = xcx.l(yf90Var, k8lVar.e, jSONObject, "alignment_horizontal", v1.g, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, k8lVar.f, jSONObject, "alignment_vertical", v1.h, DivAlignmentVertical.FROM_STRING);
        exq exqVar3 = k8lVar.g;
        sms smsVar = wm11.d;
        tls tlsVar = com.yandex.div.internal.parser.b.g;
        zrk zrkVar = v1.j;
        kvo kvoVar = v1.b;
        ?? n = xcx.n(yf90Var, exqVar3, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, zrkVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s2 = xcx.s(yf90Var, k8lVar.h, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s3 = xcx.s(yf90Var, k8lVar.i, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, k8lVar.j, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar4 = k8lVar.k;
        wms wmsVar = wm11.a;
        tls tlsVar2 = com.yandex.div.internal.parser.b.f;
        kvo kvoVar2 = v1.c;
        ?? o = xcx.o(yf90Var, exqVar4, jSONObject, "capture_focus_on_action", wmsVar, tlsVar2, kvoVar2);
        kvo kvoVar3 = o == 0 ? kvoVar2 : o;
        exq exqVar5 = k8lVar.l;
        tms tmsVar = wm11.b;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        Expression m = xcx.m(yf90Var, exqVar5, jSONObject, "column_span", tmsVar, tlsVar3, v1.k);
        DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) xcx.h(yf90Var, k8lVar.m, jSONObject, "delimiter_style", jsonParserComponent.b7, jsonParserComponent.Z6);
        List s4 = xcx.s(yf90Var, k8lVar.n, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s5 = xcx.s(yf90Var, k8lVar.o, jSONObject, "doubletap_actions", i3yVar10, i3yVar11);
        List s6 = xcx.s(yf90Var, k8lVar.p, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, k8lVar.q, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s7 = xcx.s(yf90Var, k8lVar.r, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, k8lVar.s, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = v1.d;
        }
        DivSize divSize2 = divSize;
        List s8 = xcx.s(yf90Var, k8lVar.t, jSONObject, "hover_end_actions", i3yVar10, i3yVar11);
        List s9 = xcx.s(yf90Var, k8lVar.u, jSONObject, "hover_start_actions", i3yVar10, i3yVar11);
        String str = (String) xcx.i(k8lVar.v, q5z.c, yf90Var, "id", jSONObject);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, k8lVar.w, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        List s10 = xcx.s(yf90Var, k8lVar.x, jSONObject, "longtap_actions", i3yVar10, i3yVar11);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, k8lVar.y, jSONObject, "margins", i3yVar7, i3yVar6);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, k8lVar.z, jSONObject, "paddings", i3yVar7, i3yVar6);
        List s11 = xcx.s(yf90Var, k8lVar.A, jSONObject, "press_end_actions", i3yVar10, i3yVar11);
        List s12 = xcx.s(yf90Var, k8lVar.B, jSONObject, "press_start_actions", i3yVar10, i3yVar11);
        Expression k = xcx.k(yf90Var, k8lVar.C, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, k8lVar.D, jSONObject, "row_span", tmsVar, tlsVar3, v1.l);
        List s13 = xcx.s(yf90Var, k8lVar.E, jSONObject, "selected_actions", i3yVar10, i3yVar11);
        List s14 = xcx.s(yf90Var, k8lVar.F, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, k8lVar.G, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s15 = xcx.s(yf90Var, k8lVar.H, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, k8lVar.I, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, k8lVar.J, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, k8lVar.K, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, k8lVar.L, jSONObject, DivTransitionTrigger.FROM_STRING, v1.m);
        List s16 = xcx.s(yf90Var, k8lVar.M, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s17 = xcx.s(yf90Var, k8lVar.N, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar6 = k8lVar.O;
        qkj qkjVar = v1.i;
        tls tlsVar4 = DivVisibility.FROM_STRING;
        kvo kvoVar4 = v1.e;
        ?? o2 = xcx.o(yf90Var, exqVar6, jSONObject, "visibility", qkjVar, tlsVar4, kvoVar4);
        if (o2 != 0) {
            kvoVar4 = o2;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, k8lVar.P, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s18 = xcx.s(yf90Var, k8lVar.Q, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, k8lVar.R, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = v1.f;
        }
        return new DivSeparator(divAccessibility, v3kVar, pdkVar2, s, l, l2, kvoVar, s2, s3, divBorder, kvoVar3, m, delimiterStyle, s4, s5, s6, divFocus, s7, divSize2, s8, s9, str, divLayoutProvider, s10, divEdgeInsets, divEdgeInsets2, s11, s12, k, m2, s13, s14, divTransform, s15, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s16, s17, kvoVar4, divVisibilityAction, s18, divSize3);
    }
}
