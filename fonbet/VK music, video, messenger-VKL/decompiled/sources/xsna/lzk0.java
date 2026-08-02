package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import xsna.f5h0;

/* compiled from: StatusImageDismissIconDrawable.kt */
/* loaded from: classes5.dex */
public final class lzk0 extends LayerDrawable {
    public final Drawable b;
    public final ShapeDrawable c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lzk0(Drawable drawable) {
        super(new Drawable[]{r0, new a5h0(drawable, f5h0.g.a)});
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.b = drawable;
        this.c = shapeDrawable;
    }
}
