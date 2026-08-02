package xsna;

/* compiled from: SelectionHandles.kt */
/* loaded from: classes11.dex */
public final class kdi0 {
    public static final float a;
    public static final float b;
    public static final sgi0<jdi0> c = new sgi0<>("SelectionHandleInfo");

    static {
        float f = 25;
        a = f;
        b = f;
    }

    public static final long a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
