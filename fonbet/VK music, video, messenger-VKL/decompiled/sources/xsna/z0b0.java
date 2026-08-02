package xsna;

/* compiled from: PlayerEqualizer.kt */
/* loaded from: classes3.dex */
public interface z0b0 {
    public static final a a = a.a;

    /* compiled from: PlayerEqualizer.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final short[] b;
        public static final int[] c;

        static {
            short[] sArr = new short[2];
            for (int i = 0; i < 2; i++) {
                sArr[i] = 0;
            }
            b = sArr;
            int[] iArr = new int[2];
            for (int i2 = 0; i2 < 2; i2++) {
                iArr[i2] = 0;
            }
            c = iArr;
        }
    }

    void a(short s, short s2);

    void b(ztp ztpVar);

    boolean c();

    short[] d();

    int e(short s);

    int[] f(short s);

    short g();

    short h(short s);

    void release();

    void setEnabled(boolean z);
}
