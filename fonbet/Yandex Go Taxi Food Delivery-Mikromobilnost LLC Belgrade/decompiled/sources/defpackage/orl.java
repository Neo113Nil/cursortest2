package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class orl implements prl {
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public orl(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = g8e.p(str, "_", "XLine");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orl)) {
            return false;
        }
        orl orlVar = (orl) obj;
        return jl40.l(this.a, orlVar.a) && this.b == orlVar.b && this.c == orlVar.c;
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.d;
    }

    @Override // defpackage.prl
    public final String getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "XLineUiState(itemId=", this.a, ", topPadding=", ", bottomPadding="));
    }
}
