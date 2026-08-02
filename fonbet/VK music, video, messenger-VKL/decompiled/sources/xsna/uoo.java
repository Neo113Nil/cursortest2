package xsna;

import android.graphics.Bitmap;
import android.view.Choreographer;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;

/* compiled from: DynamicActivityBlur.kt */
/* loaded from: classes17.dex */
public final class uoo implements Choreographer.FrameCallback {
    public final /* synthetic */ soo b;

    public uoo(soo sooVar) {
        this.b = sooVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r1 != null) goto L28;
     */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doFrame(long j) {
        soo sooVar = this.b;
        Choreographer choreographer = sooVar.c;
        Window window = sooVar.a;
        if (sooVar.f) {
            View decorView = window.getDecorView();
            int width = (int) (decorView.getWidth() * 0.25f);
            int height = (int) (decorView.getHeight() * 0.25f);
            if (width <= 0 || height <= 0 || !decorView.isAttachedToWindow()) {
                choreographer.postFrameCallback(this);
                return;
            }
            Bitmap bitmap = sooVar.e;
            if (bitmap != null) {
                if (bitmap.getWidth() != width || bitmap.getHeight() != height) {
                    bitmap = null;
                }
            }
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            sooVar.e = bitmap;
            try {
                PixelCopy.request(window, bitmap, new too(sooVar, bitmap, this, 0), sooVar.d);
            } catch (Throwable unused) {
                choreographer.postFrameCallback(this);
            }
        }
    }
}
