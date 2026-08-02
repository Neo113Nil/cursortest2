package defpackage;

/* loaded from: classes.dex */
public final class plz0 implements qlz0 {
    public final String a;

    public /* synthetic */ plz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof plz0) {
            return this.a.equals(((plz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.l(')', "Variable(name=", this.a);
    }
}
