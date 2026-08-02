package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class j2d0 implements wu1 {
    public final String a;

    public j2d0(String str) {
        this.a = str;
    }

    @Override // defpackage.wu1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2d0) && jl40.l(this.a, ((j2d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PlusDummySubscriptionOptionGroup(alternativeType=", this.a, Extension.C_BRAKE);
    }
}
