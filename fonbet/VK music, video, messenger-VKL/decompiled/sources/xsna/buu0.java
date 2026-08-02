package xsna;

import android.widget.ImageView;

/* compiled from: VkFeedCarouselCard.kt */
/* loaded from: classes18.dex */
public final class buu0 {
    public final String a;
    public final a b;
    public final ImageView.ScaleType c;

    /* compiled from: VkFeedCarouselCard.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CornerRadius(topStart=");
            sb.append(this.a);
            sb.append(", topEnd=");
            sb.append(this.b);
            sb.append(", bottomEnd=");
            sb.append(this.c);
            sb.append(", bottomStart=");
            return xq.c(')', this.d, sb);
        }
    }

    public buu0(String str, a aVar, ImageView.ScaleType scaleType) {
        this.a = str;
        this.b = aVar;
        this.c = scaleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buu0)) {
            return false;
        }
        buu0 buu0Var = (buu0) obj;
        return epx.f(this.a, buu0Var.a) && this.b.equals(buu0Var.b) && this.c == buu0Var.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 961;
        ImageView.ScaleType scaleType = this.c;
        return (hashCode + (scaleType == null ? 0 : scaleType.hashCode())) * 31;
    }

    public final String toString() {
        return "Media(url=" + this.a + ", corners=" + this.b + ", placeholder=null, scaleType=" + this.c + ", contentDescription=null)";
    }
}
