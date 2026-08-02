package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivGallery;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.exq;
import defpackage.i3y;
import defpackage.kvo;
import defpackage.q5z;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.sms;
import defpackage.tlk;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.wms;
import defpackage.xcx;
import defpackage.yf90;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q0 implements qfy0 {
    public final JsonParserComponent a;

    public q0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v38, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v42, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v49, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v65, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivGallery a(yf90 yf90Var, s0 s0Var, JSONObject jSONObject) {
        exq exqVar = s0Var.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.J;
        i3y i3yVar2 = jsonParserComponent.R9;
        i3y i3yVar3 = jsonParserComponent.T9;
        i3y i3yVar4 = jsonParserComponent.I1;
        i3y i3yVar5 = jsonParserComponent.K1;
        i3y i3yVar6 = jsonParserComponent.g3;
        i3y i3yVar7 = jsonParserComponent.i3;
        i3y i3yVar8 = jsonParserComponent.o7;
        i3y i3yVar9 = jsonParserComponent.q7;
        DivAccessibility divAccessibility = (DivAccessibility) xcx.h(yf90Var, exqVar, jSONObject, "accessibility", i3yVar, jsonParserComponent.H);
        Expression l = xcx.l(yf90Var, s0Var.b, jSONObject, "alignment_horizontal", r0.l, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, s0Var.c, jSONObject, "alignment_vertical", r0.m, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = s0Var.d;
        sms smsVar = wm11.d;
        tls tlsVar = com.yandex.div.internal.parser.b.g;
        tlk tlkVar = r0.t;
        kvo kvoVar = r0.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, tlkVar, kvoVar);
        kvo kvoVar2 = n == 0 ? kvoVar : n;
        List s = xcx.s(yf90Var, s0Var.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, s0Var.f, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, s0Var.g, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar3 = s0Var.h;
        tms tmsVar = wm11.b;
        tls tlsVar2 = com.yandex.div.internal.parser.b.h;
        Expression m = xcx.m(yf90Var, exqVar3, jSONObject, "column_count", tmsVar, tlsVar2, r0.u);
        Expression m2 = xcx.m(yf90Var, s0Var.i, jSONObject, "column_span", tmsVar, tlsVar2, r0.v);
        exq exqVar4 = s0Var.j;
        qkj qkjVar = r0.n;
        tls tlsVar3 = DivGallery.ContentAlignment.FROM_STRING;
        kvo kvoVar3 = r0.b;
        ?? o = xcx.o(yf90Var, exqVar4, jSONObject, "cross_content_alignment", qkjVar, tlsVar3, kvoVar3);
        kvo kvoVar4 = o == 0 ? kvoVar3 : o;
        Expression m3 = xcx.m(yf90Var, s0Var.k, jSONObject, "cross_spacing", tmsVar, tlsVar2, r0.w);
        exq exqVar5 = s0Var.l;
        tlk tlkVar2 = r0.x;
        kvo kvoVar5 = r0.c;
        ?? n2 = xcx.n(yf90Var, exqVar5, jSONObject, "default_item", tmsVar, tlsVar2, tlkVar2, kvoVar5);
        kvo kvoVar6 = n2 == 0 ? kvoVar5 : n2;
        List s3 = xcx.s(yf90Var, s0Var.m, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, s0Var.n, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, s0Var.o, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s5 = xcx.s(yf90Var, s0Var.p, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, s0Var.q, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = r0.d;
        }
        DivSize divSize2 = divSize;
        String str = (String) xcx.i(s0Var.r, q5z.c, yf90Var, "id", jSONObject);
        DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) xcx.h(yf90Var, s0Var.s, jSONObject, "item_builder", jsonParserComponent.o2, jsonParserComponent.m2);
        exq exqVar6 = s0Var.t;
        tlk tlkVar3 = r0.y;
        kvo kvoVar7 = r0.e;
        ?? n3 = xcx.n(yf90Var, exqVar6, jSONObject, "item_spacing", tmsVar, tlsVar2, tlkVar3, kvoVar7);
        if (n3 != 0) {
            kvoVar7 = n3;
        }
        List s6 = xcx.s(yf90Var, s0Var.u, jSONObject, "items", jsonParserComponent.Z9, jsonParserComponent.X9);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, s0Var.v, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, s0Var.w, jSONObject, "margins", i3yVar7, i3yVar6);
        exq exqVar7 = s0Var.x;
        qkj qkjVar2 = r0.o;
        tls tlsVar4 = DivGallery.Orientation.FROM_STRING;
        kvo kvoVar8 = r0.f;
        ?? o2 = xcx.o(yf90Var, exqVar7, jSONObject, "orientation", qkjVar2, tlsVar4, kvoVar8);
        kvo kvoVar9 = o2 == 0 ? kvoVar8 : o2;
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, s0Var.y, jSONObject, "paddings", i3yVar7, i3yVar6);
        exq exqVar8 = s0Var.z;
        wms wmsVar = wm11.a;
        tls tlsVar5 = com.yandex.div.internal.parser.b.f;
        kvo kvoVar10 = r0.g;
        ?? o3 = xcx.o(yf90Var, exqVar8, jSONObject, "restrict_parent_scroll", wmsVar, tlsVar5, kvoVar10);
        kvo kvoVar11 = o3 == 0 ? kvoVar10 : o3;
        Expression k = xcx.k(yf90Var, s0Var.A, jSONObject, "reuse_id", wm11.c);
        Expression m4 = xcx.m(yf90Var, s0Var.B, jSONObject, "row_span", tmsVar, tlsVar2, r0.z);
        Expression l3 = xcx.l(yf90Var, s0Var.C, jSONObject, "scroll_content_alignment", r0.p, tlsVar3);
        exq exqVar9 = s0Var.D;
        qkj qkjVar3 = r0.q;
        tls tlsVar6 = DivGallery.ScrollMode.FROM_STRING;
        kvo kvoVar12 = r0.h;
        ?? o4 = xcx.o(yf90Var, exqVar9, jSONObject, "scroll_mode", qkjVar3, tlsVar6, kvoVar12);
        kvo kvoVar13 = o4 == 0 ? kvoVar12 : o4;
        exq exqVar10 = s0Var.E;
        qkj qkjVar4 = r0.r;
        tls tlsVar7 = DivGallery.Scrollbar.FROM_STRING;
        kvo kvoVar14 = r0.i;
        ?? o5 = xcx.o(yf90Var, exqVar10, jSONObject, "scrollbar", qkjVar4, tlsVar7, kvoVar14);
        kvo kvoVar15 = o5 == 0 ? kvoVar14 : o5;
        List s7 = xcx.s(yf90Var, s0Var.F, jSONObject, "selected_actions", jsonParserComponent.v1, jsonParserComponent.t1);
        List s8 = xcx.s(yf90Var, s0Var.G, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, s0Var.H, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s9 = xcx.s(yf90Var, s0Var.I, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, s0Var.J, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, s0Var.K, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, s0Var.L, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, s0Var.M, jSONObject, DivTransitionTrigger.FROM_STRING, r0.A);
        List s10 = xcx.s(yf90Var, s0Var.N, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s11 = xcx.s(yf90Var, s0Var.O, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar11 = s0Var.P;
        qkj qkjVar5 = r0.s;
        tls tlsVar8 = DivVisibility.FROM_STRING;
        kvo kvoVar16 = r0.j;
        ?? o6 = xcx.o(yf90Var, exqVar11, jSONObject, "visibility", qkjVar5, tlsVar8, kvoVar16);
        if (o6 != 0) {
            kvoVar16 = o6;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, s0Var.Q, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s12 = xcx.s(yf90Var, s0Var.R, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, s0Var.S, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = r0.k;
        }
        return new DivGallery(divAccessibility, l, l2, kvoVar2, s, s2, divBorder, m, m2, kvoVar4, m3, kvoVar6, s3, s4, divFocus, s5, divSize2, str, divCollectionItemBuilder, kvoVar7, s6, divLayoutProvider, divEdgeInsets, kvoVar9, divEdgeInsets2, kvoVar11, k, m4, l3, kvoVar13, kvoVar15, s7, s8, divTransform, s9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s10, s11, kvoVar16, divVisibilityAction, s12, divSize3);
    }
}
