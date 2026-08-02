package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pz3 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public pz3(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz3)) {
            return false;
        }
        pz3 pz3Var = (pz3) obj;
        return jl40.l(this.a, pz3Var.a) && jl40.l(this.b, pz3Var.b) && this.c.equals(pz3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("SavingsNoticeEntity(title=", this.a, ", buttonText=", this.b, ", paymentMethods="), this.c);
    }
}
