package xsna;

import java.util.List;

/* compiled from: PollEntity.kt */
/* loaded from: classes6.dex */
public final class ypb0 {
    public final int a;
    public final List<String> b;
    public final Integer c;
    public final String d;
    public final String e;

    public ypb0(int i, Integer num, String str, String str2, List list) {
        this.a = i;
        this.b = list;
        this.c = num;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypb0)) {
            return false;
        }
        ypb0 ypb0Var = (ypb0) obj;
        return this.a == ypb0Var.a && epx.f(this.b, ypb0Var.b) && epx.f(this.c, ypb0Var.c) && epx.f(this.d, ypb0Var.d) && epx.f(this.e, ypb0Var.e);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollEntity(id=");
        sb.append(this.a);
        sb.append(", triggers=");
        sb.append(this.b);
        sb.append(", initialHeight=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", metadata=");
        return ho8.a(sb, this.e, ')');
    }
}
