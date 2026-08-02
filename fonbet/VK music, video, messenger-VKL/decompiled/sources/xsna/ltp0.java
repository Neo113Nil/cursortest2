package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import xsna.a1n0;
import xsna.rkk;

/* compiled from: Tx3gParser.java */
/* loaded from: classes12.dex */
public final class ltp0 implements a1n0 {
    public final xi90 a = new xi90();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public ltp0(List<byte[]> list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = C.SANS_SERIF_NAME;
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        String str2 = y2r0.a;
        this.e = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = y2r0.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    dr.a(3, spannableStringBuilder, i3, i4, i6);
                } else {
                    dr.a(1, spannableStringBuilder, i3, i4, i6);
                }
            } else if (z2) {
                dr.a(2, spannableStringBuilder, i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            dr.a(0, spannableStringBuilder, i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a1n0
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        String A;
        int i3;
        xi90 xi90Var = this.a;
        xi90Var.N(bArr, i + i2);
        xi90Var.P(i);
        int i4 = 1;
        int i5 = 0;
        fxc0.p(xi90Var.a() >= 2);
        int J = xi90Var.J();
        if (J == 0) {
            A = "";
        } else {
            int i6 = xi90Var.b;
            Charset L = xi90Var.L();
            int i7 = J - (xi90Var.b - i6);
            if (L == null) {
                L = StandardCharsets.UTF_8;
            }
            A = xi90Var.A(i7, L);
        }
        if (A.isEmpty()) {
            ImmutableList.b bVar2 = ImmutableList.c;
            j7jVar.accept(new wkk(com.google.common.collect.g.f, C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A);
        e(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (xi90Var.a() >= 8) {
            int i8 = xi90Var.b;
            int p = xi90Var.p();
            int p2 = xi90Var.p();
            if (p2 == 1937013100) {
                fxc0.p(xi90Var.a() >= 2 ? i4 : i5);
                int J2 = xi90Var.J();
                int i9 = i5;
                while (i9 < J2) {
                    fxc0.p(xi90Var.a() >= 12 ? i4 : i5);
                    int J3 = xi90Var.J();
                    int J4 = xi90Var.J();
                    xi90Var.Q(2);
                    int i10 = i9;
                    int C = xi90Var.C();
                    xi90Var.Q(i4);
                    int p3 = xi90Var.p();
                    if (J4 > spannableStringBuilder.length()) {
                        StringBuilder b = ji.b(J4, "Truncating styl end (", ") to cueText.length() (");
                        b.append(spannableStringBuilder.length());
                        b.append(").");
                        ahn.F(b.toString());
                        J4 = spannableStringBuilder.length();
                    }
                    if (J3 >= J4) {
                        ahn.F("Ignoring styl with start (" + J3 + ") >= end (" + J4 + ").");
                        i3 = i10;
                    } else {
                        i3 = i10;
                        int i11 = J4;
                        e(spannableStringBuilder, C, this.c, J3, i11, 0);
                        d(spannableStringBuilder, p3, this.d, J3, i11, 0);
                    }
                    i9 = i3 + 1;
                    i4 = 1;
                    i5 = 0;
                }
            } else if (p2 == 1952608120 && this.b) {
                fxc0.p(xi90Var.a() >= 2);
                f = y2r0.i(xi90Var.J() / this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
            }
            xi90Var.P(i8 + p);
            i4 = 1;
            i5 = 0;
        }
        rkk.a aVar = new rkk.a();
        aVar.a = spannableStringBuilder;
        aVar.b = null;
        aVar.e = f;
        aVar.f = 0;
        aVar.g = 0;
        j7jVar.accept(new wkk(ImmutableList.p(aVar.a()), C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // xsna.a1n0
    public final int b() {
        return 2;
    }
}
