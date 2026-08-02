package defpackage;

/* loaded from: classes2.dex */
public final class p1e {
    public final String a;
    public final e2e b;

    public p1e(e2e e2eVar, String str) {
        this.a = str;
        this.b = e2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1e)) {
            return false;
        }
        p1e p1eVar = (p1e) obj;
        return this.a.equals(p1eVar.a) && this.b.equals(p1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaShortcut(__typename=" + this.a + ", configurationShortcutFragment=" + this.b + ')';
    }
}
