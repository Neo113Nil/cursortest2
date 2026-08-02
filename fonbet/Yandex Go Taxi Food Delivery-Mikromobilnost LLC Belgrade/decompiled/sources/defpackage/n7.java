package defpackage;

/* loaded from: classes11.dex */
public final class n7 {
    public static final n7 b;
    public static final n7 c;
    public final Throwable a;

    static {
        if (x7.y) {
            c = null;
            b = null;
        } else {
            c = new n7(null, false);
            b = new n7(null, true);
        }
    }

    public n7(Throwable th, boolean z) {
        this.a = th;
    }
}
