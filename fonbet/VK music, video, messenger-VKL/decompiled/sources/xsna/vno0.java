package xsna;

import java.util.List;

/* compiled from: TextWithBages.kt */
/* loaded from: classes6.dex */
public final class vno0 {
    public final String a;
    public final frv0 b;
    public final List c;

    public vno0(String str, frv0 frv0Var, List list) {
        this.a = str;
        this.b = frv0Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vno0)) {
            return false;
        }
        vno0 vno0Var = (vno0) obj;
        return epx.f(this.a, vno0Var.a) && this.b.equals(vno0Var.b) && epx.f(this.c, vno0Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + fw3.a(bjl0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "TextWithBadgesState(text=" + this.a + ", textStyle=" + this.b + ", badges=" + ((Object) wow.c(this.c)) + ", maxLines=2)";
    }
}
