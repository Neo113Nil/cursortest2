package yads;

import xsna.h5s;
import xsna.odj;

/* loaded from: classes10.dex */
public final class mm1 {
    public final int a;
    public final int b;
    public final int c;

    public mm1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm1)) {
            return false;
        }
        mm1 mm1Var = (mm1) obj;
        return this.a == mm1Var.a && this.b == mm1Var.b && this.c == mm1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + re3.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return h5s.c(this.c, ")", odj.a(this.a, this.b, "MediaFileInfo(width=", ", height=", ", bitrate="));
    }
}
