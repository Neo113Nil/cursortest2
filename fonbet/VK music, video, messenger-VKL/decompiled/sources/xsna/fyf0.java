package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.vk.rlottie.RLottieDrawable;
import java.util.ArrayList;

/* compiled from: RenderDelegate.kt */
/* loaded from: classes5.dex */
public abstract class fyf0 {
    public final ez3 a;
    public final RLottieDrawable b;

    public fyf0(ez3 ez3Var, RLottieDrawable rLottieDrawable) {
        this.a = ez3Var;
        this.b = rLottieDrawable;
    }

    public abstract void a(Canvas canvas, float f, float f2);

    public final void b(Canvas canvas, Bitmap bitmap, float f, float f2) {
        ez3 ez3Var = this.a;
        ArrayList<gzs> arrayList = ez3Var.w;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, f, f2, ez3Var.o);
        izs<? super Canvas, s3q0> izsVar = ez3Var.g;
        if (izsVar != null) {
            izsVar.invoke(canvas);
        }
        if (!ez3Var.y) {
            ez3Var.y = true;
            RLottieDrawable.a aVar = ez3Var.t;
            if (aVar != null) {
                aVar.a();
            }
        }
        gzs<s3q0> gzsVar = ez3Var.v;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        ez3Var.v = null;
        for (gzs gzsVar2 : arrayList) {
            if (gzsVar2 != null) {
                gzsVar2.invoke();
            }
        }
        arrayList.clear();
    }

    public abstract void c();

    public abstract void d(int i);
}
