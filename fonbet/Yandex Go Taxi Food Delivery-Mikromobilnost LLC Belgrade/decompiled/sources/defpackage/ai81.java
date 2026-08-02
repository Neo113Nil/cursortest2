package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class ai81 {
    public static final xe81 Companion = new xe81();
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public ai81(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai81)) {
            return false;
        }
        ai81 ai81Var = (ai81) obj;
        return jl40.l(this.a, ai81Var.a) && jl40.l(this.b, ai81Var.b) && jl40.l(this.c, ai81Var.c) && jl40.l(this.d, ai81Var.d) && jl40.l(this.e, ai81Var.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayBackOptimizationConfig(minBufferMs=");
        sb.append(this.a);
        sb.append(", maxBufferMs=");
        sb.append(this.b);
        sb.append(", bufferForPlaybackMs=");
        sb.append(this.c);
        sb.append(", bufferForPlaybackAfterRebufferMs=");
        sb.append(this.d);
        sb.append(", targetBufferBytes=");
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
