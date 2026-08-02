package defpackage;

/* loaded from: classes.dex */
public final class c43 extends ctx0 {
    public static volatile c43 b;
    public static final b43 c = new b43(0);
    public final ylh a = new ylh();

    public static c43 a() {
        if (b != null) {
            return b;
        }
        synchronized (c43.class) {
            try {
                if (b == null) {
                    b = new c43();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
