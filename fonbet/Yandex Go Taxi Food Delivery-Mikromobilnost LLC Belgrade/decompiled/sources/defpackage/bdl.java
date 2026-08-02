package defpackage;

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
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.i2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bdl implements qfy0 {
    public final JsonParserComponent a;

    public bdl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v49, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ycl a(yf90 yf90Var, cdl cdlVar, JSONObject jSONObject) {
        exq exqVar = cdlVar.a;
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
        Expression l = xcx.l(yf90Var, cdlVar.b, jSONObject, "alignment_horizontal", i2.f, DivAlignmentHorizontal.FROM_STRING);
        Expression l2 = xcx.l(yf90Var, cdlVar.c, jSONObject, "alignment_vertical", i2.g, DivAlignmentVertical.FROM_STRING);
        exq exqVar2 = cdlVar.d;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        y7l y7lVar = i2.i;
        kvo kvoVar = i2.a;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, y7lVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        List s = xcx.s(yf90Var, cdlVar.e, jSONObject, "animators", jsonParserComponent.E1, jsonParserComponent.C1);
        List s2 = xcx.s(yf90Var, cdlVar.f, jSONObject, C0553n3.g, jsonParserComponent.Q1, jsonParserComponent.O1);
        DivBorder divBorder = (DivBorder) xcx.h(yf90Var, cdlVar.g, jSONObject, "border", jsonParserComponent.W1, jsonParserComponent.U1);
        exq exqVar3 = cdlVar.h;
        tms tmsVar = wm11.b;
        tls tlsVar2 = b.h;
        Expression m = xcx.m(yf90Var, exqVar3, jSONObject, "column_span", tmsVar, tlsVar2, i2.j);
        List s3 = xcx.s(yf90Var, cdlVar.i, jSONObject, "disappear_actions", jsonParserComponent.Z2, jsonParserComponent.X2);
        List s4 = xcx.s(yf90Var, cdlVar.j, jSONObject, "extensions", jsonParserComponent.l3, jsonParserComponent.j3);
        DivFocus divFocus = (DivFocus) xcx.h(yf90Var, cdlVar.k, jSONObject, "focus", jsonParserComponent.M3, jsonParserComponent.K3);
        List s5 = xcx.s(yf90Var, cdlVar.l, jSONObject, "functions", jsonParserComponent.V3, jsonParserComponent.T3);
        DivSize divSize = (DivSize) xcx.h(yf90Var, cdlVar.m, jSONObject, "height", i3yVar9, i3yVar8);
        if (divSize == null) {
            divSize = i2.b;
        }
        DivSize divSize2 = divSize;
        exq exqVar4 = cdlVar.n;
        abl0 abl0Var = q5z.c;
        String str = (String) xcx.i(exqVar4, abl0Var, yf90Var, "id", jSONObject);
        exq exqVar5 = cdlVar.o;
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar2 = i2.c;
        kvo kvoVar3 = kvoVar;
        ?? o = xcx.o(yf90Var, exqVar5, jSONObject, "is_enabled", wmsVar, tlsVar3, kvoVar2);
        kvo kvoVar4 = o == 0 ? kvoVar2 : o;
        String str2 = (String) xcx.a(cdlVar.p, jSONObject, "is_on_variable", abl0Var, q5z.b);
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) xcx.h(yf90Var, cdlVar.q, jSONObject, "layout_provider", jsonParserComponent.Z4, jsonParserComponent.X4);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, cdlVar.r, jSONObject, "margins", i3yVar7, i3yVar6);
        Expression l3 = xcx.l(yf90Var, cdlVar.s, jSONObject, "on_color", wm11.f, b.b);
        DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) xcx.h(yf90Var, cdlVar.t, jSONObject, "paddings", i3yVar7, i3yVar6);
        Expression k = xcx.k(yf90Var, cdlVar.u, jSONObject, "reuse_id", wm11.c);
        Expression m2 = xcx.m(yf90Var, cdlVar.v, jSONObject, "row_span", tmsVar, tlsVar2, i2.k);
        List s6 = xcx.s(yf90Var, cdlVar.w, jSONObject, "selected_actions", jsonParserComponent.v1, jsonParserComponent.t1);
        List s7 = xcx.s(yf90Var, cdlVar.x, jSONObject, "tooltips", jsonParserComponent.m9, jsonParserComponent.k9);
        DivTransform divTransform = (DivTransform) xcx.h(yf90Var, cdlVar.y, jSONObject, "transform", jsonParserComponent.p9, jsonParserComponent.n9);
        List s8 = xcx.s(yf90Var, cdlVar.z, jSONObject, "transformations", jsonParserComponent.s9, jsonParserComponent.q9);
        DivChangeTransition divChangeTransition = (DivChangeTransition) xcx.h(yf90Var, cdlVar.A, jSONObject, "transition_change", jsonParserComponent.f2, jsonParserComponent.d2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) xcx.h(yf90Var, cdlVar.B, jSONObject, "transition_in", i3yVar5, i3yVar4);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) xcx.h(yf90Var, cdlVar.C, jSONObject, "transition_out", i3yVar5, i3yVar4);
        List q = xcx.q(yf90Var, cdlVar.D, jSONObject, DivTransitionTrigger.FROM_STRING, i2.l);
        List s9 = xcx.s(yf90Var, cdlVar.E, jSONObject, "variable_triggers", jsonParserComponent.B9, jsonParserComponent.z9);
        List s10 = xcx.s(yf90Var, cdlVar.F, jSONObject, "variables", jsonParserComponent.H9, jsonParserComponent.F9);
        exq exqVar6 = cdlVar.G;
        qkj qkjVar = i2.h;
        tls tlsVar4 = DivVisibility.FROM_STRING;
        kvo kvoVar5 = i2.d;
        ?? o2 = xcx.o(yf90Var, exqVar6, jSONObject, "visibility", qkjVar, tlsVar4, kvoVar5);
        if (o2 != 0) {
            kvoVar5 = o2;
        }
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) xcx.h(yf90Var, cdlVar.H, jSONObject, "visibility_action", i3yVar3, i3yVar2);
        List s11 = xcx.s(yf90Var, cdlVar.I, jSONObject, "visibility_actions", i3yVar3, i3yVar2);
        DivSize divSize3 = (DivSize) xcx.h(yf90Var, cdlVar.J, jSONObject, "width", i3yVar9, i3yVar8);
        if (divSize3 == null) {
            divSize3 = i2.e;
        }
        return new ycl(divAccessibility, l, l2, kvoVar3, s, s2, divBorder, m, s3, s4, divFocus, s5, divSize2, str, kvoVar4, str2, divLayoutProvider, divEdgeInsets, l3, divEdgeInsets2, k, m2, s6, s7, divTransform, s8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, q, s9, s10, kvoVar5, divVisibilityAction, s11, divSize3);
    }
}
