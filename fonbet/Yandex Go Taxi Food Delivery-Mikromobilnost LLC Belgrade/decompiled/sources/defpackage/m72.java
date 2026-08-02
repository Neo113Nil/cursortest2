package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lm72;", "Lw96;", "Companion", "l72", "k72", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class m72 extends w96 {
    public static final l72 Companion = new l72();
    public static final m72 e = new m72(0);
    public final boolean b;
    public final int c;
    public final int d;

    public /* synthetic */ m72(int i, int i2, int i3, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m72)) {
            return false;
        }
        m72 m72Var = (m72) obj;
        return this.b == m72Var.b && this.c == m72Var.c && this.d == m72Var.d;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.w96
    public final boolean h() {
        return getB() && this.c > 0 && this.d > 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, Boolean.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.d, Extension.C_BRAKE, xvz.p("AndroidApiLocationUpdatesIntervalExperiment(enabled=", this.c, ", gpsInterval=", ", networkInterval=", this.b));
    }

    public m72(int i) {
        this.b = false;
        this.c = 0;
        this.d = 0;
    }

    public m72() {
        this(0);
    }
}
