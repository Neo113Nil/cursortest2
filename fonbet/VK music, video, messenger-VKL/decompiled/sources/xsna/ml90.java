package xsna;

import com.vkontakte.android.R;

/* compiled from: ParticlesConfig.kt */
/* loaded from: classes6.dex */
public final class ml90 {
    public final tye0 a;
    public final ll90 b;
    public final iaq c;
    public final int d;
    public final long e;

    public ml90() {
        this(null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml90)) {
            return false;
        }
        ml90 ml90Var = (ml90) obj;
        return epx.f(this.a, ml90Var.a) && epx.f(this.b, ml90Var.b) && epx.f(this.c, ml90Var.c) && this.d == ml90Var.d && this.e == ml90Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticleViewConfig(rays=");
        sb.append(this.a);
        sb.append(", particles=");
        sb.append(this.b);
        sb.append(", explosion=");
        sb.append(this.c);
        sb.append(", iconResId=");
        sb.append(this.d);
        sb.append(", startDelay=");
        return vu5.a(')', this.e, sb);
    }

    public ml90(tye0 tye0Var, ll90 ll90Var, iaq iaqVar, int i) {
        tye0Var = (i & 1) != 0 ? new tye0(524287) : tye0Var;
        ll90Var = (i & 2) != 0 ? new ll90(524287) : ll90Var;
        iaqVar = (i & 4) != 0 ? new iaq(7) : iaqVar;
        this.a = tye0Var;
        this.b = ll90Var;
        this.c = iaqVar;
        this.d = R.drawable.vk_icon_sparkle_16;
        this.e = 300L;
    }
}
