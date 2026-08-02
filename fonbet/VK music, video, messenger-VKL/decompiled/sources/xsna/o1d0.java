package xsna;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.h;
import java.io.IOException;
import java.util.Objects;

/* compiled from: PreloadMediaPeriod.java */
/* loaded from: classes8.dex */
public final class o1d0 implements androidx.media3.exoplayer.source.h {
    public final androidx.media3.exoplayer.source.h b;
    public boolean c;
    public boolean d;

    @Nullable
    public h.a e;

    @Nullable
    public a f;

    /* compiled from: PreloadMediaPeriod.java */
    public static class a {
        public final d7q[] a;
        public final boolean[] b;
        public final m0h0[] c;
        public final boolean[] d;
        public final long e;

        public a(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
            this.a = d7qVarArr;
            this.b = zArr;
            this.c = m0h0VarArr;
            this.d = zArr2;
            this.e = j;
        }
    }

    public o1d0(androidx.media3.exoplayer.source.h hVar) {
        this.b = hVar;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        return this.b.a(j, o3i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        boolean z;
        a aVar = this.f;
        if (aVar == null) {
            return this.b.h(d7qVarArr, zArr, m0h0VarArr, zArr2, j);
        }
        boolean z2 = false;
        fxc0.z(m0h0VarArr.length == aVar.c.length);
        a aVar2 = this.f;
        long j2 = aVar2.e;
        m0h0[] m0h0VarArr2 = aVar2.c;
        boolean[] zArr3 = aVar2.b;
        d7q d7qVar = null;
        if (j == j2) {
            d7q[] d7qVarArr2 = d7qVarArr;
            boolean[] zArr4 = aVar2.d;
            d7q[] d7qVarArr3 = aVar2.a;
            int i = 0;
            boolean z3 = false;
            while (i < d7qVarArr2.length) {
                d7q d7qVar2 = d7qVarArr2[i];
                d7q d7qVar3 = d7qVar;
                d7q d7qVar4 = d7qVarArr3[i];
                if (d7qVar2 != null || d7qVar4 != null) {
                    zArr3[i] = z2;
                    if (d7qVar2 == null) {
                        d7qVarArr3[i] = d7qVar3;
                    } else if (d7qVar4 == null) {
                        d7qVarArr3[i] = d7qVar2;
                    } else {
                        if (Objects.equals(d7qVar2.getTrackGroup(), d7qVar4.getTrackGroup()) && d7qVar2.length() == d7qVar4.length()) {
                            for (int i2 = 0; i2 < d7qVar2.length(); i2++) {
                                if (d7qVar2.getIndexInTrackGroup(i2) == d7qVar4.getIndexInTrackGroup(i2)) {
                                }
                            }
                            if (d7qVar2.getTrackGroup().c != 2) {
                                z = true;
                                if (d7qVar2.getTrackGroup().c != 1 && d7qVar2.getSelectedIndexInTrackGroup() != d7qVar4.getSelectedIndexInTrackGroup()) {
                                    d7qVarArr3[i] = d7qVar2;
                                    z3 = true;
                                }
                            } else {
                                z = true;
                            }
                            zArr3[i] = z;
                        }
                        d7qVarArr3[i] = d7qVar2;
                    }
                    z3 = true;
                    break;
                }
                i++;
                d7qVarArr2 = d7qVarArr;
                d7qVar = d7qVar3;
                z2 = false;
            }
            a aVar3 = d7qVar;
            if (z3) {
                boolean[] zArr5 = new boolean[zArr4.length];
                j2 = this.b.h(aVar2.a, zArr3, m0h0VarArr2, zArr5, aVar2.e);
                for (int i3 = 0; i3 < zArr3.length; i3++) {
                    if (zArr3[i3]) {
                        zArr5[i3] = true;
                    }
                }
                zArr4 = zArr5;
            }
            System.arraycopy(m0h0VarArr2, 0, m0h0VarArr, 0, m0h0VarArr2.length);
            System.arraycopy(zArr4, 0, zArr2, 0, zArr4.length);
            this.f = aVar3;
            return j2;
        }
        int i4 = 0;
        while (true) {
            m0h0[] m0h0VarArr3 = this.f.c;
            if (i4 >= m0h0VarArr3.length) {
                this.f = null;
                return this.b.h(d7qVarArr, zArr, m0h0VarArr, zArr2, j);
            }
            m0h0 m0h0Var = m0h0VarArr3[i4];
            if (m0h0Var != null) {
                m0h0VarArr[i4] = m0h0Var;
                zArr[i4] = false;
            }
            i4++;
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        this.b.discardBuffer(j, z);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        this.e = aVar;
        if (this.c) {
            aVar.b(this);
        } else {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.e(new n1d0(this), j);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        return this.b.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        return this.b.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        return this.b.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        return b(d7qVarArr, zArr, m0h0VarArr, zArr2, j);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        return this.b.k(fVar);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        this.b.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        return this.b.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        this.b.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long seekToUs(long j) {
        return this.b.seekToUs(j);
    }
}
