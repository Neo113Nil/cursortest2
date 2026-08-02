package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.api.models.time.TimeStickerStyle;
import xsna.nov;

/* compiled from: StoryTimerSticker.kt */
/* loaded from: classes6.dex */
public final class yjm0 extends kr9 implements v4l0 {
    public nvo0 h;
    public float k;
    public StaticLayout l;
    public TextPaint m;
    public StaticLayout n;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public final Paint i = new Paint(1);
    public final TextPaint j = new TextPaint(1);
    public ovo0 o = q();
    public hzo0 p = r();

    /* compiled from: StoryTimerSticker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeStickerStyle.values().length];
            try {
                iArr[TimeStickerStyle.STYLE_TIME_STICKER_BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeStickerStyle.STYLE_TIME_STICKER_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeStickerStyle.STYLE_TIME_STICKER_GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeStickerStyle.STYLE_TIME_STICKER_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeStickerStyle.STYLE_TIME_STICKER_DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeStickerStyle.STYLE_TIME_STICKER_MEMORIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yjm0(nvo0 nvo0Var) {
        this.h = nvo0Var;
        p(this.o);
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        yjm0 yjm0Var = new yjm0(this.h);
        nov.a.b(this, yjm0Var);
        return yjm0Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        ovo0 ovo0Var;
        Canvas canvas2;
        StaticLayout staticLayout = this.l;
        if (staticLayout == null || (ovo0Var = this.o) == null) {
            return;
        }
        Integer b = ovo0Var.b();
        if (b != null) {
            int intValue = b.intValue();
            Paint paint = this.i;
            paint.setColor(intValue);
            paint.setAlpha(this.g);
            if (ovo0Var.q()) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(ovo0Var.l());
            } else {
                paint.setStyle(Paint.Style.FILL);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.u, this.v, ovo0Var.h(), ovo0Var.h(), paint);
        } else {
            canvas2 = canvas;
        }
        StaticLayout staticLayout2 = this.n;
        if (staticLayout2 != null) {
            canvas2.save();
            canvas2.translate((this.u - this.s) / 2.0f, ovo0Var.o());
            staticLayout2.getPaint().setAlpha(this.g);
            staticLayout2.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        float a2 = wq.a(this.u, this.q, 2.0f, this.w);
        float f = this.t;
        canvas2.translate(a2, wq.a(this.v - f, this.r, 2.0f, f));
        staticLayout.getPaint().setAlpha(this.g);
        staticLayout.draw(canvas2);
        canvas2.restore();
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return this.v;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return this.u;
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.h;
    }

    public final void p(ovo0 ovo0Var) {
        String m = ovo0Var.m();
        int n = ovo0Var.n();
        TextPaint textPaint = this.j;
        textPaint.setColor(n);
        textPaint.setTextSize(ovo0Var.e());
        textPaint.setTypeface(ovo0Var.p());
        textPaint.setLetterSpacing(ovo0Var.f());
        Integer i = ovo0Var.i();
        Float j = ovo0Var.j();
        if (i == null || j == null) {
            textPaint.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } else {
            textPaint.setShadowLayer(j.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i.intValue());
        }
        this.k = textPaint.measureText(m.toString());
        this.l = new StaticLayout(m, this.j, (int) this.k, ovo0Var.a(), 1.0f, ovo0Var.g(), false);
        this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.r = r1.getHeight();
        int lineCount = this.l.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (this.q < this.l.getLineWidth(i2)) {
                this.q = (int) r4;
            }
        }
        this.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.n = null;
        hzo0 hzo0Var = this.p;
        if (hzo0Var != null) {
            this.m = new TextPaint(1);
            String m2 = hzo0Var.m();
            TextPaint textPaint2 = this.m;
            if (textPaint2 != null) {
                textPaint2.setColor(hzo0Var.h);
            }
            TextPaint textPaint3 = this.m;
            if (textPaint3 != null) {
                textPaint3.setTextSize(hzo0Var.c);
            }
            TextPaint textPaint4 = this.m;
            if (textPaint4 != null) {
                textPaint4.setTypeface(hzo0Var.d);
            }
            TextPaint textPaint5 = this.m;
            if (textPaint5 != null) {
                textPaint5.setLetterSpacing(hzo0Var.f);
            }
            this.s = this.m.measureText(m2.toString());
            this.n = new StaticLayout(m2, this.m, (int) this.s, hzo0Var.g, 1.0f, hzo0Var.e, false);
            this.t = r11.getHeight();
        }
        if (ovo0Var.q()) {
            this.u = ovo0Var.d() + ovo0Var.k() + Math.max(this.q, this.s);
            this.v = ovo0Var.c() + ovo0Var.o() + this.r + this.t;
            this.w = this.q / ((String) drm0.c0(m, new String[]{"/n"}, 0, 6).get(0)).length();
            return;
        }
        this.u = ovo0Var.d() + ovo0Var.k() + Math.max(this.q, this.s);
        this.v = ovo0Var.c() + ovo0Var.o() + this.r + this.t;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final ovo0 q() {
        switch (a.$EnumSwitchMapping$0[this.h.c.ordinal()]) {
            case 1:
                return new yd7(this.h.b);
            case 2:
                return new alx0(this.h.b);
            case 3:
                return new meu(this.h.b);
            case 4:
                return new eko0(this.h.b);
            case 5:
                nvo0 nvo0Var = this.h;
                return new uxk(nvo0Var.b, nvo0Var.d, false);
            case 6:
                nvo0 nvo0Var2 = this.h;
                return new uxk(nvo0Var2.b, nvo0Var2.d, true);
            default:
                throw new IllegalStateException("Can't get params for style " + this.h.c);
        }
    }

    public final hzo0 r() {
        int i = a.$EnumSwitchMapping$0[this.h.c.ordinal()];
        if (i == 5) {
            nvo0 nvo0Var = this.h;
            return new hzo0(nvo0Var.b, nvo0Var.d);
        }
        if (i != 6) {
            return null;
        }
        nvo0 nvo0Var2 = this.h;
        return new hzo0(nvo0Var2.b, nvo0Var2.d);
    }

    public final void s(nvo0 nvo0Var) {
        float f;
        float f2;
        this.h = nvo0Var;
        this.o = q();
        this.p = r();
        if (this.l != null) {
            f = this.u;
            f2 = this.v;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        p(this.o);
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = (f2 - this.v) / 2.0f;
            float f4 = (f - this.u) / 2.0f;
            float o = o();
            y0(o, this.u / 2.0f, this.v / 2.0f, true);
            nov.a.i(this, f4, f3);
            y0(-o, this.u / 2.0f, this.v / 2.0f, true);
        }
        xaq.a(this, new jz70(this, 25));
    }
}
