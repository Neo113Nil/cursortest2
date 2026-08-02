package xsna;

/* compiled from: LikesState.kt */
/* loaded from: classes16.dex */
public final class e7z {
    public final w6z a;
    public final x6z b;

    public e7z() {
        this((w6z) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7z)) {
            return false;
        }
        e7z e7zVar = (e7z) obj;
        return epx.f(this.a, e7zVar.a) && epx.f(this.b, e7zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikesState(config=" + this.a + ", content=" + this.b + ')';
    }

    public e7z(w6z w6zVar, x6z x6zVar) {
        this.a = w6zVar;
        this.b = x6zVar;
    }

    public /* synthetic */ e7z(w6z w6zVar, int i) {
        this((i & 1) != 0 ? new w6z(null, null, 15) : w6zVar, new x6z(0));
    }
}
