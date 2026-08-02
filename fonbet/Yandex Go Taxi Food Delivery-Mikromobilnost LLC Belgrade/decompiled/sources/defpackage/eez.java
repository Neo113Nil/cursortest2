package defpackage;

/* loaded from: classes9.dex */
public final class eez {
    public final String a;

    public eez(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eez) && jl40.l(this.a, ((eez) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
