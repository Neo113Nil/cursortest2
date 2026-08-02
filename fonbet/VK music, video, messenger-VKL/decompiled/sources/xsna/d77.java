package xsna;

import com.vk.biometrics.lock.impl.domain.model.UnlockType;
import xsna.xla0;

/* compiled from: BiometricsLockPinRender.kt */
/* loaded from: classes15.dex */
public final class d77 {
    public final String a;
    public final String b;
    public final xla0 c;
    public final wla0 d;
    public final UnlockType e;

    public d77() {
        this(null, 31);
    }

    public static d77 a(d77 d77Var, String str, String str2, xla0 xla0Var, wla0 wla0Var, UnlockType unlockType, int i) {
        if ((i & 1) != 0) {
            str = d77Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = d77Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            xla0Var = d77Var.c;
        }
        xla0 xla0Var2 = xla0Var;
        if ((i & 8) != 0) {
            wla0Var = d77Var.d;
        }
        wla0 wla0Var2 = wla0Var;
        if ((i & 16) != 0) {
            unlockType = d77Var.e;
        }
        d77Var.getClass();
        return new d77(str3, str4, xla0Var2, wla0Var2, unlockType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d77)) {
            return false;
        }
        d77 d77Var = (d77) obj;
        return epx.f(this.a, d77Var.a) && epx.f(this.b, d77Var.b) && epx.f(this.c, d77Var.c) && epx.f(this.d, d77Var.d) && this.e == d77Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "BiometricsLockPinPasswordContent(password=" + this.a + ", previousPassword=" + this.b + ", dotsColorState=" + this.c + ", backoff=" + this.d + ", unlockType=" + this.e + ')';
    }

    public d77(String str, String str2, xla0 xla0Var, wla0 wla0Var, UnlockType unlockType) {
        this.a = str;
        this.b = str2;
        this.c = xla0Var;
        this.d = wla0Var;
        this.e = unlockType;
    }

    public /* synthetic */ d77(wla0 wla0Var, int i) {
        this("", "", new xla0.a(), (i & 8) != 0 ? new wla0(false, 0L, 7) : wla0Var, UnlockType.PASSWORD);
    }
}
