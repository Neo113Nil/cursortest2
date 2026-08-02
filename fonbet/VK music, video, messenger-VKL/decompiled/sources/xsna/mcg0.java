package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: MusicDeviceRestrictionsConfig.kt */
/* loaded from: classes3.dex */
public final class mcg0 {
    public final String a;
    public final List<k9x> b;
    public final eg40 c;

    public mcg0() {
        throw null;
    }

    public mcg0(String str) {
        List<k9x> singletonList = Collections.singletonList(new k9x(33, Integer.MAX_VALUE, 1));
        eg40 eg40Var = new eg40(0);
        this.a = str;
        this.b = singletonList;
        this.c = eg40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcg0)) {
            return false;
        }
        mcg0 mcg0Var = (mcg0) obj;
        return epx.f(this.a, mcg0Var.a) && epx.f(this.b, mcg0Var.b) && epx.f(this.c, mcg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RestrictedMusicDevice(deviceName=" + this.a + ", restrictedApiList=" + this.b + ", restrictionsConfig=" + this.c + ')';
    }
}
