package yads;

/* loaded from: classes10.dex */
public abstract class d53 {
    public q83 b;
    public qq0 c;
    public qa2 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final oa2 a = new oa2();
    public b53 j = new b53();

    public abstract long a(kc2 kc2Var);

    public void a(long j) {
        this.g = j;
    }

    public abstract boolean a(kc2 kc2Var, long j, b53 b53Var);

    public void a(boolean z) {
        if (z) {
            this.j = new b53();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
