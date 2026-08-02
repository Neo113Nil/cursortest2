package defpackage;

/* loaded from: classes2.dex */
public final class q1e {
    public final String a;
    public final e2e b;

    public q1e(e2e e2eVar, String str) {
        this.a = str;
        this.b = e2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1e)) {
            return false;
        }
        q1e q1eVar = (q1e) obj;
        return this.a.equals(q1eVar.a) && this.b.equals(q1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Shortcut(__typename=" + this.a + ", configurationShortcutFragment=" + this.b + ')';
    }
}
