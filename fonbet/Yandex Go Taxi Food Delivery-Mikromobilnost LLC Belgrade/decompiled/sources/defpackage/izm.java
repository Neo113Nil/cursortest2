package defpackage;

/* loaded from: classes12.dex */
public final class izm {
    public final boolean a;

    public izm(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izm) && this.a == ((izm) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
