package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: DrawableUtils.java */
/* loaded from: classes17.dex */
public final class uko {
    public static final a a = new a(Integer.class, "alpha");

    /* compiled from: DrawableUtils.java */
    public class a extends Property<Drawable, Integer> {
        @Override // android.util.Property
        public final Integer get(Drawable drawable) {
            return Integer.valueOf(drawable.getAlpha());
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, Integer num) {
            drawable.setAlpha(num.intValue());
        }
    }

    @NonNull
    public static Bitmap a(@NonNull Context context, int i, int i2, int i3) {
        Drawable a2 = m33.a(i, context);
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        a2.setBounds(0, 0, i2, i3);
        a2.draw(canvas);
        return createBitmap;
    }

    public static void b(@NonNull TextView textView, int i, int i2) {
        if (i == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i2 == 0) {
            c(textView, m33.a(i, textView.getContext()), null);
        } else {
            Context context = textView.getContext();
            c(textView, m33.a(i, context), anj.b(i2, context));
        }
    }

    public static void c(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable ColorStateList colorStateList) {
        if (drawable == null) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @NonNull
    public static Drawable d(int i, int i2, @NonNull Context context) {
        return e(m33.a(i, context), anj.b(i2, context));
    }

    @NonNull
    public static Drawable e(@NonNull Drawable drawable, @NonNull ColorStateList colorStateList) {
        Drawable mutate = drawable.mutate();
        mutate.setTintList(colorStateList);
        return mutate;
    }

    @NonNull
    public static Drawable f(int i, int i2, @NonNull Context context) {
        return e(m33.a(i, context), ColorStateList.valueOf(krv0.m(i2, context)));
    }
}
