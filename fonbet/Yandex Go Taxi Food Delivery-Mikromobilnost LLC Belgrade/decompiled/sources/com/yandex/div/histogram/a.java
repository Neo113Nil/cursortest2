package com.yandex.div.histogram;

import android.os.Build;
import android.os.SystemClock;
import defpackage.i3y;
import defpackage.llu;
import defpackage.sls;
import defpackage.uxi0;
import defpackage.v3c;
import defpackage.yxi0;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public final class a {
    public final sls a;
    public final sls b;
    public String c;
    public boolean d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public final i3y l = kotlin.a.b(LazyThreadSafetyMode.NONE, Div2ViewHistogramReporter$renderMetrics$2.b);

    public a(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    public static long a() {
        v3c.a.getClass();
        return (Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000;
    }

    public final yxi0 b() {
        return (yxi0) this.l.getValue();
    }

    public final void c() {
        long a;
        long longValue;
        Long l = this.e;
        Long l2 = this.f;
        Long l3 = this.g;
        yxi0 b = b();
        if (l != null) {
            if (l2 != null && l3 != null) {
                a = l2.longValue() + (a() - l3.longValue());
                longValue = l.longValue();
            } else if (l2 == null && l3 == null) {
                a = a();
                longValue = l.longValue();
            }
            b.a = a - longValue;
            llu.a((llu) this.a.invoke(), this.c, null, null, 24);
        }
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void d() {
        Long l = this.k;
        if (l != null) {
            b().d += a() - l.longValue();
        }
        if (this.d) {
            yxi0 b = b();
            llu lluVar = (llu) this.a.invoke();
            uxi0 uxi0Var = (uxi0) this.b.invoke();
            long j = b.a;
            llu.a(lluVar, this.c, null, uxi0Var.d, 8);
            llu.a(lluVar, this.c, null, uxi0Var.a, 8);
            llu.a(lluVar, this.c, null, uxi0Var.b, 8);
            llu.a(lluVar, this.c, null, uxi0Var.c, 8);
        }
        this.d = false;
        this.j = null;
        this.i = null;
        this.k = null;
        yxi0 b2 = b();
        b2.b = 0L;
        b2.c = 0L;
        b2.d = 0L;
        b2.a = 0L;
    }

    public final void e() {
        Long l = this.h;
        yxi0 b = b();
        if (l != null) {
            a();
            b.getClass();
            llu.a((llu) this.a.invoke(), this.c, null, null, 24);
        }
        this.h = null;
    }

    public final void f() {
        this.h = Long.valueOf(a());
    }
}
