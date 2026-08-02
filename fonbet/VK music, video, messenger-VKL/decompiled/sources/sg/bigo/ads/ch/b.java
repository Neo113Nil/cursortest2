package sg.bigo.ads.ch;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.an.g;
import sg.bigo.ads.ci.i;
import sg.bigo.ads.cn.m;

/* loaded from: classes9.dex */
public final class b extends c {
    public b(sg.bigo.ads.cf.b bVar, g gVar, sg.bigo.ads.ci.e eVar, i iVar) {
        super(bVar, gVar, eVar, iVar);
    }

    @Override // sg.bigo.ads.ch.c
    public final sg.bigo.ads.bh.e a() {
        return sg.bigo.ads.bp.e.c();
    }

    @Override // sg.bigo.ads.ch.c
    public final sg.bigo.ads.cg.b b() {
        return this.b.a.h;
    }

    @Override // sg.bigo.ads.ch.c
    public final void a(final Pair<String, Integer> pair) {
        if (this.b == null || this.c == null || pair == null) {
            return;
        }
        this.h.set(true);
        HashMap hashMap = new HashMap();
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", "1");
            hashMap2.put(CandidateTypeHintConfig.TYPE_HOST, pair.first);
            hashMap2.put("retry_times", String.valueOf(k.a.y()));
            hashMap2.put("retry_interval", String.valueOf(k.a.z()));
            hashMap2.put("next_retry_interval", String.valueOf(k.a.A()));
            hashMap2.put("cur_retry_time", String.valueOf(pair.second));
            hashMap2.put("uuid", this.c.X());
            hashMap2.put("action", "2");
            sg.bigo.ads.av.c a = sg.bigo.ads.dc.b.b("06002067", hashMap2).a(this.c, 0L);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", a.b);
            jSONObject.put("event_info", a.c);
            jSONArray.put(jSONObject);
            hashMap.put("sdk_events", jSONArray);
        } catch (Exception unused) {
        }
        m mVar = new m(hashMap, this.c, this.b, new sg.bigo.ads.ce.b() { // from class: sg.bigo.ads.ch.b.1
            @Override // sg.bigo.ads.ce.e
            public final void a(int i, int i2, int i3, @NonNull String str, @Nullable Object obj) {
                b.this.h.set(false);
                b.this.a(pair, c.a(i3));
            }

            @Override // sg.bigo.ads.ce.b
            public final void a(int i, @NonNull String str) {
                b.this.h.set(false);
                b.this.a(pair, false);
            }
        });
        mVar.i = (String) pair.first;
        mVar.b();
    }
}
