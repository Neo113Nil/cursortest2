package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class khz0 extends RecyclerView.d {
    public final int a;
    public GradientDrawable b;
    public GradientDrawable c;
    public int w;

    public khz0(int i) {
        this.a = i;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{this.w, 0});
        this.b = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        gradientDrawable2.setColors(new int[]{this.w, 0});
        this.c = gradientDrawable2;
        this.w = Color.argb(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        boolean canScrollHorizontally = recyclerView.canScrollHorizontally(-1);
        int i = this.a;
        if (canScrollHorizontally) {
            this.b.setBounds(0, 0, i, recyclerView.getHeight());
            this.b.draw(canvas);
        }
        if (recyclerView.canScrollHorizontally(1)) {
            this.c.setBounds(recyclerView.getWidth() - i, 0, recyclerView.getWidth(), recyclerView.getHeight());
            this.c.draw(canvas);
        }
    }
}
