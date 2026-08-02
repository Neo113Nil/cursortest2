package com.vk.writebar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.iah0;
import xsna.xq4;

/* loaded from: classes7.dex */
public class WaveformView extends View {
    public static final DisplayMetrics t = Resources.getSystem().getDisplayMetrics();
    public static final int u = iah0.a(3);
    public static final int v;
    public static final float w;
    public static final a x;
    public final Paint b;
    public final Paint c;
    public final ObjectAnimator d;
    public final RectF e;
    public float f;
    public Bitmap g;
    public Canvas h;
    public int i;
    public float j;
    public b k;
    public byte[] l;
    public Integer m;
    public ViewParent n;
    public boolean o;
    public boolean p;
    public float q;
    public int r;
    public int s;

    public class a extends Property<WaveformView, Float> {
        @Override // android.util.Property
        public final Float get(WaveformView waveformView) {
            return Float.valueOf(waveformView.f);
        }

        @Override // android.util.Property
        public final void set(WaveformView waveformView, Float f) {
            waveformView.setIndProgress(f.floatValue());
        }
    }

    public static class b {
        public byte[] a;
    }

    public interface c {
    }

    public class d extends Exception {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    static {
        int a2 = iah0.a(2);
        v = a2;
        w = a2 / 2.0f;
        x = new a(Float.class, "indProgress");
    }

    public WaveformView(Context context) {
        this(context, null);
    }

