package defpackage;

import org.xmlpull.v1.XmlPullParser;
import yads.r01;
import yads.t01;
import yads.u01;

/* loaded from: classes7.dex */
public final class on81 implements zc81 {
    @Override // defpackage.zc81
    public final Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        int i;
        r01 r01Var;
        u01 u01Var = null;
        xmlPullParser.require(2, null, "Icon");
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        xmlPullParser.getAttributeValue(null, "apiFramework");
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "offset");
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            i = 0;
            if (xmlPullParser.next() == 3) {
                break;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                t01.c.getClass();
                t01[] values = t01.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        xf81.b(xmlPullParser);
                        break;
                    }
                    if (jl40.l(values[i2].b, name)) {
                        xf81.a(xmlPullParser);
                        t01[] values2 = t01.values();
                        int length2 = values2.length;
                        while (i < length2 && !jl40.l(values2[i].b, name)) {
                            i++;
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        mga1.b(attributeValue2);
        mga1.b(attributeValue3);
        r01[] values3 = r01.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                r01Var = null;
                break;
            }
            r01Var = values3[i3];
            if (jl40.l(r01Var.b, attributeValue4)) {
                break;
            }
            i3++;
        }
        if (r01Var == null) {
            r01Var = r01.c;
        }
        if (r01Var == r01.c) {
            mga1.b(attributeValue4);
        }
        u01[] values4 = u01.values();
        int length4 = values4.length;
        while (true) {
            if (i >= length4) {
                break;
            }
            u01 u01Var2 = values4[i];
            if (jl40.l(u01Var2.b, attributeValue5)) {
                u01Var = u01Var2;
                break;
            }
            i++;
        }
        if (u01Var == null) {
            u01Var = u01.c;
        }
        if (u01Var == u01.c) {
            mga1.b(attributeValue5);
        }
        mga1.a(attributeValue6);
        mga1.a(attributeValue7);
        return new gk81(attributeValue);
    }
}
