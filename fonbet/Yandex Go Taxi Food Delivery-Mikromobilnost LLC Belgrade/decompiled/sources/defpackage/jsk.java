package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.u0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jsk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public jsk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final lsk c(yf90 yf90Var, lsk lskVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = lskVar != null ? lskVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        exq i3 = wcx.i(Q, jSONObject, "action", i, lskVar != null ? lskVar.b : null, i3yVar6);
        exq i4 = wcx.i(Q, jSONObject, "action_animation", i, lskVar != null ? lskVar.c : null, jsonParserComponent.A1);
        exq k = wcx.k(Q, jSONObject, "actions", i, lskVar != null ? lskVar.d : null, i3yVar6);
        qkj qkjVar = u0.i;
        exq exqVar2 = lskVar != null ? lskVar.e : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        qkj qkjVar2 = u0.j;
        exq exqVar3 = lskVar != null ? lskVar.f : null;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", qkjVar2, i, exqVar3, tlsVar2, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, lskVar != null ? lskVar.g : null, b.g, u0.n);
        exq k2 = wcx.k(Q, jSONObject, "animators", i, lskVar != null ? lskVar.h : null, jsonParserComponent.D1);
        exq k3 = wcx.k(Q, jSONObject, C0553n3.g, i, lskVar != null ? lskVar.i : null, jsonParserComponent.P1);
        exq i5 = wcx.i(Q, jSONObject, "border", i, lskVar != null ? lskVar.j : null, jsonParserComponent.V1);
        exq j4 = wcx.j(Q, jSONObject, "capture_focus_on_action", wm11.a, i, lskVar != null ? lskVar.k : null, b.f, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar4 = lskVar != null ? lskVar.l : null;
        tls tlsVar3 = b.h;
        exq e = wcx.e(Q, jSONObject, "column_count", tmsVar, i, exqVar4, tlsVar3, u0.o);
        exq j5 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, lskVar != null ? lskVar.m : null, tlsVar3, u0.p);
        exq j6 = wcx.j(Q, jSONObject, "content_alignment_horizontal", u0.k, i, lskVar != null ? lskVar.n : null, tlsVar, kbsVar);
        exq j7 = wcx.j(Q, jSONObject, "content_alignment_vertical", u0.l, i, lskVar != null ? lskVar.o : null, tlsVar2, kbsVar);
        exq k4 = wcx.k(Q, jSONObject, "disappear_actions", i, lskVar != null ? lskVar.p : null, jsonParserComponent.Y2);
        exq k5 = wcx.k(Q, jSONObject, "doubletap_actions", i, lskVar != null ? lskVar.q : null, i3yVar6);
        exq k6 = wcx.k(Q, jSONObject, "extensions", i, lskVar != null ? lskVar.r : null, jsonParserComponent.k3);
        exq i6 = wcx.i(Q, jSONObject, "focus", i, lskVar != null ? lskVar.s : null, jsonParserComponent.L3);
        exq k7 = wcx.k(Q, jSONObject, "functions", i, lskVar != null ? lskVar.t : null, jsonParserComponent.U3);
        exq i7 = wcx.i(Q, jSONObject, "height", i, lskVar != null ? lskVar.u : null, i3yVar5);
        exq k8 = wcx.k(Q, jSONObject, "hover_end_actions", i, lskVar != null ? lskVar.v : null, i3yVar6);
        exq k9 = wcx.k(Q, jSONObject, "hover_start_actions", i, lskVar != null ? lskVar.w : null, i3yVar6);
        exq exqVar5 = lskVar != null ? lskVar.x : null;
        abl0 abl0Var = q5z.c;
        return new lsk(i2, i3, i4, k, j, j2, j3, k2, k3, i5, j4, e, j5, j6, j7, k4, k5, k6, i6, k7, i7, k8, k9, wcx.h(Q, jSONObject, "id", i, exqVar5, abl0Var), wcx.k(Q, jSONObject, "items", i, lskVar != null ? lskVar.y : null, jsonParserComponent.Y9), wcx.i(Q, jSONObject, "layout_provider", i, lskVar != null ? lskVar.z : null, jsonParserComponent.Y4), wcx.k(Q, jSONObject, "longtap_actions", i, lskVar != null ? lskVar.A : null, i3yVar6), wcx.i(Q, jSONObject, "margins", i, lskVar != null ? lskVar.B : null, i3yVar4), wcx.i(Q, jSONObject, "paddings", i, lskVar != null ? lskVar.C : null, i3yVar4), wcx.k(Q, jSONObject, "press_end_actions", i, lskVar != null ? lskVar.D : null, i3yVar6), wcx.k(Q, jSONObject, "press_start_actions", i, lskVar != null ? lskVar.E : null, i3yVar6), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, lskVar != null ? lskVar.F : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, lskVar != null ? lskVar.G : null, tlsVar3, u0.q), wcx.k(Q, jSONObject, "selected_actions", i, lskVar != null ? lskVar.H : null, i3yVar6), wcx.k(Q, jSONObject, "tooltips", i, lskVar != null ? lskVar.I : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, lskVar != null ? lskVar.J : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, lskVar != null ? lskVar.K : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, lskVar != null ? lskVar.L : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, lskVar != null ? lskVar.M : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, lskVar != null ? lskVar.N : null, i3yVar3), wcx.l(Q, jSONObject, i, lskVar != null ? lskVar.O : null, DivTransitionTrigger.FROM_STRING, u0.r), wcx.k(Q, jSONObject, "variable_triggers", i, lskVar != null ? lskVar.P : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, lskVar != null ? lskVar.Q : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", u0.m, i, lskVar != null ? lskVar.R : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, lskVar != null ? lskVar.S : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, lskVar != null ? lskVar.T : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, lskVar != null ? lskVar.U : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, lsk lskVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = lskVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = lskVar.b;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.u(yf90Var, jSONObject, "action", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "action_animation", lskVar.c, jsonParserComponent.A1);
        wcx.w(yf90Var, jSONObject, "actions", lskVar.d, i3yVar);
        exq exqVar3 = lskVar.e;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        wcx.p(exqVar3, tlsVar, yf90Var, "alignment_horizontal", jSONObject);
        exq exqVar4 = lskVar.f;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        wcx.p(exqVar4, tlsVar2, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, lskVar.g);
        wcx.w(yf90Var, jSONObject, "animators", lskVar.h, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, lskVar.i, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", lskVar.j, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "capture_focus_on_action", lskVar.k);
        wcx.q(yf90Var, jSONObject, "column_count", lskVar.l);
        wcx.q(yf90Var, jSONObject, "column_span", lskVar.m);
        wcx.p(lskVar.n, tlsVar, yf90Var, "content_alignment_horizontal", jSONObject);
        wcx.p(lskVar.o, tlsVar2, yf90Var, "content_alignment_vertical", jSONObject);
        wcx.w(yf90Var, jSONObject, "disappear_actions", lskVar.p, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "doubletap_actions", lskVar.q, i3yVar);
        wcx.w(yf90Var, jSONObject, "extensions", lskVar.r, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", lskVar.s, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", lskVar.t, jsonParserComponent.U3);
        exq exqVar5 = lskVar.u;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar5, i3yVar2);
        wcx.w(yf90Var, jSONObject, "hover_end_actions", lskVar.v, i3yVar);
        wcx.w(yf90Var, jSONObject, "hover_start_actions", lskVar.w, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", lskVar.x);
        wcx.w(yf90Var, jSONObject, "items", lskVar.y, jsonParserComponent.Y9);
        wcx.u(yf90Var, jSONObject, "layout_provider", lskVar.z, jsonParserComponent.Y4);
        wcx.w(yf90Var, jSONObject, "longtap_actions", lskVar.A, i3yVar);
        exq exqVar6 = lskVar.B;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar6, i3yVar3);
        wcx.u(yf90Var, jSONObject, "paddings", lskVar.C, i3yVar3);
        wcx.w(yf90Var, jSONObject, "press_end_actions", lskVar.D, i3yVar);
        wcx.w(yf90Var, jSONObject, "press_start_actions", lskVar.E, i3yVar);
        wcx.q(yf90Var, jSONObject, "reuse_id", lskVar.F);
        wcx.q(yf90Var, jSONObject, "row_span", lskVar.G);
        wcx.w(yf90Var, jSONObject, "selected_actions", lskVar.H, i3yVar);
        wcx.w(yf90Var, jSONObject, "tooltips", lskVar.I, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", lskVar.J, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", lskVar.K, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", lskVar.L, jsonParserComponent.e2);
        exq exqVar7 = lskVar.M;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar7, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", lskVar.N, i3yVar4);
        wcx.v(yf90Var, jSONObject, lskVar.O, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "grid");
        wcx.w(yf90Var, jSONObject, "variable_triggers", lskVar.P, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", lskVar.Q, jsonParserComponent.G9);
        wcx.p(lskVar.R, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar8 = lskVar.S;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar8, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", lskVar.T, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", lskVar.U, i3yVar2);
        return jSONObject;
    }
}
