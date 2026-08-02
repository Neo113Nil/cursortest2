package defpackage;

import com.ybsdk.feature.pin.internal.domain.PinState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nwb0 {
    public final int a;
    public final PinState b;

    public nwb0(int i, PinState pinState) {
        this.a = i;
        this.b = pinState;
    }

    public final PinState a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwb0)) {
            return false;
        }
        nwb0 nwb0Var = (nwb0) obj;
        return this.a == nwb0Var.a && this.b == nwb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PinInputEntity(totalNumbers=" + this.a + ", pinState=" + this.b + Extension.C_BRAKE;
    }
}
