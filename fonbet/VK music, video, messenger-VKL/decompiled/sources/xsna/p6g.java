package xsna;

import xsna.b5x;

/* compiled from: ColorIssue.kt */
/* loaded from: classes18.dex */
public abstract class p6g implements b5x.a {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public p6g(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final String a() {
        Integer num = this.a;
        if (num != null && num.intValue() > 0) {
            return b() + " (attribute)";
        }
        Integer num2 = this.b;
        if (num2 != null && num2.intValue() > 0) {
            return b() + " (resource)";
        }
        if (this.c == null) {
            return b();
        }
        return b() + " (value)";
    }

    public abstract String b();
}
