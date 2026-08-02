package defpackage;

import org.xmlpull.v1.XmlPullParser;
import yads.tp0;

/* loaded from: classes7.dex */
public final class i291 implements zc81 {
    @Override // defpackage.zc81
    public final Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        xmlPullParser.require(2, null, "FalseClick");
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        Long m = attributeValue != null ? bvu0.m(10, attributeValue) : null;
        String a = xf81.a(xmlPullParser);
        if (a.length() <= 0 || m == null) {
            return null;
        }
        return new tp0(a, m.longValue());
    }
}
