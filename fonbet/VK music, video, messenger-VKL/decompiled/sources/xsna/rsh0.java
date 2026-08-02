package xsna;

/* compiled from: SearchAddressViewState.kt */
/* loaded from: classes18.dex */
public final class rsh0 {
    public final String a;

    public rsh0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsh0) && epx.f(this.a, ((rsh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SearchFieldState(query="), this.a, ')');
    }

    public rsh0(String str) {
        this.a = str;
    }

    public /* synthetic */ rsh0(int i) {
        this("");
    }
}
