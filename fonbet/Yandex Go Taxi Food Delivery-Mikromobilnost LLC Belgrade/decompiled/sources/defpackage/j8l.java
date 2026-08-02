package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.v1;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j8l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public j8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final k8l c(yf90 yf90Var, k8l k8lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = k8lVar != null ? k8lVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        exq i3 = wcx.i(Q, jSONObject, "action", i, k8lVar != null ? k8lVar.b : null, i3yVar6);
        exq i4 = wcx.i(Q, jSONObject, "action_animation", i, k8lVar != null ? k8lVar.c : null, jsonParserComponent.A1);
        exq k = wcx.k(Q, jSONObject, "actions", i, k8lVar != null ? k8lVar.d : null, i3yVar6);
        qkj qkjVar = v1.g;
        exq exqVar2 = k8lVar != null ? k8lVar.e : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", v1.h, i, k8lVar != null ? k8lVar.f : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, k8lVar != null ? k8lVar.g : null, b.g, v1.j);
        exq k2 = wcx.k(Q, jSONObject, "animators", i, k8lVar != null ? k8lVar.h : null, jsonParserComponent.D1);
        exq k3 = wcx.k(Q, jSONObject, C0553n3.g, i, k8lVar != null ? k8lVar.i : null, jsonParserComponent.P1);
        exq i5 = wcx.i(Q, jSONObject, "border", i, k8lVar != null ? k8lVar.j : null, jsonParserComponent.V1);
        exq j4 = wcx.j(Q, jSONObject, "capture_focus_on_action", wm11.a, i, k8lVar != null ? k8lVar.k : null, b.f, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar3 = k8lVar != null ? k8lVar.l : null;
        tls tlsVar2 = b.h;
        exq j5 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar3, tlsVar2, v1.k);
        exq i6 = wcx.i(Q, jSONObject, "delimiter_style", i, k8lVar != null ? k8lVar.m : null, jsonParserComponent.a7);
        exq k4 = wcx.k(Q, jSONObject, "disappear_actions", i, k8lVar != null ? k8lVar.n : null, jsonParserComponent.Y2);
        exq k5 = wcx.k(Q, jSONObject, "doubletap_actions", i, k8lVar != null ? k8lVar.o : null, i3yVar6);
        exq k6 = wcx.k(Q, jSONObject, "extensions", i, k8lVar != null ? k8lVar.p : null, jsonParserComponent.k3);
        exq i7 = wcx.i(Q, jSONObject, "focus", i, k8lVar != null ? k8lVar.q : null, jsonParserComponent.L3);
        exq k7 = wcx.k(Q, jSONObject, "functions", i, k8lVar != null ? k8lVar.r : null, jsonParserComponent.U3);
        exq i8 = wcx.i(Q, jSONObject, "height", i, k8lVar != null ? k8lVar.s : null, i3yVar5);
        exq k8 = wcx.k(Q, jSONObject, "hover_end_actions", i, k8lVar != null ? k8lVar.t : null, i3yVar6);
        exq k9 = wcx.k(Q, jSONObject, "hover_start_actions", i, k8lVar != null ? k8lVar.u : null, i3yVar6);
        exq exqVar4 = k8lVar != null ? k8lVar.v : null;
        abl0 abl0Var = q5z.c;
        return new k8l(i2, i3, i4, k, j, j2, j3, k2, k3, i5, j4, j5, i6, k4, k5, k6, i7, k7, i8, k8, k9, wcx.h(Q, jSONObject, "id", i, exqVar4, abl0Var), wcx.i(Q, jSONObject, "layout_provider", i, k8lVar != null ? k8lVar.w : null, jsonParserComponent.Y4), wcx.k(Q, jSONObject, "longtap_actions", i, k8lVar != null ? k8lVar.x : null, i3yVar6), wcx.i(Q, jSONObject, "margins", i, k8lVar != null ? k8lVar.y : null, i3yVar4), wcx.i(Q, jSONObject, "paddings", i, k8lVar != null ? k8lVar.z : null, i3yVar4), wcx.k(Q, jSONObject, "press_end_actions", i, k8lVar != null ? k8lVar.A : null, i3yVar6), wcx.k(Q, jSONObject, "press_start_actions", i, k8lVar != null ? k8lVar.B : null, i3yVar6), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, k8lVar != null ? k8lVar.C : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, k8lVar != null ? k8lVar.D : null, tlsVar2, v1.l), wcx.k(Q, jSONObject, "selected_actions", i, k8lVar != null ? k8lVar.E : null, i3yVar6), wcx.k(Q, jSONObject, "tooltips", i, k8lVar != null ? k8lVar.F : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, k8lVar != null ? k8lVar.G : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, k8lVar != null ? k8lVar.H : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, k8lVar != null ? k8lVar.I : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, k8lVar != null ? k8lVar.J : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, k8lVar != null ? k8lVar.K : null, i3yVar3), wcx.l(Q, jSONObject, i, k8lVar != null ? k8lVar.L : null, DivTransitionTrigger.FROM_STRING, v1.m), wcx.k(Q, jSONObject, "variable_triggers", i, k8lVar != null ? k8lVar.M : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, k8lVar != null ? k8lVar.N : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", v1.i, i, k8lVar != null ? k8lVar.O : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, k8lVar != null ? k8lVar.P : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, k8lVar != null ? k8lVar.Q : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, k8lVar != null ? k8lVar.R : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, k8l k8lVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = k8lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = k8lVar.b;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.u(yf90Var, jSONObject, "action", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "action_animation", k8lVar.c, jsonParserComponent.A1);
        wcx.w(yf90Var, jSONObject, "actions", k8lVar.d, i3yVar);
        wcx.p(k8lVar.e, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(k8lVar.f, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, k8lVar.g);
        wcx.w(yf90Var, jSONObject, "animators", k8lVar.h, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, k8lVar.i, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", k8lVar.j, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "capture_focus_on_action", k8lVar.k);
        wcx.q(yf90Var, jSONObject, "column_span", k8lVar.l);
        wcx.u(yf90Var, jSONObject, "delimiter_style", k8lVar.m, jsonParserComponent.a7);
        wcx.w(yf90Var, jSONObject, "disappear_actions", k8lVar.n, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "doubletap_actions", k8lVar.o, i3yVar);
        wcx.w(yf90Var, jSONObject, "extensions", k8lVar.p, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", k8lVar.q, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", k8lVar.r, jsonParserComponent.U3);
        exq exqVar3 = k8lVar.s;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar3, i3yVar2);
        wcx.w(yf90Var, jSONObject, "hover_end_actions", k8lVar.t, i3yVar);
        wcx.w(yf90Var, jSONObject, "hover_start_actions", k8lVar.u, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", k8lVar.v);
        wcx.u(yf90Var, jSONObject, "layout_provider", k8lVar.w, jsonParserComponent.Y4);
        wcx.w(yf90Var, jSONObject, "longtap_actions", k8lVar.x, i3yVar);
        exq exqVar4 = k8lVar.y;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar4, i3yVar3);
        wcx.u(yf90Var, jSONObject, "paddings", k8lVar.z, i3yVar3);
        wcx.w(yf90Var, jSONObject, "press_end_actions", k8lVar.A, i3yVar);
        wcx.w(yf90Var, jSONObject, "press_start_actions", k8lVar.B, i3yVar);
        wcx.q(yf90Var, jSONObject, "reuse_id", k8lVar.C);
        wcx.q(yf90Var, jSONObject, "row_span", k8lVar.D);
        wcx.w(yf90Var, jSONObject, "selected_actions", k8lVar.E, i3yVar);
        wcx.w(yf90Var, jSONObject, "tooltips", k8lVar.F, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", k8lVar.G, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", k8lVar.H, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", k8lVar.I, jsonParserComponent.e2);
        exq exqVar5 = k8lVar.J;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar5, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", k8lVar.K, i3yVar4);
        wcx.v(yf90Var, jSONObject, k8lVar.L, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "separator");
        wcx.w(yf90Var, jSONObject, "variable_triggers", k8lVar.M, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", k8lVar.N, jsonParserComponent.G9);
        wcx.p(k8lVar.O, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar6 = k8lVar.P;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar6, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", k8lVar.Q, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", k8lVar.R, i3yVar2);
        return jSONObject;
    }
}
