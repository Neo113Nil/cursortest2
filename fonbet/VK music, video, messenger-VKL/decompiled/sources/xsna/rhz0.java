package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class rhz0 extends lyy0 {
    public a d;
    public boolean e;
    public boolean f;
    public int g;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends GestureDetector {
        public final rhz0 a;
        public kxa0 b;

        public b(Context context, rhz0 rhz0Var) {
            super(context, new GestureDetector.SimpleOnGestureListener());
            this.a = rhz0Var;
            setIsLongpressEnabled(false);
        }
    }

    public final void d(boolean z) {
        gu8.c(null, "MraidWebView: Pause, finishing " + z);
        WebView webView = this.b;
        if (z) {
            if (webView != null) {
                try {
                    webView.stopLoading();
                } catch (Throwable th) {
                    lyy0.c(th);
                }
            }
            b("");
        }
        if (webView == null) {
            return;
        }
        try {
            webView.onPause();
        } catch (Throwable th2) {
            lyy0.c(th2);
        }
    }

    @Override // xsna.lyy0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        w4z0 w4z0Var;
        int i3 = ((float) View.MeasureSpec.getSize(i)) / ((float) View.MeasureSpec.getSize(i2)) > 1.0f ? 2 : 1;
        if (i3 != this.g) {
            this.g = i3;
            a aVar = this.d;
            if (aVar != null && (w4z0Var = qbz0.this.c) != null) {
                w4z0Var.j();
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        w4z0 w4z0Var;
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (z != this.e) {
            this.e = z;
            a aVar = this.d;
            if (aVar == null || (w4z0Var = qbz0.this.c) == null) {
                return;
            }
            w4z0Var.f.f(z);
        }
    }

    public void setClicked(boolean z) {
        this.f = z;
    }

    public void setVisibilityChangedListener(@Nullable a aVar) {
        this.d = aVar;
    }
}
