package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.v2.EditFieldEntity$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pln {
    public final EditFieldEntity$Type a;
    public final String b;
    public final String c;

    public pln(EditFieldEntity$Type editFieldEntity$Type, String str, String str2) {
        this.a = editFieldEntity$Type;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pln)) {
            return false;
        }
        pln plnVar = (pln) obj;
        return this.a == plnVar.a && jl40.l(this.b, plnVar.b) && jl40.l(this.c, plnVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditFieldEntity(type=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", hint=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
