package yads;

import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class oe3 implements uq3 {
    public final vq3 a;
    public final ee1 b;
    public final ne3 c;
    public final d93 d;

    public /* synthetic */ oe3() {
        this(new vq3(), new ee1(), new ne3(), new d93());
    }

    @Override // yads.uq3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) {
        this.a.getClass();
        xmlPullParser.require(2, null, "Verification");
        this.a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        HashMap hashMap = new HashMap();
        de1 de1Var = null;
        String str = null;
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    ee1 ee1Var = this.b;
                    ee1Var.a.getClass();
                    xmlPullParser.require(2, null, "JavaScriptResource");
                    ee1Var.a.getClass();
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                    ee1Var.a.getClass();
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                    Boolean valueOf = attributeValue3 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue3)) : null;
                    ee1Var.a.getClass();
                    String a = vq3.a(xmlPullParser);
                    de1Var = (attributeValue2 == null || attributeValue2.length() == 0 || valueOf == null || a.length() <= 0) ? null : new de1(attributeValue2, a, valueOf.booleanValue());
                } else if ("VerificationParameters".equals(name)) {
                    ne3 ne3Var = this.c;
                    ne3Var.a.getClass();
                    xmlPullParser.require(2, null, "VerificationParameters");
                    ne3Var.a.getClass();
                    str = vq3.a(xmlPullParser);
                    if (str.length() == 0) {
                        str = null;
                    }
                } else if ("TrackingEvents".equals(name)) {
                    hashMap = this.d.a(xmlPullParser);
                } else {
                    this.a.getClass();
                    vq3.b(xmlPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new ke3(attributeValue, de1Var, str, hashMap);
    }

    public oe3(vq3 vq3Var, ee1 ee1Var, ne3 ne3Var, d93 d93Var) {
        this.a = vq3Var;
        this.b = ee1Var;
        this.c = ne3Var;
        this.d = d93Var;
    }
}
