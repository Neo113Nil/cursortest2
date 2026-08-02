package com.yandex.messaging.formatting;

import android.text.Editable;
import android.text.Html;
import android.text.style.TypefaceSpan;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;
import org.xml.sax.XMLReader;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/formatting/CodeTagHandler;", "Landroid/text/Html$TagHandler;", "<init>", "()V", "", "opening", "", "tag", "Landroid/text/Editable;", "output", "Lorg/xml/sax/XMLReader;", "xmlReader", "Lzy11;", "handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "a", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class CodeTagHandler implements Html.TagHandler {

    public static final class a {
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
        if (tag.equalsIgnoreCase(AuthSdkActivity.RESPONSE_TYPE_CODE)) {
            if (opening) {
                output.setSpan(new a(), output.length(), output.length(), 17);
                return;
            }
            Object[] spans = output.getSpans(0, output.length(), a.class);
            a aVar = (a) (spans.length == 0 ? null : spans[spans.length - 1]);
            if (aVar == null) {
                return;
            }
            int spanStart = output.getSpanStart(aVar);
            output.removeSpan(aVar);
            if (spanStart != output.length()) {
                output.setSpan(new TypefaceSpan("monospace"), spanStart, output.length(), 33);
            }
        }
    }
}
