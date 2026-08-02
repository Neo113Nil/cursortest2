package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mu20 implements nu20 {
    public final List a;
    public final stz0 b;
    public final boolean c;
    public final String d;

    public mu20(List list, stz0 stz0Var, boolean z, String str) {
        this.a = list;
        this.b = stz0Var;
        this.c = z;
        this.d = str;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final List c() {
        return this.a;
    }

    public final stz0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu20)) {
            return false;
        }
        mu20 mu20Var = (mu20) obj;
        return this.a.equals(mu20Var.a) && this.b.equals(mu20Var.b) && this.c == mu20Var.c && this.d.equals(mu20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(recyclerItems=");
        sb.append(this.a);
        sb.append(", toolbarViewState=");
        sb.append(this.b);
        sb.append(", contentChanged=");
        return n.m(", filterText=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
