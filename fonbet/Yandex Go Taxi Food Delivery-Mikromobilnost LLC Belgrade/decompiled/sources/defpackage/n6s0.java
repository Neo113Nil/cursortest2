package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class n6s0 implements ig5 {
    public static final m6s0 Companion = new m6s0();
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public /* synthetic */ n6s0(int i, String str, long j, String str2, String str3, float f, float f2, float f3, float f4, float f5) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, l6s0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = 300L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0.0f;
        } else {
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = 0.0f;
        } else {
            this.f = f2;
        }
        if ((i & 64) == 0) {
            this.g = 1.0f;
        } else {
            this.g = f3;
        }
        if ((i & 128) == 0) {
            this.h = 0.0f;
        } else {
            this.h = f4;
        }
        if ((i & 256) == 0) {
            this.i = 0.0f;
        } else {
            this.i = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6s0)) {
            return false;
        }
        n6s0 n6s0Var = (n6s0) obj;
        return jl40.l(this.a, n6s0Var.a) && this.b == n6s0Var.b && jl40.l(this.c, n6s0Var.c) && jl40.l(this.d, n6s0Var.d) && Float.compare(this.e, n6s0Var.e) == 0 && Float.compare(this.f, n6s0Var.f) == 0 && Float.compare(this.g, n6s0Var.g) == 0 && Float.compare(this.h, n6s0Var.h) == 0 && Float.compare(this.i, n6s0Var.i) == 0;
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Float.hashCode(this.i) + g8e.c(this.h, g8e.c(this.g, g8e.c(this.f, g8e.c(this.e, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("ShowCutoutAction(viewId=", this.a, ", animationDurationMs=", this.b);
        g8e.D(l, ", animationType=", this.c, ", shadowColor=", this.d);
        l.append(", shadowOffsetX=");
        l.append(this.e);
        l.append(", shadowOffsetY=");
        l.append(this.f);
        l.append(", shadowOpacity=");
        l.append(this.g);
        l.append(", shadowRadius=");
        l.append(this.h);
        l.append(", shadowSpread=");
        l.append(this.i);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
