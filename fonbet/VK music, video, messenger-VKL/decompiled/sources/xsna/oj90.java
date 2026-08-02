package xsna;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ParserLinkMention.kt */
/* loaded from: classes2.dex */
public final class oj90 implements ij90 {
    public final Pattern a;

    public oj90() {
        Pattern pattern = yjo0.a;
        this.a = yjo0.o;
    }

    @Override // xsna.ij90
    public final boolean a(CharSequence charSequence) {
        return charSequence.length() > 0 && ad0.t(charSequence, "[http") && this.a.matcher(charSequence).find();
    }

    @Override // xsna.ij90
    public final void b(SpannableStringBuilder spannableStringBuilder, vaz vazVar, boolean z) {
        Matcher matcher = this.a.matcher(spannableStringBuilder);
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start() + i;
            int end = matcher.end() + i;
            int i2 = end - 1;
            if (spannableStringBuilder.length() != 0) {
                for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
                    if (!(obj instanceof pvu0)) {
                        int spanStart = spannableStringBuilder.getSpanStart(obj);
                        boolean z2 = true;
                        int spanEnd = spannableStringBuilder.getSpanEnd(obj) - 1;
                        boolean z3 = spanStart <= start && start <= spanEnd;
                        if (spanStart > i2 || i2 > spanEnd) {
                            z2 = false;
                        }
                        if (!z3 && !z2) {
                        }
                    }
                }
            }
            String group = matcher.group(0);
            if (group != null && group.length() != 0) {
                Pattern pattern = yjo0.a;
                l9z h = yjo0.h(matcher.start(), matcher.end(), group);
                if (h != null) {
                    String str = h.c;
                    Object e = vazVar.e(h.d);
                    if (e != null) {
                        spannableStringBuilder.replace(start, end, (CharSequence) str);
                        spannableStringBuilder.setSpan(e, start, str.length() + start, 33);
                        i += str.length() - (end - start);
                    }
                }
            }
        }
    }
}
