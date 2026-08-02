package defpackage;

/* loaded from: classes.dex */
public final class klz0 implements anz0 {
    public final String a;

    public klz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klz0) && this.a.equals(((klz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Function(name="), this.a, ')');
    }
}
