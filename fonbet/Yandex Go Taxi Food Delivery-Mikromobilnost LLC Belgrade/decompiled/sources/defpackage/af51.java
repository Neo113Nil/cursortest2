package defpackage;

import com.ybsdk.api.entities.YBAutoTopupStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class af51 {
    public final YBAutoTopupStatus a;
    public final vh51 b;

    public af51(YBAutoTopupStatus yBAutoTopupStatus, vh51 vh51Var) {
        this.a = yBAutoTopupStatus;
        this.b = vh51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af51)) {
            return false;
        }
        af51 af51Var = (af51) obj;
        return this.a == af51Var.a && jl40.l(this.b, af51Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vh51 vh51Var = this.b;
        return hashCode + (vh51Var == null ? 0 : vh51Var.hashCode());
    }

    public final String toString() {
        return "YBAutoTopupInfo(status=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
