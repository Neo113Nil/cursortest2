package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.camera.CameraObject$CameraMode;
import com.vkontakte.android.R;

/* compiled from: BaseCameraView.java */
/* loaded from: classes13.dex */
public abstract class q96 extends FrameLayout implements jxr {
    public final Handler b;
    public final FrameLayout c;
    public final View d;
    public final boolean e;
    public boolean f;
    public int g;
    public int h;
    public CameraObject$CameraMode i;
    public final a j;

    /* compiled from: BaseCameraView.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q96.this.d();
        }
    }

    /* compiled from: BaseCameraView.java */
    public class b extends ViewGroup {
        public b(View view) {
            super(q96.this.getContext());
            addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                int i7 = i3 - i;
                int i8 = i4 - i2;
                q96 q96Var = q96.this;
                if (q96Var.e()) {
                    int displayOrientation = q96Var.getDisplayOrientation();
                    if (displayOrientation == 90 || displayOrientation == 270) {
                        i5 = q96Var.getCameraPreviewHeight();
                        i6 = q96Var.getCameraPreviewWidth();
                    } else {
                        i5 = q96Var.getCameraPreviewWidth();
                        i6 = q96Var.getCameraPreviewHeight();
                    }
                } else {
                    i5 = i7;
                    i6 = i8;
                }
                int i9 = i7 * i6;
                int i10 = i8 * i5;
                boolean z2 = i9 >= i10;
                if (q96Var.f) {
                    q96Var.f(i5, i6);
                    childAt.layout(0, 0, i7, i8);
                    return;
                }
                if (((z2 && !q96Var.e) || (!z2 && q96Var.e)) && i6 != 0) {
                    int i11 = i10 / i6;
                    childAt.layout((i7 - i11) / 2, 0, (i7 + i11) / 2, i8);
                } else if (i5 != 0) {
                    childAt.layout(0, 0, i7, i9 / i5);
                }
            }
        }
    }

    /* compiled from: BaseCameraView.java */
    public interface c {
    }

    public q96(Context context) {
        super(context);
        this.b = new Handler(Looper.getMainLooper());
        this.e = true;
        this.f = false;
        this.j = new a();
        this.i = ij9.a.a() ? CameraObject$CameraMode.FRONT : CameraObject$CameraMode.BACK;
        View view = new View(getContext());
        this.d = view;
        view.setBackgroundResource(R.drawable.focus_circle);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        addView(frameLayout);
        addView(new p96(getContext()));
    }

    @NonNull
    public b c(View view) {
        this.c.removeAllViews();
        b bVar = new b(view);
        this.c.addView(bVar, new FrameLayout.LayoutParams(-1, -1));
        return bVar;
    }

    public final void d() {
        this.b.removeCallbacks(this.j);
        this.c.removeView(this.d);
    }

    public abstract boolean e();

    public abstract void f(int i, int i2);

    public final void g() {
        d();
        int i = jxr.r7;
        this.c.addView(this.d, new FrameLayout.LayoutParams(i, i));
        int i2 = i / 2;
        this.d.setTranslationX(bn10.c(this.g - i2, 0, getWidth() - i));
        this.d.setTranslationY(bn10.c(this.h - i2, 0, getHeight() - i));
        this.d.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(300L).start();
    }

    public abstract int getCameraPreviewHeight();

    public abstract int getCameraPreviewWidth();

    public abstract oo9 getCameraView();

    public abstract int getDisplayOrientation();
}
