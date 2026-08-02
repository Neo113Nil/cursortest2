package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class auw implements buw {
    public final List a;
    public final stz0 b;
    public final boolean c;
    public final String d;

    public auw(List list, stz0 stz0Var, boolean z, String str) {
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
        if (!(obj instanceof auw)) {
            return false;
        }
        auw auwVar = (auw) obj;
        return this.a.equals(auwVar.a) && this.b.equals(auwVar.b) && this.c == auwVar.c && this.d.equals(auwVar.d);
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
