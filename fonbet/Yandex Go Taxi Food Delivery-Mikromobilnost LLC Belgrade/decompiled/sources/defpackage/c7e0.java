package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c7e0 {
    public final String a;
    public final z6e0 b;
    public final List c;
    public final ArrayList d;

    public c7e0(String str, z6e0 z6e0Var, List list, ArrayList arrayList) {
        this.a = str;
        this.b = z6e0Var;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7e0)) {
            return false;
        }
        c7e0 c7e0Var = (c7e0) obj;
        return jl40.l(this.a, c7e0Var.a) && jl40.l(this.b, c7e0Var.b) && jl40.l(this.c, c7e0Var.c) && this.d.equals(c7e0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        z6e0 z6e0Var = this.b;
        int hashCode2 = (hashCode + (z6e0Var == null ? 0 : z6e0Var.hashCode())) * 31;
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
