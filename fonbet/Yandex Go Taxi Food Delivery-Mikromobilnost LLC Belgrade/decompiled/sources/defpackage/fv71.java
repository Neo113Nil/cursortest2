package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes7.dex */
public final class fv71 implements zc81 {
    public static bs71 a(XmlPullParser xmlPullParser) {
        String attributeValue;
        Integer l;
        Integer l2;
        xmlPullParser.require(2, null, "InteractiveCreativeFile");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        if (attributeValue2 != null && (attributeValue = xmlPullParser.getAttributeValue(null, "height")) != null && (l = bvu0.l(10, attributeValue)) != null) {
            int intValue = l.intValue();
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
            if (attributeValue3 != null && (l2 = bvu0.l(10, attributeValue3)) != null) {
                int intValue2 = l2.intValue();
                String a = xf81.a(xmlPullParser);
                if (evu0.y(attributeValue2, "html", false) != (a.length() > 0)) {
                    a = null;
                }
                String str = a != null ? new String(Base64.decode(a, 0), StandardCharsets.UTF_8) : null;
                if (str != null) {
                    return new bs71(intValue, intValue2, str, attributeValue2);
                }
            }
        }
        return null;
    }

    @Override // defpackage.zc81
    public final /* bridge */ /* synthetic */ Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        return a(xmlPullParser);
    }
}
