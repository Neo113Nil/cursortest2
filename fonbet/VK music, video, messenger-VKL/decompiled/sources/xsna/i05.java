package xsna;

/* compiled from: AudioWaveSettings.kt */
/* loaded from: classes18.dex */
public final class i05 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final long g;
    public final Long h;
    public final float i;
    public final float j;

    public i05(float f, float f2, float f3, float f4, float f5, float f6, long j, Long l) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = j;
        this.h = l;
        this.i = f + f2;
        this.j = f6 / 2.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i05)) {
            return false;
        }
        i05 i05Var = (i05) obj;
        return Float.compare(this.a, i05Var.a) == 0 && Float.compare(this.b, i05Var.b) == 0 && Float.compare(this.c, i05Var.c) == 0 && Float.compare(this.d, i05Var.d) == 0 && Float.compare(this.e, i05Var.e) == 0 && Float.compare(this.f, i05Var.f) == 0 && this.g == i05Var.g && epx.f(this.h, i05Var.h);
    }

    public final int hashCode() {
        int a = bh10.a(io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31, this.g);
        Long l = this.h;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioWaveSettings(lineWidth=");
        sb.append(this.a);
        sb.append(", spacingWidth=");
        sb.append(this.b);
        sb.append(", widthPerMicrosecond=");
        sb.append(this.c);
        sb.append(", maxWaveHeight=");
        sb.append(this.d);
        sb.append(", minWaveHeight=");
        sb.append(this.e);
        sb.append(", viewHeight=");
        sb.append(this.f);
        sb.append(", durationMs=");
        sb.append(this.g);
        sb.append(", recommendedTimeMs=");
        return iq.b(sb, this.h, ')');
    }
}
