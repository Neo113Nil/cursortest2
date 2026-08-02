package defpackage;

/* loaded from: classes2.dex */
public final class f351 {
    public final int a;

    public f351(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f351) && this.a == ((f351) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("OnFixWidth(fix="), this.a, ')');
    }
}
