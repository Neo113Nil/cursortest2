package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.oqm0;
import xsna.qoy;
import xsna.vp;

@imi0
/* loaded from: classes10.dex */
public final class t80 {
    public static final s80 Companion = new s80();
    public static final KSerializer[] d = {null, null, new xsna.yk3(oqm0.a)};
    public final String a;
    public final boolean b;
    public final List c;

    public /* synthetic */ t80(int i, String str, boolean z, List list) {
        if (7 != (i & 7)) {
            xsna.sp.x(i, 7, r80.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return epx.f(this.a, t80Var.a) && this.b == t80Var.b && epx.f(this.c, t80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        List list = this.c;
        StringBuilder sb = new StringBuilder("DebugPanelSdkData(version=");
        sb.append(str);
        sb.append(", isIntegratedSuccess=");
        sb.append(z);
        sb.append(", integrationMessages=");
        return vp.b(")", sb, list);
    }

    public t80(boolean z, List list) {
        this.a = "7.18.6";
        this.b = z;
        this.c = list;
    }
}
