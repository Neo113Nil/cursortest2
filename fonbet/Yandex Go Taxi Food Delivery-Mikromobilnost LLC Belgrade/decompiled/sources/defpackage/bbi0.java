package defpackage;

import android.os.Looper;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class bbi0 {
    public final x22 a;
    public final n5t0 b;
    public final naz0 c;
    public final fw10 d;
    public final kta0 e;
    public final nai0 f;
    public final Looper g = Looper.myLooper();
    public final rnz h = new rnz((Object) null);
    public final rnz i = new rnz((Object) null);

    public bbi0(x22 x22Var, n5t0 n5t0Var, naz0 naz0Var, fw10 fw10Var, kta0 kta0Var, nai0 nai0Var) {
        this.a = x22Var;
        this.b = n5t0Var;
        this.c = naz0Var;
        this.d = fw10Var;
        this.e = kta0Var;
        this.f = nai0Var;
    }

    public final void a(kv10 kv10Var) {
        String str;
        z83.g(null, this.g, Looper.myLooper());
        ServerMessageRef serverMessageRef = kv10Var.a;
        int i = kv10Var.b;
        int i2 = kv10Var.c;
        ssa0 ssa0Var = kv10Var.d;
        z83.h(null, serverMessageRef.getTimestamp() > 0);
        z83.h(null, i > 0);
        x22 x22Var = this.a;
        o1b0 o1b0Var = this.c.a;
        String str2 = o1b0Var.b;
        String str3 = o1b0Var.c;
        Integer valueOf = Integer.valueOf(i);
        if (i2 == 0) {
            str = "add";
        } else if (i2 == 1) {
            str = "remove";
        } else {
            if (i2 != 2) {
                ny61.k();
                return;
            }
            str = FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE;
        }
        x22Var.g("send reaction", "chat id", str2, "addressee id", str3, "type", valueOf, "action", str);
        if (i2 != 1) {
            nai0 nai0Var = this.f;
            nai0Var.b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            LinkedHashMap linkedHashMap = new LinkedHashMap(nai0Var.a());
            lai0 lai0Var = (lai0) linkedHashMap.get(Integer.valueOf(i));
            linkedHashMap.put(Integer.valueOf(i), new lai0((lai0Var != null ? Math.exp(Math.max(0.0d, (currentTimeMillis - lai0Var.b) / 3600000.0d) * (-0.004126d)) * lai0Var.a : 0.0d) + 1.0d, currentTimeMillis));
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                lai0 lai0Var2 = (lai0) entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("score", lai0Var2.a);
                jSONObject2.put("lastUpdatedTimestampMs", lai0Var2.b);
                jSONObject.put(String.valueOf(intValue), jSONObject2);
            }
            nai0Var.a.edit().putString("reaction_usage_records", jSONObject.toString()).apply();
        }
        x08 x08Var = (x08) this.i.c(serverMessageRef.getTimestamp());
        if (x08Var != null) {
            x08Var.cancel();
        }
        x08 x08Var2 = (x08) this.h.c(serverMessageRef.getTimestamp());
        if (x08Var2 != null) {
            x08Var2.cancel();
        }
        kta0 kta0Var = this.e;
        naz0 naz0Var = this.c;
        if (ssa0Var != null) {
            long j = naz0Var.a.a;
            long timestamp = serverMessageRef.getTimestamp();
            z83.g(null, kta0Var.a, Looper.myLooper());
            ita0 ita0Var = new ita0(j, timestamp);
            synchronized (kta0Var) {
                kta0Var.b.put(ita0Var, ssa0Var);
            }
            kta0Var.d.rewind();
            while (kta0Var.d.hasNext()) {
                jta0 jta0Var = (jta0) kta0Var.d.next();
                z83.g(null, jta0Var.c.a, Looper.myLooper());
                if (jta0Var.a.equals(ita0Var)) {
                    jta0Var.b.a(ssa0Var);
                }
            }
        } else {
            kta0Var.a(naz0Var.a.a, serverMessageRef.getTimestamp());
        }
        this.h.h(serverMessageRef.getTimestamp(), this.b.f(new abi0(this, serverMessageRef, i, i2)));
    }
}
