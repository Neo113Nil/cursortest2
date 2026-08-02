package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class boq0 implements ig5 {
    public static final znq0 Companion = new znq0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(5))};
    public final String a;
    public final Map b;

    public /* synthetic */ boq0(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, xnq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boq0)) {
            return false;
        }
        boq0 boq0Var = (boq0) obj;
        return jl40.l(this.a, boq0Var.a) && jl40.l(this.b, boq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return xvz.j("SendAnalyticsEventAction(eventName=", this.a, ", params=", Extension.C_BRAKE, this.b);
    }
}
