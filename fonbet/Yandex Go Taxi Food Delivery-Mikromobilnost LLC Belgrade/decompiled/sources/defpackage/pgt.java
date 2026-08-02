package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* loaded from: classes10.dex */
public final class pgt implements otj0, rwv {
    public final Drawable a;
    public final /* synthetic */ int b;

    public pgt(Drawable drawable, int i) {
        this.b = i;
        z2a1.e(drawable, "Argument must not be null");
        this.a = drawable;
    }

    private final void c() {
    }

    @Override // defpackage.otj0
    public final void a() {
        switch (this.b) {
            case 0:
                Drawable drawable = this.a;
                ((GifDrawable) drawable).stop();
                ((GifDrawable) drawable).recycle();
                break;
        }
    }

    @Override // defpackage.otj0
    public final Class b() {
        switch (this.b) {
            case 0:
                return GifDrawable.class;
            default:
                return this.a.getClass();
        }
    }

    @Override // defpackage.otj0
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // defpackage.otj0
    public final int getSize() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                return ((GifDrawable) drawable).getSize();
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.rwv
    public void initialize() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                ((GifDrawable) drawable).getFirstFrame().prepareToDraw();
                break;
            default:
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof GifDrawable) {
                        ((GifDrawable) drawable).getFirstFrame().prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }
}
