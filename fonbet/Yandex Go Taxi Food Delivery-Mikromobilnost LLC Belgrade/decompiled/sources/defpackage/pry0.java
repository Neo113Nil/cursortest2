package defpackage;

import android.text.SpannableStringBuilder;
import com.yandex.div.internal.widget.EllipsizedTextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;

/* loaded from: classes9.dex */
public final class pry0 {
    public final nry0 a;

    public pry0(nry0 nry0Var) {
        this.a = nry0Var;
    }

    public final CharSequence a(CharSequence charSequence, TextMiddleEllipsizer$EllipsizingMode textMiddleEllipsizer$EllipsizingMode) {
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int i = ory0.a[textMiddleEllipsizer$EllipsizingMode.ordinal()];
            if (i == 1) {
                b(charSequence, spannableStringBuilder);
                return spannableStringBuilder;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c(spannableStringBuilder);
            return spannableStringBuilder;
        } catch (Exception e) {
            xby.d.k(e, "error ellipsize: " + ((Object) charSequence));
            return charSequence;
        }
    }

    public final void b(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        List W;
        List W2;
        List W3;
        List W4;
        nry0 nry0Var = this.a;
        if (nry0Var.e(spannableStringBuilder)) {
            return;
        }
        W = evu0.W(charSequence.toString(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
        int i = 2;
        if (W.size() < 2) {
            c(spannableStringBuilder);
        }
        int i2 = 0;
        ls5 ls5Var = null;
        int i3 = 0;
        while (true) {
            if (nry0Var.e(spannableStringBuilder)) {
                break;
            }
            W3 = evu0.W(spannableStringBuilder.toString(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
            int size = W3.size();
            int max = Math.max(0, size % 2 == 0 ? (size / 2) - 1 : size / 2);
            String[] strArr = (String[]) W3.toArray(new String[0]);
            int i4 = 0;
            for (int i5 = 0; i5 < max; i5++) {
                i4 += strArr[i5].length() + 1;
            }
            int length = ((String) W3.get(max)).length() + i4 + 1;
            if (length > spannableStringBuilder.length()) {
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.replace(i4, length, "");
            ls5 ls5Var2 = new ls5((String) W3.get(max), i4, W3.size() % 2 == 0);
            i3++;
            W4 = evu0.W(spannableStringBuilder.toString(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
            if (W4.size() < 2) {
                ls5Var = ls5Var2;
                break;
            }
            ls5Var = ls5Var2;
        }
        if (ls5Var == null) {
            return;
        }
        boolean z = i3 <= 1 || ls5Var.c();
        String b = ls5Var.b();
        int a = ls5Var.a();
        if (spannableStringBuilder.length() >= 1) {
            spannableStringBuilder.insert(a, (CharSequence) (((Object) b) + " "));
            int length2 = b.length() + a + 1;
            while (true) {
                int i6 = a + 1;
                if (length2 <= i6) {
                    spannableStringBuilder.replace(a, i6, "");
                    break;
                }
                if (z) {
                    spannableStringBuilder.replace(length2 - 2, length2 - 1, "");
                } else {
                    spannableStringBuilder.replace(a, i6, "");
                }
                int i7 = length2 - 1;
                if (nry0Var.e(spannableStringBuilder)) {
                    int i8 = length2 - 3;
                    if (i8 < 0) {
                        i8 = i2;
                    }
                    if (i7 - a <= (z ? i : 3)) {
                        spannableStringBuilder.replace(a, i7, "");
                        break;
                    }
                    CharSequence subSequence = z ? spannableStringBuilder.subSequence(i8, length2 - 2) : spannableStringBuilder.subSequence(a, i6);
                    if (z) {
                        spannableStringBuilder.replace(i8, length2 - 2, EllipsizedTextView.DEFAULT_ELLIPSIS);
                    } else {
                        spannableStringBuilder.replace(a, i6, EllipsizedTextView.DEFAULT_ELLIPSIS);
                    }
                    if (nry0Var.e(spannableStringBuilder)) {
                        return;
                    }
                    if (z) {
                        spannableStringBuilder.replace(i8, length2 - 2, subSequence);
                    } else {
                        spannableStringBuilder.replace(a, i6, subSequence);
                    }
                }
                length2 = i7;
                i2 = 0;
                i = 2;
            }
        }
        W2 = evu0.W(spannableStringBuilder.toString(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
        int a2 = ls5Var.a() - (W2.size() == 1 ? 1 : 2);
        if (a2 < 0) {
            a2 = 0;
        }
        int i9 = a2 + 2;
        if (i9 > spannableStringBuilder.length()) {
            i9 = spannableStringBuilder.length();
        }
        spannableStringBuilder.replace(a2, i9, EllipsizedTextView.DEFAULT_ELLIPSIS);
    }

    public final void c(SpannableStringBuilder spannableStringBuilder) {
        nry0 nry0Var = this.a;
        if (nry0Var.e(spannableStringBuilder)) {
            return;
        }
        int length = spannableStringBuilder.length();
        while (length > 0) {
            int i = length / 2;
            spannableStringBuilder.replace(i, i + 1, "");
            int i2 = length - 1;
            if (nry0Var.e(spannableStringBuilder)) {
                if (i2 <= 1) {
                    spannableStringBuilder.replace(0, i2, "");
                    return;
                }
                int i3 = (length - 2) / 2;
                spannableStringBuilder.replace(i3, i3 + 1, EllipsizedTextView.DEFAULT_ELLIPSIS);
                while (!nry0Var.e(spannableStringBuilder)) {
                    spannableStringBuilder.replace(i3, i3 + 2, EllipsizedTextView.DEFAULT_ELLIPSIS);
                }
                return;
            }
            length = i2;
        }
    }
}
