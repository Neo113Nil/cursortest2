package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes11.dex */
public final class hyt0 {
    public static Bitmap a(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public static final bli0 b(View view) {
        return new bli0(new dyt0(view, null));
    }
}
