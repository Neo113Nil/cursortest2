package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class p8f implements wu1 {
    public final String a;

    public p8f(String str) {
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
        return (obj instanceof p8f) && jl40.l(this.a, ((p8f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CreateYandexCardGroup(alternativeType=", this.a, Extension.C_BRAKE);
    }
}
