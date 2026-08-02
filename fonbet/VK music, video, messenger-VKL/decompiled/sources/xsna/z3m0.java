package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;
import xsna.nov;

/* compiled from: StoryGeoSticker.kt */
/* loaded from: classes6.dex */
public final class z3m0 extends kr9 implements v4l0, agj {
    public static final float v = cn70.a() * 264.0f;
    public d4m0 h;
    public final b3l0 i = new b3l0();
    public Drawable j;
    public final int k;
    public float l;
    public final TextPaint m;
    public final Paint n;
    public final float o;
    public StaticLayout p;
    public final TextPaint q;
    public float r;
    public StaticLayout s;
    public boolean t;
    public float u;

    public z3m0(d4m0 d4m0Var) {
        this.h = d4m0Var;
        a3l0 r = r();
        this.k = (int) r.b(r.f);
        this.m = new TextPaint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.n = paint;
        a3l0 r2 = r();
        this.o = r2.b(r2.s);
        this.q = new TextPaint(1);
        this.u = 1.0f;
        p(this.h);
        float s = s();
        float f = this.l;
        if (f > s) {
            nov.a.f(this, s / f, getOriginalWidth() / 2.0f, getOriginalHeight() / 2.0f);
            this.u = this.c.l;
        }
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        z3m0 z3m0Var = new z3m0(this.h);
        nov.a.b(this, z3m0Var);
        return z3m0Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        int save;
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        float f = this.o;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, originalWidth, originalHeight, f, f, this.n);
        a3l0 r = r();
        float b = r.b(r.e);
        a3l0 r2 = r();
        float b2 = r2.b(r2.b);
        a3l0 r3 = r();
        float b3 = r3.b(r3.c);
        a3l0 r4 = r();
        float b4 = r4.b(r4.d);
        a3l0 r5 = r();
        float b5 = r5.b(r5.j);
        a3l0 r6 = r();
        float b6 = r6.b(r6.l);
        float height = this.p != null ? r6.getHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z = this.t;
        int i = this.k;
        if (z) {
            save = canvas.save();
            canvas.translate(b6, b5);
            try {
                StaticLayout staticLayout = this.p;
                if (staticLayout != null) {
                    staticLayout.draw(canvas);
                }
                canvas.restoreToCount(save);
                if (q(this.h)) {
                    a3l0 r7 = r();
                    float b7 = b5 + height + r7.b(r7.p);
                    save = canvas.save();
                    canvas.translate(b6, b7);
                    try {
                        StaticLayout staticLayout2 = this.s;
                        if (staticLayout2 != null) {
                            staticLayout2.draw(canvas);
                        }
                    } finally {
                    }
                }
                Drawable drawable = this.j;
                if (drawable != null) {
                    save = canvas.save();
                    canvas.translate(getOriginalWidth() - (b2 + b), b4);
                    canvas.scale(b / i, b / i);
                    drawable.draw(canvas);
                    return;
                }
                return;
            } finally {
            }
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            save = canvas.save();
            canvas.translate(b2, b4);
            canvas.scale(b / i, b / i);
            drawable2.draw(canvas);
        }
        float f2 = b2 + b + b3;
        save = canvas.save();
        canvas.translate(f2, b5);
        try {
            StaticLayout staticLayout3 = this.p;
            if (staticLayout3 != null) {
                staticLayout3.draw(canvas);
            }
            canvas.restoreToCount(save);
            if (q(this.h)) {
                a3l0 r8 = r();
                float b8 = r8.b(r8.p);
                a3l0 r9 = r();
                float b9 = f2 - r9.b(r9.q);
                float f3 = b5 + height + b8;
                save = canvas.save();
                canvas.translate(b9, f3);
                try {
                    StaticLayout staticLayout4 = this.s;
                    if (staticLayout4 != null) {
                        staticLayout4.draw(canvas);
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // xsna.agj
    public final void b(v2l0 v2l0Var) {
        this.h.c.b(v2l0Var);
        p(this.h);
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        StaticLayout staticLayout = this.p;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        if (q(this.h)) {
            StaticLayout staticLayout2 = this.s;
            if (staticLayout2 != null) {
                f = staticLayout2.getHeight();
            }
            a3l0 r = r();
            f += r.b(r.p);
        }
        a3l0 r2 = r();
        float b = r2.b(r2.j) + height + f;
        a3l0 r3 = r();
        return r3.b(r3.k) + b;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        float measureText = this.m.measureText(this.h.a);
        a3l0 r = r();
        float b = r.b(r.e);
        float f = q(this.h) ? this.r : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a3l0 r2 = r();
        float max = Math.max(measureText, f - r2.b(r2.q));
        a3l0 r3 = r();
        float b2 = r3.b(r3.b) + b;
        a3l0 r4 = r();
        float b3 = r4.b(r4.c) + b2 + max;
        a3l0 r5 = r();
        return r5.b(r5.l) + b3;
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.h;
    }

    public final void p(d4m0 d4m0Var) {
        a3l0 r = r();
        float b = r.b(r.h);
        TextPaint textPaint = this.m;
        textPaint.setTextSize(b);
        a3l0 r2 = r();
        textPaint.setTypeface(dbg0.a(r2.g, r2.a));
        com.vk.stickers.api.styles.a aVar = d4m0Var.c;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        textPaint.setColor(aVar.h(context));
        a3l0 r3 = r();
        textPaint.setLetterSpacing(r3.a(r3.m));
        String str = d4m0Var.a;
        this.l = textPaint.measureText(str);
        this.t = ((BidiFormatter) xpg0.a.getValue()).isRtl(str);
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, (int) this.l);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.p = obtain.setAlignment(alignment).setMaxLines(1).build();
        if (q(d4m0Var)) {
            a3l0 r4 = r();
            float b2 = r4.b(r4.o);
            TextPaint textPaint2 = this.q;
            textPaint2.setTextSize(b2);
            a3l0 r5 = r();
            textPaint2.setTypeface(dbg0.a(r5.n, r5.a));
            a3l0 r6 = r();
            textPaint2.setLetterSpacing(r6.a(r6.r));
            Integer f = aVar.f();
            if (f != null) {
                textPaint2.setColor(f.intValue());
            }
            String str2 = d4m0Var.b;
            a3l0 r7 = r();
            this.r = Float.min(v - (r7.b(r7.l) + ((r7.b(r7.c) + (r7.b(r7.e) + r7.b(r7.b))) - r7.b(r7.q))), textPaint2.measureText(str2));
            this.s = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint2, (int) this.r).setAlignment(alignment).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
        }
        int i = aVar.d() ? R.drawable.vk_icon_place_outline_16 : R.drawable.vk_icon_place_16;
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        Drawable a = m33.a(i, context2);
        if (a != null) {
            int i2 = this.k;
            a.setBounds(0, 0, i2, i2);
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
        this.n.setColor(aVar.g(context4 != null ? context4 : null));
    }

    public final boolean q(d4m0 d4m0Var) {
        if (myc0.f(this.h.b)) {
            return d4m0Var.c.c() == StickerCommonStyle.DARK_UNIQUE || d4m0Var.c.c() == StickerCommonStyle.LIGHT_UNIQUE;
        }
        return false;
    }

    public final a3l0 r() {
        StickerCommonStyle c = this.h.c.c();
        boolean d = this.h.c.d();
        this.i.getClass();
        return b3l0.b(c, d);
    }

    public final float s() {
        a3l0 r = r();
        return v - (r.b(r.l) + (r.b(r.c) + (r.b(r.e) + r.b(r.b))));
    }

    public final void t(d4m0 d4m0Var) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        this.h = d4m0Var;
        if (this.p != null) {
            f = this.l;
            f2 = getOriginalHeight();
            f3 = getCenterX();
            f4 = getCenterY();
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        p(this.h);
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float s = s();
            float f6 = this.l;
            if (f6 > s) {
                nov.a.f(this, (s / f6) / this.u, f3, f4);
                f5 = s / this.l;
            } else {
                nov.a.f(this, 1.0f / this.u, f3, f4);
                f5 = 1.0f;
            }
            this.u = f5;
            nov.a.i(this, f3 - getCenterX(), f4 - getCenterY());
        }
        xaq.a(this, new qah0(this, 9));
    }
}
