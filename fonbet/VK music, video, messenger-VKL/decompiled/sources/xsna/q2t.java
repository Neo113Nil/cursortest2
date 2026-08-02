package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes12.dex */
public final class q2t implements Runnable {
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ r2t c;

    public q2t(r2t r2tVar, Bitmap bitmap) {
        this.c = r2tVar;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = this.b;
        Bitmap bitmap2 = null;
        if (bitmap.getWidth() % 2 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + 1, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(bitmap.getDensity());
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
            bitmap2 = createBitmap;
        }
        Bitmap bitmap3 = bitmap2 != null ? bitmap2 : bitmap;
        r2t r2tVar = this.c;
        r2tVar.d = nap.g(r2tVar.d, bitmap3);
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        r2tVar.i = bitmap.getWidth();
        r2tVar.j = bitmap.getHeight();
        r2tVar.k();
    }
}
