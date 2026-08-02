package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f5v {
    public final sbv a;
    public final String b;
    public final int c;

    public f5v(sbv sbvVar, String str, int i) {
        this.a = sbvVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5v)) {
            return false;
        }
        f5v f5vVar = (f5v) obj;
        return this.a.equals(f5vVar.a) && jl40.l(this.b, f5vVar.b) && this.c == f5vVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconSpotModel(icon=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", cornerRadius=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
