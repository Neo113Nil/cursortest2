package xsna;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LineHeightStyleSpan.android.kt */
/* loaded from: classes11.dex */
public final class u7z implements LineHeightSpan {
    public final float b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final int g;
    public int h = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;
    public int k = Integer.MIN_VALUE;
    public int l;
    public int m;

    public u7z(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.b = f;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = f2;
        this.g = i2;
        if ((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f2 || f2 > 1.0f) && f2 != -1.0f) {
            vzw.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.c;
        int i7 = this.g;
        boolean z3 = this.e;
        boolean z4 = this.d;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.h == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.b);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.f;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.j = i11;
                int i12 = i11 - ceil;
                this.i = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.h = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.k = i11;
                    this.l = fontMetricsInt.ascent - i12;
                    this.m = i11 - i10;
                } else if (i7 == 2) {
                    this.h = z4 ? Math.max(fontMetricsInt.ascent, i12) : Math.min(fontMetricsInt.ascent, i12);
                    this.k = z3 ? Math.min(fontMetricsInt.descent, this.j) : Math.max(fontMetricsInt.descent, this.j);
                    this.l = 0;
                    this.m = 0;
                }
            } else {
                int i13 = fontMetricsInt.ascent;
                this.i = i13;
                int i14 = fontMetricsInt.descent;
                this.j = i14;
                this.h = i13;
                this.k = i14;
                this.l = 0;
                this.m = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.h : this.i;
        fontMetricsInt.descent = z2 ? this.k : this.j;
    }
}
