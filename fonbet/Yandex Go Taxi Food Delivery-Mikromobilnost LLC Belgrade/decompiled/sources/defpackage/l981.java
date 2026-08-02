package defpackage;

/* loaded from: classes7.dex */
public final class l981 implements Comparable {
    public final int a;
    public final kw71 b;

    public l981(int i, kw71 kw71Var) {
        this.a = i;
        this.b = kw71Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((l981) obj).a);
    }
}
