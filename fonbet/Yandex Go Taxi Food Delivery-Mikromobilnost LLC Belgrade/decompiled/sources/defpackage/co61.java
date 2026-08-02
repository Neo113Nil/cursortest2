package defpackage;

/* loaded from: classes7.dex */
public abstract class co61 {
    public fb81 b;
    public yg71 c;
    public dx81 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final pr81 a = new pr81();
    public lg61 j = new lg61();

    public abstract long a(dl81 dl81Var);

    public void b(long j) {
        this.g = j;
    }

    public void c(boolean z) {
        if (z) {
            this.j = new lg61();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public abstract boolean d(dl81 dl81Var, long j, lg61 lg61Var);
}
