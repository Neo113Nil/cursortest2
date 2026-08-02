package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class ie0 implements t62 {
    public final Context a;
    public final d4 b;
    public final ov2 c;
    public final v9 d;

    public ie0(Context context, v9 v9Var, ov2 ov2Var, d4 d4Var) {
        this.a = context;
        this.b = d4Var;
        this.c = ov2Var;
        this.d = v9Var;
    }

    @Override // yads.t62
    public final q62 a() {
        Context context = this.a;
        d4 d4Var = this.b;
        ov2 ov2Var = this.c;
        v9 v9Var = this.d;
        qu2 a = gx2.a().a(context);
        Context applicationContext = context.getApplicationContext();
        zd0 zd0Var = null;
        ne2 ne2Var = a != null ? a.O0 : null;
        if (ne2Var != null) {
            Integer num = ne2Var.a;
            int intValue = num != null ? num.intValue() : 50000;
            Integer num2 = ne2Var.b;
            int intValue2 = num2 != null ? num2.intValue() : 50000;
            Integer num3 = ne2Var.c;
            int intValue3 = num3 != null ? num3.intValue() : 2500;
            Integer num4 = ne2Var.d;
            int intValue4 = num4 != null ? num4.intValue() : 5000;
            zd0.a(intValue3, 0, "bufferForPlaybackMs", "0");
            zd0.a(intValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            zd0.a(intValue, intValue3, "minBufferMs", "bufferForPlaybackMs");
            zd0.a(intValue, intValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            zd0.a(intValue2, intValue, "maxBufferMs", "minBufferMs");
            Integer num5 = ne2Var.e;
            zd0Var = new zd0(new ib0(0), intValue, intValue2, intValue3, intValue4, num5 != null ? num5.intValue() : -1, true);
        }
        sn0 sn0Var = new sn0(applicationContext);
        pe0 pe0Var = new pe0(applicationContext);
        pe0Var.d = true;
        sn0 c = sn0Var.c(pe0Var);
        if (zd0Var != null) {
            c.a(zd0Var);
        }
        if (c.r) {
            throw new IllegalStateException();
        }
        c.r = true;
        return new tp0(new ao0(c), new mo1(applicationContext, new ko1()), new uj3(applicationContext, d4Var, ov2Var, v9Var), new p62(), new jk3());
    }
}
