package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ath extends lth {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;

    public ath(Integer num, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ath)) {
            return false;
        }
        ath athVar = (ath) obj;
        return jl40.l(this.a, athVar.a) && jl40.l(this.b, athVar.b) && jl40.l(this.c, athVar.c) && jl40.l(this.d, athVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderCreateSucceeded(type=", this.a, ", deliveryId=", this.b, ", revision=");
        v.append(this.c);
        v.append(", webTrackingUrl=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
