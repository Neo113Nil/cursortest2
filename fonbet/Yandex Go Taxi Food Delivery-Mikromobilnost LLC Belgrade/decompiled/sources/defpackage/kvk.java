package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivInput$Autocapitalization;
import com.yandex.div2.DivInput$EnterKeyType;
import com.yandex.div2.DivInput$KeyboardType;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.d1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kvk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public kvk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final bwk c(yf90 yf90Var, bwk bwkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = bwkVar != null ? bwkVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = d1.q;
        exq exqVar2 = bwkVar != null ? bwkVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        qkj qkjVar2 = d1.r;
        exq exqVar3 = bwkVar != null ? bwkVar.c : null;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", qkjVar2, i, exqVar3, tlsVar2, kbsVar);
        sms smsVar = wm11.d;
        exq exqVar4 = bwkVar != null ? bwkVar.d : null;
        tls tlsVar3 = b.g;
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, i, exqVar4, tlsVar3, d1.A);
        exq k = wcx.k(Q, jSONObject, "animators", i, bwkVar != null ? bwkVar.e : null, jsonParserComponent.D1);
        exq j4 = wcx.j(Q, jSONObject, "autocapitalization", d1.s, i, bwkVar != null ? bwkVar.f : null, DivInput$Autocapitalization.FROM_STRING, kbsVar);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, bwkVar != null ? bwkVar.g : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, bwkVar != null ? bwkVar.h : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar5 = bwkVar != null ? bwkVar.i : null;
        tls tlsVar4 = b.h;
        exq j5 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar5, tlsVar4, d1.B);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, bwkVar != null ? bwkVar.j : null, jsonParserComponent.Y2);
        exq k4 = wcx.k(Q, jSONObject, "enter_key_actions", i, bwkVar != null ? bwkVar.k : null, i3yVar6);
        exq j6 = wcx.j(Q, jSONObject, "enter_key_type", d1.t, i, bwkVar != null ? bwkVar.l : null, DivInput$EnterKeyType.FROM_STRING, kbsVar);
        exq k5 = wcx.k(Q, jSONObject, "extensions", i, bwkVar != null ? bwkVar.m : null, jsonParserComponent.k3);
        exq k6 = wcx.k(Q, jSONObject, "filters", i, bwkVar != null ? bwkVar.n : null, jsonParserComponent.B4);
        exq i4 = wcx.i(Q, jSONObject, "focus", i, bwkVar != null ? bwkVar.o : null, jsonParserComponent.L3);
        ums umsVar = wm11.c;
        exq exqVar6 = bwkVar != null ? bwkVar.p : null;
        abl0 abl0Var = q5z.c;
        exq j7 = wcx.j(Q, jSONObject, "font_family", umsVar, i, exqVar6, abl0Var, kbsVar);
        exq j8 = wcx.j(Q, jSONObject, "font_size", tmsVar, i, bwkVar != null ? bwkVar.q : null, tlsVar4, d1.C);
        exq j9 = wcx.j(Q, jSONObject, "font_size_unit", d1.u, i, bwkVar != null ? bwkVar.r : null, DivSizeUnit.FROM_STRING, kbsVar);
        exq j10 = wcx.j(Q, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, i, bwkVar != null ? bwkVar.s : null, abl0Var, kbsVar);
        exq j11 = wcx.j(Q, jSONObject, FontsContractCompat$Columns.WEIGHT, d1.v, i, bwkVar != null ? bwkVar.t : null, DivFontWeight.FROM_STRING, kbsVar);
        exq j12 = wcx.j(Q, jSONObject, "font_weight_value", tmsVar, i, bwkVar != null ? bwkVar.u : null, tlsVar4, d1.D);
        exq k7 = wcx.k(Q, jSONObject, "functions", i, bwkVar != null ? bwkVar.v : null, jsonParserComponent.U3);
        exq i5 = wcx.i(Q, jSONObject, "height", i, bwkVar != null ? bwkVar.w : null, i3yVar5);
        rms rmsVar = wm11.f;
        exq exqVar7 = bwkVar != null ? bwkVar.x : null;
        tls tlsVar5 = b.b;
        exq j13 = wcx.j(Q, jSONObject, "highlight_color", rmsVar, i, exqVar7, tlsVar5, kbsVar);
        exq j14 = wcx.j(Q, jSONObject, "hint_color", rmsVar, i, bwkVar != null ? bwkVar.y : null, tlsVar5, kbsVar);
        exq j15 = wcx.j(Q, jSONObject, "hint_text", umsVar, i, bwkVar != null ? bwkVar.z : null, abl0Var, kbsVar);
        exq h = wcx.h(Q, jSONObject, "id", i, bwkVar != null ? bwkVar.A : null, abl0Var);
        wms wmsVar = wm11.a;
        exq exqVar8 = bwkVar != null ? bwkVar.B : null;
        tls tlsVar6 = b.f;
        return new bwk(i2, j, j2, j3, k, j4, k2, i3, j5, k3, k4, j6, k5, k6, i4, j7, j8, j9, j10, j11, j12, k7, i5, j13, j14, j15, h, wcx.j(Q, jSONObject, "is_enabled", wmsVar, i, exqVar8, tlsVar6, kbsVar), wcx.j(Q, jSONObject, "keyboard_type", d1.w, i, bwkVar != null ? bwkVar.C : null, DivInput$KeyboardType.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "layout_provider", i, bwkVar != null ? bwkVar.D : null, jsonParserComponent.Y4), wcx.j(Q, jSONObject, "letter_spacing", smsVar, i, bwkVar != null ? bwkVar.E : null, tlsVar3, kbsVar), wcx.j(Q, jSONObject, "line_height", tmsVar, i, bwkVar != null ? bwkVar.F : null, tlsVar4, d1.E), wcx.i(Q, jSONObject, "margins", i, bwkVar != null ? bwkVar.G : null, i3yVar4), wcx.i(Q, jSONObject, "mask", i, bwkVar != null ? bwkVar.H : null, jsonParserComponent.E4), wcx.j(Q, jSONObject, "max_length", tmsVar, i, bwkVar != null ? bwkVar.I : null, tlsVar4, d1.F), wcx.j(Q, jSONObject, "max_visible_lines", tmsVar, i, bwkVar != null ? bwkVar.J : null, tlsVar4, d1.G), wcx.i(Q, jSONObject, "native_interface", i, bwkVar != null ? bwkVar.K : null, jsonParserComponent.V4), wcx.i(Q, jSONObject, "paddings", i, bwkVar != null ? bwkVar.L : null, i3yVar4), wcx.j(Q, jSONObject, "reuse_id", umsVar, i, bwkVar != null ? bwkVar.M : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, bwkVar != null ? bwkVar.N : null, tlsVar4, d1.H), wcx.j(Q, jSONObject, "select_all_on_focus", wmsVar, i, bwkVar != null ? bwkVar.O : null, tlsVar6, kbsVar), wcx.k(Q, jSONObject, "selected_actions", i, bwkVar != null ? bwkVar.P : null, i3yVar6), wcx.j(Q, jSONObject, "text_alignment_horizontal", d1.x, i, bwkVar != null ? bwkVar.Q : null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "text_alignment_vertical", d1.y, i, bwkVar != null ? bwkVar.R : null, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "text_color", rmsVar, i, bwkVar != null ? bwkVar.S : null, tlsVar5, kbsVar), wcx.a(Q, jSONObject, "text_variable", i, bwkVar != null ? bwkVar.T : null), wcx.k(Q, jSONObject, "tooltips", i, bwkVar != null ? bwkVar.U : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, bwkVar != null ? bwkVar.V : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, bwkVar != null ? bwkVar.W : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, bwkVar != null ? bwkVar.X : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, bwkVar != null ? bwkVar.Y : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, bwkVar != null ? bwkVar.Z : null, i3yVar3), wcx.l(Q, jSONObject, i, bwkVar != null ? bwkVar.a0 : null, DivTransitionTrigger.FROM_STRING, d1.I), wcx.k(Q, jSONObject, "validators", i, bwkVar != null ? bwkVar.b0 : null, jsonParserComponent.P4), wcx.k(Q, jSONObject, "variable_triggers", i, bwkVar != null ? bwkVar.c0 : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, bwkVar != null ? bwkVar.d0 : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", d1.z, i, bwkVar != null ? bwkVar.e0 : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, bwkVar != null ? bwkVar.f0 : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, bwkVar != null ? bwkVar.g0 : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, bwkVar != null ? bwkVar.h0 : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, bwk bwkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = bwkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = bwkVar.b;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        wcx.p(exqVar2, tlsVar, yf90Var, "alignment_horizontal", jSONObject);
        exq exqVar3 = bwkVar.c;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        wcx.p(exqVar3, tlsVar2, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, bwkVar.d);
        wcx.w(yf90Var, jSONObject, "animators", bwkVar.e, jsonParserComponent.D1);
        wcx.p(bwkVar.f, DivInput$Autocapitalization.TO_STRING, yf90Var, "autocapitalization", jSONObject);
        wcx.w(yf90Var, jSONObject, C0553n3.g, bwkVar.g, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", bwkVar.h, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", bwkVar.i);
        wcx.w(yf90Var, jSONObject, "disappear_actions", bwkVar.j, jsonParserComponent.Y2);
        exq exqVar4 = bwkVar.k;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.w(yf90Var, jSONObject, "enter_key_actions", exqVar4, i3yVar);
        wcx.p(bwkVar.l, DivInput$EnterKeyType.TO_STRING, yf90Var, "enter_key_type", jSONObject);
        wcx.w(yf90Var, jSONObject, "extensions", bwkVar.m, jsonParserComponent.k3);
        wcx.w(yf90Var, jSONObject, "filters", bwkVar.n, jsonParserComponent.B4);
        wcx.u(yf90Var, jSONObject, "focus", bwkVar.o, jsonParserComponent.L3);
        wcx.q(yf90Var, jSONObject, "font_family", bwkVar.p);
        wcx.q(yf90Var, jSONObject, "font_size", bwkVar.q);
        wcx.p(bwkVar.r, DivSizeUnit.TO_STRING, yf90Var, "font_size_unit", jSONObject);
        wcx.q(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, bwkVar.s);
        wcx.p(bwkVar.t, DivFontWeight.TO_STRING, yf90Var, FontsContractCompat$Columns.WEIGHT, jSONObject);
        wcx.q(yf90Var, jSONObject, "font_weight_value", bwkVar.u);
        wcx.w(yf90Var, jSONObject, "functions", bwkVar.v, jsonParserComponent.U3);
        exq exqVar5 = bwkVar.w;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar5, i3yVar2);
        exq exqVar6 = bwkVar.x;
        tls tlsVar3 = b.a;
        wcx.p(exqVar6, tlsVar3, yf90Var, "highlight_color", jSONObject);
        wcx.p(bwkVar.y, tlsVar3, yf90Var, "hint_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "hint_text", bwkVar.z);
        wcx.t(yf90Var, jSONObject, "id", bwkVar.A);
        wcx.q(yf90Var, jSONObject, "is_enabled", bwkVar.B);
        wcx.p(bwkVar.C, DivInput$KeyboardType.TO_STRING, yf90Var, "keyboard_type", jSONObject);
        wcx.u(yf90Var, jSONObject, "layout_provider", bwkVar.D, jsonParserComponent.Y4);
        wcx.q(yf90Var, jSONObject, "letter_spacing", bwkVar.E);
        wcx.q(yf90Var, jSONObject, "line_height", bwkVar.F);
        exq exqVar7 = bwkVar.G;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar7, i3yVar3);
        wcx.u(yf90Var, jSONObject, "mask", bwkVar.H, jsonParserComponent.E4);
        wcx.q(yf90Var, jSONObject, "max_length", bwkVar.I);
        wcx.q(yf90Var, jSONObject, "max_visible_lines", bwkVar.J);
        wcx.u(yf90Var, jSONObject, "native_interface", bwkVar.K, jsonParserComponent.V4);
        wcx.u(yf90Var, jSONObject, "paddings", bwkVar.L, i3yVar3);
        wcx.q(yf90Var, jSONObject, "reuse_id", bwkVar.M);
        wcx.q(yf90Var, jSONObject, "row_span", bwkVar.N);
        wcx.q(yf90Var, jSONObject, "select_all_on_focus", bwkVar.O);
        wcx.w(yf90Var, jSONObject, "selected_actions", bwkVar.P, i3yVar);
        wcx.p(bwkVar.Q, tlsVar, yf90Var, "text_alignment_horizontal", jSONObject);
        wcx.p(bwkVar.R, tlsVar2, yf90Var, "text_alignment_vertical", jSONObject);
        wcx.p(bwkVar.S, tlsVar3, yf90Var, "text_color", jSONObject);
        wcx.t(yf90Var, jSONObject, "text_variable", bwkVar.T);
        wcx.w(yf90Var, jSONObject, "tooltips", bwkVar.U, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", bwkVar.V, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", bwkVar.W, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", bwkVar.X, jsonParserComponent.e2);
        exq exqVar8 = bwkVar.Y;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar8, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", bwkVar.Z, i3yVar4);
        wcx.v(yf90Var, jSONObject, bwkVar.a0, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "input");
        wcx.w(yf90Var, jSONObject, "validators", bwkVar.b0, jsonParserComponent.P4);
        wcx.w(yf90Var, jSONObject, "variable_triggers", bwkVar.c0, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", bwkVar.d0, jsonParserComponent.G9);
        wcx.p(bwkVar.e0, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar9 = bwkVar.f0;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar9, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", bwkVar.g0, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", bwkVar.h0, i3yVar2);
        return jSONObject;
    }
}
