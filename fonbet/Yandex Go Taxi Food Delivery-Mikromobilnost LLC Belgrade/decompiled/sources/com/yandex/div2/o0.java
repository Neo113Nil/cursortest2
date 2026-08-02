package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivGallery;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.i3y;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.nyi;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.sms;
import defpackage.tlk;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.wms;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zsq0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o0 implements zsq0, nyi {
    public final JsonParserComponent a;

    public o0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v49, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v67, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final DivGallery a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.H;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.I1;
        i3y i3yVar4 = jsonParserComponent.g3;
        i3y i3yVar5 = jsonParserComponent.o7;
        DivAccessibility divAccessibility = (DivAccessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = r0.l;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_horizontal", qkjVar, tlsVar, kbsVar, null);
        Expression e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "alignment_vertical", r0.m, DivAlignmentVertical.FROM_STRING, kbsVar, null);
        sms smsVar = wm11.d;
        tls tlsVar2 = com.yandex.div.internal.parser.b.g;
        tlk tlkVar = r0.t;
        kvo kvoVar = r0.a;
        ?? e3 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar2, tlkVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        List O = wwg.O(yf90Var, jSONObject, "animators", jsonParserComponent.C1);
        List O2 = wwg.O(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.U1);
        tms tmsVar = wm11.b;
        tls tlsVar3 = com.yandex.div.internal.parser.b.h;
        Expression e4 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "column_count", tmsVar, tlsVar3, r0.u, null);
        Expression e5 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "column_span", tmsVar, tlsVar3, r0.v, null);
        qkj qkjVar2 = r0.n;
        tls tlsVar4 = DivGallery.ContentAlignment.FROM_STRING;
        kvo kvoVar3 = r0.b;
        ?? e6 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "cross_content_alignment", qkjVar2, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e6 == 0 ? kvoVar3 : e6;
        Expression e7 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "cross_spacing", tmsVar, tlsVar3, r0.w, null);
        tlk tlkVar2 = r0.x;
        kvo kvoVar5 = r0.c;
        ?? e8 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "default_item", tmsVar, tlsVar3, tlkVar2, kvoVar5);
        kvo kvoVar6 = e8 == 0 ? kvoVar5 : e8;
        List O3 = wwg.O(yf90Var, jSONObject, "disappear_actions", jsonParserComponent.X2);
        List O4 = wwg.O(yf90Var, jSONObject, "extensions", jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) wwg.M(yf90Var, jSONObject, "focus", jsonParserComponent.K3);
        List O5 = wwg.O(yf90Var, jSONObject, "functions", jsonParserComponent.T3);
        DivSize divSize = (DivSize) wwg.M(yf90Var, jSONObject, "height", i3yVar5);
        if (divSize == null) {
            divSize = r0.d;
        }
        DivSize divSize2 = divSize;
        Object opt = jSONObject.opt("id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) wwg.M(yf90Var, jSONObject, "item_builder", jsonParserComponent.m2);
        tlk tlkVar3 = r0.y;
        kvo kvoVar7 = r0.e;
        ?? e9 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "item_spacing", tmsVar, tlsVar3, tlkVar3, kvoVar7);
        kvo kvoVar8 = e9 == 0 ? kvoVar7 : e9;
        List O6 = wwg.O(yf90Var, jSONObject, "items", jsonParserComponent.X9);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) wwg.M(yf90Var, jSONObject, "layout_provider", jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "margins", i3yVar4);
        qkj qkjVar3 = r0.o;
        tls tlsVar5 = DivGallery.Orientation.FROM_STRING;
        kvo kvoVar9 = r0.f;
        ?? e10 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "orientation", qkjVar3, tlsVar5, kbsVar, kvoVar9);
        kvo kvoVar10 = e10 == 0 ? kvoVar9 : e10;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", i3yVar4);
        wms wmsVar = wm11.a;
        tls tlsVar6 = com.yandex.div.internal.parser.b.f;
        kvo kvoVar11 = r0.g;
        ?? e11 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "restrict_parent_scroll", wmsVar, tlsVar6, kbsVar, kvoVar11);
        kvo kvoVar12 = e11 == 0 ? kvoVar11 : e11;
        Expression e12 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "reuse_id", wm11.c, q5z.c, kbsVar, null);
        Expression e13 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "row_span", tmsVar, tlsVar3, r0.z, null);
        Expression e14 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "scroll_content_alignment", r0.p, tlsVar4, kbsVar, null);
        qkj qkjVar4 = r0.q;
        tls tlsVar7 = DivGallery.ScrollMode.FROM_STRING;
        kvo kvoVar13 = r0.h;
        ?? e15 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "scroll_mode", qkjVar4, tlsVar7, kbsVar, kvoVar13);
        kvo kvoVar14 = e15 == 0 ? kvoVar13 : e15;
        qkj qkjVar5 = r0.r;
        tls tlsVar8 = DivGallery.Scrollbar.FROM_STRING;
        kvo kvoVar15 = r0.i;
        ?? e16 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "scrollbar", qkjVar5, tlsVar8, kbsVar, kvoVar15);
        kvo kvoVar16 = e16 == 0 ? kvoVar15 : e16;
        List O7 = wwg.O(yf90Var, jSONObject, "selected_actions", jsonParserComponent.t1);
        List O8 = wwg.O(yf90Var, jSONObject, "tooltips", jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) wwg.M(yf90Var, jSONObject, "transform", jsonParserComponent.n9);
        List O9 = wwg.O(yf90Var, jSONObject, "transformations", jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) wwg.M(yf90Var, jSONObject, "transition_change", jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_in", i3yVar3);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) wwg.M(yf90Var, jSONObject, "transition_out", i3yVar3);
        List Q = wwg.Q(yf90Var, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, r0.A);
        List O10 = wwg.O(yf90Var, jSONObject, "variable_triggers", jsonParserComponent.z9);
        List O11 = wwg.O(yf90Var, jSONObject, "variables", jsonParserComponent.F9);
        qkj qkjVar6 = r0.s;
        tls tlsVar9 = DivVisibility.FROM_STRING;
        kvo kvoVar17 = r0.j;
        ?? e17 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "visibility", qkjVar6, tlsVar9, kbsVar, kvoVar17);
        if (e17 != 0) {
            kvoVar17 = e17;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) wwg.M(yf90Var, jSONObject, "visibility_action", i3yVar2);
        List O12 = wwg.O(yf90Var, jSONObject, "visibility_actions", i3yVar2);
        DivSize divSize3 = (DivSize) wwg.M(yf90Var, jSONObject, "width", i3yVar5);
        if (divSize3 == null) {
            divSize3 = r0.k;
        }
        return new DivGallery(divAccessibility, e, e2, kvoVar2, O, O2, divBorder, e4, e5, kvoVar4, e7, kvoVar6, O3, O4, divFocus, O5, divSize2, str, divCollectionItemBuilder, kvoVar8, O6, divLayoutProvider, divEdgeInsets, kvoVar10, divEdgeInsets2, kvoVar12, e12, e13, e14, kvoVar14, kvoVar16, O7, O8, divTransform, O9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, Q, O10, O11, kvoVar17, divVisibilityAction, O12, divSize3);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivGallery divGallery) {
        JSONObject jSONObject = new JSONObject();
        DivAccessibility divAccessibility = divGallery.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divAccessibility, jsonParserComponent.H);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_horizontal", divGallery.b, DivAlignmentHorizontal.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "alignment_vertical", divGallery.c, DivAlignmentVertical.TO_STRING);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, divGallery.d);
        wwg.c0(yf90Var, jSONObject, "animators", divGallery.e, jsonParserComponent.C1);
        wwg.c0(yf90Var, jSONObject, C0553n3.g, divGallery.f, jsonParserComponent.O1);
        wwg.b0(yf90Var, jSONObject, "border", divGallery.g, jsonParserComponent.U1);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "column_count", divGallery.h);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "column_span", divGallery.i);
        Expression expression = divGallery.j;
        tls tlsVar = DivGallery.ContentAlignment.TO_STRING;
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "cross_content_alignment", expression, tlsVar);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "cross_spacing", divGallery.k);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "default_item", divGallery.l);
        wwg.c0(yf90Var, jSONObject, "disappear_actions", divGallery.m, jsonParserComponent.X2);
        wwg.c0(yf90Var, jSONObject, "extensions", divGallery.n, jsonParserComponent.j3);
        wwg.b0(yf90Var, jSONObject, "focus", divGallery.o, jsonParserComponent.K3);
        wwg.c0(yf90Var, jSONObject, "functions", divGallery.p, jsonParserComponent.T3);
        DivSize divSize = divGallery.q;
        i3y i3yVar = jsonParserComponent.o7;
        wwg.b0(yf90Var, jSONObject, "height", divSize, i3yVar);
        wwg.Z(yf90Var, jSONObject, "id", divGallery.r);
        wwg.b0(yf90Var, jSONObject, "item_builder", divGallery.s, jsonParserComponent.m2);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "item_spacing", divGallery.t);
        wwg.c0(yf90Var, jSONObject, "items", divGallery.u, jsonParserComponent.X9);
        wwg.b0(yf90Var, jSONObject, "layout_provider", divGallery.v, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = divGallery.w;
        i3y i3yVar2 = jsonParserComponent.g3;
        wwg.b0(yf90Var, jSONObject, "margins", divEdgeInsets, i3yVar2);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "orientation", divGallery.x, DivGallery.Orientation.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "paddings", divGallery.y, i3yVar2);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "restrict_parent_scroll", divGallery.z);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "reuse_id", divGallery.A);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "row_span", divGallery.B);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "scroll_content_alignment", divGallery.C, tlsVar);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "scroll_mode", divGallery.D, DivGallery.ScrollMode.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "scrollbar", divGallery.E, DivGallery.Scrollbar.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "selected_actions", divGallery.F, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "tooltips", divGallery.G, jsonParserComponent.k9);
        wwg.b0(yf90Var, jSONObject, "transform", divGallery.H, jsonParserComponent.n9);
        wwg.c0(yf90Var, jSONObject, "transformations", divGallery.I, jsonParserComponent.q9);
        wwg.b0(yf90Var, jSONObject, "transition_change", divGallery.J, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = divGallery.K;
        i3y i3yVar3 = jsonParserComponent.I1;
        wwg.b0(yf90Var, jSONObject, "transition_in", divAppearanceTransition, i3yVar3);
        wwg.b0(yf90Var, jSONObject, "transition_out", divGallery.L, i3yVar3);
        wwg.d0(yf90Var, jSONObject, divGallery.M, DivTransitionTrigger.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "gallery");
        wwg.c0(yf90Var, jSONObject, "variable_triggers", divGallery.N, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", divGallery.O, jsonParserComponent.F9);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "visibility", divGallery.P, DivVisibility.TO_STRING);
        DivVisibilityAction divVisibilityAction = divGallery.Q;
        i3y i3yVar4 = jsonParserComponent.R9;
        wwg.b0(yf90Var, jSONObject, "visibility_action", divVisibilityAction, i3yVar4);
        wwg.c0(yf90Var, jSONObject, "visibility_actions", divGallery.R, i3yVar4);
        wwg.b0(yf90Var, jSONObject, "width", divGallery.S, i3yVar);
        return jSONObject;
    }
}
