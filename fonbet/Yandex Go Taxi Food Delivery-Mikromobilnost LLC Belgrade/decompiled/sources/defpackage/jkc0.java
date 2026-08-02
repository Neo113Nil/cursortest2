package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jkc0 {
    public final String a;
    public final ArrayList b;

    public jkc0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkc0)) {
            return false;
        }
        jkc0 jkc0Var = (jkc0) obj;
        return jl40.l(this.a, jkc0Var.a) && this.b.equals(jkc0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueContainer(metaColor=");
        sb.append(this.a);
        sb.append(", items=");
        return smw0.m(sb, this.b, ')');
    }
}
