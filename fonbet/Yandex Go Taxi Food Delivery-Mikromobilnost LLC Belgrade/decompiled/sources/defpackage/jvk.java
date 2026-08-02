package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.a;
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

/* loaded from: classes11.dex */
public final class jvk implements zsq0, nyi {
    public final JsonParserComponent a;

    public jvk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v62, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v65, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v67, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v69, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v86, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final muk a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        i3y i3yVar6 = jsonParserComponent.t1;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = d1.q;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        qkj qkjVar2 = d1.r;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", qkjVar2, tlsVar2, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        z3k z3kVar = d1.A;
        kvo kvoVar = d1.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar3, z3kVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        qkj qkjVar3 = d1.s;
        tls tlsVar4 = DivInput$Autocapitalization.FROM_STRING;
        kvo kvoVar3 = d1.b;
        ?? e4 = a.e(yf90Var, jSONObject, "autocapitalization", qkjVar3, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar5 = b.h;
        Expression e5 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar5, d1.B, null);
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "enter_key_actions", i3yVar6);
        qkj qkjVar4 = d1.t;
        tls tlsVar6 = DivInput$EnterKeyType.FROM_STRING;
        kvo kvoVar5 = d1.c;
        ?? e6 = a.e(yf90Var, jSONObject, "enter_key_type", qkjVar4, tlsVar6, kbsVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        List O5 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        List O6 = wwg.O(yf90Var, jSONObject, "filters", jsonParserComponent.A4);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression e7 = a.e(yf90Var, jSONObject, "font_family", umsVar, abl0Var, kbsVar, null);
        z3k z3kVar2 = d1.C;
        kvo kvoVar7 = d1.d;
        ?? e8 = a.e(yf90Var, jSONObject, "font_size", tmsVar, tlsVar5, z3kVar2, kvoVar7);
        kvo kvoVar8 = e8 == 0 ? kvoVar7 : e8;
        qkj qkjVar5 = d1.u;
        tls tlsVar7 = DivSizeUnit.FROM_STRING;
        kvo kvoVar9 = d1.e;
        ?? e9 = a.e(yf90Var, jSONObject, "font_size_unit", qkjVar5, tlsVar7, kbsVar, kvoVar9);
        kvo kvoVar10 = e9 == 0 ? kvoVar9 : e9;
        Expression e10 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, abl0Var, kbsVar, null);
        Expression e11 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, d1.v, DivFontWeight.FROM_STRING, kbsVar, null);
        Expression e12 = a.e(yf90Var, jSONObject, "font_weight_value", tmsVar, tlsVar5, d1.D, null);
        List O7 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = d1.f;
        }
        DivSize divSize2 = divSize;
        rms rmsVar = wm11.f;
        tls tlsVar8 = b.b;
        Expression e13 = a.e(yf90Var, jSONObject, "highlight_color", rmsVar, tlsVar8, kbsVar, null);
        kvo kvoVar11 = d1.g;
        ?? e14 = a.e(yf90Var, jSONObject, "hint_color", rmsVar, tlsVar8, kbsVar, kvoVar11);
        kvo kvoVar12 = e14 == 0 ? kvoVar11 : e14;
        Expression e15 = a.e(yf90Var, jSONObject, "hint_text", umsVar, abl0Var, kbsVar, null);
        Object opt = jSONObject.opt("id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        wms wmsVar = wm11.a;
        tls tlsVar9 = b.f;
        kvo kvoVar13 = d1.h;
        ?? e16 = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar9, kbsVar, kvoVar13);
        kvo kvoVar14 = e16 == 0 ? kvoVar13 : e16;
        qkj qkjVar6 = d1.w;
        tls tlsVar10 = DivInput$KeyboardType.FROM_STRING;
        kvo kvoVar15 = d1.i;
        ?? e17 = a.e(yf90Var, jSONObject, "keyboard_type", qkjVar6, tlsVar10, kbsVar, kvoVar15);
        kvo kvoVar16 = e17 == 0 ? kvoVar15 : e17;
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        kvo kvoVar17 = d1.j;
        ?? e18 = a.e(yf90Var, jSONObject, "letter_spacing", smsVar, tlsVar3, kbsVar, kvoVar17);
        kvo kvoVar18 = e18 == 0 ? kvoVar17 : e18;
        Expression e19 = a.e(yf90Var, jSONObject, "line_height", tmsVar, tlsVar5, d1.E, null);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        pvk pvkVar = (pvk) wwg.M(yf90Var, jSONObject, "mask", jsonParserComponent.D4);
        Expression e20 = a.e(yf90Var, jSONObject, "max_length", tmsVar, tlsVar5, d1.F, null);
        Expression e21 = a.e(yf90Var, jSONObject, "max_visible_lines", tmsVar, tlsVar5, d1.G, null);
        luk lukVar = (luk) wwg.M(yf90Var, jSONObject, "native_interface", jsonParserComponent.U4);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        Expression e22 = a.e(yf90Var, jSONObject, "reuse_id", umsVar, abl0Var, kbsVar, null);
        Expression e23 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar5, d1.H, null);
        kvo kvoVar19 = d1.k;
        ?? e24 = a.e(yf90Var, jSONObject, "select_all_on_focus", wmsVar, tlsVar9, kbsVar, kvoVar19);
        kvo kvoVar20 = e24 == 0 ? kvoVar19 : e24;
        List O8 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        qkj qkjVar7 = d1.x;
        kvo kvoVar21 = d1.l;
        ?? e25 = a.e(yf90Var, jSONObject, "text_alignment_horizontal", qkjVar7, tlsVar, kbsVar, kvoVar21);
        kvo kvoVar22 = e25 == 0 ? kvoVar21 : e25;
        qkj qkjVar8 = d1.y;
        kvo kvoVar23 = d1.m;
        ?? e26 = a.e(yf90Var, jSONObject, "text_alignment_vertical", qkjVar8, tlsVar2, kbsVar, kvoVar23);
        kvo kvoVar24 = e26 == 0 ? kvoVar23 : e26;
        kvo kvoVar25 = d1.n;
        ?? e27 = a.e(yf90Var, jSONObject, "text_color", rmsVar, tlsVar8, kbsVar, kvoVar25);
        kvo kvoVar26 = e27 == 0 ? kvoVar25 : e27;
        Object opt2 = jSONObject.opt("text_variable");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw fg90.h("text_variable", jSONObject);
        }
        String str2 = (String) obj2;
        List O9 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O10 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, d1.I);
        List O11 = wwg.O(yf90Var, jSONObject, "validators", jsonParserComponent.O4);
        List O12 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O13 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar9 = d1.z;
        tls tlsVar11 = DivVisibility.FROM_STRING;
        kvo kvoVar27 = d1.o;
        ?? e28 = a.e(yf90Var, jSONObject, "visibility", qkjVar9, tlsVar11, kbsVar, kvoVar27);
        if (e28 != 0) {
            kvoVar27 = e28;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O14 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = d1.p;
        }
        return new muk(divAccessibility, e, e2, kvoVar2, O, kvoVar4, O2, divBorder, e5, O3, O4, kvoVar6, O5, O6, divFocus, e7, kvoVar8, kvoVar10, e10, e11, e12, O7, divSize2, e13, kvoVar12, e15, str, kvoVar14, kvoVar16, divLayoutProvider, kvoVar18, e19, divEdgeInsets, pvkVar, e20, e21, lukVar, divEdgeInsets2, e22, e23, kvoVar20, O8, kvoVar22, kvoVar24, kvoVar26, str2, O9, divTransform, O10, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O11, O12, O13, kvoVar27, divVisibilityAction, O14, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, muk mukVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = mukVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        Expression expression = mukVar.b;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_horizontal", expression, tlsVar);
        Expression expression2 = mukVar.c;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        a.h(yf90Var, jSONObject, "alignment_vertical", expression2, tlsVar2);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, mukVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", mukVar.e, jsonParserComponent.C1);
        a.h(yf90Var, jSONObject, "autocapitalization", mukVar.f, DivInput$Autocapitalization.TO_STRING);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, mukVar.g, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", mukVar.h, jsonParserComponent.U1);
        a.g(yf90Var, jSONObject, "column_span", mukVar.i);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", mukVar.j, jsonParserComponent.X2);
        List list = mukVar.k;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.c0(yf90Var, jSONObject, "enter_key_actions", list, i3yVar);
        a.h(yf90Var, jSONObject, "enter_key_type", mukVar.l, DivInput$EnterKeyType.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "extensions", mukVar.m, jsonParserComponent.j3);
        wwg.c0(yf90Var, jSONObject, "filters", mukVar.n, jsonParserComponent.A4);
        wwg.b0(yf90Var, jSONObject, "focus", mukVar.o, jsonParserComponent.K3);
        a.g(yf90Var, jSONObject, "font_family", mukVar.p);
        a.g(yf90Var, jSONObject, "font_size", mukVar.q);
        a.h(yf90Var, jSONObject, "font_size_unit", mukVar.r, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, mukVar.s);
        a.h(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, mukVar.t, DivFontWeight.TO_STRING);
        a.g(yf90Var, jSONObject, "font_weight_value", mukVar.u);
        wwg.c0(yf90Var, jSONObject, "functions", mukVar.v, jsonParserComponent.T3);
        DivSize divSize = mukVar.w;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        Expression expression3 = mukVar.x;
        tls tlsVar3 = b.a;
        a.h(yf90Var, jSONObject, "highlight_color", expression3, tlsVar3);
        a.h(yf90Var, jSONObject, "hint_color", mukVar.y, tlsVar3);
        a.g(yf90Var, jSONObject, "hint_text", mukVar.z);
        wwg.Z(yf90Var, jSONObject, "id", mukVar.A);
        a.g(yf90Var, jSONObject, "is_enabled", mukVar.B);
        a.h(yf90Var, jSONObject, "keyboard_type", mukVar.C, DivInput$KeyboardType.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "layout_provider", mukVar.D, jsonParserComponent.X4);
        a.g(yf90Var, jSONObject, "letter_spacing", mukVar.E);
        a.g(yf90Var, jSONObject, "line_height", mukVar.F);
        DivEdgeInsets divEdgeInsets = mukVar.G;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "mask", mukVar.H, jsonParserComponent.D4);
        a.g(yf90Var, jSONObject, "max_length", mukVar.I);
        a.g(yf90Var, jSONObject, "max_visible_lines", mukVar.J);
        wwg.b0(yf90Var, jSONObject, "native_interface", mukVar.K, jsonParserComponent.U4);
        wwg.b0(yf90Var, jSONObject, "paddings", mukVar.L, i3yVar3);
        a.g(yf90Var, jSONObject, "reuse_id", mukVar.M);
        a.g(yf90Var, jSONObject, "row_span", mukVar.N);
        a.g(yf90Var, jSONObject, "select_all_on_focus", mukVar.O);
        wwg.c0(yf90Var, jSONObject, "selected_actions", mukVar.P, i3yVar);
        a.h(yf90Var, jSONObject, "text_alignment_horizontal", mukVar.Q, tlsVar);
        a.h(yf90Var, jSONObject, "text_alignment_vertical", mukVar.R, tlsVar2);
        a.h(yf90Var, jSONObject, "text_color", mukVar.S, tlsVar3);
        wwg.Z(yf90Var, jSONObject, "text_variable", mukVar.T);
        wwg.c0(yf90Var, jSONObject, "tooltips", mukVar.U, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", mukVar.V, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", mukVar.W, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", mukVar.X, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = mukVar.Y;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", mukVar.Z, i3yVar4);
        wwg.d0(yf90Var, jSONObject, mukVar.a0, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "input");
        wwg.c0(yf90Var, jSONObject, "validators", mukVar.b0, jsonParserComponent.O4);
        wwg.c0(yf90Var, jSONObject, "variable_triggers", mukVar.c0, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", mukVar.d0, jsonParserComponent.F9);
        a.h(yf90Var, jSONObject, "visibility", mukVar.e0, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = mukVar.f0;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", mukVar.g0, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", mukVar.h0, i3yVar2);
        return jSONObject;
    }
}
