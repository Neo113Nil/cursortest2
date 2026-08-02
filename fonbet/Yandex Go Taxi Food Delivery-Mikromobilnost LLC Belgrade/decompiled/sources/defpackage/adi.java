package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ladi;", "Lxn11;", "Companion", "zci", "yci", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class adi implements xn11 {
    public static final zci Companion = new zci();
    public static final adi c = new adi(0);
    public final boolean b;

    public /* synthetic */ adi(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adi) && this.b == ((adi) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return nzs.b("DeliveryLiveLocationExperiment(forceTurnOn=", Extension.C_BRAKE, this.b);
    }

    public adi(int i) {
        this.b = false;
    }

    public adi() {
        this(0);
    }
}
