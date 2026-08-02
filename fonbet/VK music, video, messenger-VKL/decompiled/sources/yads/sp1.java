package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class sp1 {
    public final yp1 a;
    public final it1 b;

    public /* synthetic */ sp1(yp1 yp1Var) {
        this(yp1Var, new it1());
    }

    public final com.monetization.ads.mediation.base.a a(Context context, rr1 rr1Var, Class cls) {
        com.monetization.ads.mediation.base.a aVar = null;
        try {
            String str = rr1Var.b;
            this.b.getClass();
            if (it1.a.contains(str) && !qr0.a(context, pr0.d)) {
                return null;
            }
            Object a = pn2.a(str, new Object[0]);
            com.monetization.ads.mediation.base.a aVar2 = (com.monetization.ads.mediation.base.a) cls.cast(a);
            if (aVar2 == null) {
                try {
                    a(context, rr1Var, a == null ? String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{str}, 1)) : String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{a.getClass().getName(), cls.getName()}, 2)));
                } catch (ClassCastException e) {
                    e = e;
                    aVar = aVar2;
                    a(context, rr1Var, "does_not_conform_to_protocol", e);
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar2;
                    a(context, rr1Var, "could_not_create_adapter", th);
                    return aVar;
                }
            }
            return aVar2;
        } catch (ClassCastException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public sp1(yp1 yp1Var, it1 it1Var) {
        this.a = yp1Var;
        this.b = it1Var;
    }

    public final void a(Context context, rr1 rr1Var, String str) {
        Map k = pn00.k(new Pair("reason", "could_not_create_adapter"), new Pair("description", str));
        yp1 yp1Var = this.a;
        yp1Var.getClass();
        yp1Var.a(context, dp2.f, rr1Var, null, k);
    }

    public final void a(Context context, rr1 rr1Var, String str, Throwable th) {
        LinkedHashMap m = pn00.m(new Pair("reason", str));
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        m.put("description", th.getClass().getName() + " " + message);
        this.a.a(context, rr1Var, m);
    }
}
