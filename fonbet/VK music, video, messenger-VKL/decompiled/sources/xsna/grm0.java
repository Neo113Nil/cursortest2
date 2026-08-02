package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Applier.kt */
/* loaded from: classes18.dex */
public final class grm0 extends ed3 {
    public final Paint a;

    public grm0(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(4.0f);
        this.a = paint;
        new rek0(l5g.c(14, f870.c(i), 0.4f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ed3
    public final void a(b5x b5xVar, Canvas canvas) {
        float width = ((View) b5xVar).getWidth();
        Paint paint = this.a;
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        canvas.drawLine(r13.getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r13.getWidth(), r13.getHeight(), paint);
        canvas.drawLine(r13.getWidth(), r13.getHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r13.getHeight(), paint);
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r13.getHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
    }
}
