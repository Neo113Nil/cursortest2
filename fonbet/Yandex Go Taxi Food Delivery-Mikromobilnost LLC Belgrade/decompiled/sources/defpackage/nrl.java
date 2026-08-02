package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nrl implements prl {
    public final String a;
    public final int b;
    public final String c;

    public nrl(String str, int i) {
        this.a = str;
        this.b = i;
        this.c = g8e.p(str, "_", "XLine");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrl)) {
            return false;
        }
        nrl nrlVar = (nrl) obj;
        return jl40.l(this.a, nrlVar.a) && this.b == nrlVar.b;
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
        return qv10.i(this.b, "XLineSlotMarginUiState(itemId=", this.a, ", horizontalPadding=", Extension.C_BRAKE);
    }
}
