package defpackage;

/* loaded from: classes2.dex */
public final class aec {
    public final String a;

    public aec(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aec) && this.a.equals(((aec) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Color3(rgba="), this.a, ')');
    }
}
