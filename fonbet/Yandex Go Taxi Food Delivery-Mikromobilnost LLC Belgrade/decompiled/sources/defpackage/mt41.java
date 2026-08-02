package defpackage;

import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mt41 implements ot41 {
    public final Map a;
    public final String b;
    public final mp41 c;

    public mt41(Map map, String str, mp41 mp41Var) {
        this.a = map;
        this.b = str;
        this.c = mp41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt41)) {
            return false;
        }
        mt41 mt41Var = (mt41) obj;
        EmptyList emptyList = EmptyList.a;
        return emptyList.equals(emptyList) && this.a.equals(mt41Var.a) && jl40.l(this.b, mt41Var.b) && jl40.l(this.c, mt41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(961, 31, this.b);
    }

    public final String toString() {
        return "LoadUrl(extraCookies=" + EmptyList.a + ", extraHeaders=" + this.a + ", url=" + this.b + ", webViewFacade=" + this.c + Extension.C_BRAKE;
    }
}
