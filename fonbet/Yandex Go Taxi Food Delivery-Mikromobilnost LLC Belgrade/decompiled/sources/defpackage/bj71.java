package defpackage;

import android.os.SystemClock;

/* loaded from: classes7.dex */
public final /* synthetic */ class bj71 {
    public final /* synthetic */ cj71 a;

    public final void a(int i) {
        cj71 cj71Var = this.a;
        synchronized (cj71Var) {
            int i2 = cj71Var.i;
            if (i2 == 0 || cj71Var.e) {
                if (i2 == i) {
                    return;
                }
                cj71Var.i = i;
                if (i != 1 && i != 0 && i != 8) {
                    cj71Var.l = cj71Var.a(i);
                    cj71Var.d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i3 = cj71Var.f > 0 ? (int) (elapsedRealtime - cj71Var.g) : 0;
                    long j = cj71Var.h;
                    long j2 = cj71Var.l;
                    if (i3 != 0 || j != 0 || j2 != cj71Var.m) {
                        cj71Var.m = j2;
                        cj71Var.b.a(i3, j, j2);
                    }
                    cj71Var.g = elapsedRealtime;
                    cj71Var.h = 0L;
                    cj71Var.k = 0L;
                    cj71Var.j = 0L;
                    d271 d271Var = cj71Var.c;
                    d271Var.a.clear();
                    d271Var.c = -1;
                    d271Var.d = 0;
                    d271Var.e = 0;
                }
            }
        }
    }
}
