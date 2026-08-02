package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class gpf {
    public final String a;
    public final String b;
    public final String c;

    public gpf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpf)) {
            return false;
        }
        gpf gpfVar = (gpf) obj;
        return this.a.equals(gpfVar.a) && this.b.equals(gpfVar.b) && this.c.equals(gpfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("GalleryInfo(path=", this.a, ", galleryId=", this.b, ", galleryName="), this.c, Extension.C_BRAKE);
    }
}
