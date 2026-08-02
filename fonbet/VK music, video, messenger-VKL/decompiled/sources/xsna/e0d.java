package xsna;

/* compiled from: ClipInternalUpdateEvent.kt */
/* loaded from: classes17.dex */
public final class e0d {
    public final String a;
    public final a0d b;

    public e0d(String str, a0d a0dVar) {
        this.a = str;
        this.b = a0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0d)) {
            return false;
        }
        e0d e0dVar = (e0d) obj;
        return epx.f(this.a, e0dVar.a) && epx.f(this.b, e0dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClipInternalUpdateEvent(uniqueKey=" + this.a + ", patch=" + this.b + ')';
    }
}
