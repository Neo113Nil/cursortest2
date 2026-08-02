package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.j9x;
import xsna.k9x;
import xsna.swe0;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class L implements JsonParser {
    public final Y a;
    public final X b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(JSONObject jSONObject) {
        N n;
        P p;
        Q q;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC5370o.a);
        Y y = this.a;
        X x = this.b;
        x.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q = new Q();
            q.a = new N();
            q.b = new P();
            O o = new O();
            o.c = AbstractC5370o.b;
            q.c = o;
        } else {
            Q q2 = new Q();
            x.a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o2 = null;
            if (optJSONObject2 == null) {
                n = null;
            } else {
                n = new N();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n.a = optBooleanOrNull.booleanValue();
                }
            }
            if (n != null) {
                q2.a = n;
            }
            x.b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p = null;
            } else {
                p = new P();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p.a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p.b = optLongOrNull.longValue();
                }
            }
            if (p != null) {
                q2.b = p;
            }
            x.c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o2 = new O();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o2.a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    k9x q3 = swe0.q(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(c5g.u(q3, 10));
                    j9x it = q3.iterator();
                    while (it.d) {
                        arrayList.add(optJSONArray.getString(it.nextInt()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o2.c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o2.b = optLongOrNull2.longValue();
                }
            }
            if (o2 != null) {
                q2.c = o2;
            }
            q = q2;
        }
        return new J(extractFeature, y.toModel(q));
    }

    public final J b(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(Y y, X x) {
        this.a = y;
        this.b = x;
    }

    public /* synthetic */ L(Y y, X x, int i, zcl zclVar) {
        this((i & 1) != 0 ? new Y(null, null, null, 7, null) : y, (i & 2) != 0 ? new X() : x);
    }
}
