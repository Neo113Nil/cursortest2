package defpackage;

import com.ybsdk.api.push.YbPushPlatform;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bu51 {
    public final String a;
    public final YbPushPlatform b;

    public bu51(String str, YbPushPlatform ybPushPlatform) {
        this.a = str;
        this.b = ybPushPlatform;
    }

    public final YbPushPlatform a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu51)) {
            return false;
        }
        bu51 bu51Var = (bu51) obj;
        return this.a.equals(bu51Var.a) && this.b == bu51Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YbPushToken(pushToken=" + this.a + ", platform=" + this.b + Extension.C_BRAKE;
    }
}
