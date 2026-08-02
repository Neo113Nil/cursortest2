package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nfn {
    public final String a;
    public final ArrayList b;
    public final int c;

    public nfn(int i, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfn)) {
            return false;
        }
        nfn nfnVar = (nfn) obj;
        return jl40.l(this.a, nfnVar.a) && this.b.equals(nfnVar.b) && this.c == nfnVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, x4e.m("EatsOrderTimeline(accessibilityText=", this.a, ", items=", ", activeItemsCount=", this.b));
    }
}
