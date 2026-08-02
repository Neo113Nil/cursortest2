package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dwg implements fwg {
    public final List a;
    public final List b;

    public dwg(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwg)) {
            return false;
        }
        dwg dwgVar = (dwg) obj;
        return jl40.l(this.a, dwgVar.a) && jl40.l(this.b, dwgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowInfoState(generalInfo=");
        sb.append(this.a);
        sb.append(", additionalData=");
        return unr0.t(sb, this.b, ')');
    }
}
