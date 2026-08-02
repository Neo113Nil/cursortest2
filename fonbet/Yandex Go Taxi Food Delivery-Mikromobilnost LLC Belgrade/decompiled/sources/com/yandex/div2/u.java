package com.yandex.div2;

import com.yandex.div2.DivContainer;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.abl0;
import defpackage.d290;
import defpackage.exq;
import defpackage.hex;
import defpackage.i3y;
import defpackage.kbs;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.tls;
import defpackage.tms;
import defpackage.udq0;
import defpackage.wcx;
import defpackage.wm11;
import defpackage.wms;
import defpackage.wwg;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u implements zsq0, yey0 {
    public final JsonParserComponent a;

    public u(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final x c(yf90 yf90Var, x xVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = xVar != null ? xVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.z2;
        i3y i3yVar6 = jsonParserComponent.p7;
        i3y i3yVar7 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        exq i3 = wcx.i(Q, jSONObject, "action", i, xVar != null ? xVar.b : null, i3yVar7);
        exq i4 = wcx.i(Q, jSONObject, "action_animation", i, xVar != null ? xVar.c : null, jsonParserComponent.A1);
        exq k = wcx.k(Q, jSONObject, "actions", i, xVar != null ? xVar.d : null, i3yVar7);
        qkj qkjVar = w.n;
        exq exqVar2 = xVar != null ? xVar.e : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", w.o, i, xVar != null ? xVar.f : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, xVar != null ? xVar.g : null, com.yandex.div.internal.parser.b.g, w.u);
        exq k2 = wcx.k(Q, jSONObject, "animators", i, xVar != null ? xVar.h : null, jsonParserComponent.D1);
        exq i5 = wcx.i(Q, jSONObject, "aspect", i, xVar != null ? xVar.i : null, jsonParserComponent.M1);
        exq k3 = wcx.k(Q, jSONObject, C0553n3.g, i, xVar != null ? xVar.j : null, jsonParserComponent.P1);
        exq i6 = wcx.i(Q, jSONObject, "border", i, xVar != null ? xVar.k : null, jsonParserComponent.V1);
        wms wmsVar = wm11.a;
        exq exqVar3 = xVar != null ? xVar.l : null;
        tls tlsVar2 = com.yandex.div.internal.parser.b.f;
        exq j4 = wcx.j(Q, jSONObject, "capture_focus_on_action", wmsVar, i, exqVar3, tlsVar2, kbsVar);
        exq j5 = wcx.j(Q, jSONObject, "clip_to_bounds", wmsVar, i, xVar != null ? xVar.m : null, tlsVar2, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar4 = xVar != null ? xVar.n : null;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        exq j6 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar4, tlsVar3, w.v);
        exq j7 = wcx.j(Q, jSONObject, "content_alignment_horizontal", w.p, i, xVar != null ? xVar.o : null, DivContentAlignmentHorizontal.FROM_STRING, kbsVar);
        exq j8 = wcx.j(Q, jSONObject, "content_alignment_vertical", w.q, i, xVar != null ? xVar.p : null, DivContentAlignmentVertical.FROM_STRING, kbsVar);
        exq k4 = wcx.k(Q, jSONObject, "disappear_actions", i, xVar != null ? xVar.q : null, jsonParserComponent.Y2);
        exq k5 = wcx.k(Q, jSONObject, "doubletap_actions", i, xVar != null ? xVar.r : null, i3yVar7);
        exq k6 = wcx.k(Q, jSONObject, "extensions", i, xVar != null ? xVar.s : null, jsonParserComponent.k3);
        exq i7 = wcx.i(Q, jSONObject, "focus", i, xVar != null ? xVar.t : null, jsonParserComponent.L3);
        exq k7 = wcx.k(Q, jSONObject, "functions", i, xVar != null ? xVar.u : null, jsonParserComponent.U3);
        exq i8 = wcx.i(Q, jSONObject, "height", i, xVar != null ? xVar.v : null, i3yVar6);
        exq k8 = wcx.k(Q, jSONObject, "hover_end_actions", i, xVar != null ? xVar.w : null, i3yVar7);
        exq k9 = wcx.k(Q, jSONObject, "hover_start_actions", i, xVar != null ? xVar.x : null, i3yVar7);
        exq exqVar5 = xVar != null ? xVar.y : null;
        abl0 abl0Var = q5z.c;
        return new x(i2, i3, i4, k, j, j2, j3, k2, i5, k3, i6, j4, j5, j6, j7, j8, k4, k5, k6, i7, k7, i8, k8, k9, wcx.h(Q, jSONObject, "id", i, exqVar5, abl0Var), wcx.i(Q, jSONObject, "item_builder", i, xVar != null ? xVar.z : null, jsonParserComponent.n2), wcx.j(Q, jSONObject, "item_spacing", tmsVar, i, xVar != null ? xVar.A : null, tlsVar3, w.w), wcx.k(Q, jSONObject, "items", i, xVar != null ? xVar.B : null, jsonParserComponent.Y9), wcx.j(Q, jSONObject, "layout_mode", w.r, i, xVar != null ? xVar.C : null, DivContainer.LayoutMode.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "layout_provider", i, xVar != null ? xVar.D : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "line_separator", i, xVar != null ? xVar.E : null, i3yVar5), wcx.j(Q, jSONObject, "line_spacing", tmsVar, i, xVar != null ? xVar.F : null, tlsVar3, w.x), wcx.k(Q, jSONObject, "longtap_actions", i, xVar != null ? xVar.G : null, i3yVar7), wcx.i(Q, jSONObject, "margins", i, xVar != null ? xVar.H : null, i3yVar4), wcx.j(Q, jSONObject, "orientation", w.s, i, xVar != null ? xVar.I : null, DivContainer.Orientation.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "paddings", i, xVar != null ? xVar.J : null, i3yVar4), wcx.k(Q, jSONObject, "press_end_actions", i, xVar != null ? xVar.K : null, i3yVar7), wcx.k(Q, jSONObject, "press_start_actions", i, xVar != null ? xVar.L : null, i3yVar7), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, xVar != null ? xVar.M : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, xVar != null ? xVar.N : null, tlsVar3, w.y), wcx.k(Q, jSONObject, "selected_actions", i, xVar != null ? xVar.O : null, i3yVar7), wcx.i(Q, jSONObject, "separator", i, xVar != null ? xVar.P : null, i3yVar5), wcx.k(Q, jSONObject, "tooltips", i, xVar != null ? xVar.Q : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, xVar != null ? xVar.R : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, xVar != null ? xVar.S : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, xVar != null ? xVar.T : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, xVar != null ? xVar.U : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, xVar != null ? xVar.V : null, i3yVar3), wcx.l(Q, jSONObject, i, xVar != null ? xVar.W : null, DivTransitionTrigger.FROM_STRING, w.z), wcx.k(Q, jSONObject, "variable_triggers", i, xVar != null ? xVar.X : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, xVar != null ? xVar.Y : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", w.t, i, xVar != null ? xVar.Z : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, xVar != null ? xVar.a0 : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, xVar != null ? xVar.b0 : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, xVar != null ? xVar.c0 : null, i3yVar6));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, x xVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = xVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = xVar.b;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.u(yf90Var, jSONObject, "action", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "action_animation", xVar.c, jsonParserComponent.A1);
        wcx.w(yf90Var, jSONObject, "actions", xVar.d, i3yVar);
        wcx.p(xVar.e, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(xVar.f, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, xVar.g);
        wcx.w(yf90Var, jSONObject, "animators", xVar.h, jsonParserComponent.D1);
        wcx.u(yf90Var, jSONObject, "aspect", xVar.i, jsonParserComponent.M1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, xVar.j, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", xVar.k, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "capture_focus_on_action", xVar.l);
        wcx.q(yf90Var, jSONObject, "clip_to_bounds", xVar.m);
        wcx.q(yf90Var, jSONObject, "column_span", xVar.n);
        wcx.p(xVar.o, DivContentAlignmentHorizontal.TO_STRING, yf90Var, "content_alignment_horizontal", jSONObject);
        wcx.p(xVar.p, DivContentAlignmentVertical.TO_STRING, yf90Var, "content_alignment_vertical", jSONObject);
        wcx.w(yf90Var, jSONObject, "disappear_actions", xVar.q, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "doubletap_actions", xVar.r, i3yVar);
        wcx.w(yf90Var, jSONObject, "extensions", xVar.s, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", xVar.t, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", xVar.u, jsonParserComponent.U3);
        exq exqVar3 = xVar.v;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar3, i3yVar2);
        wcx.w(yf90Var, jSONObject, "hover_end_actions", xVar.w, i3yVar);
        wcx.w(yf90Var, jSONObject, "hover_start_actions", xVar.x, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", xVar.y);
        wcx.u(yf90Var, jSONObject, "item_builder", xVar.z, jsonParserComponent.n2);
        wcx.q(yf90Var, jSONObject, "item_spacing", xVar.A);
        wcx.w(yf90Var, jSONObject, "items", xVar.B, jsonParserComponent.Y9);
        wcx.p(xVar.C, DivContainer.LayoutMode.TO_STRING, yf90Var, "layout_mode", jSONObject);
        wcx.u(yf90Var, jSONObject, "layout_provider", xVar.D, jsonParserComponent.Y4);
        exq exqVar4 = xVar.E;
        i3y i3yVar3 = jsonParserComponent.z2;
        wcx.u(yf90Var, jSONObject, "line_separator", exqVar4, i3yVar3);
        wcx.q(yf90Var, jSONObject, "line_spacing", xVar.F);
        wcx.w(yf90Var, jSONObject, "longtap_actions", xVar.G, i3yVar);
        exq exqVar5 = xVar.H;
        i3y i3yVar4 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar5, i3yVar4);
        wcx.p(xVar.I, DivContainer.Orientation.TO_STRING, yf90Var, "orientation", jSONObject);
        wcx.u(yf90Var, jSONObject, "paddings", xVar.J, i3yVar4);
        wcx.w(yf90Var, jSONObject, "press_end_actions", xVar.K, i3yVar);
        wcx.w(yf90Var, jSONObject, "press_start_actions", xVar.L, i3yVar);
        wcx.q(yf90Var, jSONObject, "reuse_id", xVar.M);
        wcx.q(yf90Var, jSONObject, "row_span", xVar.N);
        wcx.w(yf90Var, jSONObject, "selected_actions", xVar.O, i3yVar);
        wcx.u(yf90Var, jSONObject, "separator", xVar.P, i3yVar3);
        wcx.w(yf90Var, jSONObject, "tooltips", xVar.Q, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", xVar.R, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", xVar.S, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", xVar.T, jsonParserComponent.e2);
        exq exqVar6 = xVar.U;
        i3y i3yVar5 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar6, i3yVar5);
        wcx.u(yf90Var, jSONObject, "transition_out", xVar.V, i3yVar5);
        wcx.v(yf90Var, jSONObject, xVar.W, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "container");
        wcx.w(yf90Var, jSONObject, "variable_triggers", xVar.X, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", xVar.Y, jsonParserComponent.G9);
        wcx.p(xVar.Z, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar7 = xVar.a0;
        i3y i3yVar6 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar7, i3yVar6);
        wcx.w(yf90Var, jSONObject, "visibility_actions", xVar.b0, i3yVar6);
        wcx.u(yf90Var, jSONObject, "width", xVar.c0, i3yVar2);
        return jSONObject;
    }
}
