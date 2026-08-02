package yads;

import org.xmlpull.v1.XmlPullParser;
import xsna.arm0;

/* loaded from: classes10.dex */
public final class kr0 implements uq3 {
    public final vq3 a;

    public kr0(vq3 vq3Var) {
        this.a = vq3Var;
    }

    @Override // yads.uq3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) {
        this.a.getClass();
        xmlPullParser.require(2, null, "FalseClick");
        this.a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        Long n = attributeValue != null ? arm0.n(attributeValue) : null;
        this.a.getClass();
        String a = vq3.a(xmlPullParser);
        if (a.length() <= 0 || n == null) {
            return null;
        }
        return new er0(a, n.longValue());
    }
}
