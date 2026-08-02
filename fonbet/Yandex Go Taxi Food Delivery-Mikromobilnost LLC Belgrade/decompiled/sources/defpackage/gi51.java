package defpackage;

import com.ybsdk.api.pro.entities.YBProSdkTrackId;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class gi51 extends gu91 {
    public final YBProSdkTrackId f;

    public gi51(YBProSdkTrackId yBProSdkTrackId) {
        this.f = yBProSdkTrackId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi51) && this.f.equals(((gi51) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Authorization(trackId=" + this.f + Extension.C_BRAKE;
    }
}
