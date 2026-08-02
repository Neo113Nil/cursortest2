package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class dk10 {
    public static final dk10 e = new dk10(null, null, EmptyList.a, null);
    public final String a;
    public final String b;
    public final List c;
    public final ief d;

    public dk10(String str, String str2, List list, ief iefVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = iefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk10)) {
            return false;
        }
        dk10 dk10Var = (dk10) obj;
        return jl40.l(this.a, dk10Var.a) && jl40.l(this.b, dk10Var.b) && this.c.equals(dk10Var.c) && jl40.l(this.d, dk10Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = unr0.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        ief iefVar = this.d;
        return c + (iefVar != null ? iefVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MenuData(actionButtonTitle=", this.a, ", actionButtonSubtitle=", this.b, ", actionButtonStates=");
        v.append(this.c);
        v.append(", currencyRulesDto=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
