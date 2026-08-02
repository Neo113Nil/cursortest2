package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class bvc0 {
    public final boolean a;
    public final String b;
    public final a78 c;
    public final List d;
    public final boolean e;

    public bvc0(avc0 avc0Var) {
        boolean z = avc0Var.a;
        String str = avc0Var.b;
        a78 a78Var = avc0Var.c;
        List list = avc0Var.d;
        boolean z2 = avc0Var.e;
        this.a = z;
        this.b = str;
        this.c = a78Var;
        this.d = list;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bvc0)) {
            return false;
        }
        bvc0 bvc0Var = (bvc0) obj;
        return jl40.l(this.b, bvc0Var.b) && this.a == bvc0Var.a && this.e == bvc0Var.e;
    }

    public final int hashCode() {
        String str = this.b;
        return Boolean.hashCode(this.e) + unr0.e((str != null ? str.hashCode() : 0) * 31, 31, this.a);
    }
}
