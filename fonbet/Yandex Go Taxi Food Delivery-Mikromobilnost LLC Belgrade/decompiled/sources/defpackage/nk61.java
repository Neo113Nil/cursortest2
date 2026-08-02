package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.idsync.impl.D;
import io.appmetrica.analytics.idsync.impl.n;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0205b1;
import io.appmetrica.analytics.impl.C0398hl;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import yads.ct1;
import yads.cy2;
import yads.fi1;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final /* synthetic */ class nk61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ nk61(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr;
        cy2 cy2Var;
        int i = 0;
        switch (this.a) {
            case 0:
                C0205b1.a((C0205b1) this.b, (PluginErrorDetails) this.c, (String) this.w);
                return;
            case 1:
                boolean z = true;
                m2v m2vVar = (m2v) this.b;
                Context context = (Context) this.c;
                bz61 bz61Var = (bz61) this.w;
                synchronized (m2v.y) {
                    lh81 lh81Var = new lh81((lm71) m2vVar.a, bz61Var);
                    if (((ct1) m2vVar.w) == ct1.d) {
                        objArr = false;
                    } else {
                        kj61 kj61Var = (kj61) m2vVar.b;
                        synchronized (kj61Var.a) {
                            kj61Var.b.add(lh81Var);
                        }
                        if (((ct1) m2vVar.w) == ct1.b) {
                            m2vVar.w = ct1.c;
                            objArr = true;
                            z = false;
                        } else {
                            objArr = false;
                            z = false;
                        }
                    }
                }
                if (z) {
                    ((ht81) ((lm71) m2vVar.a).b).a.execute(new jy31(18, bz61Var));
                }
                if (objArr == true) {
                    n291 n291Var = (n291) m2vVar.c;
                    Context context2 = n291Var.a;
                    qx71 qx71Var = new qx71(i, wha1.c(context2, context2));
                    qhw0 a = jl40.a();
                    sjh sjhVar = uyj.a;
                    ((ht81) ((lm71) m2vVar.a).b).b.execute(new vv81(context, n291Var, bvf0.a(cvw.U(a, mdh.b).plus(qx71Var))));
                    return;
                }
                return;
            case 2:
                C0398hl.a((C0398hl) this.b, (String) this.w, (String) this.c);
                return;
            case 3:
                C0398hl.a((C0398hl) this.b, (String) this.w, (Throwable) this.c);
                return;
            case 4:
                ge71 ge71Var = (ge71) this.b;
                String str = (String) this.w;
                Throwable th = (Throwable) this.c;
                try {
                    a441 a441Var = ge71Var.a;
                    if (((gg71) a441Var.b).a()) {
                        hk71 hk71Var = (hk71) ((i3y) a441Var.c).getValue();
                        switch (hk71Var.a) {
                            case 0:
                                ((IReporter) ((ryh) hk71Var.b).b).reportError(str, th);
                                break;
                            default:
                                ((IReporter) hk71Var.b).reportError(str, th);
                                break;
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                en71 en71Var = (en71) this.b;
                a181 a181Var = (a181) this.c;
                v281 v281Var = (v281) this.w;
                xl61 xl61Var = en71Var.c;
                wk2 c = a181Var.c();
                ep71 ep71Var = (ep71) xl61Var;
                vmn0 vmn0Var = ep71Var.w;
                ek71 ek71Var = ep71Var.z;
                ek71Var.getClass();
                vmn0Var.getClass();
                vmn0Var.b = t31.m(c);
                if (!c.isEmpty()) {
                    vmn0Var.x = (v281) c.get(0);
                    v281Var.getClass();
                    vmn0Var.y = v281Var;
                }
                if (((v281) vmn0Var.w) == null) {
                    vmn0Var.w = vmn0.c(ek71Var, (t31) vmn0Var.b, (v281) vmn0Var.x, (ie81) vmn0Var.a);
                }
                ek71Var.v();
                vmn0Var.i(ek71Var.b0.a);
                return;
            case 6:
                n.a((D) this.b, (n) this.c, (RequestConfig) this.w);
                return;
            case 7:
                ((fp71) this.b).e((String) this.w, (Map) this.c);
                return;
            case 8:
                sc81 sc81Var = (sc81) this.b;
                ((sf81) this.c).s(sc81Var.a, sc81Var.b, (pil0) this.w);
                return;
            default:
                cr71 cr71Var = (cr71) this.b;
                h471 h471Var = (h471) this.c;
                hi61 hi61Var = (hi61) this.w;
                rr41 rr41Var = (rr41) cr71Var.c;
                rr41Var.getClass();
                String h = qv10.h(h471Var.b, h471Var.a, "-");
                ((km61) rr41Var.c).getClass();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                w191 w191Var = hi61Var.a;
                jSONObject2.put("width", w191Var.a);
                int i2 = w191Var.b;
                jSONObject2.put("height", i2);
                JSONObject jSONObject3 = new JSONObject();
                h071 h071Var = hi61Var.b;
                Integer num = h071Var.a;
                jSONObject3.put("width", num);
                Integer num2 = h071Var.b;
                jSONObject3.put("height", num2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = new JSONObject();
                t071 t071Var = hi61Var.c;
                b471 b471Var = t071Var.a;
                jSONObject4.put("value", b471Var.a);
                fi1 fi1Var = b471Var.b;
                String name = fi1Var.name();
                Locale locale = Locale.ROOT;
                jSONObject4.put("mode", name.toLowerCase(locale));
                b471 b471Var2 = t071Var.b;
                int i3 = b471Var2.a;
                jSONObject5.put("value", i3);
                fi1 fi1Var2 = b471Var2.b;
                jSONObject5.put("mode", fi1Var2.name().toLowerCase(locale));
                jSONObject6.put("width", jSONObject4);
                jSONObject6.put("height", jSONObject5);
                Object jSONObject7 = new JSONObject(hi61Var.d);
                jSONObject.put("view", jSONObject2);
                jSONObject.put("layout_params", jSONObject3);
                jSONObject.put("measured", jSONObject6);
                jSONObject.put("additional_info", jSONObject7);
                String jSONObject8 = jSONObject.toString();
                SharedPreferences.Editor edit = ((SharedPreferences) rr41Var.b).edit();
                edit.putString(h, jSONObject8);
                edit.apply();
                mj31 mj31Var = (mj31) cr71Var.w;
                fe81 fe81Var = (fe81) cr71Var.b;
                pf71 pf71Var = (pf71) mj31Var.b;
                nl61 nl61Var = fe81Var.e;
                h571 h571Var = fe81Var.d;
                hn71 a2 = nl61Var != null ? pf71Var.a(nl61Var) : new hn71(3, (HashMap) (0 == true ? 1 : 0));
                nl61 nl61Var2 = fe81Var.e;
                if (nl61Var2 != null) {
                    fga1.a(a2, pf71Var.a(nl61Var2));
                }
                a2.r(fe81Var.c.a, "ad_unit_id");
                pi71 pi71Var = (pi71) mj31Var.w;
                int i4 = fe81Var.n;
                pi71Var.getClass();
                a2.r(i4 != 1 ? i4 != 2 ? StringUtils.UNDEFINED : "landscape" : "portrait", "orientation");
                a271 a271Var = h571Var.a;
                a2.j((a271Var == null || (cy2Var = ((jd81) a271Var).a) == null) ? null : cy2Var.b, "size_type");
                a271 a271Var2 = h571Var.a;
                a2.j(a271Var2 != null ? Integer.valueOf(((jd81) a271Var2).b) : null, "size_info_width");
                a271 a271Var3 = h571Var.a;
                a2.j(a271Var3 != null ? Integer.valueOf(((jd81) a271Var3).c) : null, "size_info_height");
                a2.r(Integer.valueOf(w191Var.a), "view_width");
                a2.r(Integer.valueOf(i2), "view_height");
                a2.j(num, "layout_width");
                a2.j(num2, "layout_height");
                a2.r(Integer.valueOf(b471Var.a), "measured_width");
                a2.r(fi1Var.name().toLowerCase(locale), "measured_width_mode");
                a2.r(Integer.valueOf(i3), "measured_height");
                a2.r(fi1Var2.name().toLowerCase(locale), "measured_height_mode");
                ((ge71) mj31Var.c).c(new zj71("ad_view_size_info", new LinkedHashMap((Map) a2.b), (no61) a2.c));
                return;
        }
    }

    public /* synthetic */ nk61(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.b = obj;
        this.w = str;
        this.c = obj2;
    }
}
