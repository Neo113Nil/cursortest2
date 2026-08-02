package xsna;

import android.graphics.Paint;

/* compiled from: ChipTextFadeDrawing.kt */
/* loaded from: classes18.dex */
public final class oiq {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Paint.Align e;

    public oiq(float f, float f2, float f3, float f4, Paint.Align align) {
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
        if (!(obj instanceof oiq)) {
            return false;
        }
        oiq oiqVar = (oiq) obj;
        if (Float.compare(this.a, oiqVar.a) != 0 || Float.compare(this.b, oiqVar.b) != 0 || Float.compare(this.c, oiqVar.c) != 0 || Float.compare(this.d, oiqVar.d) != 0 || this.e != oiqVar.e) {
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
