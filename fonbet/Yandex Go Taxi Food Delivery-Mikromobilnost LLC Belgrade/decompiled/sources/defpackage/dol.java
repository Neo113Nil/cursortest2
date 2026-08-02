package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVideoScale;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.d3;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class dol implements zsq0, yey0 {
    public final JsonParserComponent a;

    public dol(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final qol c(yf90 yf90Var, qol qolVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = qolVar != null ? qolVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.I;
        i3y i3yVar2 = jsonParserComponent.S9;
        i3y i3yVar3 = jsonParserComponent.J1;
        i3y i3yVar4 = jsonParserComponent.h3;
        i3y i3yVar5 = jsonParserComponent.p7;
        i3y i3yVar6 = jsonParserComponent.u1;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, exqVar, i3yVar);
        qkj qkjVar = d3.k;
        exq exqVar2 = qolVar != null ? qolVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "alignment_horizontal", qkjVar, i, exqVar2, tlsVar, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "alignment_vertical", d3.l, i, qolVar != null ? qolVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar);
        sms smsVar = wm11.d;
        exq exqVar3 = qolVar != null ? qolVar.d : null;
        tls tlsVar2 = b.g;
        exq j3 = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, i, exqVar3, tlsVar2, d3.o);
        exq k = wcx.k(Q, jSONObject, "animators", i, qolVar != null ? qolVar.e : null, jsonParserComponent.D1);
        exq i3 = wcx.i(Q, jSONObject, "aspect", i, qolVar != null ? qolVar.f : null, jsonParserComponent.M1);
        wms wmsVar = wm11.a;
        exq exqVar4 = qolVar != null ? qolVar.g : null;
        tls tlsVar3 = b.f;
        exq j4 = wcx.j(Q, jSONObject, "autostart", wmsVar, i, exqVar4, tlsVar3, kbsVar);
        exq k2 = wcx.k(Q, jSONObject, C0553n3.g, i, qolVar != null ? qolVar.h : null, jsonParserComponent.P1);
        exq i4 = wcx.i(Q, jSONObject, "border", i, qolVar != null ? qolVar.i : null, jsonParserComponent.V1);
        exq k3 = wcx.k(Q, jSONObject, "buffering_actions", i, qolVar != null ? qolVar.j : null, i3yVar6);
        tms tmsVar = wm11.b;
        exq exqVar5 = qolVar != null ? qolVar.k : null;
        tls tlsVar4 = b.h;
        exq j5 = wcx.j(Q, jSONObject, "column_span", tmsVar, i, exqVar5, tlsVar4, d3.p);
        exq k4 = wcx.k(Q, jSONObject, "disappear_actions", i, qolVar != null ? qolVar.l : null, jsonParserComponent.Y2);
        exq exqVar6 = qolVar != null ? qolVar.m : null;
        abl0 abl0Var = q5z.c;
        exq h = wcx.h(Q, jSONObject, "elapsed_time_variable", i, exqVar6, abl0Var);
        exq k5 = wcx.k(Q, jSONObject, "end_actions", i, qolVar != null ? qolVar.n : null, i3yVar6);
        exq k6 = wcx.k(Q, jSONObject, "extensions", i, qolVar != null ? qolVar.o : null, jsonParserComponent.k3);
        exq k7 = wcx.k(Q, jSONObject, "fatal_actions", i, qolVar != null ? qolVar.p : null, i3yVar6);
        exq i5 = wcx.i(Q, jSONObject, "focus", i, qolVar != null ? qolVar.q : null, jsonParserComponent.L3);
        exq k8 = wcx.k(Q, jSONObject, "functions", i, qolVar != null ? qolVar.r : null, jsonParserComponent.U3);
        exq i6 = wcx.i(Q, jSONObject, "height", i, qolVar != null ? qolVar.s : null, i3yVar5);
        exq h2 = wcx.h(Q, jSONObject, "id", i, qolVar != null ? qolVar.t : null, abl0Var);
        exq i7 = wcx.i(Q, jSONObject, "layout_provider", i, qolVar != null ? qolVar.u : null, jsonParserComponent.Y4);
        exq i8 = wcx.i(Q, jSONObject, "margins", i, qolVar != null ? qolVar.v : null, i3yVar4);
        exq j6 = wcx.j(Q, jSONObject, "muted", wmsVar, i, qolVar != null ? qolVar.w : null, tlsVar3, kbsVar);
        exq i9 = wcx.i(Q, jSONObject, "paddings", i, qolVar != null ? qolVar.x : null, i3yVar4);
        exq k9 = wcx.k(Q, jSONObject, "pause_actions", i, qolVar != null ? qolVar.y : null, i3yVar6);
        exq j7 = wcx.j(Q, jSONObject, "playback_speed", smsVar, i, qolVar != null ? qolVar.z : null, tlsVar2, d3.q);
        exq j8 = wcx.j(Q, jSONObject, "player_settings_payload", wm11.h, i, qolVar != null ? qolVar.A : null, abl0Var, kbsVar);
        exq j9 = wcx.j(Q, jSONObject, "preload_required", wmsVar, i, qolVar != null ? qolVar.B : null, tlsVar3, kbsVar);
        ums umsVar = wm11.c;
        return new qol(i2, j, j2, j3, k, i3, j4, k2, i4, k3, j5, k4, h, k5, k6, k7, i5, k8, i6, h2, i7, i8, j6, i9, k9, j7, j8, j9, wcx.j(Q, jSONObject, "preview", umsVar, i, qolVar != null ? qolVar.C : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "repeatable", wmsVar, i, qolVar != null ? qolVar.D : null, tlsVar3, kbsVar), wcx.k(Q, jSONObject, "resume_actions", i, qolVar != null ? qolVar.E : null, i3yVar6), wcx.j(Q, jSONObject, "reuse_id", umsVar, i, qolVar != null ? qolVar.F : null, abl0Var, kbsVar), wcx.j(Q, jSONObject, "row_span", tmsVar, i, qolVar != null ? qolVar.G : null, tlsVar4, d3.r), wcx.j(Q, jSONObject, "scale", d3.m, i, qolVar != null ? qolVar.H : null, DivVideoScale.FROM_STRING, kbsVar), wcx.k(Q, jSONObject, "selected_actions", i, qolVar != null ? qolVar.I : null, i3yVar6), wcx.k(Q, jSONObject, "tooltips", i, qolVar != null ? qolVar.J : null, jsonParserComponent.l9), wcx.i(Q, jSONObject, "transform", i, qolVar != null ? qolVar.K : null, jsonParserComponent.o9), wcx.k(Q, jSONObject, "transformations", i, qolVar != null ? qolVar.L : null, jsonParserComponent.r9), wcx.i(Q, jSONObject, "transition_change", i, qolVar != null ? qolVar.M : null, jsonParserComponent.e2), wcx.i(Q, jSONObject, "transition_in", i, qolVar != null ? qolVar.N : null, i3yVar3), wcx.i(Q, jSONObject, "transition_out", i, qolVar != null ? qolVar.O : null, i3yVar3), wcx.l(Q, jSONObject, i, qolVar != null ? qolVar.P : null, DivTransitionTrigger.FROM_STRING, d3.s), wcx.k(Q, jSONObject, "variable_triggers", i, qolVar != null ? qolVar.Q : null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, qolVar != null ? qolVar.R : null, jsonParserComponent.G9), wcx.k(Q, jSONObject, "video_sources", i, qolVar != null ? qolVar.S : null, jsonParserComponent.J9), wcx.j(Q, jSONObject, "visibility", d3.n, i, qolVar != null ? qolVar.T : null, DivVisibility.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "visibility_action", i, qolVar != null ? qolVar.U : null, i3yVar2), wcx.k(Q, jSONObject, "visibility_actions", i, qolVar != null ? qolVar.V : null, i3yVar2), wcx.i(Q, jSONObject, "width", i, qolVar != null ? qolVar.W : null, i3yVar5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, qol qolVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = qolVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.I);
        wcx.p(qolVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "alignment_horizontal", jSONObject);
        wcx.p(qolVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, qolVar.d);
        wcx.w(yf90Var, jSONObject, "animators", qolVar.e, jsonParserComponent.D1);
        wcx.u(yf90Var, jSONObject, "aspect", qolVar.f, jsonParserComponent.M1);
        wcx.q(yf90Var, jSONObject, "autostart", qolVar.g);
        wcx.w(yf90Var, jSONObject, C0553n3.g, qolVar.h, jsonParserComponent.P1);
        wcx.u(yf90Var, jSONObject, "border", qolVar.i, jsonParserComponent.V1);
        exq exqVar2 = qolVar.j;
        i3y i3yVar = jsonParserComponent.u1;
        wcx.w(yf90Var, jSONObject, "buffering_actions", exqVar2, i3yVar);
        wcx.q(yf90Var, jSONObject, "column_span", qolVar.k);
        wcx.w(yf90Var, jSONObject, "disappear_actions", qolVar.l, jsonParserComponent.Y2);
        wcx.t(yf90Var, jSONObject, "elapsed_time_variable", qolVar.m);
        wcx.w(yf90Var, jSONObject, "end_actions", qolVar.n, i3yVar);
        wcx.w(yf90Var, jSONObject, "extensions", qolVar.o, jsonParserComponent.k3);
        wcx.w(yf90Var, jSONObject, "fatal_actions", qolVar.p, i3yVar);
        wcx.u(yf90Var, jSONObject, "focus", qolVar.q, jsonParserComponent.L3);
        wcx.w(yf90Var, jSONObject, "functions", qolVar.r, jsonParserComponent.U3);
        exq exqVar3 = qolVar.s;
        i3y i3yVar2 = jsonParserComponent.p7;
        wcx.u(yf90Var, jSONObject, "height", exqVar3, i3yVar2);
        wcx.t(yf90Var, jSONObject, "id", qolVar.t);
        wcx.u(yf90Var, jSONObject, "layout_provider", qolVar.u, jsonParserComponent.Y4);
        exq exqVar4 = qolVar.v;
        i3y i3yVar3 = jsonParserComponent.h3;
        wcx.u(yf90Var, jSONObject, "margins", exqVar4, i3yVar3);
        wcx.q(yf90Var, jSONObject, "muted", qolVar.w);
        wcx.u(yf90Var, jSONObject, "paddings", qolVar.x, i3yVar3);
        wcx.w(yf90Var, jSONObject, "pause_actions", qolVar.y, i3yVar);
        wcx.q(yf90Var, jSONObject, "playback_speed", qolVar.z);
        wcx.q(yf90Var, jSONObject, "player_settings_payload", qolVar.A);
        wcx.q(yf90Var, jSONObject, "preload_required", qolVar.B);
        wcx.q(yf90Var, jSONObject, "preview", qolVar.C);
        wcx.q(yf90Var, jSONObject, "repeatable", qolVar.D);
        wcx.w(yf90Var, jSONObject, "resume_actions", qolVar.E, i3yVar);
        wcx.q(yf90Var, jSONObject, "reuse_id", qolVar.F);
        wcx.q(yf90Var, jSONObject, "row_span", qolVar.G);
        wcx.p(qolVar.H, DivVideoScale.TO_STRING, yf90Var, "scale", jSONObject);
        wcx.w(yf90Var, jSONObject, "selected_actions", qolVar.I, i3yVar);
        wcx.w(yf90Var, jSONObject, "tooltips", qolVar.J, jsonParserComponent.l9);
        wcx.u(yf90Var, jSONObject, "transform", qolVar.K, jsonParserComponent.o9);
        wcx.w(yf90Var, jSONObject, "transformations", qolVar.L, jsonParserComponent.r9);
        wcx.u(yf90Var, jSONObject, "transition_change", qolVar.M, jsonParserComponent.e2);
        exq exqVar5 = qolVar.N;
        i3y i3yVar4 = jsonParserComponent.J1;
        wcx.u(yf90Var, jSONObject, "transition_in", exqVar5, i3yVar4);
        wcx.u(yf90Var, jSONObject, "transition_out", qolVar.O, i3yVar4);
        wcx.v(yf90Var, jSONObject, qolVar.P, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", MediaStreamTrack.VIDEO_TRACK_KIND);
        wcx.w(yf90Var, jSONObject, "variable_triggers", qolVar.Q, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", qolVar.R, jsonParserComponent.G9);
        wcx.w(yf90Var, jSONObject, "video_sources", qolVar.S, jsonParserComponent.J9);
        wcx.p(qolVar.T, DivVisibility.TO_STRING, yf90Var, "visibility", jSONObject);
        exq exqVar6 = qolVar.U;
        i3y i3yVar5 = jsonParserComponent.S9;
        wcx.u(yf90Var, jSONObject, "visibility_action", exqVar6, i3yVar5);
        wcx.w(yf90Var, jSONObject, "visibility_actions", qolVar.V, i3yVar5);
        wcx.u(yf90Var, jSONObject, "width", qolVar.W, i3yVar2);
        return jSONObject;
    }
}
