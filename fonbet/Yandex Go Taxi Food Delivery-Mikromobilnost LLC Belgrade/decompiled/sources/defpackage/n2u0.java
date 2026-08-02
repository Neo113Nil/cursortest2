package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln2u0;", "", "Companion", "l2u0", "m2u0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n2u0 {
    public static final m2u0 Companion = new m2u0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(12))};
    public final String a;
    public final a831 b;

    public /* synthetic */ n2u0(int i, String str, a831 a831Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = a831Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2u0)) {
            return false;
        }
        n2u0 n2u0Var = (n2u0) obj;
        return jl40.l(this.a, n2u0Var.a) && jl40.l(this.b, n2u0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a831 a831Var = this.b;
        return hashCode + (a831Var != null ? a831Var.hashCode() : 0);
    }

    public final String toString() {
        return "StartVerificationResponse(taskId=" + this.a + ", error=" + this.b + Extension.C_BRAKE;
    }

    public n2u0() {
        this((String) null, (a831) null, 3);
    }

    public n2u0(String str, a831 a831Var, int i) {
        str = (i & 1) != 0 ? null : str;
        a831Var = (i & 2) != 0 ? null : a831Var;
        this.a = str;
        this.b = a831Var;
    }
}
