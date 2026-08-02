package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.c;
import androidx.camera.view.e;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class eye0 {
    public Size a;
    public final FrameLayout b;
    public final c c;
    public boolean d = false;

    public eye0(FrameLayout frameLayout, c cVar) {
        this.b = frameLayout;
        this.c = cVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(znw0 znw0Var, e eVar);

    public final void f() {
        View a = a();
        if (a == null || !this.d) {
            return;
        }
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        c cVar = this.c;
        cVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            sgb1.g(5, "PreviewTransform");
            return;
        }
        if (cVar.f()) {
            if (a instanceof TextureView) {
                ((TextureView) a).setTransform(cVar.d());
            } else {
                Display display = a.getDisplay();
                boolean z = false;
                boolean z2 = (!cVar.g || display == null || display.getRotation() == cVar.e) ? false : true;
                boolean z3 = cVar.g;
                if (!z3) {
                    if ((!z3 ? cVar.c : -xdb1.g(cVar.e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    sgb1.d("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF e = cVar.e(layoutDirection, size);
            a.setPivotX(0.0f);
            a.setPivotY(0.0f);
            a.setScaleX(e.width() / cVar.a.getWidth());
            a.setScaleY(e.height() / cVar.a.getHeight());
            a.setTranslationX(e.left - a.getLeft());
            a.setTranslationY(e.top - a.getTop());
        }
    }

    public abstract void g(Executor executor);

    public abstract euy h();
}
