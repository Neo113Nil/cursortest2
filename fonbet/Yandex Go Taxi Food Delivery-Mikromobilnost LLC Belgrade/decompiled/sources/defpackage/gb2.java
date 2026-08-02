package defpackage;

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
import androidx.compose.ui.text.android.TextAndroidCanvas;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import com.yandex.div.internal.widget.EllipsizedTextView;
import defpackage.l8q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class gb2 {
    public final ib2 a;
    public final int b;
    public final long c;
    public final zqy0 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gb2(ib2 ib2Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        bmt0 bmt0Var;
        int i10;
        int i11;
        int i12;
        char c;
        bmt0 bmt0Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        zqy0 a;
        int i13;
        int i14;
        gb2 gb2Var;
        int i15;
        int i16;
        int i17;
        Layout layout;
        ShaderBrushSpan[] shaderBrushSpanArr;
        CharSequence charSequence;
        List list;
        zii0 zii0Var;
        float i18;
        int widthPx;
        float h;
        int widthPx2;
        float d;
        int heightPx;
        float g;
        float f;
        float d2;
        int i19;
        int i20;
        this.a = ib2Var;
        this.b = i;
        this.c = j;
        if (n8e.j(j) != 0 || n8e.k(j) != 0) {
            jxv.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            jxv.a("maxLines should be greater than 0");
        }
        ety0 ety0Var = ib2Var.b;
        CharSequence charSequence2 = ib2Var.A;
        if (i2 == 2) {
            i3 = 0;
            if (!sty0.a(ety0Var.a.h, uh6.E(0)) && !sty0.a(ety0Var.a.h, sty0.c) && (i20 = ety0Var.b.a) != 0 && i20 != 5 && i20 != 4 && charSequence2.length() != 0) {
                Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!zeb1.b(spannable, IndentationFixSpan.class)) {
                    spannable.setSpan(new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        gc90 gc90Var = ety0Var.b;
        bmt0 bmt0Var3 = ety0Var.a;
        int i21 = gc90Var.a;
        int i22 = 3;
        int i23 = i21 == 1 ? 3 : i21 == 2 ? 4 : i21 == 3 ? 2 : (i21 != 5 && i21 == 6) ? 1 : i3;
        int i24 = i21 == 4 ? 1 : i3;
        int i25 = gc90Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i26 = gc90Var.g;
        int i27 = i26 & 255;
        if (i27 != 1) {
            if (i27 == 2) {
                i4 = i26;
                i5 = i24;
                i6 = 1;
            } else if (i27 == 3) {
                i4 = i26;
                i5 = i24;
                i6 = 2;
            }
            i7 = (i4 >> 8) & 255;
            if (i7 != 1) {
                if (i7 == 2) {
                    i22 = 1;
                } else if (i7 == 3) {
                    i22 = 2;
                } else if (i7 == 4) {
                }
                i8 = (i4 >> 16) & 255;
                if (i8 == 1) {
                    i9 = 2;
                } else {
                    i9 = 2;
                    if (i8 == 2) {
                        bmt0Var = bmt0Var3;
                        i10 = i23;
                        i11 = 1;
                        if (i2 != i9) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i2 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i2 != 4) {
                                i12 = i25;
                                c = HexString.CHAR_SPACE;
                                bmt0Var2 = bmt0Var;
                                truncateAt = null;
                                a = a(i10, i5, truncateAt, i, i12, i6, i22, i11, charSequence3);
                                Layout layout2 = a.f;
                                i13 = i10;
                                if (Build.VERSION.SDK_INT < 35 || ib2Var.z.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    i14 = 2;
                                    gb2Var = this;
                                    i15 = i;
                                    i16 = i13;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i14 = 2;
                                    CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), EllipsizedTextView.DEFAULT_ELLIPSIS, charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                    gb2Var = this;
                                    i15 = i;
                                    i16 = i13;
                                    a = gb2Var.a(i16, i5, truncateAt, i15, i12, i6, i22, i11, TextUtils.concat(charSequenceArr));
                                }
                                i17 = a.g;
                                if (i2 != i14 && a.a() > n8e.h(j) && i15 > 1) {
                                    int h2 = n8e.h(j);
                                    i19 = 0;
                                    while (true) {
                                        if (i19 < i17) {
                                            i19 = i17;
                                            break;
                                        } else if (a.e(i19) > h2) {
                                            break;
                                        } else {
                                            i19++;
                                        }
                                    }
                                    if (i19 >= 0 && i19 != gb2Var.b) {
                                        a = gb2Var.a(i16, i5, truncateAt, i19 >= 1 ? 1 : i19, i12, i6, i22, i11, gb2Var.e);
                                    }
                                    gb2Var.d = a;
                                    gb2Var.a.z.m91setBrush12SF9DM(bmt0Var2.a.c(), (Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c), bmt0Var2.a.a());
                                    layout = gb2Var.d.f;
                                    if (layout.getText() instanceof Spanned) {
                                        Spanned spanned = (Spanned) layout.getText();
                                        if (spanned.nextSpanTransition(-1, spanned.length(), ShaderBrushSpan.class) != spanned.length()) {
                                            shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), ShaderBrushSpan.class);
                                            if (shaderBrushSpanArr != null) {
                                                for (ShaderBrushSpan shaderBrushSpan : shaderBrushSpanArr) {
                                                    shaderBrushSpan.m95setSizeuvyYCjk((Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c));
                                                }
                                            }
                                            charSequence = gb2Var.e;
                                            if (charSequence instanceof Spanned) {
                                                list = EmptyList.a;
                                            } else {
                                                Spanned spanned2 = (Spanned) charSequence;
                                                Object[] spans = spanned2.getSpans(0, charSequence.length(), PlaceholderSpan.class);
                                                ArrayList arrayList = new ArrayList(spans.length);
                                                for (Object obj : spans) {
                                                    PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                                                    int spanStart = spanned2.getSpanStart(placeholderSpan);
                                                    int spanEnd = spanned2.getSpanEnd(placeholderSpan);
                                                    int lineForOffset = gb2Var.d.f.getLineForOffset(spanStart);
                                                    boolean z = lineForOffset >= gb2Var.b;
                                                    boolean z2 = gb2Var.d.f.getEllipsisCount(lineForOffset) > 0 && spanEnd > gb2Var.d.f.getEllipsisStart(lineForOffset) + gb2Var.d.f.getLineStart(lineForOffset);
                                                    boolean z3 = spanEnd > gb2Var.d.f(lineForOffset);
                                                    if (z2 || z3 || z) {
                                                        zii0Var = null;
                                                    } else {
                                                        boolean z4 = gb2Var.d.f.getParagraphDirection(lineForOffset) == 1;
                                                        boolean isRtlCharAt = gb2Var.d.f.isRtlCharAt(spanStart);
                                                        if (!z4 || isRtlCharAt) {
                                                            if (z4 && isRtlCharAt) {
                                                                h = gb2Var.d.i(spanStart, false);
                                                                widthPx2 = placeholderSpan.getWidthPx();
                                                            } else {
                                                                zqy0 zqy0Var = gb2Var.d;
                                                                if (isRtlCharAt) {
                                                                    h = zqy0Var.h(spanStart, false);
                                                                    widthPx2 = placeholderSpan.getWidthPx();
                                                                } else {
                                                                    i18 = zqy0Var.i(spanStart, false);
                                                                    widthPx = placeholderSpan.getWidthPx();
                                                                }
                                                            }
                                                            i18 = h - widthPx2;
                                                            zqy0 zqy0Var2 = gb2Var.d;
                                                            switch (placeholderSpan.getVerticalAlign()) {
                                                                case 0:
                                                                    d = zqy0Var2.d(lineForOffset);
                                                                    heightPx = placeholderSpan.getHeightPx();
                                                                    g = d - heightPx;
                                                                    zii0Var = new zii0(i18, g, h, placeholderSpan.getHeightPx() + g);
                                                                    break;
                                                                case 1:
                                                                    g = zqy0Var2.g(lineForOffset);
                                                                    zii0Var = new zii0(i18, g, h, placeholderSpan.getHeightPx() + g);
                                                                    break;
                                                                case 2:
                                                                    d = zqy0Var2.e(lineForOffset);
                                                                    heightPx = placeholderSpan.getHeightPx();
                                                                    g = d - heightPx;
                                                                    zii0Var = new zii0(i18, g, h, placeholderSpan.getHeightPx() + g);
                                                                    break;
                                                                case 3:
                                                                    g = ((zqy0Var2.e(lineForOffset) + zqy0Var2.g(lineForOffset)) - placeholderSpan.getHeightPx()) / 2.0f;
                                                                    zii0Var = new zii0(i18, g, h, placeholderSpan.getHeightPx() + g);
                                                                    break;
                                                                case 4:
                                                                    f = placeholderSpan.getFontMetrics().ascent;
                                                                    d2 = zqy0Var2.d(lineForOffset);
                                                                    g = d2 + f;
                                                                    zii0Var = new zii0(i18, g, h, placeholderSpan.getHeightPx() + g);
                                                                    break;
                                                                case 5:
                                                                    d = zqy0Var2.d(lineForOffset) + placeholderSpan.getFontMetrics().descent;
                                                                    heightPx = placeholderSpan.getHeightPx();
                                                                    g = d - heightPx;
                                                                    zii0Var = new zii0(i18, g, h, placeholderSpan.getHeightPx() + g);
                                                                    break;
                                                                case 6:
                                                                    Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                                                    f = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                                                    d2 = zqy0Var2.d(lineForOffset);
                                                                    g = d2 + f;
                                                                    zii0Var = new zii0(i18, g, h, placeholderSpan.getHeightPx() + g);
                                                                    break;
                                                                default:
                                                                    ny61.r("unexpected verticalAlignment");
                                                                    throw null;
                                                            }
                                                        } else {
                                                            i18 = gb2Var.d.h(spanStart, false);
                                                            widthPx = placeholderSpan.getWidthPx();
                                                        }
                                                        h = widthPx + i18;
                                                        zqy0 zqy0Var22 = gb2Var.d;
                                                        switch (placeholderSpan.getVerticalAlign()) {
                                                        }
                                                    }
                                                    arrayList.add(zii0Var);
                                                }
                                                list = arrayList;
                                            }
                                            gb2Var.f = list;
                                        }
                                    }
                                    shaderBrushSpanArr = null;
                                    if (shaderBrushSpanArr != null) {
                                    }
                                    charSequence = gb2Var.e;
                                    if (charSequence instanceof Spanned) {
                                    }
                                    gb2Var.f = list;
                                }
                                gb2Var.d = a;
                                gb2Var.a.z.m91setBrush12SF9DM(bmt0Var2.a.c(), (Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c), bmt0Var2.a.a());
                                layout = gb2Var.d.f;
                                if (layout.getText() instanceof Spanned) {
                                }
                                shaderBrushSpanArr = null;
                                if (shaderBrushSpanArr != null) {
                                }
                                charSequence = gb2Var.e;
                                if (charSequence instanceof Spanned) {
                                }
                                gb2Var.f = list;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i12 = i25;
                        c = HexString.CHAR_SPACE;
                        bmt0Var2 = bmt0Var;
                        truncateAt = truncateAt2;
                        a = a(i10, i5, truncateAt, i, i12, i6, i22, i11, charSequence3);
                        Layout layout22 = a.f;
                        i13 = i10;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        i14 = 2;
                        gb2Var = this;
                        i15 = i;
                        i16 = i13;
                        i17 = a.g;
                        if (i2 != i14) {
                            int h22 = n8e.h(j);
                            i19 = 0;
                            while (true) {
                                if (i19 < i17) {
                                }
                                i19++;
                            }
                            if (i19 >= 0) {
                                a = gb2Var.a(i16, i5, truncateAt, i19 >= 1 ? 1 : i19, i12, i6, i22, i11, gb2Var.e);
                            }
                            gb2Var.d = a;
                            gb2Var.a.z.m91setBrush12SF9DM(bmt0Var2.a.c(), (Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c), bmt0Var2.a.a());
                            layout = gb2Var.d.f;
                            if (layout.getText() instanceof Spanned) {
                            }
                            shaderBrushSpanArr = null;
                            if (shaderBrushSpanArr != null) {
                            }
                            charSequence = gb2Var.e;
                            if (charSequence instanceof Spanned) {
                            }
                            gb2Var.f = list;
                        }
                        gb2Var.d = a;
                        gb2Var.a.z.m91setBrush12SF9DM(bmt0Var2.a.c(), (Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c), bmt0Var2.a.a());
                        layout = gb2Var.d.f;
                        if (layout.getText() instanceof Spanned) {
                        }
                        shaderBrushSpanArr = null;
                        if (shaderBrushSpanArr != null) {
                        }
                        charSequence = gb2Var.e;
                        if (charSequence instanceof Spanned) {
                        }
                        gb2Var.f = list;
                    }
                }
                bmt0Var = bmt0Var3;
                i10 = i23;
                i11 = i3;
                if (i2 != i9) {
                }
                i12 = i25;
                c = HexString.CHAR_SPACE;
                bmt0Var2 = bmt0Var;
                truncateAt = truncateAt2;
                a = a(i10, i5, truncateAt, i, i12, i6, i22, i11, charSequence3);
                Layout layout222 = a.f;
                i13 = i10;
                if (Build.VERSION.SDK_INT < 35) {
                }
                i14 = 2;
                gb2Var = this;
                i15 = i;
                i16 = i13;
                i17 = a.g;
                if (i2 != i14) {
                }
                gb2Var.d = a;
                gb2Var.a.z.m91setBrush12SF9DM(bmt0Var2.a.c(), (Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c), bmt0Var2.a.a());
                layout = gb2Var.d.f;
                if (layout.getText() instanceof Spanned) {
                }
                shaderBrushSpanArr = null;
                if (shaderBrushSpanArr != null) {
                }
                charSequence = gb2Var.e;
                if (charSequence instanceof Spanned) {
                }
                gb2Var.f = list;
            }
            i22 = i3;
            i8 = (i4 >> 16) & 255;
            if (i8 == 1) {
            }
            bmt0Var = bmt0Var3;
            i10 = i23;
            i11 = i3;
            if (i2 != i9) {
            }
            i12 = i25;
            c = HexString.CHAR_SPACE;
            bmt0Var2 = bmt0Var;
            truncateAt = truncateAt2;
            a = a(i10, i5, truncateAt, i, i12, i6, i22, i11, charSequence3);
            Layout layout2222 = a.f;
            i13 = i10;
            if (Build.VERSION.SDK_INT < 35) {
            }
            i14 = 2;
            gb2Var = this;
            i15 = i;
            i16 = i13;
            i17 = a.g;
            if (i2 != i14) {
            }
            gb2Var.d = a;
            gb2Var.a.z.m91setBrush12SF9DM(bmt0Var2.a.c(), (Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c), bmt0Var2.a.a());
            layout = gb2Var.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            shaderBrushSpanArr = null;
            if (shaderBrushSpanArr != null) {
            }
            charSequence = gb2Var.e;
            if (charSequence instanceof Spanned) {
            }
            gb2Var.f = list;
        }
        i4 = i26;
        i5 = i24;
        i6 = i3;
        i7 = (i4 >> 8) & 255;
        if (i7 != 1) {
        }
        i22 = i3;
        i8 = (i4 >> 16) & 255;
        if (i8 == 1) {
        }
        bmt0Var = bmt0Var3;
        i10 = i23;
        i11 = i3;
        if (i2 != i9) {
        }
        i12 = i25;
        c = HexString.CHAR_SPACE;
        bmt0Var2 = bmt0Var;
        truncateAt = truncateAt2;
        a = a(i10, i5, truncateAt, i, i12, i6, i22, i11, charSequence3);
        Layout layout22222 = a.f;
        i13 = i10;
        if (Build.VERSION.SDK_INT < 35) {
        }
        i14 = 2;
        gb2Var = this;
        i15 = i;
        i16 = i13;
        i17 = a.g;
        if (i2 != i14) {
        }
        gb2Var.d = a;
        gb2Var.a.z.m91setBrush12SF9DM(bmt0Var2.a.c(), (Float.floatToRawIntBits(gb2Var.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(gb2Var.d()) << c), bmt0Var2.a.a());
        layout = gb2Var.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        shaderBrushSpanArr = null;
        if (shaderBrushSpanArr != null) {
        }
        charSequence = gb2Var.e;
        if (charSequence instanceof Spanned) {
        }
        gb2Var.f = list;
    }

    public final zqy0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        tvc0 tvc0Var;
        float d = d();
        ib2 ib2Var = this.a;
        AndroidTextPaint androidTextPaint = ib2Var.z;
        int i8 = ib2Var.E;
        o0y o0yVar = ib2Var.B;
        ety0 ety0Var = ib2Var.b;
        AndroidParagraphHelper_androidKt$NoopSpan$1 androidParagraphHelper_androidKt$NoopSpan$1 = hb2.a;
        iwc0 iwc0Var = ety0Var.c;
        return new zqy0(charSequence, d, androidTextPaint, i, truncateAt, i8, (iwc0Var == null || (tvc0Var = iwc0Var.b) == null) ? false : tvc0Var.a, i3, i5, i6, i7, i4, i2, o0yVar);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Type inference failed for: r10v23, types: [da2] */
    public final long c(zii0 zii0Var, int i, s2u0 s2u0Var) {
        int i2;
        int[] iArr;
        SegmentFinder p;
        RectF f = fia1.f(zii0Var);
        boolean z = i != 0 && i == 1;
        final tn1 tn1Var = new tn1(14, s2u0Var);
        zqy0 zqy0Var = this.d;
        TextPaint textPaint = zqy0Var.a;
        Layout layout = zqy0Var.f;
        int i3 = 2;
        if (Build.VERSION.SDK_INT >= 34) {
            if (z) {
                final rr41 rr41Var = new rr41(i3, layout.getText(), zqy0Var.j());
                p = new SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
                    public int nextEndBoundary(int offset) {
                        return l8q0.this.g(offset);
                    }

                    public int nextStartBoundary(int offset) {
                        return l8q0.this.e(offset);
                    }

                    public int previousEndBoundary(int offset) {
                        return l8q0.this.c(offset);
                    }

                    public int previousStartBoundary(int offset) {
                        return l8q0.this.f(offset);
                    }
                };
            } else {
                kd1.u();
                p = kd1.p(kd1.o(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(f, p, new Layout.TextInclusionStrategy() { // from class: da2
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) tn1.this.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            q4g c = zqy0Var.c();
            l8q0 rr41Var2 = z ? new rr41(i3, layout.getText(), zqy0Var.j()) : new f0u(layout.getText(), textPaint);
            int lineForVertical = layout.getLineForVertical((int) f.top);
            if (f.top <= zqy0Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < zqy0Var.g) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) f.bottom);
                if (lineForVertical2 != 0 || f.bottom >= zqy0Var.g(0)) {
                    int d = hnb1.d(zqy0Var, layout, c, i4, f, rr41Var2, tn1Var, true);
                    while (true) {
                        i2 = i4;
                        if (d != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i4 = i2 + 1;
                        d = hnb1.d(zqy0Var, layout, c, i4, f, rr41Var2, tn1Var, true);
                    }
                    if (d != -1) {
                        int i5 = lineForVertical2;
                        int d2 = hnb1.d(zqy0Var, layout, c, i5, f, rr41Var2, tn1Var, false);
                        while (d2 == -1 && i2 < i5) {
                            i5--;
                            d2 = hnb1.d(zqy0Var, layout, c, i5, f, rr41Var2, tn1Var, false);
                        }
                        if (d2 != -1) {
                            iArr = new int[]{rr41Var2.f(d + 1), rr41Var2.g(d2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? asy0.b : eja1.c(iArr[0], iArr[1]);
    }

    public final float d() {
        return n8e.i(this.c);
    }

    public final void e(i28 i28Var) {
        Canvas canvas = t72.a;
        Canvas canvas2 = ((s72) i28Var).a;
        zqy0 zqy0Var = this.d;
        if (zqy0Var.d) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = zqy0Var.h;
        if (canvas2.getClipBounds(zqy0Var.p)) {
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            ThreadLocal threadLocal = fry0.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new TextAndroidCanvas();
                threadLocal.set(obj);
            }
            TextAndroidCanvas textAndroidCanvas = (TextAndroidCanvas) obj;
            textAndroidCanvas.set_nativeCanvas$ui_text(canvas2);
            try {
                zqy0Var.f.draw(textAndroidCanvas);
                if (i != 0) {
                    canvas2.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                textAndroidCanvas.set_nativeCanvas$ui_text(null);
            }
        }
        if (zqy0Var.d) {
            canvas2.restore();
        }
    }

    public final void f(i28 i28Var, long j, bgr0 bgr0Var, rly0 rly0Var, ram ramVar) {
        AndroidTextPaint androidTextPaint = this.a.z;
        int backingBlendMode = androidTextPaint.getBackingBlendMode();
        androidTextPaint.m93setColor8_81llA(j);
        androidTextPaint.setShadow(bgr0Var);
        androidTextPaint.setTextDecoration(rly0Var);
        androidTextPaint.setDrawStyle(ramVar);
        androidTextPaint.m90setBlendModes9anfk8(3);
        e(i28Var);
        androidTextPaint.m90setBlendModes9anfk8(backingBlendMode);
    }

    public final void g(i28 i28Var, ml6 ml6Var, float f, bgr0 bgr0Var, rly0 rly0Var, ram ramVar) {
        AndroidTextPaint androidTextPaint = this.a.z;
        int backingBlendMode = androidTextPaint.getBackingBlendMode();
        float d = d();
        float b = b();
        androidTextPaint.m91setBrush12SF9DM(ml6Var, (Float.floatToRawIntBits(b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(d) << 32), f);
        androidTextPaint.setShadow(bgr0Var);
        androidTextPaint.setTextDecoration(rly0Var);
        androidTextPaint.setDrawStyle(ramVar);
        androidTextPaint.m90setBlendModes9anfk8(3);
        e(i28Var);
        androidTextPaint.m90setBlendModes9anfk8(backingBlendMode);
    }
}
