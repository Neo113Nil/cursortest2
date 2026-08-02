package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.Result;
import org.json.JSONObject;
import yads.yw2;

/* loaded from: classes7.dex */
public final class eo61 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public eo61(Context context, ge71 ge71Var) {
        lm71 lm71Var = new lm71(context, ge71Var);
        nr41 nr41Var = new nr41(context, ge71Var, lm71Var, 8);
        sh81 sh81Var = new sh81();
        uw81 uw81Var = new uw81();
        fp71 fp71Var = new fp71(ge71Var);
        pp61 pp61Var = new pp61();
        ih81 ih81Var = new ih81();
        x291 x291Var = new x291();
        wy71 wy71Var = new wy71();
        mh61 mh61Var = new mh61(ge71Var);
        km71 km71Var = new km71();
        this.a = lm71Var;
        this.b = nr41Var;
        this.c = sh81Var;
        this.d = uw81Var;
        this.e = fp71Var;
        this.f = pp61Var;
        this.g = ih81Var;
        this.h = x291Var;
        this.i = wy71Var;
        this.j = mh61Var;
        this.k = km71Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public defpackage.qb71 a(java.lang.String r60, defpackage.zy2 r61) {
        /*
            Method dump skipped, instructions count: 2098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo61.a(java.lang.String, zy2):qb71");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.Result$Failure] */
    public qt81 b(JSONObject jSONObject) {
        Object failure;
        Object failure2;
        yw2 failure3;
        if (!y6a1.a(jSONObject, "delay", "url")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        long j = jSONObject.getLong("delay");
        ((sh81) this.c).getClass();
        String a = sh81.a("url", jSONObject);
        try {
            failure = Double.valueOf(jSONObject.optInt("visibilityPercent", 0));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Double d = (Double) failure;
        int b = (int) y6i0.b(d != null ? d.doubleValue() : 0.0d, 0.0d, 100.0d);
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
                failure3 = yw2.valueOf(str.toUpperCase(Locale.ROOT));
            } catch (Throwable th3) {
                failure3 = new Result.Failure(th3);
            }
            r5 = failure3 instanceof Result.Failure ? null : failure3;
        }
        if (r5 == null) {
            ((x291) this.h).getClass();
            r5 = evu0.y(a, "/rtbcount/", false) ? yw2.c : evu0.y(a, "/count/", false) ? yw2.b : yw2.d;
        }
        return new qt81(b, j, a, r5);
    }

    public eo61(h420 h420Var, h420 h420Var2, q150 q150Var, xvf0 xvf0Var, br10 br10Var, wvq wvqVar, kyd kydVar, bhx bhxVar, n3w n3wVar, eqh eqhVar, xvf0 xvf0Var2) {
        this.a = h420Var;
        this.b = h420Var2;
        this.c = q150Var;
        this.d = xvf0Var;
        this.e = br10Var;
        this.f = wvqVar;
        this.g = kydVar;
        this.h = bhxVar;
        this.i = n3wVar;
        this.j = eqhVar;
        this.k = xvf0Var2;
    }
}
