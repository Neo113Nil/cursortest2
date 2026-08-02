package xsna;

import android.graphics.Rect;
import android.util.Size;
import android.view.SurfaceView;
import java.util.function.Consumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class d1u0 implements Consumer {
    public final /* synthetic */ SurfaceView a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Size size = (Size) obj;
        if (size == null || size.getWidth() == 0 || size.getHeight() == 0) {
            return;
        }
        SurfaceView surfaceView = this.a;
        Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
        if (size.equals(new Size(surfaceFrame.width(), surfaceFrame.height()))) {
            return;
        }
        surfaceView.getHolder().setFixedSize(size.getWidth(), size.getHeight());
    }
}
