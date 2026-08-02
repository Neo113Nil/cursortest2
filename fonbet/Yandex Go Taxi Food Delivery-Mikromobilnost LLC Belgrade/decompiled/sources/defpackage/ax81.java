package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import yads.d4;
import yads.h01;
import yads.hm2;
import yads.jk3;
import yads.x3;

/* loaded from: classes7.dex */
public abstract class ax81 extends aj61 {
    public final fe81 w;
    public final Object x;
    public final k771 y;
    public final ge71 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax81(Context context, fe81 fe81Var, int i, String str, g291 g291Var, Object obj, k771 k771Var, i971 i971Var, ge71 ge71Var) {
        super(context, i, str, g291Var, i971Var);
        Integer num;
        a081 a081Var;
        mj31 mj31Var = new mj31(context, 19);
        new ni71();
        this.w = fe81Var;
        this.x = obj;
        this.y = k771Var;
        this.z = ge71Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        setRetryPolicy(ni71.a((a == null || (num = a.w0) == null) ? gl71.a : num.intValue(), context));
        setShouldRetryConnectionErrors(true);
        setShouldRetryServerErrors(true);
        zj71 a2 = k771Var.a(obj);
        ge71Var.c(a2);
        String str2 = a2.a;
        hm2 hm2Var = hm2.j;
        if (jl40.l(str2, "ad_request")) {
            mj31Var.t(hm2Var, a2.b, null, null);
        }
    }

    public abstract km81 c(gb81 gb81Var, int i);

    public final void d(gb81 gb81Var, km81 km81Var, int i) {
        Map map = gb81Var.c;
        zj71 b = this.y.b(km81Var, i, this.x, null);
        HashMap hashMap = b.b;
        HashMap hashMap2 = ym11.h(hashMap) ? hashMap : null;
        if (hashMap2 == null) {
            hashMap2 = new LinkedHashMap();
        }
        String b2 = ob71.b(map, h01.q);
        if (b2 != null) {
            hashMap2.put("server_log_id", b2);
        }
        if (map != null) {
            lb81.a(map);
        }
        this.z.c(b);
    }

    @Override // com.monetization.ads.network.core.Request
    public Map getHeaders() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(((c171) this.w.b.b).b);
        return mapBuilder.j();
    }

    @Override // com.monetization.ads.network.core.Request
    public jk3 parseNetworkError(jk3 jk3Var) {
        ge71 ge71Var = this.z;
        try {
            gb81 gb81Var = jk3Var.b;
            ge71Var.c(this.y.b(null, gb81Var != null ? gb81Var.a : -1, this.x, jk3Var));
            return super.parseNetworkError(jk3Var);
        } catch (Throwable th) {
            ge71Var.d("Failed to parse network error", th);
            return new x3(d4.p);
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final km81 parseNetworkResponse(gb81 gb81Var) {
        try {
            int i = gb81Var.a;
            km81 c = c(gb81Var, i);
            d(gb81Var, c, i);
            return c;
        } catch (Throwable th) {
            this.z.d("Failed to parse network response", th);
            return new km81(new x3(d4.p));
        }
    }
}
