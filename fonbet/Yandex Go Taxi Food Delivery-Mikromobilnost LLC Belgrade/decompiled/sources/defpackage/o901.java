package defpackage;

import com.yandex.mapkit.traffic.TrafficColor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class o901 extends r901 {
    public final TrafficColor a;
    public final int b;

    public o901(TrafficColor trafficColor, int i) {
        this.a = trafficColor;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o901)) {
            return false;
        }
        o901 o901Var = (o901) obj;
        return this.a == o901Var.a && this.b == o901Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Enabled(color=" + this.a + ", levelValue=" + this.b + Extension.C_BRAKE;
    }
}
