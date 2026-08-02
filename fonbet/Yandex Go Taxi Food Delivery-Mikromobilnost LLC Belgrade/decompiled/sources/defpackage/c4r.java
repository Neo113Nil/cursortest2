package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c4r {
    public final String a;
    public final ypb b;
    public final boolean c;

    public c4r(String str, ypb ypbVar, boolean z) {
        this.a = str;
        this.b = ypbVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4r)) {
            return false;
        }
        c4r c4rVar = (c4r) obj;
        return jl40.l(this.a, c4rVar.a) && jl40.l(this.b, c4rVar.b) && this.c == c4rVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterChip(optionId=");
        sb.append(this.a);
        sb.append(", appearance=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
