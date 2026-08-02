package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Region;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import xsna.p4p;

/* compiled from: CollageRendererFrame.kt */
/* loaded from: classes4.dex */
public final class y1g implements h5p<w1g> {
    @Override // xsna.h5p
    public final Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        Bitmap bitmap;
        w1g w1gVar = (w1g) g5pVar;
        ld7 ld7Var = ota0Var instanceof ld7 ? (ld7) ota0Var : null;
        if (ld7Var == null || (bitmap = ld7Var.a) == null) {
            return ota0Var;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.clipPath(w1gVar.b.b(new Size(canvas.getWidth(), canvas.getHeight()), w1gVar.d, w1gVar.e), Region.Op.DIFFERENCE);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        Paint paint = new Paint();
        paint.setColor(w1gVar.f.b);
        s3q0 s3q0Var = s3q0.a;
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, paint);
        return new ld7(bitmap);
    }
}
