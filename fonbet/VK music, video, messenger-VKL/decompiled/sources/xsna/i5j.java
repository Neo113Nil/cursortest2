package xsna;

/* compiled from: ConstantBitrateSeeker.java */
/* loaded from: classes12.dex */
public final class i5j extends h5j implements i4i0 {
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public i5j(long j, long j2, int i, int i2, boolean z, boolean z2) {
        super(j, j2, i, i2, z, z2);
        long j3 = j;
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = j3 == -1 ? -1L : j3;
    }

    @Override // xsna.i4i0
    public final long b() {
        return this.m;
    }

    @Override // xsna.i4i0
    public final int getAverageBitrate() {
        return this.j;
    }

    @Override // xsna.i4i0
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }
}
