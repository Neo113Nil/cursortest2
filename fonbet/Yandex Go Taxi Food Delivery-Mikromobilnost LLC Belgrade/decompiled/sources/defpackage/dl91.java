package defpackage;

/* loaded from: classes11.dex */
public final class dl91 {
    public static final dl91 c;
    public static final dl91 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (ql91.w) {
            d = null;
            c = null;
        } else {
            d = new dl91(null, false);
            c = new dl91(null, true);
        }
    }

    public dl91(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
