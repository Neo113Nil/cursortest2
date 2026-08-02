package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class dvy0 extends FrameLayout {
    public final TextureView b;
    public SurfaceView c;
    public int d;
    public int e;
    public a f;
    public int g;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void r();
    }

    public dvy0(Context context) {
        super(context);
        this.b = new TextureView(context);
        a();
    }

    public final void a() {
        View view = this.b;
        c1z0.n(view, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.g == 0) {
            addView(view, layoutParams);
            return;
        }
        if (this.c == null) {
            this.c = new SurfaceView(getContext());
        }
        addView(this.c, layoutParams);
    }

    public final void b(int i, int i2) {
        this.d = i;
        this.e = i2;
        requestLayout();
        invalidate();
    }

    @Nullable
    public Bitmap getScreenShot() {
        if (this.g == 1) {
            return null;
        }
        try {
            return this.b.getBitmap(getWidth(), getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @NonNull
    public TextureView getTextureView() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r0.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        Window window;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            if (!view.isHardwareAccelerated() || (view.getLayerType() & 1) != 0) {
                break;
            }
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                Context context = getContext();
                if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
                    return;
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.d;
        if (i4 <= 0 || (i3 = this.e) <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = i4 / i3;
        if (mode == 0 && mode2 == 0) {
            size = i4;
            size2 = i3;
        } else if (mode == 0) {
            size = (int) (size2 * f);
            i4 = size;
            i3 = size2;
        } else if (mode2 != 0 && b920.b(f, 1.0f) == -1 && size2 <= size) {
            i4 = size;
            i3 = size2;
            size = (int) (size2 * f);
        } else {
            i4 = size;
            i3 = size2;
            size2 = (int) (size / f);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        SurfaceView surfaceView = this.c;
        if (surfaceView != null) {
            surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(i4, i3);
    }

    public void setAdVideoViewListener(@Nullable a aVar) {
        this.f = aVar;
    }

    public void setExoPlayer(@Nullable ExoPlayer exoPlayer) {
        if (exoPlayer == null) {
            return;
        }
        int i = this.g;
        if (i == 0) {
            exoPlayer.setVideoSurfaceView(null);
            exoPlayer.setVideoTextureView(this.b);
        } else {
            if (i != 1) {
                return;
            }
            exoPlayer.setVideoTextureView(null);
            exoPlayer.setVideoSurfaceView(this.c);
        }
    }

    public void setViewMode(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        a();
    }
}
