package xsna;

/* compiled from: DynamicFloatArray.java */
/* loaded from: classes17.dex */
public final class ppo {
    public float[] a = new float[110];
    public int b = 0;

    public final float a(int i) {
        if (i < this.b && i >= 0) {
            return this.a[i];
        }
        StringBuilder b = ji.b(i, "Index: ", ", Size: ");
        b.append(this.b);
        throw new IndexOutOfBoundsException(b.toString());
    }
}
