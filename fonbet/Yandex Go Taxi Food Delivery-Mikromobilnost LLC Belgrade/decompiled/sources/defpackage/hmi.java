package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hmi {
    public final String a;
    public final String b;

    public hmi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmi)) {
            return false;
        }
        hmi hmiVar = (hmi) obj;
        return this.a.equals(hmiVar.a) && jl40.l(this.b, hmiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DeliveryRentalDurationBubbleModel(text=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }
}
