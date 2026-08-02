package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.collections.b;
import org.json.JSONObject;
import yads.f1;
import yads.pf1;
import yads.q63;
import yads.tp0;
import yads.xz;

/* loaded from: classes7.dex */
public final class n871 {
    public static final /* synthetic */ kgx[] m = {qha1.a(n871.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;")};
    public final fe81 a;
    public final d881 b;
    public final tp0 c;
    public final pf71 d;
    public final ge71 e;
    public final rr41 f;
    public final hn71 g;
    public final boolean h;
    public final r581 i;
    public f1 j;
    public uio0 k;
    public long l;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r6.J == true) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n871(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var, j271 j271Var, tp0 tp0Var) {
        a081 a081Var;
        pf71 pf71Var = new pf71();
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        rr41 rr41Var = tp0Var != null ? new rr41(context, fe81Var, v981Var, tp0Var) : null;
        hn71 b2 = wp81.b(context);
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
        boolean z = a != null;
        this.a = fe81Var;
        this.b = d881Var;
        this.c = tp0Var;
        this.d = pf71Var;
        this.e = b;
        this.f = rr41Var;
        this.g = b2;
        this.h = z;
        this.i = new r581(j271Var);
    }

    public final zj71 a(f1 f1Var, String str) {
        fe81 fe81Var = this.a;
        hn71 a = this.d.a(fe81Var.e);
        a.r(f1Var.b, "type");
        a.r(fe81Var.a.b, "ad_type");
        a.r(fe81Var.c.a, "ad_unit_id");
        a.r(str, "interval");
        uio0 uio0Var = this.k;
        if (uio0Var != null) {
            a = fga1.a(a, uio0Var.b());
        }
        Map map = (Map) a.b;
        d881 d881Var = this.b;
        return new zj71("returned_to_app", new LinkedHashMap(map), d881Var != null ? d881Var.i : null);
    }

    public final void b(f1 f1Var) {
        Objects.toString(f1Var);
        if (this.l == 0 || this.j != f1Var) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        this.e.c(a(f1Var, hja1.a(currentTimeMillis)));
        kgx kgxVar = m[0];
        j271 j271Var = (j271) this.i.a.get();
        if (j271Var != null) {
            j271Var.b();
        }
        rr41 rr41Var = this.f;
        if (rr41Var != null) {
            tp0 tp0Var = (tp0) rr41Var.b;
            if (currentTimeMillis <= tp0Var.c) {
                pb81 pb81Var = (pb81) rr41Var.c;
                String str = tp0Var.b;
                q63 q63Var = q63.d;
                ExecutorService executorService = pb81.d;
                pb81Var.a(str, q63Var, b.f());
            }
            if (this.h) {
                ((pf1) this.g.b).d(String.valueOf(this.l));
            }
        }
        this.l = 0L;
        this.j = null;
    }

    public final void c(f1 f1Var) {
        String str;
        Objects.toString(f1Var);
        this.l = System.currentTimeMillis();
        this.j = f1Var;
        if (f1Var == f1.c && this.h) {
            String str2 = null;
            HashMap hashMap = a(f1Var, null).b;
            d881 d881Var = this.b;
            no61 no61Var = d881Var != null ? d881Var.i : null;
            xz xzVar = this.a.a;
            long j = this.l;
            hn71 hn71Var = this.g;
            hn71Var.getClass();
            String valueOf = String.valueOf(j);
            ((om81) hn71Var.c).getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_type", xzVar.b);
            jSONObject.put("start_time", j);
            jSONObject.put("type", f1Var.b);
            tp0 tp0Var = this.c;
            if (tp0Var != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("interval", tp0Var.c);
                jSONObject2.put("url", tp0Var.b);
                str = jSONObject2.toString();
            } else {
                str = null;
            }
            jSONObject.put("false_click", str);
            jSONObject.put("report_data", new JSONObject(hashMap));
            if (no61Var != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("experiments", no61Var.a);
                jSONObject3.put("test_ids", no61Var.b);
                str2 = jSONObject3.toString();
            }
            jSONObject.put("ab_experiments", str2);
            ((pf1) hn71Var.b).a(valueOf, jSONObject.toString());
        }
    }
}
