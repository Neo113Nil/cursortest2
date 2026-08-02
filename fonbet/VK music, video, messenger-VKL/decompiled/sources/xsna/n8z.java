package xsna;

/* compiled from: LinearSlowdown.kt */
/* loaded from: classes6.dex */
public final class n8z {
    public float a;
    public float b;
    public float c;

    public final float a(long j) {
        return (this.b * j) + this.c;
    }

    public final void b(int i, long j, float f) {
        this.a = f;
        double d = 2;
        this.b = (((float) Math.pow(f, d)) * (-1.0f)) / (i * 2);
        float f2 = this.a;
        this.c = ((((float) Math.pow(f2, d)) * j) / (i * 2.0f)) + f2;
    }
}
