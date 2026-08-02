package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnlt;", "Lw96;", "Companion", "mlt", "llt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class nlt extends w96 {
    public static final mlt Companion = new mlt();
    public static final nlt i = new nlt(0);
    public final boolean b;
    public final elt c;
    public final klt d;
    public final ult e;
    public final boolean f;
    public final int g;
    public final int h;

    public /* synthetic */ nlt(int i2, boolean z, elt eltVar, klt kltVar, ult ultVar, boolean z2, int i3, int i4) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = new elt(0);
        } else {
            this.c = eltVar;
        }
        if ((i2 & 4) == 0) {
            this.d = new klt(0);
        } else {
            this.d = kltVar;
        }
        if ((i2 & 8) == 0) {
            this.e = new ult(0);
        } else {
            this.e = ultVar;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i2 & 32) == 0) {
            this.g = 0;
        } else {
            this.g = i3;
        }
        if ((i2 & 64) == 0) {
            this.h = 0;
        } else {
            this.h = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlt)) {
            return false;
        }
        nlt nltVar = (nlt) obj;
        return this.b == nltVar.b && jl40.l(this.c, nltVar.c) && jl40.l(this.d, nltVar.d) && jl40.l(this.e, nltVar.e) && this.f == nltVar.f && this.g == nltVar.g && this.h == nltVar.h;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + oyr.b(this.g, unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31)) * 31, 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GnssParamsExperiment(enabled=");
        sb.append(this.b);
        sb.append(", clock=");
        sb.append(this.c);
        sb.append(", measurement=");
        sb.append(this.d);
        sb.append(", satellite=");
        sb.append(this.e);
        sb.append(", isSpoofed=");
        sb.append(this.f);
        sb.append(", maxCountSatellites=");
        sb.append(this.g);
        sb.append(", maxCountFrequencies=");
        return oyr.m(this.h, Extension.C_BRAKE, sb);
    }

    public nlt() {
        this(0);
    }

    public nlt(int i2) {
        elt eltVar = new elt(0);
        klt kltVar = new klt(0);
        ult ultVar = new ult(0);
        this.b = false;
        this.c = eltVar;
        this.d = kltVar;
        this.e = ultVar;
        this.f = false;
        this.g = 0;
        this.h = 0;
    }
}
