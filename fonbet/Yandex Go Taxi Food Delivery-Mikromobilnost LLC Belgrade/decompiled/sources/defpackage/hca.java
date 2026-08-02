package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hca implements kca {
    public final ArrayList a;
    public final String b;

    public hca(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.kca
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hca)) {
            return false;
        }
        hca hcaVar = (hca) obj;
        return this.a.equals(hcaVar.a) && jl40.l(this.b, hcaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Buttons(buttons=" + this.a + ", modeId=" + this.b + Extension.C_BRAKE;
    }
}
