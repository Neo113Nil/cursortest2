package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PreviewViewImplementation.java */
/* loaded from: classes11.dex */
public abstract class z5d0 {

    @Nullable
    public Size a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final androidx.camera.view.c c;

    public z5d0(@NonNull FrameLayout frameLayout, @NonNull androidx.camera.view.c cVar) {
        this.b = frameLayout;
        this.c = cVar;
    }

    @Nullable
    public abstract View a();

    @Nullable
    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(@NonNull zjn0 zjn0Var, @Nullable w5d0 w5d0Var);

    public final void f() {
        View a = a();
        if (a == null) {
            return;
        }
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        androidx.camera.view.c cVar = this.c;
        if (cVar.f()) {
            if (a instanceof TextureView) {
                ((TextureView) a).setTransform(cVar.d());
            } else {
                Display display = a.getDisplay();
                if (display != null && display.getRotation() != cVar.d) {
                    s100.a("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.", null);
                }
            }
            RectF e = cVar.e(layoutDirection, size);
            a.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a.setScaleX(e.width() / cVar.a.getWidth());
            a.setScaleY(e.height() / cVar.a.getHeight());
            a.setTranslationX(e.left - a.getLeft());
            a.setTranslationY(e.top - a.getTop());
        }
    }

    @NonNull
    public abstract ugz<Void> g();
}
