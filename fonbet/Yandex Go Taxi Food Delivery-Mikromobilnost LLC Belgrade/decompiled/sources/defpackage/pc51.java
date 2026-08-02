package defpackage;

import ru.CryptoPro.AdES.tools.AdESUtility;

/* loaded from: classes4.dex */
public final class pc51 {
    public static final u2 c;
    public static final u2 d;
    public static final u2 e;
    public static final u2 f;
    public boolean a;
    public w2 b;

    static {
        new u2("2.5.29.9");
        c = new u2("2.5.29.14");
        new u2(AdESUtility.KEY_USAGE);
        d = new u2("2.5.29.16");
        new u2("2.5.29.17");
        new u2("2.5.29.18");
        new u2("2.5.29.19");
        e = new u2("2.5.29.20");
        new u2("2.5.29.21");
        new u2("2.5.29.23");
        new u2("2.5.29.24");
        new u2("2.5.29.27");
        new u2("2.5.29.28");
        new u2("2.5.29.29");
        new u2("2.5.29.30");
        new u2("2.5.29.31");
        new u2("2.5.29.32");
        new u2("2.5.29.33");
        f = new u2("2.5.29.35");
        new u2("2.5.29.36");
        new u2(AdESUtility.EXTENDED_KEY_USAGE);
        new u2("2.5.29.46");
        new u2("2.5.29.54");
        new u2("1.3.6.1.5.5.7.1.1");
        new u2("1.3.6.1.5.5.7.1.11");
        new u2("1.3.6.1.5.5.7.1.12");
        new u2("1.3.6.1.5.5.7.1.2");
        new u2("1.3.6.1.5.5.7.1.3");
        new u2("1.3.6.1.5.5.7.1.4");
        new u2("2.5.29.56");
        new u2("2.5.29.55");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pc51)) {
            return false;
        }
        pc51 pc51Var = (pc51) obj;
        return pc51Var.b.q(this.b) && pc51Var.a == this.a;
    }

    public final int hashCode() {
        boolean z = this.a;
        w2 w2Var = this.b;
        return z ? rza1.e(w2Var.a) : ~rza1.e(w2Var.a);
    }
}
