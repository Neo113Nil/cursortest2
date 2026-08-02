package defpackage;

/* loaded from: classes13.dex */
public final class gob {
    public final String a;

    public gob(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gob) && jl40.l(this.a, ((gob) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return oyr.p("ChildCompoundOptionButtonState(text=", this.a, ", enabled=true)");
    }
}
