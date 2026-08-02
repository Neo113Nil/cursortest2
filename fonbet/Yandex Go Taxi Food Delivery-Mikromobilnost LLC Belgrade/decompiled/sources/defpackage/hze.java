package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hze {
    public final String a;
    public final String b;

    public hze(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hze)) {
            return false;
        }
        hze hzeVar = (hze) obj;
        return this.a.equals(hzeVar.a) && jl40.l(this.b, hzeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("CounterInfoState(title=", this.a, ", trailText=", this.b, Extension.C_BRAKE);
    }
}
