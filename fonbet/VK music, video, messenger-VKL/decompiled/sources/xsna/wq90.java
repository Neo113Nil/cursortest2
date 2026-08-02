package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PathShadowView.kt */
/* loaded from: classes3.dex */
public final class wq90 extends View {
    public static final String[] d = {"path_1", "path_2"};
    public Path b;
    public final Paint c;

    public wq90(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setAlpha(38);
        setLayerType(1, paint);
        paint.setShadowLayer(iah0.b(1.5f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.5f, 1107296256);
        this.c = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.b;
        if (path != null) {
            canvas.drawPath(path, this.c);
        }
    }
}
