package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgbl0;", "Ln96;", "Companion", "fbl0", "ebl0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class gbl0 extends n96 {
    public static final fbl0 Companion = new fbl0();
    public static final gbl0 c = new gbl0(0);
    public final boolean b;

    public /* synthetic */ gbl0(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbl0) && this.b == ((gbl0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return nzs.b("RouteStatsLightWeightCheckExperiment(enabled=", Extension.C_BRAKE, this.b);
    }

    public gbl0(int i) {
        this.b = false;
    }

    public gbl0() {
        this(0);
    }
}
