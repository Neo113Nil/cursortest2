package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.api.styles.StickerCommonStyle;
import xsna.nov;

/* compiled from: StoryLinkSticker.kt */
/* loaded from: classes6.dex */
public final class q5m0 extends kr9 implements v4l0, agj {
    public static final float r = iah0.b(269.0f);
    public r5m0 h;
    public final b3l0 i = new b3l0();
    public Drawable j;
    public final int k;
    public float l;
    public float m;
    public final TextPaint n;
    public final Paint o;
    public final float p;
    public StaticLayout q;

    public q5m0(r5m0 r5m0Var) {
        this.h = r5m0Var;
        a3l0 r2 = r();
        this.k = (int) r2.b(r2.f);
        this.n = new TextPaint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        a3l0 r3 = r();
        this.p = r3.b(r3.s);
        p(this.h);
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        q5m0 q5m0Var = new q5m0(this.h);
        nov.a.b(this, q5m0Var);
        return q5m0Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        float q = q(this.m);
        float originalHeight = getOriginalHeight();
        float f = this.p;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, q, originalHeight, f, f, this.o);
        a3l0 r2 = r();
        float b = r2.b(r2.e);
        a3l0 r3 = r();
        float b2 = r3.b(r3.b);
        a3l0 r4 = r();
        float b3 = r4.b(r4.c);
        Drawable drawable = this.j;
        if (drawable != null) {
            int save = canvas.save();
            canvas.translate(b2, (getOriginalHeight() - b) / 2);
            int i = this.k;
            canvas.scale(b / i, b / i);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
        a3l0 r5 = r();
        float b4 = r5.b(r5.j);
        float f2 = b2 + b + b3;
        int save2 = canvas.save();
        canvas.translate(f2, b4);
        try {
            StaticLayout staticLayout = this.q;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save2);
        }
    }

    @Override // xsna.agj
    public final void b(v2l0 v2l0Var) {
        this.h.c.b(v2l0Var);
        p(this.h);
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        a3l0 r2 = r();
        float b = r2.b(r2.j) + (this.q != null ? r1.getHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a3l0 r3 = r();
        return r3.b(r3.k) + b;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return q(this.m);
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.h;
    }

    public final void p(r5m0 r5m0Var) {
        a3l0 r2 = r();
        float b = r2.b(r2.i);
        a3l0 r3 = r();
        float b2 = r3.b(r3.h);
        while (b2 - b > 1.0E-4f) {
            float f = (b + b2) / 2.0f;
            if (q(f) <= r) {
                b = f;
            } else {
                b2 = f;
            }
        }
        this.m = b;
        TextPaint textPaint = this.n;
        textPaint.setTextSize(b);
        a3l0 r4 = r();
        textPaint.setTypeface(dbg0.a(r4.g, r4.a));
        com.vk.stickers.api.styles.a aVar = r5m0Var.c;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        textPaint.setColor(aVar.h(context));
        a3l0 r5 = r();
        textPaint.setLetterSpacing(r5.a(r5.m));
        String obj = drm0.p0(r5m0Var.b).toString();
        if (obj.length() > 29) {
            obj = obj.substring(0, 28).concat("...");
        }
        this.l = textPaint.measureText(obj);
        this.q = StaticLayout.Builder.obtain(obj, 0, obj.length(), textPaint, (int) this.l).setAlignment(Layout.Alignment.ALIGN_NORMAL).setMaxLines(1).build();
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        Drawable a = m33.a(r5m0Var.d, context2);
        if (a != null) {
            int i = this.k;
            a.setBounds(0, 0, i, i);
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            a.setTint(aVar.h(context3));
        } else {
            a = null;
        }
        this.j = a;
        Context context4 = e43.a;
        this.o.setColor(aVar.g(context4 != null ? context4 : null));
    }

    public final float q(float f) {
        String obj = drm0.p0(this.h.b).toString();
        if (obj.length() > 29) {
            obj = obj.substring(0, 28).concat("...");
        }
        TextPaint textPaint = this.n;
        textPaint.setTextSize(f);
        a3l0 r2 = r();
        textPaint.setLetterSpacing(r2.a(r2.m));
        float measureText = textPaint.measureText(obj);
        a3l0 r3 = r();
        return r3.b(r3.l) + r3.b(r3.c) + r3.b(r3.e) + r3.b(r3.b) + measureText;
    }

    public final a3l0 r() {
        StickerCommonStyle c = this.h.c.c();
        boolean d = this.h.c.d();
        this.i.getClass();
        return b3l0.b(c, d);
    }
}
