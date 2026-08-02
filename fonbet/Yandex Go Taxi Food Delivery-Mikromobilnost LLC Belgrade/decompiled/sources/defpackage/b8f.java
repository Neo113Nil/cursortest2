package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class b8f {
    public static final a8f Companion = new a8f();
    public final String a;

    public /* synthetic */ b8f(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, z7f.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8f) && jl40.l(this.a, ((b8f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CreateRedirectIdResponseDto(redirectId=", this.a, Extension.C_BRAKE);
    }
}
