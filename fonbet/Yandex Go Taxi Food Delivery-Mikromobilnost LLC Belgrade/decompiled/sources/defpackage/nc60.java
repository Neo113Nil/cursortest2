package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nc60 {
    public final String a;

    public nc60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc60) && jl40.l(this.a, ((nc60) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("NoLocationPermissionPayload(description=", this.a, Extension.C_BRAKE);
    }

    public /* synthetic */ nc60(int i) {
        this((String) null);
    }

    public nc60() {
        this((String) null);
    }
}
