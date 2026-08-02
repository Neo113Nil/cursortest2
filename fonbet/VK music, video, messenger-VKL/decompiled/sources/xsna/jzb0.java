package xsna;

/* compiled from: PopupWindowSize.kt */
/* loaded from: classes6.dex */
public final class jzb0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jzb0() {
        this(15, r0, r0);
        Integer num = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzb0)) {
            return false;
        }
        jzb0 jzb0Var = (jzb0) obj;
        return epx.f(this.a, jzb0Var.a) && epx.f(this.b, jzb0Var.b) && epx.f(this.c, jzb0Var.c) && epx.f(this.d, jzb0Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupWindowSize(verticalHeight=");
        sb.append(this.a);
        sb.append(", verticalWidth=");
        sb.append(this.b);
        sb.append(", horizontalHeight=");
        sb.append(this.c);
        sb.append(", horizontalWidth=");
        return uqi.b(sb, this.d, ')');
    }

    public /* synthetic */ jzb0(int i, Integer num, Integer num2) {
        this((i & 1) != 0 ? null : num, null, null, (i & 8) != 0 ? null : num2);
    }

    public jzb0(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }
}
