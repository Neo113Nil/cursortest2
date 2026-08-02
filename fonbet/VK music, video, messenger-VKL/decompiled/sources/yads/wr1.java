package yads;

import android.content.Context;
import android.os.SystemClock;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.gcy0;

/* loaded from: classes10.dex */
public final class wr1 {
    public final Executor a;
    public final sp1 b;
    public final tr1 c;
    public final sr1 d;
    public final hp1 e;

    public wr1(Executor executor, sp1 sp1Var, tr1 tr1Var, sr1 sr1Var, hp1 hp1Var) {
        this.a = executor;
        this.b = sp1Var;
        this.c = tr1Var;
        this.d = sr1Var;
        this.e = hp1Var;
    }

    public final void a(final Context context, e13 e13Var, final rr1 rr1Var, final ep epVar, final ur1 ur1Var) {
        final gp1 gp1Var;
        gp1 gp1Var2;
        Executor executor;
        Runnable runnable;
        String str;
        final com.monetization.ads.mediation.base.a a = this.b.a(context, rr1Var, com.monetization.ads.mediation.base.a.class);
        if (a != null) {
            this.e.getClass();
            gp1Var = new gp1(a);
        } else {
            gp1Var = null;
        }
        if (!(a instanceof MediatedBidderTokenLoader)) {
            if (a == null) {
                ((gcy0) ur1Var).a(null);
                return;
            } else {
                a(context, rr1Var, gp1Var, "Can't create bidder token loader.", null, ur1Var);
                return;
            }
        }
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final HashMap hashMap = new HashMap(rr1Var.c);
            Map map = rr1Var.h;
            if (map != null && (str = (String) map.get("app_id")) != null) {
                hashMap.put("app_id", str);
            }
            if (e13Var != null) {
                hashMap.put("width", String.valueOf(e13Var.getWidth()));
                hashMap.put("height", String.valueOf(e13Var.getHeight()));
            }
            executor = this.a;
            runnable = new Runnable() { // from class: xsna.biz0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.wr1.a(com.monetization.ads.mediation.base.a.this, context, hashMap, rr1Var, this, gp1Var, ur1Var, epVar, elapsedRealtime);
                }
            };
            gp1Var2 = gp1Var;
        } catch (Throwable th) {
            th = th;
            gp1Var2 = gp1Var;
        }
        try {
            executor.execute(runnable);
        } catch (Throwable th2) {
            th = th2;
            a(context, rr1Var, gp1Var2, th.toString(), null, ur1Var);
        }
    }

    public /* synthetic */ wr1(yp1 yp1Var) {
        this(oh1.a().a(), new sp1(yp1Var), new tr1(), new sr1(yp1Var), new hp1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.monetization.ads.mediation.base.a aVar, Context context, HashMap hashMap, rr1 rr1Var, wr1 wr1Var, gp1 gp1Var, ur1 ur1Var, ep epVar, long j) {
        ((MediatedBidderTokenLoader) aVar).loadBidderToken(context, hashMap, new vr1(rr1Var, wr1Var, context, gp1Var, ur1Var, epVar, j));
    }

    public final void a(Context context, rr1 rr1Var, gp1 gp1Var, String str, Long l, ur1 ur1Var) {
        MediatedAdapterInfo b;
        sr1 sr1Var = this.d;
        sr1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("failure_reason", str);
        linkedHashMap.put("status", "error");
        if (l != null) {
            linkedHashMap.put("response_time", l);
        }
        if (gp1Var != null) {
            sr1Var.b.getClass();
            linkedHashMap.putAll(tp1.a(gp1Var));
        }
        String networkName = (gp1Var == null || (b = gp1Var.b()) == null) ? null : b.getNetworkName();
        yp1 yp1Var = sr1Var.a;
        yp1Var.getClass();
        yp1Var.a(context, dp2.i, rr1Var, networkName, linkedHashMap);
        ((gcy0) ur1Var).a(null);
    }
}
