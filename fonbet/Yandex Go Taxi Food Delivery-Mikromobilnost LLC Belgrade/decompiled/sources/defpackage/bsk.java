package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.t0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bsk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public bsk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final dsk c(yf90 yf90Var, dsk dskVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = dskVar != null ? dskVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        exq i3 = wcx.i(Q, jSONObject, "action", i, dskVar != null ? dskVar.b : null, i3yVar6);
        exq i4 = wcx.i(Q, jSONObject, "action_animation", i, dskVar != null ? dskVar.c : null, jsonParserComponent.A1);
        exq k = wcx.k(Q, jSONObject, "actions", i, dskVar != null ? dskVar.d : null, i3yVar6);
        qkj qkjVar = t0.l;
        exq exqVar2 = dskVar != null ? dskVar.e : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        qkj qkjVar2 = t0.m;
        exq exqVar3 = dskVar != null ? dskVar.f : null;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", qkjVar2, i, exqVar3, tlsVar2, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, dskVar != null ? dskVar.g : null, b.g, t0.r);
        exq k2 = wcx.k(Q, jSONObject, "animators", i, dskVar != null ? dskVar.h : null, jsonParserComponent.D1);
        exq i5 = wcx.i(Q, jSONObject, "aspect", i, dskVar != null ? dskVar.i : null, jsonParserComponent.M1);
        exq k3 = wcx.k(Q, jSONObject, C0553n3.g, i, dskVar != null ? dskVar.j : null, jsonParserComponent.P1);
        exq i6 = wcx.i(Q, jSONObject, "border", i, dskVar != null ? dskVar.k : null, jsonParserComponent.V1);
        wms wmsVar = wm11.a;
        exq exqVar4 = dskVar != null ? dskVar.l : null;
        tls tlsVar3 = b.f;
        exq j4 = wcx.j(Q, jSONObject, "capture_focus_on_action", wmsVar, i, exqVar4, tlsVar3, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar5 = dskVar != null ? dskVar.m : null;
        tls tlsVar4 = b.h;
        exq j5 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar5, tlsVar4, t0.s);
        exq j6 = wcx.j(Q, jSONObject, "content_alignment_horizontal", t0.n, i, dskVar != null ? dskVar.n : null, tlsVar, kbsVar);
        exq j7 = wcx.j(Q, jSONObject, "content_alignment_vertical", t0.o, i, dskVar != null ? dskVar.o : null, tlsVar2, kbsVar);
        exq k4 = wcx.k(Q, jSONObject, "disappear_actions", i, dskVar != null ? dskVar.p : null, jsonParserComponent.Y2);
        exq k5 = wcx.k(Q, jSONObject, "doubletap_actions", i, dskVar != null ? dskVar.q : null, i3yVar6);
        exq k6 = wcx.k(Q, jSONObject, "extensions", i, dskVar != null ? dskVar.r : null, jsonParserComponent.k3);
        exq i7 = wcx.i(Q, jSONObject, "focus", i, dskVar != null ? dskVar.s : null, jsonParserComponent.L3);
        exq k7 = wcx.k(Q, jSONObject, "functions", i, dskVar != null ? dskVar.t : null, jsonParserComponent.U3);
        dxf0 dxf0Var = wm11.e;
        exq exqVar6 = dskVar != null ? dskVar.u : null;
        tls tlsVar5 = b.e;
        exq e = wcx.e(Q, jSONObject, "gif_url", dxf0Var, i, exqVar6, tlsVar5, kbsVar);
        exq i8 = wcx.i(Q, jSONObject, "height", i, dskVar != null ? dskVar.v : null, i3yVar5);
        exq k8 = wcx.k(Q, jSONObject, "hover_end_actions", i, dskVar != null ? dskVar.w : null, i3yVar6);
        exq k9 = wcx.k(Q, jSONObject, "hover_start_actions", i, dskVar != null ? dskVar.x : null, i3yVar6);
        exq exqVar7 = dskVar != null ? dskVar.y : null;
        abl0 abl0Var = q5z.c;
        exq h = wcx.h(Q, jSONObject, "id", i, exqVar7, abl0Var);
        exq i9 = wcx.i(Q, jSONObject, "layout_provider", i, dskVar != null ? dskVar.z : null, jsonParserComponent.Y4);
        exq k10 = wcx.k(Q, jSONObject, "longtap_actions", i, dskVar != null ? dskVar.A : null, i3yVar6);
        exq i10 = wcx.i(Q, jSONObject, "margins", i, dskVar != null ? dskVar.B : null, i3yVar4);
        exq i11 = wcx.i(Q, jSONObject, "paddings", i, dskVar != null ? dskVar.C : null, i3yVar4);
        exq j8 = wcx.j(Q, jSONObject, "placeholder_color", wm11.f, i, dskVar != null ? dskVar.D : null, b.b, kbsVar);
        exq j9 = wcx.j(Q, jSONObject, "preload_required", wmsVar, i, dskVar != null ? dskVar.E : null, tlsVar3, kbsVar);
        exq k11 = wcx.k(Q, jSONObject, "press_end_actions", i, dskVar != null ? dskVar.F : null, i3yVar6);
        exq k12 = wcx.k(Q, jSONObject, "press_start_actions", i, dskVar != null ? dskVar.G : null, i3yVar6);
        ums umsVar = wm11.c;
        return new dsk(i2, i3, i4, k, j, j2, j3, k2, i5, k3, i6, j4, j5, j6, j7, k4, k5, k6, i7, k7, e, i8, k8, k9, h, i9, k10, i10, i11, j8, j9, k11, k12, wcx.j(Q, jSONObject, "preview", umsVar, i, dskVar != null ? dskVar.H : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "preview_url", dxf0Var, i, dskVar != null ? dskVar.I : null, tlsVar5, kbsVar), wcx.j(Q, jSONObject, "reuse_id", umsVar, i, dskVar != null ? dskVar.J : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, dskVar != null ? dskVar.K : null, tlsVar4, t0.t), wcx.j(Q, jSONObject, "scale", t0.p, i, dskVar != null ? dskVar.L : null, DivImageScale.FROM_STRING, kbsVar), wcx.k(Q, jSONObject, "selected_actions", i, dskVar != null ? dskVar.M : null, i3yVar6), wcx.k(Q, jSONObject, "tooltips", i, dskVar != null ? dskVar.N : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, dskVar != null ? dskVar.O : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, dskVar != null ? dskVar.P : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, dskVar != null ? dskVar.Q : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, dskVar != null ? dskVar.R : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, dskVar != null ? dskVar.S : null, i3yVar3), wcx.l(Q, jSONObject, i, dskVar != null ? dskVar.T : null, DivTransitionTrigger.FROM_STRING, t0.u), wcx.k(Q, jSONObject, "variable_triggers", i, dskVar != null ? dskVar.U : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, dskVar != null ? dskVar.V : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", t0.q, i, dskVar != null ? dskVar.W : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, dskVar != null ? dskVar.X : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, dskVar != null ? dskVar.Y : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, dskVar != null ? dskVar.Z : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dsk dskVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = dskVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = dskVar.b;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.u(yf90Var, jSONObject, "action", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "action_animation", dskVar.c, jsonParserComponent.A1);
        wcx.w(yf90Var, jSONObject, "actions", dskVar.d, i3yVar);
        exq exqVar3 = dskVar.e;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        wcx.p(exqVar3, tlsVar, yf90Var, "alignment_horizontal", jSONObject);
        exq exqVar4 = dskVar.f;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        wcx.p(exqVar4, tlsVar2, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, dskVar.g);
        wcx.w(yf90Var, jSONObject, "animators", dskVar.h, jsonParserComponent.D1);
        wcx.u(yf90Var, jSONObject, "aspect", dskVar.i, jsonParserComponent.M1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, dskVar.j, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", dskVar.k, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "capture_focus_on_action", dskVar.l);
        wcx.q(yf90Var, jSONObject, "column_span", dskVar.m);
        wcx.p(dskVar.n, tlsVar, yf90Var, "content_alignment_horizontal", jSONObject);
        wcx.p(dskVar.o, tlsVar2, yf90Var, "content_alignment_vertical", jSONObject);
        wcx.w(yf90Var, jSONObject, "disappear_actions", dskVar.p, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "doubletap_actions", dskVar.q, i3yVar);
        wcx.w(yf90Var, jSONObject, "extensions", dskVar.r, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", dskVar.s, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", dskVar.t, jsonParserComponent.U3);
        exq exqVar5 = dskVar.u;
        tls tlsVar3 = b.c;
        wcx.p(exqVar5, tlsVar3, yf90Var, "gif_url", jSONObject);
        exq exqVar6 = dskVar.v;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar6, i3yVar2);
        wcx.w(yf90Var, jSONObject, "hover_end_actions", dskVar.w, i3yVar);
        wcx.w(yf90Var, jSONObject, "hover_start_actions", dskVar.x, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", dskVar.y);
        wcx.u(yf90Var, jSONObject, "layout_provider", dskVar.z, jsonParserComponent.Y4);
        wcx.w(yf90Var, jSONObject, "longtap_actions", dskVar.A, i3yVar);
        exq exqVar7 = dskVar.B;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar7, i3yVar3);
        wcx.u(yf90Var, jSONObject, "paddings", dskVar.C, i3yVar3);
        wcx.p(dskVar.D, b.a, yf90Var, "placeholder_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "preload_required", dskVar.E);
        wcx.w(yf90Var, jSONObject, "press_end_actions", dskVar.F, i3yVar);
        wcx.w(yf90Var, jSONObject, "press_start_actions", dskVar.G, i3yVar);
        wcx.q(yf90Var, jSONObject, "preview", dskVar.H);
        wcx.p(dskVar.I, tlsVar3, yf90Var, "preview_url", jSONObject);
        wcx.q(yf90Var, jSONObject, "reuse_id", dskVar.J);
        wcx.q(yf90Var, jSONObject, "row_span", dskVar.K);
        wcx.p(dskVar.L, DivImageScale.TO_STRING, yf90Var, "scale", jSONObject);
        wcx.w(yf90Var, jSONObject, "selected_actions", dskVar.M, i3yVar);
        wcx.w(yf90Var, jSONObject, "tooltips", dskVar.N, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", dskVar.O, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", dskVar.P, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", dskVar.Q, jsonParserComponent.e2);
        exq exqVar8 = dskVar.R;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar8, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", dskVar.S, i3yVar4);
        wcx.v(yf90Var, jSONObject, dskVar.T, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "gif");
        wcx.w(yf90Var, jSONObject, "variable_triggers", dskVar.U, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", dskVar.V, jsonParserComponent.G9);
        wcx.p(dskVar.W, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar9 = dskVar.X;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar9, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", dskVar.Y, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", dskVar.Z, i3yVar2);
        return jSONObject;
    }
}
