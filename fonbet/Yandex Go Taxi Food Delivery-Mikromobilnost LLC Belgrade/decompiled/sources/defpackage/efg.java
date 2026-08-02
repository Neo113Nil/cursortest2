package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class efg {
    public final String a;
    public final bfg b;
    public final List c;
    public final ArrayList d;

    public efg(String str, bfg bfgVar, List list, ArrayList arrayList) {
        this.a = str;
        this.b = bfgVar;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efg)) {
            return false;
        }
        efg efgVar = (efg) obj;
        return jl40.l(this.a, efgVar.a) && jl40.l(this.b, efgVar.b) && jl40.l(this.c, efgVar.c) && this.d.equals(efgVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        bfg bfgVar = this.b;
        int hashCode2 = (hashCode + (bfgVar == null ? 0 : bfgVar.hashCode())) * 31;
        List list = this.c;
        return this.d.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Popup(textColor=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", commonOverlays=");
        sb.append(this.c);
        sb.append(", buttons=");
        return smw0.m(sb, this.d, ')');
    }
}
