package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lndi;", "Ln96;", "Companion", "mdi", "ldi", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ndi extends n96 {
    public static final mdi Companion = new mdi();
    public static final ndi d = new ndi(0);
    public final boolean b;
    public final Double c;

    public /* synthetic */ ndi(int i, boolean z, Double d2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = d2;
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
        if (!(obj instanceof ndi)) {
            return false;
        }
        ndi ndiVar = (ndi) obj;
        return this.b == ndiVar.b && jl40.l(this.c, ndiVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Double d2 = this.c;
        return hashCode + (d2 == null ? 0 : d2.hashCode());
    }

    public final String toString() {
        return "DeliveryMapAutozoomExperiment(enabled=" + this.b + ", delayInSeconds=" + this.c + Extension.C_BRAKE;
    }

    public ndi(int i) {
        this.b = false;
        this.c = null;
    }

    public ndi() {
        this(0);
    }
}
