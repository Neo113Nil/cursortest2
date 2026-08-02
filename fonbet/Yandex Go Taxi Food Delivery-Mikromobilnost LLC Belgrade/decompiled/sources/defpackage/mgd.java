package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mgd {
    public final Object a;
    public final boolean b;

    public mgd(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgd)) {
            return false;
        }
        mgd mgdVar = (mgd) obj;
        return jl40.l(this.a, mgdVar.a) && this.b == mgdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComposeImageMeta(key=" + this.a + ", darkMode=" + this.b + Extension.C_BRAKE;
    }
}
