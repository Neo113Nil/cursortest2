package xsna;

/* compiled from: MoneyGetTransferStatus.kt */
/* loaded from: classes15.dex */
public final class w7i extends fux0 {
    public final String a;
    public final String b;

    public w7i(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7i)) {
            return false;
        }
        w7i w7iVar = (w7i) obj;
        return epx.f(this.a, w7iVar.a) && epx.f(this.b, w7iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Complete(description=");
        sb.append(this.a);
        sb.append(", receiptUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
