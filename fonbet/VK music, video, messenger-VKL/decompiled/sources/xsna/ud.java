package xsna;

import android.util.Pair;
import xsna.ewo0;

/* compiled from: AbstractConcatenatedTimeline.java */
/* loaded from: classes12.dex */
public abstract class ud extends ewo0 {
    public static final /* synthetic */ int d = 0;
    public final int b;
    public final androidx.media3.exoplayer.source.r c;

    public ud(androidx.media3.exoplayer.source.r rVar) {
        this.c = rVar;
        this.b = rVar.getLength();
    }

    @Override // xsna.ewo0
    public final int a(boolean z) {
        if (this.b != 0) {
            int firstIndex = z ? this.c.getFirstIndex() : 0;
            while (x(firstIndex).p()) {
                firstIndex = w(firstIndex, z);
                if (firstIndex == -1) {
                }
            }
            return x(firstIndex).a(z) + v(firstIndex);
        }
        return -1;
    }

    @Override // xsna.ewo0
    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q = q(obj2);
        if (q == -1 || (b = x(q).b(obj3)) == -1) {
            return -1;
        }
        return u(q) + b;
    }

    @Override // xsna.ewo0
    public final int c(boolean z) {
        int i = this.b;
        if (i != 0) {
            androidx.media3.exoplayer.source.r rVar = this.c;
            int lastIndex = z ? rVar.getLastIndex() : i - 1;
            while (x(lastIndex).p()) {
                lastIndex = z ? rVar.getPreviousIndex(lastIndex) : lastIndex > 0 ? lastIndex - 1 : -1;
                if (lastIndex == -1) {
                }
            }
            return x(lastIndex).c(z) + v(lastIndex);
        }
        return -1;
    }

    @Override // xsna.ewo0
    public final int e(int i, int i2, boolean z) {
        int s = s(i);
        int v = v(s);
        int e = x(s).e(i - v, i2 == 2 ? 0 : i2, z);
        if (e != -1) {
            return v + e;
        }
        int w = w(s, z);
        while (w != -1 && x(w).p()) {
            w = w(w, z);
        }
        if (w != -1) {
            return x(w).a(z) + v(w);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // xsna.ewo0
    public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
        int r = r(i);
        int v = v(r);
        x(r).f(i - u(r), bVar, z);
        bVar.c += v;
        if (z) {
            Object t = t(r);
            Object obj = bVar.b;
            obj.getClass();
            bVar.b = Pair.create(t, obj);
        }
        return bVar;
    }

    @Override // xsna.ewo0
    public final ewo0.b g(Object obj, ewo0.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q = q(obj2);
        int v = v(q);
        x(q).g(obj3, bVar);
        bVar.c += v;
        bVar.b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0025, code lost:
    
        if (r0 > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002b, code lost:
    
        r0 = r0 - 1;
     */
    @Override // xsna.ewo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i, int i2, boolean z) {
        int i3;
        int s = s(i);
        int v = v(s);
        int k = x(s).k(i - v, i2 == 2 ? 0 : i2, z);
        if (k != -1) {
            return v + k;
        }
        androidx.media3.exoplayer.source.r rVar = this.c;
        if (z) {
            i3 = rVar.getPreviousIndex(s);
        }
        while (i3 != -1 && x(i3).p()) {
            i3 = z ? rVar.getPreviousIndex(i3) : i3 > 0 ? i3 - 1 : -1;
        }
        if (i3 != -1) {
            return x(i3).c(z) + v(i3);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // xsna.ewo0
    public final Object l(int i) {
        int r = r(i);
        return Pair.create(t(r), x(r).l(i - u(r)));
    }

    @Override // xsna.ewo0
    public final ewo0.c m(int i, ewo0.c cVar, long j) {
        int s = s(i);
        int v = v(s);
        int u = u(s);
        x(s).m(i - v, cVar, j);
        Object t = t(s);
        if (!ewo0.c.q.equals(cVar.a)) {
            t = Pair.create(t, cVar.a);
        }
        cVar.a = t;
        cVar.n += u;
        cVar.o += u;
        return cVar;
    }

    public abstract int q(Object obj);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract Object t(int i);

    public abstract int u(int i);

    public abstract int v(int i);

    public final int w(int i, boolean z) {
        if (z) {
            return this.c.getNextIndex(i);
        }
        if (i < this.b - 1) {
            return i + 1;
        }
        return -1;
    }

    public abstract ewo0 x(int i);
}
