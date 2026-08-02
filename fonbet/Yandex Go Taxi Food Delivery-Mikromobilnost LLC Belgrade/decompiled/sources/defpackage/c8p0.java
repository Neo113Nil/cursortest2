package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c8p0 implements e8p0 {
    public final String a;

    public /* synthetic */ c8p0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c8p0) {
            return this.a.equals(((c8p0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.e8p0
    public final String k() {
        return this.a;
    }

    public final String toString() {
        return oyr.p("Unknown(vendorName=", this.a, Extension.C_BRAKE);
    }
}
