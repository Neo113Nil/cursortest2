package yads;

/* loaded from: classes10.dex */
public final class sp3 implements Comparable {
    public final int b;
    public final op3 c;

    public sp3(int i, op3 op3Var) {
        this.b = i;
        this.c = op3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((sp3) obj).b);
    }
}
