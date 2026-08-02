package yads;

import android.content.Context;
import java.util.Locale;
import kotlin.Result;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.drm0;
import xsna.swe0;

/* loaded from: classes10.dex */
public final class b52 {
    public final kg1 a;
    public final lj b;
    public final wb3 c;
    public final y51 d;
    public final mi0 e;
    public final dg0 f;
    public final x52 g;
    public final vz2 h;
    public final vk1 i;
    public final ic j;
    public final bf k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b52(Context context, bu1 bu1Var) {
        this(r1, new lj(context, bu1Var, r1, 8), new wb3(), new y51(), new mi0(bu1Var), new dg0(), new x52(), new vz2(), new vk1(), new ic(bu1Var), new bf());
        kg1 kg1Var = new kg1(context, bu1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.Result$Failure] */
    public final tz2 a(JSONObject jSONObject) {
        Object failure;
        Object failure2;
        uz2 failure3;
        if (!c52.a(jSONObject, "delay", "url")) {
            throw new a22("Native Ad json has not required attributes");
        }
        long j = jSONObject.getLong("delay");
        this.c.getClass();
        String a = wb3.a("url", jSONObject);
        try {
            failure = Double.valueOf(jSONObject.optInt("visibilityPercent", 0));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Double d = (Double) failure;
        int e = (int) swe0.e(d != null ? d.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 100.0d);
        try {
            failure2 = jSONObject.getString("type");
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        if (failure2 instanceof Result.Failure) {
            failure2 = null;
        }
        String str = (String) failure2;
        if (str != null) {
            try {
                failure3 = uz2.valueOf(str.toUpperCase(Locale.ROOT));
            } catch (Throwable th3) {
                failure3 = new Result.Failure(th3);
            }
            r5 = failure3 instanceof Result.Failure ? null : failure3;
        }
        if (r5 == null) {
            this.h.getClass();
            r5 = drm0.D(a, "/rtbcount/", false) ? uz2.c : drm0.D(a, "/count/", false) ? uz2.b : uz2.d;
        }
        return new tz2(e, j, r5, a);
    }

    public b52(kg1 kg1Var, lj ljVar, wb3 wb3Var, y51 y51Var, mi0 mi0Var, dg0 dg0Var, x52 x52Var, vz2 vz2Var, vk1 vk1Var, ic icVar, bf bfVar) {
        this.a = kg1Var;
        this.b = ljVar;
        this.c = wb3Var;
        this.d = y51Var;
        this.e = mi0Var;
        this.f = dg0Var;
        this.g = x52Var;
        this.h = vz2Var;
        this.i = vk1Var;
        this.j = icVar;
        this.k = bfVar;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final yads.e22 a(java.lang.String r51, yads.kn r52) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.b52.a(java.lang.String, yads.kn):yads.e22");
    }
}
