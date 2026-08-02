package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class p84 {
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public p84(int i, int i2, int i3, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p84) {
            p84 p84Var = (p84) obj;
            List list = p84Var.a;
            List list2 = this.a;
            if (list2 != null ? list2.equals(list) : list == null) {
                List list3 = p84Var.b;
                List list4 = this.b;
                if (list4 != null ? list4.equals(list3) : list3 == null) {
                    if (this.c == p84Var.c && this.d == p84Var.d && this.e == p84Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List list2 = this.b;
        return this.e ^ (((((((list2 != null ? list2.hashCode() : 0) ^ hashCode) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs{bestSizes=");
        sb.append(this.a);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.b);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.c);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.d);
        sb.append(", maxFpsForAllSizes=");
        return oyr.m(this.e, "}", sb);
    }
}
