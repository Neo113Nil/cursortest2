package xsna;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ParserPhone.kt */
/* loaded from: classes2.dex */
public final class sj90 implements ij90 {
    public static final k9x a = new k9x(10, 15, 1);
    public static final Pattern b = Pattern.compile("((?:\\+)|(?:011(?:\\s|\\-)?)?)?\\d{1,3}[\\s]?(?:(?:[\\-\\(\\.])?\\d{1,4}(?:[\\-\\)\\.])?[ ]?){1,3}(?:(?:[\\-\\.])?\\d{1,4})", 66);

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        if (r3 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0074  */
    @Override // xsna.ij90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                if (Character.isDigit(charSequence.charAt(i2))) {
                    i++;
                }
            }
            if (i >= 10) {
                Matcher matcher = b.matcher(charSequence);
                boolean z = false;
                boolean z2 = false;
                while (matcher.find() && !z && !z2) {
                    if (!z) {
                        k9x k9xVar = a;
                        int i3 = k9xVar.b;
                        int i4 = k9xVar.c;
                        String group = matcher.group();
                        int i5 = 0;
                        for (int i6 = 0; i6 < group.length(); i6++) {
                            if (Character.isDigit(group.charAt(i6))) {
                                i5++;
                            }
                        }
                        if (i3 > i5 || i5 > i4) {
                            z = false;
                            Character z0 = erm0.z0(matcher.start() - 1, charSequence);
                            boolean isDigit = z0 == null ? Character.isDigit(z0.charValue()) : false;
                            Character z02 = erm0.z0(matcher.end(), charSequence);
                            z2 = !isDigit || (z02 == null ? Character.isDigit(z02.charValue()) : false);
                        }
                    }
                    z = true;
                    Character z03 = erm0.z0(matcher.start() - 1, charSequence);
                    if (z03 == null) {
                    }
                    Character z022 = erm0.z0(matcher.end(), charSequence);
                    if (isDigit) {
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.ij90
    public final void b(SpannableStringBuilder spannableStringBuilder, vaz vazVar, boolean z) {
        Object f;
        Matcher matcher = b.matcher(spannableStringBuilder);
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
            String group = matcher.group();
            k9x k9xVar = a;
            int i2 = k9xVar.b;
            int i3 = k9xVar.c;
            int i4 = 0;
            for (int i5 = 0; i5 < group.length(); i5++) {
                if (Character.isDigit(group.charAt(i5))) {
                    i4++;
                }
            }
            if (i2 <= i4 && i4 <= i3 && (f = vazVar.f(group)) != null) {
                spannableStringBuilder.setSpan(f, start, end, 18);
            }
        }
    }
}
