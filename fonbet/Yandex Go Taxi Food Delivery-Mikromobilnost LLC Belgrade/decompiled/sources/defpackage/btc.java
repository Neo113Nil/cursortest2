package defpackage;

import com.ybsdk.core.common.domain.entities.CommunicationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class btc {
    public final String a;
    public final String b;
    public final ye0 c;
    public final CommunicationType d;

    public btc(String str, String str2, ye0 ye0Var, CommunicationType communicationType) {
        this.a = str;
        this.b = str2;
        this.c = ye0Var;
        this.d = communicationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btc)) {
            return false;
        }
        btc btcVar = (btc) obj;
        return jl40.l(this.a, btcVar.a) && jl40.l(this.b, btcVar.b) && jl40.l(this.c, btcVar.c) && this.d == btcVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CommunicationShownInfoEntity(eventId=", this.a, ", defaultGroup=", this.b, ", screenType=");
        v.append(this.c);
        v.append(", communicationType=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
