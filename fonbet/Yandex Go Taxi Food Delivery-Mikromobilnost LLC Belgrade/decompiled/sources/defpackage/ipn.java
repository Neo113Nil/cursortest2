package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ipn {
    public final String a;

    public ipn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipn) && jl40.l(this.a, ((ipn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("EducationsTooltipAnchorEntity(viewId=", this.a, Extension.C_BRAKE);
    }
}
