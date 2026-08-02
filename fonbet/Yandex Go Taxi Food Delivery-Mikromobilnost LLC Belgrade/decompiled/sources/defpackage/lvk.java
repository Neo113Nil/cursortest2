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
import com.yandex.div2.DivInput$Autocapitalization;
import com.yandex.div2.DivInput$EnterKeyType;
import com.yandex.div2.DivInput$KeyboardType;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.d1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lvk implements qfy0 {
    public final JsonParserComponent a;

    public lvk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v36, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v41, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v43, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v62, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v65, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v67, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v69, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v86, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final muk a(yf90 yf90Var, bwk bwkVar, JSONObject jSONObject) {
        exq exqVar = bwkVar.a;
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
        exq exqVar2 = bwkVar.b;
        qkj qkjVar = d1.q;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        Expression l = xcx.l(yf90Var, exqVar2, jSONObject, "alignment_horizontal", qkjVar, tlsVar);
        exq exqVar3 = bwkVar.c;
        qkj qkjVar2 = d1.r;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression l2 = xcx.l(yf90Var, exqVar3, jSONObject, "alignment_vertical", qkjVar2, tlsVar2);
        exq exqVar4 = bwkVar.d;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        z3k z3kVar = d1.A;
        kvo kvoVar = d1.a;
        ?? n = xcx.n(yf90Var, exqVar4, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, z3kVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s = xcx.s(yf90Var, bwkVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        exq exqVar5 = bwkVar.f;
        qkj qkjVar3 = d1.s;
        tls tlsVar4 = DivInput$Autocapitalization.FROM_STRING;
        kvo kvoVar3 = d1.b;
        ?? o = xcx.o(yf90Var, exqVar5, jSONObject, "autocapitalization", qkjVar3, tlsVar4, kvoVar3);
        kvo kvoVar4 = o == 0 ? kvoVar3 : o;
        List s2 = xcx.s(yf90Var, bwkVar.g, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, bwkVar.h, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar6 = bwkVar.i;
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression m = xcx.m(yf90Var, exqVar6, jSONObject, "column_span", tmsVar, tlsVar5, d1.B);
        List s3 = xcx.s(yf90Var, bwkVar.j, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, bwkVar.k, jSONObject, "enter_key_actions", i3yVar11, i3yVar10);
        exq exqVar7 = bwkVar.l;
        qkj qkjVar4 = d1.t;
        tls tlsVar6 = DivInput$EnterKeyType.FROM_STRING;
        kvo kvoVar5 = d1.c;
        ?? o2 = xcx.o(yf90Var, exqVar7, jSONObject, "enter_key_type", qkjVar4, tlsVar6, kvoVar5);
        kvo kvoVar6 = o2 == 0 ? kvoVar5 : o2;
        List s5 = xcx.s(yf90Var, bwkVar.m, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        List s6 = xcx.s(yf90Var, bwkVar.n, jSONObject, "filters", jsonParserComponent.C4, jsonParserComponent.A4);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, bwkVar.o, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        exq exqVar8 = bwkVar.p;
        ums umsVar = wm11.c;
        Expression k = xcx.k(yf90Var, exqVar8, jSONObject, "font_family", umsVar);
        exq exqVar9 = bwkVar.q;
        z3k z3kVar2 = d1.C;
        kvo kvoVar7 = d1.d;
        ?? n2 = xcx.n(yf90Var, exqVar9, jSONObject, "font_size", tmsVar, tlsVar5, z3kVar2, kvoVar7);
        if (n2 != 0) {
            kvoVar7 = n2;
        }
        exq exqVar10 = bwkVar.r;
        qkj qkjVar5 = d1.u;
        tls tlsVar7 = DivSizeUnit.FROM_STRING;
        kvo kvoVar8 = d1.e;
        ?? o3 = xcx.o(yf90Var, exqVar10, jSONObject, "font_size_unit", qkjVar5, tlsVar7, kvoVar8);
        kvo kvoVar9 = o3 == 0 ? kvoVar8 : o3;
        Expression k2 = xcx.k(yf90Var, bwkVar.s, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h);
        Expression l3 = xcx.l(yf90Var, bwkVar.t, jSONObject, FontsContractCompat$Columns.WEIGHT, d1.v, DivFontWeight.FROM_STRING);
        Expression m2 = xcx.m(yf90Var, bwkVar.u, jSONObject, "font_weight_value", tmsVar, tlsVar5, d1.D);
        List s7 = xcx.s(yf90Var, bwkVar.v, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, bwkVar.w, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = d1.f;
        }
        DivSize divSize2 = divSize;
        exq exqVar11 = bwkVar.x;
        rms rmsVar = wm11.f;
        tls tlsVar8 = b.b;
        Expression l4 = xcx.l(yf90Var, exqVar11, jSONObject, "highlight_color", rmsVar, tlsVar8);
        exq exqVar12 = bwkVar.y;
        kvo kvoVar10 = d1.g;
        ?? o4 = xcx.o(yf90Var, exqVar12, jSONObject, "hint_color", rmsVar, tlsVar8, kvoVar10);
        kvo kvoVar11 = o4 == 0 ? kvoVar10 : o4;
        Expression k3 = xcx.k(yf90Var, bwkVar.z, jSONObject, "hint_text", umsVar);
        exq exqVar13 = bwkVar.A;
        abl0 abl0Var = q5z.c;
        String str = (String) xcx.i(exqVar13, abl0Var, yf90Var, "id", jSONObject);
        exq exqVar14 = bwkVar.B;
        wms wmsVar = wm11.a;
        tls tlsVar9 = b.f;
        kvo kvoVar12 = d1.h;
        kvo kvoVar13 = kvoVar7;
        ?? o5 = xcx.o(yf90Var, exqVar14, jSONObject, "is_enabled", wmsVar, tlsVar9, kvoVar12);
        kvo kvoVar14 = o5 == 0 ? kvoVar12 : o5;
        exq exqVar15 = bwkVar.C;
        qkj qkjVar6 = d1.w;
        tls tlsVar10 = DivInput$KeyboardType.FROM_STRING;
        kvo kvoVar15 = d1.i;
        ?? o6 = xcx.o(yf90Var, exqVar15, jSONObject, "keyboard_type", qkjVar6, tlsVar10, kvoVar15);
        kvo kvoVar16 = o6 == 0 ? kvoVar15 : o6;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, bwkVar.D, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        exq exqVar16 = bwkVar.E;
        kvo kvoVar17 = d1.j;
        ?? o7 = xcx.o(yf90Var, exqVar16, jSONObject, "letter_spacing", smsVar, tlsVar3, kvoVar17);
        kvo kvoVar18 = o7 == 0 ? kvoVar17 : o7;
        Expression m3 = xcx.m(yf90Var, bwkVar.F, jSONObject, "line_height", tmsVar, tlsVar5, d1.E);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, bwkVar.G, jSONObject, "margins", i3yVar7, i3yVar6);
        pvk pvkVar = (pvk) xcx.h(yf90Var, bwkVar.H, jSONObject, "mask", jsonParserComponent.F4, jsonParserComponent.D4);
        Expression m4 = xcx.m(yf90Var, bwkVar.I, jSONObject, "max_length", tmsVar, tlsVar5, d1.F);
        Expression m5 = xcx.m(yf90Var, bwkVar.J, jSONObject, "max_visible_lines", tmsVar, tlsVar5, d1.G);
        luk lukVar = (luk) xcx.h(yf90Var, bwkVar.K, jSONObject, "native_interface", jsonParserComponent.W4, jsonParserComponent.U4);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, bwkVar.L, jSONObject, "paddings", i3yVar7, i3yVar6);
        Expression k4 = xcx.k(yf90Var, bwkVar.M, jSONObject, "reuse_id", umsVar);
        Expression m6 = xcx.m(yf90Var, bwkVar.N, jSONObject, "row_span", tmsVar, tlsVar5, d1.H);
        exq exqVar17 = bwkVar.O;
        kvo kvoVar19 = d1.k;
        ?? o8 = xcx.o(yf90Var, exqVar17, jSONObject, "select_all_on_focus", wmsVar, tlsVar9, kvoVar19);
        kvo kvoVar20 = o8 == 0 ? kvoVar19 : o8;
        List s8 = xcx.s(yf90Var, bwkVar.P, jSONObject, "selected_actions", i3yVar11, i3yVar10);
        exq exqVar18 = bwkVar.Q;
        qkj qkjVar7 = d1.x;
        kvo kvoVar21 = d1.l;
        ?? o9 = xcx.o(yf90Var, exqVar18, jSONObject, "text_alignment_horizontal", qkjVar7, tlsVar, kvoVar21);
        kvo kvoVar22 = o9 == 0 ? kvoVar21 : o9;
        exq exqVar19 = bwkVar.R;
        qkj qkjVar8 = d1.y;
        kvo kvoVar23 = d1.m;
        ?? o10 = xcx.o(yf90Var, exqVar19, jSONObject, "text_alignment_vertical", qkjVar8, tlsVar2, kvoVar23);
        kvo kvoVar24 = o10 == 0 ? kvoVar23 : o10;
        exq exqVar20 = bwkVar.S;
        kvo kvoVar25 = d1.n;
        ?? o11 = xcx.o(yf90Var, exqVar20, jSONObject, "text_color", rmsVar, tlsVar8, kvoVar25);
        kvo kvoVar26 = o11 == 0 ? kvoVar25 : o11;
        String str2 = (String) xcx.a(bwkVar.T, jSONObject, "text_variable", abl0Var, q5z.b);
        List s9 = xcx.s(yf90Var, bwkVar.U, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, bwkVar.V, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s10 = xcx.s(yf90Var, bwkVar.W, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, bwkVar.X, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, bwkVar.Y, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, bwkVar.Z, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, bwkVar.a0, jSONObject, DivTransitionTrigger.FROM_STRING, d1.I);
        List s11 = xcx.s(yf90Var, bwkVar.b0, jSONObject, "validators", jsonParserComponent.Q4, jsonParserComponent.O4);
        List s12 = xcx.s(yf90Var, bwkVar.c0, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s13 = xcx.s(yf90Var, bwkVar.d0, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar21 = bwkVar.e0;
        qkj qkjVar9 = d1.z;
        tls tlsVar11 = DivVisibility.FROM_STRING;
        kvo kvoVar27 = d1.o;
        ?? o12 = xcx.o(yf90Var, exqVar21, jSONObject, "visibility", qkjVar9, tlsVar11, kvoVar27);
        if (o12 != 0) {
            kvoVar27 = o12;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, bwkVar.f0, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s14 = xcx.s(yf90Var, bwkVar.g0, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, bwkVar.h0, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = d1.p;
        }
        return new muk(divAccessibility, l, l2, kvoVar2, s, kvoVar4, s2, divBorder, m, s3, s4, kvoVar6, s5, s6, divFocus, k, kvoVar13, kvoVar9, k2, l3, m2, s7, divSize2, l4, kvoVar11, k3, str, kvoVar14, kvoVar16, divLayoutProvider, kvoVar18, m3, divEdgeInsets, pvkVar, m4, m5, lukVar, divEdgeInsets2, k4, m6, kvoVar20, s8, kvoVar22, kvoVar24, kvoVar26, str2, s9, divTransform, s10, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s11, s12, s13, kvoVar27, divVisibilityAction, s14, divSize3);
    }
}
