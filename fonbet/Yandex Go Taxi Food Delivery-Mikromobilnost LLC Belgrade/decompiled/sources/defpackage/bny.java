package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbny;", "Lxn11;", "Companion", "any", "zmy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class bny implements xn11 {
    public static final any Companion = new any();
    public static final bny d = new bny(0);
    public final boolean b;
    public final long c;

    public /* synthetic */ bny(boolean z, int i, long j) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, zmy.a.getDescriptor());
            throw null;
        }
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bny)) {
            return false;
        }
        bny bnyVar = (bny) obj;
        return this.b == bnyVar.b && this.c == bnyVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "LinkedOrderFullScreenWhenNeededExperiment(enabled=" + this.b + ", openDelayIntervalMs=" + this.c + Extension.C_BRAKE;
    }

    public bny(int i) {
        this.b = false;
        this.c = 0L;
    }

    public bny() {
        this(0);
    }
}
