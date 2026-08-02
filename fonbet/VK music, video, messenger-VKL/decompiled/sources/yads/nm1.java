package yads;

import com.ironsource.C4572u;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.arm0;
import xsna.epx;

/* loaded from: classes10.dex */
public final class nm1 implements uq3 {
    public final vq3 a;

    public /* synthetic */ nm1() {
        this(new vq3());
    }

    @Override // yads.uq3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final lm1 a(XmlPullParser xmlPullParser) {
        km1 km1Var;
        Integer m;
        Integer m2;
        Integer m3;
        this.a.getClass();
        xmlPullParser.require(2, null, "MediaFile");
        this.a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, C4572u.g);
        this.a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        this.a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        this.a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        this.a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, BadConnectionSignaling.KEY_BAD_NET_BITRATE);
        this.a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "id");
        this.a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "codec");
        this.a.getClass();
        String attributeValue9 = xmlPullParser.getAttributeValue(null, "vmaf");
        this.a.getClass();
        String a = vq3.a(xmlPullParser);
        km1[] values = km1.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                km1Var = null;
                break;
            }
            km1Var = values[i];
            if (epx.f(km1Var.b, attributeValue)) {
                break;
            }
            i++;
        }
        return new lm1(a, attributeValue7, km1Var, attributeValue2, attributeValue8, attributeValue9 != null ? arm0.l(attributeValue9) : null, (attributeValue3 == null || (m3 = arm0.m(10, attributeValue3)) == null) ? 0 : m3.intValue(), (attributeValue4 == null || (m2 = arm0.m(10, attributeValue4)) == null) ? 0 : m2.intValue(), (attributeValue5 == null || (m = arm0.m(10, attributeValue5)) == null) ? 0 : m.intValue(), attributeValue6);
    }

    public nm1(vq3 vq3Var) {
        this.a = vq3Var;
    }
}
