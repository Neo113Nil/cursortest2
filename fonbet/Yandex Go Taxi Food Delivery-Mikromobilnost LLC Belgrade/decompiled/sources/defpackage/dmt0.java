package defpackage;

import android.text.style.CharacterStyle;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.yandex.messaging.formatting.UnderlineSpanWrapper;

/* loaded from: classes15.dex */
public class dmt0 {
    public static String a(CharacterStyle characterStyle) {
        if (characterStyle instanceof StyleSpan) {
            int style = ((StyleSpan) characterStyle).getStyle();
            if (style == 1) {
                return "**";
            }
            if (style != 2) {
                return null;
            }
            return "__";
        }
        if (characterStyle instanceof TypefaceSpan) {
            if (jl40.l(((TypefaceSpan) characterStyle).getFamily(), "monospace")) {
                return "`";
            }
            return null;
        }
        if (characterStyle instanceof StrikethroughSpan) {
            return "~~";
        }
        if (characterStyle instanceof UnderlineSpanWrapper) {
            return "++";
        }
        return null;
    }
}
