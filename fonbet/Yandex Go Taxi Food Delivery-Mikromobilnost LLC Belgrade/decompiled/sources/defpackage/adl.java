package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.i2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class adl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public adl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final cdl c(yf90 yf90Var, cdl cdlVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = cdlVar != null ? cdlVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = i2.f;
        exq exqVar2 = cdlVar != null ? cdlVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", i2.g, i, cdlVar != null ? cdlVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, cdlVar != null ? cdlVar.d : null, b.g, i2.i);
        exq k = wcx.k(Q, jSONObject, "animators", i, cdlVar != null ? cdlVar.e : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, cdlVar != null ? cdlVar.f : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, cdlVar != null ? cdlVar.g : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar3 = cdlVar != null ? cdlVar.h : null;
        tls tlsVar2 = b.h;
        exq j4 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar3, tlsVar2, i2.j);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, cdlVar != null ? cdlVar.i : null, jsonParserComponent.Y2);
        exq k4 = wcx.k(Q, jSONObject, "extensions", i, cdlVar != null ? cdlVar.j : null, jsonParserComponent.k3);
        exq i4 = wcx.i(Q, jSONObject, "focus", i, cdlVar != null ? cdlVar.k : null, jsonParserComponent.L3);
        exq k5 = wcx.k(Q, jSONObject, "functions", i, cdlVar != null ? cdlVar.l : null, jsonParserComponent.U3);
        exq i5 = wcx.i(Q, jSONObject, "height", i, cdlVar != null ? cdlVar.m : null, i3yVar5);
        exq exqVar4 = cdlVar != null ? cdlVar.n : null;
        abl0 abl0Var = q5z.c;
        return new cdl(i2, j, j2, j3, k, k2, i3, j4, k3, k4, i4, k5, i5, wcx.h(Q, jSONObject, "id", i, exqVar4, abl0Var), wcx.j(Q, jSONObject, "is_enabled", wm11.a, i, cdlVar != null ? cdlVar.o : null, b.f, kbsVar), wcx.a(Q, jSONObject, "is_on_variable", i, cdlVar != null ? cdlVar.p : null), wcx.i(Q, jSONObject, "layout_provider", i, cdlVar != null ? cdlVar.q : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "margins", i, cdlVar != null ? cdlVar.r : null, i3yVar4), wcx.j(Q, jSONObject, "on_color", wm11.f, i, cdlVar != null ? cdlVar.s : null, b.b, kbsVar), wcx.i(Q, jSONObject, "paddings", i, cdlVar != null ? cdlVar.t : null, i3yVar4), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, cdlVar != null ? cdlVar.u : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, cdlVar != null ? cdlVar.v : null, tlsVar2, i2.k), wcx.k(Q, jSONObject, "selected_actions", i, cdlVar != null ? cdlVar.w : null, jsonParserComponent.u1), wcx.k(Q, jSONObject, "tooltips", i, cdlVar != null ? cdlVar.x : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, cdlVar != null ? cdlVar.y : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, cdlVar != null ? cdlVar.z : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, cdlVar != null ? cdlVar.A : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, cdlVar != null ? cdlVar.B : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, cdlVar != null ? cdlVar.C : null, i3yVar3), wcx.l(Q, jSONObject, i, cdlVar != null ? cdlVar.D : null, DivTransitionTrigger.FROM_STRING, i2.l), wcx.k(Q, jSONObject, "variable_triggers", i, cdlVar != null ? cdlVar.E : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, cdlVar != null ? cdlVar.F : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", i2.h, i, cdlVar != null ? cdlVar.G : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, cdlVar != null ? cdlVar.H : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, cdlVar != null ? cdlVar.I : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, cdlVar != null ? cdlVar.J : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, cdl cdlVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = cdlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(cdlVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(cdlVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, cdlVar.d);
        wcx.w(yf90Var, jSONObject, "animators", cdlVar.e, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, cdlVar.f, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", cdlVar.g, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", cdlVar.h);
        wcx.w(yf90Var, jSONObject, "disappear_actions", cdlVar.i, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "extensions", cdlVar.j, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", cdlVar.k, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", cdlVar.l, jsonParserComponent.U3);
        exq exqVar2 = cdlVar.m;
        i3y i3yVar = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar2, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", cdlVar.n);
        wcx.q(yf90Var, jSONObject, "is_enabled", cdlVar.o);
        wcx.t(yf90Var, jSONObject, "is_on_variable", cdlVar.p);
        wcx.u(yf90Var, jSONObject, "layout_provider", cdlVar.q, jsonParserComponent.Y4);
        exq exqVar3 = cdlVar.r;
        i3y i3yVar2 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar3, i3yVar2);
        wcx.p(cdlVar.s, b.a, yf90Var, "on_color", jSONObject);
        wcx.u(yf90Var, jSONObject, "paddings", cdlVar.t, i3yVar2);
        wcx.q(yf90Var, jSONObject, "reuse_id", cdlVar.u);
        wcx.q(yf90Var, jSONObject, "row_span", cdlVar.v);
        wcx.w(yf90Var, jSONObject, "selected_actions", cdlVar.w, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "tooltips", cdlVar.x, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", cdlVar.y, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", cdlVar.z, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", cdlVar.A, jsonParserComponent.e2);
        exq exqVar4 = cdlVar.B;
        i3y i3yVar3 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar4, i3yVar3);
        wcx.u(yf90Var, jSONObject, "transition_out", cdlVar.C, i3yVar3);
        wcx.v(yf90Var, jSONObject, cdlVar.D, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "switch");
        wcx.w(yf90Var, jSONObject, "variable_triggers", cdlVar.E, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", cdlVar.F, jsonParserComponent.G9);
        wcx.p(cdlVar.G, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar5 = cdlVar.H;
        i3y i3yVar4 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar5, i3yVar4);
        wcx.w(yf90Var, jSONObject, "visibility_actions", cdlVar.I, i3yVar4);
        wcx.u(yf90Var, jSONObject, "width", cdlVar.J, i3yVar);
        return jSONObject;
    }
}
