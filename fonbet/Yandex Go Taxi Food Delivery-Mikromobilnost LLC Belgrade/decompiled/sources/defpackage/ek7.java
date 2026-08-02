package defpackage;

import com.yandex.go.network_metrics.Status;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ek7 {
    public final Status a;
    public final long b;
    public final ConcurrentHashMap c;

    public ek7(Status status, long j, ConcurrentHashMap concurrentHashMap) {
        this.a = status;
        this.b = j;
        this.c = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek7)) {
            return false;
        }
        ek7 ek7Var = (ek7) obj;
        return this.a == ek7Var.a && this.b == ek7Var.b && this.c.equals(ek7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CallState(status=" + this.a + ", timeMs=" + this.b + ", parameters=" + this.c + Extension.C_BRAKE;
    }
}
