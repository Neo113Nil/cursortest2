package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class d9n implements hxq0 {
    public final String a;

    public d9n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9n) && jl40.l(this.a, ((d9n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.hxq0
    /* renamed from: i */
    public final String getAlias() {
        return this.a;
    }

    public final String toString() {
        return oyr.p("DynamicServiceType(alias=", this.a, Extension.C_BRAKE);
    }
}
