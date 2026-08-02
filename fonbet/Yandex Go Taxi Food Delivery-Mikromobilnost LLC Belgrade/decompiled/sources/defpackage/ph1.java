package defpackage;

/* loaded from: classes.dex */
public final class ph1 {
    public static final ph1 c;
    public static final ph1 d;
    public static final ph1 e;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i = 0;
        c = new ph1("TINK", i);
        d = new ph1("CRUNCHY", i);
        e = new ph1("NO_PREFIX", i);
    }

    public /* synthetic */ ph1(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }
}
