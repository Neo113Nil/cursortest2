package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import core.flex.ui.contentaware.ContentAwareFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.r0;
import org.xmlpull.v1.XmlPullParser;
import ru.CryptoPro.XAdES.cl_63;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.order.analytics.model.WidgetType;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import yads.f1;
import yads.f5;
import yads.f9;
import yads.jk3;
import yads.kc1;
import yads.ly;
import yads.tp0;
import yads.w4;
import yads.xz;

/* loaded from: classes7.dex */
public final class hlx0 implements e2v0, fh81, g291, bj81 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;
    public Object y;

    public hlx0(Context context, Div2Context div2Context, l3k l3kVar) {
        this.a = 6;
        int i = nih0.flexsdk_divkit_scaffold_top_view_id;
        Div2View a = l3kVar.a(div2Context, new FrameLayout.LayoutParams(-1, -2, 49));
        a.setId(i);
        this.c = a;
        int i2 = nih0.flexsdk_divkit_scaffold_bottom_view_id;
        Div2View a2 = l3kVar.a(div2Context, new FrameLayout.LayoutParams(-1, -2, 81));
        a2.setId(i2);
        this.w = a2;
        int i3 = nih0.flexsdk_divkit_scaffold_overlay_view_id;
        Div2View a3 = l3kVar.a(div2Context, new FrameLayout.LayoutParams(-1, -1, 17));
        a3.setId(i3);
        this.x = a3;
        ContentAwareFrameLayout contentAwareFrameLayout = new ContentAwareFrameLayout(context, null, 0, 6, null);
        contentAwareFrameLayout.setId(View.generateViewId());
        contentAwareFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.y = contentAwareFrameLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(nih0.flexsdk_divkit_scaffold_container_id);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ContentAwareFrameLayout contentAwareFrameLayout2 = (ContentAwareFrameLayout) this.y;
        if (contentAwareFrameLayout2 != null) {
            frameLayout.addView(contentAwareFrameLayout2);
        }
        Div2View div2View = (Div2View) this.c;
        if (div2View != null) {
            frameLayout.addView(div2View);
        }
        Div2View div2View2 = (Div2View) this.w;
        if (div2View2 != null) {
            frameLayout.addView(div2View2);
        }
        Div2View div2View3 = (Div2View) this.x;
        if (div2View3 != null) {
            frameLayout.addView(div2View3);
        }
        this.b = frameLayout;
    }

    public void A(String str, Map map) {
        i d = ((j) ((lx4) this.c)).d(str);
        d.a.putAll(map);
        d.m();
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        HashSet hashSet;
        gg81 gg81Var = (gg81) obj;
        p171 p171Var = (p171) this.b;
        Context context = (Context) this.x;
        p171Var.getClass();
        synchronized (p171.b) {
            hashSet = new HashSet(p171Var.a.keySet());
            a081 f = dha1.f();
            synchronized (a081.f) {
                f.a = gg81Var;
                bu71.a(context).a(gg81Var);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            um81 um81Var = (um81) it.next();
            um81Var.a.a.getClass();
            boolean z = !fw81.b(context);
            rr41 rr41Var = um81Var.b;
            if (((gg71) rr41Var.b).b()) {
                try {
                    ((os71) rr41Var.c).A(new w7o(z));
                } catch (Throwable unused) {
                }
            }
        }
        ((e971) this.w).a(f5.m);
        kde kdeVar = (kde) this.c;
        ly lyVar = (ly) this.y;
        if (kdeVar.b.t() instanceof mf60) {
            kdeVar.b.resumeWith(new vw71(gg81Var, lyVar));
        }
    }

    @Override // defpackage.fh81
    public long b(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // defpackage.e2v0
    public long c(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // defpackage.fh81
    public List d(long j) {
        do81 do81Var = (do81) this.b;
        Map map = (Map) this.w;
        HashMap hashMap = (HashMap) this.x;
        HashMap hashMap2 = (HashMap) this.y;
        ArrayList arrayList = new ArrayList();
        do81Var.d(j, do81Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        do81Var.f(j, false, do81Var.h, treeMap);
        do81Var.e(j, map, hashMap, do81Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                qr81 qr81Var = (qr81) hashMap.get(pair.first);
                qr81Var.getClass();
                arrayList2.add(new r871(null, null, null, decodeByteArray, qr81Var.c, 0, qr81Var.e, qr81Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, qr81Var.f, qr81Var.g, false, ModalContentViewContainer.BASE_SHADOW_COLOR, qr81Var.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            qr81 qr81Var2 = (qr81) hashMap.get(entry.getKey());
            qr81Var2.getClass();
            r571 r571Var = (r571) entry.getValue();
            CharSequence charSequence = r571Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (li81 li81Var : (li81[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), li81.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(li81Var), spannableStringBuilder.getSpanEnd(li81Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = qr81Var2.c;
            int i9 = qr81Var2.d;
            r571Var.d = f;
            r571Var.e = i9;
            r571Var.f = qr81Var2.e;
            r571Var.g = qr81Var2.b;
            r571Var.k = qr81Var2.f;
            float f2 = qr81Var2.i;
            int i10 = qr81Var2.h;
            r571Var.j = f2;
            r571Var.i = i10;
            r571Var.l = qr81Var2.j;
            arrayList2.add(r571Var.a());
        }
        return arrayList2;
    }

    public hn71 e() {
        nr41 nr41Var = (nr41) this.x;
        nr41Var.getClass();
        hn71 hn71Var = new hn71(b.f(), (no61) null);
        d881 d881Var = (d881) nr41Var.b;
        hn71Var.r(d881Var.k, "ad_source");
        hn71Var.r(d881Var.b, "ad_type_format");
        hn71Var.r(d881Var.e, "ad_unit_id");
        hn71Var.r(d881Var.d, "product_type");
        hn71Var.j(d881Var.n, "server_log_id");
        hn71Var.r(d881Var.a().a.b, "size_type");
        hn71Var.r(Integer.valueOf(d881Var.a().b), "width");
        hn71Var.r(Integer.valueOf(d881Var.a().c), "height");
        hn71Var.c = d881Var.i;
        hn71Var.r(((xz) this.b).b, "ad_type");
        hn71Var.j((String) this.c, "ad_id");
        ((eb71) this.w).getClass();
        ((Map) hn71Var.b).putAll(g8e.z("adapter", g771.a));
        uio0 uio0Var = (uio0) this.y;
        return uio0Var != null ? fga1.a(hn71Var, uio0Var.b()) : hn71Var;
    }

    public void f(XmlPullParser xmlPullParser, qo81 qo81Var, zy2 zy2Var) {
        LinkedHashMap linkedHashMap = qo81Var.n;
        xf81 xf81Var = (xf81) this.b;
        String name = xmlPullParser.getName();
        if ("Impression".equals(name)) {
            xf81Var.getClass();
            String a = xf81.a(xmlPullParser);
            Object obj = linkedHashMap.get("impression");
            if (obj == null) {
                obj = qv10.w("impression", linkedHashMap);
            }
            ((List) obj).add(a);
            return;
        }
        if ("ViewableImpression".equals(name)) {
            ((az71) this.x).getClass();
            qo81Var.i = az71.a(xmlPullParser);
            return;
        }
        if ("Error".equals(name)) {
            xf81Var.getClass();
            String a2 = xf81.a(xmlPullParser);
            Object obj2 = linkedHashMap.get("error");
            if (obj2 == null) {
                obj2 = qv10.w("error", linkedHashMap);
            }
            ((List) obj2).add(a2);
            return;
        }
        if ("Survey".equals(name)) {
            xf81Var.getClass();
            qo81Var.g = xf81.a(xmlPullParser);
            return;
        }
        if (cl_63.t.equals(name)) {
            xf81Var.getClass();
            qo81Var.f = xf81.a(xmlPullParser);
            return;
        }
        if ("AdTitle".equals(name)) {
            xf81Var.getClass();
            qo81Var.e = xf81.a(xmlPullParser);
            return;
        }
        if ("AdSystem".equals(name)) {
            xf81Var.getClass();
            qo81Var.d = xf81.a(xmlPullParser);
            return;
        }
        if ("Creatives".equals(name)) {
            qo81Var.l.addAll(((vi71) this.c).p(xmlPullParser, zy2Var));
            return;
        }
        if ("AdVerifications".equals(name)) {
            qo81Var.m.addAll(((vi71) this.w).p(xmlPullParser, zy2Var));
            return;
        }
        if (!"Extensions".equals(name)) {
            xf81Var.getClass();
            xf81.b(xmlPullParser);
            return;
        }
        yf71 yf71Var = (yf71) this.y;
        xf81 xf81Var2 = yf71Var.a;
        xf81Var2.getClass();
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            xf81Var2.getClass();
            if (xmlPullParser.next() == 3) {
                qo81Var.o = new uc71(a.J0(arrayList2), a.J0(arrayList));
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (yf71.d.contains(attributeValue)) {
                        yf71Var.b.getClass();
                        cj61 A = egz.A(xmlPullParser);
                        if (A != null) {
                            arrayList2.add(A);
                        }
                    } else if ("yandex_tracking_events".equals(attributeValue)) {
                        arrayList.addAll(yf71Var.c.p(xmlPullParser, zy2Var));
                    } else {
                        xf81.b(xmlPullParser);
                    }
                } else {
                    xf81.b(xmlPullParser);
                }
            }
        }
    }

    @Override // defpackage.e2v0
    public int g() {
        return ((long[]) this.c).length;
    }

    @Override // defpackage.e2v0
    public int h(long j) {
        long[] jArr = (long[]) this.c;
        int a = tw21.a(jArr, j, false);
        if (a < jArr.length) {
            return a;
        }
        return -1;
    }

    @Override // defpackage.e2v0
    public List i(long j) {
        mj11 mj11Var = (mj11) this.b;
        Map map = (Map) this.w;
        HashMap hashMap = (HashMap) this.x;
        HashMap hashMap2 = (HashMap) this.y;
        ArrayList arrayList = new ArrayList();
        mj11Var.g(j, mj11Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        mj11Var.i(j, false, mj11Var.h, treeMap);
        mj11Var.h(j, map, hashMap, mj11Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                pj11 pj11Var = (pj11) hashMap.get(pair.first);
                pj11Var.getClass();
                ndf ndfVar = new ndf();
                ndfVar.b = decodeByteArray;
                ndfVar.h = pj11Var.b;
                ndfVar.i = 0;
                ndfVar.e = pj11Var.c;
                ndfVar.f = 0;
                ndfVar.g = pj11Var.e;
                ndfVar.l = pj11Var.f;
                ndfVar.m = pj11Var.g;
                ndfVar.p = pj11Var.j;
                arrayList2.add(ndfVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            pj11 pj11Var2 = (pj11) hashMap.get(entry.getKey());
            pj11Var2.getClass();
            ndf ndfVar2 = (ndf) entry.getValue();
            CharSequence charSequence = ndfVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (esh eshVar : (esh[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), esh.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(eshVar), spannableStringBuilder.getSpanEnd(eshVar), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = pj11Var2.c;
            int i9 = pj11Var2.d;
            ndfVar2.e = f;
            ndfVar2.f = i9;
            ndfVar2.g = pj11Var2.e;
            ndfVar2.h = pj11Var2.b;
            ndfVar2.l = pj11Var2.f;
            float f2 = pj11Var2.i;
            int i10 = pj11Var2.h;
            ndfVar2.k = f2;
            ndfVar2.j = i10;
            ndfVar2.p = pj11Var2.j;
            arrayList2.add(ndfVar2.a());
        }
        return arrayList2;
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        ((e971) this.w).a(f5.m);
        kde kdeVar = (kde) this.c;
        ly lyVar = (ly) this.y;
        j18 j18Var = kdeVar.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new nt71(jk3Var, lyVar));
        }
    }

    public void k(h690 h690Var) {
        tls tlsVar = (tls) this.w;
        o();
        if (h690Var instanceof c690) {
            tlsVar.invoke(rzo.r(((c690) h690Var).a));
            return;
        }
        if (!(h690Var instanceof g690)) {
            if (h690Var == null) {
                tlsVar.invoke(pkj.x);
                return;
            } else {
                w511.b();
                return;
            }
        }
        this.x = new phd(2, this, h690Var);
        ViewTreeObserver viewTreeObserver = ((Div2View) this.b).getViewTreeObserver();
        this.y = viewTreeObserver;
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener((phd) this.x);
        }
    }

    public void l(String str) {
        ih01 ih01Var = (ih01) this.x;
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("url_id", str);
        ih01Var.a.a("Ugc.AuthError", hashMap, 1, new HashMap());
    }

    public void m() {
        ((n871) this.c).b(f1.c);
        ((xq81) this.w).d((Context) this.b, (qk61) this.y);
        xq81 xq81Var = (xq81) this.w;
        Context context = (Context) this.b;
        qk61 qk61Var = (qk61) this.y;
        synchronized (xq81Var.a) {
            xq81Var.c.remove(qk61Var);
            xq81Var.c(context);
        }
        ((m481) this.x).a(kc1.d, this);
    }

    public void n() {
        ((m481) this.x).b(kc1.d, this);
        xq81 xq81Var = (xq81) this.w;
        Context context = (Context) this.b;
        qk61 qk61Var = (qk61) this.y;
        xq81Var.b(context, qk61Var);
        xq81Var.a(context, qk61Var);
        ((n871) this.c).c(f1.c);
    }

    public void o() {
        phd phdVar;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.y;
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive() && (phdVar = (phd) this.x) != null && (viewTreeObserver = (ViewTreeObserver) this.y) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(phdVar);
        }
        this.y = null;
        this.x = null;
    }

    public MapBuilder p(String str, String str2) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("url_id", str);
        mapBuilder.put("load_id", str2);
        mapBuilder.putAll((Map) ((i3y) this.y).getValue());
        Context context = (Context) this.b;
        String str3 = "other";
        if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    str3 = StartupRequest.PARAM_WIFI;
                } else if (networkCapabilities != null) {
                    int i = 0;
                    if (networkCapabilities.hasTransport(0)) {
                        str3 = "cellular";
                        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                            Object systemService2 = context.getSystemService("phone");
                            TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                            if (telephonyManager != null) {
                                try {
                                    i = telephonyManager.getDataNetworkType();
                                } catch (SecurityException unused) {
                                }
                            }
                            if (i != 20) {
                                switch (i) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
                                        str3 = "2g";
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                        str3 = "3g";
                                        break;
                                    case 13:
                                        str3 = "lte";
                                        break;
                                }
                            } else {
                                str3 = "5g";
                            }
                        }
                    }
                }
            }
        }
        mapBuilder.put("network_type", str3);
        return mapBuilder.j();
    }

    public void q(String str) {
        ih01 ih01Var = (ih01) this.x;
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("url_id", str);
        ih01Var.a.a("Ugc.Error", hashMap, 1, new HashMap());
    }

    public Div2View s() {
        Div2View div2View = (Div2View) this.w;
        if (div2View != null) {
            return div2View;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public String t() {
        return (String) this.y;
    }

    @Override // defpackage.bj81
    public void u() {
        e971 e971Var = (e971) this.w;
        e971Var.a(f5.l);
        e971Var.b(f5.m, null);
    }

    public q351 v() {
        return (q351) this.x;
    }

    public String w() {
        return (String) this.w;
    }

    public String x() {
        return (String) this.b;
    }

    public WidgetType y() {
        return (WidgetType) this.c;
    }

    public void z() {
        r0 r0Var = (r0) this.w;
        TextView textView = (TextView) this.c;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) this.b;
        int top = textView.getTop();
        View view = (View) textView.getParent();
        while (true) {
            if (view == null) {
                break;
            }
            top += view.getTop() - view.getScrollY();
            view = (View) view.getParent();
            if (view == nestedScrollViewAdvanced) {
                top -= view.getScrollY();
                break;
            }
        }
        qv10.B(textView.getHeight() + top <= 0, r0Var, null);
    }

    @Override // defpackage.fh81
    public int a(long j) {
        long[] jArr = (long[]) this.c;
        int f = rf71.f(jArr, j, false);
        if (f < jArr.length) {
            return f;
        }
        return -1;
    }

    @Override // defpackage.fh81
    public int a() {
        return ((long[]) this.c).length;
    }

    public hlx0(ji41 ji41Var, xz xzVar, String str) {
        this.a = 26;
        eb71 eb71Var = new eb71();
        nr41 nr41Var = new nr41(10, (d881) ji41Var.b);
        this.b = xzVar;
        this.c = str;
        this.w = eb71Var;
        this.x = nr41Var;
    }

    public hlx0(Context context, int i) {
        a081 a081Var;
        a081 a081Var2;
        this.a = i;
        switch (i) {
            case 28:
                hn71 hn71Var = new hn71(context, 6);
                a081 a081Var3 = a081.g;
                if (a081Var3 == null) {
                    synchronized (a081.f) {
                        a081Var = a081.g;
                        if (a081Var == null) {
                            a081Var = new a081();
                            a081.g = a081Var;
                        }
                    }
                    a081Var3 = a081Var;
                }
                bi81 bi81Var = new bi81();
                qi71 qi71Var = new qi71();
                this.b = hn71Var;
                this.c = a081Var3;
                this.w = bi81Var;
                this.x = qi71Var;
                this.y = context.getApplicationContext();
                return;
            default:
                hn71 hn71Var2 = new hn71(context, 11);
                h271 h271Var = new h271();
                zw81 zw81Var = new zw81();
                io81 io81Var = new io81();
                a081 a081Var4 = a081.g;
                if (a081Var4 == null) {
                    synchronized (a081.f) {
                        a081Var2 = a081.g;
                        if (a081Var2 == null) {
                            a081Var2 = new a081();
                            a081.g = a081Var2;
                        }
                    }
                    a081Var4 = a081Var2;
                }
                gg81 a = a081Var4.a(context);
                this.b = hn71Var2;
                this.c = h271Var;
                this.w = zw81Var;
                this.x = io81Var;
                this.y = a;
                return;
        }
    }

    public hlx0(Context context, p171 p171Var, kde kdeVar, e971 e971Var) {
        this.a = 27;
        this.b = p171Var;
        this.c = kdeVar;
        this.w = e971Var;
        this.x = context.getApplicationContext();
        this.y = ly.c;
    }

    public hlx0(Context context, ge71 ge71Var) {
        this.a = 21;
        xf81 xf81Var = new xf81();
        vi71 vi71Var = new vi71(context, ge71Var, 27);
        int i = 16;
        vi71 vi71Var2 = new vi71(i, vi71Var, "Creatives", "Creative");
        vi71 vi71Var3 = new vi71(i, new iv71(), "AdVerifications", "Verification");
        az71 az71Var = new az71();
        yf71 yf71Var = new yf71();
        this.b = xf81Var;
        this.c = vi71Var2;
        this.w = vi71Var3;
        this.x = az71Var;
        this.y = yf71Var;
    }

    public hlx0(Context context, d881 d881Var, v981 v981Var, eq71 eq71Var, i581 i581Var, i971 i971Var, ip71 ip71Var, hv81 hv81Var, xc71 xc71Var, bl61 bl61Var) {
        this.a = 15;
        rr41 rr41Var = new rr41(context, v981Var, ip71Var);
        this.b = eq71Var;
        this.c = bl61Var;
        this.w = rr41Var;
        bc71 bc71Var = new bc71(eq71Var);
        i971 i971Var2 = new i971(18, this);
        ji41 ji41Var = new ji41(i971Var);
        js81 js81Var = new js81();
        new iu81();
        sbm0 sbm0Var = new sbm0(context, v981Var, bc71Var, i971Var, i581Var, ji41Var, js81Var, hv81Var, xc71Var, i971Var2, d881Var);
        this.x = sbm0Var;
        qv71 qv71Var = (qv71) sbm0Var.a;
        qv71Var.i.setValue(qv71Var, qv71.j[0], ip71Var);
    }

    public hlx0(Context context, fe81 fe81Var, v981 v981Var, wo71 wo71Var, i971 i971Var) {
        ddf ddfVar;
        this.a = 25;
        ddf ddfVar2 = ddf.x;
        if (ddfVar2 == null) {
            synchronized (ddf.w) {
                ddfVar = ddf.x;
                if (ddfVar == null) {
                    dy61 a = nka1.a(1, context);
                    k981 k981Var = new k981();
                    synchronized (a.k) {
                        a.k.add(k981Var);
                    }
                    ddfVar = new ddf(3, a);
                    ddf.x = ddfVar;
                }
            }
            ddfVar2 = ddfVar;
        }
        this.b = fe81Var;
        this.c = v981Var;
        this.w = wo71Var;
        this.x = i971Var;
        this.y = ddfVar2;
    }

    public hlx0(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var) {
        this.a = 20;
        Context applicationContext = context.getApplicationContext();
        this.b = fe81Var;
        this.c = v981Var;
        this.w = d881Var;
        this.x = applicationContext;
    }

    public hlx0(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var, j271 j271Var, tp0 tp0Var) {
        xq81 xq81Var;
        this.a = 18;
        Context applicationContext = context.getApplicationContext();
        n871 n871Var = new n871(context, fe81Var, v981Var, d881Var, j271Var, tp0Var);
        xq81 xq81Var2 = xq81.g;
        if (xq81Var2 == null) {
            synchronized (xq81.f) {
                xq81Var = xq81.g;
                if (xq81Var == null) {
                    xq81Var = new xq81();
                    xq81.g = xq81Var;
                }
            }
            xq81Var2 = xq81Var;
        }
        m481 a = pha1.a();
        this.b = applicationContext;
        this.c = n871Var;
        this.w = xq81Var2;
        this.x = a;
        this.y = new qk61(this);
    }

    public hlx0(Context context, bs81 bs81Var) {
        this.a = 19;
        vi61 vi61Var = new vi61(bs81Var);
        ym61 ym61Var = new ym61();
        g171 g171Var = new g171();
        this.b = bs81Var;
        this.c = vi61Var;
        this.w = ym61Var;
        this.x = g171Var;
        this.y = context.getApplicationContext();
    }

    public hlx0(a071 a071Var, String str, ListBuilder listBuilder) {
        this.a = 22;
        f9 f9Var = f9.d;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.w = new HashMap();
        this.b = a071Var;
        this.x = str;
        this.y = f9Var;
        arrayList.addAll(listBuilder);
        ListIterator listIterator = listBuilder.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                return;
            }
            s181 s181Var = (s181) qqyVar.next();
            ((HashMap) this.w).put(UUID.randomUUID().toString(), s181Var);
        }
    }

    public hlx0(List list, ArrayList arrayList, ArrayList arrayList2, String str, w4 w4Var, xn61 xn61Var) {
        this.a = 16;
        this.b = list;
        this.c = arrayList;
        this.w = arrayList2;
        this.x = str;
        this.y = w4Var;
    }

    public hlx0(eq71 eq71Var, i581 i581Var, xc71 xc71Var) {
        this.a = 23;
        kzo kzoVar = new kzo(new bc71(eq71Var), xc71Var);
        this.b = eq71Var;
        this.c = i581Var;
        this.w = kzoVar;
        this.x = new aj31(24, this);
    }

    public hlx0(v981 v981Var) {
        this.a = 29;
        l681 l681Var = new l681();
        jj71 jj71Var = new jj71();
        mj31 mj31Var = new mj31(v981Var);
        el71 el71Var = new el71();
        g371 g371Var = new g371();
        this.b = l681Var;
        this.c = jj71Var;
        this.w = mj31Var;
        this.x = el71Var;
        this.y = g371Var;
    }

    public hlx0(do81 do81Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 17;
        this.b = do81Var;
        this.x = hashMap2;
        this.y = hashMap3;
        this.w = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        do81Var.g(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public hlx0(rv41 rv41Var, rax raxVar, WebMessengerNavigationInterceptor webMessengerNavigationInterceptor) {
        this.a = 11;
        this.b = rv41Var;
        this.c = raxVar;
        this.y = new t4b(new qq31(5, this));
    }

    public hlx0(List list) {
        this.a = 14;
        this.b = list;
        this.c = new cs51(zlg0.ybsdk_slide_enter, zlg0.ybsdk_slide_exit, zlg0.ybsdk_slide_pop_enter, zlg0.ybsdk_slide_pop_exit);
        this.w = new cs51(zlg0.ybsdk_fade_in, zlg0.ybsdk_fade_out, zlg0.ybsdk_fade_pop_in, zlg0.ybsdk_fade_pop_out);
        int i = zlg0.ybsdk_bottom_up_enter;
        int i2 = zlg0.ybsdk_bottom_up_exit;
        this.x = new cs51(i, i2, i, i2);
        this.y = new cs51(0, 0, 0, 0);
    }

    public hlx0(NestedScrollViewAdvanced nestedScrollViewAdvanced, ShimmeringRobotoTextView shimmeringRobotoTextView) {
        this.a = 0;
        this.b = nestedScrollViewAdvanced;
        this.c = shimmeringRobotoTextView;
        this.w = bvf0.c(Boolean.FALSE);
        this.x = new ons0(8, this);
        this.y = new x95(10, this);
    }

    public /* synthetic */ hlx0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    public hlx0(Context context, lx4 lx4Var, sh41 sh41Var, ih01 ih01Var) {
        this.a = 9;
        this.b = context;
        this.c = lx4Var;
        this.w = sh41Var;
        this.x = ih01Var;
        this.y = kotlin.a.a(new pv01(11, this));
    }

    public hlx0(mj11 mj11Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 8;
        this.b = mj11Var;
        this.x = hashMap2;
        this.y = hashMap3;
        this.w = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        mj11Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public hlx0(Div2View div2View, Integer num, tls tlsVar) {
        this.a = 5;
        this.b = div2View;
        this.c = num;
        this.w = tlsVar;
    }
}
