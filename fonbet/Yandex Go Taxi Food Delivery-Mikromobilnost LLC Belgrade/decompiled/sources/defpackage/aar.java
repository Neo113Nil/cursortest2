package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class aar implements ig5 {
    public static final y9r Companion = new y9r();
    public static final i3y[] d;
    public final String a;
    public final List b;
    public final Map c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new v5r(4)), a.b(lazyThreadSafetyMode, new v5r(5))};
    }

    public /* synthetic */ aar(int i, String str, List list, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, w9r.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aar)) {
            return false;
        }
        aar aarVar = (aar) obj;
        return jl40.l(this.a, aarVar.a) && jl40.l(this.b, aarVar.b) && jl40.l(this.c, aarVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return b64.r(xvz.r("FinishFlowAction(status=", this.a, ", enrichLinkParams=", this.b, ", params="), this.c, Extension.C_BRAKE);
    }
}
