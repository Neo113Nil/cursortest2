package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class ol20 {
    public static final nl20 Companion = new nl20();
    public final String a;

    public /* synthetic */ ol20(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ml20.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol20) && jl40.l(this.a, ((ol20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("MobApiName(value=", this.a, Extension.C_BRAKE);
    }

    public ol20(String str) {
        this.a = str;
    }
}
