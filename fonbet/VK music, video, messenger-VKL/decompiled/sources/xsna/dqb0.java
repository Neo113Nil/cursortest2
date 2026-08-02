package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.polls.GradientPoint;
import com.vk.dto.polls.PollGradient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: PollBackgroundDrawables.kt */
/* loaded from: classes18.dex */
public class dqb0 extends Drawable {
    public static final /* synthetic */ int f = 0;
    public final PollGradient a;
    public final int b;
    public final Paint c = x9.c(true);
    public final RectF d = new RectF();
    public final bpn0 e = new bpn0(new s1x(this, 24));

    /* compiled from: PollBackgroundDrawables.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static LinearGradient a(Rect rect, PollGradient pollGradient) {
            double d;
            float f;
            float width = rect.width();
            float height = rect.height();
            float f2 = pollGradient.d;
            List<GradientPoint> list = pollGradient.e;
            int[] iArr = new int[list.size()];
            float[] fArr = new float[list.size()];
            ytw W0 = j5g.W0(list);
            ArrayList arrayList = new ArrayList(c5g.u(W0, 10));
            Iterator it = W0.iterator();
            while (true) {
                ztw ztwVar = (ztw) it;
                if (!ztwVar.b.hasNext()) {
                    break;
                }
                xtw xtwVar = (xtw) ztwVar.next();
                int i = xtwVar.a;
                GradientPoint gradientPoint = (GradientPoint) xtwVar.b;
                iArr[i] = gradientPoint.b;
                fArr[i] = (float) gradientPoint.c;
                arrayList.add(s3q0.a);
            }
            double d2 = f2;
            if (90.0d <= d2 && d2 <= 180.0d) {
                f2 = 180.0f - f2;
            }
            float tan = (float) (Math.tan(Math.toRadians(f2)) * (width / 2.0f));
            if (ConnectivityTracker.DEFAULT_UPLINK_BITRATE > d2 || d2 > 90.0d) {
                d = 90.0d;
                f = 0.0f;
            } else {
                d = 90.0d;
                f = width;
            }
            float f3 = height / 2.0f;
            return new LinearGradient(f, f3 - tan, (ConnectivityTracker.DEFAULT_UPLINK_BITRATE > d2 || d2 > d) ? width : 0.0f, f3 + tan, iArr, fArr, Shader.TileMode.MIRROR);
        }
    }

    public dqb0(PollGradient pollGradient, int i) {
        this.a = pollGradient;
        this.b = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float width = getBounds().width();
        float height = getBounds().height();
        Shader shader = (Shader) this.e.getValue();
        Paint paint = this.c;
        paint.setShader(shader);
        RectF rectF = this.d;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        float f2 = this.b;
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
