package xsna;

/* compiled from: DataChunk.kt */
/* loaded from: classes3.dex */
public final class utk<Data> {
    public final Data a;
    public final boolean b;

    public utk(Data data, boolean z) {
        this.a = data;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utk)) {
            return false;
        }
        utk utkVar = (utk) obj;
        return epx.f(this.a, utkVar.a) && this.b == utkVar.b;
    }

    public final int hashCode() {
        Data data = this.a;
        return Boolean.hashCode(this.b) + ((data == null ? 0 : data.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataChunk(data=");
        sb.append(this.a);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
