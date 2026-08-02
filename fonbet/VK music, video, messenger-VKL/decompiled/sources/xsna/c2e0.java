package xsna;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: ProgressDrawable.java */
/* loaded from: classes17.dex */
public abstract class c2e0 extends Drawable implements Animatable {
    public int[] b;

    @NonNull
    public int[] a() {
        return this.b;
    }

    public abstract void b(boolean z);

    public abstract void c(float f);

    public void d(@NonNull int... iArr) {
        this.b = iArr;
    }

    public abstract void e(float f);

    public abstract void f(float f);

    public abstract void g(float f);

    @Override // android.graphics.drawable.Drawable
    public abstract int getAlpha();

    public abstract void h(int i);
}
