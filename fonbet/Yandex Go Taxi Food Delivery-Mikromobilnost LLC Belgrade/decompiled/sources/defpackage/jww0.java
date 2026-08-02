package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jww0 implements lww0 {
    public final String a;

    public jww0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jww0) && jl40.l(this.a, ((jww0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("BlizzardSurgeClicked(deepLink=", this.a, Extension.C_BRAKE);
    }
}
