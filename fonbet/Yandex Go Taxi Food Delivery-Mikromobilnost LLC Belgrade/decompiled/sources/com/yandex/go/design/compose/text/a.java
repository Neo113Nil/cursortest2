package com.yandex.go.design.compose.text;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bmt0;
import defpackage.buj0;
import defpackage.dui0;
import defpackage.eja1;
import defpackage.ety0;
import defpackage.eyr;
import defpackage.fwi;
import defpackage.gc90;
import defpackage.hzr;
import defpackage.iyr;
import defpackage.ldc;
import defpackage.oz40;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.qgy;
import defpackage.rzo;
import defpackage.sjy0;
import defpackage.sty0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.up11;
import defpackage.wuj0;
import defpackage.xfc;
import defpackage.yxr;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class a implements dui0 {
    public eyr B;
    public long D;
    public long E;
    public long F;
    public int G;
    public RobotoTextView H;
    public final oz40 I;
    public pzt0 J;
    public tls K;
    public final boolean a;
    public final LayoutDirection b;
    public final tse c;
    public final pey w;
    public CharSequence x;
    public int y = -1;
    public int z = -1;
    public long A = ldc.m;
    public int C = 0;

    public a(boolean z, LayoutDirection layoutDirection, tse tseVar, pey peyVar) {
        this.a = z;
        this.b = layoutDirection;
        this.c = tseVar;
        this.w = peyVar;
        long j = sty0.c;
        this.D = j;
        this.E = j;
        this.F = j;
        this.G = 0;
        this.I = f.j(null);
    }

    public final URLSpan a(long j) {
        RobotoTextView robotoTextView = this.H;
        if (robotoTextView == null) {
            return null;
        }
        CharSequence charSequence = this.x;
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null) {
            return null;
        }
        int intBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        int totalPaddingLeft = intBitsToFloat - robotoTextView.getTotalPaddingLeft();
        int totalPaddingTop = intBitsToFloat2 - robotoTextView.getTotalPaddingTop();
        int scrollX = robotoTextView.getScrollX() + totalPaddingLeft;
        int scrollY = robotoTextView.getScrollY() + totalPaddingTop;
        Layout layout = robotoTextView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        for (ClickableSpan clickableSpan : (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) {
            if (clickableSpan instanceof URLSpan) {
                return (URLSpan) clickableSpan;
            }
        }
        return null;
    }

    @Override // defpackage.dui0
    public final void b() {
        if (this.J == null) {
            tse tseVar = this.c;
            this.J = tseVar != null ? tje.N(tseVar, null, null, new AdapterTextViewHolder$onRemembered$1(this, null), 3) : null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x018b, code lost:
    
        if (r0 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018d, code lost:
    
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0193, code lost:
    
        if (r0 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(RobotoTextView robotoTextView, fwi fwiVar, CharSequence charSequence, long j, xfc xfcVar, long j2, long j3, sjy0 sjy0Var, long j4, int i, int i2, int i3, ety0 ety0Var, tls tlsVar) {
        Typeface typeface;
        int i4;
        yxr yxrVar;
        int i5;
        this.K = tlsVar;
        this.H = robotoTextView;
        this.I.setValue(xfcVar);
        if (this.x != charSequence) {
            this.x = charSequence;
            robotoTextView.setText(charSequence);
        }
        if (this.y != i3) {
            this.y = i3;
            robotoTextView.setMinLines(i3);
        }
        if (this.z != i2) {
            this.z = i2;
            robotoTextView.setMaxLines(i2);
        }
        if (!ldc.c(this.A, j)) {
            this.A = j;
            robotoTextView.setTextColor(rzo.X(j));
            robotoTextView.setTextLinkColor(rzo.X(j));
        }
        bmt0 bmt0Var = ety0Var.a;
        hzr hzrVar = bmt0Var.d;
        int i6 = hzrVar != null ? hzrVar.a : 0;
        eyr eyrVar = this.B;
        gc90 gc90Var = ety0Var.b;
        eyr eyrVar2 = bmt0Var.f;
        if (eyrVar == eyrVar2 && this.C == i6) {
            i4 = 1;
        } else {
            this.B = eyrVar2;
            this.C = i6;
            Context context = robotoTextView.getContext();
            eyr eyrVar3 = bmt0Var.f;
            if (eyrVar3 != null) {
                ConcurrentHashMap concurrentHashMap = qgy.a;
                Typeface typeface2 = (Typeface) concurrentHashMap.get(eyrVar3);
                if (typeface2 != null) {
                    typeface = typeface2;
                } else if ((eyrVar3 instanceof iyr) && (yxrVar = (yxr) kotlin.collections.a.R(((iyr) eyrVar3).y)) != null && (yxrVar instanceof buj0)) {
                    typeface = wuj0.b(((buj0) yxrVar).a, context);
                    if (typeface == null) {
                        int[] iArr = up11.a;
                        typeface = eja1.w(0, 0);
                    }
                    concurrentHashMap.put(eyrVar3, typeface);
                }
                i4 = 1;
                robotoTextView.setTypeface(typeface, i6 != 1 ? 2 : 0);
            }
            typeface = null;
            i4 = 1;
            robotoTextView.setTypeface(typeface, i6 != 1 ? 2 : 0);
        }
        robotoTextView.setFontFeatureSettings(bmt0Var.g);
        int i7 = 5;
        robotoTextView.setEllipsize(i == 5 ? TextUtils.TruncateAt.MIDDLE : i == i4 ? null : TextUtils.TruncateAt.END);
        long j5 = (j3 & 1095216660480L) == 0 ? bmt0Var.h : j3;
        if (!sty0.a(this.D, j5)) {
            this.D = j5;
            robotoTextView.setLetterSpacing(((j5 & 1095216660480L) != 0 && sty0.d(j5)) ? sty0.c(j5) : 0.0f);
        }
        long j6 = (j2 & 1095216660480L) == 0 ? bmt0Var.b : j2;
        long j7 = (j4 & 1095216660480L) == 0 ? gc90Var.c : j4;
        boolean a = sty0.a(this.F, j6);
        boolean a2 = sty0.a(this.E, j7);
        if (!a || !a2) {
            if (!a) {
                this.F = j6;
                if ((j6 & 1095216660480L) != 0) {
                    robotoTextView.setTextSize(0, fwiVar.i0(j6));
                }
            }
            this.E = j4;
            if ((j7 & 1095216660480L) != 0) {
                Paint.FontMetricsInt fontMetricsInt = robotoTextView.getPaint().getFontMetricsInt();
                robotoTextView.setLineSpacing(fwiVar.i0(j7) - (fontMetricsInt.descent - fontMetricsInt.ascent), 1.0f);
            }
        }
        int i8 = sjy0Var != null ? sjy0Var.a : gc90Var.a;
        if (this.G == i8) {
            return;
        }
        this.G = i8;
        if (i8 != 5) {
            if (i8 == 6) {
                i5 = 3;
            } else if (i8 == 3) {
                i5 = 4;
            }
            robotoTextView.setTextAlignment(i5);
            if (this.a) {
                return;
            }
            LayoutDirection layoutDirection = this.b;
            if (i8 != 5) {
                if (i8 != 6) {
                    i7 = i8 == 3 ? 17 : 8388611;
                }
                robotoTextView.setGravity(i7);
                return;
            }
        }
        i5 = 2;
        robotoTextView.setTextAlignment(i5);
        if (this.a) {
        }
    }

    @Override // defpackage.dui0
    public final void d() {
    }

    @Override // defpackage.dui0
    public final void e() {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
    }
}
