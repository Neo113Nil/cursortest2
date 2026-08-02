package yads;

import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class nq3 {
    public static boolean a(XmlPullParser xmlPullParser, String str, boolean z) {
        Boolean o0;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return (attributeValue == null || (o0 = drm0.o0(attributeValue.toLowerCase(Locale.ROOT))) == null) ? z : o0.booleanValue();
    }
}
