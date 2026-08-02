package com.yandex.div2;

import com.yandex.div2.DivGallery;
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
import defpackage.wwg;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p0 implements zsq0, yey0 {
    public final JsonParserComponent a;

    public p0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final s0 c(yf90 yf90Var, s0 s0Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = s0Var != null ? s0Var.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = r0.l;
        exq exqVar2 = s0Var != null ? s0Var.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", r0.m, i, s0Var != null ? s0Var.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, s0Var != null ? s0Var.d : null, com.yandex.div.internal.parser.b.g, r0.t);
        exq k = wcx.k(Q, jSONObject, "animators", i, s0Var != null ? s0Var.e : null, jsonParserComponent.D1);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, s0Var != null ? s0Var.f : null, jsonParserComponent.P1);
        exq i3 = wcx.i(Q, jSONObject, "border", i, s0Var != null ? s0Var.g : null, jsonParserComponent.V1);
        tms tmsVar = wm11.b;
        exq exqVar3 = s0Var != null ? s0Var.h : null;
        tls tlsVar2 = com.yandex.div.internal.parser.b.h;
        exq j4 = wcx.j(Q, jSONObject, "column_count", tmsVar, i, exqVar3, tlsVar2, r0.u);
        exq j5 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, s0Var != null ? s0Var.i : null, tlsVar2, r0.v);
        qkj qkjVar2 = r0.n;
        exq exqVar4 = s0Var != null ? s0Var.j : null;
        tls tlsVar3 = DivGallery.ContentAlignment.FROM_STRING;
        exq j6 = wcx.j(Q, jSONObject, "cross_content_alignment", qkjVar2, i, exqVar4, tlsVar3, kbsVar);
        exq j7 = wcx.j(Q, jSONObject, "cross_spacing", tmsVar, i, s0Var != null ? s0Var.k : null, tlsVar2, r0.w);
        exq j8 = wcx.j(Q, jSONObject, "default_item", tmsVar, i, s0Var != null ? s0Var.l : null, tlsVar2, r0.x);
        exq k3 = wcx.k(Q, jSONObject, "disappear_actions", i, s0Var != null ? s0Var.m : null, jsonParserComponent.Y2);
        exq k4 = wcx.k(Q, jSONObject, "extensions", i, s0Var != null ? s0Var.n : null, jsonParserComponent.k3);
        exq i4 = wcx.i(Q, jSONObject, "focus", i, s0Var != null ? s0Var.o : null, jsonParserComponent.L3);
        exq k5 = wcx.k(Q, jSONObject, "functions", i, s0Var != null ? s0Var.p : null, jsonParserComponent.U3);
        exq i5 = wcx.i(Q, jSONObject, "height", i, s0Var != null ? s0Var.q : null, i3yVar5);
        exq exqVar5 = s0Var != null ? s0Var.r : null;
        abl0 abl0Var = q5z.c;
        return new s0(i2, j, j2, j3, k, k2, i3, j4, j5, j6, j7, j8, k3, k4, i4, k5, i5, wcx.h(Q, jSONObject, "id", i, exqVar5, abl0Var), wcx.i(Q, jSONObject, "item_builder", i, s0Var != null ? s0Var.s : null, jsonParserComponent.n2), wcx.j(Q, jSONObject, "item_spacing", tmsVar, i, s0Var != null ? s0Var.t : null, tlsVar2, r0.y), wcx.k(Q, jSONObject, "items", i, s0Var != null ? s0Var.u : null, jsonParserComponent.Y9), wcx.i(Q, jSONObject, "layout_provider", i, s0Var != null ? s0Var.v : null, jsonParserComponent.Y4), wcx.i(Q, jSONObject, "margins", i, s0Var != null ? s0Var.w : null, i3yVar4), wcx.j(Q, jSONObject, "orientation", r0.o, i, s0Var != null ? s0Var.x : null, DivGallery.Orientation.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "paddings", i, s0Var != null ? s0Var.y : null, i3yVar4), wcx.j(Q, jSONObject, "restrict_parent_scroll", wm11.a, i, s0Var != null ? s0Var.z : null, com.yandex.div.internal.parser.b.f, kbsVar), wcx.j(Q, jSONObject, "reuse_id", wm11.c, i, s0Var != null ? s0Var.A : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, s0Var != null ? s0Var.B : null, tlsVar2, r0.z), wcx.j(Q, jSONObject, "scroll_content_alignment", r0.p, i, s0Var != null ? s0Var.C : null, tlsVar3, kbsVar), wcx.j(Q, jSONObject, "scroll_mode", r0.q, i, s0Var != null ? s0Var.D : null, DivGallery.ScrollMode.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, "scrollbar", r0.r, i, s0Var != null ? s0Var.E : null, DivGallery.Scrollbar.FROM_STRING, kbsVar), wcx.k(Q, jSONObject, "selected_actions", i, s0Var != null ? s0Var.F : null, jsonParserComponent.u1), wcx.k(Q, jSONObject, "tooltips", i, s0Var != null ? s0Var.G : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, s0Var != null ? s0Var.H : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, s0Var != null ? s0Var.I : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, s0Var != null ? s0Var.J : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, s0Var != null ? s0Var.K : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, s0Var != null ? s0Var.L : null, i3yVar3), wcx.l(Q, jSONObject, i, s0Var != null ? s0Var.M : null, DivTransitionTrigger.FROM_STRING, r0.A), wcx.k(Q, jSONObject, "variable_triggers", i, s0Var != null ? s0Var.N : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, s0Var != null ? s0Var.O : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", r0.s, i, s0Var != null ? s0Var.P : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, s0Var != null ? s0Var.Q : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, s0Var != null ? s0Var.R : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, s0Var != null ? s0Var.S : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, s0 s0Var) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = s0Var.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(s0Var.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(s0Var.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, s0Var.d);
        wcx.w(yf90Var, jSONObject, "animators", s0Var.e, jsonParserComponent.D1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, s0Var.f, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", s0Var.g, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "column_count", s0Var.h);
        wcx.q(yf90Var, jSONObject, "column_span", s0Var.i);
        exq exqVar2 = s0Var.j;
        tls tlsVar = DivGallery.ContentAlignment.TO_STRING;
        wcx.p(exqVar2, tlsVar, yf90Var, "cross_content_alignment", jSONObject);
        wcx.q(yf90Var, jSONObject, "cross_spacing", s0Var.k);
        wcx.q(yf90Var, jSONObject, "default_item", s0Var.l);
        wcx.w(yf90Var, jSONObject, "disappear_actions", s0Var.m, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "extensions", s0Var.n, jsonParserComponent.k3);
        wcx.u(yf90Var, jSONObject, "focus", s0Var.o, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", s0Var.p, jsonParserComponent.U3);
        exq exqVar3 = s0Var.q;
        i3y i3yVar = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar3, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", s0Var.r);
        wcx.u(yf90Var, jSONObject, "item_builder", s0Var.s, jsonParserComponent.n2);
        wcx.q(yf90Var, jSONObject, "item_spacing", s0Var.t);
        wcx.w(yf90Var, jSONObject, "items", s0Var.u, jsonParserComponent.Y9);
        wcx.u(yf90Var, jSONObject, "layout_provider", s0Var.v, jsonParserComponent.Y4);
        exq exqVar4 = s0Var.w;
        i3y i3yVar2 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar4, i3yVar2);
        wcx.p(s0Var.x, DivGallery.Orientation.TO_STRING, yf90Var, "orientation", jSONObject);
        wcx.u(yf90Var, jSONObject, "paddings", s0Var.y, i3yVar2);
        wcx.q(yf90Var, jSONObject, "restrict_parent_scroll", s0Var.z);
        wcx.q(yf90Var, jSONObject, "reuse_id", s0Var.A);
        wcx.q(yf90Var, jSONObject, "row_span", s0Var.B);
        wcx.p(s0Var.C, tlsVar, yf90Var, "scroll_content_alignment", jSONObject);
        wcx.p(s0Var.D, DivGallery.ScrollMode.TO_STRING, yf90Var, "scroll_mode", jSONObject);
        wcx.p(s0Var.E, DivGallery.Scrollbar.TO_STRING, yf90Var, "scrollbar", jSONObject);
        wcx.w(yf90Var, jSONObject, "selected_actions", s0Var.F, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "tooltips", s0Var.G, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", s0Var.H, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", s0Var.I, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", s0Var.J, jsonParserComponent.e2);
        exq exqVar5 = s0Var.K;
        i3y i3yVar3 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar5, i3yVar3);
        wcx.u(yf90Var, jSONObject, "transition_out", s0Var.L, i3yVar3);
        wcx.v(yf90Var, jSONObject, s0Var.M, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "gallery");
        wcx.w(yf90Var, jSONObject, "variable_triggers", s0Var.N, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", s0Var.O, jsonParserComponent.G9);
        wcx.p(s0Var.P, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar6 = s0Var.Q;
        i3y i3yVar4 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar6, i3yVar4);
        wcx.w(yf90Var, jSONObject, "visibility_actions", s0Var.R, i3yVar4);
        wcx.u(yf90Var, jSONObject, "width", s0Var.S, i3yVar);
        return jSONObject;
    }
}
