package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.yandex.alicekit.core.json.schema.HtmlString;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.t;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.superapp.web.modal.WebModalView;
import com.yandex.go.superapp.web.modal.m;
import com.yandex.go.superapp.web.modal.n;
import com.yandex.go.taxi.order.details.v1.elements.driver.d;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.internal.v;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes5.dex */
public final class apf implements xy4, cnf0, tvg, izn, wni, jg5, xog, d4x, sps0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r2.length() < 1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public apf(JSONObject jSONObject) {
        HtmlString htmlString;
        this.a = 24;
        quz quzVar = quz.c;
        this.b = new x3k(b4x.b("action", jSONObject), quzVar);
        this.c = new qv4(b4x.b("icon", jSONObject));
        String str = null;
        try {
            htmlString = b4x.l("text", jSONObject);
            if (htmlString != null) {
            }
        } catch (JSONException e) {
            quzVar.e(e);
        }
        this.w = htmlString;
        try {
            str = b4x.m("text_style", jSONObject);
        } catch (JSONException e2) {
            quzVar.e(e2);
        }
        if (!"text_s".equals(str)) {
            this.x = "text_s";
            return;
        }
        if ("text_m".equals(str)) {
            this.x = "text_m";
            return;
        }
        if ("text_m_medium".equals(str)) {
            this.x = "text_m_medium";
            return;
        }
        if ("text_l".equals(str)) {
            this.x = "text_l";
            return;
        }
        if ("title_s".equals(str)) {
            this.x = "title_s";
            return;
        }
        if ("title_m".equals(str)) {
            this.x = "title_m";
            return;
        }
        if ("title_l".equals(str)) {
            this.x = "title_l";
            return;
        }
        if ("numbers_s".equals(str)) {
            this.x = "numbers_s";
            return;
        }
        if ("numbers_m".equals(str)) {
            this.x = "numbers_m";
            return;
        }
        if ("numbers_l".equals(str)) {
            this.x = "numbers_l";
            return;
        }
        if ("card_header".equals(str)) {
            this.x = "card_header";
            return;
        } else if ("button".equals(str)) {
            this.x = "button";
            return;
        } else {
            this.x = "text_m";
            return;
        }
        htmlString = null;
        this.w = htmlString;
        str = b4x.m("text_style", jSONObject);
        if (!"text_s".equals(str)) {
        }
    }

    public static apf h(bwy bwyVar, xvf0 xvf0Var, l180 l180Var, lf lfVar) {
        return new apf(bwyVar, xvf0Var, l180Var, lfVar, 26);
    }

    public static f64 i(apf apfVar, int i, int i2, int i3) {
        return new f64(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
    }

    public static boolean r(tdj tdjVar, Class cls, Predicate predicate) {
        Object obj = tdjVar.i;
        Object cast = (obj == null || !cls.isAssignableFrom(obj.getClass())) ? null : cls.cast(obj);
        if (cast == null) {
            return false;
        }
        return predicate.test(cast);
    }

    public void A(naj najVar, boolean z) {
        FlexAdapter flexAdapter;
        sh5 stateManager;
        List list = najVar.h;
        List list2 = list;
        if (list2 == null || list2.isEmpty() || (flexAdapter = (FlexAdapter) this.c) == null || (stateManager = flexAdapter.getStateManager()) == null) {
            return;
        }
        bia1.j(stateManager, list, Boolean.valueOf(z));
    }

    public WebModalView B() {
        c0g c0gVar = (c0g) ((i6r) this.b);
        h hVar = (h) c0gVar.fl.get();
        q5z.h(hVar);
        sh41 sh41Var = (sh41) c0gVar.z.Y.get();
        q5z.h(sh41Var);
        MainActivity mainActivity = c0gVar.w;
        fvt fvtVar = (fvt) c0gVar.z.Z8.get();
        q5z.h(fvtVar);
        return new WebModalView(hVar, sh41Var, new m(mainActivity, fvtVar, (i7w0) this.c, (ma41) this.w), new n(t()), t(), new fl10((c) c0gVar.z.Y0.get()), (uh41) this.x);
    }

    @Override // defpackage.ww4
    public d6v0 I0() {
        d6v0 I0 = ((c0g) ((i6r) this.b)).I0();
        q5z.h(I0);
        return I0;
    }

    @Override // defpackage.ww4
    public e8v0 L() {
        return ((c0g) ((i6r) this.b)).L();
    }

    @Override // defpackage.ww4
    public Activity N() {
        return ((c0g) ((i6r) this.b)).w;
    }

    @Override // defpackage.ww4
    public ru.yandex.taxi.widget.c b() {
        ru.yandex.taxi.widget.c b = ((c0g) ((i6r) this.b)).b();
        q5z.h(b);
        return b;
    }

    @Override // defpackage.ww4
    public zuj0 c() {
        zuj0 c = ((c0g) ((i6r) this.b)).c();
        q5z.h(c);
        return c;
    }

    @Override // defpackage.ww4
    public ney d() {
        ney d = ((c0g) ((i6r) this.b)).d();
        q5z.h(d);
        return d;
    }

    @Override // defpackage.ww4
    public pav e() {
        pav e = ((c0g) ((i6r) this.b)).e();
        q5z.h(e);
        return e;
    }

    public void f() {
        this.w = null;
        this.x = (qdj) ((zxf0) pwf0.c(qdj.class));
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        l((tdj) arrayDeque.remove());
    }

    @Override // defpackage.xog
    public e1k g(h3t0 h3t0Var, zog zogVar) {
        uds0 c = ((v) ((q0k) this.x).e.get()).c(zy11.a, new p0k(this, zogVar, 0));
        this.c = c;
        if (((uds0) this.w) != null) {
            c.close();
            this.c = null;
        }
        return new wj3(2, this);
    }

    public cag j() {
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar = new ddf(RoutePointType.POINT_A);
        r51 r51Var = new r51(SourcePicker.SOURCE_FROM_DELIVERY);
        tjt0 tjt0Var = (tjt0) this.b;
        return fh4.c(r51Var, ddfVar, m3o.b, tjt0Var.a, new aye0(20, (y9y0) this.w), ujt0Var);
    }

    public void k() {
        if (((tdj) this.w) == null) {
            jst.e.x(new IllegalStateException("Nothing to dismiss"), "DialogQueue error");
        } else {
            ((qdj) this.x).dismiss();
        }
    }

    public void l(tdj tdjVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((tdj) this.w) != null) {
            arrayDeque.add(tdjVar);
            return;
        }
        this.w = tdjVar;
        if (tdjVar == null) {
            return;
        }
        Activity activity = ((lit) this.b).getActivity();
        if (activity == null) {
            this.x = new tej(0, this);
            return;
        }
        qdj f = tdjVar.f.f(tdjVar, activity, new zch(this));
        if (f != null) {
            this.x = f;
        } else {
            arrayDeque.addFirst(tdjVar);
            this.x = (qdj) ((zxf0) pwf0.c(qdj.class));
        }
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        int i = 0;
        switch (this.a) {
            case 9:
                ComposeView composeView = new ComposeView((Context) this.b, null, 0, 6, null);
                composeView.setContent(new a(1480507961, new cxh(this, i), true));
                return composeView;
            case 10:
                ComposeView composeView2 = new ComposeView((Context) this.b, null, 0, 6, null);
                composeView2.setContent(new a(-1545942543, new g2i(this, (h2i) uniVar, (z1i) vniVar, i), true));
                return composeView2;
            default:
                ComposeView composeView3 = new ComposeView((Context) this.b, null, 0, 6, null);
                composeView3.setContent(new a(317452778, new ttj(this, i), true));
                return composeView3;
        }
    }

    public boolean n(tdj tdjVar, uej uejVar) {
        if (q(uejVar.getClass(), uejVar)) {
            return false;
        }
        tdjVar.i = uejVar;
        l(tdjVar);
        return true;
    }

    @Override // defpackage.izn
    public mzn o(int i) {
        return p(i);
    }

    public mzn p(int i) {
        int i2;
        Object obj;
        int i3;
        f64 i4;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.x;
        if (linkedHashMap.containsKey(Integer.valueOf(i))) {
            return (mzn) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = ((List) this.c).iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = i;
                obj = null;
                break;
            }
            obj = it.next();
            i2 = i;
            if (((kgg0) obj).e() == i2) {
                break;
            }
        }
        kgg0 kgg0Var = obj instanceof kgg0 ? (kgg0) obj : null;
        if (kgg0Var != null) {
            for (Size size : kgg0Var.d()) {
                if (((List) ((i3y) this.w).getValue()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (kgg0Var.equals(kgg0.d)) {
                        i3 = 40000000;
                    } else if (kgg0Var.equals(kgg0.c)) {
                        i3 = 10000000;
                    } else if (kgg0Var.equals(kgg0.b)) {
                        i3 = 4000000;
                    } else {
                        if (!kgg0Var.equals(kgg0.a)) {
                            kbs.f(kgg0Var, "Undefined bitrate for quality: ");
                            return null;
                        }
                        i3 = 2000000;
                    }
                    i4 = i(this, width, height, i3);
                    rl31 a = sl31.a(i4.b);
                    if (a != null && a.M1(width, height)) {
                        Integer num = (Integer) a.Q2().clamp(Integer.valueOf(i3));
                        if (num == null || num.intValue() != i3) {
                            i4 = i(this, width, height, num.intValue());
                        }
                    } else {
                        i4 = null;
                    }
                    if (i4 != null) {
                        break;
                    }
                }
            }
        }
        i4 = null;
        e64 e = i4 != null ? kzn.e(60, 2, Collections.singletonList(new d64(3, 96000, 44100, 1, 2, "audio/mp4a-latm")), Collections.singletonList(i4)) : null;
        linkedHashMap.put(Integer.valueOf(i2), e);
        return e;
    }

    public boolean q(Class cls, Predicate predicate) {
        tdj tdjVar = (tdj) this.w;
        if (tdjVar == null ? false : r(tdjVar, cls, predicate)) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (r((tdj) it.next(), cls, predicate)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.izn
    public boolean s(int i) {
        return p(i) != null;
    }

    public com.yandex.go.superapp.web.domain.a t() {
        c0g c0gVar = (c0g) ((i6r) this.b);
        tt2 k = c0gVar.k();
        q5z.h(k);
        fxf0 fxf0Var = (fxf0) c0gVar.z.Jh.get();
        q5z.h(fxf0Var);
        bpt bptVar = (bpt) c0gVar.z.v3.get();
        q5z.h(bptVar);
        return new com.yandex.go.superapp.web.domain.a(k, fxf0Var, bptVar);
    }

    public String toString() {
        switch (this.a) {
            case 24:
                tjz0 tjz0Var = new tjz0();
                tjz0Var.a((x3k) this.b, "action");
                tjz0Var.a((qv4) this.c, "icon");
                tjz0Var.a((HtmlString) this.w, "text");
                tjz0Var.a((String) this.x, "textStyle");
                return tjz0Var.a.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        List list = ((hal) this.b).u;
        if (list == null) {
            return;
        }
        com.yandex.div.core.c.c(((t) this.c).z, (Div2View) this.w, (rvo) this.x, list, "release");
    }

    public void v() {
        List list = ((hal) this.b).v;
        if (list == null) {
            return;
        }
        com.yandex.div.core.c.c(((t) this.c).z, (Div2View) this.w, (rvo) this.x, list, "press");
    }

    public void w(int i, String str) {
        TaxiOrder b = ((o2y0) this.w).b();
        Set set = b.l.Q;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (jl40.l((String) it.next(), str)) {
                    return;
                }
            }
        }
        qnh qnhVar = (qnh) this.x;
        String lowerCase = "ORDER_DETAILS".toLowerCase(Locale.ROOT);
        ((x770) qnhVar.a).a.a("ShortcutsOrderCard.Shown", g8e.u("id", str, MetaDataField.SCREEN_FIELD, lowerCase), 1, new HashMap());
        v7j v7jVar = (v7j) this.b;
        int i2 = v7jVar.a.i("pref_shown_count" + str, 0) + 1;
        v7jVar.a.p(i2, "pref_shown_count" + str);
        synchronized (b) {
            TaxiOrderLocalData taxiOrderLocalData = b.l;
            b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, v4r0.i(taxiOrderLocalData.Q, str), null, null, null, null, null, false, null, false, null, null, null, -1, 16776191);
        }
        if (qv10.d("pref_shown_count", str, ((v7j) this.b).a, 0) > i) {
            ((y7j) this.c).a.l(c8j.a);
        }
    }

    public void x(DeliveryFormStepType deliveryFormStepType, tls tlsVar) {
        String str;
        w3j0 w3j0Var = (w3j0) tlsVar.invoke(((j) ((lx4) this.c)).d("DeliveryPhoneList.Closed"));
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = "destination";
        }
        w3j0Var.a.put("open_reason", str);
        pex0 m = ((k) ((wiq0) this.b)).m();
        w3j0Var.a.put(ClidProvider.STATE, m != null ? m.b : null);
        w3j0Var.m();
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        if (ig5Var instanceof naj) {
            FragmentActivity fragmentActivity = (FragmentActivity) ((rbs) this.w).a();
            if (fragmentActivity != null) {
                naj najVar = (naj) ig5Var;
                ((oaj) this.x).a(fragmentActivity, najVar.a, najVar.b, najVar.c, najVar.d, new j9a(24, this, ig5Var, jh5Var));
            } else {
                naj najVar2 = (naj) ig5Var;
                A(najVar2, false);
                vm50 vm50Var = najVar2.f;
                if (vm50Var != null) {
                    jh5Var.a.dispatch(vm50Var);
                }
            }
        }
    }

    public void z(xxc xxcVar) {
        boolean a = ((drd) this.b).a();
        i iVar = (i) this.w;
        if (a) {
            iVar.i(xxcVar, null, false);
            return;
        }
        iVar.getClass();
        if (xxcVar.a()) {
            return;
        }
        iVar.i(xxcVar, null, true);
    }

    public /* synthetic */ apf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public apf(lit litVar) {
        this.a = 21;
        this.b = litVar;
        this.c = new ArrayDeque();
        this.x = (qdj) ((zxf0) pwf0.c(qdj.class));
    }

    public apf(lp00 lp00Var, ru.yandex.taxi.map_common.map.utils.a aVar, ah00 ah00Var) {
        this.a = 14;
        this.b = lp00Var;
        this.c = aVar;
        this.w = ah00Var;
        this.x = new LinkedHashSet();
    }

    public apf(gs70 gs70Var, p5j p5jVar, d dVar, p4j p4jVar, d58 d58Var) {
        this.a = 18;
        this.b = p5jVar;
        this.c = dVar;
        this.w = p4jVar;
        this.x = d58Var;
    }

    public apf(el11 el11Var, Context context, String str) {
        this.a = 6;
        this.b = context;
        this.c = str;
        this.w = kotlin.a.a(new ybf(16, el11Var));
        this.x = context.getCacheDir();
    }

    public apf(ar7 ar7Var, List list) {
        this.a = 7;
        this.b = ar7Var;
        this.c = list;
        this.w = kotlin.a.a(new ybf(26, this));
        this.x = new LinkedHashMap();
    }

    public apf(i6r i6rVar, uh41 uh41Var, i7w0 i7w0Var, ma41 ma41Var) {
        this.a = 4;
        this.b = i6rVar;
        this.c = i7w0Var;
        this.w = ma41Var;
        this.x = uh41Var;
    }

    public apf(dnf0 dnf0Var, umf0 umf0Var, ity ityVar, v770 v770Var) {
        this.a = 3;
        this.b = dnf0Var;
        this.c = umf0Var;
        this.w = v770Var;
        this.x = ityVar;
    }

    public apf(p1b p1bVar, i6r i6rVar, w4l0 w4l0Var) {
        this.a = 1;
        this.b = i6rVar;
        this.c = p1bVar;
        this.w = w4l0Var;
        this.x = dhs0.a(new e4f(new rxf(i6rVar, 19), 9));
    }

    public apf(q0k q0kVar, String str) {
        this.a = 23;
        this.x = q0kVar;
        this.c = null;
        this.w = null;
        this.b = str;
    }
}
