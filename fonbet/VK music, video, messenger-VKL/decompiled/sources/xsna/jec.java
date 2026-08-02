package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CircularTimeDrawable.java */
/* loaded from: classes3.dex */
public final class jec extends Drawable {
    public som0 a;
    public a b;
    public Paint c;
    public Paint d;
    public float e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public Paint p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public Bitmap v;
    public Canvas w;
    public Rect x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CircularTimeDrawable.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FINISHED;
        public static final a IDLE;
        public static final a STARTED;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a(SignalingProtocol.STATE_STARTED, 1);
            STARTED = aVar2;
            a aVar3 = new a("FINISHED", 2);
            FINISHED = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public final void a() {
        this.h = iah0.a(this.i);
        this.j = iah0.a(this.k);
        this.l = iah0.a(this.m);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.c.setColor(this.r);
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.c.setShadowLayer(this.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.s);
        Paint paint3 = new Paint();
        this.d = paint3;
        paint3.setAntiAlias(true);
        this.d.setColor(this.q);
        this.d.setStyle(style);
        this.d.setShadowLayer(this.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.s);
        Paint paint4 = new Paint();
        this.p = paint4;
        paint4.setAntiAlias(true);
        this.p.setColor(0);
        this.p.setStyle(style);
        this.p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        float f = this.e;
        this.w.drawColor(0, PorterDuff.Mode.CLEAR);
        Path path = new Path();
        float width = this.x.width() / 2;
        float height = this.x.height() / 2;
        float width2 = (this.x.width() / 2) - this.l;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, width2, direction);
        path.addCircle(this.x.width() / 2, this.x.height() / 2, ((this.x.width() / 2) - this.h) - this.l, direction);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.w.drawPath(path, this.c);
        a aVar = this.b;
        a aVar2 = a.STARTED;
        if (aVar == aVar2 && this.n != 0) {
            this.g = (System.currentTimeMillis() - this.n) / this.o;
        }
        if (this.g >= 1.0f) {
            this.b = a.FINISHED;
            this.g = 1.0f;
            som0 som0Var = this.a;
            if (som0Var != null) {
                xcf0 xcf0Var = (xcf0) som0Var.b;
                xcf0Var.post(new zcf0(som0Var, xcf0Var.j.get()));
                this.a = null;
            }
        }
        float f2 = this.l + this.h + this.j;
        Path path2 = new Path();
        RectF rectF = new RectF(f2, f2, this.x.width() - f2, this.x.height() - f2);
        if (this.f) {
            path2.addArc(rectF, f, (1.0f - this.g) * (-360.0f));
        } else {
            path2.addArc(rectF, f, this.g * 360.0f);
        }
        path2.lineTo(this.x.width() / 2, this.x.height() / 2);
        path2.close();
        this.w.drawPath(path2, this.d);
        canvas.drawBitmap(this.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        if (this.b == aVar2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (rect.width() == this.t && rect.height() == this.u) {
            return;
        }
        this.v = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        this.w = new Canvas(this.v);
        this.t = rect.width();
        this.u = rect.height();
        this.x = getBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
