package defpackage;

/* loaded from: classes2.dex */
public final class geg {
    public final String a;
    public final reg b;

    public geg(String str, reg regVar) {
        this.a = str;
        this.b = regVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geg)) {
            return false;
        }
        geg gegVar = (geg) obj;
        return this.a.equals(gegVar.a) && this.b.equals(gegVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaShortcut(__typename=" + this.a + ", darkConfigurationShortcutFragment=" + this.b + ')';
    }
}
