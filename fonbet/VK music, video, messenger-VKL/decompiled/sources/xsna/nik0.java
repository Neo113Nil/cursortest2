package xsna;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import kotlin.text.Regex;

/* compiled from: SpannableExt.kt */
/* loaded from: classes18.dex */
public final class nik0 {
    public static final SparseArray<ForegroundColorSpan> a = new SparseArray<>();

    static {
        new SparseArray();
    }

    public static final void a(SpannableStringBuilder spannableStringBuilder, Typeface typeface, int i, int i2) {
        spannableStringBuilder.setSpan(new qup0(typeface), i, i2, 33);
    }

    public static final CharSequence b(CharSequence charSequence, Regex regex, izs<? super zk10, ? extends CharSequence> izsVar) {
        hl10 b = regex.b(charSequence);
        if (b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        do {
            spannableStringBuilder.append(charSequence, i, b.c().b);
            spannableStringBuilder.append(izsVar.invoke(b));
            i = b.c().c + 1;
            b = b.next();
            if (i >= length) {
                break;
            }
        } while (b != null);
        if (i < length) {
            spannableStringBuilder.append(charSequence, i, length);
        }
        return spannableStringBuilder;
    }

    public static final void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        SparseArray<ForegroundColorSpan> sparseArray = a;
        ForegroundColorSpan foregroundColorSpan = sparseArray.get(i);
        if (foregroundColorSpan == null) {
            foregroundColorSpan = new ForegroundColorSpan(i);
            sparseArray.put(i, foregroundColorSpan);
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, i2, i3, 33);
    }

    public static /* synthetic */ void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c(spannableStringBuilder, i, i2, spannableStringBuilder.length());
    }
}
