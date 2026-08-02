package yads;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class cs1 {
    public static final yr1 Companion = new yr1();
    public static final KSerializer[] e = {null, null, null, new xsna.yk3(zr1.a)};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ cs1(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            xsna.sp.x(i, 15, xr1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return epx.f(this.a, cs1Var.a) && epx.f(this.b, cs1Var.b) && epx.f(this.c, cs1Var.c) && epx.f(this.d, cs1Var.d);
    }

    public final int hashCode() {
        int a = k4.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        List list = this.d;
        StringBuilder a = xe9.a("MediationNetworkData(name=", str, ", id=", str2, ", version=");
        a.append(str3);
        a.append(", adapters=");
        a.append(list);
        a.append(")");
        return a.toString();
    }

    public cs1(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }
}
