package xsna;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: Dependency.java */
/* loaded from: classes.dex */
public final class gzl {
    public final toe0<?> a;
    public final int b;
    public final int c;

    public gzl(int i, int i2, Class cls) {
        this((toe0<?>) toe0.a(cls), i, i2);
    }

    public static gzl a(Class<?> cls) {
        return new gzl(0, 1, cls);
    }

    public static gzl b(Class<?> cls) {
        return new gzl(1, 0, cls);
    }

    public static gzl c(toe0<?> toe0Var) {
        return new gzl(toe0Var, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gzl)) {
            return false;
        }
        gzl gzlVar = (gzl) obj;
        return this.a.equals(gzlVar.a) && this.b == gzlVar.b && this.c == gzlVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = SignalingProtocol.KEY_CHAT_DIRECT;
        } else if (i2 == 1) {
            str = IronSourceConstants.EVENTS_PROVIDER;
        } else {
            if (i2 != 2) {
                throw new AssertionError(lhg.a(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return i5s.a(sb, str, "}");
    }

    public gzl(toe0<?> toe0Var, int i, int i2) {
        upj.a(toe0Var, "Null dependency anInterface.");
        this.a = toe0Var;
        this.b = i;
        this.c = i2;
    }
}
