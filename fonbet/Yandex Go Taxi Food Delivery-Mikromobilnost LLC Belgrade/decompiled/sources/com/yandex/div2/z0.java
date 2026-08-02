package com.yandex.div2;

import com.yandex.div2.DivIndicator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.abl0;
import defpackage.d290;
import defpackage.exq;
import defpackage.hex;
import defpackage.i3y;
import defpackage.kbs;
import defpackage.q5z;
import defpackage.rms;
import defpackage.sms;
import defpackage.tls;
import defpackage.tms;
import defpackage.udq0;
import defpackage.wcx;
import defpackage.wm11;
import defpackage.wwg;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z0 implements zsq0, yey0 {
    public final JsonParserComponent a;

    public z0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final c1 c(yf90 yf90Var, c1 c1Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = c1Var != null ? c1Var.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.L6;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        rms rmsVar = wm11.f;
        exq exqVar2 = c1Var != null ? c1Var.b : null;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "active_item_color", rmsVar, i, exqVar2, tlsVar, kbsVar);
        sms smsVar = wm11.d;
        exq exqVar3 = c1Var != null ? c1Var.c : null;
        tls tlsVar2 = com.yandex.div.internal.parser.b.g;
        exq j2 = wcx.j(Q, jSONObject, "active_item_size", smsVar, i, exqVar3, tlsVar2, b1.p);
        exq i3 = wcx.i(Q, jSONObject, "active_shape", i, c1Var != null ? c1Var.d : null, i3yVar6);
        exq j3 = wcx.j(Q, jSONObject, "alignment_horizontal", b1.l, i, c1Var != null ? c1Var.e : null, DivAlignmentHorizontal.FROM_STRING, kbsVar);
        exq j4 = wcx.j(Q, jSONObject, "alignment_vertical", b1.m, i, c1Var != null ? c1Var.f : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j5 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, i, c1Var != null ? c1Var.g : null, tlsVar2, b1.q);
        exq j6 = wcx.j(Q, jSONObject, "animation", b1.n, i, c1Var != null ? c1Var.h : null, DivIndicator.Animation.FROM_STRING, kbsVar);
        exq k = wcx.k(Q, jSONObject, "animators", i, c1Var != null ? c1Var.i : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, c1Var != null ? c1Var.j : null, jsonParserComponent.P1);
        exq i4 = wcx.i(Q, jSONObject, "border", i, c1Var != null ? c1Var.k : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar4 = c1Var != null ? c1Var.l : null;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        exq j7 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar4, tlsVar3, b1.r);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, c1Var != null ? c1Var.m : null, jsonParserComponent.Y2);
        exq k4 = wcx.k(Q, jSONObject, "extensions", i, c1Var != null ? c1Var.n : null, jsonParserComponent.k3);
        exq i5 = wcx.i(Q, jSONObject, "focus", i, c1Var != null ? c1Var.o : null, jsonParserComponent.L3);
        exq k5 = wcx.k(Q, jSONObject, "functions", i, c1Var != null ? c1Var.p : null, jsonParserComponent.U3);
        exq i6 = wcx.i(Q, jSONObject, "height", i, c1Var != null ? c1Var.q : null, i3yVar5);
        exq exqVar5 = c1Var != null ? c1Var.r : null;
        abl0 abl0Var = q5z.c;
        return new c1(i2, j, j2, i3, j3, j4, j5, j6, k, k2, i4, j7, k3, k4, i5, k5, i6, wcx.h(Q, jSONObject, "id", i, exqVar5, abl0Var), wcx.j(Q, jSONObject, "inactive_item_color", rmsVar, i, c1Var != null ? c1Var.s : null, tlsVar, kbsVar), wcx.i(Q, jSONObject, "inactive_minimum_shape", i, c1Var != null ? c1Var.t : null, i3yVar6), wcx.i(Q, jSONObject, "inactive_shape", i, c1Var != null ? c1Var.u : null, i3yVar6), wcx.i(Q, jSONObject, "items_placement", i, c1Var != null ? c1Var.v : null, jsonParserComponent.m4), wcx.i(Q, jSONObject, "layout_provider", i, c1Var != null ? c1Var.w : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "margins", i, c1Var != null ? c1Var.x : null, i3yVar4), wcx.j(Q, jSONObject, "minimum_item_size", smsVar, i, c1Var != null ? c1Var.y : null, tlsVar2, b1.s), wcx.i(Q, jSONObject, "paddings", i, c1Var != null ? c1Var.z : null, i3yVar4), wcx.h(Q, jSONObject, "pager_id", i, c1Var != null ? c1Var.A : null, abl0Var), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, c1Var != null ? c1Var.B : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, c1Var != null ? c1Var.C : null, tlsVar3, b1.t), wcx.k(Q, jSONObject, "selected_actions", i, c1Var != null ? c1Var.D : null, jsonParserComponent.u1), wcx.i(Q, jSONObject, "shape", i, c1Var != null ? c1Var.E : null, jsonParserComponent.j7), wcx.i(Q, jSONObject, "space_between_centers", i, c1Var != null ? c1Var.F : null, jsonParserComponent.F3), wcx.k(Q, jSONObject, "tooltips", i, c1Var != null ? c1Var.G : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, c1Var != null ? c1Var.H : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, c1Var != null ? c1Var.I : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, c1Var != null ? c1Var.J : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, c1Var != null ? c1Var.K : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, c1Var != null ? c1Var.L : null, i3yVar3), wcx.l(Q, jSONObject, i, c1Var != null ? c1Var.M : null, DivTransitionTrigger.FROM_STRING, b1.u), wcx.k(Q, jSONObject, "variable_triggers", i, c1Var != null ? c1Var.N : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, c1Var != null ? c1Var.O : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", b1.o, i, c1Var != null ? c1Var.P : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, c1Var != null ? c1Var.Q : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, c1Var != null ? c1Var.R : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, c1Var != null ? c1Var.S : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, c1 c1Var) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = c1Var.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = c1Var.b;
        tls tlsVar = com.yandex.div.internal.parser.b.a;
        wcx.p(exqVar2, tlsVar, yf90Var, "active_item_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "active_item_size", c1Var.c);
        exq exqVar3 = c1Var.d;
        i3y i3yVar = jsonParserComponent.L6;
        wcx.u(yf90Var, jSONObject, "active_shape", exqVar3, i3yVar);
        wcx.p(c1Var.e, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(c1Var.f, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, c1Var.g);
        wcx.p(c1Var.h, DivIndicator.Animation.TO_STRING, yf90Var, "animation", jSONObject);
        wcx.w(yf90Var, jSONObject, "animators", c1Var.i, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, c1Var.j, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", c1Var.k, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_span", c1Var.l);
        wcx.w(yf90Var, jSONObject, "disappear_actions", c1Var.m, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "extensions", c1Var.n, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", c1Var.o, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", c1Var.p, jsonParserComponent.U3);
        exq exqVar4 = c1Var.q;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar4, i3yVar2);
        wcx.t(yf90Var, jSONObject, "id", c1Var.r);
        wcx.p(c1Var.s, tlsVar, yf90Var, "inactive_item_color", jSONObject);
        wcx.u(yf90Var, jSONObject, "inactive_minimum_shape", c1Var.t, i3yVar);
        wcx.u(yf90Var, jSONObject, "inactive_shape", c1Var.u, i3yVar);
        wcx.u(yf90Var, jSONObject, "items_placement", c1Var.v, jsonParserComponent.m4);
        wcx.u(yf90Var, jSONObject, "layout_provider", c1Var.w, jsonParserComponent.Y4);
        exq exqVar5 = c1Var.x;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar5, i3yVar3);
        wcx.q(yf90Var, jSONObject, "minimum_item_size", c1Var.y);
        wcx.u(yf90Var, jSONObject, "paddings", c1Var.z, i3yVar3);
        wcx.t(yf90Var, jSONObject, "pager_id", c1Var.A);
        wcx.q(yf90Var, jSONObject, "reuse_id", c1Var.B);
        wcx.q(yf90Var, jSONObject, "row_span", c1Var.C);
        wcx.w(yf90Var, jSONObject, "selected_actions", c1Var.D, jsonParserComponent.u1);
        wcx.u(yf90Var, jSONObject, "shape", c1Var.E, jsonParserComponent.j7);
        wcx.u(yf90Var, jSONObject, "space_between_centers", c1Var.F, jsonParserComponent.F3);
        wcx.w(yf90Var, jSONObject, "tooltips", c1Var.G, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", c1Var.H, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", c1Var.I, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", c1Var.J, jsonParserComponent.e2);
        exq exqVar6 = c1Var.K;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar6, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", c1Var.L, i3yVar4);
        wcx.v(yf90Var, jSONObject, c1Var.M, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "indicator");
        wcx.w(yf90Var, jSONObject, "variable_triggers", c1Var.N, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", c1Var.O, jsonParserComponent.G9);
        wcx.p(c1Var.P, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar7 = c1Var.Q;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar7, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", c1Var.R, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", c1Var.S, i3yVar2);
        return jSONObject;
    }
}
