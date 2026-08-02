package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.List;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import yads.w23;

/* loaded from: classes7.dex */
public final class ml61 extends zt71 {
    public final dl81 m = new dl81();
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public ml61(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.o = 0;
            this.p = -1;
            this.q = "sans-serif";
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.o = bArr[24];
        this.p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.q = "Serif".equals(rf71.j(43, bArr.length - 43, bArr)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.s = i;
        boolean z = (bArr[0] & BlobHeaderStructure.BLOB_VERSION) != 0;
        this.n = z;
        if (z) {
            this.r = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.r = 0.85f;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // defpackage.zt71
    public final fh81 c(int i, byte[] bArr, boolean z) {
        String b;
        int i2;
        int i3;
        dl81 dl81Var = this.m;
        dl81Var.a = bArr;
        dl81Var.c = i;
        int i4 = 0;
        dl81Var.b = 0;
        if (i < 2) {
            throw new w23("Unexpected subtitle format.");
        }
        int x = dl81Var.x();
        int i5 = 8;
        if (x == 0) {
            b = "";
        } else {
            int i6 = dl81Var.c;
            int i7 = dl81Var.b;
            if (i6 - i7 >= 2) {
                byte[] bArr2 = dl81Var.a;
                char c = (char) ((bArr2[i7 + 1] & 255) | ((bArr2[i7] & 255) << 8));
                if (c == 65279 || c == 65534) {
                    b = dl81Var.b(x, md81.d);
                }
            }
            b = dl81Var.b(x, md81.c);
        }
        if (b.isEmpty()) {
            return ro61.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);
        f(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i8 = this.p;
        if (i8 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i8 & 255) << 24) | (i8 >>> 8)), 0, length, 16711713);
        }
        int length2 = spannableStringBuilder.length();
        String str = this.q;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f = this.r;
        while (true) {
            int i9 = dl81Var.c;
            int i10 = dl81Var.b;
            if (i9 - i10 < i5) {
                return new ro61(new r871(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f));
            }
            int a = dl81Var.a();
            int a2 = dl81Var.a();
            if (a2 == 1937013100) {
                if (dl81Var.c - dl81Var.b < 2) {
                    throw new w23("Unexpected subtitle format.");
                }
                int x2 = dl81Var.x();
                int i11 = i4;
                while (i11 < x2) {
                    if (dl81Var.c - dl81Var.b < 12) {
                        throw new w23("Unexpected subtitle format.");
                    }
                    int x3 = dl81Var.x();
                    int x4 = dl81Var.x();
                    dl81Var.m(dl81Var.b + 2);
                    int i12 = x2;
                    int s = dl81Var.s();
                    dl81Var.m(dl81Var.b + 1);
                    int a3 = dl81Var.a();
                    if (x4 > spannableStringBuilder.length()) {
                        spannableStringBuilder.length();
                        nba1.e();
                        x4 = spannableStringBuilder.length();
                    }
                    if (x3 >= x4) {
                        nba1.e();
                        i2 = i11;
                        i3 = i12;
                    } else {
                        i2 = i11;
                        i3 = i12;
                        f(spannableStringBuilder, s, this.o, x3, x4, 0);
                        if (a3 != i8) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((a3 >>> 8) | ((a3 & 255) << 24)), x3, x4, 33);
                        }
                    }
                    i11 = i2 + 1;
                    x2 = i3;
                }
            } else if (a2 == 1952608120 && this.n) {
                if (dl81Var.c - dl81Var.b < 2) {
                    throw new w23("Unexpected subtitle format.");
                }
                int i13 = rf71.a;
                f = Math.max(0.0f, Math.min(dl81Var.x() / this.s, 0.95f));
            }
            dl81Var.m(i10 + a);
            i4 = 0;
            i5 = 8;
        }
    }
}
