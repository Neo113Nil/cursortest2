package defpackage;

/* loaded from: classes9.dex */
public final class mf70 extends rf70 {
    public final boolean a;

    public mf70(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf70) && this.a == ((mf70) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
