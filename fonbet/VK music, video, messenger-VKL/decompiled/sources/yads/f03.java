package yads;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class f03 implements uq3 {
    public final vq3 a;

    public f03(vq3 vq3Var) {
        this.a = vq3Var;
    }

    @Override // yads.uq3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final iq0 a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        xmlPullParser.require(2, null, "Extension");
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        this.a.getClass();
        String a = vq3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || a.length() <= 0) {
            return null;
        }
        return new iq0(attributeValue, a);
    }
}
