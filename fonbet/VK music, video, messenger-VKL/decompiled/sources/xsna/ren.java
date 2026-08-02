package xsna;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: DisplayItemsRippleEffectDecoration.kt */
/* loaded from: classes4.dex */
public final class ren extends RecyclerView.n implements too0, UsableRecyclerView.k {
    public static final int[] i = new int[0];
    public static final int[] j = {R.attr.state_pressed, R.attr.state_enabled, R.attr.state_focused};
    public final RecyclerView b;
    public final elg0 c;
    public final Rect d = new Rect();
    public Drawable e;
    public float f;
    public float g;
    public View h;

    public ren(RecyclerView recyclerView, elg0 elg0Var) {
        this.b = recyclerView;
        this.c = elg0Var;
        Drawable a = dhr0.t.a(com.vkontakte.android.R.drawable.highlight);
        this.e = a;
        this.f = Float.NaN;
        this.g = Float.NaN;
        if (a != null) {
            a.setCallback(recyclerView);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        Drawable a = dhr0.t.a(com.vkontakte.android.R.drawable.highlight);
        this.e = a;
        if (a != null) {
            a.setCallback(this.b);
        }
    }

    @Override // me.grishka.appkit.views.UsableRecyclerView.k
    public final boolean c(Drawable drawable) {
        return epx.f(drawable, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.h != null) {
            elg0 elg0Var = this.c;
            View view = elg0Var.b;
            Rect rect = this.d;
            if (view != null) {
                elg0Var.a(rect, view);
            }
            int i2 = rect.top;
            if (i2 < 0) {
                i2 = 0;
            }
            int height = recyclerView.getHeight();
            if (i2 > height) {
                i2 = height;
            }
            rect.top = i2;
            int i3 = rect.bottom;
            int i4 = i3 >= 0 ? i3 : 0;
            int height2 = recyclerView.getHeight();
            if (i4 > height2) {
                i4 = height2;
            }
            rect.bottom = i4;
            if (rect.isEmpty()) {
                return;
            }
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            Drawable drawable2 = this.e;
            if (drawable2 != null) {
                drawable2.setHotspot(this.f, this.g);
            }
            Drawable drawable3 = this.e;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
    }
}
