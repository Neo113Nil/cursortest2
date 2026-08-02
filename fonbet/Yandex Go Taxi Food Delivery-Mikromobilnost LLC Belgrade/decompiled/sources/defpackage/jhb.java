package defpackage;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jhb {
    public final PinTokenEntity a;
    public final StartSessionState b;

    public jhb(PinTokenEntity pinTokenEntity, StartSessionState startSessionState) {
        this.a = pinTokenEntity;
        this.b = startSessionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhb)) {
            return false;
        }
        jhb jhbVar = (jhb) obj;
        return jl40.l(this.a, jhbVar.a) && jl40.l(this.b, jhbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckPinResult(tokenEntity=" + this.a + ", startSessionState=" + this.b + Extension.C_BRAKE;
    }
}
