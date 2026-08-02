package xsna;

/* compiled from: GcTrigger.java */
/* loaded from: classes.dex */
public class lht {
    public static final a a = new a();

    /* compiled from: GcTrigger.java */
    public class a extends lht {
        public final void a() {
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100L);
                System.runFinalization();
            } catch (InterruptedException unused) {
                throw new AssertionError();
            }
        }
    }
}
