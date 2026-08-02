package defpackage;

/* loaded from: classes14.dex */
public final class eaw extends faw {
    public final String a;

    public eaw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaw) && jl40.l(this.a, ((eaw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
