package yads;

import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;

/* loaded from: classes10.dex */
public final class m21 implements uq3 {
    public final vq3 a;

    public /* synthetic */ m21() {
        this(new vq3());
    }

    @Override // yads.uq3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) {
        int i;
        h21 h21Var;
        this.a.getClass();
        int i2 = 2;
        k21 k21Var = null;
        xmlPullParser.require(2, null, "Icon");
        this.a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        this.a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        this.a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        this.a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        this.a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        this.a.getClass();
        xmlPullParser.getAttributeValue(null, "apiFramework");
        this.a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, SignalingProtocol.KEY_OFFSET);
        this.a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            this.a.getClass();
            i = 0;
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == i2) {
                String name = xmlPullParser.getName();
                j21.c.getClass();
                j21[] values = j21.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        this.a.getClass();
                        vq3.b(xmlPullParser);
                        break;
                    }
                    if (epx.f(values[i3].b, name)) {
                        this.a.getClass();
                        vq3.a(xmlPullParser);
                        j21[] values2 = j21.values();
                        int length2 = values2.length;
                        while (i < length2 && !epx.f(values2[i].b, name)) {
                            i++;
                        }
                    } else {
                        i3++;
                    }
                }
                i2 = 2;
            }
        }
        bi3.b(attributeValue2);
        bi3.b(attributeValue3);
        h21[] values3 = h21.values();
        int length3 = values3.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                h21Var = null;
                break;
            }
            h21Var = values3[i4];
            if (epx.f(h21Var.b, attributeValue4)) {
                break;
            }
            i4++;
        }
        if (h21Var == null) {
            h21Var = h21.c;
        }
        if (h21Var == h21.c) {
            bi3.b(attributeValue4);
        }
        k21[] values4 = k21.values();
        int length4 = values4.length;
        while (true) {
            if (i >= length4) {
                break;
            }
            k21 k21Var2 = values4[i];
            if (epx.f(k21Var2.b, attributeValue5)) {
                k21Var = k21Var2;
                break;
            }
            i++;
        }
        if (k21Var == null) {
            k21Var = k21.c;
        }
        if (k21Var == k21.c) {
            bi3.b(attributeValue5);
        }
        bi3.a(attributeValue6);
        bi3.a(attributeValue7);
        return new l21(attributeValue);
    }

    public m21(vq3 vq3Var) {
        this.a = vq3Var;
    }
}
