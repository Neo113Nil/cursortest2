package xsna;

import android.view.PixelCopy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class gkn0 implements PixelCopy.OnPixelCopyFinishedListener {
    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i == 0) {
            return;
        }
        s100.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i, null);
    }
}
