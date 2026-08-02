package xsna;

import com.vk.api.sdk.VKApiConfig;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import okhttp3.c;
import okhttp3.k;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ckx;

/* compiled from: BatchMethodChainCall.kt */
/* loaded from: classes15.dex */
public final class av6 extends ara<JSONObject> {
    public final long b;
    public final mkx c;
    public final har0 d;

    public av6(l7r0 l7r0Var, long j, mkx mkxVar, har0 har0Var) {
        super(l7r0Var);
        this.b = j;
        this.c = mkxVar;
        this.d = har0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.ara
    public final JSONObject a(zqa zqaVar) {
        okhttp3.c cVar;
        m63.j(m63.c(), new Pair("batch.method_count", Integer.valueOf(this.d.y.size())));
        mkx mkxVar = this.c;
        ckx.a aVar = new ckx.a();
        aVar.w = jgp.b;
        har0 har0Var = this.d;
        aVar.n(har0Var);
        aVar.a = har0Var.a;
        aVar.d = har0Var.d;
        aVar.e = har0Var.e;
        aVar.w = pn00.n(aVar.w, har0Var.y);
        aVar.j = har0Var.g;
        boolean z = har0Var.j;
        aVar.u = har0Var.l;
        aVar.i = z;
        aVar.r = har0Var.k;
        aVar.l = har0Var.n;
        aVar.m = har0Var.o;
        ckx ckxVar = new ckx(aVar);
        long j = this.b;
        mkxVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, gy70> entry : ckxVar.x.entrySet()) {
            String key = entry.getKey();
            gy70 value = entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", key).put("method", value.d);
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : value.f.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            jSONArray.put(jSONObject2);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("sequential", false).put("stop_on_error", false);
        jSONObject.put("requests", jSONArray).put(SignalingProtocol.KEY_OPTIONS, jSONObject4);
        String jSONObject5 = jSONObject.toString();
        t.a aVar2 = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        okhttp3.m a = m.a.a("application/json");
        aVar2.getClass();
        okhttp3.s a2 = t.a.a(jSONObject5, a);
        p.a t = mkxVar.t(ckxVar, j);
        String d = kpe0.a.d(ckxVar.d, jgp.b, ckxVar.e, i7r0.a(mkxVar.e.getValue()), i7r0.b(mkxVar.e.getValue()), ((VKApiConfig) mkxVar.a.b).b, false, EmptySet.b, false);
        t.f("POST", a2);
        t.i(ckxVar.o + ckxVar.b.h() + '/' + ckxVar.d + '?' + d);
        String str = ckxVar.c;
        if (str != null) {
            okhttp3.c cVar2 = okhttp3.c.n;
            k.a aVar3 = new k.a();
            aVar3.b("Cache-Control", str);
            cVar = c.b.a(aVar3.e());
        } else {
            cVar = okhttp3.c.n;
        }
        t.c(cVar);
        JSONObject o = mkxVar.o(mkxVar.g(t.b()));
        return o == null ? new JSONObject() : o;
    }
}
