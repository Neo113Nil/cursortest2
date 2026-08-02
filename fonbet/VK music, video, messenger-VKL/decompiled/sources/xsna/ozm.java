package xsna;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* compiled from: DirectRegionDrawer.kt */
/* loaded from: classes5.dex */
public final class ozm {
    public static final Bitmap.Config e = Bitmap.Config.ARGB_8888;
    public final ac7 a;
    public Bitmap b;
    public final Paint c;
    public final Paint d;

    public ozm(ac7 ac7Var) {
        this.a = ac7Var;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setColor(0);
        this.c = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint2.setAntiAlias(true);
        this.d = paint2;
    }
}
