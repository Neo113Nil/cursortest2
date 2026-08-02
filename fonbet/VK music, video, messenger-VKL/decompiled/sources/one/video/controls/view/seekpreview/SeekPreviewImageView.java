package one.video.controls.view.seekpreview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.eog0;
import xsna.epx;
import xsna.gq9;
import xsna.gs2;
import xsna.ih7;
import xsna.il80;
import xsna.j5g;
import xsna.owo0;
import xsna.s3i0;
import xsna.wzt0;
import xsna.x5r0;
import xsna.zjw;

/* compiled from: SeekPreviewImageView.kt */
/* loaded from: classes8.dex */
public final class SeekPreviewImageView extends AppCompatImageView {
    public static final float o = ((Number) x5r0.a.getValue()).floatValue();
    public zjw b;
    public boolean c;
    public long d;
    public long e;
    public owo0 f;
    public final gs2 g;
    public wzt0 h;
    public final Paint i;
    public final Matrix j;
    public int k;
    public int l;
    public gq9 m;
    public Object n;

    public SeekPreviewImageView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void U() {
        wzt0 wzt0Var = this.h;
        if (wzt0Var != null) {
            wzt0Var.a();
        }
        this.h = null;
    }

    public final void V() {
        owo0 owo0Var = this.f;
        if (owo0Var != null) {
            int i = owo0Var.e;
            Integer valueOf = Integer.valueOf(i);
            if (i <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                long j = this.d;
                Long valueOf2 = Long.valueOf(j);
                if (j <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    long longValue = valueOf2.longValue();
                    long j2 = this.e;
                    Long valueOf3 = Long.valueOf(j2);
                    if (j2 < 0) {
                        valueOf3 = null;
                    }
                    if (valueOf3 != null) {
                        int min = Math.min((int) ((valueOf3.longValue() * intValue) / longValue), intValue - 1);
                        boolean z = min != this.l;
                        this.l = min;
                        int i2 = min / owo0Var.g;
                        if (this.k == i2) {
                            if (z) {
                                W();
                                return;
                            }
                            return;
                        }
                        this.k = i2;
                        String str = (String) j5g.b0(i2, owo0Var.f);
                        gq9 gq9Var = this.m;
                        if (gq9Var != null) {
                            gq9Var.cancel();
                        }
                        this.m = null;
                        this.n = null;
                        if (str == null) {
                            U();
                            setImageBitmap(null);
                            return;
                        }
                        wzt0 wzt0Var = this.h;
                        if (wzt0Var != null) {
                            wzt0Var.a();
                        }
                        wzt0 wzt0Var2 = new wzt0(this, this.g, 200L, false);
                        this.h = wzt0Var2.e ? wzt0Var2 : null;
                        Object obj = new Object();
                        this.n = obj;
                        il80 a = getImageLoader().a(Uri.parse(str), new s3i0(this, obj), new ih7[0]);
                        if (this.n == obj) {
                            this.m = a;
                        }
                    }
                }
            }
        }
    }

    public final void W() {
        Drawable drawable = getDrawable();
        Matrix matrix = this.j;
        if (drawable == null) {
            matrix.reset();
            setImageMatrix(matrix);
            return;
        }
        Integer valueOf = Integer.valueOf(getWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            float intValue = valueOf.intValue();
            Integer valueOf2 = Integer.valueOf(getHeight());
            if (valueOf2.intValue() <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                float intValue2 = valueOf2.intValue();
                Integer valueOf3 = Integer.valueOf(drawable.getIntrinsicWidth());
                if (valueOf3.intValue() <= 0) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    float intValue3 = valueOf3.intValue();
                    Integer valueOf4 = Integer.valueOf(drawable.getIntrinsicHeight());
                    if (valueOf4.intValue() <= 0) {
                        valueOf4 = null;
                    }
                    if (valueOf4 != null) {
                        float intValue4 = valueOf4.intValue();
                        owo0 owo0Var = this.f;
                        if (owo0Var == null) {
                            return;
                        }
                        int i = owo0Var.d;
                        int i2 = owo0Var.c;
                        Integer valueOf5 = Integer.valueOf(this.l);
                        Integer num = valueOf5.intValue() != -1 ? valueOf5 : null;
                        if (num != null) {
                            int intValue5 = (num.intValue() % owo0Var.g) % i2;
                            matrix.reset();
                            float f = (intValue / intValue3) * i2;
                            float f2 = (owo0Var.i / (intValue3 / intValue4)) * (intValue2 / intValue4) * i;
                            matrix.setScale(f, f2);
                            matrix.postTranslate((-((intValue3 / i2) * f)) * intValue5, (-((intValue4 / i) * f2)) * ((r4 - intValue5) / i2));
                            setImageMatrix(matrix);
                        }
                    }
                }
            }
        }
    }

    public final long getDuration() {
        return this.d;
    }

    public final zjw getImageLoader() {
        zjw zjwVar = this.b;
        if (zjwVar != null) {
            return zjwVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final long getPosition() {
        return this.e;
    }

    public final boolean getShowBorder() {
        return this.c;
    }

    public final owo0 getTimelineImages() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        gq9 gq9Var = this.m;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        this.m = null;
        this.n = null;
        U();
        setImageBitmap(null);
        this.k = -1;
        this.l = -1;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            float width = getWidth();
            float height = getHeight();
            float f = o;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, this.i);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        W();
    }

    public final void setDuration(long j) {
        if (this.d != j) {
            this.d = j;
            V();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        W();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        W();
    }

    public final void setImageLoader(zjw zjwVar) {
        this.b = zjwVar;
    }

    public final void setPosition(long j) {
        if (this.e != j) {
            this.e = j;
            V();
        }
    }

    public final void setShowBorder(boolean z) {
        if (this.c != z) {
            this.c = z;
            invalidate();
        }
    }

    public final void setTimelineImages(owo0 owo0Var) {
        int i;
        if (epx.f(owo0Var, this.f)) {
            return;
        }
        if (owo0Var == null || (i = owo0Var.g) <= 0 || owo0Var.c <= 0 || owo0Var.d <= 0 || i * owo0Var.h < owo0Var.e) {
            owo0Var = null;
        }
        this.f = owo0Var;
        this.k = -1;
        this.l = -1;
        gq9 gq9Var = this.m;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        this.m = null;
        this.n = null;
        U();
        if (this.f == null) {
            setImageBitmap(null);
        } else {
            V();
        }
    }

    public SeekPreviewImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public SeekPreviewImageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ SeekPreviewImageView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public SeekPreviewImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.one_video_seek_preview_placeholder);
        setClipToOutline(true);
        setOutlineProvider(new eog0(o));
        setScaleType(ImageView.ScaleType.MATRIX);
        this.c = true;
        this.d = -1L;
        this.e = -1L;
        this.g = new gs2(this, 14);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.one_video_white_alpha60));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(x5r0.a(0.5f, 1));
        paint.setStyle(Paint.Style.STROKE);
        this.i = paint;
        this.j = new Matrix();
        this.k = -1;
        this.l = -1;
    }
}
