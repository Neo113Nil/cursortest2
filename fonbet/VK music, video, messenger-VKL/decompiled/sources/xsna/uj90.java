package xsna;

import android.text.SpannableStringBuilder;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ParserUrl.kt */
/* loaded from: classes2.dex */
public final class uj90 implements ij90 {
    public static final Pattern a = er90.a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:4:0x0009->B:10:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[SYNTHETIC] */
    @Override // xsna.ij90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() > 0) {
            int i = 0;
            char c = 0;
            while (true) {
                if (i >= charSequence.length()) {
                    break;
                }
                char charAt = charSequence.charAt(i);
                if (charAt != '.') {
                    c = (c == 0 && charAt == ':') ? (char) 1 : (c == 1 && charAt == '/') ? (char) 2 : (c == 2 && charAt == '/') ? (char) 3 : (char) 0;
                    if (c <= 2) {
                        z = false;
                        if (z) {
                            i++;
                        } else if (a.matcher(charSequence).find()) {
                            return true;
                        }
                    }
                }
                z = true;
                if (z) {
                }
            }
        }
        return false;
    }

    @Override // xsna.ij90
    public final void b(SpannableStringBuilder spannableStringBuilder, vaz vazVar, boolean z) {
        Object e;
        ListBuilder e2 = e43.e();
        if (spannableStringBuilder.length() != 0) {
            Matcher matcher = a.matcher(spannableStringBuilder);
            int i = 0;
            while (matcher.find(i) && matcher.groupCount() > 0) {
                int i2 = crx0.i(matcher);
                if (i2 == -1) {
                    i = matcher.end();
                } else {
                    int start = matcher.start(i2);
                    i = crx0.h(matcher, i2);
                    e2.add(new Pair(Integer.valueOf(start), Integer.valueOf(i)));
                }
            }
        }
        ListIterator listIterator = e2.g().listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                return;
            }
            Pair pair = (Pair) aVar.next();
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            int i3 = intValue2 - 1;
            if (spannableStringBuilder.length() != 0) {
                for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
                    if (!(obj instanceof pvu0)) {
                        int spanStart = spannableStringBuilder.getSpanStart(obj);
                        boolean z2 = true;
                        int spanEnd = spannableStringBuilder.getSpanEnd(obj) - 1;
                        boolean z3 = spanStart <= intValue && intValue <= spanEnd;
                        if (spanStart > i3 || i3 > spanEnd) {
                            z2 = false;
                        }
                        if (!z3 && !z2) {
                        }
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && (e = vazVar.e(spannableStringBuilder.subSequence(intValue, intValue2).toString())) != null) {
                spannableStringBuilder.setSpan(e, intValue, intValue2, 18);
            }
        }
    }
}
