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
import com.yandex.div2.DivVideoScale;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.d3;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eol implements qfy0 {
    public final JsonParserComponent a;

    public eol(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v36, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v41, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v44, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v52, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v69, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ynl a(yf90 yf90Var, qol qolVar, JSONObject jSONObject) {
        exq exqVar = qolVar.a;
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
        i3y i3yVar10 = jsonParserComponent.t1;
        i3y i3yVar11 = jsonParserComponent.v1;
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, jsonParserComponent.H);
        Expression l = xcx.l(yf90Var, qolVar.b, jSONObject, "alignment_horizontal", d3.k, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, qolVar.c, jSONObject, "alignment_vertical", d3.l, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = qolVar.d;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        zgl zglVar = d3.o;
        kvo kvoVar = d3.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, zglVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s = xcx.s(yf90Var, qolVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        afk afkVar = (afk) xcx.h(yf90Var, qolVar.f, jSONObject, "aspect", jsonParserComponent.N1, jsonParserComponent.L1);
        exq exqVar3 = qolVar.g;
        wms wmsVar = wm11.a;
        tls tlsVar2 = b.f;
        kvo kvoVar3 = d3.b;
        ?? o = xcx.o(yf90Var, exqVar3, jSONObject, "autostart", wmsVar, tlsVar2, kvoVar3);
        kvo kvoVar4 = o == 0 ? kvoVar3 : o;
        List s2 = xcx.s(yf90Var, qolVar.h, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, qolVar.i, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        List s3 = xcx.s(yf90Var, qolVar.j, jSONObject, "buffering_actions", i3yVar11, i3yVar10);
        exq exqVar4 = qolVar.k;
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression m = xcx.m(yf90Var, exqVar4, jSONObject, "column_span", tmsVar, tlsVar3, d3.p);
        List s4 = xcx.s(yf90Var, qolVar.l, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        exq exqVar5 = qolVar.m;
        abl0 abl0Var = q5z.c;
        String str = (String) xcx.i(exqVar5, abl0Var, yf90Var, "elapsed_time_variable", jSONObject);
        List s5 = xcx.s(yf90Var, qolVar.n, jSONObject, "end_actions", i3yVar11, i3yVar10);
        List s6 = xcx.s(yf90Var, qolVar.o, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        List s7 = xcx.s(yf90Var, qolVar.p, jSONObject, "fatal_actions", i3yVar11, i3yVar10);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, qolVar.q, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s8 = xcx.s(yf90Var, qolVar.r, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, qolVar.s, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = d3.c;
        }
        DivSize divSize2 = divSize;
        String str2 = (String) xcx.i(qolVar.t, abl0Var, yf90Var, "id", jSONObject);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, qolVar.u, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, qolVar.v, jSONObject, "margins", i3yVar7, i3yVar6);
        exq exqVar6 = qolVar.w;
        kvo kvoVar5 = d3.d;
        ?? o2 = xcx.o(yf90Var, exqVar6, jSONObject, "muted", wmsVar, tlsVar2, kvoVar5);
        kvo kvoVar6 = o2 == 0 ? kvoVar5 : o2;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, qolVar.x, jSONObject, "paddings", i3yVar7, i3yVar6);
        List s9 = xcx.s(yf90Var, qolVar.y, jSONObject, "pause_actions", i3yVar11, i3yVar10);
        exq exqVar7 = qolVar.z;
        zgl zglVar2 = d3.q;
        kvo kvoVar7 = d3.e;
        ?? n2 = xcx.n(yf90Var, exqVar7, jSONObject, "playback_speed", smsVar, tlsVar, zglVar2, kvoVar7);
        if (n2 != 0) {
            kvoVar7 = n2;
        }
        Expression k = xcx.k(yf90Var, qolVar.A, jSONObject, "player_settings_payload", wm11.h);
        exq exqVar8 = qolVar.B;
        kvo kvoVar8 = d3.f;
        ?? o3 = xcx.o(yf90Var, exqVar8, jSONObject, "preload_required", wmsVar, tlsVar2, kvoVar8);
        kvo kvoVar9 = o3 == 0 ? kvoVar8 : o3;
        exq exqVar9 = qolVar.C;
        ums umsVar = wm11.c;
        Expression k2 = xcx.k(yf90Var, exqVar9, jSONObject, "preview", umsVar);
        exq exqVar10 = qolVar.D;
        kvo kvoVar10 = d3.g;
        kvo kvoVar11 = kvoVar7;
        ?? o4 = xcx.o(yf90Var, exqVar10, jSONObject, "repeatable", wmsVar, tlsVar2, kvoVar10);
        kvo kvoVar12 = o4 == 0 ? kvoVar10 : o4;
        List s10 = xcx.s(yf90Var, qolVar.E, jSONObject, "resume_actions", i3yVar11, i3yVar10);
        Expression k3 = xcx.k(yf90Var, qolVar.F, jSONObject, "reuse_id", umsVar);
        Expression m2 = xcx.m(yf90Var, qolVar.G, jSONObject, "row_span", tmsVar, tlsVar3, d3.r);
        exq exqVar11 = qolVar.H;
        qkj qkjVar = d3.m;
        tls tlsVar4 = DivVideoScale.FROM_STRING;
        kvo kvoVar13 = d3.h;
        ?? o5 = xcx.o(yf90Var, exqVar11, jSONObject, "scale", qkjVar, tlsVar4, kvoVar13);
        kvo kvoVar14 = o5 == 0 ? kvoVar13 : o5;
        List s11 = xcx.s(yf90Var, qolVar.I, jSONObject, "selected_actions", i3yVar11, i3yVar10);
        List s12 = xcx.s(yf90Var, qolVar.J, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, qolVar.K, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s13 = xcx.s(yf90Var, qolVar.L, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, qolVar.M, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, qolVar.N, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, qolVar.O, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, qolVar.P, jSONObject, DivTransitionTrigger.FROM_STRING, d3.s);
        List s14 = xcx.s(yf90Var, qolVar.Q, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s15 = xcx.s(yf90Var, qolVar.R, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        List s16 = xcx.s(yf90Var, qolVar.S, jSONObject, "video_sources", jsonParserComponent.K9, jsonParserComponent.I9);
        exq exqVar12 = qolVar.T;
        qkj qkjVar2 = d3.n;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar15 = d3.i;
        ?? o6 = xcx.o(yf90Var, exqVar12, jSONObject, "visibility", qkjVar2, tlsVar5, kvoVar15);
        if (o6 != 0) {
            kvoVar15 = o6;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, qolVar.U, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s17 = xcx.s(yf90Var, qolVar.V, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, qolVar.W, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = d3.j;
        }
        return new ynl(divAccessibility, l, l2, kvoVar2, s, afkVar, kvoVar4, s2, divBorder, s3, m, s4, str, s5, s6, s7, divFocus, s8, divSize2, str2, divLayoutProvider, divEdgeInsets, kvoVar6, divEdgeInsets2, s9, kvoVar11, k, kvoVar9, k2, kvoVar12, s10, k3, m2, kvoVar14, s11, s12, divTransform, s13, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s14, s15, s16, kvoVar15, divVisibilityAction, s17, divSize3);
    }
}
