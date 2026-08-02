package xsna;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class ulr0 {
    public static final int[] a = new int[0];
    public static final float[] b = new float[0];
    public static final eg3 c = new eg3(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long a(wlr0<?> wlr0Var, long j) {
        long f = j - wlr0Var.f();
        long b2 = wlr0Var.b();
        if (f < 0) {
            f = 0;
        }
        return f > b2 ? b2 : f;
    }
}
