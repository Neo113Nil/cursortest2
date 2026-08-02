package xsna;

/* compiled from: SearchHistoryRepoComponent.kt */
/* loaded from: classes3.dex */
public final class hvh0 implements l9i {
    public final wuh0 a;

    public hvh0(wuh0 wuh0Var) {
        this.a = wuh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvh0) && epx.f(this.a, ((hvh0) obj).a);
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchHistoryRepoComponentParams(config=" + this.a + ')';
    }
}
