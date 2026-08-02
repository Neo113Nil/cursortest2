package xsna;

/* compiled from: SelectionMagnifier.kt */
/* loaded from: classes11.dex */
public final class sdi0 {
    public static final tq2 a = new tq2(Float.NaN, Float.NaN);
    public static final jtp0 b = new jtp0(new k220(24), new zos(29));
    public static final long c;
    public static final xmk0<ov70> d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new xmk0<>(new ov70(floatToRawIntBits), 3);
    }
}
