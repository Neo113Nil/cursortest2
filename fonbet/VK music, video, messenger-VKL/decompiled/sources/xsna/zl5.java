package xsna;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
public final class zl5 extends o0q {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public zl5(int i, int i2, int i3, long j, long j2) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    @Override // xsna.o0q
    public final int a() {
        return this.d;
    }

    @Override // xsna.o0q
    public final long b() {
        return this.e;
    }

    @Override // xsna.o0q
    public final int c() {
        return this.c;
    }

    @Override // xsna.o0q
    public final int d() {
        return this.f;
    }

    @Override // xsna.o0q
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0q)) {
            return false;
        }
        o0q o0qVar = (o0q) obj;
        return this.b == o0qVar.e() && this.c == o0qVar.c() && this.d == o0qVar.a() && this.e == o0qVar.b() && this.f == o0qVar.d();
    }

    public final int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.b);
        sb.append(", loadBatchSize=");
        sb.append(this.c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.e);
        sb.append(", maxBlobByteSizePerRow=");
        return h5s.c(this.f, "}", sb);
    }
}
