package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lpb {
    public final boolean a;
    public final bpb b;
    public final ArrayList c;

    public lpb(boolean z, bpb bpbVar, ArrayList arrayList) {
        this.a = z;
        this.b = bpbVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpb)) {
            return false;
        }
        lpb lpbVar = (lpb) obj;
        return this.a == lpbVar.a && jl40.l(this.b, lpbVar.b) && this.c.equals(lpbVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        bpb bpbVar = this.b;
        return this.c.hashCode() + ((hashCode + (bpbVar == null ? 0 : bpbVar.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildOptionGroup(shouldShowContent=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", items=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
