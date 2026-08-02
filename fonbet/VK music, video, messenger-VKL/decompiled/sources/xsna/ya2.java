package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.za2;

/* compiled from: AndroidParagraph.android.kt */
/* loaded from: classes11.dex */
public final class ya2 {
    public final bb2 a;
    public final int b;
    public final long c;
    public final fjo0 d;
    public final CharSequence e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:111:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ya2(bb2 bb2Var, int i, int i2, long j) {
        int i3;
        CharSequence charSequence;
        hik0 hik0Var;
        int i4;
        CharSequence charSequence2;
        int i5;
        CharSequence charSequence3;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        int i10;
        hik0 hik0Var2;
        int i11;
        CharSequence charSequence4;
        hik0 hik0Var3;
        int i12;
        int i13;
        TextUtils.TruncateAt truncateAt;
        int i14;
        TextUtils.TruncateAt truncateAt2;
        fjo0 a;
        TextUtils.TruncateAt truncateAt3;
        int i15;
        ya2 ya2Var;
        int i16;
        TextUtils.TruncateAt truncateAt4;
        Layout layout;
        o4j0[] o4j0VarArr;
        CharSequence charSequence5;
        Object obj;
        boolean z;
        zhf0 zhf0Var;
        float i17;
        int b;
        float h;
        int b2;
        float d;
        int a2;
        float g;
        float f;
        float d2;
        this.a = bb2Var;
        this.b = i;
        this.c = j;
        if (o6j.j(j) != 0 || o6j.k(j) != 0) {
            vzw.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            vzw.a("maxLines should be greater than 0");
        }
        nmo0 nmo0Var = bb2Var.b;
        CharSequence charSequence6 = bb2Var.h;
        if (i2 == 2) {
            i3 = 0;
            charSequence = charSequence6;
            if (!fno0.b(nmo0Var.a.h, l2l0.l(0))) {
                charSequence = charSequence6;
                if (!fno0.b(nmo0Var.a.h, fno0.c)) {
                    int i18 = nmo0Var.b.a;
                    charSequence = charSequence6;
                    charSequence = charSequence6;
                    charSequence = charSequence6;
                    if (i18 != 0 && i18 != 5 && i18 != 4) {
                        int length = charSequence6.length();
                        charSequence = charSequence6;
                        if (length != 0) {
                            Spannable spannable = charSequence6 instanceof Spannable ? (Spannable) charSequence6 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence6) : spannable;
                            boolean v = rdi.v(spannableString, mtw.class);
                            charSequence = spannableString;
                            if (!v) {
                                spannableString.setSpan(new mtw(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i3 = 0;
            charSequence = charSequence6;
        }
        this.e = charSequence;
        fh90 fh90Var = nmo0Var.b;
        hik0 hik0Var4 = nmo0Var.a;
        int i19 = fh90Var.a;
        if (i19 == 1) {
            hik0Var = hik0Var4;
            i4 = 3;
        } else if (i19 == 2) {
            hik0Var = hik0Var4;
            i4 = 4;
        } else if (i19 == 3) {
            hik0Var = hik0Var4;
            i4 = 2;
        } else if (i19 != 5 && i19 == 6) {
            hik0Var = hik0Var4;
            i4 = 1;
        } else {
            hik0Var = hik0Var4;
            i4 = i3;
        }
        if (i19 == 4) {
            charSequence2 = charSequence;
            i5 = 1;
        } else {
            charSequence2 = charSequence;
            i5 = i3;
        }
        int i20 = fh90Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = fh90Var.g;
        int i22 = i21 & 255;
        if (i22 != 1) {
            if (i22 == 2) {
                charSequence3 = charSequence2;
                i6 = 1;
            } else if (i22 == 3) {
                charSequence3 = charSequence2;
                i6 = 2;
            }
            i7 = (i21 >> 8) & 255;
            if (i7 == 1) {
                c = ' ';
                if (i7 == 2) {
                    i8 = 1;
                } else if (i7 == 3) {
                    i8 = 2;
                } else if (i7 == 4) {
                    i8 = 3;
                }
                i9 = (i21 >> 16) & 255;
                if (i9 == 1) {
                    i10 = 2;
                } else {
                    i10 = 2;
                    if (i9 == 2) {
                        hik0Var2 = hik0Var;
                        i11 = 1;
                        if (i2 != i10) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else {
                            if (i2 != 5) {
                                if (i2 == 4) {
                                    charSequence4 = charSequence3;
                                    hik0Var3 = hik0Var2;
                                    i12 = 1;
                                    i13 = 4;
                                    i14 = i20;
                                    truncateAt = TextUtils.TruncateAt.START;
                                } else {
                                    charSequence4 = charSequence3;
                                    hik0Var3 = hik0Var2;
                                    i12 = 1;
                                    i13 = 4;
                                    truncateAt = null;
                                    i14 = i20;
                                }
                                a = a(i4, i5, truncateAt, i, i14, i6, i8, i11, charSequence4);
                                truncateAt3 = truncateAt;
                                CharSequence charSequence7 = charSequence4;
                                Layout layout2 = a.f;
                                if (Build.VERSION.SDK_INT < 35 || bb2Var.g.getLetterSpacing() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (!(i2 == i13 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    i15 = 2;
                                    ya2Var = this;
                                    i16 = i;
                                    truncateAt4 = truncateAt3;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                                    CharSequence subSequence = charSequence7.subSequence(0, ellipsisStart);
                                    CharSequence subSequence2 = charSequence7.subSequence(ellipsisCount, charSequence7.length());
                                    CharSequence[] charSequenceArr = new CharSequence[3];
                                    charSequenceArr[0] = subSequence;
                                    charSequenceArr[i12] = "…";
                                    i15 = 2;
                                    charSequenceArr[2] = subSequence2;
                                    CharSequence concat = TextUtils.concat(charSequenceArr);
                                    ya2Var = this;
                                    i16 = i;
                                    truncateAt4 = truncateAt3;
                                    a = ya2Var.a(i4, i5, truncateAt4, i16, i14, i6, i8, i11, concat);
                                }
                                int i23 = a.g;
                                if (i2 == i15 || a.a() <= o6j.h(j) || i16 <= i12) {
                                    ya2Var.d = a;
                                } else {
                                    int h2 = o6j.h(j);
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 >= i23) {
                                            break;
                                        }
                                        if (a.e(i24) > h2) {
                                            i23 = i24;
                                            break;
                                        }
                                        i24++;
                                    }
                                    if (i23 >= 0 && i23 != ya2Var.b) {
                                        a = ya2Var.a(i4, i5, truncateAt4, i23 < 1 ? 1 : i23, i14, i6, i8, i11, ya2Var.e);
                                    }
                                    ya2Var.d = a;
                                }
                                hik0 hik0Var5 = hik0Var3;
                                ya2Var.a.g.c(hik0Var5.a.e(), (Float.floatToRawIntBits(ya2Var.c()) & 4294967295L) | (Float.floatToRawIntBits(ya2Var.g()) << c), hik0Var5.a.a());
                                layout = ya2Var.d.f;
                                if (layout.getText() instanceof Spanned) {
                                    Spanned spanned = (Spanned) layout.getText();
                                    if (spanned.nextSpanTransition(-1, spanned.length(), o4j0.class) != spanned.length()) {
                                        o4j0VarArr = (o4j0[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), o4j0.class);
                                        if (o4j0VarArr != null) {
                                            for (o4j0 o4j0Var : o4j0VarArr) {
                                                ((zak0) o4j0Var.d).setValue(new mxj0((Float.floatToRawIntBits(ya2Var.c()) & 4294967295L) | (Float.floatToRawIntBits(ya2Var.g()) << c)));
                                            }
                                        }
                                        charSequence5 = ya2Var.e;
                                        if (charSequence5 instanceof Spanned) {
                                            obj = EmptyList.b;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence5;
                                            Object[] spans = spanned2.getSpans(0, charSequence5.length(), qsa0.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj2 : spans) {
                                                qsa0 qsa0Var = (qsa0) obj2;
                                                int spanStart = spanned2.getSpanStart(qsa0Var);
                                                int spanEnd = spanned2.getSpanEnd(qsa0Var);
                                                int lineForOffset = ya2Var.d.f.getLineForOffset(spanStart);
                                                boolean z2 = lineForOffset >= ya2Var.b;
                                                if (ya2Var.d.f.getEllipsisCount(lineForOffset) > 0) {
                                                    if (spanEnd > ya2Var.d.f.getEllipsisStart(lineForOffset) + ya2Var.d.f.getLineStart(lineForOffset)) {
                                                        z = true;
                                                        boolean z3 = spanEnd <= ya2Var.d.f(lineForOffset);
                                                        if (!z || z3 || z2) {
                                                            zhf0Var = null;
                                                        } else {
                                                            boolean z4 = ya2Var.d.f.getParagraphDirection(lineForOffset) == 1;
                                                            boolean isRtlCharAt = ya2Var.d.f.isRtlCharAt(spanStart);
                                                            if (!z4 || isRtlCharAt) {
                                                                if (z4 && isRtlCharAt) {
                                                                    h = ya2Var.d.i(spanStart, false);
                                                                    b2 = qsa0Var.b();
                                                                } else if (isRtlCharAt) {
                                                                    h = ya2Var.d.h(spanStart, false);
                                                                    b2 = qsa0Var.b();
                                                                } else {
                                                                    i17 = ya2Var.d.i(spanStart, false);
                                                                    b = qsa0Var.b();
                                                                }
                                                                i17 = h - b2;
                                                                fjo0 fjo0Var = ya2Var.d;
                                                                switch (qsa0Var.h) {
                                                                    case 0:
                                                                        d = fjo0Var.d(lineForOffset);
                                                                        a2 = qsa0Var.a();
                                                                        g = d - a2;
                                                                        zhf0Var = new zhf0(i17, g, h, qsa0Var.a() + g);
                                                                        break;
                                                                    case 1:
                                                                        g = fjo0Var.g(lineForOffset);
                                                                        zhf0Var = new zhf0(i17, g, h, qsa0Var.a() + g);
                                                                        break;
                                                                    case 2:
                                                                        d = fjo0Var.e(lineForOffset);
                                                                        a2 = qsa0Var.a();
                                                                        g = d - a2;
                                                                        zhf0Var = new zhf0(i17, g, h, qsa0Var.a() + g);
                                                                        break;
                                                                    case 3:
                                                                        g = ((fjo0Var.e(lineForOffset) + fjo0Var.g(lineForOffset)) - qsa0Var.a()) / i15;
                                                                        zhf0Var = new zhf0(i17, g, h, qsa0Var.a() + g);
                                                                        break;
                                                                    case 4:
                                                                        Paint.FontMetricsInt fontMetricsInt = qsa0Var.i;
                                                                        f = (fontMetricsInt == null ? null : fontMetricsInt).ascent;
                                                                        d2 = fjo0Var.d(lineForOffset);
                                                                        g = d2 + f;
                                                                        zhf0Var = new zhf0(i17, g, h, qsa0Var.a() + g);
                                                                        break;
                                                                    case 5:
                                                                        d = fjo0Var.d(lineForOffset) + (qsa0Var.i == null ? null : r14).descent;
                                                                        a2 = qsa0Var.a();
                                                                        g = d - a2;
                                                                        zhf0Var = new zhf0(i17, g, h, qsa0Var.a() + g);
                                                                        break;
                                                                    case 6:
                                                                        Paint.FontMetricsInt fontMetricsInt2 = qsa0Var.i;
                                                                        fontMetricsInt2 = fontMetricsInt2 == null ? null : fontMetricsInt2;
                                                                        f = ((fontMetricsInt2.ascent + fontMetricsInt2.descent) - qsa0Var.a()) / i15;
                                                                        d2 = fjo0Var.d(lineForOffset);
                                                                        g = d2 + f;
                                                                        zhf0Var = new zhf0(i17, g, h, qsa0Var.a() + g);
                                                                        break;
                                                                    default:
                                                                        throw new IllegalStateException("unexpected verticalAlignment");
                                                                }
                                                            } else {
                                                                i17 = ya2Var.d.h(spanStart, false);
                                                                b = qsa0Var.b();
                                                            }
                                                            h = b + i17;
                                                            fjo0 fjo0Var2 = ya2Var.d;
                                                            switch (qsa0Var.h) {
                                                            }
                                                        }
                                                        arrayList.add(zhf0Var);
                                                    }
                                                }
                                                z = false;
                                                if (spanEnd <= ya2Var.d.f(lineForOffset)) {
                                                }
                                                if (z) {
                                                }
                                                zhf0Var = null;
                                                arrayList.add(zhf0Var);
                                            }
                                            obj = arrayList;
                                        }
                                        ya2Var.f = obj;
                                    }
                                }
                                o4j0VarArr = null;
                                if (o4j0VarArr != null) {
                                }
                                charSequence5 = ya2Var.e;
                                if (charSequence5 instanceof Spanned) {
                                }
                                ya2Var.f = obj;
                            }
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        }
                        charSequence4 = charSequence3;
                        hik0Var3 = hik0Var2;
                        i12 = 1;
                        truncateAt = truncateAt2;
                        i14 = i20;
                        i13 = 4;
                        a = a(i4, i5, truncateAt, i, i14, i6, i8, i11, charSequence4);
                        truncateAt3 = truncateAt;
                        CharSequence charSequence72 = charSequence4;
                        Layout layout22 = a.f;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        i15 = 2;
                        ya2Var = this;
                        i16 = i;
                        truncateAt4 = truncateAt3;
                        int i232 = a.g;
                        if (i2 == i15) {
                        }
                        ya2Var.d = a;
                        hik0 hik0Var52 = hik0Var3;
                        ya2Var.a.g.c(hik0Var52.a.e(), (Float.floatToRawIntBits(ya2Var.c()) & 4294967295L) | (Float.floatToRawIntBits(ya2Var.g()) << c), hik0Var52.a.a());
                        layout = ya2Var.d.f;
                        if (layout.getText() instanceof Spanned) {
                        }
                        o4j0VarArr = null;
                        if (o4j0VarArr != null) {
                        }
                        charSequence5 = ya2Var.e;
                        if (charSequence5 instanceof Spanned) {
                        }
                        ya2Var.f = obj;
                    }
                }
                hik0Var2 = hik0Var;
                i11 = i3;
                if (i2 != i10) {
                }
                charSequence4 = charSequence3;
                hik0Var3 = hik0Var2;
                i12 = 1;
                truncateAt = truncateAt2;
                i14 = i20;
                i13 = 4;
                a = a(i4, i5, truncateAt, i, i14, i6, i8, i11, charSequence4);
                truncateAt3 = truncateAt;
                CharSequence charSequence722 = charSequence4;
                Layout layout222 = a.f;
                if (Build.VERSION.SDK_INT < 35) {
                }
                i15 = 2;
                ya2Var = this;
                i16 = i;
                truncateAt4 = truncateAt3;
                int i2322 = a.g;
                if (i2 == i15) {
                }
                ya2Var.d = a;
                hik0 hik0Var522 = hik0Var3;
                ya2Var.a.g.c(hik0Var522.a.e(), (Float.floatToRawIntBits(ya2Var.c()) & 4294967295L) | (Float.floatToRawIntBits(ya2Var.g()) << c), hik0Var522.a.a());
                layout = ya2Var.d.f;
                if (layout.getText() instanceof Spanned) {
                }
                o4j0VarArr = null;
                if (o4j0VarArr != null) {
                }
                charSequence5 = ya2Var.e;
                if (charSequence5 instanceof Spanned) {
                }
                ya2Var.f = obj;
            }
            c = ' ';
            i8 = i3;
            i9 = (i21 >> 16) & 255;
            if (i9 == 1) {
            }
            hik0Var2 = hik0Var;
            i11 = i3;
            if (i2 != i10) {
            }
            charSequence4 = charSequence3;
            hik0Var3 = hik0Var2;
            i12 = 1;
            truncateAt = truncateAt2;
            i14 = i20;
            i13 = 4;
            a = a(i4, i5, truncateAt, i, i14, i6, i8, i11, charSequence4);
            truncateAt3 = truncateAt;
            CharSequence charSequence7222 = charSequence4;
            Layout layout2222 = a.f;
            if (Build.VERSION.SDK_INT < 35) {
            }
            i15 = 2;
            ya2Var = this;
            i16 = i;
            truncateAt4 = truncateAt3;
            int i23222 = a.g;
            if (i2 == i15) {
            }
            ya2Var.d = a;
            hik0 hik0Var5222 = hik0Var3;
            ya2Var.a.g.c(hik0Var5222.a.e(), (Float.floatToRawIntBits(ya2Var.c()) & 4294967295L) | (Float.floatToRawIntBits(ya2Var.g()) << c), hik0Var5222.a.a());
            layout = ya2Var.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            o4j0VarArr = null;
            if (o4j0VarArr != null) {
            }
            charSequence5 = ya2Var.e;
            if (charSequence5 instanceof Spanned) {
            }
            ya2Var.f = obj;
        }
        charSequence3 = charSequence2;
        i6 = i3;
        i7 = (i21 >> 8) & 255;
        if (i7 == 1) {
        }
        i8 = i3;
        i9 = (i21 >> 16) & 255;
        if (i9 == 1) {
        }
        hik0Var2 = hik0Var;
        i11 = i3;
        if (i2 != i10) {
        }
        charSequence4 = charSequence3;
        hik0Var3 = hik0Var2;
        i12 = 1;
        truncateAt = truncateAt2;
        i14 = i20;
        i13 = 4;
        a = a(i4, i5, truncateAt, i, i14, i6, i8, i11, charSequence4);
        truncateAt3 = truncateAt;
        CharSequence charSequence72222 = charSequence4;
        Layout layout22222 = a.f;
        if (Build.VERSION.SDK_INT < 35) {
        }
        i15 = 2;
        ya2Var = this;
        i16 = i;
        truncateAt4 = truncateAt3;
        int i232222 = a.g;
        if (i2 == i15) {
        }
        ya2Var.d = a;
        hik0 hik0Var52222 = hik0Var3;
        ya2Var.a.g.c(hik0Var52222.a.e(), (Float.floatToRawIntBits(ya2Var.c()) & 4294967295L) | (Float.floatToRawIntBits(ya2Var.g()) << c), hik0Var52222.a.a());
        layout = ya2Var.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        o4j0VarArr = null;
        if (o4j0VarArr != null) {
        }
        charSequence5 = ya2Var.e;
        if (charSequence5 instanceof Spanned) {
        }
        ya2Var.f = obj;
    }

    public final fjo0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        yta0 yta0Var;
        float g = g();
        bb2 bb2Var = this.a;
        fd2 fd2Var = bb2Var.g;
        int i8 = bb2Var.l;
        hoy hoyVar = bb2Var.i;
        nmo0 nmo0Var = bb2Var.b;
        za2.a aVar = za2.a;
        rua0 rua0Var = nmo0Var.c;
        return new fjo0(charSequence, g, fd2Var, i, truncateAt, i8, (rua0Var == null || (yta0Var = rua0Var.b) == null) ? false : yta0Var.a, i3, i5, i6, i7, i4, i2, hoyVar);
    }

    public final float b() {
        return this.d.d(0);
    }

    public final float c() {
        return this.d.a();
    }

    public final float d() {
        return this.d.d(r0.g - 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<xsna.zhf0>] */
    public final List<zhf0> e() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r13v26, types: [xsna.ja2] */
    public final long f(zhf0 zhf0Var, int i, hio0 hio0Var) {
        f5i0 iduVar;
        int i2;
        int[] iArr;
        SegmentFinder g;
        RectF o = zjq.o(zhf0Var);
        boolean z = i != 0 && i == 1;
        final xa2 xa2Var = new xa2(hio0Var, 0);
        fjo0 fjo0Var = this.d;
        TextPaint textPaint = fjo0Var.a;
        Layout layout = fjo0Var.f;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            if (z) {
                g = new yw2(new jge0(layout.getText(), fjo0Var.j()));
            } else {
                q81.i();
                g = n81.g(p81.g(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(o, g, new Layout.TextInclusionStrategy() { // from class: xsna.ja2
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) xa2.this.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            zny c = fjo0Var.c();
            if (z) {
                iduVar = new jge0(layout.getText(), fjo0Var.j());
            } else {
                CharSequence text = layout.getText();
                iduVar = i3 >= 29 ? new idu(text, textPaint) : new jdu(text);
            }
            f5i0 f5i0Var = iduVar;
            int lineForVertical = layout.getLineForVertical((int) o.top);
            if (o.top <= fjo0Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < fjo0Var.g) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) o.bottom);
                if (lineForVertical2 != 0 || o.bottom >= fjo0Var.g(0)) {
                    int b = ijo0.b(fjo0Var, layout, c, i4, o, f5i0Var, xa2Var, true);
                    while (true) {
                        i2 = i4;
                        if (b != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i4 = i2 + 1;
                        b = ijo0.b(fjo0Var, layout, c, i4, o, f5i0Var, xa2Var, true);
                    }
                    if (b != -1) {
                        int i5 = lineForVertical2;
                        int b2 = ijo0.b(fjo0Var, layout, c, i5, o, f5i0Var, xa2Var, false);
                        while (b2 == -1 && i2 < i5) {
                            i5--;
                            b2 = ijo0.b(fjo0Var, layout, c, i5, o, f5i0Var, xa2Var, false);
                        }
                        if (b2 != -1) {
                            iArr = new int[]{f5i0Var.d(b + 1), f5i0Var.e(b2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? qko0.b : jgz.c(iArr[0], iArr[1]);
    }

    public final float g() {
        return o6j.i(this.c);
    }

    public final void h(yq9 yq9Var) {
        Canvas canvas = e52.a;
        Canvas canvas2 = ((d52) yq9Var).a;
        fjo0 fjo0Var = this.d;
        if (fjo0Var.d) {
            canvas2.save();
            canvas2.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, g(), c());
        }
        int i = fjo0Var.h;
        if (canvas2.getClipBounds(fjo0Var.p)) {
            if (i != 0) {
                canvas2.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
            }
            ThreadLocal<qbo0> threadLocal = njo0.a;
            qbo0 qbo0Var = threadLocal.get();
            if (qbo0Var == null) {
                qbo0Var = new qbo0();
                threadLocal.set(qbo0Var);
            }
            qbo0 qbo0Var2 = qbo0Var;
            qbo0Var2.a = canvas2;
            try {
                fjo0Var.f.draw(qbo0Var2);
                if (i != 0) {
                    canvas2.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-1) * i);
                }
            } finally {
                qbo0Var2.a = null;
            }
        }
        if (fjo0Var.d) {
            canvas2.restore();
        }
    }

    public final void i(yq9 yq9Var, long j, v4j0 v4j0Var, pdo0 pdo0Var, qio qioVar) {
        fd2 fd2Var = this.a.g;
        int i = fd2Var.c;
        fd2Var.d(j);
        fd2Var.f(v4j0Var);
        fd2Var.g(pdo0Var);
        fd2Var.e(qioVar);
        fd2Var.b(3);
        h(yq9Var);
        fd2Var.b(i);
    }

    public final void j(yq9 yq9Var, yk8 yk8Var, float f, v4j0 v4j0Var, pdo0 pdo0Var, qio qioVar) {
        fd2 fd2Var = this.a.g;
        int i = fd2Var.c;
        float g = g();
        float c = c();
        fd2Var.c(yk8Var, (Float.floatToRawIntBits(c) & 4294967295L) | (Float.floatToRawIntBits(g) << 32), f);
        fd2Var.f(v4j0Var);
        fd2Var.g(pdo0Var);
        fd2Var.e(qioVar);
        fd2Var.b(3);
        h(yq9Var);
        fd2Var.b(i);
    }
}
