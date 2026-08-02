package xsna;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ParserNumbers.kt */
/* loaded from: classes2.dex */
public final class rj90 implements ij90 {
    public static final Pattern a = Pattern.compile("(?<!\\d\\s)\\b(?:(?:\\d{14,21})|(?:(?:\\d{4}-){3,4}\\d{2,4})|(?:(?:\\d{3,4}\\s){3,4}\\d{2,4}))\\b", 66);

    @Override // xsna.ij90
    public final boolean a(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                if (Character.isDigit(charSequence.charAt(i2))) {
                    i++;
                }
            }
            if (i >= 14 && a.matcher(charSequence).find()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ij90
    public final void b(SpannableStringBuilder spannableStringBuilder, vaz vazVar, boolean z) {
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        Matcher matcher = a.matcher(spannableStringBuilder);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int i = end - 1;
            if (spannableStringBuilder.length() != 0) {
                for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
                    if (!(obj instanceof pvu0)) {
                        int spanStart = spannableStringBuilder.getSpanStart(obj);
                        boolean z2 = true;
                        int spanEnd = spannableStringBuilder.getSpanEnd(obj) - 1;
                        boolean z3 = spanStart <= start && start <= spanEnd;
                        if (spanStart > i || i > spanEnd) {
                            z2 = false;
                        }
                        if (!z3 && !z2) {
                        }
                    }
                }
            }
            Object d = vazVar.d(matcher.group());
            if (d != null) {
                spannableStringBuilder.setSpan(d, start, end, 18);
            }
        }
    }
}
