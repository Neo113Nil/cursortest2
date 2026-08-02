package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Applier.kt */
/* loaded from: classes18.dex */
public final class c6g extends ed3 {
    public final Paint a;

    public c6g(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        this.a = paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ed3
    public final void a(b5x b5xVar, Canvas canvas) {
        View view = (View) b5xVar;
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight(), this.a);
    }
}
