package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: TrackDrawDelegate.kt */
/* loaded from: classes18.dex */
public abstract class jfp0 extends ik {
    public static final float s = dn70.a() * 8.0f;
    public static final float t = dn70.a() * 8.0f;
    public static final float u = dn70.a() * 32.0f;
    public static final int v = dn70.b(30);
    public static final float w = dn70.a() * 2.0f;
    public static final float x = dn70.a() * 1.0f;
    public static final float y = dn70.a() * 4.0f;
    public static final float z = dn70.a() * 2.0f;
    public int g;
    public final int h;
    public String i;
    public final Object j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final TextPaint n;
    public final Paint o;
    public String p;
    public boolean q;
    public final float r;

    public jfp0(mwo0 mwo0Var, qwo0 qwo0Var) {
        super(mwo0Var);
        Integer num;
        this.h = 16;
        this.i = "";
        this.j = msy.a(LazyThreadSafetyMode.NONE, new j8n0(mwo0Var, 2));
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.k = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.l = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(x);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        this.m = paint3;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(this.c.getColor(R.color.vk_white));
        com.vk.typography.b.c(textPaint, this.c, FontFamily.MEDIUM, Float.valueOf(12.0f), TextSizeUnit.SP);
        textPaint.setLetterSpacing(0.005f);
        textPaint.setTextAlign(Paint.Align.LEFT);
        this.n = textPaint;
        Paint paint4 = new Paint(1);
        paint4.setAntiAlias(true);
        this.o = paint4;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        this.r = (-(fontMetrics.descent + fontMetrics.ascent)) / 2.0f;
        j(qwo0Var);
        gzs<Bitmap> gzsVar = qwo0Var.g;
        if (gzsVar != null) {
            eqv i = i();
            g2f g2fVar = i.a.k;
            if (g2fVar == null) {
                Log.e("IconDelegate", "can't set bitmap provider to icons delegate, utility hasn't been set");
                return;
            } else {
                hg1.i(new io.reactivex.rxjava3.internal.operators.single.v(new dqv(gzsVar, 0)).q(g2fVar.c()).l(new nz(new mre(i, 24), 21)).m(g2fVar.d()), new wje(i, 27));
                return;
            }
        }
        String str = qwo0Var.f;
        Drawable drawable = null;
        if (str != null) {
            eqv i2 = i();
            if (epx.f(i2.j, str)) {
                return;
            }
            i2.g = null;
            i2.h = null;
            i2.j = str;
            mwo0 mwo0Var2 = i2.a;
            uke ukeVar = mwo0Var2.l;
            g2f g2fVar2 = mwo0Var2.k;
            if (ukeVar == null || g2fVar2 == null) {
                Log.e("IconDelegate", "can't set image to icons delegate, utility hasn't been set");
                return;
            } else {
                ukeVar.a(Uri.parse(str)).l(new gv(new cqv(i2, 0), 23)).q(g2fVar2.c()).m(g2fVar2.d()).subscribe(new hv(new kdn(i2, 12), 27), new jv(new dwg(i2, 20), 24));
                return;
            }
        }
        int i3 = qwo0Var.e;
        int i4 = qwo0Var.d;
        eqv i5 = i();
        Integer num2 = i5.g;
        if (num2 != null && num2.intValue() == i3 && (num = i5.h) != null && num.intValue() == i4) {
            return;
        }
        i5.j = null;
        i5.g = Integer.valueOf(i3);
        i5.h = Integer.valueOf(i4);
        Drawable a = m33.a(i3, i5.c);
        if (a != null) {
            a.setTint(i4);
            drawable = a;
        }
        i5.d(drawable);
    }

    @Override // xsna.yc6
    public void b() {
        eqv i = i();
        RectF rectF = i.d;
        float f = hip0.a;
        rectF.left = f;
        rectF.top = f;
        float f2 = f + hip0.b;
        rectF.right = f2;
        rectF.bottom = f2;
        s3q0 s3q0Var = s3q0.a;
        i.b();
        RectF rectF2 = this.d;
        this.o.setShader(new LinearGradient(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF2.width() - v), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF2.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, this.k.getColor(), Shader.TileMode.CLAMP));
    }

    @Override // xsna.ik
    public final int d() {
        return this.h;
    }

    @Override // xsna.ik
    public final int e() {
        return this.g;
    }

    @Override // xsna.ik
    public final String f() {
        return this.i;
    }

    public void g() {
        Bitmap bitmap;
        Drawable drawable = i().i;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        bitmap.recycle();
    }

    public void h(Canvas canvas) {
        eqv i = i();
        Drawable drawable = i.i;
        if (drawable != null) {
            drawable.setAlpha(i.k);
        }
        Drawable drawable2 = i.i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        String str = this.p;
        RectF rectF = this.d;
        if (str != null) {
            canvas.drawText(str, i().d.right + t, (rectF.height() / 2.0f) + this.r, this.n);
        }
        if (this.k.getAlpha() == 255) {
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.width() - v);
            float width = rectF.width();
            float height = rectF.height();
            float f = s;
            canvas.drawRoundRect(max, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, this.o);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final eqv i() {
        return (eqv) this.j.getValue();
    }

    public final void j(qwo0 qwo0Var) {
        int i = qwo0Var.c;
        this.p = qwo0Var.a;
        this.n.setAlpha(qwo0Var.a());
        i().k = qwo0Var.a();
        Paint paint = this.k;
        int color = paint.getColor();
        int i2 = qwo0Var.b;
        if (color != i2 || paint.getAlpha() != qwo0Var.a()) {
            paint.setColor(i2);
            paint.setAlpha(qwo0Var.a());
        }
        Paint paint2 = this.l;
        if (paint2.getColor() != i) {
            paint2.setColor(i);
            paint2.setAlpha(51);
            this.m.setColor(i);
        }
    }
}
