package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.SuggestionSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.nov;

/* compiled from: TextSticker.java */
/* loaded from: classes15.dex */
public final class xlo0 extends kr9 implements hko0 {
    public static final int p;
    public final int h;
    public final TextPaint i;
    public float j;
    public imo0 k;
    public CharSequence l;
    public StaticLayout m;
    public pjo0 n;

    @Nullable
    public jmo0 o;

    static {
        int i = zlo0.b;
        p = zlo0.b * 2;
    }

    public xlo0(xlo0 xlo0Var) {
        Paint paint = new Paint(1);
        this.h = xlo0Var.h;
        this.k = xlo0Var.k;
        this.i = new TextPaint(xlo0Var.i);
        paint.setStyle(Paint.Style.FILL);
        this.j = xlo0Var.j;
        this.n = xlo0Var.n;
        q(xlo0Var.k, xlo0Var.l);
    }

    @Override // xsna.kr9, xsna.nov
    @NonNull
    public final nov E0(@Nullable nov novVar) {
        xlo0 xlo0Var = new xlo0(this);
        nov.a.b(this, xlo0Var);
        return xlo0Var;
    }

    @Override // xsna.nov
    public final void G0(@NonNull Canvas canvas) {
        if (this.m == null) {
            return;
        }
        int save = canvas.save();
        Layout.Alignment alignment = this.k.b;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        int i = this.h;
        if (alignment == alignment2) {
            canvas.translate((this.j - i) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
            canvas.translate(this.j - i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        int i2 = this.g;
        pjo0 pjo0Var = this.n;
        if (pjo0Var != null) {
            Paint paint = pjo0Var.c;
            if (i2 == 255) {
                paint.setAlpha(pjo0Var.d);
            } else {
                paint.setAlpha(i2);
            }
            this.n.draw(canvas);
        }
        this.m.getPaint().setAlpha(i2);
        this.m.draw(canvas);
        jmo0 jmo0Var = this.o;
        if (jmo0Var != null) {
            Paint paint2 = jmo0Var.c;
            List<yhk0<p0m0>> list = jmo0Var.b;
            if (list != null && paint2 != null) {
                Iterator<yhk0<p0m0>> it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRect(it.next().b, paint2);
                }
                canvas.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5.0f, paint2);
            }
        }
        canvas.restoreToCount(save);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xlo0.class != obj.getClass()) {
            return false;
        }
        xlo0 xlo0Var = (xlo0) obj;
        return this.h == xlo0Var.h && Float.compare(xlo0Var.j, this.j) == 0 && this.k.equals(xlo0Var.k) && this.l.equals(xlo0Var.l) && this.c.n.equals(xlo0Var.c.n);
    }

    @Override // xsna.hko0
    public final int getLineCount() {
        StaticLayout staticLayout = this.m;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @Override // xsna.hko0
    public final float getLineSpacing() {
        return this.m.getSpacingAdd();
    }

    @Override // xsna.kr9, xsna.nov
    public final float getMaxScaleLimit() {
        return 5.0f;
    }

    @Override // xsna.hko0
    public final float getMultiplier() {
        return this.m.getSpacingMultiplier();
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return this.m != null ? r0.getHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return this.m != null ? this.j : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.hko0
    public final void h(int i, @NonNull Rect rect) {
        rect.left = (int) this.m.getLineLeft(i);
        rect.top = this.m.getLineTop(i);
        rect.right = (int) this.m.getLineRight(i);
        rect.bottom = this.m.getLineBottom(i);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.h), Float.valueOf(this.j), this.k, this.l, this.c.n);
    }

    @Override // xsna.hko0
    @NonNull
    public final String j(int i) {
        return this.m != null ? this.l.toString().substring(this.m.getLineStart(i), this.m.getLineEnd(i)) : "";
    }

    public final void p() {
        this.k.l.getClass();
        this.i.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    }

    public final void q(imo0 imo0Var, CharSequence charSequence) {
        float f;
        float f2;
        if (imo0Var == null) {
            return;
        }
        this.k = imo0Var;
        int i = imo0Var.f;
        TextPaint textPaint = this.i;
        textPaint.setColor(i);
        textPaint.setTextSize(imo0Var.c);
        textPaint.setTypeface(imo0Var.a);
        p();
        if (charSequence == null) {
            this.l = "...";
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                for (Object obj : spanned.getSpans(0, charSequence.length(), Object.class)) {
                    if (!(obj instanceof SuggestionSpan)) {
                        spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), spanned.getSpanFlags(obj));
                    }
                }
            }
            this.l = spannableStringBuilder;
        }
        StaticLayout staticLayout = this.m;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (staticLayout != null) {
            f = getOriginalWidth();
            f2 = getOriginalHeight();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        CharSequence charSequence2 = this.l;
        imo0 imo0Var2 = this.k;
        this.m = new StaticLayout(charSequence2, textPaint, this.h, imo0Var2.b, imo0Var2.e, imo0Var2.d, false);
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i2 = 0; i2 < this.m.getLineCount(); i2++) {
            if (this.j <= this.m.getLineWidth(i2)) {
                this.j = (int) r1;
            }
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float originalHeight = (f2 - getOriginalHeight()) / 2.0f;
            Layout.Alignment alignment = this.k.b;
            if (alignment == Layout.Alignment.ALIGN_CENTER) {
                f3 = (f - getOriginalWidth()) / 2.0f;
            } else if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
                f3 = f - getOriginalWidth();
            }
            float o = o();
            y0(o, getOriginalWidth() / 2.0f, getOriginalHeight() / 2.0f, true);
            float f4 = this.c.l;
            nov.a.i(this, f3 * f4, f4 * originalHeight);
            y0(-o, getOriginalWidth() / 2.0f, getOriginalHeight() / 2.0f, true);
        }
        this.o = new jmo0(this.m);
        pjo0 pjo0Var = this.n;
        if (pjo0Var != null) {
            pjo0Var.b(this);
        }
        pjo0 a = aco0.a(imo0Var.k);
        this.n = a;
        if (this.m == null || a == null) {
            return;
        }
        a.b(this);
    }

    public xlo0(int i, CharSequence charSequence, imo0 imo0Var) {
        Paint paint = new Paint(1);
        this.h = i;
        this.k = imo0Var;
        Typeface typeface = imo0Var.a;
        int i2 = imo0Var.f;
        float f = imo0Var.c;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typeface);
        textPaint.setColor(i2);
        textPaint.setTextSize(f);
        this.i = textPaint;
        p();
        paint.setStyle(Paint.Style.FILL);
        this.n = aco0.a(imo0Var.k);
        q(imo0Var, charSequence);
    }
}
