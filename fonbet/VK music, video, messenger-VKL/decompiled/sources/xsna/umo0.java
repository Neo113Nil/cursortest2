package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: TextStyleParser.java */
/* loaded from: classes7.dex */
public final class umo0 {
    public static final Pattern a = Pattern.compile("\\'''(.*?)\\'''");

    public static CharSequence a(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = a.matcher(charSequence);
        while (matcher.find()) {
            stringBuffer.setLength(0);
            String group = matcher.group();
            String substring = group.substring(3, group.length() - 3);
            matcher.appendReplacement(stringBuffer, substring);
            spannableStringBuilder.append((CharSequence) stringBuffer);
            spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - substring.length(), spannableStringBuilder.length(), 33);
        }
        stringBuffer.setLength(0);
        matcher.appendTail(stringBuffer);
        spannableStringBuilder.append((CharSequence) stringBuffer.toString());
        return spannableStringBuilder;
    }
}
