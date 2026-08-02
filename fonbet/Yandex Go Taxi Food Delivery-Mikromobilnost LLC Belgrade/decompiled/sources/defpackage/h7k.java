package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivAction$Target;
import com.yandex.div2.DivActionSubmit$Request$Method;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTooltip$Position;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTrigger$Mode;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.a3;
import com.yandex.div2.f2;
import com.yandex.div2.i;
import com.yandex.div2.l;
import com.yandex.div2.z2;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public final class h7k implements qfy0 {
    public final /* synthetic */ int a;
    public final JsonParserComponent b;

    public /* synthetic */ h7k(JsonParserComponent jsonParserComponent, int i) {
        this.a = i;
        this.b = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v110, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v125, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v129, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v164, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v167, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v177, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v38, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v42, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v45, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v69, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v71, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v73, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v85, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v87, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v92, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        List I;
        int i = this.a;
        JsonParserComponent jsonParserComponent = this.b;
        switch (i) {
            case 0:
                fak fakVar = (fak) hexVar;
                tnk tnkVar = (tnk) xcx.h(yf90Var, fakVar.a, jSONObject, "download_callbacks", jsonParserComponent.c3, jsonParserComponent.a3);
                exq exqVar = fakVar.b;
                wms wmsVar = wm11.a;
                tls tlsVar = b.f;
                kvo kvoVar = i.a;
                ?? o = xcx.o(yf90Var, exqVar, jSONObject, "is_enabled", wmsVar, tlsVar, kvoVar);
                kvo kvoVar2 = o == 0 ? kvoVar : o;
                Expression c = xcx.c(yf90Var, fakVar.c, jSONObject, "log_id", wm11.c);
                exq exqVar2 = fakVar.d;
                dxf0 dxf0Var = wm11.e;
                tls tlsVar2 = b.e;
                Expression l = xcx.l(yf90Var, exqVar2, jSONObject, "log_url", dxf0Var, tlsVar2);
                List s = xcx.s(yf90Var, fakVar.e, jSONObject, "menu_items", jsonParserComponent.y1, jsonParserComponent.w1);
                exq exqVar3 = fakVar.f;
                abl0 abl0Var = q5z.c;
                return new v3k(tnkVar, kvoVar2, c, l, s, (JSONObject) xcx.i(exqVar3, abl0Var, yf90Var, "payload", jSONObject), xcx.l(yf90Var, fakVar.g, jSONObject, "referer", dxf0Var, tlsVar2), (String) xcx.i(fakVar.h, abl0Var, yf90Var, "scope_id", jSONObject), xcx.l(yf90Var, fakVar.i, jSONObject, "target", i.b, DivAction$Target.FROM_STRING), (jbk) xcx.h(yf90Var, fakVar.j, jSONObject, "typed", jsonParserComponent.m1, jsonParserComponent.k1), xcx.l(yf90Var, fakVar.k, jSONObject, "url", dxf0Var, tlsVar2));
            case 1:
                eak eakVar = (eak) hexVar;
                exq exqVar4 = eakVar.a;
                i3y i3yVar = jsonParserComponent.v1;
                i3y i3yVar2 = jsonParserComponent.t1;
                return new t3k((v3k) xcx.h(yf90Var, exqVar4, jSONObject, "action", i3yVar, i3yVar2), xcx.s(yf90Var, eakVar.b, jSONObject, "actions", jsonParserComponent.v1, i3yVar2), xcx.c(yf90Var, eakVar.c, jSONObject, "text", wm11.c));
            case 2:
                cak cakVar = (cak) hexVar;
                List s2 = xcx.s(yf90Var, cakVar.a, jSONObject, "headers", jsonParserComponent.g1, jsonParserComponent.e1);
                exq exqVar5 = cakVar.b;
                qkj qkjVar = l.b;
                tls tlsVar3 = DivActionSubmit$Request$Method.FROM_STRING;
                kvo kvoVar3 = l.a;
                ?? o2 = xcx.o(yf90Var, exqVar5, jSONObject, "method", qkjVar, tlsVar3, kvoVar3);
                if (o2 != 0) {
                    kvoVar3 = o2;
                }
                return new s9k(s2, kvoVar3, xcx.d(yf90Var, cakVar.c, jSONObject, "url", wm11.e, b.e));
            case 3:
                jjk jjkVar = (jjk) hexVar;
                Expression c2 = xcx.c(yf90Var, jjkVar.a, jSONObject, Constants.KEY_DATA, wm11.g);
                String str = (String) xcx.i(jjkVar.b, q5z.c, yf90Var, "data_element_name", jSONObject);
                if (str == null) {
                    str = "it";
                }
                return new DivCollectionItemBuilder(c2, str, xcx.g(yf90Var, jjkVar.c, jSONObject, "prototypes", jsonParserComponent.r2, jsonParserComponent.p2, u991.a));
            case 4:
                ijk ijkVar = (ijk) hexVar;
                m3k m3kVar = (m3k) xcx.b(yf90Var, ijkVar.a, jSONObject, "div", jsonParserComponent.Z9, jsonParserComponent.X9);
                Expression k = xcx.k(yf90Var, ijkVar.b, jSONObject, "id", wm11.c);
                exq exqVar6 = ijkVar.c;
                wms wmsVar2 = wm11.a;
                tls tlsVar4 = b.f;
                kvo kvoVar4 = hjk.a;
                ?? o3 = xcx.o(yf90Var, exqVar6, jSONObject, "selector", wmsVar2, tlsVar4, kvoVar4);
                if (o3 != 0) {
                    kvoVar4 = o3;
                }
                return new cjk(m3kVar, k, kvoVar4);
            case 5:
                ank ankVar = (ank) hexVar;
                return new mmk((m3k) xcx.b(yf90Var, ankVar.a, jSONObject, "div", jsonParserComponent.Z9, jsonParserComponent.X9), ((Number) xcx.a(ankVar.b, jSONObject, StateEntry.COLUMN_STATE_ID, b.h, q5z.b)).longValue());
            case 6:
                rnk rnkVar = (rnk) hexVar;
                exq exqVar7 = rnkVar.a;
                tms tmsVar = wm11.b;
                tls tlsVar5 = b.h;
                tlk tlkVar = qnk.e;
                kvo kvoVar5 = qnk.a;
                ?? n = xcx.n(yf90Var, exqVar7, jSONObject, "disappear_duration", tmsVar, tlsVar5, tlkVar, kvoVar5);
                kvo kvoVar6 = n == 0 ? kvoVar5 : n;
                tnk tnkVar2 = (tnk) xcx.h(yf90Var, rnkVar.b, jSONObject, "download_callbacks", jsonParserComponent.c3, jsonParserComponent.a3);
                exq exqVar8 = rnkVar.c;
                wms wmsVar3 = wm11.a;
                tls tlsVar6 = b.f;
                kvo kvoVar7 = qnk.b;
                ?? o4 = xcx.o(yf90Var, exqVar8, jSONObject, "is_enabled", wmsVar3, tlsVar6, kvoVar7);
                kvo kvoVar8 = o4 == 0 ? kvoVar7 : o4;
                Expression c3 = xcx.c(yf90Var, rnkVar.d, jSONObject, "log_id", wm11.c);
                exq exqVar9 = rnkVar.e;
                tlk tlkVar2 = qnk.f;
                kvo kvoVar9 = qnk.c;
                ?? n2 = xcx.n(yf90Var, exqVar9, jSONObject, "log_limit", tmsVar, tlsVar5, tlkVar2, kvoVar9);
                kvo kvoVar10 = n2 == 0 ? kvoVar9 : n2;
                exq exqVar10 = rnkVar.f;
                abl0 abl0Var2 = q5z.c;
                JSONObject jSONObject2 = (JSONObject) xcx.i(exqVar10, abl0Var2, yf90Var, "payload", jSONObject);
                exq exqVar11 = rnkVar.g;
                dxf0 dxf0Var2 = wm11.e;
                tls tlsVar7 = b.e;
                Expression l2 = xcx.l(yf90Var, exqVar11, jSONObject, "referer", dxf0Var2, tlsVar7);
                String str2 = (String) xcx.i(rnkVar.h, abl0Var2, yf90Var, "scope_id", jSONObject);
                jbk jbkVar = (jbk) xcx.h(yf90Var, rnkVar.i, jSONObject, "typed", jsonParserComponent.m1, jsonParserComponent.k1);
                Expression l3 = xcx.l(yf90Var, rnkVar.j, jSONObject, "url", dxf0Var2, tlsVar7);
                exq exqVar12 = rnkVar.k;
                tlk tlkVar3 = qnk.g;
                kvo kvoVar11 = qnk.d;
                ?? n3 = xcx.n(yf90Var, exqVar12, jSONObject, "visibility_percentage", tmsVar, tlsVar5, tlkVar3, kvoVar11);
                return new nnk(jbkVar, tnkVar2, kvoVar6, kvoVar8, c3, kvoVar10, l2, l3, n3 == 0 ? kvoVar11 : n3, str2, jSONObject2);
            case 7:
                wnk wnkVar = (wnk) hexVar;
                exq exqVar13 = wnkVar.a;
                i3y i3yVar3 = jsonParserComponent.v1;
                i3y i3yVar4 = jsonParserComponent.t1;
                return new tnk(xcx.s(yf90Var, exqVar13, jSONObject, "on_fail_actions", i3yVar3, i3yVar4), xcx.s(yf90Var, wnkVar.b, jSONObject, "on_success_actions", jsonParserComponent.v1, i3yVar4));
            case 8:
                prk prkVar = (prk) hexVar;
                exq exqVar14 = prkVar.a;
                i3y i3yVar5 = jsonParserComponent.S3;
                i3y i3yVar6 = jsonParserComponent.Q3;
                if (exqVar14.b && jSONObject.has("arguments")) {
                    I = wwg.I(yf90Var, jSONObject, "arguments", i3yVar6);
                } else {
                    int i2 = exqVar14.a;
                    if (i2 == 2) {
                        List list = (List) ((cxq) exqVar14).c;
                        int size = list.size();
                        ArrayList arrayList = new ArrayList(size);
                        qfy0 qfy0Var = (qfy0) i3yVar5.getValue();
                        for (int i3 = 0; i3 < size; i3++) {
                            Object j = xcx.j(yf90Var, (hex) list.get(i3), jSONObject, qfy0Var);
                            if (j != null) {
                                arrayList.add(j);
                            }
                        }
                        I = arrayList;
                    } else {
                        if (i2 != 3) {
                            throw fg90.h("arguments", jSONObject);
                        }
                        I = wwg.I(yf90Var, jSONObject, ((bxq) exqVar14).c, i3yVar6);
                    }
                }
                exq exqVar15 = prkVar.b;
                abl0 abl0Var3 = q5z.c;
                kbs kbsVar = q5z.b;
                return new irk(I, (String) xcx.a(exqVar15, jSONObject, "body", abl0Var3, kbsVar), (String) xcx.a(prkVar.c, jSONObject, "name", abl0Var3, ba91.a), (DivEvaluableType) xcx.a(prkVar.d, jSONObject, "return_type", DivEvaluableType.FROM_STRING, kbsVar));
            case 9:
                h3l h3lVar = (h3l) hexVar;
                return new w2l((String) xcx.a(h3lVar.a, jSONObject, "id", q5z.c, q5z.b), xcx.s(yf90Var, h3lVar.b, jSONObject, "items", jsonParserComponent.Z9, jsonParserComponent.X9));
            case 10:
                a5l a5lVar = (a5l) hexVar;
                exq exqVar16 = a5lVar.a;
                i3y i3yVar7 = jsonParserComponent.W2;
                i3y i3yVar8 = jsonParserComponent.U2;
                return new x4l((jnk) xcx.b(yf90Var, exqVar16, jSONObject, RemoteBioParameters.X, i3yVar7, i3yVar8), (jnk) xcx.b(yf90Var, a5lVar.b, jSONObject, RemoteBioParameters.Y, jsonParserComponent.W2, i3yVar8));
            case 11:
                q8l q8lVar = (q8l) hexVar;
                exq exqVar17 = q8lVar.a;
                sms smsVar = wm11.d;
                tls tlsVar8 = b.g;
                i8l i8lVar = p8l.d;
                kvo kvoVar12 = p8l.a;
                ?? n4 = xcx.n(yf90Var, exqVar17, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar8, i8lVar, kvoVar12);
                kvo kvoVar13 = n4 == 0 ? kvoVar12 : n4;
                exq exqVar18 = q8lVar.b;
                tms tmsVar2 = wm11.b;
                tls tlsVar9 = b.h;
                i8l i8lVar2 = p8l.e;
                kvo kvoVar14 = p8l.b;
                ?? n5 = xcx.n(yf90Var, exqVar18, jSONObject, "blur", tmsVar2, tlsVar9, i8lVar2, kvoVar14);
                if (n5 != 0) {
                    kvoVar14 = n5;
                }
                exq exqVar19 = q8lVar.c;
                rms rmsVar = wm11.f;
                tls tlsVar10 = b.b;
                kvo kvoVar15 = p8l.c;
                ?? o5 = xcx.o(yf90Var, exqVar19, jSONObject, "color", rmsVar, tlsVar10, kvoVar15);
                if (o5 != 0) {
                    kvoVar15 = o5;
                }
                return new m8l(kvoVar13, kvoVar14, kvoVar15, (x4l) xcx.b(yf90Var, q8lVar.d, jSONObject, "offset", jsonParserComponent.l6, jsonParserComponent.j6));
            case 12:
                ral ralVar = (ral) hexVar;
                exq exqVar20 = ralVar.a;
                tms tmsVar3 = wm11.b;
                tls tlsVar11 = b.h;
                Expression l4 = xcx.l(yf90Var, exqVar20, jSONObject, "end", tmsVar3, tlsVar11);
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, ralVar.b, jSONObject, "margins", jsonParserComponent.i3, jsonParserComponent.g3);
                Expression l5 = xcx.l(yf90Var, ralVar.c, jSONObject, "start", tmsVar3, tlsVar11);
                exq exqVar21 = ralVar.d;
                i3y i3yVar9 = jsonParserComponent.f3;
                i3y i3yVar10 = jsonParserComponent.d3;
                return new fal(l4, divEdgeInsets, l5, (aok) xcx.h(yf90Var, exqVar21, jSONObject, "track_active_style", i3yVar9, i3yVar10), (aok) xcx.h(yf90Var, ralVar.e, jSONObject, "track_inactive_style", i3yVar9, i3yVar10));
            case 13:
                sal salVar = (sal) hexVar;
                Expression k2 = xcx.k(yf90Var, salVar.a, jSONObject, "font_family", wm11.c);
                exq exqVar22 = salVar.b;
                tms tmsVar4 = wm11.b;
                tls tlsVar12 = b.h;
                y7l y7lVar = f2.g;
                kvo kvoVar16 = f2.a;
                ?? n6 = xcx.n(yf90Var, exqVar22, jSONObject, "font_size", tmsVar4, tlsVar12, y7lVar, kvoVar16);
                kvo kvoVar17 = n6 == 0 ? kvoVar16 : n6;
                exq exqVar23 = salVar.c;
                qkj qkjVar2 = f2.e;
                tls tlsVar13 = DivSizeUnit.FROM_STRING;
                kvo kvoVar18 = f2.b;
                ?? o6 = xcx.o(yf90Var, exqVar23, jSONObject, "font_size_unit", qkjVar2, tlsVar13, kvoVar18);
                kvo kvoVar19 = o6 == 0 ? kvoVar18 : o6;
                Expression k3 = xcx.k(yf90Var, salVar.d, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h);
                Expression l6 = xcx.l(yf90Var, salVar.e, jSONObject, FontsContractCompat$Columns.WEIGHT, f2.f, DivFontWeight.FROM_STRING);
                Expression m = xcx.m(yf90Var, salVar.f, jSONObject, "font_weight_value", tmsVar4, tlsVar12, f2.h);
                exq exqVar24 = salVar.g;
                sms smsVar2 = wm11.d;
                tls tlsVar14 = b.g;
                kvo kvoVar20 = f2.c;
                ?? o7 = xcx.o(yf90Var, exqVar24, jSONObject, "letter_spacing", smsVar2, tlsVar14, kvoVar20);
                kvo kvoVar21 = o7 == 0 ? kvoVar20 : o7;
                x4l x4lVar = (x4l) xcx.h(yf90Var, salVar.h, jSONObject, "offset", jsonParserComponent.l6, jsonParserComponent.j6);
                exq exqVar25 = salVar.i;
                rms rmsVar2 = wm11.f;
                tls tlsVar15 = b.b;
                kvo kvoVar22 = f2.d;
                ?? o8 = xcx.o(yf90Var, exqVar25, jSONObject, "text_color", rmsVar2, tlsVar15, kvoVar22);
                return new gal(k2, kvoVar17, kvoVar19, k3, l6, m, kvoVar21, x4lVar, o8 == 0 ? kvoVar22 : o8);
            case 14:
                del delVar = (del) hexVar;
                return new kdl((m3k) xcx.b(yf90Var, delVar.a, jSONObject, "div", jsonParserComponent.Z9, jsonParserComponent.X9), xcx.c(yf90Var, delVar.b, jSONObject, "title", wm11.c), (v3k) xcx.h(yf90Var, delVar.c, jSONObject, "title_click_action", jsonParserComponent.v1, jsonParserComponent.t1));
            case 15:
                eel eelVar = (eel) hexVar;
                exq exqVar26 = eelVar.a;
                i3y i3yVar11 = jsonParserComponent.G3;
                i3y i3yVar12 = jsonParserComponent.E3;
                sqk sqkVar = (sqk) xcx.h(yf90Var, exqVar26, jSONObject, "height", i3yVar11, i3yVar12);
                if (sqkVar == null) {
                    sqkVar = cel.a;
                }
                sqk sqkVar2 = sqkVar;
                Expression d = xcx.d(yf90Var, eelVar.b, jSONObject, "image_url", wm11.e, b.e);
                sqk sqkVar3 = (sqk) xcx.h(yf90Var, eelVar.c, jSONObject, "width", jsonParserComponent.G3, i3yVar12);
                if (sqkVar3 == null) {
                    sqkVar3 = cel.b;
                }
                return new ldl(sqkVar2, d, sqkVar3);
            case 16:
                kgl kglVar = (kgl) hexVar;
                return new hgl(xcx.m(yf90Var, kglVar.a, jSONObject, "corner_radius", wm11.b, b.h, ha91.a), (bcl) xcx.h(yf90Var, kglVar.b, jSONObject, "stroke", jsonParserComponent.a8, jsonParserComponent.Y7));
            case 17:
                cil cilVar = (cil) hexVar;
                exq exqVar27 = cilVar.a;
                tms tmsVar5 = wm11.b;
                tls tlsVar16 = b.h;
                yhl yhlVar = bil.b;
                kvo kvoVar23 = bil.a;
                ?? n7 = xcx.n(yf90Var, exqVar27, jSONObject, "duration", tmsVar5, tlsVar16, yhlVar, kvoVar23);
                if (n7 != 0) {
                    kvoVar23 = n7;
                }
                exq exqVar28 = cilVar.b;
                i3y i3yVar13 = jsonParserComponent.v1;
                i3y i3yVar14 = jsonParserComponent.t1;
                List s3 = xcx.s(yf90Var, exqVar28, jSONObject, "end_actions", i3yVar13, i3yVar14);
                exq exqVar29 = cilVar.c;
                abl0 abl0Var4 = q5z.c;
                return new vhl(kvoVar23, s3, (String) xcx.a(exqVar29, jSONObject, "id", abl0Var4, q5z.b), xcx.s(yf90Var, cilVar.d, jSONObject, "tick_actions", jsonParserComponent.v1, i3yVar14), xcx.m(yf90Var, cilVar.e, jSONObject, "tick_interval", tmsVar5, tlsVar16, bil.c), (String) xcx.i(cilVar.f, abl0Var4, yf90Var, "value_variable", jSONObject));
            case 18:
                ijl ijlVar = (ijl) hexVar;
                exq exqVar30 = ijlVar.a;
                i3y i3yVar15 = jsonParserComponent.B1;
                i3y i3yVar16 = jsonParserComponent.X9;
                i3y i3yVar17 = jsonParserComponent.Z9;
                i3y i3yVar18 = jsonParserComponent.z1;
                pdk pdkVar = (pdk) xcx.h(yf90Var, exqVar30, jSONObject, "animation_in", i3yVar15, i3yVar18);
                pdk pdkVar2 = (pdk) xcx.h(yf90Var, ijlVar.b, jSONObject, "animation_out", jsonParserComponent.B1, i3yVar18);
                Expression k4 = xcx.k(yf90Var, ijlVar.c, jSONObject, "background_accessibility_description", wm11.c);
                exq exqVar31 = ijlVar.d;
                abl0 abl0Var5 = q5z.c;
                String str3 = (String) xcx.i(exqVar31, abl0Var5, yf90Var, "bring_to_top_id", jSONObject);
                exq exqVar32 = ijlVar.e;
                wms wmsVar4 = wm11.a;
                tls tlsVar17 = b.f;
                kvo kvoVar24 = z2.a;
                ?? o9 = xcx.o(yf90Var, exqVar32, jSONObject, "close_by_tap_outside", wmsVar4, tlsVar17, kvoVar24);
                kvo kvoVar25 = o9 == 0 ? kvoVar24 : o9;
                m3k m3kVar2 = (m3k) xcx.b(yf90Var, ijlVar.f, jSONObject, "div", i3yVar17, i3yVar16);
                exq exqVar33 = ijlVar.g;
                tms tmsVar6 = wm11.b;
                tls tlsVar18 = b.h;
                yhl yhlVar2 = z2.e;
                kvo kvoVar26 = z2.b;
                ?? n8 = xcx.n(yf90Var, exqVar33, jSONObject, "duration", tmsVar6, tlsVar18, yhlVar2, kvoVar26);
                if (n8 != 0) {
                    kvoVar26 = n8;
                }
                String str4 = (String) xcx.a(ijlVar.h, jSONObject, "id", abl0Var5, q5z.b);
                ril rilVar = (ril) xcx.h(yf90Var, ijlVar.i, jSONObject, "mode", jsonParserComponent.j9, jsonParserComponent.h9);
                if (rilVar == null) {
                    rilVar = z2.c;
                }
                return new gil(pdkVar, pdkVar2, k4, str3, kvoVar25, m3kVar2, kvoVar26, str4, rilVar, (x4l) xcx.h(yf90Var, ijlVar.j, jSONObject, "offset", jsonParserComponent.l6, jsonParserComponent.j6), xcx.d(yf90Var, ijlVar.k, jSONObject, "position", z2.d, DivTooltip$Position.FROM_STRING), (m3k) xcx.h(yf90Var, ijlVar.l, jSONObject, "substrate_div", i3yVar17, i3yVar16), xcx.s(yf90Var, ijlVar.m, jSONObject, "tap_outside_actions", jsonParserComponent.v1, jsonParserComponent.t1));
            case 19:
                ujl ujlVar = (ujl) hexVar;
                exq exqVar34 = ujlVar.a;
                i3y i3yVar19 = jsonParserComponent.i6;
                i3y i3yVar20 = jsonParserComponent.g6;
                z3l z3lVar = (z3l) xcx.h(yf90Var, exqVar34, jSONObject, "pivot_x", i3yVar19, i3yVar20);
                if (z3lVar == null) {
                    z3lVar = tjl.a;
                }
                z3l z3lVar2 = z3lVar;
                z3l z3lVar3 = (z3l) xcx.h(yf90Var, ujlVar.b, jSONObject, "pivot_y", jsonParserComponent.i6, i3yVar20);
                if (z3lVar3 == null) {
                    z3lVar3 = tjl.b;
                }
                return new DivTransform(z3lVar2, z3lVar3, xcx.l(yf90Var, ujlVar.c, jSONObject, "rotation", wm11.d, b.g));
            case 20:
                oll ollVar = (oll) hexVar;
                List g = xcx.g(yf90Var, ollVar.a, jSONObject, "actions", jsonParserComponent.v1, jsonParserComponent.t1, a3.c);
                Expression d2 = xcx.d(yf90Var, ollVar.b, jSONObject, "condition", wm11.a, b.f);
                exq exqVar35 = ollVar.c;
                qkj qkjVar3 = a3.b;
                tls tlsVar19 = DivTrigger$Mode.FROM_STRING;
                kvo kvoVar27 = a3.a;
                ?? o10 = xcx.o(yf90Var, exqVar35, jSONObject, "mode", qkjVar3, tlsVar19, kvoVar27);
                if (o10 != 0) {
                    kvoVar27 = o10;
                }
                return new lll(g, d2, kvoVar27);
            case 21:
                pol polVar = (pol) hexVar;
                return new iol(xcx.l(yf90Var, polVar.a, jSONObject, "bitrate", wm11.b, b.h), xcx.c(yf90Var, polVar.b, jSONObject, "mime_type", wm11.c), (hol) xcx.h(yf90Var, polVar.c, jSONObject, "resolution", jsonParserComponent.N9, jsonParserComponent.L9), xcx.d(yf90Var, polVar.d, jSONObject, "url", wm11.e, b.e));
            default:
                hql hqlVar = (hql) hexVar;
                tnk tnkVar3 = (tnk) xcx.h(yf90Var, hqlVar.a, jSONObject, "download_callbacks", jsonParserComponent.c3, jsonParserComponent.a3);
                exq exqVar36 = hqlVar.b;
                wms wmsVar5 = wm11.a;
                tls tlsVar20 = b.f;
                kvo kvoVar28 = gql.a;
                ?? o11 = xcx.o(yf90Var, exqVar36, jSONObject, "is_enabled", wmsVar5, tlsVar20, kvoVar28);
                kvo kvoVar29 = o11 == 0 ? kvoVar28 : o11;
                Expression c4 = xcx.c(yf90Var, hqlVar.c, jSONObject, "log_id", wm11.c);
                exq exqVar37 = hqlVar.d;
                tms tmsVar7 = wm11.b;
                tls tlsVar21 = b.h;
                yhl yhlVar3 = gql.e;
                kvo kvoVar30 = gql.b;
                ?? n9 = xcx.n(yf90Var, exqVar37, jSONObject, "log_limit", tmsVar7, tlsVar21, yhlVar3, kvoVar30);
                kvo kvoVar31 = n9 == 0 ? kvoVar30 : n9;
                exq exqVar38 = hqlVar.e;
                abl0 abl0Var6 = q5z.c;
                JSONObject jSONObject3 = (JSONObject) xcx.i(exqVar38, abl0Var6, yf90Var, "payload", jSONObject);
                exq exqVar39 = hqlVar.f;
                dxf0 dxf0Var3 = wm11.e;
                tls tlsVar22 = b.e;
                Expression l7 = xcx.l(yf90Var, exqVar39, jSONObject, "referer", dxf0Var3, tlsVar22);
                String str5 = (String) xcx.i(hqlVar.g, abl0Var6, yf90Var, "scope_id", jSONObject);
                jbk jbkVar2 = (jbk) xcx.h(yf90Var, hqlVar.h, jSONObject, "typed", jsonParserComponent.m1, jsonParserComponent.k1);
                Expression l8 = xcx.l(yf90Var, hqlVar.i, jSONObject, "url", dxf0Var3, tlsVar22);
                exq exqVar40 = hqlVar.j;
                yhl yhlVar4 = gql.f;
                kvo kvoVar32 = gql.c;
                ?? n10 = xcx.n(yf90Var, exqVar40, jSONObject, "visibility_duration", tmsVar7, tlsVar21, yhlVar4, kvoVar32);
                kvo kvoVar33 = n10 == 0 ? kvoVar32 : n10;
                exq exqVar41 = hqlVar.k;
                yhl yhlVar5 = gql.g;
                kvo kvoVar34 = gql.d;
                ?? n11 = xcx.n(yf90Var, exqVar41, jSONObject, "visibility_percentage", tmsVar7, tlsVar21, yhlVar5, kvoVar34);
                return new DivVisibilityAction(jbkVar2, tnkVar3, kvoVar29, c4, kvoVar31, l7, l8, kvoVar33, n11 == 0 ? kvoVar34 : n11, str5, jSONObject3);
        }
    }
}
