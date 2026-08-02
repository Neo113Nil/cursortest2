package sg.bigo.ads.cz;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public final class g extends TextureView {
    int a;
    int b;
    private int c;

    public g(Context context, int i, int i2, int i3) {
        super(context);
        this.a = i;
        this.b = i2;
        this.c = i3;
        setLayoutParams((i3 == 1 || i3 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r12 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r0 < (r12 * r3)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        r5 = (r12 * r3) / r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r0 >= (r12 * r3)) goto L35;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.a <= 0 || this.b <= 0) {
            sg.bigo.ads.bn.a.a(0, "VideoTextureView", "video width or height is invalidate");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0 || mode == 1073741824) {
            int i5 = this.c;
            if (i5 != 1 && i5 != 2 && i5 != 4) {
                setMeasuredDimension(size, (int) (((this.b * 1.0f) * size) / this.a));
                return;
            }
            double measuredWidth = getMeasuredWidth();
            double measuredHeight = getMeasuredHeight();
            sg.bigo.ads.common.utils.f.c(getContext());
            if (measuredWidth > ConnectivityTracker.DEFAULT_UPLINK_BITRATE || measuredHeight > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                if (measuredWidth > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    if (measuredHeight <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        measuredHeight = (this.b * measuredWidth) / this.a;
                    } else {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                i3 = this.a;
                                double d = i3 * measuredHeight;
                                i4 = this.b;
                            }
                        }
                        i3 = this.a;
                        double d2 = i3 * measuredHeight;
                        i4 = this.b;
                    }
                }
                measuredWidth = (this.a * measuredHeight) / this.b;
            } else {
                measuredWidth = this.a;
                measuredHeight = this.b;
            }
            setMeasuredDimension((int) measuredWidth, (int) measuredHeight);
        }
    }
}
