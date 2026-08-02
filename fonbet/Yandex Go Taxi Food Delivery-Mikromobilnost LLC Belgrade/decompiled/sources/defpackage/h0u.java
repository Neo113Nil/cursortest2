package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h0u {
    public final i0u a;
    public final String b;
    public final Double c;
    public final String d;

    public h0u(i0u i0uVar, String str, Double d, String str2) {
        this.a = i0uVar;
        this.b = str;
        this.c = d;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0u)) {
            return false;
        }
        h0u h0uVar = (h0u) obj;
        return this.a.equals(h0uVar.a) && jl40.l(this.b, h0uVar.b) && this.c.equals(h0uVar.c) && jl40.l(this.d, h0uVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "GraphicShape(geometry=" + this.a + ", color=" + this.b + ", borderWidth=" + this.c + ", borderColor=" + this.d + Extension.C_BRAKE;
    }
}
