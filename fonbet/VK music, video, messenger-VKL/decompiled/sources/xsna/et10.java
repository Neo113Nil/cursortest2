package xsna;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes12.dex */
public final class et10 {
    public final Object a;
    public final Object b;
    public final m0h0[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ft10 g;
    public boolean h;
    public final boolean[] i;
    public final androidx.media3.exoplayer.k[] j;
    public final chp0 k;
    public final androidx.media3.exoplayer.h l;

    @Nullable
    public et10 m;
    public qfp0 n;
    public ehp0 o;
    public long p;

    public et10(androidx.media3.exoplayer.k[] kVarArr, long j, chp0 chp0Var, xu1 xu1Var, androidx.media3.exoplayer.h hVar, ft10 ft10Var, ehp0 ehp0Var) {
        this.j = kVarArr;
        this.p = j;
        this.k = chp0Var;
        this.l = hVar;
        i.b bVar = ft10Var.a;
        this.b = bVar.a;
        this.g = ft10Var;
        this.n = qfp0.d;
        this.o = ehp0Var;
        this.c = new m0h0[kVarArr.length];
        this.i = new boolean[kVarArr.length];
        long j2 = ft10Var.b;
        long j3 = ft10Var.d;
        boolean z = ft10Var.f;
        hVar.getClass();
        Object obj = bVar.a;
        int i = ud.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        i.b a = bVar.a(pair.second);
        h.c cVar = (h.c) hVar.d.get(obj2);
        cVar.getClass();
        hVar.g.add(cVar);
        h.b bVar2 = hVar.f.get(cVar);
        if (bVar2 != null) {
            bVar2.a.c(bVar2.b);
        }
        cVar.c.add(a);
        androidx.media3.exoplayer.source.h m = cVar.a.m(a, xu1Var, j2);
        hVar.c.put(m, cVar);
        hVar.c();
        this.a = j3 != C.TIME_UNSET ? new androidx.media3.exoplayer.source.b(m, !z, 0L, j3) : m;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    public final long a(ehp0 ehp0Var, long j, boolean z, boolean[] zArr) {
        androidx.media3.exoplayer.k[] kVarArr;
        m0h0[] m0h0VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= ehp0Var.a) {
                break;
            }
            if (z || !ehp0Var.a(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            kVarArr = this.j;
            int length = kVarArr.length;
            m0h0VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (kVarArr[i2].getTrackType() == -2) {
                m0h0VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = ehp0Var;
        c();
        long h = this.a.h(ehp0Var.c, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < kVarArr.length; i3++) {
            if (kVarArr[i3].getTrackType() == -2 && this.o.b(i3)) {
                m0h0VarArr[i3] = new chp();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < m0h0VarArr.length; i4++) {
            if (m0h0VarArr[i4] != null) {
                fxc0.z(ehp0Var.b(i4));
                if (kVarArr[i4].getTrackType() != -2) {
                    this.f = true;
                }
            } else {
                fxc0.z(ehp0Var.c[i4] == null);
            }
        }
        return h;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ehp0 ehp0Var = this.o;
            if (i >= ehp0Var.a) {
                return;
            }
            boolean b = ehp0Var.b(i);
            d7q d7qVar = this.o.c[i];
            if (b && d7qVar != null) {
                d7qVar.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ehp0 ehp0Var = this.o;
            if (i >= ehp0Var.a) {
                return;
            }
            boolean b = ehp0Var.b(i);
            d7q d7qVar = this.o.c[i];
            if (b && d7qVar != null) {
                d7qVar.enable();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.exoplayer.source.q, java.lang.Object] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long bufferedPositionUs = this.f ? this.a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.g.e : bufferedPositionUs;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    public final void f(float f, ewo0 ewo0Var, boolean z) throws ExoPlaybackException {
        this.e = true;
        this.n = this.a.getTrackGroups();
        ehp0 j = j(f, ewo0Var, z);
        ft10 ft10Var = this.g;
        long j2 = ft10Var.b;
        long j3 = ft10Var.e;
        if (j3 != C.TIME_UNSET && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        ft10 ft10Var2 = this.g;
        this.p = (ft10Var2.b - a) + j4;
        this.g = ft10Var2.b(a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.q, java.lang.Object] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= C.TIME_UNSET;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    public final void i() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof androidx.media3.exoplayer.source.b;
            androidx.media3.exoplayer.h hVar = this.l;
            if (z) {
                hVar.f(((androidx.media3.exoplayer.source.b) r0).b);
            } else {
                hVar.f(r0);
            }
        } catch (RuntimeException e) {
            ahn.o("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final ehp0 j(float f, ewo0 ewo0Var, boolean z) throws ExoPlaybackException {
        d7q[] d7qVarArr;
        qfp0 qfp0Var = this.n;
        i.b bVar = this.g.a;
        chp0 chp0Var = this.k;
        androidx.media3.exoplayer.k[] kVarArr = this.j;
        ehp0 g = chp0Var.g(kVarArr, qfp0Var, bVar, ewo0Var);
        int i = 0;
        while (true) {
            int i2 = g.a;
            d7qVarArr = g.c;
            if (i >= i2) {
                break;
            }
            if (g.b(i)) {
                if (d7qVarArr[i] == null && kVarArr[i].getTrackType() != -2) {
                    r5 = false;
                }
                fxc0.z(r5);
            } else {
                fxc0.z(d7qVarArr[i] == null);
            }
            i++;
        }
        for (d7q d7qVar : d7qVarArr) {
            if (d7qVar != null) {
                d7qVar.onPlaybackSpeed(f);
                d7qVar.c(z);
            }
        }
        return g;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof androidx.media3.exoplayer.source.b) {
            long j = this.g.d;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            androidx.media3.exoplayer.source.b bVar = (androidx.media3.exoplayer.source.b) obj;
            bVar.g = 0L;
            bVar.h = j;
        }
    }
}
