package xsna;

import android.text.Editable;
import android.text.Html;
import android.text.style.StyleSpan;
import org.xml.sax.XMLReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sah implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        Object obj;
        if (epx.f(str, "demi")) {
            if (z) {
                editable.setSpan(new StyleSpan(1), editable.length(), editable.length(), 17);
                return;
            }
            int i = 0;
            Object[] spans = editable.getSpans(0, editable.length(), StyleSpan.class);
            int length = spans.length;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                obj = spans[i];
                if (editable.getSpanFlags((StyleSpan) obj) == 17) {
                    break;
                } else {
                    i++;
                }
            }
            StyleSpan styleSpan = (StyleSpan) obj;
            if (styleSpan != null) {
                int spanStart = editable.getSpanStart(styleSpan);
                editable.removeSpan(styleSpan);
                editable.setSpan(styleSpan, spanStart, editable.length(), 33);
            }
        }
    }
}
