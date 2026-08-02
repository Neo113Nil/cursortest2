package yads;

/* loaded from: classes10.dex */
public final class it2 {
    public long a;
    public long b;
    public pe c;
    public it2 d;

    public it2(int i, long j) {
        a(i, j);
    }

    public final void a(int i, long j) {
        if (this.c != null) {
            throw new IllegalStateException();
        }
        this.a = j;
        this.b = j + i;
    }
}
