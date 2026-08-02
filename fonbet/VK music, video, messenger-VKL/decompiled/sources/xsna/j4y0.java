package xsna;

import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: XmlPullParserUtils.android.kt */
/* loaded from: classes11.dex */
public final class j4y0 {
    public static final boolean a(XmlResourceParser xmlResourceParser) {
        return xmlResourceParser.getEventType() == 1 || (xmlResourceParser.getDepth() < 1 && xmlResourceParser.getEventType() == 3);
    }

    public static final void b(XmlResourceParser xmlResourceParser) throws XmlPullParserException {
        int next = xmlResourceParser.next();
        while (next != 2 && next != 1) {
            next = xmlResourceParser.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
    }
}
