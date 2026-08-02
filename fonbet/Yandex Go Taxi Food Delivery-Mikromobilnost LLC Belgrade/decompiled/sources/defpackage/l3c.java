package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class l3c implements xyl0 {
    public final xyl0 a;
    public boolean b;
    public final /* synthetic */ m3c c;

    public l3c(m3c m3cVar, xyl0 xyl0Var) {
        this.c = m3cVar;
        this.a = xyl0Var;
    }

    @Override // defpackage.xyl0
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        return !this.c.a() && this.a.isReady();
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        m3c m3cVar = this.c;
        if (m3cVar.a()) {
            return -3;
        }
        if (this.b) {
            nygVar.a = 4;
            return -4;
        }
        long g = m3cVar.g();
        int q = this.a.q(o7sVar, nygVar, i);
        if (q != -5) {
            long j = m3cVar.y;
            if (j == Long.MIN_VALUE || ((q != -4 || nygVar.y < j) && !(q == -3 && g == Long.MIN_VALUE && !nygVar.x))) {
                return q;
            }
            nygVar.d();
            nygVar.a = 4;
            this.b = true;
            return -4;
        }
        a aVar = o7sVar.b;
        aVar.getClass();
        int i2 = aVar.H;
        int i3 = aVar.G;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (m3cVar.x != 0) {
            i3 = 0;
        }
        if (m3cVar.y != Long.MIN_VALUE) {
            i2 = 0;
        }
        f7s a = aVar.a();
        a.F = i3;
        a.G = i2;
        o7sVar.b = new a(a);
        return -5;
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.r(j);
    }
}
