package xsna;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import xsna.ym2;

/* compiled from: AnimationBackendDelegate.kt */
/* loaded from: classes12.dex */
public class zm2<T extends ym2> implements ym2 {
    public BitmapAnimationBackend b;

    @Override // xsna.ym2
    public final void clear() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend != null) {
            bitmapAnimationBackend.clear();
        }
    }

    @Override // xsna.rp2
    public final int getFrameCount() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return 0;
        }
        return bitmapAnimationBackend.getFrameCount();
    }

    @Override // xsna.rp2
    public final int getFrameDurationMs(int i) {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return 0;
        }
        return bitmapAnimationBackend.getFrameDurationMs(i);
    }

    @Override // xsna.ym2
    public final int getIntrinsicHeight() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return -1;
        }
        return bitmapAnimationBackend.getIntrinsicHeight();
    }

    @Override // xsna.ym2
    public final int getIntrinsicWidth() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return -1;
        }
        return bitmapAnimationBackend.getIntrinsicWidth();
    }

    @Override // xsna.rp2
    public final int getLoopCount() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return 0;
        }
        return bitmapAnimationBackend.getLoopCount();
    }

    @Override // xsna.rp2
    public final int getLoopDurationMs() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return 0;
        }
        return bitmapAnimationBackend.getLoopDurationMs();
    }

    @Override // xsna.rp2
    public final int height() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return 0;
        }
        return bitmapAnimationBackend.height();
    }

    @Override // xsna.ym2
    public final void setAlpha(int i) {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend != null) {
            bitmapAnimationBackend.setAlpha(i);
        }
    }

    @Override // xsna.ym2
    public final void setAnimationListener(ym2.a aVar) {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend != null) {
            bitmapAnimationBackend.setAnimationListener(aVar);
        }
    }

    @Override // xsna.ym2
    public final void setBounds(Rect rect) {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend != null) {
            bitmapAnimationBackend.setBounds(rect);
        }
    }

    @Override // xsna.ym2
    public final void setColorFilter(ColorFilter colorFilter) {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend != null) {
            bitmapAnimationBackend.setColorFilter(colorFilter);
        }
    }

    @Override // xsna.rp2
    public final int width() {
        BitmapAnimationBackend bitmapAnimationBackend = this.b;
        if (bitmapAnimationBackend == null) {
            return 0;
        }
        return bitmapAnimationBackend.width();
    }
}
