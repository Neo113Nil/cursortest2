package sg.bigo.ads.bv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import sg.bigo.ads.bv.c;
import sg.bigo.ads.common.utils.l;
import xsna.u11;
import xsna.wq;

/* loaded from: classes9.dex */
public final class b {
    public static final int a = -2123303016;

    public static class a {
        public long a() {
            return -1L;
        }

        public boolean a(int i) {
            return false;
        }

        public void b(int i) {
        }
    }

    /* renamed from: sg.bigo.ads.bv.b$b, reason: collision with other inner class name */
    public static class C2446b extends d<ColorDrawable> {
        private final int d;

        /* JADX WARN: Multi-variable type inference failed */
        private C2446b(View view, ColorDrawable colorDrawable, int i) {
            super(view, colorDrawable, i, 0 == true ? 1 : 0);
            if (colorDrawable != null) {
                colorDrawable.mutate();
            }
            T t = this.b;
            this.d = t != 0 ? ((ColorDrawable) t).getColor() : 0;
        }

        @Override // sg.bigo.ads.bv.b.d
        public final int a() {
            return this.d;
        }

        public /* synthetic */ C2446b(View view, ColorDrawable colorDrawable, int i, byte b) {
            this(view, colorDrawable, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.bv.b.d
        public final void a(int i) {
            T t;
            if (this.a == null || (t = this.b) == 0) {
                return;
            }
            ((ColorDrawable) t).setColor(i);
            ((ColorDrawable) this.b).invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.bv.b.d
        public final void a(boolean z) {
            T t;
            if (this.a == null || (t = this.b) == 0) {
                return;
            }
            ((ColorDrawable) t).setColor(z ? this.d : this.c);
            ((ColorDrawable) this.b).invalidateSelf();
        }
    }

    public static class c extends d<Paint> {
        private final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, Paint paint, int i) {
            super(view, paint, i, 0 == true ? 1 : 0);
            T t = this.b;
            this.d = t != 0 ? ((Paint) t).getColor() : 0;
        }

        @Override // sg.bigo.ads.bv.b.d
        public final int a() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.bv.b.d
        public final void a(int i) {
            T t;
            if (this.a == null || (t = this.b) == 0) {
                return;
            }
            ((Paint) t).setColor(i);
            this.a.getBackground().invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.bv.b.d
        public final void a(boolean z) {
            T t;
            if (this.a == null || (t = this.b) == 0) {
                return;
            }
            ((Paint) t).setColor(z ? this.d : this.c);
            this.a.getBackground().invalidateSelf();
        }
    }

    public static abstract class d<T> {
        protected final View a;
        protected final T b;
        protected final int c;

        private d(View view, T t, int i) {
            this.a = view;
            this.b = t;
            this.c = i;
        }

        public abstract int a();

        public int a(float f) {
            return b.a(f, a(), this.c);
        }

        public abstract void a(int i);

        public abstract void a(boolean z);

        public /* synthetic */ d(View view, Object obj, int i, byte b) {
            this(view, obj, i);
        }
    }

    public static class e extends d<Drawable> {
        private Drawable d;
        private final ColorDrawable e;
        private int f;

        public e(View view, int i) {
            super(view, null, i, (byte) 0);
            ColorDrawable colorDrawable = new ColorDrawable(i);
            this.e = colorDrawable;
            if (view != null) {
                Drawable background = view.getBackground();
                this.d = background;
                if (background != null) {
                    view.setBackground(new LayerDrawable(new Drawable[]{this.d, colorDrawable}));
                } else {
                    colorDrawable.setColor(0);
                    view.setBackground(colorDrawable);
                }
            }
        }

        @Override // sg.bigo.ads.bv.b.d
        public final int a() {
            return 0;
        }

        @Override // sg.bigo.ads.bv.b.d
        public final int a(float f) {
            this.f = Math.max((int) ((255.0f - (f * 255.0f)) + 0.5f), 255);
            return super.a(f);
        }

        @Override // sg.bigo.ads.bv.b.d
        public final void a(int i) {
            if (this.a != null) {
                ColorDrawable colorDrawable = this.e;
                if (colorDrawable != null) {
                    colorDrawable.setColor(i);
                    this.e.invalidateSelf();
                }
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.setAlpha(this.f);
                    this.d.invalidateSelf();
                }
            }
        }

        @Override // sg.bigo.ads.bv.b.d
        public final void a(boolean z) {
            View view = this.a;
            if (view != null) {
                view.setBackground(z ? this.d : this.e);
            }
        }
    }

    public static double a(int i) {
        double a2 = a((16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
        double a3 = a(255, 255, 255);
        return (Math.max(a2, a3) + 0.05000000074505806d) / (Math.min(a2, a3) + 0.05000000074505806d);
    }

    public static int b(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[2];
        if (f > 0.3f) {
            fArr[2] = u11.b(f, 1.0f, 0.6857143f, 0.93f);
        } else {
            fArr[2] = f * 1.5f;
        }
        return Color.HSVToColor(fArr);
    }

    private static double a(int i, int i2, int i3) {
        double[] dArr = new double[3];
        dArr[0] = i / 255.0f;
        dArr[1] = i2 / 255.0f;
        dArr[2] = i3 / 255.0f;
        for (int i4 = 0; i4 < 3; i4++) {
            double d2 = dArr[i4];
            dArr[i4] = d2 <= 0.0392800010740757d ? d2 / 12.920000076293945d : Math.pow((d2 + 0.054999999701976776d) / 1.0549999475479126d, 2.4000000953674316d);
        }
        return (dArr[2] * 0.0722000002861023d) + (dArr[1] * 0.7152000069618225d) + (dArr[0] * 0.2125999927520752d);
    }

    private static float a(float f, float f2) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return f > f2 ? f2 : f;
    }

    public static /* synthetic */ float a(ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            return 1.0f;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            return ((Float) animatedValue).floatValue();
        }
        return 1.0f;
    }

    public static int a(float f, int i, int i2) {
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((i2 & 255) / 255.0f, 2.2d);
        float b = u11.b(f3, f2, f, f2);
        float b2 = u11.b(pow4, pow, f, pow);
        float b3 = u11.b(pow5, pow2, f, pow2);
        float b4 = u11.b(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(b2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(b3, 0.45454545454545453d)) * 255.0f;
        return Math.round(((float) Math.pow(b4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(b * 255.0f) << 24) | (Math.round(pow8) << 8);
    }

    public static int a(int i, float f) {
        return a(i, (int) (f * 255.0f));
    }

    public static int a(int i, int i2) {
        return (i & 16777215) | ((Math.max(0, Math.min(255, i2)) & 255) << 24);
    }

    public static int a(Bitmap bitmap, int i) {
        Integer a2 = a(bitmap);
        return a2 != null ? a2.intValue() : i;
    }

    @Nullable
    public static ValueAnimator a(final View view, final int i, final a aVar) {
        if (view == null) {
            return null;
        }
        final d a2 = a(view, i);
        int i2 = a;
        Object tag = view.getTag(i2);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        long a3 = aVar.a();
        if (a3 != -1) {
            ofFloat.setDuration(a3);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.bv.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int a4 = d.this.a(b.a(valueAnimator));
                a aVar2 = aVar;
                if (aVar2 != null ? aVar2.a(a4) : false) {
                    return;
                }
                d.this.a(a4);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.bv.b.5
            private boolean e = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.e = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a aVar2 = a.this;
                if (aVar2 != null) {
                    aVar2.b(i);
                }
                a2.a(this.e);
                view.setTag(b.a, null);
            }
        });
        ofFloat.start();
        view.setTag(i2, ofFloat);
        return ofFloat;
    }

    @Nullable
    public static ValueAnimator a(final View view, final Drawable drawable, long j) {
        if (view == null) {
            return null;
        }
        int i = a;
        Object tag = view.getTag(i);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        final Drawable background = view.getBackground();
        if (background == null) {
            view.setBackground(drawable);
        } else {
            view.setBackground(new LayerDrawable(new Drawable[]{background, drawable}));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (j != -1) {
            ofFloat.setDuration(j);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.bv.b.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int max = Math.max((int) ((b.a(valueAnimator) * 255.0f) + 0.5f), 255);
                drawable.setAlpha(max);
                drawable.invalidateSelf();
                Drawable drawable2 = background;
                if (drawable2 != null) {
                    drawable2.setAlpha(255 - max);
                    background.invalidateSelf();
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.bv.b.7
            private boolean d = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.d = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                view.setBackground(this.d ? background : drawable);
                view.setTag(b.a, null);
            }
        });
        ofFloat.start();
        view.setTag(i, ofFloat);
        return ofFloat;
    }

    @Nullable
    public static Integer a(Bitmap bitmap) {
        c.a a2;
        Bitmap bitmap2;
        int max;
        int i;
        c.b[] bVarArr;
        if (bitmap == null) {
            return null;
        }
        try {
            a2 = sg.bigo.ads.bv.c.a(bitmap);
            bitmap2 = a2.a;
        } catch (Exception unused) {
        }
        if (bitmap2 == null) {
            throw new AssertionError();
        }
        double d2 = -1.0d;
        if (a2.d > 0) {
            int width = bitmap2.getWidth() * bitmap2.getHeight();
            int i2 = a2.d;
            if (width > i2) {
                d2 = Math.sqrt(i2 / width);
            }
        } else if (a2.e > 0 && (max = Math.max(bitmap2.getWidth(), bitmap2.getHeight())) > (i = a2.e)) {
            d2 = i / max;
        }
        if (d2 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            bitmap2 = sg.bigo.ads.common.utils.e.a(bitmap2, (int) Math.ceil(bitmap2.getWidth() * d2), (int) Math.ceil(bitmap2.getHeight() * d2));
        }
        Bitmap bitmap3 = bitmap2;
        int width2 = bitmap3.getWidth();
        int height = bitmap3.getHeight();
        int[] iArr = new int[width2 * height];
        bitmap3.getPixels(iArr, 0, width2, 0, 0, width2, height);
        int i3 = a2.c;
        if (a2.f.isEmpty()) {
            bVarArr = null;
        } else {
            List<c.b> list = a2.f;
            bVarArr = (c.b[]) list.toArray(new c.b[list.size()]);
        }
        sg.bigo.ads.bv.a aVar = new sg.bigo.ads.bv.a(iArr, i3, bVarArr);
        if (bitmap3 != a2.a) {
            bitmap3.recycle();
        }
        sg.bigo.ads.bv.c cVar = new sg.bigo.ads.bv.c(aVar.c, a2.b);
        cVar.a();
        c.C2447c c2447c = cVar.a;
        if (c2447c != null) {
            return Integer.valueOf(c2447c.a);
        }
        return null;
    }

    private static d a(@NonNull View view, int i) {
        Drawable findDrawableByLayerId;
        Drawable background = view.getBackground();
        if ((background instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(sg.bigo.ads.common.utils.e.a)) != null) {
            background = findDrawableByLayerId;
        }
        byte b = 0;
        int i2 = 0;
        while (i2 < 10 && background != null) {
            i2++;
            Object a2 = sg.bigo.ads.bl.a.a(background, "getDrawable", Drawable.class);
            if (!(a2 instanceof Drawable)) {
                break;
            }
            background = (Drawable) a2;
        }
        background = null;
        if (background instanceof ColorDrawable) {
            return new C2446b(view, (ColorDrawable) background, i, b);
        }
        if (!(background instanceof ShapeDrawable)) {
            return new e(view, i);
        }
        Paint paint = ((ShapeDrawable) background).getPaint();
        Paint.Style style = paint.getStyle();
        return (style == Paint.Style.FILL || style == Paint.Style.FILL_AND_STROKE) ? new c(view, paint, i) : new e(view, i);
    }

    public static void a(int i, int i2, int i3, @NonNull float[] fArr) {
        float a2;
        float abs;
        float f = i / 255.0f;
        float f2 = i2 / 255.0f;
        float f3 = i3 / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min = Math.min(f, Math.min(f2, f3));
        float f4 = max - min;
        float f5 = (max + min) / 2.0f;
        if (max == min) {
            a2 = 0.0f;
            abs = 0.0f;
        } else {
            a2 = max == f ? ((f2 - f3) / f4) % 6.0f : max == f2 ? wq.a(f3, f, f4, 2.0f) : wq.a(f, f2, f4, 4.0f);
            abs = f4 / (1.0f - Math.abs((2.0f * f5) - 1.0f));
        }
        float f6 = (a2 * 60.0f) % 360.0f;
        if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 += 360.0f;
        }
        fArr[0] = a(f6, 360.0f);
        fArr[1] = a(abs, 1.0f);
        fArr[2] = a(f5, 1.0f);
    }

    public static void a(final int i, final int i2, long j, final TextView... textViewArr) {
        if (l.a(textViewArr)) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (j >= 0) {
            ofFloat.setDuration(j);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.bv.b.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int a2 = b.a(b.a(valueAnimator), i, i2);
                for (TextView textView : textViewArr) {
                    textView.setTextColor(a2);
                }
            }
        });
        ofFloat.start();
    }

    public static void a(int i, @NonNull float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void a(View view) {
        a(view, -1, new a() { // from class: sg.bigo.ads.bv.b.3
            @Override // sg.bigo.ads.bv.b.a
            public final long a() {
                return 0L;
            }
        });
    }

    public static void a(Interpolator interpolator, final View view) {
        if (view == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.bv.b.2
            final /* synthetic */ int a = 0;
            final /* synthetic */ int b = -1291845632;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(b.a(b.a(valueAnimator), this.a, this.b));
            }
        });
        ofFloat.start();
    }
}
