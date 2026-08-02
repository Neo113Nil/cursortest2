package defpackage;

/* loaded from: classes2.dex */
public final class jqd implements lqd {
    public final iqd a;

    public jqd(iqd iqdVar) {
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
        return (obj instanceof jqd) && this.a.equals(((jqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Cache(offers=" + this.a + ')';
    }
}
