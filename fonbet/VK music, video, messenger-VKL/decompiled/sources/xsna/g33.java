package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.R$styleable;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public final class g33 {

    @NonNull
    public final ImageView a;
    public vyo0 b;
    public int c = 0;

    public g33(@NonNull ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        vyo0 vyo0Var;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            rko.a(drawable);
        }
        if (drawable == null || (vyo0Var = this.b) == null) {
            return;
        }
        d33.e(drawable, vyo0Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = R$styleable.f;
        yyo0 e = yyo0.e(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = e.b;
        iut0.p(imageView, imageView.getContext(), iArr, attributeSet, e.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = m33.a(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                rko.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(e.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(rko.c(typedArray.getInt(3, -1), null));
            }
            e.f();
        } catch (Throwable th) {
            e.f();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable a = m33.a(i, imageView.getContext());
            if (a != null) {
                rko.a(a);
            }
            imageView.setImageDrawable(a);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
