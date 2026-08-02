package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class iys {
    public static final hys Companion = new hys();
    public static final i3y[] h;
    public final String a;
    public final double b;
    public final Double c;
    public final InterpolationType d;
    public final lu1 e;
    public final gw01 f;
    public final tg2 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new sss(1)), null, null, a.b(lazyThreadSafetyMode, new sss(2))};
    }

    public /* synthetic */ iys(int i, String str, double d, Double d2, InterpolationType interpolationType, lu1 lu1Var, gw01 gw01Var, tg2 tg2Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gys.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = interpolationType;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = lu1Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = gw01Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = tg2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iys)) {
            return false;
        }
        iys iysVar = (iys) obj;
        return jl40.l(this.a, iysVar.a) && Double.compare(this.b, iysVar.b) == 0 && jl40.l(this.c, iysVar.c) && this.d == iysVar.d && jl40.l(this.e, iysVar.e) && jl40.l(this.f, iysVar.f) && jl40.l(this.g, iysVar.g);
    }

    public final int hashCode() {
        int a = unr0.a(this.a.hashCode() * 31, 31, this.b);
        Double d = this.c;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        InterpolationType interpolationType = this.d;
        int hashCode2 = (hashCode + (interpolationType == null ? 0 : interpolationType.hashCode())) * 31;
        lu1 lu1Var = this.e;
        int hashCode3 = (hashCode2 + (lu1Var == null ? 0 : lu1Var.hashCode())) * 31;
        gw01 gw01Var = this.f;
        int hashCode4 = (hashCode3 + (gw01Var == null ? 0 : gw01Var.hashCode())) * 31;
        tg2 tg2Var = this.g;
        return hashCode4 + (tg2Var != null ? tg2Var.hashCode() : 0);
    }

    public final String toString() {
        return "GenericAnimationSurrogate(type=" + this.a + ", duration=" + this.b + ", delay=" + this.c + ", interpolator=" + this.d + ", alpha=" + this.e + ", transform=" + this.f + ", onComplete=" + this.g + Extension.C_BRAKE;
    }
}
