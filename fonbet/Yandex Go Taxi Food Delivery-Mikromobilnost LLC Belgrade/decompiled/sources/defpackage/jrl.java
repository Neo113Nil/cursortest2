package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jrl implements prl {
    public final String a;
    public final int b;
    public final String c;

    public jrl(String str, int i) {
        this.a = str;
        this.b = i;
        this.c = g8e.p(str, "_", "Spacer");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrl)) {
            return false;
        }
        jrl jrlVar = (jrl) obj;
        return jl40.l(this.a, jrlVar.a) && this.b == jrlVar.b;
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.c;
    }

    @Override // defpackage.prl
    public final String getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "SpacerUiState(itemId=", this.a, ", height=", Extension.C_BRAKE);
    }
}
