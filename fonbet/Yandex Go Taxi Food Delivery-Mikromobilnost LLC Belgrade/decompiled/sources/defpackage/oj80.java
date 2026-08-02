package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes5.dex */
public final class oj80 {
    public static final nj80 Companion = new nj80();
    public final String a;

    public /* synthetic */ oj80(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, mj80.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj80) && jl40.l(this.a, ((oj80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OrganizationNameUriParams(organizationId=", this.a, Extension.C_BRAKE);
    }

    public oj80(String str) {
        this.a = str;
    }
}
