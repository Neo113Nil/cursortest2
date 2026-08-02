package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.WeakHashMap;

/* compiled from: PaddingDrawable.java */
/* loaded from: classes7.dex */
public final class i890 extends LayerDrawable {
    public Rect b;
    public int c;
    public Drawable d;
    public boolean e;

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        Rect rect = this.b;
        if (this.e) {
            rect.set(getBounds());
            int i = rect.right;
            WeakHashMap weakHashMap = j6r0.a;
            rect.right = i - iah0.a(14.0f);
            rect.left = iah0.a(14.0f) + rect.left;
            rect.right = (int) (rect.right - ((getLevel() / 10000.0f) * this.c));
            drawable.setBounds(rect);
            this.e = false;
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        this.e = true;
        invalidateSelf();
        return true;
    }
}
