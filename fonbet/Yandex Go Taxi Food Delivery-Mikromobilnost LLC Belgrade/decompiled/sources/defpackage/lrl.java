package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lrl implements prl {
    public final String a;
    public final boolean b;
    public final String c;

    public lrl(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = g8e.p(str, "_", "XCut");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrl)) {
            return false;
        }
        lrl lrlVar = (lrl) obj;
        return jl40.l(this.a, lrlVar.a) && this.b == lrlVar.b;
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
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("XCutUiState(itemId=", this.a, ", ignoreRedirectAnimation=", this.b, Extension.C_BRAKE);
    }
}
