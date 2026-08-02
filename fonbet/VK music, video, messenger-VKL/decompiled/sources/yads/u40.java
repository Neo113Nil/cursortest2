package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class u40 {
    public static final t40 Companion = new t40();
    public static final KSerializer[] g = {null, null, new xsna.yk3(la0.a), null, null, new xsna.yk3(fa0.a)};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final ka0 e;
    public final List f;

    public /* synthetic */ u40(int i, String str, String str2, List list, String str3, ka0 ka0Var, List list2) {
        if (54 != (i & 54)) {
            xsna.sp.x(i, 54, s40.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = ka0Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return epx.f(this.a, u40Var.a) && epx.f(this.b, u40Var.b) && epx.f(this.c, u40Var.c) && epx.f(this.d, u40Var.d) && epx.f(this.e, u40Var.e) && epx.f(this.f, u40Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = eb.a(this.c, k4.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.d;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        ka0 ka0Var = this.e;
        return this.f.hashCode() + ((hashCode + (ka0Var != null ? ka0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List list = this.c;
        String str3 = this.d;
        ka0 ka0Var = this.e;
        List list2 = this.f;
        StringBuilder a = xe9.a("DebugPanelAdUnitWaterfallMediation(adapter=", str, ", networkName=", str2, ", waterfallParameters=");
        xsna.vr.c(", networkAdUnitIdName=", str3, ", currency=", a, list);
        a.append(ka0Var);
        a.append(", cpmFloors=");
        a.append(list2);
        a.append(")");
        return a.toString();
    }
}
