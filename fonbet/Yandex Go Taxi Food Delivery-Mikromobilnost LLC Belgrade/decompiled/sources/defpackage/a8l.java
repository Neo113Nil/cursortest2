package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.n1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a8l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public a8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final f8l c(yf90 yf90Var, f8l f8lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = f8lVar != null ? f8lVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = n1.j;
        exq exqVar2 = f8lVar != null ? f8lVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", n1.k, i, f8lVar != null ? f8lVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        sms smsVar = wm11.d;
        exq exqVar3 = f8lVar != null ? f8lVar.d : null;
        tls tlsVar2 = b.g;
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, i, exqVar3, tlsVar2, n1.o);
        exq k = wcx.k(Q, jSONObject, "animators", i, f8lVar != null ? f8lVar.e : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, f8lVar != null ? f8lVar.f : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, f8lVar != null ? f8lVar.g : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar4 = f8lVar != null ? f8lVar.h : null;
        tls tlsVar3 = b.h;
        exq j4 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar4, tlsVar3, n1.p);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, f8lVar != null ? f8lVar.i : null, jsonParserComponent.Y2);
        exq k4 = wcx.k(Q, jSONObject, "extensions", i, f8lVar != null ? f8lVar.j : null, jsonParserComponent.k3);
        exq i4 = wcx.i(Q, jSONObject, "focus", i, f8lVar != null ? f8lVar.k : null, jsonParserComponent.L3);
        ums umsVar = wm11.c;
        exq exqVar5 = f8lVar != null ? f8lVar.l : null;
        abl0 abl0Var = q5z.c;
        exq j5 = wcx.j(Q, jSONObject, "font_family", umsVar, i, exqVar5, abl0Var, kbsVar);
        exq j6 = wcx.j(Q, jSONObject, "font_size", tmsVar, i, f8lVar != null ? f8lVar.m : null, tlsVar3, n1.q);
        exq j7 = wcx.j(Q, jSONObject, "font_size_unit", n1.l, i, f8lVar != null ? f8lVar.n : null, DivSizeUnit.FROM_STRING, kbsVar);
        exq j8 = wcx.j(Q, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, i, f8lVar != null ? f8lVar.o : null, abl0Var, kbsVar);
        exq j9 = wcx.j(Q, jSONObject, FontsContractCompat$Columns.WEIGHT, n1.m, i, f8lVar != null ? f8lVar.p : null, DivFontWeight.FROM_STRING, kbsVar);
        exq j10 = wcx.j(Q, jSONObject, "font_weight_value", tmsVar, i, f8lVar != null ? f8lVar.q : null, tlsVar3, n1.r);
        exq k5 = wcx.k(Q, jSONObject, "functions", i, f8lVar != null ? f8lVar.r : null, jsonParserComponent.U3);
        exq i5 = wcx.i(Q, jSONObject, "height", i, f8lVar != null ? f8lVar.s : null, i3yVar5);
        rms rmsVar = wm11.f;
        exq exqVar6 = f8lVar != null ? f8lVar.t : null;
        tls tlsVar4 = b.b;
        return new f8l(i2, j, j2, j3, k, k2, i3, j4, k3, k4, i4, j5, j6, j7, j8, j9, j10, k5, i5, wcx.j(Q, jSONObject, "hint_color", rmsVar, i, exqVar6, tlsVar4, kbsVar), wcx.j(Q, jSONObject, "hint_text", umsVar, i, f8lVar != null ? f8lVar.u : null, abl0Var, kbsVar), wcx.h(Q, jSONObject, "id", i, f8lVar != null ? f8lVar.v : null, abl0Var), wcx.i(Q, jSONObject, "layout_provider", i, f8lVar != null ? f8lVar.w : null, jsonParserComponent.Y4), wcx.j(Q, jSONObject, "letter_spacing", smsVar, i, f8lVar != null ? f8lVar.x : null, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "line_height", tmsVar, i, f8lVar != null ? f8lVar.y : null, tlsVar3, n1.s), wcx.i(Q, jSONObject, "margins", i, f8lVar != null ? f8lVar.z : null, i3yVar4), wcx.f(Q, jSONObject, "options", i, f8lVar != null ? f8lVar.A : null, jsonParserComponent.U6, n1.t), wcx.i(Q, jSONObject, "paddings", i, f8lVar != null ? f8lVar.B : null, i3yVar4), wcx.j(Q, jSONObject, "reuse_id", umsVar, i, f8lVar != null ? f8lVar.C : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, f8lVar != null ? f8lVar.D : null, tlsVar3, n1.u), wcx.k(Q, jSONObject, "selected_actions", i, f8lVar != null ? f8lVar.E : null, jsonParserComponent.u1), wcx.j(Q, jSONObject, "text_color", rmsVar, i, f8lVar != null ? f8lVar.F : null, tlsVar4, kbsVar), wcx.k(Q, jSONObject, "tooltips", i, f8lVar != null ? f8lVar.G : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, f8lVar != null ? f8lVar.H : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, f8lVar != null ? f8lVar.I : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, f8lVar != null ? f8lVar.J : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, f8lVar != null ? f8lVar.K : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, f8lVar != null ? f8lVar.L : null, i3yVar3), wcx.l(Q, jSONObject, i, f8lVar != null ? f8lVar.M : null, DivTransitionTrigger.FROM_STRING, n1.v), wcx.a(Q, jSONObject, "value_variable", i, f8lVar != null ? f8lVar.N : null), wcx.k(Q, jSONObject, "variable_triggers", i, f8lVar != null ? f8lVar.O : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, f8lVar != null ? f8lVar.P : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", n1.n, i, f8lVar != null ? f8lVar.Q : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, f8lVar != null ? f8lVar.R : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, f8lVar != null ? f8lVar.S : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, f8lVar != null ? f8lVar.T : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, f8l f8lVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = f8lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(f8lVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(f8lVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, f8lVar.d);
        wcx.w(yf90Var, jSONObject, "animators", f8lVar.e, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, f8lVar.f, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", f8lVar.g, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", f8lVar.h);
        wcx.w(yf90Var, jSONObject, "disappear_actions", f8lVar.i, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "extensions", f8lVar.j, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", f8lVar.k, jsonParserComponent.L3);
        wcx.q(yf90Var, jSONObject, "font_family", f8lVar.l);
        wcx.q(yf90Var, jSONObject, "font_size", f8lVar.m);
        wcx.p(f8lVar.n, DivSizeUnit.TO_STRING, yf90Var, "font_size_unit", jSONObject);
        wcx.q(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, f8lVar.o);
        wcx.p(f8lVar.p, DivFontWeight.TO_STRING, yf90Var, FontsContractCompat$Columns.WEIGHT, jSONObject);
        wcx.q(yf90Var, jSONObject, "font_weight_value", f8lVar.q);
        wcx.w(yf90Var, jSONObject, "functions", f8lVar.r, jsonParserComponent.U3);
        exq exqVar2 = f8lVar.s;
        i3y i3yVar = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar2, i3yVar);
        exq exqVar3 = f8lVar.t;
        tls tlsVar = b.a;
        wcx.p(exqVar3, tlsVar, yf90Var, "hint_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "hint_text", f8lVar.u);
        wcx.t(yf90Var, jSONObject, "id", f8lVar.v);
        wcx.u(yf90Var, jSONObject, "layout_provider", f8lVar.w, jsonParserComponent.Y4);
        wcx.q(yf90Var, jSONObject, "letter_spacing", f8lVar.x);
        wcx.q(yf90Var, jSONObject, "line_height", f8lVar.y);
        exq exqVar4 = f8lVar.z;
        i3y i3yVar2 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar4, i3yVar2);
        wcx.w(yf90Var, jSONObject, "options", f8lVar.A, jsonParserComponent.U6);
        wcx.u(yf90Var, jSONObject, "paddings", f8lVar.B, i3yVar2);
        wcx.q(yf90Var, jSONObject, "reuse_id", f8lVar.C);
        wcx.q(yf90Var, jSONObject, "row_span", f8lVar.D);
        wcx.w(yf90Var, jSONObject, "selected_actions", f8lVar.E, jsonParserComponent.u1);
        wcx.p(f8lVar.F, tlsVar, yf90Var, "text_color", jSONObject);
        wcx.w(yf90Var, jSONObject, "tooltips", f8lVar.G, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", f8lVar.H, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", f8lVar.I, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", f8lVar.J, jsonParserComponent.e2);
        exq exqVar5 = f8lVar.K;
        i3y i3yVar3 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar5, i3yVar3);
        wcx.u(yf90Var, jSONObject, "transition_out", f8lVar.L, i3yVar3);
        wcx.v(yf90Var, jSONObject, f8lVar.M, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "select");
        wcx.t(yf90Var, jSONObject, "value_variable", f8lVar.N);
        wcx.w(yf90Var, jSONObject, "variable_triggers", f8lVar.O, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", f8lVar.P, jsonParserComponent.G9);
        wcx.p(f8lVar.Q, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar6 = f8lVar.R;
        i3y i3yVar4 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar6, i3yVar4);
        wcx.w(yf90Var, jSONObject, "visibility_actions", f8lVar.S, i3yVar4);
        wcx.u(yf90Var, jSONObject, "width", f8lVar.T, i3yVar);
        return jSONObject;
    }
}
