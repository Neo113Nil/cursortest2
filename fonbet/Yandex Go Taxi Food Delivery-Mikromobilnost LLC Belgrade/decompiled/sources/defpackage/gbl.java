package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.g2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class gbl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public gbl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final nbl c(yf90 yf90Var, nbl nblVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = nblVar != null ? nblVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        exq i3 = wcx.i(Q, jSONObject, "action", i, nblVar != null ? nblVar.b : null, i3yVar6);
        exq i4 = wcx.i(Q, jSONObject, "action_animation", i, nblVar != null ? nblVar.c : null, jsonParserComponent.A1);
        exq k = wcx.k(Q, jSONObject, "actions", i, nblVar != null ? nblVar.d : null, i3yVar6);
        qkj qkjVar = g2.i;
        exq exqVar2 = nblVar != null ? nblVar.e : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", g2.j, i, nblVar != null ? nblVar.f : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, nblVar != null ? nblVar.g : null, b.g, g2.m);
        exq k2 = wcx.k(Q, jSONObject, "animators", i, nblVar != null ? nblVar.h : null, jsonParserComponent.D1);
        exq k3 = wcx.k(Q, jSONObject, C0553n3.g, i, nblVar != null ? nblVar.i : null, jsonParserComponent.P1);
        exq i5 = wcx.i(Q, jSONObject, "border", i, nblVar != null ? nblVar.j : null, jsonParserComponent.V1);
        wms wmsVar = wm11.a;
        exq exqVar3 = nblVar != null ? nblVar.k : null;
        tls tlsVar2 = b.f;
        exq j4 = wcx.j(Q, jSONObject, "capture_focus_on_action", wmsVar, i, exqVar3, tlsVar2, kbsVar);
        exq j5 = wcx.j(Q, jSONObject, "clip_to_bounds", wmsVar, i, nblVar != null ? nblVar.l : null, tlsVar2, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar4 = nblVar != null ? nblVar.m : null;
        tls tlsVar3 = b.h;
        exq j6 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar4, tlsVar3, g2.n);
        ums umsVar = wm11.c;
        exq exqVar5 = nblVar != null ? nblVar.n : null;
        abl0 abl0Var = q5z.c;
        return new nbl(i2, i3, i4, k, j, j2, j3, k2, k3, i5, j4, j5, j6, wcx.j(Q, jSONObject, "default_state_id", umsVar, i, exqVar5, abl0Var, kbsVar), wcx.k(Q, jSONObject, "disappear_actions", i, nblVar != null ? nblVar.o : null, jsonParserComponent.Y2), wcx.h(Q, jSONObject, "div_id", i, nblVar != null ? nblVar.p : null, abl0Var), wcx.k(Q, jSONObject, "doubletap_actions", i, nblVar != null ? nblVar.q : null, i3yVar6), wcx.k(Q, jSONObject, "extensions", i, nblVar != null ? nblVar.r : null, jsonParserComponent.k3), wcx.i(Q, jSONObject, "focus", i, nblVar != null ? nblVar.s : null, jsonParserComponent.L3), wcx.k(Q, jSONObject, "functions", i, nblVar != null ? nblVar.t : null, jsonParserComponent.U3), wcx.i(Q, jSONObject, "height", i, nblVar != null ? nblVar.u : null, i3yVar5), wcx.k(Q, jSONObject, "hover_end_actions", i, nblVar != null ? nblVar.v : null, i3yVar6), wcx.k(Q, jSONObject, "hover_start_actions", i, nblVar != null ? nblVar.w : null, i3yVar6), wcx.h(Q, jSONObject, "id", i, nblVar != null ? nblVar.x : null, abl0Var), wcx.i(Q, jSONObject, "layout_provider", i, nblVar != null ? nblVar.y : null, jsonParserComponent.Y4), wcx.k(Q, jSONObject, "longtap_actions", i, nblVar != null ? nblVar.z : null, i3yVar6), wcx.i(Q, jSONObject, "margins", i, nblVar != null ? nblVar.A : null, i3yVar4), wcx.i(Q, jSONObject, "paddings", i, nblVar != null ? nblVar.B : null, i3yVar4), wcx.k(Q, jSONObject, "press_end_actions", i, nblVar != null ? nblVar.C : null, i3yVar6), wcx.k(Q, jSONObject, "press_start_actions", i, nblVar != null ? nblVar.D : null, i3yVar6), wcx.j(Q, jSONObject, "reuse_id", umsVar, i, nblVar != null ? nblVar.E : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, nblVar != null ? nblVar.F : null, tlsVar3, g2.o), wcx.k(Q, jSONObject, "selected_actions", i, nblVar != null ? nblVar.G : null, i3yVar6), wcx.h(Q, jSONObject, "state_id_variable", i, nblVar != null ? nblVar.H : null, abl0Var), wcx.f(Q, jSONObject, "states", i, nblVar != null ? nblVar.I : null, jsonParserComponent.K7, g2.p), wcx.k(Q, jSONObject, "tooltips", i, nblVar != null ? nblVar.J : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, nblVar != null ? nblVar.K : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, nblVar != null ? nblVar.L : null, jsonParserComponent.r9), wcx.j(Q, jSONObject, "transition_animation_selector", g2.k, i, nblVar != null ? nblVar.M : null, DivTransitionSelector.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "transition_change", i, nblVar != null ? nblVar.N : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, nblVar != null ? nblVar.O : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, nblVar != null ? nblVar.P : null, i3yVar3), wcx.l(Q, jSONObject, i, nblVar != null ? nblVar.Q : null, DivTransitionTrigger.FROM_STRING, g2.q), wcx.k(Q, jSONObject, "variable_triggers", i, nblVar != null ? nblVar.R : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, nblVar != null ? nblVar.S : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", g2.l, i, nblVar != null ? nblVar.T : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, nblVar != null ? nblVar.U : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, nblVar != null ? nblVar.V : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, nblVar != null ? nblVar.W : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, nbl nblVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = nblVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = nblVar.b;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.u(yf90Var, jSONObject, "action", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "action_animation", nblVar.c, jsonParserComponent.A1);
        wcx.w(yf90Var, jSONObject, "actions", nblVar.d, i3yVar);
        wcx.p(nblVar.e, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(nblVar.f, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, nblVar.g);
        wcx.w(yf90Var, jSONObject, "animators", nblVar.h, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, nblVar.i, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", nblVar.j, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "capture_focus_on_action", nblVar.k);
        wcx.q(yf90Var, jSONObject, "clip_to_bounds", nblVar.l);
        wcx.q(yf90Var, jSONObject, "column_span", nblVar.m);
        wcx.q(yf90Var, jSONObject, "default_state_id", nblVar.n);
        wcx.w(yf90Var, jSONObject, "disappear_actions", nblVar.o, jsonParserComponent.Y2);
        wcx.t(yf90Var, jSONObject, "div_id", nblVar.p);
        wcx.w(yf90Var, jSONObject, "doubletap_actions", nblVar.q, i3yVar);
        wcx.w(yf90Var, jSONObject, "extensions", nblVar.r, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", nblVar.s, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", nblVar.t, jsonParserComponent.U3);
        exq exqVar3 = nblVar.u;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar3, i3yVar2);
        wcx.w(yf90Var, jSONObject, "hover_end_actions", nblVar.v, i3yVar);
        wcx.w(yf90Var, jSONObject, "hover_start_actions", nblVar.w, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", nblVar.x);
        wcx.u(yf90Var, jSONObject, "layout_provider", nblVar.y, jsonParserComponent.Y4);
        wcx.w(yf90Var, jSONObject, "longtap_actions", nblVar.z, i3yVar);
        exq exqVar4 = nblVar.A;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar4, i3yVar3);
        wcx.u(yf90Var, jSONObject, "paddings", nblVar.B, i3yVar3);
        wcx.w(yf90Var, jSONObject, "press_end_actions", nblVar.C, i3yVar);
        wcx.w(yf90Var, jSONObject, "press_start_actions", nblVar.D, i3yVar);
        wcx.q(yf90Var, jSONObject, "reuse_id", nblVar.E);
        wcx.q(yf90Var, jSONObject, "row_span", nblVar.F);
        wcx.w(yf90Var, jSONObject, "selected_actions", nblVar.G, i3yVar);
        wcx.t(yf90Var, jSONObject, "state_id_variable", nblVar.H);
        wcx.w(yf90Var, jSONObject, "states", nblVar.I, jsonParserComponent.K7);
        wcx.w(yf90Var, jSONObject, "tooltips", nblVar.J, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", nblVar.K, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", nblVar.L, jsonParserComponent.r9);
        wcx.p(nblVar.M, DivTransitionSelector.TO_STRING, yf90Var, "transition_animation_selector", jSONObject);
        wcx.u(yf90Var, jSONObject, "transition_change", nblVar.N, jsonParserComponent.e2);
        exq exqVar5 = nblVar.O;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar5, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", nblVar.P, i3yVar4);
        wcx.v(yf90Var, jSONObject, nblVar.Q, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", ClidProvider.STATE);
        wcx.w(yf90Var, jSONObject, "variable_triggers", nblVar.R, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", nblVar.S, jsonParserComponent.G9);
        wcx.p(nblVar.T, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar6 = nblVar.U;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar6, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", nblVar.V, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", nblVar.W, i3yVar2);
        return jSONObject;
    }
}
