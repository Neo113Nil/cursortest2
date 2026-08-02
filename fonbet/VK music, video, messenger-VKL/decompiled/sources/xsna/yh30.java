package xsna;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MsgConvertUtil.kt */
/* loaded from: classes2.dex */
public final class yh30 {
    public static final bpn0 a = new bpn0(new g13(16));

    public static CharSequence a(CharSequence charSequence) {
        String str;
        Matcher matcher = ((Pattern) a.getValue()).matcher(charSequence);
        if (!matcher.find()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        do {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            int hashCode = group.hashCode();
            if (hashCode == 1920) {
                if (group.equals("<<")) {
                    str = "«";
                }
                str = "";
            } else if (hashCode == 1984) {
                if (group.equals(">>")) {
                    str = "»";
                }
                str = "";
            } else if (hashCode == 9930) {
                if (group.equals("\n\n\n")) {
                    str = "\n\n";
                }
                str = "";
            } else if (hashCode != 997984) {
                if (hashCode == 1885234 && group.equals("<br>")) {
                    str = "\n";
                }
                str = "";
            } else {
                if (group.equals(" -- ")) {
                    str = " – ";
                }
                str = "";
            }
            valueOf.replace(start, end, (CharSequence) str);
            matcher.reset(valueOf);
        } while (matcher.find());
        return valueOf;
    }
}
