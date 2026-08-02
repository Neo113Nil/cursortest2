package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i3i {
    public final String a;
    public final String b;

    public i3i(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3i)) {
            return false;
        }
        i3i i3iVar = (i3i) obj;
        return jl40.l(this.a, i3iVar.a) && jl40.l(this.b, i3iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("DeliveryD2dBubbleModel(text=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }
}
