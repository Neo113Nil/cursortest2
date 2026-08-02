package sg.bigo.ads.ad.interstitial;

import android.os.SystemClock;
import java.lang.reflect.Array;

/* loaded from: classes9.dex */
public final class l {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 5;
    int f = 6;
    int g = 7;
    int h = 8;
    int i = 9;
    int j = 1;
    int k = 2;
    long l = 0;
    long m = 0;
    long n = 0;
    int[] o = new int[10];
    long[] p = new long[10];
    long[] q = new long[10];
    boolean[][] r;
    boolean[][] s;
    boolean t;

    public l() {
        Class cls = Boolean.TYPE;
        this.r = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.s = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.t = false;
    }

    private int a() {
        return (this.l == 0 || SystemClock.elapsedRealtime() - this.l > 5000) ? this.k : this.j;
    }

    public final void b(sg.bigo.ads.api.core.b bVar, int i) {
        try {
            long[] jArr = this.p;
            if (jArr[i] == 0) {
                jArr[i] = SystemClock.elapsedRealtime();
            }
            if (this.q[i] != 0) {
                int[] iArr = this.o;
                int i2 = iArr[i];
                iArr[i] = 0;
                b(bVar, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    private void b(sg.bigo.ads.api.core.b bVar, int i, int i2) {
        try {
            boolean[] zArr = this.s[i2];
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            sg.bigo.ads.da.b.a(bVar, i, i2, SystemClock.elapsedRealtime() - this.q[i]);
        } catch (Exception unused) {
        }
    }

    public final void a(int i) {
        try {
            long[] jArr = this.p;
            if (jArr[i] == 0) {
                jArr[i] = SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(sg.bigo.ads.api.core.b bVar, int i) {
        try {
            this.q[i] = SystemClock.elapsedRealtime();
            this.o[i] = a();
            a(bVar, i, this.o[i]);
        } catch (Exception unused) {
        }
    }

    private void a(sg.bigo.ads.api.core.b bVar, int i, int i2) {
        long elapsedRealtime;
        long j;
        try {
            if (this.t) {
                return;
            }
            boolean[] zArr = this.r[i2];
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.p[i];
            if (i == this.a) {
                elapsedRealtime = SystemClock.elapsedRealtime();
                j = this.p[i];
            } else {
                elapsedRealtime = SystemClock.elapsedRealtime();
                j = this.m;
            }
            sg.bigo.ads.da.b.a(bVar, i, i2, elapsedRealtime2, elapsedRealtime - j);
        } catch (Exception unused) {
        }
    }
}
