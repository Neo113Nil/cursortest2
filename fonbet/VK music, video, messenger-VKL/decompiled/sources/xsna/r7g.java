package xsna;

import android.widget.ImageView;

/* compiled from: TalkBackDrawable.kt */
/* loaded from: classes2.dex */
public final class r7g implements w2o0 {
    public final int a;
    public final int b;
    public final int c;

    public r7g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // xsna.w2o0
    public final void a(ImageView imageView, boolean z) {
        int i = this.a;
        int i2 = this.c;
        if (i2 != 0) {
            imageView.setImageDrawable(uko.d(i, i2, imageView.getContext()));
        } else {
            imageView.setImageResource(i);
        }
        imageView.setContentDescription(imageView.getContext().getString(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7g)) {
            return false;
        }
        r7g r7gVar = (r7g) obj;
        return this.a == r7gVar.a && this.b == r7gVar.b && this.c == r7gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorResTalkBackDrawable(drawableRes=");
        sb.append(this.a);
        sb.append(", contentDescriptionRes=");
        sb.append(this.b);
        sb.append(", tintResId=");
        return vu5.b(sb, this.c, ')');
    }
}
