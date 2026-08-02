package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kwp0 extends nwp0 {
    public final CharSequence a;
    public final wwp0 b;
    public int c = 0;

    public kwp0(wwp0 wwp0Var, String str) {
        this.a = str;
        this.b = wwp0Var;
    }

    @Override // defpackage.nwp0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwp0)) {
            return false;
        }
        kwp0 kwp0Var = (kwp0) obj;
        return jl40.l(this.a, kwp0Var.a) && this.b.equals(kwp0Var.b) && this.c == kwp0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder("Content(input=");
        sb.append((Object) this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", scrollPosition=");
        return oyr.m(i, Extension.C_BRAKE, sb);
    }
}
