package defpackage;

/* loaded from: classes10.dex */
public final class g8q0 implements xc7, ok71 {
    public final long a;
    public final int b;
    public long c;
    public int w;
    public final Object x;

    public /* synthetic */ g8q0(int i, int i2, long j, long j2, Object obj) {
        this.x = obj;
        this.a = j;
        this.b = i;
        this.c = j2;
        this.w = i2;
    }

    @Override // defpackage.xc7
    public void a(long j, long j2, long j3) {
        long j4 = this.c + j3;
        this.c = j4;
        ((t7m) this.x).b(this.a, b(), j4);
    }

    public float b() {
        float f;
        float f2;
        long j = this.a;
        if (j == -1 || j == 0) {
            int i = this.b;
            if (i == 0) {
                return -1.0f;
            }
            f = this.w * 100.0f;
            f2 = i;
        } else {
            f = this.c * 100.0f;
            f2 = j;
        }
        return f / f2;
    }

    @Override // defpackage.ok71
    public void c(long j, long j2, long j3) {
        float f;
        float f2;
        float f3;
        long j4 = this.c + j3;
        this.c = j4;
        zv71 zv71Var = (zv71) this.x;
        long j5 = this.a;
        if (j5 == -1 || j5 == 0) {
            int i = this.b;
            if (i == 0) {
                f = -1.0f;
                zv71Var.a(j5, f, j4);
            } else {
                f2 = this.w * 100.0f;
                f3 = i;
            }
        } else {
            f2 = j4 * 100.0f;
            f3 = j5;
        }
        f = f2 / f3;
        zv71Var.a(j5, f, j4);
    }
}
