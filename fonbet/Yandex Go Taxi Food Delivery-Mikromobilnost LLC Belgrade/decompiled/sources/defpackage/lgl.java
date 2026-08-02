package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.x2;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lgl implements zsq0, nyi {
    public final JsonParserComponent a;

    public lgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        List O = wwg.O(yf90Var, jSONObject, "actions", jsonParserComponent.t1);
        qkj qkjVar = x2.d;
        tls tlsVar = DivTextAlignmentVertical.FROM_STRING;
        kbs kbsVar = q5z.b;
        Expression e = a.e(yf90Var, jSONObject, "alignment_vertical", qkjVar, tlsVar, kbsVar, null);
        agl aglVar = (agl) wwg.M(yf90Var, jSONObject, C0553n3.g, jsonParserComponent.t8);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        kvo kvoVar = x2.a;
        ?? e2 = a.e(yf90Var, jSONObject, "baseline_offset", smsVar, tlsVar2, kbsVar, kvoVar);
        kvo kvoVar2 = e2 == 0 ? kvoVar : e2;
        hgl hglVar = (hgl) wwg.M(yf90Var, jSONObject, "border", jsonParserComponent.w8);
        tms tmsVar = wm11.b;
        tls tlsVar3 = b.h;
        Expression e3 = a.e(yf90Var, jSONObject, "end", tmsVar, tlsVar3, x2.i, null);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression e4 = a.e(yf90Var, jSONObject, "font_family", umsVar, abl0Var, kbsVar, null);
        Expression e5 = a.e(yf90Var, jSONObject, "font_feature_settings", umsVar, abl0Var, kbsVar, null);
        Expression e6 = a.e(yf90Var, jSONObject, "font_size", tmsVar, tlsVar3, x2.j, null);
        qkj qkjVar2 = x2.e;
        tls tlsVar4 = DivSizeUnit.FROM_STRING;
        kvo kvoVar3 = x2.b;
        ?? e7 = a.e(yf90Var, jSONObject, "font_size_unit", qkjVar2, tlsVar4, kbsVar, kvoVar3);
        kvo kvoVar4 = e7 == 0 ? kvoVar3 : e7;
        Expression e8 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, abl0Var, kbsVar, null);
        Expression e9 = a.e(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, x2.f, DivFontWeight.FROM_STRING, kbsVar, null);
        Expression e10 = a.e(yf90Var, jSONObject, "font_weight_value", tmsVar, tlsVar3, x2.k, null);
        Expression e11 = a.e(yf90Var, jSONObject, "letter_spacing", smsVar, tlsVar2, kbsVar, null);
        Expression e12 = a.e(yf90Var, jSONObject, "line_height", tmsVar, tlsVar3, x2.l, null);
        pgl pglVar = (pgl) wwg.M(yf90Var, jSONObject, "mask", jsonParserComponent.H8);
        i8l i8lVar = x2.m;
        kvo kvoVar5 = x2.c;
        ?? e13 = a.e(yf90Var, jSONObject, "start", tmsVar, tlsVar3, i8lVar, kvoVar5);
        kvo kvoVar6 = e13 == 0 ? kvoVar5 : e13;
        qkj qkjVar3 = x2.g;
        tls tlsVar5 = DivLineStyle.FROM_STRING;
        return new dfl(O, e, aglVar, kvoVar2, hglVar, e3, e4, e5, e6, kvoVar4, e8, e9, e10, e11, e12, pglVar, kvoVar6, a.e(yf90Var, jSONObject, "strike", qkjVar3, tlsVar5, kbsVar, null), a.e(yf90Var, jSONObject, "text_color", wm11.f, b.b, kbsVar, null), (m8l) wwg.M(yf90Var, jSONObject, "text_shadow", jsonParserComponent.c7), a.e(yf90Var, jSONObject, "top_offset", tmsVar, tlsVar3, x2.n, null), a.e(yf90Var, jSONObject, "underline", x2.h, tlsVar5, kbsVar, null));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dfl dflVar) {
        JSONObject jSONObject = new JSONObject();
        List list = dflVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "actions", list, jsonParserComponent.t1);
        a.h(yf90Var, jSONObject, "alignment_vertical", dflVar.b, DivTextAlignmentVertical.TO_STRING);
        wwg.b0(yf90Var, jSONObject, C0553n3.g, dflVar.c, jsonParserComponent.t8);
        a.g(yf90Var, jSONObject, "baseline_offset", dflVar.d);
        wwg.b0(yf90Var, jSONObject, "border", dflVar.e, jsonParserComponent.w8);
        a.g(yf90Var, jSONObject, "end", dflVar.f);
        a.g(yf90Var, jSONObject, "font_family", dflVar.g);
        a.g(yf90Var, jSONObject, "font_feature_settings", dflVar.h);
        a.g(yf90Var, jSONObject, "font_size", dflVar.i);
        a.h(yf90Var, jSONObject, "font_size_unit", dflVar.j, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, dflVar.k);
        a.h(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, dflVar.l, DivFontWeight.TO_STRING);
        a.g(yf90Var, jSONObject, "font_weight_value", dflVar.m);
        a.g(yf90Var, jSONObject, "letter_spacing", dflVar.n);
        a.g(yf90Var, jSONObject, "line_height", dflVar.o);
        wwg.b0(yf90Var, jSONObject, "mask", dflVar.p, jsonParserComponent.H8);
        a.g(yf90Var, jSONObject, "start", dflVar.q);
        Expression expression = dflVar.r;
        tls tlsVar = DivLineStyle.TO_STRING;
        a.h(yf90Var, jSONObject, "strike", expression, tlsVar);
        a.h(yf90Var, jSONObject, "text_color", dflVar.s, b.a);
        wwg.b0(yf90Var, jSONObject, "text_shadow", dflVar.t, jsonParserComponent.c7);
        a.g(yf90Var, jSONObject, "top_offset", dflVar.u);
        a.h(yf90Var, jSONObject, "underline", dflVar.v, tlsVar);
        return jSONObject;
    }
}
