package defpackage;

/* loaded from: classes10.dex */
public abstract class gru0 {
    public g001 b;
    public d5p c;
    public uv60 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final sv60 a = new sv60();
    public zxs0 j = new zxs0();

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(ef90 ef90Var);

    public abstract boolean c(ef90 ef90Var, long j, zxs0 zxs0Var);

    public void d(boolean z) {
        if (z) {
            this.j = new zxs0();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
