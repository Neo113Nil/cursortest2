package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gmq0 implements kmq0 {
    public final String a;

    public gmq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmq0) && jl40.l(this.a, ((gmq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("VerticalBadgeShown(showPolicyId=", this.a, Extension.C_BRAKE);
    }
}
