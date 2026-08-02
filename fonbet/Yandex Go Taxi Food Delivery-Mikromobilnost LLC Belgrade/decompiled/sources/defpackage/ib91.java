package defpackage;

/* loaded from: classes11.dex */
public final class ib91 extends bd91 {
    @Override // defpackage.bd91
    public final int a() {
        return 0;
    }

    @Override // defpackage.bd91
    public final bd91 b(Comparable comparable, Comparable comparable2) {
        int compareTo = comparable.compareTo(comparable2);
        return compareTo < 0 ? bd91.b : compareTo > 0 ? bd91.c : bd91.a;
    }
}
