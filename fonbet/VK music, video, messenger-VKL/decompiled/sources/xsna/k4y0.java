package xsna;

import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: XmlVectorParser.android.kt */
/* loaded from: classes11.dex */
public final class k4y0 {
    public static final void a(XmlResourceParser xmlResourceParser) throws XmlPullParserException {
        int next = xmlResourceParser.next();
        while (next != 2 && next != 1) {
            next = xmlResourceParser.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
    }
}
