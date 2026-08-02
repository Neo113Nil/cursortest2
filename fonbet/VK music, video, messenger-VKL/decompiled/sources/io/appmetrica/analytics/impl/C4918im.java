package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4918im {
    public final Ja a;
    public final C4907ia b;
    public final Pi c;
    public final Ke d;
    public final Rm e;
    public final C5158s3 f;
    public final A2 g;
    public final C5192tb h;
    public final Om i;
    public final Cd j;
    public final P9 k;

    public C4918im() {
        this(new C5192tb(), new Ja(), new C4907ia(), new Pi(), new Ke(), new Rm(), new C5158s3(), new A2(), new Om(), new Cd(), new P9());
    }

    public final void a(C5048nm c5048nm, C5140rb c5140rb) {
        long j;
        long j2;
        String str;
        ArrayList a;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c5140rb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject(CandidateTypeHintConfig.TYPE_HOST)) != null) {
            c5048nm.g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c5140rb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c5048nm.j = Pm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c5140rb.optJSONObject("locale");
        String str2 = "";
        c5048nm.m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c5140rb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c5048nm.l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        Fm fm = new Fm();
        JSONObject optJSONObject9 = c5140rb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            fm.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", fm.a);
        }
        this.e.getClass();
        c5048nm.p = new Qm(fm.a);
        this.b.getClass();
        Bm bm = new Bm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c5140rb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C5236v4 c5236v4 = new C5236v4();
                c5236v4.a = C4907ia.a(optJSONObject10, "permissions_collecting", bm.a);
                c5236v4.b = C4907ia.a(optJSONObject10, "features_collecting", bm.b);
                c5236v4.c = C4907ia.a(optJSONObject10, "google_aid", bm.c);
                c5236v4.d = C4907ia.a(optJSONObject10, "sim_info", bm.d);
                c5236v4.e = C4907ia.a(optJSONObject10, "huawei_oaid", bm.e);
                c5236v4.f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c5048nm.b = new C5286x4(c5236v4);
            }
        } catch (Throwable unused4) {
        }
        this.a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c5140rb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject optJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c5048nm.d = str;
                }
                ArrayList a2 = Ja.a(optJSONObject11, "report");
                if (!vo.a((Collection) a2)) {
                    c5048nm.e = a2;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c5048nm.f = str2;
                }
                ArrayList a3 = Ja.a(optJSONObject11, "startup");
                if (!vo.a((Collection) a3)) {
                    c5048nm.c = a3;
                }
                ArrayList a4 = Ja.a(optJSONObject11, "diagnostic");
                if (!vo.a((Collection) a4)) {
                    c5048nm.n = a4;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Ja.a.contains(next2) && (a = Ja.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a);
                    }
                }
                c5048nm.o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.c.getClass();
        Gm gm = new Gm();
        JSONObject optJSONObject12 = c5140rb.optJSONObject("retry_policy");
        int i = gm.w;
        int i2 = gm.x;
        if (optJSONObject12 != null) {
            i = optJSONObject12.optInt("max_interval_seconds", i);
            i2 = optJSONObject12.optInt("exponential_multiplier", gm.x);
        }
        c5048nm.q = new RetryPolicyConfig(i, i2);
        this.d.getClass();
        if (c5048nm.b.a) {
            JSONObject optJSONObject13 = c5140rb.optJSONObject("permissions_collecting");
            Dm dm = new Dm();
            if (optJSONObject13 != null) {
                j = optJSONObject13.optLong("check_interval_seconds", dm.a);
                j2 = optJSONObject13.optLong("force_send_interval_seconds", dm.b);
            } else {
                j = dm.a;
                j2 = dm.b;
            }
            c5048nm.k = new Ie(j, j2);
        }
        C5158s3 c5158s3 = this.f;
        c5158s3.getClass();
        C5329ym c5329ym = new C5329ym();
        JSONObject optJSONObject14 = c5140rb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c5329ym.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c5329ym.a);
        }
        c5158s3.a.getClass();
        c5048nm.r = new C5081p3(c5329ym.a);
        this.g.getClass();
        A2.a(c5048nm, c5140rb);
        Om om = this.i;
        om.getClass();
        JSONObject optJSONObject15 = c5140rb.optJSONObject("startup_update");
        Em em = new Em();
        Integer a5 = AbstractC5166sb.a(optJSONObject15, "interval_seconds", null);
        if (a5 != null) {
            em.a = a5.intValue();
        }
        om.a.getClass();
        c5048nm.t = new Mm(em.a);
        Map<String, C4935jd> c = this.j.a.c();
        Bd bd = new Bd(c5140rb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C4935jd> entry : c.entrySet()) {
            Object invoke = bd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c5048nm.u = linkedHashMap;
        O9 o9 = this.k.a;
        Am am = new Am();
        JSONObject optJSONObject16 = c5140rb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            am.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", am.a);
        }
        o9.getClass();
        c5048nm.v = new N9(am.a);
    }

    public C4918im(C5192tb c5192tb, Ja ja, C4907ia c4907ia, Pi pi, Ke ke, Rm rm, C5158s3 c5158s3, A2 a2, Om om, Cd cd, P9 p9) {
        this.a = ja;
        this.b = c4907ia;
        this.c = pi;
        this.d = ke;
        this.e = rm;
        this.f = c5158s3;
        this.g = a2;
        this.h = c5192tb;
        this.i = om;
        this.j = cd;
        this.k = p9;
    }
}
