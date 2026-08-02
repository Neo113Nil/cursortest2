package defpackage;

import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* loaded from: classes6.dex */
public final /* synthetic */ class e3c0 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e3c0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((tj) obj).invoke(Integer.valueOf(i));
                break;
            default:
                Semaphore semaphore = (Semaphore) obj;
                if (i == 0) {
                    sgb1.g(3, "SurfaceViewImpl");
                } else {
                    sgb1.d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore.release();
                break;
        }
    }
}
