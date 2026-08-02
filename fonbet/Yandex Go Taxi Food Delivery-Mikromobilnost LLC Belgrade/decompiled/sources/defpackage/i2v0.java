package defpackage;

/* loaded from: classes10.dex */
public final class i2v0 implements Comparable {
    public final long a;
    public final byte[] b;

    public i2v0(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((i2v0) obj).a);
    }
}
