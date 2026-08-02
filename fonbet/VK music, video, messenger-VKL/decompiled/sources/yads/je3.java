package yads;

/* loaded from: classes10.dex */
public final class je3 implements dy2 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public je3(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // yads.dy2
    public final long a() {
        return this.d;
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.c;
    }

    @Override // yads.dy2
    public final long a(long j) {
        return this.a[mc3.b(this.b, j, true)];
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        int b = mc3.b(this.a, j, true);
        long[] jArr = this.a;
        long j2 = jArr[b];
        long[] jArr2 = this.b;
        by2 by2Var = new by2(j2, jArr2[b]);
        if (j2 >= j || b == jArr.length - 1) {
            return new xx2(by2Var, by2Var);
        }
        int i = b + 1;
        return new xx2(by2Var, new by2(jArr[i], jArr2[i]));
    }
}
