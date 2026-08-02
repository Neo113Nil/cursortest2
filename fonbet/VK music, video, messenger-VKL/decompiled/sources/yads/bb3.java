package yads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.dr;
import xsna.sl9;

/* loaded from: classes10.dex */
public final class bb3 extends j03 {
    public final kc2 m = new kc2();
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public bb3(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.o = 0;
            this.p = -1;
            this.q = C.SANS_SERIF_NAME;
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.o = bArr[24];
        this.p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.q = "Serif".equals(mc3.a(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.s = i;
        boolean z = (bArr[0] & 32) != 0;
        this.n = z;
        if (z) {
            this.r = mc3.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i);
        } else {
            this.r = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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

    @Override // yads.j03
    public final v53 a(byte[] bArr, int i, boolean z) {
        String a;
        kc2 kc2Var = this.m;
        kc2Var.a = bArr;
        kc2Var.c = i;
        int i2 = 0;
        kc2Var.b = 0;
        int i3 = 2;
        if (i >= 2) {
            int r = kc2Var.r();
            int i4 = 8;
            if (r == 0) {
                a = "";
            } else {
                int i5 = kc2Var.c;
                int i6 = kc2Var.b;
                if (i5 - i6 >= 2) {
                    byte[] bArr2 = kc2Var.a;
                    char c = (char) ((bArr2[i6 + 1] & 255) | ((bArr2[i6] & 255) << 8));
                    if (c == 65279 || c == 65534) {
                        a = kc2Var.a(r, bu.e);
                    }
                }
                a = kc2Var.a(r, bu.c);
            }
            if (a.isEmpty()) {
                return cb3.c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            a(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i7 = this.p;
            int length = spannableStringBuilder.length();
            if (i7 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), 0, length, 16711713);
            }
            String str = this.q;
            int length2 = spannableStringBuilder.length();
            if (str != C.SANS_SERIF_NAME) {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f = this.r;
            while (true) {
                kc2 kc2Var2 = this.m;
                int i8 = kc2Var2.c;
                int i9 = kc2Var2.b;
                if (i8 - i9 >= i4) {
                    int b = kc2Var2.b();
                    int b2 = this.m.b();
                    if (b2 == 1937013100) {
                        kc2 kc2Var3 = this.m;
                        if (kc2Var3.c - kc2Var3.b >= i3) {
                            int r2 = kc2Var3.r();
                            int i10 = i2;
                            while (i10 < r2) {
                                kc2 kc2Var4 = this.m;
                                if (kc2Var4.c - kc2Var4.b >= 12) {
                                    int r3 = kc2Var4.r();
                                    int r4 = kc2Var4.r();
                                    kc2Var4.e(kc2Var4.b + i3);
                                    int m = kc2Var4.m();
                                    kc2Var4.e(kc2Var4.b + 1);
                                    int b3 = kc2Var4.b();
                                    if (r4 > spannableStringBuilder.length()) {
                                        StringBuilder b4 = xsna.ji.b(r4, "Truncating styl end (", ") to cueText.length() (");
                                        b4.append(spannableStringBuilder.length());
                                        b4.append(").");
                                        ji1.d("Tx3gDecoder", b4.toString());
                                        r4 = spannableStringBuilder.length();
                                    }
                                    if (r3 >= r4) {
                                        ji1.d("Tx3gDecoder", sl9.c(r3, r4, "Ignoring styl with start (", ") >= end (", ")."));
                                    } else {
                                        int i11 = r4;
                                        a(spannableStringBuilder, m, this.o, r3, i11, 0);
                                        if (b3 != this.p) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((b3 >>> 8) | ((b3 & 255) << 24)), r3, i11, 33);
                                        }
                                    }
                                    i10++;
                                    i3 = 2;
                                } else {
                                    throw new x53("Unexpected subtitle format.");
                                }
                            }
                        } else {
                            throw new x53("Unexpected subtitle format.");
                        }
                    } else if (b2 == 1952608120 && this.n) {
                        kc2 kc2Var5 = this.m;
                        i3 = 2;
                        if (kc2Var5.c - kc2Var5.b >= 2) {
                            int i12 = mc3.a;
                            f = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(kc2Var5.r() / this.s, 0.95f));
                        } else {
                            throw new x53("Unexpected subtitle format.");
                        }
                    } else {
                        i3 = 2;
                    }
                    this.m.e(i9 + b);
                    i2 = 0;
                    i4 = 8;
                } else {
                    return new cb3(new o20(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
            }
        } else {
            throw new x53("Unexpected subtitle format.");
        }
    }
}
