package xsna;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextLayout.android.kt */
/* loaded from: classes11.dex */
public final class fjo0 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public sux0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final u7z[] o;
    public final Rect p = new Rect();
    public zny q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fjo0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, hoy hoyVar) {
        int i9;
        int i10;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout a;
        int i11;
        int i12;
        char c;
        long j;
        int i13;
        int i14;
        long a2;
        int i15;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        long j2;
        Paint.FontMetricsInt fontMetricsInt;
        u7z u7zVar;
        u7z u7zVar2;
        int i16;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic b = njo0.b(i2);
        Layout.Alignment alignment = pbo0.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : pbo0.b : pbo0.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, ft6.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a3 = hoyVar.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a3 == null || hoyVar.c() > f || z2) {
                i9 = 0;
                this.l = false;
                i10 = i3;
                textDirectionHeuristic = b;
                a = ayk0.a(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i10, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (ceil < 0) {
                    vzw.a("negative width");
                }
                if (ceil < 0) {
                    vzw.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    a = hd7.b(charSequence, textPaint, ceil, alignment2, a3, z, truncateAt, ceil);
                    i9 = 0;
                } else {
                    i9 = 0;
                    a = new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a3, z, truncateAt, ceil);
                }
                i10 = i3;
                textDirectionHeuristic = b;
            }
            this.f = a;
            Trace.endSection();
            int min = Math.min(a.getLineCount(), i10);
            this.g = min;
            int i17 = min - 1;
            this.d = (min >= i10 && (a.getEllipsisCount(i17) > 0 || a.getLineEnd(i17) != charSequence.length())) ? 1 : i9;
            u7z[] u7zVarArr = ((a.getText() instanceof Spanned) && (rdi.v((Spanned) a.getText(), u7z.class) || a.getText().length() <= 0)) ? (u7z[]) ((Spanned) a.getText()).getSpans(i9, a.getText().length(), u7z.class) : null;
            this.o = u7zVarArr;
            if (u7zVarArr == null || (u7zVar2 = (u7z) rl3.O(u7zVarArr)) == null) {
                i11 = 2;
                i12 = i9;
            } else {
                if (u7zVar2.d) {
                    i11 = 2;
                    if (u7zVar2.g == 2) {
                        i16 = 1;
                        i12 = i16;
                    }
                } else {
                    i11 = 2;
                }
                i16 = i9;
                i12 = i16;
            }
            int i18 = (u7zVarArr == null || (u7zVar = (u7z) rl3.O(u7zVarArr)) == null || !u7zVar.e || u7zVar.g != i11) ? i9 : 1;
            if (i12 == 0 || i18 == 0) {
                long j3 = njo0.b;
                if (z) {
                    c = ' ';
                    j = 4294967295L;
                    i13 = 33;
                } else {
                    if (this.l) {
                        BoringLayout boringLayout = (BoringLayout) a;
                        i13 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                            i15 = isFallbackLineSpacingEnabled2;
                        } else {
                            i15 = i9;
                        }
                    } else {
                        i13 = 33;
                        StaticLayout staticLayout = (StaticLayout) a;
                        if (Build.VERSION.SDK_INT >= 33) {
                            isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                            i15 = isFallbackLineSpacingEnabled;
                        } else {
                            i15 = 1;
                        }
                    }
                    if (i15 != 0) {
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        TextPaint paint = a.getPaint();
                        CharSequence text = a.getText();
                        c = ' ';
                        j = 4294967295L;
                        Rect a4 = jg90.a(paint, text, a.getLineStart(i9), a.getLineEnd(i9));
                        int lineAscent = a.getLineAscent(i9);
                        int i19 = a4.top;
                        int topPadding = i19 < lineAscent ? lineAscent - i19 : a.getTopPadding();
                        i14 = 1;
                        a4 = min != 1 ? jg90.a(paint, text, a.getLineStart(i17), a.getLineEnd(i17)) : a4;
                        int lineDescent = a.getLineDescent(i17);
                        int i20 = a4.bottom;
                        int bottomPadding = i20 > lineDescent ? i20 - lineDescent : a.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            j3 = njo0.a(topPadding, bottomPadding);
                        }
                        a2 = njo0.a(i12 == 0 ? i9 : (int) (j3 >> c), i18 == 0 ? i9 : (int) (j3 & j));
                    }
                }
                i14 = 1;
                a2 = njo0.a(i12 == 0 ? i9 : (int) (j3 >> c), i18 == 0 ? i9 : (int) (j3 & j));
            } else {
                a2 = njo0.b;
                c = ' ';
                j = 4294967295L;
                i13 = 33;
                i14 = 1;
            }
            if (u7zVarArr != null) {
                int length2 = u7zVarArr.length;
                int i21 = i9;
                int i22 = i21;
                int i23 = i22;
                while (i22 < length2) {
                    u7z u7zVar3 = u7zVarArr[i22];
                    int i24 = u7zVar3.l;
                    i21 = i24 < 0 ? Math.max(i21, Math.abs(i24)) : i21;
                    int i25 = u7zVar3.m;
                    if (i25 < 0) {
                        i23 = Math.max(i21, Math.abs(i25));
                    }
                    i22++;
                }
                j2 = (i21 == 0 && i23 == 0) ? njo0.b : njo0.a(i21, i23);
            } else {
                j2 = njo0.b;
            }
            this.h = Math.max((int) (a2 >> c), (int) (j2 >> c));
            this.i = Math.max((int) (a2 & j), (int) (j2 & j));
            TextPaint textPaint2 = this.a;
            u7z[] u7zVarArr2 = this.o;
            int i26 = this.g - i14;
            Layout layout = this.f;
            if (layout.getLineStart(i26) != layout.getLineEnd(i26) || u7zVarArr2 == null || u7zVarArr2.length == 0) {
                fontMetricsInt = null;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                u7z u7zVar4 = (u7z) rl3.L(u7zVarArr2);
                spannableString.setSpan(new u7z(u7zVar4.b, spannableString.length(), (i26 == 0 || !u7zVar4.e) ? u7zVar4.e : i9, u7zVar4.e, u7zVar4.f, u7zVar4.g), i9, spannableString.length(), i13);
                StaticLayout a5 = ayk0.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, sny.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = a5.getLineAscent(i9);
                fontMetricsInt.descent = a5.getLineDescent(i9);
                fontMetricsInt.top = a5.getLineTop(i9);
                fontMetricsInt.bottom = a5.getLineBottom(i9);
            }
            this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i17) - g(i17))) : i9;
            this.m = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = ntw.a(layout2, i17, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = ntw.b(layout3, i17, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        return i == this.g + (-1) ? this.j + this.k : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final zny c() {
        zny znyVar = this.q;
        if (znyVar != null) {
            return znyVar;
        }
        zny znyVar2 = new zny(this.f);
        this.q = znyVar2;
        return znyVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal<qbo0> threadLocal = njo0.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().c(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().c(i, false, z);
    }

    public final sux0 j() {
        sux0 sux0Var = this.e;
        if (sux0Var != null) {
            return sux0Var;
        }
        Layout layout = this.f;
        sux0 sux0Var2 = new sux0(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = sux0Var2;
        return sux0Var2;
    }
}
