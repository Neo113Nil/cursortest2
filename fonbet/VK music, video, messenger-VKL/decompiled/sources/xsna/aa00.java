package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: LutWrapper.kt */
/* loaded from: classes4.dex */
public final class aa00 {
    public final String a;
    public final String b;
    public final List<ota0> c;
    public final boolean d;

    public aa00(String str, String str2, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa00)) {
            return false;
        }
        aa00 aa00Var = (aa00) obj;
        return epx.f(this.a, aa00Var.a) && epx.f(this.b, aa00Var.b) && epx.f(this.c, aa00Var.c) && this.d == aa00Var.d;
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        List<ota0> list = this.c;
        return Boolean.hashCode(this.d) + ((a + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder a = xe9.a("LutWrapper(id=", this.a, ", name=", this.b, ", luts=");
        a.append(this.c);
        a.append(", isDefault=");
        a.append(this.d);
        a.append(")");
        return a.toString();
    }
}
