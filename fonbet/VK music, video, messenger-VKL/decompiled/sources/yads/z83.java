package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import xsna.epx;
import xsna.ttp0;

/* loaded from: classes10.dex */
public abstract class z83 extends po {
    public final we A;
    public final o9 B;
    public final d4 w;
    public final Object x;
    public final gq2 y;
    public final jp2 z;

    public /* synthetic */ z83(Context context, d4 d4Var, int i, String str, oo ooVar, Object obj, gq2 gq2Var, vp2 vp2Var, bu1 bu1Var, int i2) {
        this(context, d4Var, i, str, ooVar, obj, gq2Var, (i2 & 128) != 0 ? null : vp2Var, bu1Var, new we(context), new o9());
    }

    @Override // yads.po, yads.qp2
    public mn3 a(mn3 mn3Var) {
        try {
            g92 g92Var = mn3Var.b;
            this.z.a(this.y.a(null, g92Var != null ? g92Var.a : -1, this.x));
            return mn3Var;
        } catch (Throwable th) {
            this.z.reportError("Failed to parse network error", th);
            return new h4(m4.p, null);
        }
    }

    public abstract wq2 a(g92 g92Var, int i);

    @Override // yads.qp2
    public Map d() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(this.w.b.a.c);
        return mapBuilder.h();
    }

    public final void n() {
        fp2 a = this.y.a(this.x);
        this.z.a(a);
        String str = a.a;
        dp2 dp2Var = dp2.k;
        if (epx.f(str, "ad_request")) {
            this.A.a(dp2Var, a.b, null, null);
        }
    }

    public z83(Context context, d4 d4Var, int i, String str, oo ooVar, Object obj, gq2 gq2Var, vp2 vp2Var, bu1 bu1Var, we weVar, o9 o9Var) {
        super(context, i, str, ooVar, vp2Var);
        this.w = d4Var;
        this.x = obj;
        this.y = gq2Var;
        this.z = bu1Var;
        this.A = weVar;
        this.B = o9Var;
        a(context);
        l();
        m();
        n();
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        try {
            int i = g92Var.a;
            wq2 a = a(g92Var, i);
            a(g92Var, a, i);
            return a;
        } catch (Throwable th) {
            this.z.reportError("Failed to parse network response", th);
            return new wq2(new h4(m4.p, null));
        }
    }

    public final void a(g92 g92Var, wq2 wq2Var, int i) {
        fp2 a = this.y.a(wq2Var, i, this.x);
        Map map = a.b;
        if (!ttp0.g(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String c = u01.c(g92Var.c, w11.q);
        if (c != null) {
            map.put("server_log_id", c);
        }
        Map map2 = g92Var.c;
        if (map2 != null) {
            w9.a(map2);
        }
        this.z.a(a);
    }

    public final void a(Context context) {
        int i;
        Integer num;
        Integer num2;
        qu2 a = gx2.a().a(context);
        if (a != null && (num2 = a.w0) != null) {
            i = num2.intValue();
        } else {
            i = z11.a;
        }
        this.B.a.getClass();
        qu2 a2 = gx2.a().a(context);
        this.o = new qe0(1.0f, i, (a2 == null || (num = a2.M) == null) ? 0 : num.intValue());
    }
}
