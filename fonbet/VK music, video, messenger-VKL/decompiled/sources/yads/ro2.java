package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes10.dex */
public final class ro2 implements Runnable {
    public final vo2 b;
    public final Bitmap c;

    public ro2(vo2 vo2Var, Bitmap bitmap) {
        this.b = vo2Var;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.setBackground(new BitmapDrawable(this.b.getResources(), this.c));
        this.b.setVisibility(0);
    }
}
