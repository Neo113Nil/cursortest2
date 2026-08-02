package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dvx0 implements fvx0 {
    public final String a;

    public dvx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvx0) && jl40.l(this.a, ((dvx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SupportButtonTapped(supportChatUrl=", this.a, Extension.C_BRAKE);
    }
}
