package defpackage;

import com.yandex.mob.okhttp.metrics.MobCallStatus;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class gm20 {
    public final MobCallStatus a;
    public final long b;
    public final ConcurrentHashMap c;

    public gm20(MobCallStatus mobCallStatus, long j, ConcurrentHashMap concurrentHashMap) {
        this.a = mobCallStatus;
        this.b = j;
        this.c = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm20)) {
            return false;
        }
        gm20 gm20Var = (gm20) obj;
        return this.a == gm20Var.a && this.b == gm20Var.b && this.c.equals(gm20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MobCallState(mobCallStatus=" + this.a + ", timeMs=" + this.b + ", parameters=" + this.c + Extension.C_BRAKE;
    }
}
