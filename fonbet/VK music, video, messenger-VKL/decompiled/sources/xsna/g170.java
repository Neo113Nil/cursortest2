package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: NewsfeedTextHeater.kt */
/* loaded from: classes4.dex */
public final class g170 {
    public static final void a(Canvas canvas, float f, Paint paint, char c) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.drawText(String.valueOf(c), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, paint);
    }
}
