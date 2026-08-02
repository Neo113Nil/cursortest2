package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lof31;", "", "Companion", "nf31", "mf31", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class of31 {
    public static final nf31 Companion = new nf31();
    public final String a;
    public final gp40 b;

    public /* synthetic */ of31(int i, String str, gp40 gp40Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gp40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of31)) {
            return false;
        }
        of31 of31Var = (of31) obj;
        return jl40.l(this.a, of31Var.a) && jl40.l(this.b, of31Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        gp40 gp40Var = this.b;
        return hashCode + (gp40Var != null ? gp40Var.hashCode() : 0);
    }

    public final String toString() {
        return "VerticalOption(selectedClass=" + this.a + ", multiclassOptions=" + this.b + Extension.C_BRAKE;
    }

    public of31(String str, gp40 gp40Var) {
        this.a = str;
        this.b = gp40Var;
    }

    public of31() {
        this(null, null);
    }
}
