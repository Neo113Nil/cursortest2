package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkaj;", "Lig5;", "Companion", "iaj", "jaj", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class kaj implements ig5 {
    public static final jaj Companion = new jaj();
    public static final i3y[] d;
    public final Map a;
    public final vm50 b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new dii(23)), a.b(lazyThreadSafetyMode, new dii(24)), a.b(lazyThreadSafetyMode, new dii(25))};
    }

    public /* synthetic */ kaj(int i, Map map, vm50 vm50Var, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vm50Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaj)) {
            return false;
        }
        kaj kajVar = (kaj) obj;
        return jl40.l(this.a, kajVar.a) && jl40.l(this.b, kajVar.b) && jl40.l(this.c, kajVar.c);
    }

    public final int hashCode() {
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        vm50 vm50Var = this.b;
        int hashCode2 = (hashCode + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceChallengePubkeyAction(analyticsParams=");
        sb.append(this.a);
        sb.append(", onCompleteAction=");
        sb.append(this.b);
        sb.append(", publicKeyVarPath=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public kaj() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
