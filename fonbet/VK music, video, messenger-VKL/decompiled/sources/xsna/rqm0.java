package xsna;

/* compiled from: Text.kt */
/* loaded from: classes4.dex */
public final class rqm0 implements jbo0 {
    public final String a;

    public rqm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqm0) && epx.f(this.a, ((rqm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr.a("StringText(value=", this.a, ")");
    }
}
