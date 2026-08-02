package defpackage;

/* loaded from: classes10.dex */
public final class gns0 {
    public final bts a;

    public final boolean equals(Object obj) {
        if (obj instanceof gns0) {
            return this.a == ((gns0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
