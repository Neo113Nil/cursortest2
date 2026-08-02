package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldqq0;", "Lig5;", "Companion", "bqq0", "cqq0", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class dqq0 implements ig5 {
    public static final cqq0 Companion = new cqq0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(9))};
    public final Map a;

    public /* synthetic */ dqq0(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqq0) && jl40.l(this.a, ((dqq0) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return nnm.j("SendTransportBannerSaveToLocalAction(params=", Extension.C_BRAKE, this.a);
    }

    public dqq0() {
        this.a = null;
    }
}
