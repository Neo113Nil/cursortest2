package defpackage;

import com.caverock.androidsvg.p;
import com.caverock.androidsvg.q;
import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* loaded from: classes10.dex */
public final class eol0 extends DefaultHandler2 {
    public final /* synthetic */ q a;

    public eol0(q qVar) {
        this.a = qVar;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.a.H(new String(cArr, i, i2));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.a.c(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        q.z(new p(str2));
        str.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.a.F();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.a.G(str, str2, str3, attributes);
    }
}
