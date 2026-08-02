package com.vungle.ads.internal.model;

import com.huawei.hms.framework.common.BundleUtil;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Result;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import xsna.alk;
import xsna.c5g;
import xsna.cti;
import xsna.drm0;
import xsna.epx;
import xsna.fpf0;
import xsna.g5g;
import xsna.j5g;
import xsna.jdz;
import xsna.oqm0;
import xsna.rfc;
import xsna.rpj;
import xsna.u500;
import xsna.xfb0;
import xsna.y9y;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class h0 {
    public static final p Companion = new p();
    public final List a;
    public final v2 b;
    public Long c;
    public ConcurrentHashMap d;
    public Map e;
    public boolean f;
    public AdConfig g;
    public com.vungle.ads.internal.util.s h;
    public String i;
    public final LinkedHashMap j;

    public /* synthetic */ h0(int i, List list, v2 v2Var, Long l, ConcurrentHashMap concurrentHashMap, Map map, boolean z, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = new ConcurrentHashMap();
        } else {
            this.d = concurrentHashMap;
        }
        if ((i & 16) == 0) {
            this.e = new HashMap();
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        this.g = null;
        this.h = null;
        if ((i & 64) == 0) {
            this.i = null;
        } else {
            this.i = str;
        }
        this.j = new LinkedHashMap();
    }

    public static final void a(h0 h0Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || h0Var.a != null) {
            ctiVar.s(xfb0Var, 0, new yk3(q.a), h0Var.a);
        }
        if (ctiVar.z() || h0Var.b != null) {
            ctiVar.s(xfb0Var, 1, u1.a, h0Var.b);
        }
        if (ctiVar.z() || h0Var.c != null) {
            ctiVar.s(xfb0Var, 2, u500.a, h0Var.c);
        }
        if (ctiVar.z() || !epx.f(h0Var.d, new ConcurrentHashMap())) {
            rfc a = fpf0.a(ConcurrentHashMap.class);
            oqm0 oqm0Var = oqm0.a;
            ctiVar.n(xfb0Var, 3, new rpj(a, null, new KSerializer[]{oqm0Var, oqm0Var}), h0Var.d);
        }
        if (ctiVar.z() || !epx.f(h0Var.e, new HashMap())) {
            oqm0 oqm0Var2 = oqm0.a;
            ctiVar.n(xfb0Var, 4, new jdz(oqm0Var2, oqm0Var2), h0Var.e);
        }
        if (ctiVar.z() || h0Var.f) {
            ctiVar.l(xfb0Var, 5, h0Var.f);
        }
        if (!ctiVar.z() && h0Var.i == null) {
            return;
        }
        ctiVar.s(xfb0Var, 6, oqm0.a, h0Var.i);
    }

    public final boolean A() {
        return epx.f(F(), "native");
    }

    public final boolean B() {
        Boolean bool;
        i k = k();
        return ((k == null || (bool = k.C) == null) ? false : bool.booleanValue()) && !A();
    }

    public final boolean C() {
        z zVar;
        c0 c0Var;
        Boolean bool;
        i k = k();
        if (k == null || (zVar = k.s) == null || (c0Var = zVar.a) == null || (bool = c0Var.a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String D() {
        s i = i();
        if (i != null) {
            return i.a;
        }
        return null;
    }

    public final void E() {
        this.c = Long.valueOf(System.currentTimeMillis());
    }

    public final String F() {
        i k = k();
        if (k != null) {
            return k.t;
        }
        return null;
    }

    public final boolean G() {
        i k = k();
        return (k != null ? epx.f(k.l(), Boolean.TRUE) : false) && !A();
    }

    public final boolean b() {
        Boolean bool;
        i k = k();
        if (k == null || (bool = k.h) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final i c() {
        return k();
    }

    public final int d() {
        f fVar;
        Integer num;
        i k = k();
        if (k == null || (fVar = k.z) == null || (num = fVar.a) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String e() {
        i k = k();
        if (k != null) {
            return k.w;
        }
        return null;
    }

    public final v2 f() {
        return this.b;
    }

    public final JsonObject g() {
        LinkedHashMap s = s();
        y9y y9yVar = new y9y();
        for (Map.Entry entry : s.entrySet()) {
            alk.u(y9yVar, (String) entry.getKey(), (String) entry.getValue());
        }
        return y9yVar.a();
    }

    public final String h() {
        i k = k();
        if (k != null) {
            return k.a;
        }
        return null;
    }

    public final s i() {
        List list = this.a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (s) list.get(0);
    }

    public final AdConfig j() {
        return this.g;
    }

    public final i k() {
        s i = i();
        if (i != null) {
            return i.b;
        }
        return null;
    }

    public final String l() {
        i k = k();
        if (k != null) {
            return k.c;
        }
        return null;
    }

    public final l m() {
        s i = i();
        if (i != null) {
            return i.c;
        }
        return null;
    }

    public final String n() {
        String str;
        i k = k();
        return (k == null || (str = k.v) == null) ? "unknown" : str;
    }

    public final String o() {
        v vVar;
        Map map;
        i k = k();
        if (k == null || (vVar = k.u) == null || (map = vVar.a) == null) {
            return null;
        }
        return (String) map.get("OBSERVED_EXPERIMENTS");
    }

    public final String p() {
        return this.i;
    }

    public final com.vungle.ads.internal.util.s q() {
        return this.h;
    }

    public final List r() {
        l lVar;
        s i = i();
        if (i == null || (lVar = i.c) == null) {
            return null;
        }
        return lVar.c;
    }

    public final LinkedHashMap s() {
        v vVar;
        Map map;
        v vVar2;
        Map map2;
        i k = k();
        if ((k != null ? k.u : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i k2 = k();
        if (k2 != null && (vVar2 = k2.u) != null && (map2 = vVar2.a) != null) {
            linkedHashMap.putAll(map2);
        }
        i k3 = k();
        if (k3 != null && (vVar = k3.u) != null && (map = vVar.b) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = ((o) entry.getValue()).a;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
        }
        if (!this.d.isEmpty()) {
            linkedHashMap.putAll(this.d);
        }
        if (!this.e.isEmpty()) {
            linkedHashMap.putAll(this.e);
        }
        return linkedHashMap;
    }

    public final String t() {
        i k = k();
        if (k != null) {
            return k.i;
        }
        return null;
    }

    public final String u() {
        i k = k();
        if (k != null) {
            return k.o;
        }
        return null;
    }

    public final f0 v() {
        i k = k();
        if (k != null) {
            return k.A;
        }
        return null;
    }

    public final List w() {
        l lVar;
        s i = i();
        if (i == null || (lVar = i.c) == null) {
            return null;
        }
        return lVar.b;
    }

    public final boolean x() {
        i k = k();
        if (k == null) {
            return false;
        }
        Long l = this.c;
        if (k.e != null && l != null) {
            if ((System.currentTimeMillis() - l.longValue()) / 1000 > (k.e != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return true;
            }
        } else if (k.d != null) {
            if (System.currentTimeMillis() / 1000 > (k.d != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        v j;
        Map b;
        String str;
        i k = k();
        return (k == null || (j = k.j()) == null || (b = j.b()) == null || (str = (String) b.get("AD_PODDING")) == null || !str.equalsIgnoreCase("true")) ? false : true;
    }

    public final boolean z() {
        Boolean bool;
        i k = k();
        if (k == null || (bool = k.g) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean b(String str) {
        v j;
        Map a;
        if (!A()) {
            i k = k();
            if (epx.f(k != null ? k.m() : null, str)) {
                return true;
            }
        }
        i k2 = k();
        if (k2 == null || (j = k2.j()) == null || (a = j.a()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (epx.f(((o) entry.getValue()).c(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final int a() {
        f fVar;
        Integer num;
        i k = k();
        if (k == null || (fVar = k.z) == null || (num = fVar.b) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void a(AdConfig adConfig) {
        this.g = adConfig;
    }

    public final void a(com.vungle.ads.internal.util.s sVar) {
        this.h = sVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List b(String str, String str2, String str3) {
        Map k;
        Map k2;
        i k3 = k();
        if (k3 != null && (k2 = k3.k()) != null && !k2.containsKey(str)) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, com.iab.omid.library.vungle.d.a("Arbitrary tpat key: ", str)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        i k4 = k();
        List list = (k4 == null || (k = k4.k()) == null) ? null : (List) k.get(str);
        if (list != null && !list.isEmpty()) {
            switch (str.hashCode()) {
                case -2125915830:
                    if (str.equals("checkpoint.0")) {
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a(a(a((String) it.next(), "{{{remote_play}}}", String.valueOf(!this.f)), "{{{carrier}}}", str2), "{{{vol}}}", str3));
                        }
                        return arrayList;
                    }
                    return list;
                case -747709511:
                    if (str.equals("video.length")) {
                        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(a((String) it2.next(), "{{{vlen}}}", str2));
                        }
                        return arrayList2;
                    }
                    return list;
                case -132489083:
                    if (str.equals("ad.loadDuration")) {
                        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(a((String) it3.next(), "{{{time_dl}}}", str2));
                        }
                        return arrayList3;
                    }
                    return list;
                case 1516630125:
                    if (str.equals("ad.close")) {
                        ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(a(a((String) it4.next(), "{{{dur}}}", str2), "{{{vol}}}", str3));
                        }
                        return arrayList4;
                    }
                    return list;
                case 1940309120:
                    if (str.equals("deeplink.click")) {
                        ArrayList arrayList5 = new ArrayList(c5g.u(list, 10));
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(a((String) it5.next(), "{{{is_success}}}", str2));
                        }
                        return arrayList5;
                    }
                    return list;
                default:
                    return list;
            }
        }
        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, com.iab.omid.library.vungle.d.a("Empty tpat key: ", str)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
        return null;
    }

    public final b a(String str) {
        return (b) this.j.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(File file) {
        Pair pair;
        i k;
        v j;
        Map a;
        Pair pair2;
        i k2;
        String m;
        String failure;
        File parentFile;
        ArrayList arrayList = new ArrayList();
        if (!A() && (k2 = k()) != null && (m = k2.m()) != null) {
            String str = com.vungle.ads.internal.util.n.a(m) ? m : null;
            if (str != null) {
                try {
                    List b0 = drm0.b0(drm0.q0(new URI(str).getPath(), '/'), new char[]{'/'}, 0, 6);
                    failure = b0.size() >= 2 ? j5g.g0(j5g.I0(2, b0), BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62) : "index.html";
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                String str2 = (String) failure;
                if (str2 != null && (parentFile = file.getParentFile()) != null) {
                    pair = new Pair(str, new File(parentFile, str2));
                    if (pair != null) {
                        String str3 = (String) pair.d();
                        File file2 = (File) pair.g();
                        this.i = file2.getAbsolutePath();
                        if (!file2.exists()) {
                            boolean z = com.vungle.ads.internal.util.u.a;
                            com.vungle.ads.internal.util.t.a("AdPayload", "No cacheable index file found, creating new one: " + file2);
                            arrayList.add(new b(str3, file2.getAbsolutePath()));
                        }
                    }
                    k = k();
                    if (k != null && (j = k.j()) != null && (a = j.a()) != null) {
                        for (Map.Entry entry : a.entrySet()) {
                            String str4 = (String) entry.getKey();
                            o oVar = (o) entry.getValue();
                            String c = oVar.c();
                            if (c != null && com.vungle.ads.internal.util.n.a(c)) {
                                String absolutePath = new File(file, com.vungle.ads.internal.util.n.a(c, oVar.b())).getAbsolutePath();
                                Integer a2 = oVar.a();
                                if (!A() && b()) {
                                    if (!B()) {
                                        pair2 = new Pair(Boolean.FALSE, null);
                                    } else {
                                        pair2 = new Pair(Boolean.TRUE, Integer.valueOf(Math.max(0, a2 != null ? a2.intValue() : 0)));
                                    }
                                } else {
                                    pair2 = new Pair(Boolean.TRUE, null);
                                }
                                boolean booleanValue = ((Boolean) pair2.d()).booleanValue();
                                Integer num = (Integer) pair2.g();
                                b bVar = new b(str4, c, absolutePath, booleanValue, num);
                                String b = oVar.b();
                                if (b != null) {
                                    bVar.a(b);
                                }
                                arrayList.add(bVar);
                                if (booleanValue && num != null) {
                                    this.j.put(c, bVar);
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        g5g.L(arrayList, new g0());
                    }
                    return arrayList;
                }
            }
        }
        pair = null;
        if (pair != null) {
        }
        k = k();
        if (k != null) {
            while (r0.hasNext()) {
            }
        }
        if (arrayList.size() > 1) {
        }
        return arrayList;
    }

    public static /* synthetic */ List a(h0 h0Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return h0Var.b(str, str2, null);
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (str.length() > 0) {
            this.e.put("INCENTIVIZED_TITLE_TEXT", str);
        }
        if (str2.length() > 0) {
            this.e.put("INCENTIVIZED_BODY_TEXT", str2);
        }
        if (str3.length() > 0) {
            this.e.put("INCENTIVIZED_CONTINUE_TEXT", str3);
        }
        if (str4.length() > 0) {
            this.e.put("INCENTIVIZED_CLOSE_TEXT", str4);
        }
    }

    public final int a(Boolean bool) {
        Integer g;
        int intValue;
        Integer h;
        if (epx.f(bool, Boolean.TRUE)) {
            i k = k();
            if (k == null || (h = k.h()) == null) {
                return 0;
            }
            intValue = h.intValue();
        } else {
            i k2 = k();
            if (k2 == null || (g = k2.g()) == null) {
                return 0;
            }
            intValue = g.intValue();
        }
        return intValue * 1000;
    }

    public static String a(String str, String str2, String str3) {
        Regex regex = new Regex(Pattern.quote(str2));
        if (str3 == null) {
            str3 = "";
        }
        return regex.g(str, str3);
    }

    public final synchronized void a(File file, String str) {
        if (file.exists()) {
            ConcurrentHashMap concurrentHashMap = this.d;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("file://");
            a.append(file.getAbsolutePath());
            concurrentHashMap.put(str, a.toString());
        }
    }
}
