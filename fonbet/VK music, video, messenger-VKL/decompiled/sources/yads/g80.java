package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.n6j;
import xsna.oqm0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class g80 {
    public static final f80 Companion = new f80();
    public static final KSerializer[] g = {null, null, null, null, new xsna.yk3(oqm0.a), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public /* synthetic */ g80(int i, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i & 18)) {
            xsna.sp.x(i, 18, e80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return epx.f(this.a, g80Var.a) && epx.f(this.b, g80Var.b) && epx.f(this.c, g80Var.c) && epx.f(this.d, g80Var.d) && epx.f(this.e, g80Var.e) && epx.f(this.f, g80Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = k4.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int a2 = eb.a(this.e, (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f;
        return a2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        List list = this.e;
        String str5 = this.f;
        StringBuilder a = xe9.a("DebugPanelMediationNetwork(id=", str, ", name=", str2, ", logoUrl=");
        n6j.b(a, str3, ", adapterStatus=", str4, ", adapters=");
        a.append(list);
        a.append(", latestAdapterVersion=");
        a.append(str5);
        a.append(")");
        return a.toString();
    }
}
