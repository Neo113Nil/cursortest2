package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: MaterialProgressDrawable.java */
/* loaded from: classes17.dex */
public final class om10 extends Drawable implements Animatable {
    public static final LinearInterpolator l = new LinearInterpolator();
    public static final ilq m = new ilq();
    public final ArrayList<Animation> b = new ArrayList<>();
    public final b c;
    public float d;
    public final Resources e;
    public final View f;
    public final mm10 g;
    public float h;
    public double i;
    public double j;
    public boolean k;

    /* compiled from: MaterialProgressDrawable.java */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            om10.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            om10.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            om10.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    public static class b {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;
        public final a d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public int[] j;
        public int k;
        public float l;
        public float m;
        public float n;
        public boolean o;
        public Path p;
        public float q;
        public double r;
        public int s;
        public int t;
        public int u;
        public final Paint v;
        public int w;
        public int x;

        public b(a aVar) {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.h = 5.0f;
            this.i = 2.5f;
            this.v = new Paint(1);
            this.d = aVar;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        public final void a() {
            this.d.invalidateDrawable(null);
        }

        public final void b(int i) {
            this.k = i;
            this.x = this.j[i];
        }
    }

    public om10(Context context, View view) {
        a aVar = new a();
        this.f = view;
        this.e = context.getResources();
        b bVar = new b(aVar);
        this.c = bVar;
        bVar.j = new int[]{-16777216};
        bVar.b(0);
        c(1);
        mm10 mm10Var = new mm10(this, bVar);
        mm10Var.setRepeatCount(-1);
        mm10Var.setRepeatMode(1);
        mm10Var.setInterpolator(l);
        mm10Var.setAnimationListener(new nm10(this, bVar));
        this.g = mm10Var;
    }

    public static void b(float f, b bVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = bVar.j;
            int i = bVar.k;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            bVar.x = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
        }
    }

    public final void a(double d, double d2, double d3, double d4, float f, float f2) {
        float f3 = this.e.getDisplayMetrics().density;
        double d5 = f3;
        this.i = d * d5;
        this.j = d2 * d5;
        float f4 = ((float) d4) * f3;
        b bVar = this.c;
        bVar.h = f4;
        bVar.b.setStrokeWidth(f4);
        bVar.a();
        bVar.r = d3 * d5;
        bVar.b(0);
        bVar.s = (int) (f * f3);
        bVar.t = (int) (f2 * f3);
        float min = Math.min((int) this.i, (int) this.j);
        double d6 = bVar.r;
        bVar.i = (d6 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || min < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (float) Math.ceil(bVar.h / 2.0f) : (float) ((min / 2.0f) - d6);
    }

    public final void c(int i) {
        if (i == 0) {
            a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.d, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.c;
        Paint paint = bVar.v;
        RectF rectF = bVar.a;
        rectF.set(bounds);
        float f = bVar.i;
        rectF.inset(f, f);
        float f2 = bVar.e;
        float f3 = bVar.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((bVar.f + f3) * 360.0f) - f4;
        Paint paint2 = bVar.b;
        paint2.setColor(bVar.x);
        canvas.drawArc(rectF, f4, f5, false, paint2);
        Paint paint3 = bVar.c;
        if (bVar.o) {
            Path path = bVar.p;
            if (path == null) {
                Path path2 = new Path();
                bVar.p = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float f6 = (((int) bVar.i) / 2) * bVar.q;
            float cos = (float) ((Math.cos(ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * bVar.r) + bounds.exactCenterX());
            float sin = (float) ((Math.sin(ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * bVar.r) + bounds.exactCenterY());
            bVar.p.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            bVar.p.lineTo(bVar.s * bVar.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path3 = bVar.p;
            float f7 = bVar.s;
            float f8 = bVar.q;
            path3.lineTo((f7 * f8) / 2.0f, bVar.t * f8);
            bVar.p.offset(cos - f6, sin);
            bVar.p.close();
            paint3.setColor(bVar.x);
            canvas.rotate((f4 + f5) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(bVar.p, paint3);
        }
        if (bVar.u < 255) {
            paint.setColor(bVar.w);
            paint.setAlpha(255 - bVar.u);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2, paint);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.u = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.c;
        bVar.b.setColorFilter(colorFilter);
        bVar.a();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.g.reset();
        b bVar = this.c;
        float f = bVar.e;
        bVar.l = f;
        float f2 = bVar.f;
        bVar.m = f2;
        bVar.n = bVar.g;
        View view = this.f;
        if (f2 != f) {
            this.k = true;
            this.g.setDuration(666L);
            view.startAnimation(this.g);
            return;
        }
        bVar.b(0);
        bVar.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
        bVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
        bVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
        this.g.setDuration(1332L);
        view.startAnimation(this.g);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clearAnimation();
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        invalidateSelf();
        b bVar = this.c;
        if (bVar.o) {
            bVar.o = false;
            bVar.a();
        }
        bVar.b(0);
        bVar.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
        bVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
        bVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
    }
}
