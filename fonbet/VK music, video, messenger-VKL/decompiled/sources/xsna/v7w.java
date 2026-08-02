package xsna;

/* compiled from: ImItemHistory.kt */
/* loaded from: classes2.dex */
public final class v7w {
    public final b5w a;
    public final x7w b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public v7w(b5w b5wVar, x7w x7wVar, boolean z, boolean z2, int i) {
        this.a = b5wVar;
        this.b = x7wVar;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7w)) {
            return false;
        }
        v7w v7wVar = (v7w) obj;
        return epx.f(this.a, v7wVar.a) && epx.f(this.b, v7wVar.b) && this.c == v7wVar.c && this.d == v7wVar.d && this.e == v7wVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemStorageModel(composedId=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", hasRemoteMsg=");
        sb.append(this.c);
        sb.append(", hasDraftMsg=");
        sb.append(this.d);
        sb.append(", phase=");
        return vu5.b(sb, this.e, ')');
    }
}
