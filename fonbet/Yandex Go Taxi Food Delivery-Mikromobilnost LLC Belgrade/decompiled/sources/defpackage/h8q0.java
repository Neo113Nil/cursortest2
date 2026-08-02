package defpackage;

/* loaded from: classes10.dex */
public final class h8q0 implements Comparable {
    public final long a;
    public final npg b;

    public h8q0(long j, npg npgVar) {
        this.a = j;
        this.b = npgVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((h8q0) obj).a;
        int i = tw21.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }
}
