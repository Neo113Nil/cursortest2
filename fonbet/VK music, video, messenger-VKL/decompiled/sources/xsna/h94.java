package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.ImageView;
import xsna.uko;

/* compiled from: TalkBackDrawable.kt */
/* loaded from: classes2.dex */
public final class h94 implements w2o0 {
    public final int a;
    public final int b;
    public final int c;

    public h94(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // xsna.w2o0
    public final void a(ImageView imageView, boolean z) {
        int i = this.a;
        int i2 = this.c;
        if (i2 == 0) {
            imageView.setImageResource(i);
        } else if (z) {
            TypedValue typedValue = krv0.a;
            krv0.p(imageView, i, i2);
        } else {
            Context context = imageView.getContext();
            int f = e3m.f(i2, imageView.getContext());
            uko.a aVar = uko.a;
            imageView.setImageDrawable(uko.e(m33.a(i, context), ColorStateList.valueOf(f)));
        }
        imageView.setContentDescription(imageView.getContext().getString(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h94)) {
            return false;
        }
        h94 h94Var = (h94) obj;
        return this.a == h94Var.a && this.b == h94Var.b && this.c == h94Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttrResTalkBackDrawable(drawableRes=");
        sb.append(this.a);
        sb.append(", contentDescriptionRes=");
        sb.append(this.b);
        sb.append(", tintResId=");
        return vu5.b(sb, this.c, ')');
    }
}
