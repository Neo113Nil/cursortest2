package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nss {
    public final List a;
    public final int b;
    public final boolean c;
    public final tls d;

    public nss(int i, tls tlsVar, List list, boolean z) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nss)) {
            return false;
        }
        nss nssVar = (nss) obj;
        return jl40.l(this.a, nssVar.a) && this.b == nssVar.b && this.c == nssVar.c && this.d.equals(nssVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "GalleryViewerPayload(images=" + this.a + ", currentImageIndex=" + this.b + ", showAdditionalButton=" + this.c + ", additionalButtonListener=" + this.d + Extension.C_BRAKE;
    }
}
