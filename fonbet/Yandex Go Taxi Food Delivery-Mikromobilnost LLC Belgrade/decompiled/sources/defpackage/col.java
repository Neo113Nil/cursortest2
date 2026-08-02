package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVideoScale;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.d3;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class col implements zsq0, nyi {
    public final JsonParserComponent a;

    public col(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v56, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v73, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ynl a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        i3y i3yVar6 = jsonParserComponent.t1;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = d3.k;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = a.e(yf90Var, jSONObject, "alignment_vertical", d3.l, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        zgl zglVar = d3.o;
        kvo kvoVar = d3.a;
        ?? e3 = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, zglVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        afk afkVar = (afk) wwg.M(yf90Var, jSONObject, "aspect", jsonParserComponent.L1);
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar3 = d3.b;
        ?? e4 = a.e(yf90Var, jSONObject, "autostart", wmsVar, tlsVar3, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        List O3 = wwg.O(yf90Var, jSONObject, "buffering_actions", i3yVar6);
        tms tmsVar = wm11.b;
        tls tlsVar4 = b.h;
        Expression e5 = a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar4, d3.p, null);
        List O4 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        Object opt = jSONObject.opt("elapsed_time_variable");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        List O5 = wwg.O(yf90Var, jSONObject, "end_actions", i3yVar6);
        List O6 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        List O7 = wwg.O(yf90Var, jSONObject, "fatal_actions", i3yVar6);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O8 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = d3.c;
        }
        DivSize divSize2 = divSize;
        Object opt2 = jSONObject.opt("id");
        if (opt2 == obj) {
            opt2 = null;
        }
        String str2 = (String) (opt2 != null ? opt2 : null);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        kvo kvoVar5 = d3.d;
        ?? e6 = a.e(yf90Var, jSONObject, "muted", wmsVar, tlsVar3, kbsVar, kvoVar5);
        kvo kvoVar6 = e6 == 0 ? kvoVar5 : e6;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        List O9 = wwg.O(yf90Var, jSONObject, "pause_actions", i3yVar6);
        zgl zglVar2 = d3.q;
        kvo kvoVar7 = d3.e;
        ?? e7 = a.e(yf90Var, jSONObject, "playback_speed", smsVar, tlsVar2, zglVar2, kvoVar7);
        kvo kvoVar8 = e7 == 0 ? kvoVar7 : e7;
        yo40 yo40Var = wm11.h;
        abl0 abl0Var = q5z.c;
        Expression e8 = a.e(yf90Var, jSONObject, "player_settings_payload", yo40Var, abl0Var, kbsVar, null);
        kvo kvoVar9 = d3.f;
        ?? e9 = a.e(yf90Var, jSONObject, "preload_required", wmsVar, tlsVar3, kbsVar, kvoVar9);
        kvo kvoVar10 = e9 == 0 ? kvoVar9 : e9;
        ums umsVar = wm11.c;
        Expression e10 = a.e(yf90Var, jSONObject, "preview", umsVar, abl0Var, kbsVar, null);
        kvo kvoVar11 = d3.g;
        ?? e11 = a.e(yf90Var, jSONObject, "repeatable", wmsVar, tlsVar3, kbsVar, kvoVar11);
        kvo kvoVar12 = e11 == 0 ? kvoVar11 : e11;
        List O10 = wwg.O(yf90Var, jSONObject, "resume_actions", i3yVar6);
        Expression e12 = a.e(yf90Var, jSONObject, "reuse_id", umsVar, abl0Var, kbsVar, null);
        Expression e13 = a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar4, d3.r, null);
        qkj qkjVar2 = d3.m;
        tls tlsVar5 = DivVideoScale.FROM_STRING;
        kvo kvoVar13 = d3.h;
        ?? e14 = a.e(yf90Var, jSONObject, "scale", qkjVar2, tlsVar5, kbsVar, kvoVar13);
        kvo kvoVar14 = e14 == 0 ? kvoVar13 : e14;
        List O11 = wwg.O(yf90Var, jSONObject, "selected_actions", i3yVar6);
        List O12 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O13 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, d3.s);
        List O14 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O15 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        List O16 = wwg.O(yf90Var, jSONObject, "video_sources", jsonParserComponent.I9);
        qkj qkjVar3 = d3.n;
        tls tlsVar6 = DivVisibility.FROM_STRING;
        kvo kvoVar15 = d3.i;
        ?? e15 = a.e(yf90Var, jSONObject, "visibility", qkjVar3, tlsVar6, kbsVar, kvoVar15);
        if (e15 != 0) {
            kvoVar15 = e15;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O17 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = d3.j;
        }
        return new ynl(divAccessibility, e, e2, kvoVar2, O, afkVar, kvoVar4, O2, divBorder, O3, e5, O4, str, O5, O6, O7, divFocus, O8, divSize2, str2, divLayoutProvider, divEdgeInsets, kvoVar6, divEdgeInsets2, O9, kvoVar8, e8, kvoVar10, e10, kvoVar12, O10, e12, e13, kvoVar14, O11, O12, divTransform, O13, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O14, O15, O16, kvoVar15, divVisibilityAction, O17, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ynl ynlVar) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = ynlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        a.h(yf90Var, jSONObject, "alignment_horizontal", ynlVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "alignment_vertical", ynlVar.c, DivAlignmentVertical.TO_STRING);
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, ynlVar.d);
        wwg.c0(yf90Var, jSONObject, "animators", ynlVar.e, jsonParserComponent.C1);
        wwg.b0(yf90Var, jSONObject, "aspect", ynlVar.f, jsonParserComponent.L1);
        a.g(yf90Var, jSONObject, "autostart", ynlVar.g);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, ynlVar.h, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", ynlVar.i, jsonParserComponent.U1);
        List list = ynlVar.j;
        i3y i3yVar = jsonParserComponent.t1;
        wwg.c0(yf90Var, jSONObject, "buffering_actions", list, i3yVar);
        a.g(yf90Var, jSONObject, "column_span", ynlVar.k);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", ynlVar.l, jsonParserComponent.X2);
        wwg.Z(yf90Var, jSONObject, "elapsed_time_variable", ynlVar.m);
        wwg.c0(yf90Var, jSONObject, "end_actions", ynlVar.n, i3yVar);
        wwg.c0(yf90Var, jSONObject, "extensions", ynlVar.o, jsonParserComponent.j3);
        wwg.c0(yf90Var, jSONObject, "fatal_actions", ynlVar.p, i3yVar);
        wwg.b0(yf90Var, jSONObject, "focus", ynlVar.q, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", ynlVar.r, jsonParserComponent.T3);
        DivSize divSize = ynlVar.s;
        i3y i3yVar2 = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar2);
        wwg.Z(yf90Var, jSONObject, "id", ynlVar.t);
        wwg.b0(yf90Var, jSONObject, "layout_provider", ynlVar.u, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = ynlVar.v;
        i3y i3yVar3 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar3);
        a.g(yf90Var, jSONObject, "muted", ynlVar.w);
        wwg.b0(yf90Var, jSONObject, "paddings", ynlVar.x, i3yVar3);
        wwg.c0(yf90Var, jSONObject, "pause_actions", ynlVar.y, i3yVar);
        a.g(yf90Var, jSONObject, "playback_speed", ynlVar.z);
        a.g(yf90Var, jSONObject, "player_settings_payload", ynlVar.A);
        a.g(yf90Var, jSONObject, "preload_required", ynlVar.B);
        a.g(yf90Var, jSONObject, "preview", ynlVar.C);
        a.g(yf90Var, jSONObject, "repeatable", ynlVar.D);
        wwg.c0(yf90Var, jSONObject, "resume_actions", ynlVar.E, i3yVar);
        a.g(yf90Var, jSONObject, "reuse_id", ynlVar.F);
        a.g(yf90Var, jSONObject, "row_span", ynlVar.G);
        a.h(yf90Var, jSONObject, "scale", ynlVar.H, DivVideoScale.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "selected_actions", ynlVar.I, i3yVar);
        wwg.c0(yf90Var, jSONObject, "tooltips", ynlVar.J, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", ynlVar.K, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", ynlVar.L, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", ynlVar.M, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = ynlVar.N;
        i3y i3yVar4 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "transition_out", ynlVar.O, i3yVar4);
        wwg.d0(yf90Var, jSONObject, ynlVar.P, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", MediaStreamTrack.VIDEO_TRACK_KIND);
        wwg.c0(yf90Var, jSONObject, "variable_triggers", ynlVar.Q, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", ynlVar.R, jsonParserComponent.F9);
        wwg.c0(yf90Var, jSONObject, "video_sources", ynlVar.S, jsonParserComponent.I9);
        a.h(yf90Var, jSONObject, "visibility", ynlVar.T, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = ynlVar.U;
        i3y i3yVar5 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar5);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", ynlVar.V, i3yVar5);
        wwg.b0(yf90Var, jSONObject, "width", ynlVar.W, i3yVar2);
        return jSONObject;
    }
}
