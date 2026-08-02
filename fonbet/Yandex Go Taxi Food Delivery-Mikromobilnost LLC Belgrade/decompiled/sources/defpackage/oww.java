package defpackage;

/* loaded from: classes2.dex */
public final class oww implements za70 {
    public final pww a;

    public oww(pww pwwVar) {
        this.a = pwwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oww) && this.a.equals(((oww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(familyInvite=" + this.a + ')';
    }
}
