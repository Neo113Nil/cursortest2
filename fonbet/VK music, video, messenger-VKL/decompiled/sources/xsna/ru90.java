package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: PendingDrawingCanvasImpl.kt */
/* loaded from: classes4.dex */
public final class ru90 implements qu90 {
    public final pb7 b;
    public final pb7 c;
    public final ArrayList d = new ArrayList();
    public final Paint e;

    public ru90(pb7 pb7Var, pb7 pb7Var2) {
        this.b = pb7Var;
        this.c = pb7Var2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.e = paint;
    }

    @Override // xsna.mlo
    public final void b(izs<? super Canvas, s3q0> izsVar) {
        this.d.add(new Pair(izsVar, null));
    }

    @Override // xsna.mlo
    public final void clear() {
        pb7 pb7Var = this.b;
        pb7Var.b();
        Canvas canvas = pb7Var.b;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            s3q0 s3q0Var = s3q0.a;
        }
        pb7 pb7Var2 = this.c;
        pb7Var2.b();
        Canvas canvas2 = pb7Var2.b;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            s3q0 s3q0Var2 = s3q0.a;
        }
    }

    @Override // xsna.qu90
    public final void d(Canvas canvas) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        pb7 pb7Var = this.b;
        if (size == 1) {
            Pair pair = (Pair) j5g.Y(arrayList);
            izs<? super Canvas, s3q0> izsVar = (izs) pair.d();
            Paint paint = (Paint) pair.g();
            pb7Var.c(izsVar);
            pb7Var.b();
            Bitmap bitmap = pb7Var.a;
            if (bitmap != null) {
                if (paint != null) {
                    paint.setAntiAlias(true);
                }
                if (paint != null) {
                    paint.setFilterBitmap(true);
                }
                canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                s3q0 s3q0Var = s3q0.a;
            }
            arrayList.clear();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            izs<? super Canvas, s3q0> izsVar2 = (izs) pair2.d();
            Paint paint2 = (Paint) pair2.g();
            if (paint2 == null) {
                pb7Var.c(izsVar2);
            } else {
                pb7 pb7Var2 = this.c;
                pb7Var2.b();
                Canvas canvas2 = pb7Var2.b;
                if (canvas2 != null) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                pb7Var2.c(izsVar2);
                pb7Var2.b();
                Bitmap bitmap2 = pb7Var2.a;
                if (bitmap2 != null) {
                    paint2.setAntiAlias(true);
                    paint2.setFilterBitmap(true);
                    pb7Var.b();
                    Canvas canvas3 = pb7Var.b;
                    if (canvas3 != null) {
                        canvas3.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint2);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                    s3q0 s3q0Var4 = s3q0.a;
                }
            }
        }
        pb7Var.b();
        Bitmap bitmap3 = pb7Var.a;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e);
            s3q0 s3q0Var5 = s3q0.a;
        }
        arrayList.clear();
        clear();
    }
}
