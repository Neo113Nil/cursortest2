package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bbv0 {
    public final ArrayList a;
    public final String b;

    public bbv0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbv0)) {
            return false;
        }
        bbv0 bbv0Var = (bbv0) obj;
        return this.a.equals(bbv0Var.a) && jl40.l(this.b, bbv0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SuggestedPartnersEntity(ybs=" + this.a + ", transferId=" + this.b + Extension.C_BRAKE;
    }
}
