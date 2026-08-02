package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.w0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class etk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public etk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final ttk c(yf90 yf90Var, ttk ttkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = ttkVar != null ? ttkVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        exq i3 = wcx.i(Q, jSONObject, "action", i, ttkVar != null ? ttkVar.b : null, i3yVar6);
        exq i4 = wcx.i(Q, jSONObject, "action_animation", i, ttkVar != null ? ttkVar.c : null, jsonParserComponent.A1);
        exq k = wcx.k(Q, jSONObject, "actions", i, ttkVar != null ? ttkVar.d : null, i3yVar6);
        qkj qkjVar = w0.n;
        exq exqVar2 = ttkVar != null ? ttkVar.e : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        qkj qkjVar2 = w0.o;
        exq exqVar3 = ttkVar != null ? ttkVar.f : null;
        tls tlsVar2 = DivAlignmentVertical.FROM_STRING;
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", qkjVar2, i, exqVar3, tlsVar2, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, ttkVar != null ? ttkVar.g : null, b.g, w0.u);
        exq k2 = wcx.k(Q, jSONObject, "animators", i, ttkVar != null ? ttkVar.h : null, jsonParserComponent.D1);
        exq i5 = wcx.i(Q, jSONObject, "appearance_animation", i, ttkVar != null ? ttkVar.i : null, jsonParserComponent.n3);
        exq i6 = wcx.i(Q, jSONObject, "aspect", i, ttkVar != null ? ttkVar.j : null, jsonParserComponent.M1);
        exq k3 = wcx.k(Q, jSONObject, C0553n3.g, i, ttkVar != null ? ttkVar.k : null, jsonParserComponent.P1);
        exq i7 = wcx.i(Q, jSONObject, "border", i, ttkVar != null ? ttkVar.l : null, jsonParserComponent.V1);
        wms wmsVar = wm11.a;
        exq exqVar4 = ttkVar != null ? ttkVar.m : null;
        tls tlsVar3 = b.f;
        exq j4 = wcx.j(Q, jSONObject, "capture_focus_on_action", wmsVar, i, exqVar4, tlsVar3, kbsVar);
        tms tmsVar = wm11.b;
        exq exqVar5 = ttkVar != null ? ttkVar.n : null;
        tls tlsVar4 = b.h;
        exq j5 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar5, tlsVar4, w0.v);
        exq j6 = wcx.j(Q, jSONObject, "content_alignment_horizontal", w0.p, i, ttkVar != null ? ttkVar.o : null, tlsVar, kbsVar);
        exq j7 = wcx.j(Q, jSONObject, "content_alignment_vertical", w0.q, i, ttkVar != null ? ttkVar.p : null, tlsVar2, kbsVar);
        exq k4 = wcx.k(Q, jSONObject, "disappear_actions", i, ttkVar != null ? ttkVar.q : null, jsonParserComponent.Y2);
        exq k5 = wcx.k(Q, jSONObject, "doubletap_actions", i, ttkVar != null ? ttkVar.r : null, i3yVar6);
        exq k6 = wcx.k(Q, jSONObject, "extensions", i, ttkVar != null ? ttkVar.s : null, jsonParserComponent.k3);
        exq k7 = wcx.k(Q, jSONObject, "filters", i, ttkVar != null ? ttkVar.t : null, jsonParserComponent.t3);
        exq i8 = wcx.i(Q, jSONObject, "focus", i, ttkVar != null ? ttkVar.u : null, jsonParserComponent.L3);
        exq k8 = wcx.k(Q, jSONObject, "functions", i, ttkVar != null ? ttkVar.v : null, jsonParserComponent.U3);
        exq i9 = wcx.i(Q, jSONObject, "height", i, ttkVar != null ? ttkVar.w : null, i3yVar5);
        exq j8 = wcx.j(Q, jSONObject, "high_priority_preview_show", wmsVar, i, ttkVar != null ? ttkVar.x : null, tlsVar3, kbsVar);
        exq k9 = wcx.k(Q, jSONObject, "hover_end_actions", i, ttkVar != null ? ttkVar.y : null, i3yVar6);
        exq k10 = wcx.k(Q, jSONObject, "hover_start_actions", i, ttkVar != null ? ttkVar.z : null, i3yVar6);
        exq exqVar6 = ttkVar != null ? ttkVar.A : null;
        abl0 abl0Var = q5z.c;
        exq h = wcx.h(Q, jSONObject, "id", i, exqVar6, abl0Var);
        exq e = wcx.e(Q, jSONObject, "image_url", wm11.e, i, ttkVar != null ? ttkVar.B : null, b.e, kbsVar);
        exq i10 = wcx.i(Q, jSONObject, "layout_provider", i, ttkVar != null ? ttkVar.C : null, jsonParserComponent.Y4);
        exq k11 = wcx.k(Q, jSONObject, "longtap_actions", i, ttkVar != null ? ttkVar.D : null, i3yVar6);
        exq i11 = wcx.i(Q, jSONObject, "margins", i, ttkVar != null ? ttkVar.E : null, i3yVar4);
        exq i12 = wcx.i(Q, jSONObject, "paddings", i, ttkVar != null ? ttkVar.F : null, i3yVar4);
        rms rmsVar = wm11.f;
        exq exqVar7 = ttkVar != null ? ttkVar.G : null;
        tls tlsVar5 = b.b;
        exq j9 = wcx.j(Q, jSONObject, "placeholder_color", rmsVar, i, exqVar7, tlsVar5, kbsVar);
        exq j10 = wcx.j(Q, jSONObject, "preload_required", wmsVar, i, ttkVar != null ? ttkVar.H : null, tlsVar3, kbsVar);
        exq k12 = wcx.k(Q, jSONObject, "press_end_actions", i, ttkVar != null ? ttkVar.I : null, i3yVar6);
        exq k13 = wcx.k(Q, jSONObject, "press_start_actions", i, ttkVar != null ? ttkVar.J : null, i3yVar6);
        ums umsVar = wm11.c;
        return new ttk(i2, i3, i4, k, j, j2, j3, k2, i5, i6, k3, i7, j4, j5, j6, j7, k4, k5, k6, k7, i8, k8, i9, j8, k9, k10, h, e, i10, k11, i11, i12, j9, j10, k12, k13, wcx.j(Q, jSONObject, "preview", umsVar, i, ttkVar != null ? ttkVar.K : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "reuse_id", umsVar, i, ttkVar != null ? ttkVar.L : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, ttkVar != null ? ttkVar.M : null, tlsVar4, w0.w), wcx.j(Q, jSONObject, "scale", w0.r, i, ttkVar != null ? ttkVar.N : null, DivImageScale.FROM_STRING, kbsVar), wcx.k(Q, jSONObject, "selected_actions", i, ttkVar != null ? ttkVar.O : null, i3yVar6), wcx.j(Q, jSONObject, "tint_color", rmsVar, i, ttkVar != null ? ttkVar.P : null, tlsVar5, kbsVar), wcx.j(Q, jSONObject, "tint_mode", w0.s, i, ttkVar != null ? ttkVar.Q : null, DivBlendMode.FROM_STRING, kbsVar), wcx.k(Q, jSONObject, "tooltips", i, ttkVar != null ? ttkVar.R : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, ttkVar != null ? ttkVar.S : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, ttkVar != null ? ttkVar.T : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, ttkVar != null ? ttkVar.U : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, ttkVar != null ? ttkVar.V : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, ttkVar != null ? ttkVar.W : null, i3yVar3), wcx.l(Q, jSONObject, i, ttkVar != null ? ttkVar.X : null, DivTransitionTrigger.FROM_STRING, w0.x), wcx.k(Q, jSONObject, "variable_triggers", i, ttkVar != null ? ttkVar.Y : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, ttkVar != null ? ttkVar.Z : null, jsonParserComponent.G9), wcx.j(Q, jSONObject, "visibility", w0.t, i, ttkVar != null ? ttkVar.a0 : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, ttkVar != null ? ttkVar.b0 : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, ttkVar != null ? ttkVar.c0 : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, ttkVar != null ? ttkVar.d0 : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ttk ttkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = ttkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        exq exqVar2 = ttkVar.b;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.u(yf90Var, jSONObject, "action", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "action_animation", ttkVar.c, jsonParserComponent.A1);
        wcx.w(yf90Var, jSONObject, "actions", ttkVar.d, i3yVar);
        exq exqVar3 = ttkVar.e;
        tls tlsVar = DivAlignmentHorizontal.TO_STRING;
        wcx.p(exqVar3, tlsVar, yf90Var, "alignment_horizontal", jSONObject);
        exq exqVar4 = ttkVar.f;
        tls tlsVar2 = DivAlignmentVertical.TO_STRING;
        wcx.p(exqVar4, tlsVar2, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, ttkVar.g);
        wcx.w(yf90Var, jSONObject, "animators", ttkVar.h, jsonParserComponent.D1);
        wcx.u(yf90Var, jSONObject, "appearance_animation", ttkVar.i, jsonParserComponent.n3);
        wcx.u(yf90Var, jSONObject, "aspect", ttkVar.j, jsonParserComponent.M1);
        wcx.w(yf90Var, jSONObject, C0553n3.g, ttkVar.k, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", ttkVar.l, jsonParserComponent.V1);
        wcx.q(yf90Var, jSONObject, "capture_focus_on_action", ttkVar.m);
        wcx.q(yf90Var, jSONObject, "column_span", ttkVar.n);
        wcx.p(ttkVar.o, tlsVar, yf90Var, "content_alignment_horizontal", jSONObject);
        wcx.p(ttkVar.p, tlsVar2, yf90Var, "content_alignment_vertical", jSONObject);
        wcx.w(yf90Var, jSONObject, "disappear_actions", ttkVar.q, jsonParserComponent.Y2);
        wcx.w(yf90Var, jSONObject, "doubletap_actions", ttkVar.r, i3yVar);
        wcx.w(yf90Var, jSONObject, "extensions", ttkVar.s, jsonParserComponent.k3);
        wcx.w(yf90Var, jSONObject, "filters", ttkVar.t, jsonParserComponent.t3);
        wcx.u(yf90Var, jSONObject, "focus", ttkVar.u, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", ttkVar.v, jsonParserComponent.U3);
        exq exqVar5 = ttkVar.w;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar5, i3yVar2);
        wcx.q(yf90Var, jSONObject, "high_priority_preview_show", ttkVar.x);
        wcx.w(yf90Var, jSONObject, "hover_end_actions", ttkVar.y, i3yVar);
        wcx.w(yf90Var, jSONObject, "hover_start_actions", ttkVar.z, i3yVar);
        wcx.t(yf90Var, jSONObject, "id", ttkVar.A);
        wcx.p(ttkVar.B, b.c, yf90Var, "image_url", jSONObject);
        wcx.u(yf90Var, jSONObject, "layout_provider", ttkVar.C, jsonParserComponent.Y4);
        wcx.w(yf90Var, jSONObject, "longtap_actions", ttkVar.D, i3yVar);
        exq exqVar6 = ttkVar.E;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar6, i3yVar3);
        wcx.u(yf90Var, jSONObject, "paddings", ttkVar.F, i3yVar3);
        exq exqVar7 = ttkVar.G;
        tls tlsVar3 = b.a;
        wcx.p(exqVar7, tlsVar3, yf90Var, "placeholder_color", jSONObject);
        wcx.q(yf90Var, jSONObject, "preload_required", ttkVar.H);
        wcx.w(yf90Var, jSONObject, "press_end_actions", ttkVar.I, i3yVar);
        wcx.w(yf90Var, jSONObject, "press_start_actions", ttkVar.J, i3yVar);
        wcx.q(yf90Var, jSONObject, "preview", ttkVar.K);
        wcx.q(yf90Var, jSONObject, "reuse_id", ttkVar.L);
        wcx.q(yf90Var, jSONObject, "row_span", ttkVar.M);
        wcx.p(ttkVar.N, DivImageScale.TO_STRING, yf90Var, "scale", jSONObject);
        wcx.w(yf90Var, jSONObject, "selected_actions", ttkVar.O, i3yVar);
        wcx.p(ttkVar.P, tlsVar3, yf90Var, "tint_color", jSONObject);
        wcx.p(ttkVar.Q, DivBlendMode.TO_STRING, yf90Var, "tint_mode", jSONObject);
        wcx.w(yf90Var, jSONObject, "tooltips", ttkVar.R, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", ttkVar.S, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", ttkVar.T, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", ttkVar.U, jsonParserComponent.e2);
        exq exqVar8 = ttkVar.V;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar8, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", ttkVar.W, i3yVar4);
        wcx.v(yf90Var, jSONObject, ttkVar.X, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "image");
        wcx.w(yf90Var, jSONObject, "variable_triggers", ttkVar.Y, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", ttkVar.Z, jsonParserComponent.G9);
        wcx.p(ttkVar.a0, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar9 = ttkVar.b0;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar9, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", ttkVar.c0, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", ttkVar.d0, i3yVar2);
        return jSONObject;
    }
}
