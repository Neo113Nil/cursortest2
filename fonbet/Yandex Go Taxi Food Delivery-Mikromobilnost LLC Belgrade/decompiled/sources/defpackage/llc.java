package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class llc {
    public final String a;
    public final Long b;
    public final boolean c;

    public llc(Long l, String str, boolean z) {
        this.a = str;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llc)) {
            return false;
        }
        llc llcVar = (llc) obj;
        return jl40.l(this.a, llcVar.a) && jl40.l(this.b, llcVar.b) && this.c == llcVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommandContext(tripId=");
        sb.append(this.a);
        sb.append(", debounceMillis=");
        sb.append(this.b);
        sb.append(", isLocked=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
