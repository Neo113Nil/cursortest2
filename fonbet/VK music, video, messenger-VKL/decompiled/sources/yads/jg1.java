package yads;

import java.util.List;
import xsna.efz;
import xsna.epx;

/* loaded from: classes10.dex */
public final class jg1 {
    public final List a;
    public final er0 b;
    public final List c;
    public final String d;
    public final long e;

    public jg1(List list, er0 er0Var, List list2, String str, long j) {
        this.a = list;
        this.b = er0Var;
        this.c = list2;
        this.d = str;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg1)) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        return epx.f(this.a, jg1Var.a) && epx.f(this.b, jg1Var.b) && epx.f(this.c, jg1Var.c) && epx.f(this.d, jg1Var.d) && this.e == jg1Var.e;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        er0 er0Var = this.b;
        int a = eb.a(this.c, (hashCode + (er0Var == null ? 0 : er0Var.hashCode())) * 31, 31);
        String str = this.d;
        return Long.hashCode(this.e) + ((a + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        List list = this.a;
        er0 er0Var = this.b;
        List list2 = this.c;
        String str = this.d;
        long j = this.e;
        StringBuilder sb = new StringBuilder("Link(actions=");
        sb.append(list);
        sb.append(", falseClick=");
        sb.append(er0Var);
        sb.append(", trackingUrls=");
        xsna.vr.c(", url=", str, ", clickableDelay=", sb, list2);
        return efz.b(j, ")", sb);
    }
}
