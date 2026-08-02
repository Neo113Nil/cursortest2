package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class pm0 extends sm0 {
    public final String a;
    public final List b;

    public pm0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm0)) {
            return false;
        }
        pm0 pm0Var = (pm0) obj;
        return this.a.equals(pm0Var.a) && jl40.l(this.b, pm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("SHOW_3DS_TRUSTED_URLS(url=", this.a, ", trustedUrls=", Extension.C_BRAKE, this.b);
    }
}
