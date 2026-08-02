package yads;

import xsna.odj;
import xsna.rzl;

/* loaded from: classes10.dex */
public final class yy1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public yy1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy1)) {
            return false;
        }
        yy1 yy1Var = (yy1) obj;
        return this.a == yy1Var.a && this.b == yy1Var.b && this.c == yy1Var.c && this.d == yy1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + re3.a(this.c, re3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return rzl.a(this.c, this.d, ", unmutedContentDescriptionId=", ")", odj.a(this.a, this.b, "MuteControlResources(mutedResourceId=", ", unmutedResourceId=", ", mutedContentDescriptionId="));
    }
}
