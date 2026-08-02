package xsna;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.View;
import xsna.soo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class too implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ too(Object obj, Bitmap bitmap, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = bitmap;
        this.d = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.a) {
            case 0:
                soo sooVar = (soo) this.c;
                uoo uooVar = (uoo) this.d;
                if (sooVar.f) {
                    if (i == 0) {
                        soo.a aVar = sooVar.b;
                        aVar.c = this.b;
                        aVar.invalidateSelf();
                    }
                    sooVar.c.postFrameCallback(uooVar);
                    break;
                }
                break;
            default:
                pf40 pf40Var = (pf40) this.c;
                View view = (View) this.d;
                if (i != 0) {
                    pf40Var.invoke(kd7.i(view, null));
                    break;
                } else {
                    pf40Var.invoke(this.b);
                    break;
                }
        }
    }
}
