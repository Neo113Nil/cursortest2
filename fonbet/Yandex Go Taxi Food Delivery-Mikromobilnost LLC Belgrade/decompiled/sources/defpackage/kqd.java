package defpackage;

/* loaded from: classes2.dex */
public final class kqd implements lqd {
    public final iqd a;

    public kqd(iqd iqdVar) {
        this.a = iqdVar;
    }

    @Override // defpackage.lqd
    public final iqd a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqd) && jl40.l(this.a, ((kqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Server(offers=" + this.a + ')';
    }
}
