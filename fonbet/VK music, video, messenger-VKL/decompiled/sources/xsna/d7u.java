package xsna;

/* compiled from: GoodPreviewState.kt */
/* loaded from: classes18.dex */
public final class d7u implements km50 {
    public final e6u b;
    public final boolean c;
    public final Throwable d;

    public d7u() {
        this(7);
    }

    public static d7u a(d7u d7uVar, e6u e6uVar, boolean z, Throwable th, int i) {
        if ((i & 1) != 0) {
            e6uVar = d7uVar.b;
        }
        if ((i & 2) != 0) {
            z = d7uVar.c;
        }
        if ((i & 4) != 0) {
            th = d7uVar.d;
        }
        d7uVar.getClass();
        return new d7u(e6uVar, z, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7u)) {
            return false;
        }
        d7u d7uVar = (d7u) obj;
        return epx.f(this.b, d7uVar.b) && this.c == d7uVar.c && epx.f(this.d, d7uVar.d);
    }

    public final int hashCode() {
        e6u e6uVar = this.b;
        int b = qoy.b((e6uVar == null ? 0 : e6uVar.hashCode()) * 31, 31, this.c);
        Throwable th = this.d;
        return b + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodPreviewState(content=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", error=");
        return oq.c(sb, this.d, ')');
    }

    public /* synthetic */ d7u(int i) {
        this(null, (i & 2) == 0, null);
    }

    public d7u(e6u e6uVar, boolean z, Throwable th) {
        this.b = e6uVar;
        this.c = z;
        this.d = th;
    }
}
