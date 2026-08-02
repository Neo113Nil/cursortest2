package defpackage;

/* loaded from: classes2.dex */
public final class irc0 {
    public final hrc0 a;

    public irc0(hrc0 hrc0Var) {
        this.a = hrc0Var;
    }

    public final hrc0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irc0) && this.a.equals(((irc0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "PlaqueSwitchWidget(text=" + this.a + ')';
    }
}
