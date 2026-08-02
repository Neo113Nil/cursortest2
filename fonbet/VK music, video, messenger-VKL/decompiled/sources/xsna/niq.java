package xsna;

import android.graphics.Paint;

/* compiled from: ChipFadeExtensions.kt */
/* loaded from: classes4.dex */
public final class niq {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Paint.Align e;

    public niq(float f, float f2, float f3, float f4, Paint.Align align) {
        Paint.Align align2 = Paint.Align.LEFT;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = align;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niq)) {
            return false;
        }
        niq niqVar = (niq) obj;
        if (Float.compare(this.a, niqVar.a) != 0 || Float.compare(this.b, niqVar.b) != 0 || Float.compare(this.c, niqVar.c) != 0 || Float.compare(this.d, niqVar.d) != 0 || this.e != niqVar.e) {
            return false;
        }
        Paint.Align align = Paint.Align.LEFT;
        return true;
    }

    public final int hashCode() {
        return Paint.Align.LEFT.hashCode() + ((this.e.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "FadeGeometry(textX=" + this.a + ", postTextX=" + this.b + ", fadeStart=" + this.c + ", fadeEnd=" + this.d + ", textAlign=" + this.e + ", postTextAlign=" + Paint.Align.LEFT + ')';
    }
}
