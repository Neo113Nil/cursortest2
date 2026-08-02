package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class kzz0 {
    public final String a;

    public /* synthetic */ kzz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kzz0) {
            return this.a.equals(((kzz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TraceId(id=", this.a, Extension.C_BRAKE);
    }
}
