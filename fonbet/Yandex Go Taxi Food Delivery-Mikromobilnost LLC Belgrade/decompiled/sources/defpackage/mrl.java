package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mrl implements prl {
    public final String a;
    public final String b;
    public final String c;

    public mrl(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = g8e.p(str, "_", "XGroup");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrl)) {
            return false;
        }
        mrl mrlVar = (mrl) obj;
        return jl40.l(this.a, mrlVar.a) && jl40.l(this.b, mrlVar.b);
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("XGroupTitleUiState(itemId=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
