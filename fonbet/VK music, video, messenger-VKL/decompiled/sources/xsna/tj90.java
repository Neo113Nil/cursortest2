package xsna;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ParserTelLink.kt */
/* loaded from: classes2.dex */
public final class tj90 implements ij90 {
    public static final Pattern a = Pattern.compile("tel:[A-Za-z0-9-_.!~*'()%/:&+$#;?@=,\\[\\]]+");

    @Override // xsna.ij90
    public final boolean a(CharSequence charSequence) {
        return charSequence.length() > 0 && a.matcher(charSequence).find();
    }

    @Override // xsna.ij90
    public final void b(SpannableStringBuilder spannableStringBuilder, vaz vazVar, boolean z) {
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int i = end - 1;
            if (spannableStringBuilder.length() != 0) {
                for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
                    if (!(obj instanceof pvu0)) {
                        int spanStart = spannableStringBuilder.getSpanStart(obj);
                        int spanEnd = spannableStringBuilder.getSpanEnd(obj) - 1;
                        boolean z2 = spanStart <= start && start <= spanEnd;
                        boolean z3 = spanStart <= i && i <= spanEnd;
                        if (z2 || z3) {
                            break;
                        }
                    }
                }
            }
            String group = matcher.group();
            Object h = vazVar.h(drm0.g0(group, "tel:", group), group, z);
            if (h != null) {
                spannableStringBuilder.setSpan(h, start, end, 18);
                spannableStringBuilder.delete(start, start + 4);
                matcher = pattern.matcher(spannableStringBuilder);
            }
        }
    }
}
