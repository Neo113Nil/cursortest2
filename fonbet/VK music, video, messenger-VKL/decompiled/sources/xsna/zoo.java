package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: DynamicColorDrawable.kt */
/* loaded from: classes17.dex */
public final class zoo extends ColorDrawable {
    public final apo a;

    public zoo(int i) {
        this.a = new apo(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        setColor(this.a.a());
        super.draw(canvas);
    }
}
