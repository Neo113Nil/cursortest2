package xsna;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.vk.common.links.LinksParserData;
import com.vkontakte.android.R;

/* compiled from: VideoProfileSubtitleParser.kt */
/* loaded from: classes6.dex */
public final class i9t0 {
    public static CharSequence a(TextView textView, String str) {
        CharSequence charSequence;
        String d = cqm0.d(drm0.p0(str).toString());
        int length = d.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = d.charAt(length);
                if (charAt != '\n' && !ro.j(charAt)) {
                    charSequence = d.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = "";
        CharSequence d2 = xwk.d().a().d(charSequence.toString(), new LinksParserData(47883, (Bundle) null, 0, R.attr.vk_ui_text_secondary, (String) null, (String) null, 0, R.attr.vk_ui_text_secondary, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16246));
        if (d2 instanceof SpannableStringBuilder) {
            ((SpannableStringBuilder) d2).clearSpans();
        }
        ucp ucpVar = ucp.a;
        return ucp.j(d2, Float.valueOf(textView.getTextSize()));
    }
}
