package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j6n extends n351 {
    public final String c;
    public final i6n d;
    public final boolean e;

    public j6n(String str, i6n i6nVar, boolean z) {
        super("dynamic-content-section-header-key", false, 14);
        this.c = str;
        this.d = i6nVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6n)) {
            return false;
        }
        j6n j6nVar = (j6n) obj;
        return jl40.l(this.c, j6nVar.c) && jl40.l(this.d, j6nVar.d) && this.e == j6nVar.e;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        i6n i6nVar = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (i6nVar == null ? 0 : i6nVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicContentSectionHeaderModel(title=");
        sb.append(this.c);
        sb.append(", trail=");
        sb.append(this.d);
        sb.append(", isShimmering=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
