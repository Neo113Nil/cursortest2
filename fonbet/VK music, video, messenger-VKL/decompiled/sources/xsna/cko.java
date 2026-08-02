package xsna;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: DrawableResource.java */
/* loaded from: classes12.dex */
public abstract class cko<T extends Drawable> implements hag0<T>, hzw {
    public final T b;

    public cko(T t) {
        nr2.r(t, "Argument must not be null");
        this.b = t;
    }

    @Override // xsna.hag0
    @NonNull
    public final Object get() {
        T t = this.b;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }

    @Override // xsna.hzw
    public void initialize() {
        T t = this.b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof gyt) {
            ((gyt) t).b.a.l.prepareToDraw();
        }
    }
}
