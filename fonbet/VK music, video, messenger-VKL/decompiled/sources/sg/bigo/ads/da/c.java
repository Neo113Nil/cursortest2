package sg.bigo.ads.da;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.g;
import sg.bigo.ads.an.j;
import sg.bigo.ads.bh.d;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class c {
    private static final c e = new c();
    public sg.bigo.ads.db.a a;
    public sg.bigo.ads.dc.b b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public g d;

    private c() {
    }

    private void b(final String str, final Map<String, String> map) {
        d.a(3, new Runnable() { // from class: sg.bigo.ads.da.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    sg.bigo.ads.av.c a = sg.bigo.ads.dc.b.b(str, map).a(c.this.d, 0L);
                    HashMap hashMap = new HashMap();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_id", a.b);
                    jSONObject.put("event_info", a.c);
                    jSONArray.put(jSONObject);
                    hashMap.put("sdk_events", jSONArray);
                    j jVar = a.a().a;
                    if (jVar != null) {
                        jVar.a(hashMap, null);
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }

    public static c a() {
        return e;
    }

    public final void a(String str, Map<String, String> map) {
        String str2;
        String str3;
        if (a(str)) {
            b(str, map);
            return;
        }
        if (this.a == null) {
            str2 = "mConfig is null, eventId =";
        } else {
            if (sg.bigo.ads.bw.a.s() && !"06002066".equals(str)) {
                return;
            }
            if (!this.c.get()) {
                str3 = "please execute initStatic first";
                sg.bigo.ads.bn.a.a(0, "Stats", str3);
            } else if (r.a((CharSequence) str) || map == null) {
                str2 = "eventId is empty or events is null, eventId =";
            } else {
                if (this.a.a(str)) {
                    sg.bigo.ads.dc.b bVar = this.b;
                    if (bVar != null) {
                        bVar.a(str, map);
                        return;
                    }
                    return;
                }
                str2 = "not hit report eventId=";
            }
        }
        str3 = str2.concat(String.valueOf(str));
        sg.bigo.ads.bn.a.a(0, "Stats", str3);
    }

    private static boolean a(String str) {
        return "06002007".equals(str) && sg.bigo.ads.bw.a.s();
    }
}
