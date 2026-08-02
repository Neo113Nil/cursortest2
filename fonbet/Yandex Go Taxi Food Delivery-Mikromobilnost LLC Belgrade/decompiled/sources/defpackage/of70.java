package defpackage;

/* loaded from: classes9.dex */
public final class of70 extends rf70 {
    public final int a;

    public of70(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of70) && this.a == ((of70) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
