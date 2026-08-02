package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes10.dex */
public final class kl11 implements q2v0 {
    public final ef90 a = new ef90();
    public final boolean b;
    public final int c;
    public final int w;
    public final String x;
    public final float y;
    public final int z;

    public kl11(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.w = -1;
            this.x = "sans-serif";
            this.b = false;
            this.y = 0.85f;
            this.z = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.w = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i = tw21.a;
        this.x = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.z = i2;
        boolean z = (bArr[0] & BlobHeaderStructure.BLOB_VERSION) != 0;
        this.b = z;
        if (z) {
            this.y = tw21.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.y = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q2v0
    public final void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        String w;
        int i3;
        ef90 ef90Var = this.a;
        ef90Var.I(i + i2, bArr);
        ef90Var.K(i);
        int i4 = 1;
        int i5 = 0;
        d6z.l(ef90Var.a() >= 2);
        int E = ef90Var.E();
        if (E == 0) {
            w = "";
        } else {
            int i6 = ef90Var.b;
            Charset G = ef90Var.G();
            int i7 = E - (ef90Var.b - i6);
            if (G == null) {
                G = StandardCharsets.UTF_8;
            }
            w = ef90Var.w(i7, G);
        }
        if (w.isEmpty()) {
            c9eVar.accept(new tdf(ImmutableList.p(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w);
        c(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.w, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.x;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.y;
        while (ef90Var.a() >= 8) {
            int i8 = ef90Var.b;
            int k = ef90Var.k();
            int k2 = ef90Var.k();
            if (k2 == 1937013100) {
                d6z.l(ef90Var.a() >= 2 ? i4 : i5);
                int E2 = ef90Var.E();
                int i9 = i5;
                while (i9 < E2) {
                    d6z.l(ef90Var.a() >= 12 ? i4 : i5);
                    int E3 = ef90Var.E();
                    int E4 = ef90Var.E();
                    ef90Var.L(2);
                    int i10 = i9;
                    int y = ef90Var.y();
                    ef90Var.L(i4);
                    int k3 = ef90Var.k();
                    if (E4 > spannableStringBuilder.length()) {
                        StringBuilder t = b64.t(E4, "Truncating styl end (", ") to cueText.length() (");
                        t.append(spannableStringBuilder.length());
                        t.append(").");
                        lk91.j(t.toString());
                        E4 = spannableStringBuilder.length();
                    }
                    if (E3 >= E4) {
                        lk91.j("Ignoring styl with start (" + E3 + ") >= end (" + E4 + ").");
                        i3 = i10;
                    } else {
                        i3 = i10;
                        int i11 = E4;
                        c(spannableStringBuilder, y, this.c, E3, i11, 0);
                        a(spannableStringBuilder, k3, this.w, E3, i11, 0);
                    }
                    i9 = i3 + 1;
                    i4 = 1;
                    i5 = 0;
                }
            } else if (k2 == 1952608120 && this.b) {
                d6z.l(ef90Var.a() >= 2);
                f = tw21.h(ef90Var.E() / this.z, 0.0f, 0.95f);
            }
            ef90Var.K(i8 + k);
            i4 = 1;
            i5 = 0;
        }
        ndf ndfVar = new ndf();
        ndfVar.a = spannableStringBuilder;
        ndfVar.e = f;
        ndfVar.f = 0;
        ndfVar.g = 0;
        c9eVar.accept(new tdf(ImmutableList.r(ndfVar.a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.q2v0
    public final int f() {
        return 2;
    }
}
