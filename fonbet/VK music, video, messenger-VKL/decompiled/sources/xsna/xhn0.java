package xsna;

import android.widget.FrameLayout;
import com.vk.typography.FontFamily;

/* compiled from: SupperAppImageStackView.kt */
/* loaded from: classes6.dex */
public final class xhn0 extends FrameLayout {
    public boolean b;
    public float c;
    public Float d;
    public a e;
    public float f;
    public FontFamily g;

    /* compiled from: SupperAppImageStackView.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OverlapOffset(visiblePart=");
            sb.append(this.a);
            sb.append(", marginBetweenImages=");
            sb.append(this.b);
            sb.append(", singleImageWidth=");
            return xq.c(')', this.c, sb);
        }

        public a(float f, float f2) {
            this.a = f;
            this.b = 2.0f;
            this.c = f2;
        }

        public /* synthetic */ a(int i) {
            this(24.0f, 24.0f);
        }
    }

    public final Float getBorderWidth() {
        return this.d;
    }

    public final float getCornerRadiusImages() {
        return this.c;
    }

    public final FontFamily getExtraCounterTextFontFamily() {
        return this.g;
    }

    public final float getExtraCounterTextSize() {
        return this.f;
    }

    public final a getOverlapOffset() {
        return this.e;
    }

    public final void setBorderWidth(Float f) {
        this.d = f;
        requestLayout();
    }

    public final void setCircle(boolean z) {
        this.b = z;
        requestLayout();
    }

    public final void setCornerRadiusImages(float f) {
        this.c = f;
        requestLayout();
    }

    public final void setExtraCounterTextFontFamily(FontFamily fontFamily) {
        this.g = fontFamily;
        requestLayout();
    }

    public final void setExtraCounterTextSize(float f) {
        this.f = f;
        requestLayout();
    }

    public final void setOverlapOffset(a aVar) {
        this.e = aVar;
        requestLayout();
    }
}
