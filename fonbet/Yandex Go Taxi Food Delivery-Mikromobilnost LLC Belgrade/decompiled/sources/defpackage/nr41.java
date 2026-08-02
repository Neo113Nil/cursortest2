package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.banner.BannerAdView;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.params.OmacTransportInterface;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.be2;
import yads.f5;
import yads.jk3;
import yads.t92;
import yads.tl0;
import yads.w4;
import yads.x92;
import yads.xz;

/* loaded from: classes7.dex */
public class nr41 implements u690, hw71, OmacTransportInterface, ri81, q481, fo71, g291, cv81 {
    public final /* synthetic */ int a;
    public final Object b;

    public nr41(Context context, ge71 ge71Var, lm71 lm71Var, int i) {
        this.a = 17;
        this.b = new vi71(context, ge71Var, (i & 4) != 0 ? new lm71(context, ge71Var) : lm71Var);
    }

    private final void i(w4 w4Var) {
    }

    private final void l() {
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        a441 a441Var = (a441) this.b;
        List list = ((j671) obj).a.b;
        mj31 mj31Var = (mj31) a441Var.c;
        zy2 zy2Var = ((vi61) mj31Var.b).a.F;
        if (zy2Var != null) {
            if (!zy2Var.b) {
                ((u371) mj31Var.c).getClass();
                list = (List) u371.a(list).b;
            }
            if (!zy2Var.a) {
                list = a.A0(list, 1);
            }
            hlx0 hlx0Var = (hlx0) mj31Var.w;
            hlx0Var.getClass();
            bs81 bs81Var = (bs81) hlx0Var.b;
            int i = 10;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bs81 bs81Var2 = (bs81) it.next();
                ArrayList arrayList2 = ((vi61) hlx0Var.c).a.b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ycc.r(((k781) it2.next()).w, arrayList3);
                }
                ArrayList arrayList4 = bs81Var2.b;
                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, i));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    k781 k781Var = (k781) it3.next();
                    ArrayList arrayList6 = k781Var.c;
                    ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, i));
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(((gk81) it4.next()).a);
                    }
                    Set M0 = a.M0(arrayList7);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ycc.r(((k781) it5.next()).c, arrayList8);
                    }
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        if (M0.add(((gk81) next).a)) {
                            arrayList9.add(next);
                        }
                    }
                    ArrayList arrayList10 = k781Var.w;
                    ArrayList m0 = a.m0(k781Var.b, k781Var.a);
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it7 = it;
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = arrayList2;
                    String str = k781Var.A;
                    arrayList11.addAll(m0);
                    arrayList12.addAll(k781Var.c);
                    arrayList13.addAll(arrayList3);
                    String str2 = k781Var.y;
                    mf1 mf1Var = k781Var.z;
                    int i2 = k781Var.B;
                    arrayList12.addAll(arrayList9);
                    arrayList13.addAll(arrayList10);
                    String str3 = k781Var.C;
                    ArrayList arrayList15 = new ArrayList();
                    Iterator it8 = arrayList11.iterator();
                    while (it8.hasNext()) {
                        ArrayList arrayList16 = arrayList13;
                        Object next2 = it8.next();
                        String str4 = str3;
                        if (next2 instanceof na71) {
                            arrayList15.add(next2);
                        }
                        arrayList13 = arrayList16;
                        str3 = str4;
                    }
                    ArrayList arrayList17 = arrayList13;
                    String str5 = str3;
                    ArrayList arrayList18 = new ArrayList();
                    Iterator it9 = arrayList11.iterator();
                    while (it9.hasNext()) {
                        Object next3 = it9.next();
                        if (next3 instanceof bs71) {
                            arrayList18.add(next3);
                        }
                    }
                    arrayList5.add(new k781(arrayList15, arrayList18, arrayList12, arrayList17, null, str2, mf1Var, str, i2, str5));
                    it = it7;
                    arrayList2 = arrayList14;
                    i = 10;
                }
                Iterator it10 = it;
                ((ym61) hlx0Var.w).getClass();
                uc71 uc71Var = bs81Var2.w;
                uc71 uc71Var2 = bs81Var.w;
                uc71 uc71Var3 = new uc71(a.m0(uc71Var2.a, uc71Var.a), a.m0(uc71Var2.b, uc71Var.b));
                ((g171) hlx0Var.x).getClass();
                List g = scc.g(bs81Var2, bs81Var);
                ArrayList arrayList19 = new ArrayList();
                Iterator it11 = g.iterator();
                while (it11.hasNext()) {
                    bw71 bw71Var = ((bs81) it11.next()).C;
                    Iterable iterable = bw71Var != null ? bw71Var.a : null;
                    if (iterable == null) {
                        iterable = EmptyList.a;
                    }
                    ycc.r(iterable, arrayList19);
                }
                bw71 bw71Var2 = new bw71(arrayList19);
                LinkedHashMap linkedHashMap = bs81Var2.c;
                LinkedHashMap linkedHashMap2 = bs81Var.c;
                ArrayList m02 = a.m0(bs81Var.G, bs81Var2.G);
                qo81 qo81Var = new qo81((Context) hlx0Var.y, bs81Var2.a);
                qo81Var.k = bs81Var2.E;
                qo81Var.l.addAll(arrayList5);
                qo81Var.b(linkedHashMap);
                qo81Var.d = bs81Var2.x;
                qo81Var.e = bs81Var2.y;
                qo81Var.f = bs81Var2.z;
                qo81Var.g = bs81Var2.A;
                qo81Var.h = bs81Var2.B;
                qo81Var.o = uc71Var3;
                qo81Var.i = bw71Var2;
                qo81Var.c = bs81Var2.F;
                qo81Var.b(linkedHashMap2);
                qo81Var.m.addAll(m02);
                arrayList.add(qo81Var.a());
                it = it10;
                i = 10;
            }
            list = arrayList;
        }
        cf71 cf71Var = (cf71) a441Var.b;
        cf71Var.getClass();
        s1n s1nVar = (s1n) cf71Var.c;
        s1nVar.a--;
        ((ArrayList) s1nVar.w).addAll(list);
        mj31 mj31Var2 = (mj31) s1nVar.x;
        if (s1nVar.a != 0 || mj31Var2 == null) {
            return;
        }
        e971 e971Var = (e971) s1nVar.b;
        e971Var.c(f5.x, e971Var.b, (List) cf71Var.b);
        mj31Var2.z((ArrayList) s1nVar.w);
    }

    @Override // defpackage.q481
    public void b(dl61 dl61Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                xrr xrrVar = (xrr) obj;
                if (!xrrVar.b) {
                    ((bt81) xrrVar.c).h(dl61Var);
                    break;
                }
                break;
            default:
                du71 du71Var = (du71) obj;
                du71Var.b.a(f5.e);
                du71Var.h(dl61Var);
                break;
        }
    }

    @Override // defpackage.q481
    public void c(hk61 hk61Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                xrr xrrVar = (xrr) obj;
                if (!xrrVar.b) {
                    bt81 bt81Var = (bt81) xrrVar.c;
                    o9a1.d(bt81Var.c.a.b);
                    bt81Var.n();
                    bt81Var.m();
                    break;
                }
                break;
            default:
                du71 du71Var = (du71) obj;
                du71Var.n();
                s421 s421Var = du71Var.Q;
                s421Var.getClass();
                tq81 tq81Var = xz.c;
                o9a1.d("native");
                ((xrr) s421Var.w).a();
                ((Handler) s421Var.c).post(new bo31(17, s421Var, hk61Var));
                break;
        }
    }

    @Override // defpackage.hw71
    public ct71 d(Context context, j471 j471Var, bq71 bq71Var) {
        return new oj61(context, j471Var, bq71Var, (v981) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 22:
                j471 j471Var = (j471) obj;
                kf81 kf81Var = j471Var.c0;
                BannerAdView bannerAdView = j471Var.U;
                kf81Var.getClass();
                View findViewWithTag = bannerAdView.findViewWithTag("rootDivkitView");
                Div2View div2View = findViewWithTag instanceof Div2View ? (Div2View) findViewWithTag : null;
                if (div2View != null) {
                    div2View.setVariable("is_banner_closed", "closed");
                }
                mj31 mj31Var = j471Var.V;
                ((Handler) mj31Var.b).post(new z071(mj31Var, i2));
                break;
            case 26:
                ((nr41) obj).e();
                break;
            default:
                j681 j681Var = (j681) obj;
                if (!j681Var.g) {
                    j681Var.b.getClass();
                    if (!j681Var.f || j681Var.g) {
                        try {
                            j681Var.c();
                        } catch (Exception unused) {
                        }
                    }
                    if (j681Var.f && !j681Var.g) {
                        if (!j681Var.i) {
                            o971 o971Var = j681Var.e;
                            vj61.a.b((WebView) o971Var.b.get(), "publishImpressionEvent", o971Var.a);
                            j681Var.i = true;
                            break;
                        } else {
                            ny61.r("Impression event can only be sent once");
                            break;
                        }
                    }
                } else {
                    ny61.r("AdSession is finished");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(tis0 tis0Var) {
        boolean z = tis0Var.b;
        j681 j681Var = (j681) this.b;
        zka1.a(j681Var);
        j681Var.b.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", z);
            if (z) {
                jSONObject.put("skipOffset", (Float) tis0Var.c);
            }
            jSONObject.put("autoPlay", true);
            jSONObject.put("position", (be2) tis0Var.w);
        } catch (JSONException e) {
            Log.e("OMIDLIB", "VastProperties: JSON error", e);
        }
        if (j681Var.j) {
            ny61.r("Loaded event can only be sent once");
            return;
        }
        o971 o971Var = j681Var.e;
        vj61.a.b((WebView) o971Var.b.get(), "publishLoadedEvent", jSONObject, o971Var.a);
        j681Var.j = true;
    }

    public void g(String str) {
        t92 t92Var = (t92) this.b;
        t92Var.loadDataWithBaseURL("https://yandex.ru", t92Var.a(str), "text/html", "UTF-8", null);
    }

    @Override // ru.CryptoPro.JCP.params.OmacTransportInterface
    public byte[] getOmac() {
        vc3 c;
        n3 n3Var;
        l87 l87Var = (l87) this.b;
        if (l87Var.x == null && l87Var.y) {
            tis0 tis0Var = l87Var.w;
            if (((a2) tis0Var.w) == null) {
                tis0Var.w = ((j3) tis0Var.c).readObject();
            }
            a2 a2Var = (a2) tis0Var.w;
            if (a2Var != null) {
                t3 t3Var = (t3) a2Var;
                tis0Var.w = null;
                z3.a(t3Var, 1);
                n3Var = (n3) t3Var.j(17);
            } else {
                n3Var = null;
            }
            l87Var.y = false;
            if (n3Var != null) {
                c2 c2Var = new c2();
                while (true) {
                    a2 readObject = n3Var.readObject();
                    if (readObject == null) {
                        break;
                    }
                    c2Var.a(((j3) readObject).toASN1Primitive());
                }
                l87Var.x = new xc3(new lqf(c2Var));
            }
        }
        xc3 xc3Var = l87Var.x;
        if (xc3Var == null || (c = xc3Var.c(new u2("1.2.643.7.1.0.6.1.1"))) == null) {
            return null;
        }
        return ((dqf) c.b.a[0]).a;
    }

    public boolean h() {
        View d = ((yp61) ((i971) this.b).b).d();
        return (d == null || sj71.e(d) || sj71.a.a(d).a < 1) ? false : true;
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        if (jk3Var instanceof tl0) {
            String message = ((tl0) jk3Var).getMessage();
            if (message == null) {
                message = "Ad request completed successfully, but there are no ads available.";
            }
            new vuz(message);
        } else if (jk3Var instanceof x92) {
            new vuz("Internal error. Failed to parse response");
        } else {
            gb81 gb81Var = jk3Var.b;
            if (gb81Var == null) {
                String message2 = jk3Var.getMessage();
                if (message2 == null) {
                    message2 = "Ad request failed with network error";
                }
                new vuz(message2);
            } else {
                int i = gb81Var.a;
                if (i >= 500) {
                    new vuz("Server temporarily unavailable. Please, try again later.");
                } else {
                    new vuz(g8e.p(oyr.j(i, "Network Error.  Code: ", Extension.DOT_CHAR), " Data: \n", new String(gb81Var.b, uza.a)));
                }
            }
        }
        cf71 cf71Var = (cf71) ((a441) this.b).b;
        s1n s1nVar = (s1n) cf71Var.c;
        int i2 = s1nVar.a - 1;
        s1nVar.a = i2;
        mj31 mj31Var = (mj31) s1nVar.x;
        if (i2 != 0 || mj31Var == null) {
            return;
        }
        e971 e971Var = (e971) s1nVar.b;
        e971Var.c(f5.x, e971Var.b, (List) cf71Var.b);
        mj31Var.z((ArrayList) s1nVar.w);
    }

    public void k() {
        switch (this.a) {
            case 22:
                break;
            default:
                ((nr41) this.b).k();
                break;
        }
    }

    public void m() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 22:
                mj31 mj31Var = ((j471) obj).V;
                ((Handler) mj31Var.b).post(new z071(mj31Var, 2));
                break;
            default:
                ((nr41) obj).m();
                break;
        }
    }

    @Override // defpackage.fo71
    public void n(ArrayList arrayList) {
        du71 du71Var = (du71) this.b;
        du71Var.n();
        s421 s421Var = du71Var.Q;
        s421Var.getClass();
        tq81 tq81Var = xz.c;
        o9a1.d("native");
        ((xrr) s421Var.w).a();
        ((Handler) s421Var.c).post(new eg61(s421Var, arrayList, 0));
    }

    @Override // defpackage.fo71
    public void o(mw81 mw81Var) {
        du71 du71Var = (du71) this.b;
        du71Var.n();
        s421 s421Var = du71Var.Q;
        s421Var.getClass();
        tq81 tq81Var = xz.c;
        o9a1.d("native");
        ((xrr) s421Var.w).a();
        ((Handler) s421Var.c).post(new eg61(s421Var, mw81Var, 1));
    }

    public void p() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 22:
                mj31 mj31Var = ((j471) obj).V;
                ((Handler) mj31Var.b).post(new z071(mj31Var, 3));
                break;
            default:
                ((nr41) obj).p();
                break;
        }
    }

    public void q(LinkedHashMap linkedHashMap) {
        IReporter reporter = AppMetrica.getReporter((Context) ((mj31) this.b).b, "35dc0bfc-990e-4681-ad03-2b200fa7a485");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            reporter.putAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // defpackage.cv81
    public void v(ViewGroup viewGroup) {
        for (cv81 cv81Var : (cv81[]) this.b) {
            cv81Var.v(viewGroup);
        }
    }

    public nr41(Context context, e971 e971Var, i971 i971Var, wo71 wo71Var, v981 v981Var, fe81 fe81Var) {
        this.a = 18;
        this.b = new s421(context, e971Var, i971Var, wo71Var, v981Var, fe81Var);
    }

    public /* synthetic */ nr41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public nr41(Context context, hn71 hn71Var) {
        this.a = 23;
        this.b = new cf71((Object) context, (Object) hn71Var, false, 13);
    }

    public nr41(ge71 ge71Var) {
        this.a = 20;
        this.b = new cf71(ge71Var);
    }

    public nr41(t92 t92Var) {
        this.a = 21;
        this.b = t92Var;
        t92Var.setId(2);
    }

    public nr41(boolean z) {
        this.a = 9;
        this.b = z ? new by61() : new f581();
    }

    @Override // defpackage.cv81
    public void c() {
        for (cv81 cv81Var : (cv81[]) this.b) {
            cv81Var.c();
        }
    }

    @Override // defpackage.ri81
    public Map a() {
        List list = ((bs81) this.b).w.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((tz61) obj).a;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = qv10.w(str, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((tz61) it.next()).b);
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }

    public ArrayList a(JSONObject jSONObject, zy2 zy2Var) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            boolean z = jSONObject2.getBoolean("required");
            try {
                arrayList.add(((vi71) this.b).d(jSONObject2, zy2Var));
            } catch (Throwable th) {
                if (z) {
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
