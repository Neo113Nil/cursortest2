package xsna;

/* compiled from: ColorSpace.kt */
/* loaded from: classes11.dex */
public abstract class d8g {
    public final String a;
    public final long b;
    public final int c;

    public d8g(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    public boolean d() {
        return false;
    }

    public long e(float f, float f2, float f3) {
        float[] f4 = f(new float[]{f, f2, f3});
        return (Float.floatToRawIntBits(f4[0]) << 32) | (Float.floatToRawIntBits(f4[1]) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d8g d8gVar = (d8g) obj;
        if (this.c == d8gVar.c && epx.f(this.a, d8gVar.a)) {
            return x6g.a(this.b, d8gVar.b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f, float f2, float f3) {
        return f(new float[]{f, f2, f3})[2];
    }

    public long h(float f, float f2, float f3, float f4, d8g d8gVar) {
        int i = x6g.e;
        float[] fArr = new float[(int) (this.b >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] a = a(fArr);
        return f870.b(a[0], a[1], a[2], f4, d8gVar);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = x6g.e;
        return bh10.a(hashCode, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) x6g.b(this.b)) + ')';
    }
}
