package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
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
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.n1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b8l implements qfy0 {
    public final JsonParserComponent a;

    public b8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v36, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v64, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x7l a(yf90 yf90Var, f8l f8lVar, JSONObject jSONObject) {
        exq exqVar = f8lVar.a;
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
        Expression l = xcx.l(yf90Var, f8lVar.b, jSONObject, "alignment_horizontal", n1.j, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, f8lVar.c, jSONObject, "alignment_vertical", n1.k, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = f8lVar.d;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        ivk ivkVar = n1.o;
        kvo kvoVar = n1.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, ivkVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s = xcx.s(yf90Var, f8lVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, f8lVar.f, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, f8lVar.g, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar3 = f8lVar.h;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression m = xcx.m(yf90Var, exqVar3, jSONObject, "column_span", tmsVar, tlsVar2, n1.p);
        List s3 = xcx.s(yf90Var, f8lVar.i, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, f8lVar.j, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, f8lVar.k, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        exq exqVar4 = f8lVar.l;
        ums umsVar = wm11.c;
        Expression k = xcx.k(yf90Var, exqVar4, jSONObject, "font_family", umsVar);
        exq exqVar5 = f8lVar.m;
        ivk ivkVar2 = n1.q;
        kvo kvoVar3 = n1.b;
        ?? n2 = xcx.n(yf90Var, exqVar5, jSONObject, "font_size", tmsVar, tlsVar2, ivkVar2, kvoVar3);
        if (n2 != 0) {
            kvoVar3 = n2;
        }
        exq exqVar6 = f8lVar.n;
        qkj qkjVar = n1.l;
        tls tlsVar3 = DivSizeUnit.FROM_STRING;
        kvo kvoVar4 = n1.c;
        ?? o = xcx.o(yf90Var, exqVar6, jSONObject, "font_size_unit", qkjVar, tlsVar3, kvoVar4);
        kvo kvoVar5 = o == 0 ? kvoVar4 : o;
        Expression k2 = xcx.k(yf90Var, f8lVar.o, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h);
        Expression l3 = xcx.l(yf90Var, f8lVar.p, jSONObject, FontsContractCompat$Columns.WEIGHT, n1.m, DivFontWeight.FROM_STRING);
        Expression m2 = xcx.m(yf90Var, f8lVar.q, jSONObject, "font_weight_value", tmsVar, tlsVar2, n1.r);
        List s5 = xcx.s(yf90Var, f8lVar.r, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, f8lVar.s, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = n1.d;
        }
        DivSize divSize2 = divSize;
        exq exqVar7 = f8lVar.t;
        rms rmsVar = wm11.f;
        tls tlsVar4 = b.b;
        kvo kvoVar6 = n1.e;
        ?? o2 = xcx.o(yf90Var, exqVar7, jSONObject, "hint_color", rmsVar, tlsVar4, kvoVar6);
        kvo kvoVar7 = o2 == 0 ? kvoVar6 : o2;
        Expression k3 = xcx.k(yf90Var, f8lVar.u, jSONObject, "hint_text", umsVar);
        exq exqVar8 = f8lVar.v;
        abl0 abl0Var = q5z.c;
        String str = (String) xcx.i(exqVar8, abl0Var, yf90Var, "id", jSONObject);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, f8lVar.w, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        exq exqVar9 = f8lVar.x;
        kvo kvoVar8 = n1.f;
        kvo kvoVar9 = kvoVar3;
        ?? o3 = xcx.o(yf90Var, exqVar9, jSONObject, "letter_spacing", smsVar, tlsVar, kvoVar8);
        kvo kvoVar10 = o3 == 0 ? kvoVar8 : o3;
        Expression m3 = xcx.m(yf90Var, f8lVar.y, jSONObject, "line_height", tmsVar, tlsVar2, n1.s);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, f8lVar.z, jSONObject, "margins", i3yVar7, i3yVar6);
        List g = xcx.g(yf90Var, f8lVar.A, jSONObject, "options", jsonParserComponent.V6, jsonParserComponent.T6, n1.t);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, f8lVar.B, jSONObject, "paddings", i3yVar7, i3yVar6);
        Expression k4 = xcx.k(yf90Var, f8lVar.C, jSONObject, "reuse_id", umsVar);
        Expression m4 = xcx.m(yf90Var, f8lVar.D, jSONObject, "row_span", tmsVar, tlsVar2, n1.u);
        List s6 = xcx.s(yf90Var, f8lVar.E, jSONObject, "selected_actions", jsonParserComponent.v1, jsonParserComponent.t1);
        exq exqVar10 = f8lVar.F;
        kvo kvoVar11 = n1.g;
        ?? o4 = xcx.o(yf90Var, exqVar10, jSONObject, "text_color", rmsVar, tlsVar4, kvoVar11);
        kvo kvoVar12 = o4 == 0 ? kvoVar11 : o4;
        List s7 = xcx.s(yf90Var, f8lVar.G, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, f8lVar.H, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s8 = xcx.s(yf90Var, f8lVar.I, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, f8lVar.J, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, f8lVar.K, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, f8lVar.L, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, f8lVar.M, jSONObject, DivTransitionTrigger.FROM_STRING, n1.v);
        String str2 = (String) xcx.a(f8lVar.N, jSONObject, "value_variable", abl0Var, q5z.b);
        List s9 = xcx.s(yf90Var, f8lVar.O, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s10 = xcx.s(yf90Var, f8lVar.P, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar11 = f8lVar.Q;
        qkj qkjVar2 = n1.n;
        tls tlsVar5 = DivVisibility.FROM_STRING;
        kvo kvoVar13 = n1.h;
        ?? o5 = xcx.o(yf90Var, exqVar11, jSONObject, "visibility", qkjVar2, tlsVar5, kvoVar13);
        if (o5 != 0) {
            kvoVar13 = o5;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, f8lVar.R, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s11 = xcx.s(yf90Var, f8lVar.S, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, f8lVar.T, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = n1.i;
        }
        return new x7l(divAccessibility, l, l2, kvoVar2, s, s2, divBorder, m, s3, s4, divFocus, k, kvoVar9, kvoVar5, k2, l3, m2, s5, divSize2, kvoVar7, k3, str, divLayoutProvider, kvoVar10, m3, divEdgeInsets, g, divEdgeInsets2, k4, m4, s6, kvoVar12, s7, divTransform, s8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, str2, s9, s10, kvoVar13, divVisibilityAction, s11, divSize3);
    }
}
