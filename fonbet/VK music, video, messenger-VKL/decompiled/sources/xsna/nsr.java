package xsna;

import com.unity3d.services.UnityAdsConstants;
import one.video.streaming.tools.TimeMachine;

/* compiled from: FlowControl.java */
/* loaded from: classes8.dex */
public final class nsr {
    public final zvo0 a;
    public final q600 b;
    public int c;
    public long d;
    public int e;
    public int f;
    public final m06 i;
    public long k;
    public final TimeMachine l;
    public final kkx0 g = new kkx0(0.1f);
    public final kkx0 h = new kkx0(0.1f);
    public long j = 10000000;

    public nsr(TimeMachine timeMachine, int i) {
        this.l = timeMachine;
        zvo0 zvo0Var = new zvo0(timeMachine);
        this.a = zvo0Var;
        this.b = new q600(timeMachine);
        this.c = i;
        this.i = new m06(timeMachine);
        a();
        new msr(this, timeMachine);
        zvo0Var.b();
    }

    public final void a() {
        int i;
        double d;
        double d2;
        float f;
        float f2 = (long) this.i.f;
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = this.b.a.b;
            if (!Float.isNaN(f3)) {
                double d3 = f3;
                if (d3 < 1.0E-4d) {
                    f = 100.0f;
                } else {
                    if (d3 < 0.001d) {
                        d = f2;
                        d2 = 2.5d;
                    } else if (d3 < 0.01d) {
                        d = f2;
                        d2 = 2.0d;
                    } else if (d3 < 0.05d) {
                        d = f2;
                        d2 = 1.05d;
                    } else if (d3 < 0.1d) {
                        f = 1.0f;
                    } else if (d3 < 0.15d) {
                        d = f2;
                        d2 = 0.95d;
                    } else {
                        d = f2;
                        d2 = 0.9d;
                    }
                    f2 = (float) (d * d2);
                }
                f2 *= f;
            }
            i = Math.max((int) f2, 5000);
        } else {
            i = 10000000;
        }
        long a = this.a.a(0L);
        if (a > 3000) {
            i /= 10;
        } else if (a > 2000) {
            i = (i * 5) / 10;
        } else if (a > 1500) {
            i = (i * 9) / 10;
        }
        if (a > 5000) {
            i = Math.min(2000, i);
        }
        long j = i;
        this.j = j;
        Math.min((j / 8) / 4, this.c);
    }
}
