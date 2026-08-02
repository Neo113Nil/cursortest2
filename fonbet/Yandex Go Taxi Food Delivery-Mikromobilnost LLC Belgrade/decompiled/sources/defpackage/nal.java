package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.e2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nal implements zsq0, yey0 {
    public final JsonParserComponent a;

    public nal(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final tal c(yf90 yf90Var, tal talVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = talVar != null ? talVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.y7;
        i3y i3yVar5 = jsonParserComponent.h3;
        i3y i3yVar6 = jsonParserComponent.p7;
        i3y i3yVar7 = jsonParserComponent.u1;
        i3y i3yVar8 = jsonParserComponent.e3;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = e2.h;
        exq exqVar2 = talVar != null ? talVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", e2.i, i, talVar != null ? talVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, talVar != null ? talVar.d : null, b.g, e2.k);
        exq k = wcx.k(Q, jSONObject, "animators", i, talVar != null ? talVar.e : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, talVar != null ? talVar.f : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, talVar != null ? talVar.g : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar3 = talVar != null ? talVar.h : null;
        tls tlsVar2 = b.h;
        exq j4 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar3, tlsVar2, e2.l);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, talVar != null ? talVar.i : null, jsonParserComponent.Y2);
        exq k4 = wcx.k(Q, jSONObject, "extensions", i, talVar != null ? talVar.j : null, jsonParserComponent.k3);
        exq i4 = wcx.i(Q, jSONObject, "focus", i, talVar != null ? talVar.k : null, jsonParserComponent.L3);
        exq k5 = wcx.k(Q, jSONObject, "functions", i, talVar != null ? talVar.l : null, jsonParserComponent.U3);
        exq i5 = wcx.i(Q, jSONObject, "height", i, talVar != null ? talVar.m : null, i3yVar6);
        exq exqVar4 = talVar != null ? talVar.n : null;
        abl0 abl0Var = q5z.c;
        return new tal(i2, j, j2, j3, k, k2, i3, j4, k3, k4, i4, k5, i5, wcx.h(Q, jSONObject, "id", i, exqVar4, abl0Var), wcx.j(Q, jSONObject, "is_enabled", wm11.a, i, talVar != null ? talVar.o : null, b.f, kbsVar), wcx.i(Q, jSONObject, "layout_provider", i, talVar != null ? talVar.p : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "margins", i, talVar != null ? talVar.q : null, i3yVar5), wcx.j(Q, jSONObject, "max_value", tmsVar, i, talVar != null ? talVar.r : null, tlsVar2, kbsVar), wcx.j(Q, jSONObject, "min_value", tmsVar, i, talVar != null ? talVar.s : null, tlsVar2, kbsVar), wcx.i(Q, jSONObject, "paddings", i, talVar != null ? talVar.t : null, i3yVar5), wcx.k(Q, jSONObject, "press_end_actions", i, talVar != null ? talVar.u : null, i3yVar7), wcx.k(Q, jSONObject, "press_start_actions", i, talVar != null ? talVar.v : null, i3yVar7), wcx.k(Q, jSONObject, "ranges", i, talVar != null ? talVar.w : null, jsonParserComponent.B7), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, talVar != null ? talVar.x : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, talVar != null ? talVar.y : null, tlsVar2, e2.m), wcx.i(Q, jSONObject, "secondary_value_accessibility", i, talVar != null ? talVar.z : null, jsonParserComponent.I), wcx.k(Q, jSONObject, "selected_actions", i, talVar != null ? talVar.A : null, i3yVar7), wcx.i(Q, jSONObject, "thumb_secondary_style", i, talVar != null ? talVar.B : null, i3yVar8), wcx.i(Q, jSONObject, "thumb_secondary_text_style", i, talVar != null ? talVar.C : null, i3yVar4), wcx.h(Q, jSONObject, "thumb_secondary_value_variable", i, talVar != null ? talVar.D : null, abl0Var), wcx.c(Q, jSONObject, "thumb_style", i, talVar != null ? talVar.E : null, i3yVar8), wcx.i(Q, jSONObject, "thumb_text_style", i, talVar != null ? talVar.F : null, i3yVar4), wcx.h(Q, jSONObject, "thumb_value_variable", i, talVar != null ? talVar.G : null, abl0Var), wcx.i(Q, jSONObject, "tick_mark_active_style", i, talVar != null ? talVar.H : null, i3yVar8), wcx.i(Q, jSONObject, "tick_mark_inactive_style", i, talVar != null ? talVar.I : null, i3yVar8), wcx.k(Q, jSONObject, "tooltips", i, talVar != null ? talVar.J : null, jsonParserComponent.l9), wcx.c(Q, jSONObject, "track_active_style", i, talVar != null ? talVar.K : null, i3yVar8), wcx.c(Q, jSONObject, "track_inactive_style", i, talVar != null ? talVar.L : null, i3yVar8), wcx.i(Q, jSONObject, "transform", i, talVar != null ? talVar.M : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, talVar != null ? talVar.N : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, talVar != null ? talVar.O : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, talVar != null ? talVar.P : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, talVar != null ? talVar.Q : null, i3yVar3), wcx.l(Q, jSONObject, i, talVar != null ? talVar.R : null, DivTransitionTrigger.FROM_STRING, e2.n), wcx.k(Q, jSONObject, "variable_triggers", i, talVar != null ? talVar.S : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, talVar != null ? talVar.T : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", e2.j, i, talVar != null ? talVar.U : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, talVar != null ? talVar.V : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, talVar != null ? talVar.W : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, talVar != null ? talVar.X : null, i3yVar6));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, tal talVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = talVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(talVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(talVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, talVar.d);
        wcx.w(yf90Var, jSONObject, "animators", talVar.e, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, talVar.f, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", talVar.g, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", talVar.h);
        wcx.w(yf90Var, jSONObject, "disappear_actions", talVar.i, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "extensions", talVar.j, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", talVar.k, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", talVar.l, jsonParserComponent.U3);
        exq exqVar2 = talVar.m;
        i3y i3yVar = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar2, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", talVar.n);
        wcx.q(yf90Var, jSONObject, "is_enabled", talVar.o);
        wcx.u(yf90Var, jSONObject, "layout_provider", talVar.p, jsonParserComponent.Y4);
        exq exqVar3 = talVar.q;
        i3y i3yVar2 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar3, i3yVar2);
        wcx.q(yf90Var, jSONObject, "max_value", talVar.r);
        wcx.q(yf90Var, jSONObject, "min_value", talVar.s);
        wcx.u(yf90Var, jSONObject, "paddings", talVar.t, i3yVar2);
        exq exqVar4 = talVar.u;
        i3y i3yVar3 = jsonParserComponent.u1;
        wcx.w(yf90Var, jSONObject, "press_end_actions", exqVar4, i3yVar3);
        wcx.w(yf90Var, jSONObject, "press_start_actions", talVar.v, i3yVar3);
        wcx.w(yf90Var, jSONObject, "ranges", talVar.w, jsonParserComponent.B7);
        wcx.q(yf90Var, jSONObject, "reuse_id", talVar.x);
        wcx.q(yf90Var, jSONObject, "row_span", talVar.y);
        wcx.u(yf90Var, jSONObject, "secondary_value_accessibility", talVar.z, jsonParserComponent.I);
        wcx.w(yf90Var, jSONObject, "selected_actions", talVar.A, i3yVar3);
        exq exqVar5 = talVar.B;
        i3y i3yVar4 = jsonParserComponent.e3;
        wcx.u(yf90Var, jSONObject, "thumb_secondary_style", exqVar5, i3yVar4);
        exq exqVar6 = talVar.C;
        i3y i3yVar5 = jsonParserComponent.y7;
        wcx.u(yf90Var, jSONObject, "thumb_secondary_text_style", exqVar6, i3yVar5);
        wcx.t(yf90Var, jSONObject, "thumb_secondary_value_variable", talVar.D);
        wcx.u(yf90Var, jSONObject, "thumb_style", talVar.E, i3yVar4);
        wcx.u(yf90Var, jSONObject, "thumb_text_style", talVar.F, i3yVar5);
        wcx.t(yf90Var, jSONObject, "thumb_value_variable", talVar.G);
        wcx.u(yf90Var, jSONObject, "tick_mark_active_style", talVar.H, i3yVar4);
        wcx.u(yf90Var, jSONObject, "tick_mark_inactive_style", talVar.I, i3yVar4);
        wcx.w(yf90Var, jSONObject, "tooltips", talVar.J, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "track_active_style", talVar.K, i3yVar4);
        wcx.u(yf90Var, jSONObject, "track_inactive_style", talVar.L, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transform", talVar.M, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", talVar.N, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", talVar.O, jsonParserComponent.e2);
        exq exqVar7 = talVar.P;
        i3y i3yVar6 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar7, i3yVar6);
        wcx.u(yf90Var, jSONObject, "transition_out", talVar.Q, i3yVar6);
        wcx.v(yf90Var, jSONObject, talVar.R, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "slider");
        wcx.w(yf90Var, jSONObject, "variable_triggers", talVar.S, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", talVar.T, jsonParserComponent.G9);
        wcx.p(talVar.U, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar8 = talVar.V;
        i3y i3yVar7 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar8, i3yVar7);
        wcx.w(yf90Var, jSONObject, "visibility_actions", talVar.W, i3yVar7);
        wcx.u(yf90Var, jSONObject, "width", talVar.X, i3yVar);
        return jSONObject;
    }
}
