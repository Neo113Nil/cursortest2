package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h8j {
    public final String a;
    public final List b;

    public h8j(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8j)) {
            return false;
        }
        h8j h8jVar = (h8j) obj;
        return jl40.l(this.a, h8jVar.a) && this.b.equals(h8jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("DetailsClickPayload(title=", this.a, ", sections=", Extension.C_BRAKE, this.b);
    }
}
