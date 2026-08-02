package com.yandex.payment.divkit.usecases;

import com.yandex.payment.divkit.StringMethod;
import defpackage.abe;
import defpackage.ahm0;
import defpackage.avu0;
import defpackage.ctf;
import defpackage.cyo;
import defpackage.dhe;
import defpackage.dtf;
import defpackage.fse;
import defpackage.g8e;
import defpackage.g8l;
import defpackage.ir;
import defpackage.jcv0;
import defpackage.jl40;
import defpackage.kq4;
import defpackage.kvy0;
import defpackage.ldk;
import defpackage.m93;
import defpackage.mdh;
import defpackage.mi91;
import defpackage.mta1;
import defpackage.n690;
import defpackage.omy0;
import defpackage.oyr;
import defpackage.qd90;
import defpackage.ru31;
import defpackage.rwo;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tyh0;
import defpackage.u3u;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.vzk;
import defpackage.wjk;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {
    public final com.yandex.payment.divkit.repository.a a;
    public final m93 b;
    public final u3u c;
    public final abe d;
    public final rwo e;
    public final fse f;
    public final kvy0 g;

    public l(com.yandex.payment.divkit.repository.a aVar, m93 m93Var, u3u u3uVar, abe abeVar, rwo rwoVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = aVar;
        this.b = m93Var;
        this.c = u3uVar;
        this.d = abeVar;
        this.e = rwoVar;
        this.f = mdhVar;
        this.g = new kvy0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e1, code lost:
    
        if (r11.compareTo(java.math.BigDecimal.ZERO) > 0) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a(dtf dtfVar) {
        Object obj;
        jcv0 jcv0Var;
        Object obj2;
        jcv0 jcv0Var2;
        kq4 kq4Var;
        BigDecimal h;
        int i;
        List list;
        String str;
        String h2;
        JSONObject a = this.b.a("main_feed.json");
        JSONObject jSONObject = a.getJSONObject("card");
        JSONArray jSONArray = jSONObject.getJSONArray("variables");
        JSONObject put = new JSONObject().put("type", "string").put("name", "select_method_screen_selected_method");
        int i2 = dtfVar.b;
        String str2 = dtfVar.e;
        String str3 = dtfVar.d;
        jSONArray.put(put.put("value", String.valueOf(i2)));
        int i3 = 0;
        int i4 = 1;
        JSONArray jSONArray2 = jSONObject.getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(1).getJSONArray("items");
        List list2 = dtfVar.a;
        List list3 = list2;
        Iterator it = list3.iterator();
        int i5 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i6 = i3;
            abe abeVar = this.d;
            if (!hasNext) {
                List list4 = list2;
                JSONObject jSONObject2 = a;
                List list5 = list3;
                JSONObject jSONObject3 = jSONObject.getJSONArray("states").getJSONObject(i6).getJSONObject("div").getJSONArray("items").getJSONObject(i6).getJSONArray("items").getJSONObject(2).getJSONArray("items").getJSONObject(i6).getJSONArray("items").getJSONObject(i6);
                String format = (str3 == null || (h = avu0.h(str3)) == null) ? null : NumberFormat.getNumberInstance().format(h);
                rwo rwoVar = this.e;
                String e = str2 != null ? mta1.e(str2, rwoVar) : null;
                Iterator it2 = list5.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (jl40.l(((ctf) obj).b, StringMethod.YB.getValue())) {
                        break;
                    }
                }
                ctf ctfVar = (ctf) obj;
                BigDecimal bigDecimal = (ctfVar == null || (kq4Var = ctfVar.f) == null) ? null : kq4Var.a;
                if (bigDecimal != null) {
                    BigDecimal subtract = (str3 != null ? new BigDecimal(str3) : BigDecimal.ZERO).subtract(bigDecimal);
                    jcv0Var = new jcv0(subtract, g8e.p(NumberFormat.getNumberInstance().format(subtract), " ", e == null ? "" : e));
                }
                jcv0Var = null;
                String g = abeVar.g(tyh0.paymentsdk_pay_button_title_fomatted, new Object[]{e == null ? "" : e, format == null ? "" : format});
                String string = abeVar.a.getString(tyh0.paymentsdk_select_button_title);
                int i7 = tyh0.paymentsdk_topup_card;
                obj2 = jcv0Var != null ? jcv0Var.b : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                String g2 = abeVar.g(i7, new Object[]{obj2});
                Iterator it3 = list4.iterator();
                int i8 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        jcv0Var2 = jcv0Var;
                        i8 = -1;
                        break;
                    }
                    jcv0Var2 = jcv0Var;
                    Iterator it4 = it3;
                    if (jl40.l(((ctf) it3.next()).b, StringMethod.YB.getValue())) {
                        break;
                    }
                    i8++;
                    jcv0Var = jcv0Var2;
                    it3 = it4;
                }
                int i9 = i8;
                String l = oyr.l(i9, "@{select_method_screen_selected_method == '", "' ? '", jcv0Var2 != null ? "visible" : "gone", "' : 'gone'}");
                jSONObject3.put("subtitleText", abeVar.g(tyh0.paymentsdk_pay_after_topup_button_subtitle, new Object[]{g8e.p(format, " ", e)}));
                if (jcv0Var2 != null) {
                    g = oyr.t(unr0.v(i9, "@{'", "' == select_method_screen_selected_method ? '", g2, "' : '"), g, "'}");
                }
                jSONObject3.put("buttonText", unr0.p("@{select_method_screen_show_select_button_text ? '", string, "' : '", g, "'}"));
                jSONObject3.put("subtitleTextVisibility", l);
                JSONObject jSONObject4 = jSONObject.getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(1);
                if (str3 != null) {
                    if (jSONObject4.put("text", NumberFormat.getNumberInstance().format(new BigDecimal(str3)) + " " + (str2 != null ? mta1.e(str2, rwoVar) : "")) != null) {
                        return jSONObject2;
                    }
                }
                jSONObject4.remove("text");
                return jSONObject2;
            }
            Object next = it.next();
            int i10 = i5 + 1;
            if (i5 < 0) {
                scc.m();
                throw null;
            }
            ctf ctfVar2 = (ctf) next;
            int i11 = i4;
            int i12 = i5 == list2.size() + (-1) ? i11 : i6;
            List list6 = list2;
            List list7 = ctfVar2.j;
            String str4 = ctfVar2.c;
            JSONObject jSONObject5 = a;
            String str5 = ctfVar2.b;
            List list8 = list7;
            if (list8 == null || list8.isEmpty()) {
                i = i12;
                list = list3;
                str = ctfVar2.f != null ? "" : ctfVar2.d;
            } else {
                i = i12;
                list = list3;
                str = abeVar.a.getString(tyh0.paymentsdk_divkit_restriction_subtitle);
            }
            String str6 = ctfVar2.a;
            String str7 = str;
            boolean l2 = jl40.l(str6, StringMethod.ADD_CARD.getValue());
            u3u u3uVar = this.c;
            if (l2) {
                h2 = u3uVar.h(new ldk(Collections.singletonList(new ir("div-action://bind_card_click")), str4));
            } else {
                if (!jl40.l(str5, StringMethod.SBP.getValue())) {
                    jl40.l(str5, StringMethod.NEW_SBP_TOKEN.getValue());
                }
                if (list8 != null) {
                    list8.isEmpty();
                }
                Pair pair = (list8 == null || list8.isEmpty()) ? new Pair(Float.valueOf(1.0f), oyr.i(i5, "div-action://set_variable?name=select_method_screen_selected_method&value=")) : new Pair(Float.valueOf(0.5f), "payment-sdk://show_toast?message=".concat(abeVar.a.getString(tyh0.paymentsdk_divkit_restriction_message_default)));
                float floatValue = ((Number) pair.getFirst()).floatValue();
                ir irVar = new ir((String) pair.getSecond());
                this.g.getClass();
                String str8 = str7 != null ? "visible" : "gone";
                List singletonList = Collections.singletonList(new omy0());
                List singletonList2 = Collections.singletonList(irVar);
                List singletonList3 = Collections.singletonList(new cyo(new qd90()));
                ru31 ru31Var = new ru31();
                obj2 = jl40.l(str6, StringMethod.SBP_TOKEN.getValue()) ? null : new wjk();
                if (obj2 == null) {
                    obj2 = new ahm0(ctfVar2.e);
                }
                String str9 = str7 == null ? "" : str7;
                n690 n690Var = new n690(8, 8, 12);
                String str10 = ctfVar2.i;
                dhe dheVar = new dhe(str9, str8, str4, str10, str10 != null ? i11 : i6, n690Var, floatValue);
                wjk wjkVar = new wjk();
                mi91[] mi91VarArr = new mi91[3];
                mi91VarArr[i6] = obj2;
                mi91VarArr[i11] = dheVar;
                mi91VarArr[2] = wjkVar;
                Collections.singletonList(new vzk(singletonList2, singletonList3, ru31Var, scc.g(mi91VarArr), new n690(16, 16, 12), singletonList));
                mi91[] mi91VarArr2 = new mi91[i11];
                mi91VarArr2[i6] = new wjk();
                ArrayList i13 = scc.i(mi91VarArr2);
                if (i == 0) {
                    i13.add(new g8l());
                }
                h2 = u3uVar.h(new wjk());
            }
            jSONArray2.put(new JSONObject(h2));
            i3 = i6;
            i5 = i10;
            list2 = list6;
            a = jSONObject5;
            list3 = list;
            i4 = 1;
        }
    }

    public final Object b(dtf dtfVar, ContinuationImpl continuationImpl) {
        return tje.k0(this.f, new FetchSelectMethodUseCaseImpl$fetch$2(this, dtfVar, null), continuationImpl);
    }
}
