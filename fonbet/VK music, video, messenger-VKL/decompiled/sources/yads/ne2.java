package yads;

import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class ne2 {
    public static final me2 Companion = new me2();
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ ne2(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
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
        if (!(obj instanceof ne2)) {
            return false;
        }
        ne2 ne2Var = (ne2) obj;
        return epx.f(this.a, ne2Var.a) && epx.f(this.b, ne2Var.b) && epx.f(this.c, ne2Var.c) && epx.f(this.d, ne2Var.d) && epx.f(this.e, ne2Var.e);
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
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        Integer num4 = this.d;
        Integer num5 = this.e;
        StringBuilder a = xsna.wr.a(num, "PlayBackOptimizationConfig(minBufferMs=", num2, ", maxBufferMs=", ", bufferForPlaybackMs=");
        xsna.sq.b(a, num3, ", bufferForPlaybackAfterRebufferMs=", num4, ", targetBufferBytes=");
        return xsna.oq.b(a, num5, ")");
    }
}
