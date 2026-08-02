package xsna;

/* compiled from: MoneyGetTransferStatus.kt */
/* loaded from: classes15.dex */
public final class wup extends fux0 {
    public final String a;

    public wup(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wup) && epx.f(this.a, ((wup) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Error(description="), this.a, ')');
    }
}
