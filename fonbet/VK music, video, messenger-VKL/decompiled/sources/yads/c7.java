package yads;

import java.util.List;
import xsna.epx;
import xsna.h5s;

/* loaded from: classes10.dex */
public final class c7 {
    public final List a;
    public final int b;
    public final int c;

    public c7(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return epx.f(this.a, c7Var.a) && this.b == c7Var.b && this.c == c7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + re3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        List list = this.a;
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder("AdPod(items=");
        sb.append(list);
        sb.append(", closableAdPosition=");
        sb.append(i);
        sb.append(", rewardAdPosition=");
        return h5s.c(i2, ")", sb);
    }
}
