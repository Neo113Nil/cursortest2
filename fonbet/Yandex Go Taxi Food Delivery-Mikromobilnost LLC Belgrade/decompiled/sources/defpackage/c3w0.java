package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class c3w0 {
    public final ocw0 a;
    public final c2t b;
    public final boolean c;

    public c3w0(ocw0 ocw0Var, c2t c2tVar, boolean z) {
        this.a = ocw0Var;
        this.b = c2tVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3w0)) {
            return false;
        }
        c3w0 c3w0Var = (c3w0) obj;
        return jl40.l(this.a, c3w0Var.a) && jl40.l(this.b, c3w0Var.b) && this.c == c3w0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Triggers(mainScreenLoadingState=");
        sb.append(this.a);
        sb.append(", geoSuggestLoadingState=");
        sb.append(this.b);
        sb.append(", hasTaxiEntryPoint=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
