package xsna;

import java.util.ArrayList;

/* compiled from: MeanMinMaxValue.kt */
/* loaded from: classes3.dex */
public final class yo10 {
    public float a;
    public Float b;
    public Float c;
    public int d;
    public final ArrayList e = new ArrayList();
    public Float f;

    public final Float a() {
        int i = this.d;
        if (i == 0) {
            return null;
        }
        return Float.valueOf(this.a / i);
    }

    public final void b(float f) {
        this.e.add(Float.valueOf(f));
        this.a += f;
        Float f2 = this.b;
        this.b = Float.valueOf(Math.max(f2 != null ? f2.floatValue() : Float.NEGATIVE_INFINITY, f));
        Float f3 = this.c;
        this.c = Float.valueOf(Math.min(f3 != null ? f3.floatValue() : Float.POSITIVE_INFINITY, f));
        this.d++;
        this.f = null;
    }
}
