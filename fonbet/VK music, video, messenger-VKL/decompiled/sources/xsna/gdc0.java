package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PostingBannerTextWrapper.kt */
/* loaded from: classes4.dex */
public final class gdc0 {
    public final Pattern a = Pattern.compile("\\[([^\\]]+)\\|(.+?)\\]");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.qaz, xsna.qjc] */
    public final SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = this.a.matcher(spannableStringBuilder);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                int start = matcher.start() - i;
                int end = matcher.end() - i;
                int length = group.length() + start;
                int i2 = end - length;
                spannableStringBuilder = spannableStringBuilder.replace(start, end, (CharSequence) group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    ?? qazVar = new qaz(group2, 0);
                    qazVar.b(R.attr.vk_ui_text_accent_themed);
                    Context context = e43.a;
                    Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context != null ? context : null);
                    TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                    qazVar.g = a;
                    r5 = qazVar;
                }
                if (r5 != null) {
                    spannableStringBuilder.setSpan(r5, start, length, 0);
                }
                i += i2;
            }
        }
        return spannableStringBuilder;
    }
}
