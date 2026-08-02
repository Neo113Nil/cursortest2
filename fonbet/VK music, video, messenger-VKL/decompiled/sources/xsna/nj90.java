package xsna;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ParserHashtag.kt */
/* loaded from: classes2.dex */
public final class nj90 implements ij90 {
    public static final Pattern a = Pattern.compile("#([\\d\\w]+(?:@[\\d\\w]+)?)", 66);

    @Override // xsna.ij90
    public final boolean a(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            int i = 0;
            while (true) {
                if (i >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i) != '#') {
                    i++;
                } else if (a.matcher(charSequence).find()) {
                    return true;
                }
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
            Object b = vazVar.b(matcher.group());
            if (b != null) {
                spannableStringBuilder.setSpan(b, start, end, 18);
            }
        }
    }
}
