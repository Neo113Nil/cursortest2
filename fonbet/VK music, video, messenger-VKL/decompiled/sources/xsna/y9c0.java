package xsna;

import com.vk.dto.common.Image;

/* compiled from: PosterAttachmentInfo.kt */
/* loaded from: classes5.dex */
public final class y9c0 {
    public final String a;
    public final Image b;
    public final Image c;
    public final int d;
    public final int e;
    public final a f;

    /* compiled from: PosterAttachmentInfo.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public a(float f, float f2, float f3, float f4, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(this.e, aVar.e) == 0 && Float.compare(this.f, aVar.f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Constants(maxSymbols=");
            sb.append(this.a);
            sb.append(", rangeThreshold=");
            sb.append(this.b);
            sb.append(", fontSizeRatioRange1=");
            sb.append(this.c);
            sb.append(", lineHeightRatioRange1=");
            sb.append(this.d);
            sb.append(", fontSizeRatioRange2=");
            sb.append(this.e);
            sb.append(", lineHeightRatioRange2=");
            return xq.c(')', this.f, sb);
        }
    }

    public y9c0(String str, Image image, Image image2, int i, int i2, a aVar) {
        this.a = str;
        this.b = image;
        this.c = image2;
        this.d = i;
        this.e = i2;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9c0)) {
            return false;
        }
        y9c0 y9c0Var = (y9c0) obj;
        return epx.f(this.a, y9c0Var.a) && epx.f(this.b, y9c0Var.b) && epx.f(this.c, y9c0Var.c) && this.d == y9c0Var.d && this.e == y9c0Var.e && epx.f(this.f, y9c0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Image image = this.b;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.c;
        return this.f.hashCode() + shy.a(this.e, shy.a(this.d, (hashCode2 + (image2 != null ? image2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "PosterAttachmentInfo(text=" + this.a + ", backLayerImage=" + this.b + ", frontLayerImage=" + this.c + ", mainColor=" + this.d + ", textColor=" + this.e + ", constants=" + this.f + ')';
    }
}
