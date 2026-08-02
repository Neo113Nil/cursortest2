package defpackage;

/* loaded from: classes13.dex */
public final class n4m {
    public final String a;

    public n4m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4m) && jl40.l(this.a, ((n4m) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return oyr.p("DoneButtonUiState(title=", this.a, ", isEnabled=true)");
    }
}
