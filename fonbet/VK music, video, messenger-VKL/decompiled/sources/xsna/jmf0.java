package xsna;

/* compiled from: MoneyGetTransferStatus.kt */
/* loaded from: classes15.dex */
public final class jmf0 extends n730 {
    public final String a;

    public jmf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmf0) && epx.f(this.a, ((jmf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Redirect(redirectUrl="), this.a, ')');
    }
}
