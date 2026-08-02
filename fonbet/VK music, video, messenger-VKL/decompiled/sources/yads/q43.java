package yads;

/* loaded from: classes10.dex */
public final class q43 implements oq0 {
    public final oq0 a;
    public final long b;

    public q43(ld0 ld0Var, long j) {
        this.a = ld0Var;
        ni.a(ld0Var.a() >= j);
        this.b = j;
    }

    @Override // yads.oq0
    public final long a() {
        return this.a.a() - this.b;
    }

    @Override // yads.oq0
    public final void b(int i) {
        this.a.b(i);
    }

    @Override // yads.oq0
    public final long c() {
        return this.a.c() - this.b;
    }

    @Override // yads.oq0
    public final long getLength() {
        return this.a.getLength() - this.b;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // yads.oq0
    public final void readFully(byte[] bArr, int i, int i2) {
        this.a.readFully(bArr, i, i2);
    }

    @Override // yads.oq0
    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        return this.a.b(bArr, i, i2, z);
    }

    @Override // yads.oq0
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // yads.oq0
    public final void b() {
        this.a.b();
    }

    @Override // yads.oq0
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        return this.a.a(bArr, i, i2, z);
    }

    @Override // yads.oq0
    public final void a(int i) {
        this.a.a(i);
    }
}
