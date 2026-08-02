package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.rlottie.RLottieDrawable;

/* compiled from: PopupLayerView.kt */
/* loaded from: classes6.dex */
public final class mwb0 extends AppCompatImageView {
    public String b;
    public RLottieDrawable.a c;
    public int d;
    public int e;
    public boolean f;

    /* compiled from: PopupLayerView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mwb0(Context context) {
        super(context, null, 0);
    }

    private final RLottieDrawable getRLottieDrawable() {
        Drawable drawable = getDrawable();
        if (drawable instanceof RLottieDrawable) {
            return (RLottieDrawable) drawable;
        }
        return null;
    }

    private final void setAnimationListener(RLottieDrawable.a aVar) {
        this.c = aVar;
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.k.t = this.c;
        }
    }

    private final void setRLottieDrawable(RLottieDrawable rLottieDrawable) {
        setImageDrawable(rLottieDrawable);
    }

    public final void V(int i, int i2, String str) {
        RLottieDrawable rLottieDrawable;
        if (getRLottieDrawable() != null && i == this.d && i2 == this.e) {
            getRLottieDrawable();
            return;
        }
        this.d = i;
        this.e = i2;
        try {
            ImageView.ScaleType scaleType = getScaleType();
            if ((scaleType == null ? -1 : a.$EnumSwitchMapping$0[scaleType.ordinal()]) == 1) {
                int max = Integer.max(i, i2);
                rLottieDrawable = new RLottieDrawable(str, "popup_sticker-" + SystemClock.elapsedRealtimeNanos(), max, max, null, false, false, null, 496);
            } else {
                rLottieDrawable = new RLottieDrawable(str, "popup_sticker-" + SystemClock.elapsedRealtimeNanos(), i, i2, null, false, false, null, 496);
            }
            rLottieDrawable.k.q = 1;
            setImageDrawable(rLottieDrawable);
            RLottieDrawable rLottieDrawable2 = getRLottieDrawable();
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.k.t = this.c;
            }
            RLottieDrawable rLottieDrawable3 = getRLottieDrawable();
            if (rLottieDrawable3 != null) {
                if (this.f) {
                    rLottieDrawable3.n(0);
                    rLottieDrawable3.i();
                } else {
                    rLottieDrawable3.j();
                }
            }
            RLottieDrawable rLottieDrawable4 = getRLottieDrawable();
            if (rLottieDrawable4 != null) {
                rLottieDrawable4.setCallback(this);
            }
            RLottieDrawable rLottieDrawable5 = getRLottieDrawable();
            if (rLottieDrawable5 != null) {
                rLottieDrawable5.setBounds(0, 0, i, i2);
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
        getRLottieDrawable();
    }

    public final void W(String str, RLottieDrawable.a aVar) {
        String str2;
        this.b = str;
        if (this.d > 0 && getMeasuredHeight() > 0 && (str2 = this.b) != null) {
            V(getMeasuredWidth(), getMeasuredHeight(), str2);
        }
        if (aVar != null) {
            setAnimationListener(aVar);
        }
        invalidate();
        post(new m50(this, 5));
    }

    public final void clear() {
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.i();
        }
        RLottieDrawable rLottieDrawable2 = getRLottieDrawable();
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k();
        }
        setRLottieDrawable(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.f) {
                return;
            }
            rLottieDrawable.j();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clear();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0 || (str = this.b) == null) {
            return;
        }
        V(getMeasuredWidth(), getMeasuredHeight(), str);
    }

    public final void setStatic(boolean z) {
        RLottieDrawable rLottieDrawable;
        this.f = z;
        if (z) {
            Drawable drawable = getDrawable();
            rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
            if (rLottieDrawable != null) {
                rLottieDrawable.i();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        rLottieDrawable = drawable2 instanceof RLottieDrawable ? (RLottieDrawable) drawable2 : null;
        if (rLottieDrawable != null) {
            rLottieDrawable.j();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getDrawable() || super.verifyDrawable(drawable);
    }
}
