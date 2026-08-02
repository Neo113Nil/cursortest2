package defpackage;

/* loaded from: classes10.dex */
public final class mw41 implements Comparable {
    public final int a;
    public final iw41 b;

    public mw41(int i, iw41 iw41Var) {
        this.a = i;
        this.b = iw41Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((mw41) obj).a);
    }
}
