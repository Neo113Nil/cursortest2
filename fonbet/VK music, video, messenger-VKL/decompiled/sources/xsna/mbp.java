package xsna;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Arrays;

/* compiled from: EllipsizeDelegateUtils.kt */
/* loaded from: classes17.dex */
public final class mbp {
    public static void a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        int length = spannableStringBuilder.length();
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            int spanFlags = spanned.getSpanFlags(obj);
            if (spanStart <= length) {
                spannableStringBuilder.setSpan(obj, spanStart, Math.min(spanEnd, length), spanFlags);
            }
        }
    }

    public static CharSequence b(TextPaint textPaint, int i, int i2, CharSequence... charSequenceArr) {
        CharSequence concat = TextUtils.concat((CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length));
        if (i < 0) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{new IllegalArgumentException(uqi.a("Width must be greater than or equal to zero (width = ", i, ')'))});
                return null;
            }
        } else if (new StaticLayout(concat, 0, concat.length(), textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false).getLineCount() <= i2) {
            return concat;
        }
        return null;
    }
}
