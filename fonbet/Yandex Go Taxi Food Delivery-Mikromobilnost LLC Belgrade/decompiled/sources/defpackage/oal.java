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
import com.yandex.div2.e2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oal implements qfy0 {
    public final JsonParserComponent a;

    public oal(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v76, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hal a(yf90 yf90Var, tal talVar, JSONObject jSONObject) {
        exq exqVar = talVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.J;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.T9;
        i3y i3yVar4 = jsonParserComponent.I1;
        i3y i3yVar5 = jsonParserComponent.K1;
        i3y i3yVar6 = jsonParserComponent.x7;
        i3y i3yVar7 = jsonParserComponent.z7;
        i3y i3yVar8 = jsonParserComponent.g3;
        i3y i3yVar9 = jsonParserComponent.i3;
        i3y i3yVar10 = jsonParserComponent.o7;
        i3y i3yVar11 = jsonParserComponent.q7;
        i3y i3yVar12 = jsonParserComponent.t1;
        i3y i3yVar13 = jsonParserComponent.v1;
        i3y i3yVar14 = jsonParserComponent.d3;
        i3y i3yVar15 = jsonParserComponent.f3;
        i3y i3yVar16 = jsonParserComponent.H;
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, i3yVar16);
        Expression l = xcx.l(yf90Var, talVar.b, jSONObject, "alignment_horizontal", e2.h, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, talVar.c, jSONObject, "alignment_vertical", e2.i, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = talVar.d;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        y7l y7lVar = e2.k;
        kvo kvoVar = e2.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, y7lVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s = xcx.s(yf90Var, talVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, talVar.f, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, talVar.g, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar3 = talVar.h;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression m = xcx.m(yf90Var, exqVar3, jSONObject, "column_span", tmsVar, tlsVar2, e2.l);
        List s3 = xcx.s(yf90Var, talVar.i, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, talVar.j, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, talVar.k, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s5 = xcx.s(yf90Var, talVar.l, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, talVar.m, jSONObject, "height", i3yVar11, i3yVar10);
        if (divSize == null) {
            divSize = e2.b;
        }
        DivSize divSize2 = divSize;
        exq exqVar4 = talVar.n;
        abl0 abl0Var = q5z.c;
        String str = (String) xcx.i(exqVar4, abl0Var, yf90Var, "id", jSONObject);
        exq exqVar5 = talVar.o;
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar2 = e2.c;
        kvo kvoVar3 = kvoVar;
        ?? o = xcx.o(yf90Var, exqVar5, jSONObject, "is_enabled", wmsVar, tlsVar3, kvoVar2);
        kvo kvoVar4 = o == 0 ? kvoVar2 : o;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, talVar.p, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, talVar.q, jSONObject, "margins", i3yVar9, i3yVar8);
        exq exqVar6 = talVar.r;
        kvo kvoVar5 = e2.d;
        ?? o2 = xcx.o(yf90Var, exqVar6, jSONObject, "max_value", tmsVar, tlsVar2, kvoVar5);
        kvo kvoVar6 = o2 == 0 ? kvoVar5 : o2;
        exq exqVar7 = talVar.s;
        kvo kvoVar7 = e2.e;
        ?? o3 = xcx.o(yf90Var, exqVar7, jSONObject, "min_value", tmsVar, tlsVar2, kvoVar7);
        kvo kvoVar8 = o3 == 0 ? kvoVar7 : o3;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, talVar.t, jSONObject, "paddings", i3yVar9, i3yVar8);
        List s6 = xcx.s(yf90Var, talVar.u, jSONObject, "press_end_actions", i3yVar13, i3yVar12);
        List s7 = xcx.s(yf90Var, talVar.v, jSONObject, "press_start_actions", i3yVar13, i3yVar12);
        List s8 = xcx.s(yf90Var, talVar.w, jSONObject, "ranges", jsonParserComponent.C7, jsonParserComponent.A7);
        Expression k = xcx.k(yf90Var, talVar.x, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, talVar.y, jSONObject, "row_span", tmsVar, tlsVar2, e2.m);
        DivAccessibility divAccessibility2 = (DivAccessibility) xcx.h(yf90Var, talVar.z, jSONObject, "secondary_value_accessibility", jsonParserComponent.J, i3yVar16);
        List s9 = xcx.s(yf90Var, talVar.A, jSONObject, "selected_actions", i3yVar13, i3yVar12);
        aok aokVar = (aok) xcx.h(yf90Var, talVar.B, jSONObject, "thumb_secondary_style", i3yVar15, i3yVar14);
        gal galVar = (gal) xcx.h(yf90Var, talVar.C, jSONObject, "thumb_secondary_text_style", i3yVar7, i3yVar6);
        String str2 = (String) xcx.i(talVar.D, abl0Var, yf90Var, "thumb_secondary_value_variable", jSONObject);
        aok aokVar2 = (aok) xcx.b(yf90Var, talVar.E, jSONObject, "thumb_style", i3yVar15, i3yVar14);
        gal galVar2 = (gal) xcx.h(yf90Var, talVar.F, jSONObject, "thumb_text_style", i3yVar7, i3yVar6);
        String str3 = (String) xcx.i(talVar.G, abl0Var, yf90Var, "thumb_value_variable", jSONObject);
        aok aokVar3 = (aok) xcx.h(yf90Var, talVar.H, jSONObject, "tick_mark_active_style", i3yVar15, i3yVar14);
        aok aokVar4 = (aok) xcx.h(yf90Var, talVar.I, jSONObject, "tick_mark_inactive_style", i3yVar15, i3yVar14);
        List s10 = xcx.s(yf90Var, talVar.J, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        aok aokVar5 = (aok) xcx.b(yf90Var, talVar.K, jSONObject, "track_active_style", i3yVar15, i3yVar14);
        aok aokVar6 = (aok) xcx.b(yf90Var, talVar.L, jSONObject, "track_inactive_style", i3yVar15, i3yVar14);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, talVar.M, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s11 = xcx.s(yf90Var, talVar.N, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, talVar.O, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, talVar.P, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, talVar.Q, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, talVar.R, jSONObject, DivTransitionTrigger.FROM_STRING, e2.n);
        List s12 = xcx.s(yf90Var, talVar.S, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s13 = xcx.s(yf90Var, talVar.T, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar8 = talVar.U;
        qkj qkjVar = e2.j;
        tls tlsVar4 = DivVisibility.FROM_STRING;
        kvo kvoVar9 = e2.f;
        ?? o4 = xcx.o(yf90Var, exqVar8, jSONObject, "visibility", qkjVar, tlsVar4, kvoVar9);
        if (o4 != 0) {
            kvoVar9 = o4;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, talVar.V, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s14 = xcx.s(yf90Var, talVar.W, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, talVar.X, jSONObject, "width", i3yVar11, i3yVar10);
        if (divSize3 == null) {
            divSize3 = e2.g;
        }
        return new hal(divAccessibility, l, l2, kvoVar3, s, s2, divBorder, m, s3, s4, divFocus, s5, divSize2, str, kvoVar4, divLayoutProvider, divEdgeInsets, kvoVar6, kvoVar8, divEdgeInsets2, s6, s7, s8, k, m2, divAccessibility2, s9, aokVar, galVar, str2, aokVar2, galVar2, str3, aokVar3, aokVar4, s10, aokVar5, aokVar6, divTransform, s11, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s12, s13, kvoVar9, divVisibilityAction, s14, divSize3);
    }
}
