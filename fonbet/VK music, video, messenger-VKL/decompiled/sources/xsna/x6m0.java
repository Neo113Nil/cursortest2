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
import com.vkontakte.android.R;
import xsna.nov;

/* compiled from: StoryMentionSticker.kt */
/* loaded from: classes6.dex */
public final class x6m0 extends kr9 implements v4l0, agj {
    public v6m0 h;
    public final gzs<Integer> i;
    public final b3l0 j = new b3l0();
    public Drawable k;
    public final int l;
    public float m;
    public final TextPaint n;
    public final Paint o;
    public final float p;
    public StaticLayout q;

    public x6m0(v6m0 v6m0Var, gzs<Integer> gzsVar) {
        this.h = v6m0Var;
        this.i = gzsVar;
        a3l0 q = q();
        this.l = (int) q.b(q.f);
        this.n = new TextPaint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        a3l0 q2 = q();
        this.p = q2.b(q2.s);
        p(this.h);
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        x6m0 x6m0Var = new x6m0(this.h, this.i);
        nov.a.b(this, x6m0Var);
        return x6m0Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        float f = this.p;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, originalWidth, originalHeight, f, f, this.o);
        a3l0 q = q();
        float b = q.b(q.e);
        a3l0 q2 = q();
        float b2 = q2.b(q2.b);
        a3l0 q3 = q();
        float b3 = q3.b(q3.c);
        Drawable drawable = this.k;
        if (drawable != null) {
            int save = canvas.save();
            canvas.translate(b2, (getOriginalHeight() - b) / 2);
            int i = this.l;
            canvas.scale(b / i, b / i);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
        a3l0 q4 = q();
        float b4 = q4.b(q4.j);
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
        this.h.a.b(v2l0Var);
        p(this.h);
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        float height = this.q != null ? r0.getHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a3l0 q = q();
        float b = q.b(q.j) + height;
        a3l0 q2 = q();
        return q2.b(q2.k) + b;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        float measureText = this.n.measureText(this.h.d);
        a3l0 q = q();
        float b = q.b(q.b);
        a3l0 q2 = q();
        float b2 = q2.b(q2.e) + b;
        a3l0 q3 = q();
        float b3 = q3.b(q3.c) + b2 + measureText;
        a3l0 q4 = q();
        return q4.b(q4.l) + b3;
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerAlpha() {
        return this.g;
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.h;
    }

    public final void p(v6m0 v6m0Var) {
        float f;
        Float f2 = v6m0Var.b;
        com.vk.stickers.api.styles.a aVar = v6m0Var.a;
        String str = v6m0Var.d;
        TextPaint textPaint = this.n;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            int intValue = this.i.invoke().intValue();
            TextPaint textPaint2 = new TextPaint(textPaint);
            a3l0 q = q();
            int b = (int) q.b(q.i);
            a3l0 q2 = q();
            int b2 = ((int) q2.b(q2.h)) - 1;
            int i = b;
            while (b <= b2) {
                i = (b + b2) >>> 1;
                textPaint2.setTextSize(i);
                float measureText = textPaint2.measureText(str) - intValue;
                if (measureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (measureText <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        break;
                    }
                    b2 = i - 1;
                    i = b2;
                } else {
                    int i2 = i + 1;
                    i = b;
                    b = i2;
                }
            }
            f = i;
        }
        textPaint.setTextSize(f);
        a3l0 q3 = q();
        textPaint.setTypeface(dbg0.a(q3.g, q3.a));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        textPaint.setColor(aVar.h(context));
        a3l0 q4 = q();
        textPaint.setLetterSpacing(q4.a(q4.m));
        this.m = textPaint.measureText(str);
        this.q = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, (int) this.m).setAlignment(Layout.Alignment.ALIGN_NORMAL).setMaxLines(1).build();
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        Drawable a = m33.a(R.drawable.vk_icon_mention_16, context2);
        if (a != null) {
            int i3 = this.l;
            a.setBounds(0, 0, i3, i3);
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            a.setTint(aVar.h(context3));
        } else {
            a = null;
        }
        this.k = a;
        Context context4 = e43.a;
        this.o.setColor(aVar.g(context4 != null ? context4 : null));
    }

    public final a3l0 q() {
        StickerCommonStyle c = this.h.a.c();
        boolean d = this.h.a.d();
        this.j.getClass();
        return b3l0.b(c, d);
    }

    public final void r(v6m0 v6m0Var) {
        float f;
        float f2;
        this.h = v6m0Var;
        if (this.q != null) {
            f = getOriginalWidth();
            f2 = getOriginalHeight();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        p(this.h);
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float originalHeight = (f2 - getOriginalHeight()) / 2.0f;
            float originalWidth = (f - getOriginalWidth()) / 2.0f;
            float o = o();
            y0(o, getOriginalWidth() / 2.0f, getOriginalHeight() / 2.0f, true);
            nov.a.i(this, originalWidth, originalHeight);
            y0(-o, getOriginalWidth() / 2.0f, getOriginalHeight() / 2.0f, true);
        }
        xaq.a(this, new x550(this, 27));
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStickerAlpha(int i) {
        this.g = i;
        this.o.setAlpha(i);
        this.n.setAlpha(i);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }
}
