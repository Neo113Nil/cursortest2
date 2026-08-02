package androidx.compose.ui.text;

import android.text.Editable;
import android.text.Html;
import defpackage.jl40;
import defpackage.qk2;
import kotlin.Metadata;
import org.xml.sax.XMLReader;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/text/Html_androidKt$TagHandler$1", "Landroid/text/Html$TagHandler;", "", "opening", "", "tag", "Landroid/text/Editable;", "output", "Lorg/xml/sax/XMLReader;", "xmlReader", "Lzy11;", "handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Html_androidKt$TagHandler$1 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
        if (xmlReader == null || output == null || !opening || !jl40.l(tag, "ContentHandlerReplacementTag")) {
            return;
        }
        xmlReader.setContentHandler(new qk2(xmlReader.getContentHandler(), output));
    }
}
