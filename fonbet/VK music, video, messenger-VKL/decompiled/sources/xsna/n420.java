package xsna;

import android.text.Spannable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MentionUtils.kt */
/* loaded from: classes18.dex */
public final class n420 {
    public static final Pattern a = Pattern.compile("(id|club)[0-9]+");
    public static final Pattern b = Pattern.compile("\\[((?:id|club)[0-9]+)\\|([^\\]]+)\\]");
    public static final Pattern c = Pattern.compile("\\[((?:event#)[a-z0-9_]+)\\|([^\\]]+)\\]");
    public static final Pattern d = Pattern.compile("\\[((?:id|club)[0-9]+):bp[0-9_-]+\\|([^\\]]+)\\]");
    public static final Pattern e = Pattern.compile("\\[#blur\\|([^|]+)\\|([^]]+)]");
    public static final Pattern f = Pattern.compile("\\[#alias\\|([^|]+)\\|([^]]+)]");

    public static List a(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            return rli0.A(rli0.t(rl3.D((i420[]) spannable.getSpans(0, spannable.length(), i420.class)), new gmj(spannable, 23)));
        }
        return null;
    }

    public static String b(String str) {
        Matcher matcher = b.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "$2");
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        Matcher matcher2 = e.matcher(stringBuffer2);
        while (matcher2.find()) {
            matcher2.appendReplacement(stringBuffer3, "$1");
        }
        matcher2.appendTail(stringBuffer3);
        String stringBuffer4 = stringBuffer3.toString();
        StringBuffer stringBuffer5 = new StringBuffer();
        Matcher matcher3 = f.matcher(stringBuffer4);
        while (matcher3.find()) {
            matcher3.appendReplacement(stringBuffer5, "$2");
        }
        matcher3.appendTail(stringBuffer5);
        String stringBuffer6 = stringBuffer5.toString();
        StringBuffer stringBuffer7 = new StringBuffer();
        Matcher matcher4 = c.matcher(stringBuffer6);
        while (matcher4.find()) {
            matcher4.appendReplacement(stringBuffer7, "$2");
        }
        matcher4.appendTail(stringBuffer7);
        String stringBuffer8 = stringBuffer7.toString();
        StringBuffer stringBuffer9 = new StringBuffer();
        Matcher matcher5 = d.matcher(stringBuffer8);
        while (matcher5.find()) {
            matcher5.appendReplacement(stringBuffer9, "$2");
        }
        matcher5.appendTail(stringBuffer9);
        String stringBuffer10 = stringBuffer9.toString();
        try {
            StringBuffer stringBuffer11 = new StringBuffer();
            Matcher f2 = yjo0.f();
            f2.reset(stringBuffer10);
            while (f2.find()) {
                f2.appendReplacement(stringBuffer11, "$2");
            }
            f2.appendTail(stringBuffer11);
            return stringBuffer11.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return stringBuffer10;
        }
    }
}