    public static b a(int i, byte[] bArr) {
        byte[] bArr2;
        if (bArr == null) {
            return null;
        }
        Object obj = xq4.A;
        if (bArr.length != 0 && bArr.length != i) {
            if (bArr.length < i) {
                float length = bArr.length / i;
                bArr2 = new byte[i];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = bArr[(int) (i2 * length)];
                }
            } else {
                float length2 = bArr.length / i;
                bArr2 = new byte[i];
                int i3 = 0;
                float f = 0.0f;
                float f2 = 0.0f;
                for (byte b2 : bArr) {
                    float min = Math.min(f2 + 1.0f, length2) - f2;
                    float f3 = b2;
                    float f4 = (f3 * min) + f;
                    f2 += min;
                    if (f2 >= length2 - 0.001f) {
                        int i4 = i3 + 1;
                        bArr2[i3] = (byte) Math.round(f4 / length2);
                        if (min < 1.0f) {
                            float f5 = 1.0f - min;
                            i3 = i4;
                            f = f3 * f5;
                            f2 = f5;
                        } else {
                            f2 = 0.0f;
                            i3 = i4;
                            f = 0.0f;
                        }
                    } else {
                        f = f4;
                    }
                }
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i3 < i) {
                    bArr2[i3] = (byte) Math.round(f / length2);
                }
            }
            bArr = bArr2;
        }
        byte b3 = Byte.MIN_VALUE;
        for (byte b4 : bArr) {
            if (b4 > b3) {
                b3 = b4;
            }
        }
        b bVar = new b();
        bVar.a = bArr;
        return bVar;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            this.b.setColor(obtainStyledAttributes.getColor(0, -16777216));
            this.c.setColor(obtainStyledAttributes.getColor(1, -16777216));
            obtainStyledAttributes.recycle();
        }
        ObjectAnimator objectAnimator = this.d;
        objectAnimator.setDuration(2500L);
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                parent = null;
                break;
            } else if (parent instanceof RecyclerView) {
                break;
            } else {
                parent = parent.getParent();
            }
        }
        this.n = parent;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.d.cancel();
        this.f = -1.0f;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r1 <= (r7 + 0.2f)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if ((r6 + r8) >= r10.m.intValue()) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.j <= 0.1f || this.k == null || (canvas2 = this.h) == null) {
            return;
        }
        int i = 0;
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        float length = this.k.a.length;
        while (true) {
            float f = i;
            Paint paint = this.b;
            if (f >= length) {
                canvas.drawBitmap(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                return;
            }
            byte b2 = this.k.a[i];
            int i2 = u * i;
            int i3 = (int) ((b2 / 31.0f) * this.i);
            float f2 = this.f;
            int i4 = v;
            Paint paint2 = this.c;
            if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f3 = f / length;
                if (f3 >= f2) {
                }
                paint = paint2;
            } else {
                Integer num = this.m;
                if (num != null) {
                    if (i2 < num.intValue()) {
                    }
                    paint = paint2;
                }
            }
            float f4 = i4 + i2;
            float f5 = i3;
            float f6 = w;
            RectF rectF = this.e;
            if (f5 < f6) {
                float f7 = this.i;
                rectF.set(i2, f7 - f6, f4, f7 + f6);
                this.h.drawRoundRect(rectF, f6, f6, paint);
            } else {
                int i5 = this.i;
                float min = Math.min(i5, i5 - i3);
                int i6 = this.i;
                rectF.set(i2, min, f4, Math.max(i6, i3 + i6));
                this.h.drawRoundRect(rectF, f6, f6, paint);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            this.h = null;
            return;
        }
        try {
            DisplayMetrics displayMetrics = t;
            this.s = Math.min(i, displayMetrics.widthPixels);
            this.r = Math.min(i2, displayMetrics.heightPixels);
            this.i = ((getPaddingTop() + i2) - getPaddingBottom()) / 2;
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.g = Bitmap.createBitmap(this.s, this.r, Bitmap.Config.ARGB_8888);
            this.h = new Canvas(this.g);
            if (!isInEditMode()) {
                this.j = i / u;
            }
            this.k = a((int) this.j, this.l);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(new d(e.getMessage() + " size is " + i + StringUtils.PROCESS_POSTFIX_DELIMITER + i2, e));
            this.h = null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x2 && x2 <= this.s && y >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y <= this.r) {
                this.q = x2;
                this.p = true;
                this.o = false;
                return true;
            }
        } else if (action == 1 || action == 3) {
            if (this.p) {
                this.p = false;
                invalidate();
                return true;
            }
        } else if (action == 2 && this.p) {
            if (this.o) {
                int i = (int) x2;
                Integer valueOf = Integer.valueOf(i);
                this.m = valueOf;
                if (i < 0) {
                    this.m = 0;
                } else {
                    int intValue = valueOf.intValue();
                    int i2 = this.s;
                    if (intValue > i2) {
                        this.m = Integer.valueOf(i2);
                    }
                }
                invalidate();
            }
            float f = this.q;
            if (f != -1.0f && Math.abs(x2 - f) > 0.07874016f * t.xdpi) {
                ViewParent viewParent = this.n;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(true);
                }
                this.o = true;
                this.q = -1.0f;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIndProgress(float f) {
        this.f = f;
        invalidate();
    }

    public void setProgress(Float f) {
        if (this.p) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (f == null) {
            this.m = null;
            if (objectAnimator.isStarted()) {
                objectAnimator.cancel();
                this.f = -1.0f;
            }
            invalidate();
            return;
        }
        if (f.floatValue() == -1.0f) {
            objectAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            objectAnimator.setStartDelay(500L);
            objectAnimator.start();
            return;
        }
        int ceil = (int) Math.ceil(f.floatValue() * getWidth());
        Integer valueOf = Integer.valueOf(ceil);
        this.m = valueOf;
        if (ceil < 0) {
            this.m = 0;
        } else if (valueOf.intValue() > getWidth()) {
            this.m = Integer.valueOf(getWidth());
        }
        if (objectAnimator.isStarted()) {
            objectAnimator.cancel();
            this.f = -1.0f;
        }
        invalidate();
    }

    public void setWaveform(byte[] bArr) {
        if (this.l == null && bArr == null) {
            return;
        }
        this.l = bArr;
        this.k = a((int) this.j, bArr);
        invalidate();
        setProgress(null);
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaveformView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = ObjectAnimator.ofFloat(this, x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e = new RectF();
        this.f = -1.0f;
        b(context, attributeSet);
    }

    public WaveformView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = ObjectAnimator.ofFloat(this, x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e = new RectF();
        this.f = -1.0f;
        b(context, attributeSet);
    }

    public void setSeekBarDelegate(c cVar) {
    }
}
