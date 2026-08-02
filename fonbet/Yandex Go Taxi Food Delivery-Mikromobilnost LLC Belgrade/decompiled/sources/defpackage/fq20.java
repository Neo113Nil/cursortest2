package defpackage;

import com.yandex.mob.network.MobNetworkErrorType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class fq20 extends gq20 {
    public final MobNetworkErrorType a;

    public fq20(MobNetworkErrorType mobNetworkErrorType) {
        this.a = mobNetworkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq20) && this.a == ((fq20) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unavailable(cause=" + this.a + Extension.C_BRAKE;
    }
}
